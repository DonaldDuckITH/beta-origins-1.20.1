package net.donaldduckith.betaorigins.mixin;

import net.donaldduckith.betaorigins.block.ModBlocks;
import net.donaldduckith.betaorigins.util.IRailStateInjector;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.PoweredRailBlock;
import net.minecraft.entity.vehicle.AbstractMinecartEntity;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;

@Mixin(AbstractMinecartEntity.class)
public abstract class MinecartMixin {
    @Inject(method = "moveOnRail", at = @At("HEAD"))
    protected void injectRailState(BlockPos pos, BlockState state) {
        boolean bl;
        boolean bl2;
        if(state.isOf(ModBlocks.STONE_POWERED_RAIL)) {
            bl = state.get(PoweredRailBlock.POWERED);
            bl2 = !bl;
        }
    }
	
}