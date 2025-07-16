package net.cinny.cinnymod.world;

import net.cinny.cinnymod.CinnyMod;
import net.cinny.cinnymod.block.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DataPool;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;
import net.minecraft.world.gen.trunk.LargeOakTrunkPlacer;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLACKTHORN_KEY = registerKey("blackthorn");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        BlockStateProvider trunkProvider = new WeightedBlockStateProvider(DataPool.<BlockState>builder()
                .add(ModBlocks.BLACKTHORN_LOG.getDefaultState(), 2)
                .add(ModBlocks.SPINY_BLACKTHORN_LOG.getDefaultState(), 3)
        );

        register(context, BLACKTHORN_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                        trunkProvider,
                        new LargeOakTrunkPlacer(6, 6, 0),
                        BlockStateProvider.of(ModBlocks.BLACKTHORN_LEAVES),
                        new LargeOakFoliagePlacer(
                                ConstantIntProvider.create(2),
                                ConstantIntProvider.create(4),
                                4
                        ),
                        new TwoLayersFeatureSize(1, 0, 1)
                ).build()
        );
    }



    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(CinnyMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
