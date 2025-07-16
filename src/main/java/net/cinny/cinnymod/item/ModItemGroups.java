package net.cinny.cinnymod.item;

import net.cinny.cinnymod.CinnyMod;
import net.cinny.cinnymod.block.ModBlocks;
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
                        entries.add(ModBlocks.RITUAL_EFFIGY);
                        entries.add(ModBlocks.BLACKTHORN_LOG);
                        entries.add(ModBlocks.SPINY_BLACKTHORN_LOG);
                        entries.add(ModBlocks.BLACKTHORN_PLANKS);
                        entries.add(ModBlocks.BLACKTHORN_LEAVES);
                    }).build());

    public static void registerItemGroups() {
        CinnyMod.LOGGER.info("Registering item groups for " + CinnyMod.MOD_ID);
    }
}
