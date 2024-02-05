package net.donaldduckith.betaorigins;

import net.donaldduckith.betaorigins.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetaOrigins implements ModInitializer {
	public static final String MOD_ID = "betaorigins";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}