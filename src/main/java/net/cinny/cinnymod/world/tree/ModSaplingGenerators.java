package net.cinny.cinnymod.world.tree;

import net.cinny.cinnymod.CinnyMod;
import net.cinny.cinnymod.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator BLACKTHORN = new SaplingGenerator(CinnyMod.MOD_ID + ":blackthorn",
            Optional.empty(),Optional.of(ModConfiguredFeatures.BLACKTHORN_KEY), Optional.empty());
}
