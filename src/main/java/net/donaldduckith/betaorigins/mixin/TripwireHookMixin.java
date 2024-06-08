package net.donaldduckith.betaorigins.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import net.donaldduckith.betaorigins.block.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.TripwireHookBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(TripwireHookBlock.class)
public class TripwireHookMixin {

    @ModifyExpressionValue(
            method = "update", at = @At(value = "INVOKE",
            target = "Lnet/minecraft/block/BlockState;isOf(Lnet/minecraft/block/Block;)Z", ordinal = 0))
    protected boolean injectStoneTripwireHook(boolean isTripwireHook, @Local(ordinal = 0) BlockState blockState2) {
        return isTripwireHook || blockState2.isOf(ModBlocks.STONE_TRIPWIRE_HOOK);
    }
}
