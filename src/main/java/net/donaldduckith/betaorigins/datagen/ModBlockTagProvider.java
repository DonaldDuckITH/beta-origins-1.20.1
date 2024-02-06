package net.donaldduckith.betaorigins.datagen;

import net.donaldduckith.betaorigins.block.ModBlocks;
import net.donaldduckith.betaorigins.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.STONE_RAIL).add(ModBlocks.COMPRESSED_STONE);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL).add(ModBlocks.COMPRESSED_STONE);
    }
}
