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
        addDrop(ModBlocks.COMPRESSED_STONE);
    }
}
