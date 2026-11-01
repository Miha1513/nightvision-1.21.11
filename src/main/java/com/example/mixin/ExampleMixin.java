package net.fabricmc.example.mixin;

import net.minecraft.client.render.LightmapTextureManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LightmapTextureManager.class)
public class ExampleMixin {

	@Inject(method = "getBrightness", at = @At("HEAD"), cancellable = true)
	private static void getBrightness(CallbackInfoReturnable cir) {
		// Делаем яркость 100% всегда
		cir.setReturnValue(1.0f);
	}
}
