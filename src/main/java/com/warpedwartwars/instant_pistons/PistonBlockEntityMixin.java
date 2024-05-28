package com.warpedwartwars.instant_pistons.mixin;

import com.warpedwartwars.instant_pistons.InstantPistonsMod;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.PistonBlockEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Debug;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import com.llamalad7.mixinextras.sugar.Local;
import com.llamalad7.mixinextras.sugar.ref.LocalFloatRef;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

//@Debug(export = true)
@Mixin(PistonBlockEntity.class)
public abstract class PistonBlockEntityMixin {
	@ModifyVariable(
		method = "tick",
		at = @At("STORE"))
	private static float setf(float f) {
		float f1=f-0.5f+(0.5f/Math.max(InstantPistonsMod.CONFIG.pistonExtendTicks(),1));
		return f1>=0.49999f?1.0f:f1;
	}

	@Inject(
		method = "tick",
		at = @At(value="TAIL"))
	private static void repeattick(World world, BlockPos pos, BlockState state, PistonBlockEntity blockEntity, CallbackInfo ci) {
		if (InstantPistonsMod.CONFIG.pistonExtendTicks() <= 0) {
			PistonBlockEntity.tick(world, pos, state, blockEntity);
		}
	}
}
