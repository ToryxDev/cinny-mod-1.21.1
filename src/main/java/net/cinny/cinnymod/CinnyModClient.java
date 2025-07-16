package net.cinny.cinnymod;

import net.cinny.cinnymod.block.ModBlocks;
import net.cinny.cinnymod.block.entity.ModBlockEntities;
import net.cinny.cinnymod.block.entity.renderer.CanopicPotEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.world.biome.FoliageColors;

public class CinnyModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RITUAL_EFFIGY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLACKTHORN_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SPINY_BLACKTHORN_LOG, RenderLayer.getCutout());


        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> getBlackthornColor(), ModBlocks.BLACKTHORN_LEAVES);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> getBlackthornColor(), ModBlocks.BLACKTHORN_LEAVES);

        BlockEntityRendererFactories.register(ModBlockEntities.CANOPIC_POT, CanopicPotEntityRenderer::new);

    }

    public static int getBlackthornColor() {
        return 6059081;
    }

}
