package net.cinny.cinnymod;

import net.cinny.cinnymod.block.ModBlocks;
import net.cinny.cinnymod.block.entity.ModBlockEntities;
import net.cinny.cinnymod.item.ModItemGroups;
import net.cinny.cinnymod.item.ModItems;
import net.cinny.cinnymod.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CinnyMod implements ModInitializer {
	public static final String MOD_ID = "cinnymod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModBlockEntities.registerBlockEntities();
		ModWorldGeneration.generateModWorldGeneration();
		registerStrippables();
		registerFlammable();
	}

	private static void registerStrippables() {
		StrippableBlockRegistry.register(ModBlocks.BLACKTHORN_LOG, ModBlocks.STRIPPED_BLACKTHORN_LOG);
		StrippableBlockRegistry.register(ModBlocks.SPINY_BLACKTHORN_LOG, ModBlocks.BLACKTHORN_LOG);
	}

	private static void registerFlammable() {
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLACKTHORN_SAPLING,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLACKTHORN_PLANKS,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPINY_BLACKTHORN_LOG,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLACKTHORN_LOG,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLACKTHORN_PLANKS,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_BLACKTHORN_LOG,5,5);
	}
}