package net.cinny.cinnymod.block.entity.renderer;

import net.cinny.cinnymod.block.entity.custom.CanopicPotEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;

public class CanopicPotEntityRenderer implements BlockEntityRenderer<CanopicPotEntity> {
    public CanopicPotEntityRenderer(BlockEntityRendererFactory.Context context) {

    }

    @Override
    public void render(CanopicPotEntity entity, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        matrices.push();

        Direction direction = entity.getHorizontalFacing();
        matrices.translate(0.5, 0.0, 0.5);
        matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180.0F - direction.asRotation()));
        matrices.translate(-0.5, 0.0, -0.5);

        // Apply wobble
        CanopicPotEntity.WobbleType wobbleType = entity.lastWobbleType;
        if (wobbleType != null && entity.getWorld() != null) {
            float g = ((float)(entity.getWorld().getTime() - entity.lastWobbleTime) + tickDelta) / wobbleType.lengthInTicks;
            if (g >= 0.0F && g <= 1.0F) {
                if (wobbleType == CanopicPotEntity.WobbleType.POSITIVE) {
                    float k = g * (float)(Math.PI * 2);
                    float l = -1.5F * (MathHelper.cos(k) + 0.5F) * MathHelper.sin(k / 2.0F);
                    matrices.multiply(RotationAxis.POSITIVE_X.rotation(l * 0.015625F), 0.5F, 0.0F, 0.5F);
                    float m = MathHelper.sin(k);
                    matrices.multiply(RotationAxis.POSITIVE_Z.rotation(m * 0.015625F), 0.5F, 0.0F, 0.5F);
                } else {
                    float h = MathHelper.sin(-g * 3.0F * (float)Math.PI) * 0.125F;
                    float k = 1.0F - g;
                    matrices.multiply(RotationAxis.POSITIVE_Y.rotation(h * k), 0.5F, 0.0F, 0.5F);
                }
            }
        }

        // Get the block state
        MinecraftClient client = MinecraftClient.getInstance();
        var blockRenderManager = client.getBlockRenderManager();

        // Use default state or actual block state at position
        var state = entity.getCachedState();

        // Get the baked model
        var model = blockRenderManager.getModel(state);

        // Submit the model to be rendered
        blockRenderManager.getModelRenderer().render(
                entity.getWorld(),
                model,
                state,
                entity.getPos(),
                matrices,
                vertexConsumers.getBuffer(RenderLayer.getSolid()),
                false,
                client.world.random,
                42, // seed
                overlay
        );

        matrices.pop();
    }



}
