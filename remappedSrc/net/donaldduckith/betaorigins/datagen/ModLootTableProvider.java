package net.donaldduckith.betaorigins.datagen;

import net.donaldduckith.betaorigins.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.STONE_RAIL);
        addDrop(ModBlocks.STONE_POWERED_RAIL);
        addDrop(ModBlocks.STONE_DETECTOR_RAIL);
        addDrop(ModBlocks.STONE_ACTIVATOR_RAIL);

        addDrop(ModBlocks.STONE_TORCH);
        addDrop(ModBlocks.STONE_SOUL_TORCH);
        addDrop(ModBlocks.STONE_REDSTONE_TORCH);

        addDrop(ModBlocks.STONE_REPEATER);
        addDrop(ModBlocks.STONE_COMPARATOR);
    }
}
