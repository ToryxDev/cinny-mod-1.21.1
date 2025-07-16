package net.cinny.cinnymod.block.custom;

import com.mojang.serialization.MapCodec;
import net.cinny.cinnymod.block.entity.custom.CanopicPotEntity;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemActionResult;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class CanopicPotBlock extends BlockWithEntity implements BlockEntityProvider {
    private static final VoxelShape SHAPE = Block.createCuboidShape(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
    public static final MapCodec<CanopicPotBlock> CODEC = CanopicPotBlock.createCodec(CanopicPotBlock::new);
    private static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;
    private static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;


    public CanopicPotBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH).with(WATERLOGGED, false));

    }

    @Override
    protected MapCodec<? extends BlockWithEntity> getCodec() {
        return CODEC;
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new CanopicPotEntity(pos, state);
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    protected BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.ENTITYBLOCK_ANIMATED;
    }


    //drop inventory on break
    @Override
    protected void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if (state.getBlock() != newState.getBlock()) {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof CanopicPotEntity) {
                ItemScatterer.spawn(world, pos, ((CanopicPotEntity) blockEntity));
                world.updateComparators(pos, this);
            }

            super.onStateReplaced(state, world, pos, newState, moved);
        }
    }



    @Override
    protected ItemActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!player.isSneaking()) {
            if (world.getBlockEntity(pos) instanceof CanopicPotEntity canopicPotEntity) {
                if (canopicPotEntity.isEmpty() && !stack.isEmpty()) {
                    canopicPotEntity.setStack(0, stack);
                    world.playSound(player, pos, SoundEvents.BLOCK_DECORATED_POT_INSERT, SoundCategory.BLOCKS, 1f, 1.4f);
                    world.playSound(player, pos, SoundEvents.BLOCK_ROOTED_DIRT_PLACE, SoundCategory.BLOCKS, 0.6f, 0.8f);
                    canopicPotEntity.wobble(CanopicPotEntity.WobbleType.POSITIVE);
                    if (world instanceof ServerWorld serverWorld) {
                        serverWorld.spawnParticles(ParticleTypes.ASH, pos.getX() + 0.5, pos.getY() + 1.2, pos.getZ() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
                    } if (!player.isInCreativeMode()) {
                        stack.decrement(1);
                    }
                } else if (stack.isEmpty()) {
                    //ItemStack stackOnCanopic = canopicPotEntity.getStack(0);
                    //player.setStackInHand(Hand.MAIN_HAND, stackOnCanopic);
                    canopicPotEntity.wobble(CanopicPotEntity.WobbleType.NEGATIVE);
                    world.playSound(player, pos, SoundEvents.BLOCK_DECORATED_POT_INSERT_FAIL, SoundCategory.BLOCKS, 1f, 0.8f);
                    //canopicPotEntity.clear();

                } else {
                    canopicPotEntity.wobble(CanopicPotEntity.WobbleType.NEGATIVE);
                    world.playSound(player, pos, SoundEvents.BLOCK_DECORATED_POT_INSERT_FAIL, SoundCategory.BLOCKS, 1f, 0.8f);

                    return ItemActionResult.SUCCESS;
                }
            }
            return ItemActionResult.SUCCESS;
        } return ItemActionResult.FAIL;



    }
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, WATERLOGGED);
    }

}