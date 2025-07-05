package net.cinny.cinnymod;

import net.cinny.cinnymod.block.custom.TreatedBlocks;
import net.cinny.cinnymod.item.ModItemGroups;
import net.cinny.cinnymod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CinnyMod implements ModInitializer {
	public static final String MOD_ID = "cinnymod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		TreatedBlocks.registerTreatedBlocks();

	}
}