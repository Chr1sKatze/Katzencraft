package net.gey.katzencraft.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.gey.katzencraft.KatzencraftMod;
import net.gey.katzencraft.block.custom.BlueCakeCropBlock;
import net.gey.katzencraft.block.custom.PinkCakeCropBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.item.Item;

public class ModBlocks {

    // Register Block Content
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(KatzencraftMod.MOD_ID, name), block);
    }

    // Register BlockItem Content
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(KatzencraftMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    // Register no BlockItem Content
    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(KatzencraftMod.MOD_ID, name), block);
    }

    // Block List
    public static final Block PINK_GARNET_BLOCK = registerBlock("pink_garnet_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block PINK_GARNET_ORE = registerBlock("pink_garnet_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block PINK_CAKE_CROP = registerBlockWithoutBlockItem("pink_cake_crop",
            new PinkCakeCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block BLUE_CAKE_CROP = registerBlockWithoutBlockItem("blue_cake_crop",
            new BlueCakeCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    // Initializes and logs ModBlock content
    public static void registerModBlocks() {
        KatzencraftMod.LOGGER.info("Registering ModBlocks for " + KatzencraftMod.MOD_ID);
    }
}