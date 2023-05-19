package com.schnurritv.sexmod;

import javax.annotation.Nullable;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ak extends AnimatedGeoModel<cX> {
  public ResourceLocation b(cX paramcX) {
    try {
      if (paramcX.f)
        return new ResourceLocation("sexmod", "geo/cross.geo.json"); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return ai.h(paramcX.a());
  }
  
  public ResourceLocation c(cX paramcX) {
    try {
      if (paramcX.f)
        return new ResourceLocation("sexmod", "textures/cross.png"); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return ai.l(paramcX.a());
  }
  
  public ResourceLocation a(cX paramcX) {
    return new ResourceLocation("sexmod", "animations/slime/slime.animation.json");
  }
  
  public void a(cX paramcX, Integer paramInteger, @Nullable AnimationEvent paramAnimationEvent) {}
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\ak.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */