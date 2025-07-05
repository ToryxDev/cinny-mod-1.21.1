package net.cinny.cinnymod.item;

import net.cinny.cinnymod.CinnyMod;
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
                        entries.add(ModItems.RAW_SILVER);
                    }).build());

    public static void registerItemGroups() {
        CinnyMod.LOGGER.info("Registering item groups for " + CinnyMod.MOD_ID);
    }
}
