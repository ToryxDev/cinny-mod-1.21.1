package net.cinny.cinnymod.item;

import net.cinny.cinnymod.CinnyMod;
import net.cinny.cinnymod.block.ModBlocks;
import net.cinny.cinnymod.block.custom.TreatedBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CINNY_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(CinnyMod.MOD_ID, "cinny_mod_items"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.cinny_mod_items"))
                    //icon uses the registry thing
                    .icon(() -> new ItemStack(ModItems.MUDBALL)).entries((displayContext, entries) -> {
                        entries.add(ModItems.MUDBALL);
                        entries.add(ModItems.MUDBRICK);
                        entries.add(ModItems.DAUB);
                        entries.add(ModItems.CRACKED_POT);
                        entries.add(ModItems.ILLAGER_LEAD);
                        entries.add(ModItems.SILVER_INGOT);
                        entries.add(ModItems.SILVER_PIGYON);
                        entries.add(ModItems.VISCERA);
                        entries.add(ModItems.RAW_SILVER);
                        entries.add(ModBlocks.CANOPIC_POT);
                        entries.add(ModBlocks.SILVER_ORE);
                        entries.add(ModBlocks.DEEPSLATE_SILVER_ORE);
                        entries.add(ModBlocks.SILVER_BLOCK);
                        entries.add(ModBlocks.RAW_SILVER_BLOCK);
                        entries.add(ModBlocks.CEMETERY_STONE);
                        entries.add(ModBlocks.MOSSY_CEMETERY_STONE);
                        entries.add(ModBlocks.CEMETERY_BRICKS);
                        entries.add(ModBlocks.CEMETERY_PILLAR);
                    }).build());


    public static final ItemGroup TREATED_BLOCK_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(CinnyMod.MOD_ID,"treated_blocks"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.treated_blocks"))
                    .icon(() -> new ItemStack(TreatedBlocks.TREATED_BAMBOO_MOSAIC)).entries((displayContext, entries) -> {
                        entries.add(TreatedBlocks.TREATED_BAMBOO_MOSAIC);
                        entries.add(TreatedBlocks.TREATED_BAMBOO_PLANKS);
                        entries.add(TreatedBlocks.TREATED_BAMBOO_BLOCK);
                        entries.add(TreatedBlocks.TREATED_OAK_PLANKS);
                        entries.add(TreatedBlocks.TREATED_SPRUCE_PLANKS);
                        entries.add(TreatedBlocks.TREATED_BIRCH_PLANKS);
                        entries.add(TreatedBlocks.TREATED_JUNGLE_PLANKS);
                        entries.add(TreatedBlocks.TREATED_ACACIA_PLANKS);
                        entries.add(TreatedBlocks.TREATED_CHERRY_PLANKS);
                        entries.add(TreatedBlocks.TREATED_DARK_OAK_PLANKS);
                        entries.add(TreatedBlocks.TREATED_MANGROVE_PLANKS);
                        entries.add(TreatedBlocks.TREATED_OAK_SLAB);
                        entries.add(TreatedBlocks.TREATED_SPRUCE_SLAB);
                        entries.add(TreatedBlocks.TREATED_BIRCH_SLAB);
                        entries.add(TreatedBlocks.TREATED_JUNGLE_SLAB);
                        entries.add(TreatedBlocks.TREATED_ACACIA_SLAB);
                        entries.add(TreatedBlocks.TREATED_CHERRY_SLAB);
                        entries.add(TreatedBlocks.TREATED_DARK_OAK_SLAB);
                        entries.add(TreatedBlocks.TREATED_MANGROVE_SLAB);
                        entries.add(TreatedBlocks.TREATED_BAMBOO_SLAB);
                        entries.add(TreatedBlocks.TREATED_BAMBOO_MOSAIC_SLAB);
                        entries.add(TreatedBlocks.TREATED_OAK_FENCE);
                        entries.add(TreatedBlocks.TREATED_SPRUCE_FENCE);
                        entries.add(TreatedBlocks.TREATED_BIRCH_FENCE);
                        entries.add(TreatedBlocks.TREATED_JUNGLE_FENCE);
                        entries.add(TreatedBlocks.TREATED_ACACIA_FENCE);
                        entries.add(TreatedBlocks.TREATED_CHERRY_FENCE);
                        entries.add(TreatedBlocks.TREATED_DARK_OAK_FENCE);
                        entries.add(TreatedBlocks.TREATED_MANGROVE_FENCE);
                        entries.add(TreatedBlocks.TREATED_BAMBOO_FENCE);
                        entries.add(TreatedBlocks.TREATED_OAK_STAIRS);
                        entries.add(TreatedBlocks.TREATED_BIRCH_STAIRS);
                        entries.add(TreatedBlocks.TREATED_SPRUCE_STAIRS);
                        entries.add(TreatedBlocks.TREATED_JUNGLE_STAIRS);
                        entries.add(TreatedBlocks.TREATED_ACACIA_STAIRS);
                        entries.add(TreatedBlocks.TREATED_CHERRY_STAIRS);
                        entries.add(TreatedBlocks.TREATED_DARK_OAK_STAIRS);
                        entries.add(TreatedBlocks.TREATED_MANGROVE_STAIRS);
                        entries.add(TreatedBlocks.TREATED_BAMBOO_STAIRS);
                        entries.add(TreatedBlocks.TREATED_BAMBOO_MOSAIC_STAIRS);
                        entries.add(TreatedBlocks.TREATED_OAK_LOG);
                        entries.add(TreatedBlocks.TREATED_SPRUCE_LOG);
                        entries.add(TreatedBlocks.TREATED_BIRCH_LOG);
                        entries.add(TreatedBlocks.TREATED_JUNGLE_LOG);
                        entries.add(TreatedBlocks.TREATED_ACACIA_LOG);
                        entries.add(TreatedBlocks.TREATED_CHERRY_LOG);
                        entries.add(TreatedBlocks.TREATED_DARK_OAK_LOG);
                        entries.add(TreatedBlocks.TREATED_MANGROVE_LOG);
                        entries.add(TreatedBlocks.TREATED_STRIPPED_OAK_LOG);
                        entries.add(TreatedBlocks.TREATED_STRIPPED_SPRUCE_LOG);
                        entries.add(TreatedBlocks.TREATED_STRIPPED_BIRCH_LOG);
                        entries.add(TreatedBlocks.TREATED_STRIPPED_JUNGLE_LOG);
                        entries.add(TreatedBlocks.TREATED_STRIPPED_ACACIA_LOG);
                        entries.add(TreatedBlocks.TREATED_STRIPPED_CHERRY_LOG);
                        entries.add(TreatedBlocks.TREATED_STRIPPED_DARK_OAK_LOG);
                        entries.add(TreatedBlocks.TREATED_STRIPPED_MANGROVE_LOG);
                        entries.add(TreatedBlocks.TREATED_STRIPPED_BAMBOO_BLOCK);
                        entries.add(TreatedBlocks.TREATED_STRIPPED_OAK_WOOD);
                        entries.add(TreatedBlocks.TREATED_STRIPPED_SPRUCE_WOOD);
                        entries.add(TreatedBlocks.TREATED_STRIPPED_BIRCH_WOOD);
                        entries.add(TreatedBlocks.TREATED_STRIPPED_JUNGLE_WOOD);
                        entries.add(TreatedBlocks.TREATED_STRIPPED_ACACIA_WOOD);
                        entries.add(TreatedBlocks.TREATED_STRIPPED_CHERRY_WOOD);
                        entries.add(TreatedBlocks.TREATED_STRIPPED_DARK_OAK_WOOD);
                        entries.add(TreatedBlocks.TREATED_STRIPPED_MANGROVE_WOOD);
                        entries.add(TreatedBlocks.TREATED_OAK_WOOD);
                        entries.add(TreatedBlocks.TREATED_SPRUCE_WOOD);
                        entries.add(TreatedBlocks.TREATED_BIRCH_WOOD);
                        entries.add(TreatedBlocks.TREATED_JUNGLE_WOOD);
                        entries.add(TreatedBlocks.TREATED_ACACIA_WOOD);
                        entries.add(TreatedBlocks.TREATED_CHERRY_WOOD);
                        entries.add(TreatedBlocks.TREATED_DARK_OAK_WOOD);
                        entries.add(TreatedBlocks.TREATED_MANGROVE_WOOD);
                    }).build());


    public static void registerItemGroups() {
        CinnyMod.LOGGER.info("Registering item groups for " + CinnyMod.MOD_ID);
    }
}
