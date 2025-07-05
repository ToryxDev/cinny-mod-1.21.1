package net.cinny.cinnymod.item.custom;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.SignBlockEntity;
import net.minecraft.block.entity.SignText;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.SignChangingItem;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldEvents;
import net.minecraft.world.event.GameEvent;

public class DaubItem extends Item implements SignChangingItem {
    public static final Supplier<BiMap<Block, Block>> UNWAXED_TO_WAXED_BLOCKS = Suppliers.memoize(
            () -> ImmutableBiMap.<Block, Block>builder()
                    .put(Blocks.BAMBOO_BLOCK, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.BAMBOO_MOSAIC, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.BAMBOO_MOSAIC_SLAB, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.BAMBOO_MOSAIC_STAIRS, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.BEEHIVE, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.BEE_NEST, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.COAL_BLOCK, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.STRIPPED_BAMBOO_BLOCK, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.BOOKSHELF, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.CYAN_CARPET, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.BLACK_CARPET, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.BLUE_CARPET, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.GRAY_CARPET, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.BROWN_CARPET, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.LIME_CARPET, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.GREEN_CARPET, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.LIGHT_BLUE_CARPET, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.YELLOW_CARPET, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.WHITE_CARPET, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.RED_CARPET, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.PURPLE_CARPET, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.PINK_CARPET, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.ORANGE_CARPET, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.MOSS_CARPET, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.MAGENTA_CARPET, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.LIGHT_GRAY_CARPET, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.COMPOSTER, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.DRIED_KELP_BLOCK, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.ACACIA_FENCE, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.BAMBOO_FENCE, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.BIRCH_FENCE, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.CHERRY_FENCE, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.CRIMSON_FENCE, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.DARK_OAK_FENCE, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.MANGROVE_FENCE, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.OAK_FENCE, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.WARPED_FENCE, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.SPRUCE_FENCE, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.JUNGLE_FENCE, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.ACACIA_FENCE_GATE, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.BAMBOO_FENCE_GATE, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.BIRCH_FENCE_GATE, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.CHERRY_FENCE_GATE, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.CRIMSON_FENCE_GATE, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.MANGROVE_FENCE_GATE, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.OAK_FENCE_GATE, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.WARPED_FENCE_GATE, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.SPRUCE_FENCE_GATE, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.DARK_OAK_FENCE_GATE, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.JUNGLE_FENCE_GATE, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.HAY_BLOCK, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.ACACIA_LEAVES, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.AZALEA_LEAVES, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.BIRCH_LEAVES, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.CHERRY_LEAVES, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.DARK_OAK_LEAVES, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.OAK_LEAVES, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.SPRUCE_LEAVES, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.FLOWERING_AZALEA_LEAVES, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.JUNGLE_LEAVES, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.MANGROVE_LEAVES, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.LECTERN, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.MANGROVE_ROOTS, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.PINK_PETALS, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.SCAFFOLDING, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.TNT, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.TARGET, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks., Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.PINK_PETALS, Blocks.WAXED_COPPER_BLOCK)

                    .put(Blocks.CYAN_WOOL, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.BLACK_WOOL, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.BLUE_WOOL, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.GRAY_WOOL, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.BROWN_WOOL, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.LIME_WOOL, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.GREEN_WOOL, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.LIGHT_BLUE_WOOL, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.YELLOW_WOOL, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.WHITE_WOOL, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.RED_WOOL, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.PURPLE_WOOL, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.PINK_WOOL, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.ORANGE_WOOL, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.MAGENTA_WOOL, Blocks.WAXED_COPPER_BLOCK)
                    .put(Blocks.LIGHT_GRAY_WOOL, Blocks.WAXED_COPPER_BLOCK)

                    .build()
    );
    public static final Supplier<BiMap<Block, Block>> WAXED_TO_UNWAXED_BLOCKS = Suppliers.memoize(() -> ((BiMap)UNWAXED_TO_WAXED_BLOCKS.get()).inverse());

    public DaubItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos blockPos = context.getBlockPos();
        BlockState blockState = world.getBlockState(blockPos);
        return (ActionResult)getWaxedState(blockState).map(state -> {
            PlayerEntity playerEntity = context.getPlayer();
            ItemStack itemStack = context.getStack();
            if (playerEntity instanceof ServerPlayerEntity) {
                Criteria.ITEM_USED_ON_BLOCK.trigger((ServerPlayerEntity)playerEntity, blockPos, itemStack);
            }

            itemStack.decrement(1);
            world.setBlockState(blockPos, state, Block.NOTIFY_ALL_AND_REDRAW);
            world.emitGameEvent(GameEvent.BLOCK_CHANGE, blockPos, GameEvent.Emitter.of(playerEntity, state));
            world.syncWorldEvent(playerEntity, WorldEvents.BLOCK_WAXED, blockPos, 0);
            return ActionResult.success(world.isClient);
        }).orElse(ActionResult.PASS);
    }

    public static Optional<BlockState> getWaxedState(BlockState state) {
        return Optional.ofNullable((Block)((BiMap)UNWAXED_TO_WAXED_BLOCKS.get()).get(state.getBlock())).map(block -> block.getStateWithProperties(state));
    }

    @Override
    public boolean useOnSign(World world, SignBlockEntity signBlockEntity, boolean front, PlayerEntity player) {
        if (signBlockEntity.setWaxed(true)) {
            world.syncWorldEvent(null, WorldEvents.BLOCK_WAXED, signBlockEntity.getPos(), 0);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean canUseOnSignText(SignText signText, PlayerEntity player) {
        return true;
    }
}
