package net.gey.katzencraft.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.gey.katzencraft.KatzencraftMod;
import net.gey.katzencraft.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    // Initializes and logs ModBlock content
    public static void registerModItemGroups() {
    }

    // ItemGroup assignments
    public static final ItemGroup KATZENCRAFT_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(KatzencraftMod.MOD_ID, "katzencraft_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.katzencraft_group"))
                    .icon(() -> new ItemStack(ModItems.PINK_GARNET)).entries((displayContext, entries) -> {
                        entries.add(Items.DIAMOND);
                        entries.add(ModItems.PINK_GARNET);
                        entries.add(ModItems.RAW_PINK_GARNET);
                        entries.add(ModBlocks.PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.PINK_GARNET_ORE);
                        entries.add(ModItems.PINK_CAKE);
                        entries.add(ModItems.PINK_CAKE_SEEDS);
                        entries.add(ModItems.BLUE_CAKE);
                        entries.add(ModItems.BLUE_CAKE_SEEDS);
                        entries.add(ModItems.YELLOW_CAKE);
                        entries.add(ModItems.YELLOW_CAKE_SEEDS);
                    }).build());
}