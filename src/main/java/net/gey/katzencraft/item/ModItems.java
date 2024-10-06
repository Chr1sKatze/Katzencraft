package net.gey.katzencraft.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.gey.katzencraft.KatzencraftMod;
import net.gey.katzencraft.ModFoodComponents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    // Register Item Content
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(KatzencraftMod.MOD_ID, name), item);
    }

    // ModItem List
    public static final Item PINK_GARNET = registerItem("pink_garnet",
            new Item(new FabricItemSettings()));
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet",
            new Item(new FabricItemSettings()));
    public static final Item PINK_CAKE = registerItem("pink_cake",
            new Item(new FabricItemSettings().food(ModFoodComponents.PINK_CAKE)));

    // Initializes and logs ModItems content
    public static void registerModItems() {
        KatzencraftMod.LOGGER.info("Registering Mod Items for " + KatzencraftMod.MOD_ID);
    }
}