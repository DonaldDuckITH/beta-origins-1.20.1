package net.donaldduckith.betaorigins.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import net.donaldduckith.betaorigins.block.ModBlocks;
import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.vehicle.AbstractMinecartEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(AbstractMinecartEntity.class)
public abstract class AbstractMinecartMixin {

    @ModifyExpressionValue(
            method = "moveOnRail", at = @At(value = "INVOKE",
            target = "Lnet/minecraft/block/BlockState;isOf(Lnet/minecraft/block/Block;)Z"))
    protected boolean injectStonePoweredRail(boolean isPoweredRail, BlockPos blockPos, BlockState state) {
        return isPoweredRail || state.isOf(ModBlocks.STONE_POWERED_RAIL);
    }

    @ModifyExpressionValue(
            method = "tick", at = @At(value = "INVOKE",
            target = "Lnet/minecraft/block/BlockState;isOf(Lnet/minecraft/block/Block;)Z"))
    private boolean injectStoneActivatorRail(boolean isActivatorRail, @Local BlockState state) {
        return isActivatorRail || state.isOf(ModBlocks.STONE_ACTIVATOR_RAIL);
    }
}