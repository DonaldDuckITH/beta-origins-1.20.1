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
        getOrCreateTagBuilder(BlockTags.RAILS).add(ModBlocks.STONE_RAIL);
        getOrCreateTagBuilder(BlockTags.RAILS).add(ModBlocks.STONE_POWERED_RAIL);
        getOrCreateTagBuilder(BlockTags.RAILS).add(ModBlocks.STONE_DETECTOR_RAIL);
        getOrCreateTagBuilder(BlockTags.RAILS).add(ModBlocks.STONE_ACTIVATOR_RAIL);

        getOrCreateTagBuilder(BlockTags.CLIMBABLE).add(ModBlocks.STONE_LADDER);

        getOrCreateTagBuilder(BlockTags.SIGNS).add(ModBlocks.STONE_OAK_SIGN);
        getOrCreateTagBuilder(BlockTags.SIGNS).add(ModBlocks.STONE_SPRUCE_SIGN);
        getOrCreateTagBuilder(BlockTags.SIGNS).add(ModBlocks.STONE_BIRCH_SIGN);
        getOrCreateTagBuilder(BlockTags.SIGNS).add(ModBlocks.STONE_JUNGLE_SIGN);
        getOrCreateTagBuilder(BlockTags.SIGNS).add(ModBlocks.STONE_ACACIA_SIGN);
        getOrCreateTagBuilder(BlockTags.SIGNS).add(ModBlocks.STONE_DARK_OAK_SIGN);
        getOrCreateTagBuilder(BlockTags.SIGNS).add(ModBlocks.STONE_CRIMSON_SIGN);
        getOrCreateTagBuilder(BlockTags.SIGNS).add(ModBlocks.STONE_WARPED_SIGN);
        getOrCreateTagBuilder(BlockTags.SIGNS).add(ModBlocks.STONE_MANGROVE_SIGN);
        getOrCreateTagBuilder(BlockTags.SIGNS).add(ModBlocks.STONE_BAMBOO_SIGN);
        getOrCreateTagBuilder(BlockTags.SIGNS).add(ModBlocks.STONE_CHERRY_SIGN);
    }
}
