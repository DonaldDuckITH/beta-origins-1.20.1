package net.donaldduckith.betaorigins.util;

import net.donaldduckith.betaorigins.BetaOrigins;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {

        public static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(BetaOrigins.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> STONE_STICKS_CRAFTABLE =
                createTag("stone_sticks_craftable");
        public static final TagKey<Item> STONE_STICKS_CRAFTING_MATERIALS =
                createTag("stone_sticks_crafting_materials");
        public static final TagKey<Item> REDSTONE_TORCHES =
                createTag("redstone_torches");
        public static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(BetaOrigins.MOD_ID, name));
        }
    }
}
