package net.donaldduckith.betaorigins.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.donaldduckith.betaorigins.block.ModBlocks;
import net.minecraft.block.*;
import net.minecraft.entity.vehicle.AbstractMinecartEntity;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(AbstractMinecartEntity.class)
public abstract class AbstractMinecartMixin {

    @ModifyExpressionValue(
            method = "moveOnRail",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/block/BlockState;isOf(Lnet/minecraft/block/Block;)Z")
    )
    protected boolean injectStonePoweredRail(boolean isPoweredRail, BlockPos blockPos, BlockState state) {
        return isPoweredRail || state.isOf(ModBlocks.STONE_POWERED_RAIL);
    }
	
}