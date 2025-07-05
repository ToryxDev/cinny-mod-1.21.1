package net.cinny.cinnymod.item.custom;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

import net.cinny.cinnymod.block.custom.TreatedBlocks;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

public class DaubItem extends Item {
    public static final Supplier<BiMap<Block, Block>> FLAMMABLE_TO_UNFLAMMABLE_BLOCKS = Suppliers.memoize(
            () -> ImmutableBiMap.<Block, Block>builder()
                    .put(Blocks.OAK_PLANKS, TreatedBlocks.TREATED_OAK_PLANKS)
                    .put(Blocks.SPRUCE_PLANKS, TreatedBlocks.TREATED_SPRUCE_PLANKS)
                    .put(Blocks.BIRCH_PLANKS, TreatedBlocks.TREATED_BIRCH_PLANKS)
                    .put(Blocks.JUNGLE_PLANKS, TreatedBlocks.TREATED_JUNGLE_PLANKS)
                    .put(Blocks.ACACIA_PLANKS, TreatedBlocks.TREATED_ACACIA_PLANKS)
                    .put(Blocks.CHERRY_PLANKS, TreatedBlocks.TREATED_CHERRY_PLANKS)
                    .put(Blocks.DARK_OAK_PLANKS, TreatedBlocks.TREATED_DARK_OAK_PLANKS)
                    .put(Blocks.MANGROVE_PLANKS, TreatedBlocks.TREATED_MANGROVE_PLANKS)
                    .put(Blocks.BAMBOO_PLANKS, TreatedBlocks.TREATED_BAMBOO_PLANKS)
                    .put(Blocks.BAMBOO_MOSAIC, TreatedBlocks.TREATED_BAMBOO_MOSAIC)
                    .put(Blocks.OAK_SLAB, TreatedBlocks.TREATED_OAK_SLAB)
                    .put(Blocks.SPRUCE_SLAB, TreatedBlocks.TREATED_SPRUCE_SLAB)
                    .put(Blocks.BIRCH_SLAB, TreatedBlocks.TREATED_BIRCH_SLAB)
                    .put(Blocks.JUNGLE_SLAB, TreatedBlocks.TREATED_JUNGLE_SLAB)
                    .put(Blocks.ACACIA_SLAB, TreatedBlocks.TREATED_ACACIA_SLAB)
                    .put(Blocks.CHERRY_SLAB, TreatedBlocks.TREATED_CHERRY_SLAB)
                    .put(Blocks.DARK_OAK_SLAB, TreatedBlocks.TREATED_DARK_OAK_SLAB)
                    .put(Blocks.MANGROVE_SLAB, TreatedBlocks.TREATED_MANGROVE_SLAB)
                    .put(Blocks.BAMBOO_SLAB, TreatedBlocks.TREATED_BAMBOO_SLAB)
                    .put(Blocks.BAMBOO_MOSAIC_SLAB, TreatedBlocks.TREATED_BAMBOO_MOSAIC_SLAB)
                    .put(Blocks.OAK_FENCE, TreatedBlocks.TREATED_OAK_FENCE)
                    .put(Blocks.SPRUCE_FENCE, TreatedBlocks.TREATED_SPRUCE_FENCE)
                    .put(Blocks.BIRCH_FENCE, TreatedBlocks.TREATED_BIRCH_FENCE)
                    .put(Blocks.JUNGLE_FENCE, TreatedBlocks.TREATED_JUNGLE_FENCE)
                    .put(Blocks.ACACIA_FENCE, TreatedBlocks.TREATED_ACACIA_FENCE)
                    .put(Blocks.CHERRY_FENCE, TreatedBlocks.TREATED_CHERRY_FENCE)
                    .put(Blocks.DARK_OAK_FENCE, TreatedBlocks.TREATED_DARK_OAK_FENCE)
                    .put(Blocks.MANGROVE_FENCE, TreatedBlocks.TREATED_MANGROVE_FENCE)
                    .put(Blocks.BAMBOO_FENCE, TreatedBlocks.TREATED_BAMBOO_FENCE)
                    .put(Blocks.OAK_STAIRS, TreatedBlocks.TREATED_OAK_STAIRS)
                    .put(Blocks.BIRCH_STAIRS, TreatedBlocks.TREATED_BIRCH_STAIRS)
                    .put(Blocks.SPRUCE_STAIRS, TreatedBlocks.TREATED_SPRUCE_STAIRS)
                    .put(Blocks.JUNGLE_STAIRS, TreatedBlocks.TREATED_JUNGLE_STAIRS)
                    .put(Blocks.ACACIA_STAIRS, TreatedBlocks.TREATED_ACACIA_STAIRS)
                    .put(Blocks.CHERRY_STAIRS, TreatedBlocks.TREATED_CHERRY_STAIRS)
                    .put(Blocks.DARK_OAK_STAIRS, TreatedBlocks.TREATED_DARK_OAK_STAIRS)
                    .put(Blocks.MANGROVE_STAIRS, TreatedBlocks.TREATED_MANGROVE_STAIRS)
                    .put(Blocks.BAMBOO_STAIRS, TreatedBlocks.TREATED_BAMBOO_STAIRS)
                    .put(Blocks.BAMBOO_MOSAIC_STAIRS, TreatedBlocks.TREATED_BAMBOO_MOSAIC_STAIRS)
                    .put(Blocks.OAK_LOG, TreatedBlocks.TREATED_OAK_LOG)
                    .put(Blocks.SPRUCE_LOG, TreatedBlocks.TREATED_SPRUCE_LOG)
                    .put(Blocks.BIRCH_LOG, TreatedBlocks.TREATED_BIRCH_LOG)
                    .put(Blocks.JUNGLE_LOG, TreatedBlocks.TREATED_JUNGLE_LOG)
                    .put(Blocks.ACACIA_LOG, TreatedBlocks.TREATED_ACACIA_LOG)
                    .put(Blocks.CHERRY_LOG, TreatedBlocks.TREATED_CHERRY_LOG)
                    .put(Blocks.DARK_OAK_LOG, TreatedBlocks.TREATED_DARK_OAK_LOG)
                    .put(Blocks.MANGROVE_LOG, TreatedBlocks.TREATED_MANGROVE_LOG)
                    .put(Blocks.BAMBOO_BLOCK, TreatedBlocks.TREATED_BAMBOO_BLOCK)
                    .put(Blocks.STRIPPED_OAK_LOG, TreatedBlocks.TREATED_STRIPPED_OAK_LOG)
                    .put(Blocks.STRIPPED_SPRUCE_LOG, TreatedBlocks.TREATED_STRIPPED_SPRUCE_LOG)
                    .put(Blocks.STRIPPED_BIRCH_LOG, TreatedBlocks.TREATED_STRIPPED_BIRCH_LOG)
                    .put(Blocks.STRIPPED_JUNGLE_LOG, TreatedBlocks.TREATED_STRIPPED_JUNGLE_LOG)
                    .put(Blocks.STRIPPED_ACACIA_LOG, TreatedBlocks.TREATED_STRIPPED_ACACIA_LOG)
                    .put(Blocks.STRIPPED_CHERRY_LOG, TreatedBlocks.TREATED_STRIPPED_CHERRY_LOG)
                    .put(Blocks.STRIPPED_DARK_OAK_LOG, TreatedBlocks.TREATED_STRIPPED_DARK_OAK_LOG)
                    .put(Blocks.STRIPPED_MANGROVE_LOG, TreatedBlocks.TREATED_STRIPPED_MANGROVE_LOG)
                    .put(Blocks.STRIPPED_BAMBOO_BLOCK, TreatedBlocks.TREATED_STRIPPED_BAMBOO_BLOCK)
                    .put(Blocks.STRIPPED_OAK_WOOD, TreatedBlocks.TREATED_STRIPPED_OAK_WOOD)
                    .put(Blocks.STRIPPED_SPRUCE_WOOD, TreatedBlocks.TREATED_STRIPPED_SPRUCE_WOOD)
                    .put(Blocks.STRIPPED_BIRCH_WOOD, TreatedBlocks.TREATED_STRIPPED_BIRCH_WOOD)
                    .put(Blocks.STRIPPED_JUNGLE_WOOD, TreatedBlocks.TREATED_STRIPPED_JUNGLE_WOOD)
                    .put(Blocks.STRIPPED_ACACIA_WOOD, TreatedBlocks.TREATED_STRIPPED_ACACIA_WOOD)
                    .put(Blocks.STRIPPED_CHERRY_WOOD, TreatedBlocks.TREATED_STRIPPED_CHERRY_WOOD)
                    .put(Blocks.STRIPPED_DARK_OAK_WOOD, TreatedBlocks.TREATED_STRIPPED_DARK_OAK_WOOD)
                    .put(Blocks.STRIPPED_MANGROVE_WOOD, TreatedBlocks.TREATED_STRIPPED_MANGROVE_WOOD)
                    .put(Blocks.OAK_WOOD, TreatedBlocks.TREATED_OAK_WOOD)
                    .put(Blocks.SPRUCE_WOOD, TreatedBlocks.TREATED_SPRUCE_WOOD)
                    .put(Blocks.BIRCH_WOOD, TreatedBlocks.TREATED_BIRCH_WOOD)
                    .put(Blocks.JUNGLE_WOOD, TreatedBlocks.TREATED_JUNGLE_WOOD)
                    .put(Blocks.ACACIA_WOOD, TreatedBlocks.TREATED_ACACIA_WOOD)
                    .put(Blocks.CHERRY_WOOD, TreatedBlocks.TREATED_CHERRY_WOOD)
                    .put(Blocks.DARK_OAK_WOOD, TreatedBlocks.TREATED_DARK_OAK_WOOD)
                    .put(Blocks.MANGROVE_WOOD, TreatedBlocks.TREATED_MANGROVE_WOOD)
                    .build()
    );

