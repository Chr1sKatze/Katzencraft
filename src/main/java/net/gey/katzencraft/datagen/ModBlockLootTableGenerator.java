package net.gey.katzencraft.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.gey.katzencraft.block.ModBlocks;
import net.gey.katzencraft.block.custom.PinkCakeCropBlock;
import net.gey.katzencraft.item.ModItems;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;

public class ModBlockLootTableGenerator extends FabricBlockLootTableProvider {
    public ModBlockLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        // block drops itself
        addDrop(ModBlocks.PINK_GARNET_BLOCK);
        // Ore block drops itself with silktouch, drops ore without
        addDrop(ModBlocks.PINK_GARNET_ORE, oreDrops(ModBlocks.PINK_GARNET_ORE, ModItems.RAW_PINK_GARNET));

        // Pink Cake Crop Drops
        BlockStatePropertyLootCondition.Builder builder2 = BlockStatePropertyLootCondition.builder(ModBlocks.PINK_CAKE_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(PinkCakeCropBlock.AGE, 6));
        this.addDrop(ModBlocks.PINK_CAKE_CROP, this.cropDrops(ModBlocks.PINK_CAKE_CROP, ModItems.PINK_CAKE, ModItems.PINK_CAKE_SEEDS, builder2));



    }
}