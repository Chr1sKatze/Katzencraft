package net.gey.katzencraft.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.gey.katzencraft.block.ModBlocks;
import net.gey.katzencraft.block.custom.BlueCakeCropBlock;
import net.gey.katzencraft.block.custom.PinkCakeCropBlock;
import net.gey.katzencraft.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        // Creates the modcontent blockstates .json files (blocks)
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_GARNET_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_GARNET_ORE);
        blockStateModelGenerator.registerCrop(ModBlocks.PINK_CAKE_CROP, PinkCakeCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6);
        blockStateModelGenerator.registerCrop(ModBlocks.BLUE_CAKE_CROP, BlueCakeCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6, 7, 8);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        // Creates the modcontent model .json files (items)
        itemModelGenerator.register(ModItems.PINK_GARNET, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_PINK_GARNET, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINK_CAKE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUE_CAKE, Models.GENERATED);
    }
}