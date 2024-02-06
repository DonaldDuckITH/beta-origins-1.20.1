package net.donaldduckith.betaorigins.item;

import net.donaldduckith.betaorigins.BetaOrigins;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item STONE_STICK = registerItem("stone_stick", new Item(new FabricItemSettings()));
    public static final Item STONE_ARROW = registerItem("stone_arrow", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BetaOrigins.MOD_ID, name), item);
    }
    public static void registerModItems() {
        BetaOrigins.LOGGER.info("Registering mod items for " + BetaOrigins.MOD_ID);
    }
}
