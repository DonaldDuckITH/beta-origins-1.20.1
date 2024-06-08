package net.donaldduckith.betaorigins.item;

import net.donaldduckith.betaorigins.BetaOrigins;
import net.donaldduckith.betaorigins.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup BETA_ORIGINS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BetaOrigins.MOD_ID, "beta_origins"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.betaorigins"))
                    .icon(() -> new ItemStack(ModItems.STONE_STICK)).entries((displayContext, entries) -> {
                        entries.add(ModItems.STONE_STICK);
                        entries.add(ModItems.STONE_ARROW);

                        entries.add(ModItems.STONE_REPEATER_ITEM);
                        entries.add(ModItems.STONE_COMPARATOR_ITEM);

                        entries.add(ModBlocks.STONE_TORCH);
                        entries.add(ModBlocks.STONE_SOUL_TORCH);
                        entries.add(ModBlocks.STONE_REDSTONE_TORCH);

                        entries.add(ModBlocks.STONE_RAIL);
                        entries.add(ModBlocks.STONE_POWERED_RAIL);
                        entries.add(ModBlocks.STONE_DETECTOR_RAIL);
                        entries.add(ModBlocks.STONE_ACTIVATOR_RAIL);

                        entries.add(ModItems.STONE_WOODEN_AXE);
                        entries.add(ModItems.STONE_WOODEN_HOE);
                        entries.add(ModItems.STONE_WOODEN_PICKAXE);
                        entries.add(ModItems.STONE_WOODEN_SHOVEL);
                        entries.add(ModItems.STONE_WOODEN_SWORD);

                        entries.add(ModItems.STONE_STONE_AXE);
                        entries.add(ModItems.STONE_STONE_HOE);
                        entries.add(ModItems.STONE_STONE_PICKAXE);
                        entries.add(ModItems.STONE_STONE_SHOVEL);
                        entries.add(ModItems.STONE_STONE_SWORD);

                        entries.add(ModItems.STONE_IRON_AXE);
                        entries.add(ModItems.STONE_IRON_HOE);
                        entries.add(ModItems.STONE_IRON_PICKAXE);
                        entries.add(ModItems.STONE_IRON_SHOVEL);
                        entries.add(ModItems.STONE_IRON_SWORD);

                        entries.add(ModItems.STONE_DIAMOND_AXE);
                        entries.add(ModItems.STONE_DIAMOND_HOE);
                        entries.add(ModItems.STONE_DIAMOND_PICKAXE);
                        entries.add(ModItems.STONE_DIAMOND_SHOVEL);
                        entries.add(ModItems.STONE_DIAMOND_SWORD);

                        entries.add(ModItems.STONE_GOLD_AXE);
                        entries.add(ModItems.STONE_GOLD_HOE);
                        entries.add(ModItems.STONE_GOLD_PICKAXE);
                        entries.add(ModItems.STONE_GOLD_SHOVEL);
                        entries.add(ModItems.STONE_GOLD_SWORD);

                        entries.add(ModItems.STONE_NETHERITE_AXE);
                        entries.add(ModItems.STONE_NETHERITE_HOE);
                        entries.add(ModItems.STONE_NETHERITE_PICKAXE);
                        entries.add(ModItems.STONE_NETHERITE_SHOVEL);
                        entries.add(ModItems.STONE_NETHERITE_SWORD);

                        entries.add(ModBlocks.STONE_LADDER);
                        entries.add(ModBlocks.STONE_LEVER);
                        entries.add(ModBlocks.STONE_TRIPWIRE_HOOK);

                    }).build());

    public static void registerItemGroups() {
        BetaOrigins.LOGGER.info("Registering item groups for " + BetaOrigins.MOD_ID);
    }
}
