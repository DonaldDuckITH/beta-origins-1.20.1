package net.donaldduckith.betaorigins;

import net.donaldduckith.betaorigins.block.ModBlocks;
import net.donaldduckith.betaorigins.item.ModItemGroups;
import net.donaldduckith.betaorigins.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetaOrigins implements ModInitializer {
	public static final String MOD_ID = "betaorigins";
	public static final String LOG_MOD_ID = "Beta Origins";
    public static final Logger LOGGER = LoggerFactory.getLogger(LOG_MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}