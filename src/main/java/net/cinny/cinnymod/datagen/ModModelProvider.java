package net.cinny.cinnymod.datagen;

import net.cinny.cinnymod.block.ModBlocks;
import net.cinny.cinnymod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CEMETERY_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_CEMETERY_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CEMETERY_BRICKS);
        blockStateModelGenerator.registerLog(ModBlocks.CEMETERY_PILLAR).log(ModBlocks.CEMETERY_PILLAR);;
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_SILVER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_SILVER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLACKTHORN_PLANKS);
        blockStateModelGenerator.registerLog(ModBlocks.BLACKTHORN_LOG).log(ModBlocks.BLACKTHORN_LOG);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_BLACKTHORN_LOG).log(ModBlocks.STRIPPED_BLACKTHORN_LOG);
        blockStateModelGenerator.registerSingleton(ModBlocks.BLACKTHORN_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.BLACKTHORN_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.MUDBALL, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUDBRICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.ALCOHEST, Models.GENERATED);
        itemModelGenerator.register(ModItems.VILLAGER_SPIRIT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ILLAGER_RUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.ILLAGER_LEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.CRACKED_POT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_SILVER, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILVER_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.VISCERA, Models.GENERATED);
        itemModelGenerator.register(ModItems.THORN, Models.GENERATED);
    }
}
