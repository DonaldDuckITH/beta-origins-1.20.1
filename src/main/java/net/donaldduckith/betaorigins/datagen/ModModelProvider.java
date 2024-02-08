package net.donaldduckith.betaorigins.datagen;

import com.google.gson.JsonElement;
import net.donaldduckith.betaorigins.block.ModBlocks;
import net.donaldduckith.betaorigins.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.*;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerTurnableRail(ModBlocks.STONE_RAIL);
        blockStateModelGenerator.registerStraightRail(ModBlocks.STONE_POWERED_RAIL);
        blockStateModelGenerator.registerStraightRail(ModBlocks.STONE_DETECTOR_RAIL);
        blockStateModelGenerator.registerStraightRail(ModBlocks.STONE_ACTIVATOR_RAIL);

        blockStateModelGenerator.registerTorch(ModBlocks.STONE_TORCH, ModBlocks.STONE_WALL_TORCH);
        blockStateModelGenerator.registerTorch(ModBlocks.STONE_SOUL_TORCH, ModBlocks.STONE_SOUL_WALL_TORCH);
        blockStateModelGenerator.registerTorch(ModBlocks.STONE_REDSTONE_TORCH, ModBlocks.STONE_REDSTONE_WALL_TORCH);
        blockStateModelGenerator.registerTorch(ModBlocks.STONE_REDSTONE_TORCH_OFF, ModBlocks.STONE_REDSTONE_WALL_TORCH_OFF);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.STONE_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.STONE_ARROW, Models.GENERATED);

        itemModelGenerator.register(ModItems.STONE_REPEATER_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.STONE_COMPARATOR_ITEM, Models.GENERATED);

        itemModelGenerator.register(ModItems.STONE_WOODEN_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STONE_WOODEN_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STONE_WOODEN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STONE_WOODEN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STONE_WOODEN_SWORD, Models.HANDHELD);

        itemModelGenerator.register(ModItems.STONE_STONE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STONE_STONE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STONE_STONE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STONE_STONE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STONE_STONE_SWORD, Models.HANDHELD);

        itemModelGenerator.register(ModItems.STONE_IRON_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STONE_IRON_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STONE_IRON_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STONE_IRON_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STONE_IRON_SWORD, Models.HANDHELD);

        itemModelGenerator.register(ModItems.STONE_DIAMOND_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STONE_DIAMOND_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STONE_DIAMOND_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STONE_DIAMOND_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STONE_DIAMOND_SWORD, Models.HANDHELD);

        itemModelGenerator.register(ModItems.STONE_GOLD_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STONE_GOLD_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STONE_GOLD_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STONE_GOLD_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STONE_GOLD_SWORD, Models.HANDHELD);

        itemModelGenerator.register(ModItems.STONE_NETHERITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STONE_NETHERITE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STONE_NETHERITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STONE_NETHERITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STONE_NETHERITE_SWORD, Models.HANDHELD);
    }
}
