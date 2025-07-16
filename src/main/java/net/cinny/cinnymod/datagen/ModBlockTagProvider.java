package net.cinny.cinnymod.datagen;

import net.cinny.cinnymod.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.CANOPIC_POT,
                        ModBlocks.SILVER_BLOCK,
                        ModBlocks.SILVER_ORE,
                        ModBlocks.DEEPSLATE_SILVER_ORE,
                        ModBlocks.RAW_SILVER_BLOCK,
                        ModBlocks.CEMETERY_BRICKS,
                        ModBlocks.CEMETERY_PILLAR,
                        ModBlocks.CEMETERY_STONE,
                        ModBlocks.MOSSY_CEMETERY_STONE
                        );

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.BLACKTHORN_LOG,
                        ModBlocks.BLACKTHORN_PLANKS,
                        ModBlocks.STRIPPED_BLACKTHORN_LOG,
                        ModBlocks.RITUAL_EFFIGY
                );

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.SILVER_ORE,
                        ModBlocks.DEEPSLATE_SILVER_ORE,
                        ModBlocks.RAW_SILVER_BLOCK,
                        ModBlocks.SILVER_BLOCK,
                        ModBlocks.CANOPIC_POT
                        );

        getOrCreateTagBuilder(BlockTags.LOGS)
                .add(ModBlocks.BLACKTHORN_LOG,
                        ModBlocks.STRIPPED_BLACKTHORN_LOG);

        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(ModBlocks.BLACKTHORN_PLANKS);
    }
}