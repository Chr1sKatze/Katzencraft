package net.gey.katzencraft;

import net.fabricmc.api.ModInitializer;

import net.gey.katzencraft.block.ModBlocks;
import net.gey.katzencraft.item.ModItemGroup;
import net.gey.katzencraft.item.ModItems;
import net.gey.katzencraft.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KatzencraftMod implements ModInitializer {
	public static final String MOD_ID = "katzencraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerModItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModWorldGeneration.generalModWorldGeneration();
	}
}