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

                        entries.add(ModBlocks.STONE_RAIL);

                    }).build());

    public static void registerItemGroups() {
        BetaOrigins.LOGGER.info("Registering item groups for " + BetaOrigins.MOD_ID);
    }
}
