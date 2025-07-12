package net.cinny.cinnymod.item;

import net.cinny.cinnymod.CinnyMod;
import net.cinny.cinnymod.item.custom.DaubItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SnowballItem;
import net.minecraft.item.ThrowablePotionItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item MUDBALL = registerItem("mudball", new Item(new Item.Settings()));
    public static final Item MUDBRICK = registerItem("mud_brick", new Item(new Item.Settings()));
    public static final Item DAUB = registerItem("daub", new DaubItem(new Item.Settings()));
    public static final Item CRACKED_POT = registerItem("cracked_pot", new Item(new Item.Settings()));
    public static final Item ILLAGER_LEAD = registerItem("illager_lead", new Item(new Item.Settings()));
    public static final Item RAW_SILVER = registerItem("raw_silver", new Item(new Item.Settings()));
    public static final Item SILVER_INGOT = registerItem("silver_ingot", new Item(new Item.Settings()));
    public static final Item VISCERA = registerItem("viscera", new Item(new Item.Settings()));
    public static final Item BLOOD_POT = registerItem("blood_pot", new SnowballItem(new Item.Settings()));
    public static final Item SILVER_PIGYON = registerItem("silver_pigyon", new Item(new Item.Settings()));
    public static final Item ALCOHEST = registerItem("alcohest", new Item(new Item.Settings()));
    public static final Item VILLAGER_SPIRIT = registerItem("villager_spirit", new Item(new Item.Settings()));
    public static final Item ILLAGER_RUM = registerItem("illager_rum", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CinnyMod.MOD_ID, name), item);
    }

    //add items to ingredients
    private static void customIngredients(FabricItemGroupEntries entries) {
        entries.add(MUDBALL);
        entries.add(MUDBRICK);
        entries.add(DAUB);
        entries.add(CRACKED_POT);
        entries.add(ILLAGER_LEAD);
        entries.add(SILVER_INGOT);
        entries.add(VISCERA);
        entries.add(BLOOD_POT);
        entries.add(SILVER_PIGYON);
        entries.add(ALCOHEST);
        entries.add(VILLAGER_SPIRIT);
        entries.add(ILLAGER_RUM);
    }

    public static void registerModItems() {
        CinnyMod.LOGGER.info("Registering Mod Items for " + CinnyMod.MOD_ID);

        //ingredients tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::customIngredients);
    }
}
