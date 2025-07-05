package net.cinny.cinnymod.block.custom;

import net.cinny.cinnymod.CinnyMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class TreatedBlocks {
    public static final Block TREATED_BAMBOO_MOSAIC = registerBlock("treated_bamboo_mosaic", new Block(Block.Settings.create().sounds(BlockSoundGroup.BAMBOO_WOOD).strength(2f, 3f)));
    public static final Block TREATED_BAMBOO_PLANKS = registerBlock("treated_bamboo_planks", new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.BAMBOO_WOOD).strength(2f, 3f)));
    public static final Block TREATED_BAMBOO_BLOCK = registerBlock("treated_bamboo_block", new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.BAMBOO_WOOD).strength(2f, 3f)));
    public static final Block TREATED_OAK_PLANKS = registerBlock("treated_oak_planks", new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_SPRUCE_PLANKS = registerBlock("treated_spruce_planks", new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_BIRCH_PLANKS = registerBlock("treated_birch_planks", new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_JUNGLE_PLANKS = registerBlock("treated_jungle_planks", new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_ACACIA_PLANKS = registerBlock("treated_acacia_planks", new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_CHERRY_PLANKS = registerBlock("treated_cherry_planks", new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_DARK_OAK_PLANKS = registerBlock("treated_dark_oak_planks", new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_MANGROVE_PLANKS = registerBlock("treated_mangrove_planks", new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_OAK_SLAB = registerBlock("treated_oak_slab", new SlabBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_SPRUCE_SLAB = registerBlock("treated_spruce_slab", new SlabBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_BIRCH_SLAB = registerBlock("treated_birch_slab", new SlabBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_JUNGLE_SLAB = registerBlock("treated_jungle_slab", new SlabBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_ACACIA_SLAB = registerBlock("treated_acacia_slab", new SlabBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_CHERRY_SLAB = registerBlock("treated_cherry_slab", new SlabBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_DARK_OAK_SLAB = registerBlock("treated_dark_oak_slab", new SlabBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_MANGROVE_SLAB = registerBlock("treated_mangrove_slab", new SlabBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_BAMBOO_SLAB = registerBlock("treated_bamboo_slab", new SlabBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.BAMBOO_WOOD).strength(2f, 3f)));
    public static final Block TREATED_BAMBOO_MOSAIC_SLAB = registerBlock("treated_bamboo_mosaic_slab", new SlabBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.BAMBOO_WOOD).strength(2f, 3f)));
    public static final Block TREATED_OAK_FENCE = registerBlock("treated_oak_fence", new FenceBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_SPRUCE_FENCE = registerBlock("treated_spruce_fence", new FenceBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_BIRCH_FENCE = registerBlock("treated_birch_fence", new FenceBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_JUNGLE_FENCE = registerBlock("treated_jungle_fence", new FenceBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_ACACIA_FENCE = registerBlock("treated_acacia_fence", new FenceBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_CHERRY_FENCE = registerBlock("treated_cherry_fence", new FenceBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_DARK_OAK_FENCE = registerBlock("treated_dark_oak_fence", new FenceBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_MANGROVE_FENCE = registerBlock("treated_mangrove_fence", new FenceBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_BAMBOO_FENCE = registerBlock("treated_bamboo_fence", new FenceBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.BAMBOO_WOOD).strength(2f, 3f)));
    public static final Block TREATED_OAK_STAIRS = registerBlock("treated_oak_stairs", new StairsBlock(Blocks.OAK_STAIRS.getDefaultState(), AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_BIRCH_STAIRS = registerBlock("treated_birch_stairs", new StairsBlock(Blocks.BIRCH_STAIRS.getDefaultState(), AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_SPRUCE_STAIRS = registerBlock("treated_spruce_stairs", new StairsBlock(Blocks.SPRUCE_STAIRS.getDefaultState(), AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_JUNGLE_STAIRS = registerBlock("treated_jungle_stairs", new StairsBlock(Blocks.JUNGLE_STAIRS.getDefaultState(), AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_ACACIA_STAIRS = registerBlock("treated_acacia_stairs", new StairsBlock(Blocks.ACACIA_STAIRS.getDefaultState(), AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_CHERRY_STAIRS = registerBlock("treated_cherry_stairs", new StairsBlock(Blocks.CHERRY_STAIRS.getDefaultState(), AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_DARK_OAK_STAIRS = registerBlock("treated_dark_oak_stairs", new StairsBlock(Blocks.DARK_OAK_STAIRS.getDefaultState(), AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_MANGROVE_STAIRS = registerBlock("treated_mangrove_stairs", new StairsBlock(Blocks.MANGROVE_STAIRS.getDefaultState(), AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_BAMBOO_STAIRS = registerBlock("treated_bamboo_stairs", new StairsBlock(Blocks.BAMBOO_STAIRS.getDefaultState(), AbstractBlock.Settings.create().sounds(BlockSoundGroup.BAMBOO_WOOD).strength(2f, 3f)));
    public static final Block TREATED_BAMBOO_MOSAIC_STAIRS = registerBlock("treated_bamboo_mosaic_stairs", new StairsBlock(Blocks.BAMBOO_MOSAIC_STAIRS.getDefaultState(), AbstractBlock.Settings.create().sounds(BlockSoundGroup.BAMBOO_WOOD).strength(2f, 3f)));
    public static final Block TREATED_OAK_LOG = registerBlock("treated_oak_log", new PillarBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_SPRUCE_LOG = registerBlock("treated_spruce_log", new PillarBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_BIRCH_LOG = registerBlock("treated_birch_log", new PillarBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_JUNGLE_LOG = registerBlock("treated_jungle_log", new PillarBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_ACACIA_LOG = registerBlock("treated_acacia_log", new PillarBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_CHERRY_LOG = registerBlock("treated_cherry_log", new PillarBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_DARK_OAK_LOG = registerBlock("treated_dark_oak_log", new PillarBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_MANGROVE_LOG = registerBlock("treated_mangrove_log", new PillarBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_STRIPPED_OAK_LOG = registerBlock("treated_stripped_oak_log", new PillarBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_STRIPPED_SPRUCE_LOG = registerBlock("treated_stripped_spruce_log", new PillarBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_STRIPPED_BIRCH_LOG = registerBlock("treated_stripped_birch_log", new PillarBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_STRIPPED_JUNGLE_LOG = registerBlock("treated_stripped_jungle_log", new PillarBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_STRIPPED_ACACIA_LOG = registerBlock("treated_stripped_acacia_log", new PillarBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_STRIPPED_CHERRY_LOG = registerBlock("treated_stripped_cherry_log", new PillarBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_STRIPPED_DARK_OAK_LOG = registerBlock("treated_stripped_dark_oak_log", new PillarBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_STRIPPED_MANGROVE_LOG = registerBlock("treated_stripped_mangrove_log", new PillarBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_STRIPPED_BAMBOO_BLOCK = registerBlock("treated_stripped_bamboo_block", new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.BAMBOO_WOOD).strength(2f, 3f)));
    public static final Block TREATED_STRIPPED_OAK_WOOD = registerBlock("treated_stripped_oak_wood", new PillarBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_STRIPPED_SPRUCE_WOOD = registerBlock("treated_stripped_spruce_wood", new PillarBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_STRIPPED_BIRCH_WOOD = registerBlock("treated_stripped_birch_wood", new PillarBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_STRIPPED_JUNGLE_WOOD = registerBlock("treated_stripped_jungle_wood", new PillarBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_STRIPPED_ACACIA_WOOD = registerBlock("treated_stripped_acacia_wood", new PillarBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_STRIPPED_CHERRY_WOOD = registerBlock("treated_stripped_cherry_wood", new PillarBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_STRIPPED_DARK_OAK_WOOD = registerBlock("treated_stripped_dark_oak_wood", new PillarBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_STRIPPED_MANGROVE_WOOD = registerBlock("treated_stripped_mangrove_wood", new PillarBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_OAK_WOOD = registerBlock("treated_oak_wood", new PillarBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_SPRUCE_WOOD = registerBlock("treated_spruce_wood", new PillarBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_BIRCH_WOOD = registerBlock("treated_birch_wood", new PillarBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_JUNGLE_WOOD = registerBlock("treated_jungle_wood", new PillarBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_ACACIA_WOOD = registerBlock("treated_acacia_wood", new PillarBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_CHERRY_WOOD = registerBlock("treated_cherry_wood", new PillarBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_DARK_OAK_WOOD = registerBlock("treated_dark_oak_wood", new PillarBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    public static final Block TREATED_MANGROVE_WOOD = registerBlock("treated_mangrove_wood", new PillarBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(2f, 3f)));
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(CinnyMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(CinnyMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerTreatedBlocks() {
        CinnyMod.LOGGER.info("Registering treated blocks for " + CinnyMod.MOD_ID);
    }
}
