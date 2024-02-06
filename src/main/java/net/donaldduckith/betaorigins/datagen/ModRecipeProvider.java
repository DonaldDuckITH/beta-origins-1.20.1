package net.donaldduckith.betaorigins.datagen;

import net.donaldduckith.betaorigins.block.ModBlocks;
import net.donaldduckith.betaorigins.item.ModItems;
import net.donaldduckith.betaorigins.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.STONE, RecipeCategory.MISC,
                ModBlocks.COMPRESSED_STONE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STONE_STICK, 4)
                .pattern("#")
                .pattern("#")
                .input('#', ModTags.Items.STONE_STICKS_CRAFTING_MATERIALS)
                .criterion(hasItem(Items.COBBLESTONE), conditionsFromItem(Items.COBBLESTONE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STONE_STICK)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STONE_ARROW, 4)
                .pattern("#")
                .pattern("S")
                .pattern("F")
                .input('#', Items.FLINT)
                .input('S', ModItems.STONE_STICK)
                .input('F', Items.FEATHER)
                .criterion(hasItem(Items.FEATHER), conditionsFromItem(Items.FEATHER))
                .criterion(hasItem(Items.FLINT), conditionsFromItem(Items.FLINT))
                .criterion(hasItem(ModItems.STONE_STICK), conditionsFromItem(ModItems.STONE_STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STONE_ARROW)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModBlocks.STONE_RAIL, 4)
                .pattern("# #")
                .pattern("#S#")
                .pattern("# #")
                .input('#', Items.IRON_INGOT)
                .input('S', ModItems.STONE_STICK)
                .criterion(hasItem(ModItems.STONE_STICK), conditionsFromItem(ModItems.STONE_STICK))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STONE_ARROW)));
    }
}

