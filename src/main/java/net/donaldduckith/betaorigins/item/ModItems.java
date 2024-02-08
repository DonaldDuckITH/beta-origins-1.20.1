package net.donaldduckith.betaorigins.item;

import net.donaldduckith.betaorigins.BetaOrigins;
import net.donaldduckith.betaorigins.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

public class ModItems {
    public static final Item STONE_STICK = registerItem("stone_stick", new Item(new FabricItemSettings()));
    public static final Item STONE_ARROW = registerItem("stone_arrow", new Item(new FabricItemSettings()));
    public static final Item STONE_REPEATER_ITEM = registerItem("stone_repeater_item", new BlockItem(ModBlocks.STONE_REPEATER, new FabricItemSettings()));
    public static final Item STONE_COMPARATOR_ITEM = registerItem("stone_comparator_item", new BlockItem(ModBlocks.STONE_COMPARATOR, new FabricItemSettings()));

    public static final Item STONE_WOODEN_AXE = registerItem("stone_wooden_axe", new AxeItem(ToolMaterials.WOOD, 6.0f, -3.2f, new FabricItemSettings()));
    public static final Item STONE_WOODEN_HOE = registerItem("stone_wooden_hoe", new HoeItem(ToolMaterials.WOOD, 0, -2.8f, new FabricItemSettings()));
    public static final Item STONE_WOODEN_PICKAXE = registerItem("stone_wooden_pickaxe", new PickaxeItem(ToolMaterials.WOOD, 3, -3.0f, new FabricItemSettings()));
    public static final Item STONE_WOODEN_SHOVEL = registerItem("stone_wooden_shovel", new ShovelItem(ToolMaterials.WOOD, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item STONE_WOODEN_SWORD = registerItem("stone_wooden_sword", new SwordItem(ToolMaterials.WOOD, 3, -2.4f, new FabricItemSettings()));

    public static final Item STONE_STONE_AXE = registerItem("stone_stone_axe", new AxeItem(ToolMaterials.STONE, 7.0f, -3.2f, new FabricItemSettings()));
    public static final Item STONE_STONE_HOE = registerItem("stone_stone_hoe", new HoeItem(ToolMaterials.STONE, -1, -2.0f, new FabricItemSettings()));
    public static final Item STONE_STONE_PICKAXE = registerItem("stone_stone_pickaxe", new PickaxeItem(ToolMaterials.STONE, 1, -2.8f, new FabricItemSettings()));
    public static final Item STONE_STONE_SHOVEL = registerItem("stone_stone_shovel", new ShovelItem(ToolMaterials.STONE, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item STONE_STONE_SWORD = registerItem("stone_stone_sword", new SwordItem(ToolMaterials.STONE, 3, -2.4f, new FabricItemSettings()));

    public static final Item STONE_IRON_AXE = registerItem("stone_iron_axe", new AxeItem(ToolMaterials.IRON, 6.0f, -3.2f, new FabricItemSettings()));
    public static final Item STONE_IRON_HOE = registerItem("stone_iron_hoe", new HoeItem(ToolMaterials.IRON, -2, -2.0f, new FabricItemSettings()));
    public static final Item STONE_IRON_PICKAXE = registerItem("stone_iron_pickaxe", new PickaxeItem(ToolMaterials.IRON, 1, -2.8f, new FabricItemSettings()));
    public static final Item STONE_IRON_SHOVEL = registerItem("stone_iron_shovel", new ShovelItem(ToolMaterials.IRON, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item STONE_IRON_SWORD = registerItem("stone_iron_sword", new SwordItem(ToolMaterials.IRON, 3, -2.4f, new FabricItemSettings()));

    public static final Item STONE_DIAMOND_AXE = registerItem("stone_diamond_axe", new AxeItem(ToolMaterials.DIAMOND, 5.0f, -3.2f, new FabricItemSettings()));
    public static final Item STONE_DIAMOND_HOE = registerItem("stone_diamond_hoe", new HoeItem(ToolMaterials.DIAMOND, -3, -2.0f, new FabricItemSettings()));
    public static final Item STONE_DIAMOND_PICKAXE = registerItem("stone_diamond_pickaxe", new PickaxeItem(ToolMaterials.DIAMOND, 1, -2.8f, new FabricItemSettings()));
    public static final Item STONE_DIAMOND_SHOVEL = registerItem("stone_diamond_shovel", new ShovelItem(ToolMaterials.DIAMOND, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item STONE_DIAMOND_SWORD = registerItem("stone_diamond_sword", new SwordItem(ToolMaterials.DIAMOND, 3, -2.4f, new FabricItemSettings()));

    public static final Item STONE_GOLD_AXE = registerItem("stone_gold_axe", new AxeItem(ToolMaterials.GOLD, 6.0f, -2.8f, new FabricItemSettings()));
    public static final Item STONE_GOLD_HOE = registerItem("stone_gold_hoe", new HoeItem(ToolMaterials.GOLD, 0, -1.6f, new FabricItemSettings()));
    public static final Item STONE_GOLD_PICKAXE = registerItem("stone_gold_pickaxe", new PickaxeItem(ToolMaterials.GOLD, 1, -2.4f, new FabricItemSettings()));
    public static final Item STONE_GOLD_SHOVEL = registerItem("stone_gold_shovel", new ShovelItem(ToolMaterials.GOLD, 1.5f, -2.6f, new FabricItemSettings()));
    public static final Item STONE_GOLD_SWORD = registerItem("stone_gold_sword", new SwordItem(ToolMaterials.GOLD, 3, -2.0f, new FabricItemSettings()));

    public static final Item STONE_NETHERITE_AXE = registerItem("stone_netherite_axe", new AxeItem(ToolMaterials.NETHERITE, 5.0f, -3.2f, new FabricItemSettings()));
    public static final Item STONE_NETHERITE_HOE = registerItem("stone_netherite_hoe", new HoeItem(ToolMaterials.NETHERITE, -4, -2.0f, new FabricItemSettings()));
    public static final Item STONE_NETHERITE_PICKAXE = registerItem("stone_netherite_pickaxe", new PickaxeItem(ToolMaterials.NETHERITE, 1, -2.8f, new FabricItemSettings()));
    public static final Item STONE_NETHERITE_SHOVEL = registerItem("stone_netherite_shovel", new ShovelItem(ToolMaterials.NETHERITE, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item STONE_NETHERITE_SWORD = registerItem("stone_netherite_sword", new SwordItem(ToolMaterials.NETHERITE, 3, -2.4f, new FabricItemSettings()));

    public static final Item STONE_TORCH_ITEM = registerItem("stone_torch_item", new VerticallyAttachableBlockItem(ModBlocks.STONE_TORCH, ModBlocks.STONE_WALL_TORCH, new FabricItemSettings(), Direction.DOWN));
    public static final Item STONE_SOUL_TORCH_ITEM = registerItem("stone_soul_torch_item", new VerticallyAttachableBlockItem(ModBlocks.STONE_SOUL_TORCH, ModBlocks.STONE_SOUL_WALL_TORCH, new FabricItemSettings(), Direction.DOWN));
    public static final Item STONE_REDSTONE_TORCH_ITEM = registerItem("stone_redstone_torch_item", new VerticallyAttachableBlockItem(ModBlocks.STONE_REDSTONE_TORCH, ModBlocks.STONE_REDSTONE_WALL_TORCH, new FabricItemSettings(), Direction.DOWN));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BetaOrigins.MOD_ID, name), item);
    }
    public static void registerModItems() {
        BetaOrigins.LOGGER.info("Registering mod items for " + BetaOrigins.MOD_ID);
    }
}
