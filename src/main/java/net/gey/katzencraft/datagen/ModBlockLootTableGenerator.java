package net.gey.katzencraft.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.gey.katzencraft.block.ModBlocks;
import net.gey.katzencraft.block.custom.BlueCakeCropBlock;
import net.gey.katzencraft.block.custom.PinkCakeCropBlock;
import net.gey.katzencraft.item.ModItems;
import net.minecraft.loot.condition.AnyOfLootCondition;
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

        // Blue Cake Crop Drops - if you only want the item to drop from the top block
        BlockStatePropertyLootCondition.Builder builder3 = BlockStatePropertyLootCondition.builder(ModBlocks.BLUE_CAKE_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(BlueCakeCropBlock.AGE, 8));
        this.addDrop(ModBlocks.BLUE_CAKE_CROP, this.cropDrops(ModBlocks.BLUE_CAKE_CROP, ModItems.BLUE_CAKE, ModItems.BLUE_CAKE_SEEDS, builder3));


        // Blue Cake Crop Drops - use this if you want both the bottom and top stage to drop items (example sugar cane)
        // AnyOfLootCondition.Builder builder =
        //        BlockStatePropertyLootCondition.builder(ModBlocks.BLUE_CAKE_CROP).properties(StatePredicate.Builder.create()
        //                        .exactMatch(BlueCakeCropBlock.AGE, 7))
        //                .or(BlockStatePropertyLootCondition.builder(ModBlocks.BLUE_CAKE_CROP).properties(StatePredicate.Builder.create()
        //                        .exactMatch(BlueCakeCropBlock.AGE, 8)));
        // addDrop(ModBlocks.BLUE_CAKE_CROP, cropDrops(ModBlocks.BLUE_CAKE_CROP, ModItems.BLUE_CAKE, ModItems.BLUE_CAKE_SEEDS, builder));


    }
}