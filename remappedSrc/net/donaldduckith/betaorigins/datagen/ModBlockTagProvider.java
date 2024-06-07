package net.donaldduckith.betaorigins.datagen;

import net.donaldduckith.betaorigins.block.ModBlocks;
import net.donaldduckith.betaorigins.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.STONE_RAIL);

        getOrCreateTagBuilder(ModTags.Blocks.POWERED_RAILS).add(ModBlocks.STONE_POWERED_RAIL).add(Blocks.POWERED_RAIL);

        getOrCreateTagBuilder(BlockTags.RAILS).add(ModBlocks.STONE_RAIL);
        getOrCreateTagBuilder(BlockTags.RAILS).add(ModBlocks.STONE_POWERED_RAIL);
        getOrCreateTagBuilder(BlockTags.RAILS).add(ModBlocks.STONE_DETECTOR_RAIL);
        getOrCreateTagBuilder(BlockTags.RAILS).add(ModBlocks.STONE_ACTIVATOR_RAIL);
    }
}
