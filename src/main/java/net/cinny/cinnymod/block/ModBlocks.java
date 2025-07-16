package net.cinny.cinnymod.block;

import net.cinny.cinnymod.CinnyMod;
import net.cinny.cinnymod.block.custom.CanopicPotBlock;
import net.cinny.cinnymod.block.custom.EffigyBlock;
import net.cinny.cinnymod.block.custom.SpinyBlackthornBlock;
import net.cinny.cinnymod.world.tree.ModSaplingGenerators;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

import static net.minecraft.block.Blocks.createLeavesBlock;

public class ModBlocks {
    public static final Block CANOPIC_POT = registerBlock("canopic_pot", new CanopicPotBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.DECORATED_POT).strength(2.5f, 3f).nonOpaque()));
    public static final Block SILVER_ORE = registerBlock("silver_ore", new ExperienceDroppingBlock(UniformIntProvider.create(5, 7), AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).requiresTool().strength(3.0F, 3.0F)));
    public static final Block DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore", new ExperienceDroppingBlock(UniformIntProvider.create(5, 7), AbstractBlock.Settings.create().sounds(BlockSoundGroup.DEEPSLATE).requiresTool().strength(4.5F, 3.0F)));
    public static final Block SILVER_BLOCK = registerBlock("silver_block", new Block(AbstractBlock.Settings.create().requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL)));
    public static final Block RAW_SILVER_BLOCK = registerBlock("raw_silver_block", new Block(AbstractBlock.Settings.create().requiresTool().strength(5.0F, 6.0F)));
    public static final Block CEMETERY_STONE = registerBlock("cemetery_stone", new Block(AbstractBlock.Settings.create().requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS).strength(2.5F, 5.0F)));
    public static final Block MOSSY_CEMETERY_STONE = registerBlock("mossy_cemetery_stone", new Block(AbstractBlock.Settings.create().requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS).strength(2.5F, 5.0F)));
    public static final Block CEMETERY_BRICKS = registerBlock("cemetery_bricks", new Block(AbstractBlock.Settings.create().requiresTool().sounds(BlockSoundGroup.DEEPSLATE).strength(3F, 6.0F)));
    public static final Block CEMETERY_PILLAR = registerBlock("cemetery_pillar", new PillarBlock(AbstractBlock.Settings.create().requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS).strength(3F, 6.0F)));
    public static final Block RITUAL_EFFIGY = registerBlock("ritual_effigy", new EffigyBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2.5f).nonOpaque()));
    public static final Block BLACKTHORN_LOG = registerBlock("blackthorn_log", new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG).sounds(BlockSoundGroup.WOOD)));
    public static final Block SPINY_BLACKTHORN_LOG = registerBlock("spiny_blackthorn_log", new SpinyBlackthornBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG).sounds(BlockSoundGroup.WOOD)));
    public static final Block STRIPPED_BLACKTHORN_LOG = registerBlock("stripped_blackthorn_log", new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG).sounds(BlockSoundGroup.WOOD)));
    public static final Block BLACKTHORN_PLANKS = registerBlock("blackthorn_planks", new PillarBlock(AbstractBlock.Settings.create().requiresTool().sounds(BlockSoundGroup.WOOD).strength(2.5F)));
    public static final Block BLACKTHORN_LEAVES = registerBlock("blackthorn_leaves", createLeavesBlock(BlockSoundGroup.GRASS));
    public static final Block BLACKTHORN_SAPLING = registerBlock("blackthorn_sapling", new SaplingBlock(ModSaplingGenerators.BLACKTHORN, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(CinnyMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(CinnyMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        CinnyMod.LOGGER.info("Registering Modded blocks for " + CinnyMod.MOD_ID);
    }
}
