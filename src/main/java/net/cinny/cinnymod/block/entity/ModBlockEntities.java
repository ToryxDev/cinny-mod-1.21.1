package net.cinny.cinnymod.block.entity;

import net.cinny.cinnymod.CinnyMod;
import net.cinny.cinnymod.block.ModBlocks;
import net.cinny.cinnymod.block.entity.custom.CanopicPotEntity;
import net.cinny.cinnymod.block.entity.custom.EffigyBlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<EffigyBlockEntity> RITUAL_EFFIGY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(CinnyMod.MOD_ID, "ritual_effigy"),
                    BlockEntityType.Builder.create(EffigyBlockEntity::new, ModBlocks.RITUAL_EFFIGY).build(null));

    public static final BlockEntityType<CanopicPotEntity> CANOPIC_POT =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(CinnyMod.MOD_ID, "canopic_pot"),
                    BlockEntityType.Builder.create(CanopicPotEntity::new, ModBlocks.CANOPIC_POT).build(null));

    public static void registerBlockEntities() {
        CinnyMod.LOGGER.info("Registering Block Entities for " + CinnyMod.MOD_ID);

    }
}