    public DaubItem(Item.Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos blockPos = context.getBlockPos();
        BlockState blockState = world.getBlockState(blockPos);
        return getFlammableState(blockState).map(state -> {
            PlayerEntity playerEntity = context.getPlayer();
            ItemStack itemStack = context.getStack();
            if (playerEntity instanceof ServerPlayerEntity) {
                Criteria.ITEM_USED_ON_BLOCK.trigger((ServerPlayerEntity)playerEntity, blockPos, itemStack);
            }

            itemStack.decrement(1);
            world.playSound(playerEntity, blockPos, SoundEvents.BLOCK_MUDDY_MANGROVE_ROOTS_PLACE, SoundCategory.BLOCKS, 0.6F, 0.7F);
            world.playSound(playerEntity, blockPos, SoundEvents.BLOCK_SCAFFOLDING_STEP, SoundCategory.BLOCKS, 1.0F, 0.9F);
            world.setBlockState(blockPos, state, Block.NOTIFY_ALL_AND_REDRAW);
            world.emitGameEvent(GameEvent.BLOCK_CHANGE, blockPos, GameEvent.Emitter.of(playerEntity, state));
            return ActionResult.success(world.isClient);
        }).orElse(ActionResult.PASS);
    }

    public static Optional<BlockState> getFlammableState(BlockState state) {
        return Optional.ofNullable((Block)((BiMap<?, ?>)FLAMMABLE_TO_UNFLAMMABLE_BLOCKS.get()).get(state.getBlock())).map(block -> block.getStateWithProperties(state));
    }

}