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
import net.minecraft.recipe.SmithingRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
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
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.STONE_RAIL, 4)
                .pattern("# #")
                .pattern("#S#")
                .pattern("# #")
                .input('#', Items.IRON_INGOT)
                .input('S', ModItems.STONE_STICK)
                .criterion(hasItem(ModItems.STONE_STICK), conditionsFromItem(ModItems.STONE_STICK))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STONE_RAIL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.STONE_POWERED_RAIL, 4)
                .pattern("# #")
                .pattern("#S#")
                .pattern("#R#")
                .input('#', Items.GOLD_INGOT)
                .input('S', ModItems.STONE_STICK)
                .input('R', Items.REDSTONE)
                .criterion(hasItem(ModItems.STONE_STICK), conditionsFromItem(ModItems.STONE_STICK))
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STONE_POWERED_RAIL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.STONE_DETECTOR_RAIL, 4)
                .pattern("#P#")
                .pattern("#S#")
                .pattern("#R#")
                .input('#', Items.IRON_INGOT)
                .input('S', ModItems.STONE_STICK)
                .input('P', Items.STONE_PRESSURE_PLATE)
                .input('R', Items.REDSTONE)
                .criterion(hasItem(ModItems.STONE_STICK), conditionsFromItem(ModItems.STONE_STICK))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.STONE_PRESSURE_PLATE), conditionsFromItem(Items.STONE_PRESSURE_PLATE))
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STONE_DETECTOR_RAIL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.STONE_ACTIVATOR_RAIL, 4)
                .pattern("#S#")
                .pattern("#T#")
                .pattern("#S#")
                .input('#', Items.IRON_INGOT)
                .input('S', ModItems.STONE_STICK)
                .input('T', ModTags.Items.REDSTONE_TORCHES)
                .criterion(hasItem(ModItems.STONE_STICK), conditionsFromItem(ModItems.STONE_STICK))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.REDSTONE_TORCH), conditionsFromItem(Items.REDSTONE_TORCH))
                .criterion(hasItem(ModBlocks.STONE_REDSTONE_TORCH.asItem()), conditionsFromItem(ModBlocks.STONE_REDSTONE_TORCH.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STONE_ACTIVATOR_RAIL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STONE_WOODEN_SWORD, 1).pattern("#").pattern("#").pattern("S").input('#', ItemTags.PLANKS).input('S', ModItems.STONE_STICK)
                .criterion(hasItem(ModItems.STONE_STICK), conditionsFromItem(ModItems.STONE_STICK)).criterion(hasItem(Items.OAK_PLANKS), conditionsFromItem(Items.OAK_PLANKS)).offerTo(exporter, new Identifier(getRecipeName(ModItems.STONE_WOODEN_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STONE_WOODEN_AXE, 1).pattern("##").pattern("#S").pattern(" S").input('#', ItemTags.PLANKS).input('S', ModItems.STONE_STICK)
                .criterion(hasItem(ModItems.STONE_STICK), conditionsFromItem(ModItems.STONE_STICK)).criterion(hasItem(Items.OAK_PLANKS), conditionsFromItem(Items.OAK_PLANKS)).offerTo(exporter, new Identifier(getRecipeName(ModItems.STONE_WOODEN_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STONE_WOODEN_PICKAXE, 1).pattern("###").pattern(" S ").pattern(" S ").input('#', ItemTags.PLANKS).input('S', ModItems.STONE_STICK)
                .criterion(hasItem(ModItems.STONE_STICK), conditionsFromItem(ModItems.STONE_STICK)).criterion(hasItem(Items.OAK_PLANKS), conditionsFromItem(Items.OAK_PLANKS)).offerTo(exporter, new Identifier(getRecipeName(ModItems.STONE_WOODEN_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STONE_WOODEN_SHOVEL, 1).pattern("#").pattern("S").pattern("S").input('#', ItemTags.PLANKS).input('S', ModItems.STONE_STICK)
                .criterion(hasItem(ModItems.STONE_STICK), conditionsFromItem(ModItems.STONE_STICK)).criterion(hasItem(Items.OAK_PLANKS), conditionsFromItem(Items.OAK_PLANKS)).offerTo(exporter, new Identifier(getRecipeName(ModItems.STONE_WOODEN_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STONE_WOODEN_HOE, 1).pattern("##").pattern(" S").pattern(" S").input('#', ItemTags.PLANKS).input('S', ModItems.STONE_STICK)
                .criterion(hasItem(ModItems.STONE_STICK), conditionsFromItem(ModItems.STONE_STICK)).criterion(hasItem(Items.OAK_PLANKS), conditionsFromItem(Items.OAK_PLANKS)).offerTo(exporter, new Identifier(getRecipeName(ModItems.STONE_WOODEN_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STONE_STONE_SWORD, 1)
                .pattern("#").pattern("#").pattern("S").input('#', ItemTags.STONE_TOOL_MATERIALS).input('S', ModItems.STONE_STICK)
                .criterion(hasItem(ModItems.STONE_STICK), conditionsFromItem(ModItems.STONE_STICK)).criterion(hasItem(Items.COBBLESTONE), conditionsFromItem(Items.COBBLESTONE)).offerTo(exporter, new Identifier(getRecipeName(ModItems.STONE_STONE_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STONE_STONE_AXE, 1).pattern("##").pattern("#S").pattern(" S").input('#', ItemTags.STONE_TOOL_MATERIALS).input('S', ModItems.STONE_STICK)
                .criterion(hasItem(ModItems.STONE_STICK), conditionsFromItem(ModItems.STONE_STICK)).criterion(hasItem(Items.COBBLESTONE), conditionsFromItem(Items.COBBLESTONE)).offerTo(exporter, new Identifier(getRecipeName(ModItems.STONE_STONE_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STONE_STONE_PICKAXE, 1).pattern("###").pattern(" S ").pattern(" S ").input('#', ItemTags.STONE_TOOL_MATERIALS).input('S', ModItems.STONE_STICK)
                .criterion(hasItem(ModItems.STONE_STICK), conditionsFromItem(ModItems.STONE_STICK)).criterion(hasItem(Items.COBBLESTONE), conditionsFromItem(Items.COBBLESTONE)).offerTo(exporter, new Identifier(getRecipeName(ModItems.STONE_STONE_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STONE_STONE_SHOVEL, 1).pattern("#").pattern("S").pattern("S").input('#', ItemTags.STONE_TOOL_MATERIALS).input('S', ModItems.STONE_STICK)
                .criterion(hasItem(ModItems.STONE_STICK), conditionsFromItem(ModItems.STONE_STICK)).criterion(hasItem(Items.COBBLESTONE), conditionsFromItem(Items.COBBLESTONE)).offerTo(exporter, new Identifier(getRecipeName(ModItems.STONE_STONE_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STONE_STONE_HOE, 1).pattern("##").pattern(" S").pattern(" S").input('#', ItemTags.STONE_TOOL_MATERIALS).input('S', ModItems.STONE_STICK)
                .criterion(hasItem(ModItems.STONE_STICK), conditionsFromItem(ModItems.STONE_STICK)).criterion(hasItem(Items.COBBLESTONE), conditionsFromItem(Items.COBBLESTONE)).offerTo(exporter, new Identifier(getRecipeName(ModItems.STONE_STONE_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STONE_IRON_SWORD, 1).pattern("#").pattern("#").pattern("S").input('#', Items.IRON_INGOT).input('S', ModItems.STONE_STICK)
                .criterion(hasItem(ModItems.STONE_STICK), conditionsFromItem(ModItems.STONE_STICK)).criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT)).offerTo(exporter, new Identifier(getRecipeName(ModItems.STONE_IRON_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STONE_IRON_AXE, 1).pattern("##").pattern("#S").pattern(" S").input('#', Items.IRON_INGOT).input('S', ModItems.STONE_STICK)
                .criterion(hasItem(ModItems.STONE_STICK), conditionsFromItem(ModItems.STONE_STICK)).criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT)).offerTo(exporter, new Identifier(getRecipeName(ModItems.STONE_IRON_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STONE_IRON_PICKAXE, 1).pattern("###").pattern(" S ").pattern(" S ").input('#', Items.IRON_INGOT).input('S', ModItems.STONE_STICK)
                .criterion(hasItem(ModItems.STONE_STICK), conditionsFromItem(ModItems.STONE_STICK)).criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT)).offerTo(exporter, new Identifier(getRecipeName(ModItems.STONE_IRON_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STONE_IRON_SHOVEL, 1).pattern("#").pattern("S").pattern("S").input('#', Items.IRON_INGOT).input('S', ModItems.STONE_STICK)
                .criterion(hasItem(ModItems.STONE_STICK), conditionsFromItem(ModItems.STONE_STICK)).criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT)).offerTo(exporter, new Identifier(getRecipeName(ModItems.STONE_IRON_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STONE_IRON_HOE, 1).pattern("##").pattern(" S").pattern(" S").input('#', Items.IRON_INGOT).input('S', ModItems.STONE_STICK)
                .criterion(hasItem(ModItems.STONE_STICK), conditionsFromItem(ModItems.STONE_STICK)).criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT)).offerTo(exporter, new Identifier(getRecipeName(ModItems.STONE_IRON_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STONE_DIAMOND_SWORD, 1).pattern("#").pattern("#").pattern("S").input('#', Items.DIAMOND).input('S', ModItems.STONE_STICK)
                .criterion(hasItem(ModItems.STONE_STICK), conditionsFromItem(ModItems.STONE_STICK)).criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND)).offerTo(exporter, new Identifier(getRecipeName(ModItems.STONE_DIAMOND_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STONE_DIAMOND_AXE, 1).pattern("##").pattern("#S").pattern(" S").input('#', Items.DIAMOND).input('S', ModItems.STONE_STICK)
                .criterion(hasItem(ModItems.STONE_STICK), conditionsFromItem(ModItems.STONE_STICK)).criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND)).offerTo(exporter, new Identifier(getRecipeName(ModItems.STONE_DIAMOND_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STONE_DIAMOND_PICKAXE, 1).pattern("###").pattern(" S ").pattern(" S ").input('#', Items.DIAMOND).input('S', ModItems.STONE_STICK)
                .criterion(hasItem(ModItems.STONE_STICK), conditionsFromItem(ModItems.STONE_STICK)).criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND)).offerTo(exporter, new Identifier(getRecipeName(ModItems.STONE_DIAMOND_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STONE_DIAMOND_SHOVEL, 1).pattern("#").pattern("S").pattern("S").input('#', Items.DIAMOND).input('S', ModItems.STONE_STICK)
                .criterion(hasItem(ModItems.STONE_STICK), conditionsFromItem(ModItems.STONE_STICK)).criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND)).offerTo(exporter, new Identifier(getRecipeName(ModItems.STONE_DIAMOND_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STONE_DIAMOND_HOE, 1).pattern("##").pattern(" S").pattern(" S").input('#', Items.DIAMOND).input('S', ModItems.STONE_STICK)
                .criterion(hasItem(ModItems.STONE_STICK), conditionsFromItem(ModItems.STONE_STICK)).criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND)).offerTo(exporter, new Identifier(getRecipeName(ModItems.STONE_DIAMOND_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STONE_GOLD_SWORD, 1).pattern("#").pattern("#").pattern("S").input('#', Items.GOLD_INGOT).input('S', ModItems.STONE_STICK)
                .criterion(hasItem(ModItems.STONE_STICK), conditionsFromItem(ModItems.STONE_STICK)).criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT)).offerTo(exporter, new Identifier(getRecipeName(ModItems.STONE_GOLD_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STONE_GOLD_AXE, 1).pattern("##").pattern("#S").pattern(" S").input('#', Items.GOLD_INGOT).input('S', ModItems.STONE_STICK)
                .criterion(hasItem(ModItems.STONE_STICK), conditionsFromItem(ModItems.STONE_STICK)).criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT)).offerTo(exporter, new Identifier(getRecipeName(ModItems.STONE_GOLD_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STONE_GOLD_PICKAXE, 1).pattern("###").pattern(" S ").pattern(" S ").input('#', Items.GOLD_INGOT).input('S', ModItems.STONE_STICK)
                .criterion(hasItem(ModItems.STONE_STICK), conditionsFromItem(ModItems.STONE_STICK)).criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT)).offerTo(exporter, new Identifier(getRecipeName(ModItems.STONE_GOLD_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STONE_GOLD_SHOVEL, 1).pattern("#").pattern("S").pattern("S").input('#', Items.GOLD_INGOT).input('S', ModItems.STONE_STICK)
                .criterion(hasItem(ModItems.STONE_STICK), conditionsFromItem(ModItems.STONE_STICK)).criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT)).offerTo(exporter, new Identifier(getRecipeName(ModItems.STONE_GOLD_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STONE_GOLD_HOE, 1).pattern("##").pattern(" S").pattern(" S").input('#', Items.GOLD_INGOT).input('S', ModItems.STONE_STICK)
                .criterion(hasItem(ModItems.STONE_STICK), conditionsFromItem(ModItems.STONE_STICK)).criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT)).offerTo(exporter, new Identifier(getRecipeName(ModItems.STONE_GOLD_HOE)));

        offerNetheriteUpgradeRecipe(exporter, ModItems.STONE_DIAMOND_SWORD, RecipeCategory.COMBAT, ModItems.STONE_NETHERITE_SWORD);
        offerNetheriteUpgradeRecipe(exporter, ModItems.STONE_DIAMOND_AXE, RecipeCategory.TOOLS, ModItems.STONE_NETHERITE_AXE);
        offerNetheriteUpgradeRecipe(exporter, ModItems.STONE_DIAMOND_PICKAXE, RecipeCategory.TOOLS, ModItems.STONE_NETHERITE_PICKAXE);
        offerNetheriteUpgradeRecipe(exporter, ModItems.STONE_DIAMOND_SHOVEL, RecipeCategory.TOOLS, ModItems.STONE_NETHERITE_SHOVEL);
        offerNetheriteUpgradeRecipe(exporter, ModItems.STONE_DIAMOND_HOE, RecipeCategory.TOOLS, ModItems.STONE_NETHERITE_HOE);
    }
}

