package net.donaldduckith.betaorigins.datagen;

import net.donaldduckith.betaorigins.BetaOrigins;
import net.donaldduckith.betaorigins.block.ModBlocks;
import net.donaldduckith.betaorigins.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerTurnableRail(ModBlocks.STONE_RAIL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COMPRESSED_STONE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.STONE_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.STONE_ARROW, Models.GENERATED);
    }
}
