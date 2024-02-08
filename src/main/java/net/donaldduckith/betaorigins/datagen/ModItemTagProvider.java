package net.donaldduckith.betaorigins.datagen;

import net.donaldduckith.betaorigins.block.ModBlocks;
import net.donaldduckith.betaorigins.item.ModItems;
import net.donaldduckith.betaorigins.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Items.STONE_STICKS_CRAFTING_MATERIALS).add(Items.COBBLESTONE).add(Items.COBBLED_DEEPSLATE)
                .add(Items.BLACKSTONE).add(Items.STONE).add(Items.DEEPSLATE).add(Items.ANDESITE).add(Items.DIORITE)
                .add(Items.GRANITE).add(Items.CALCITE).add(Items.DRIPSTONE_BLOCK).add(Items.TUFF).add(Items.MOSSY_COBBLESTONE)
                .add(Items.END_STONE).add(Items.NETHERRACK);
        getOrCreateTagBuilder(ModTags.Items.REDSTONE_TORCHES).add(ModBlocks.STONE_REDSTONE_TORCH.asItem()).add(Items.REDSTONE_TORCH);

    }
}
