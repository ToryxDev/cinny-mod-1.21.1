package net.cinny.cinnymod.block.custom;

import com.mojang.serialization.MapCodec;
import net.cinny.cinnymod.block.entity.custom.EffigyBlockEntity;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemActionResult;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class EffigyBlock extends BlockWithEntity implements BlockEntityProvider {
    private static final VoxelShape SHAPE = Block.createCuboidShape(2, 0, 2, 14, 16, 13);

    public static final MapCodec<EffigyBlock> CODEC = EffigyBlock.createCodec(EffigyBlock::new);

    public EffigyBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected MapCodec<? extends BlockWithEntity> getCodec() {
        return CODEC;
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new EffigyBlockEntity(pos, state);
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    protected BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }


    //drop inventory on break
    @Override
    protected void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if (state.getBlock() != newState.getBlock()) {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof EffigyBlockEntity) {
                ItemScatterer.spawn(world, pos, ((EffigyBlockEntity) blockEntity));
                world.updateComparators(pos, this);
            }

            super.onStateReplaced(state, world, pos, newState, moved);
        }
    }


    @Override
    protected ItemActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!player.isSneaking()) {
            if (world.getBlockEntity(pos) instanceof EffigyBlockEntity effigyBlockEntity) {
                if (effigyBlockEntity.isEmpty() && !stack.isEmpty()) {
                    effigyBlockEntity.setStack(0, stack);
                    world.playSound(player, pos, SoundEvents.ENTITY_ITEM_PICKUP, SoundCategory.BLOCKS, 1f, 2f);
                    if (!player.isInCreativeMode()) {
                        stack.decrement(1);
                    }
                } else if (stack.isEmpty()) {
                    ItemStack stackOnEffigy = effigyBlockEntity.getStack(0);
                    player.setStackInHand(Hand.MAIN_HAND, stackOnEffigy);
                    world.playSound(player, pos, SoundEvents.ENTITY_ITEM_PICKUP, SoundCategory.BLOCKS, 1f, 1f);
                    effigyBlockEntity.clear();

                }
            }
            return ItemActionResult.SUCCESS;
        } return ItemActionResult.FAIL;
    }
}