package net.donaldduckith.betaorigins;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.donaldduckith.betaorigins.block.ModBlocks;

@Environment(EnvType.CLIENT)
public class BetaOriginsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
    }

}
