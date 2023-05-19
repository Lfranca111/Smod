package com.schnurritv.sexmod;

import java.util.HashSet;
import net.minecraft.client.renderer.entity.RenderManager;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class bv extends b0 {
  public bv(RenderManager paramRenderManager, AnimatedGeoModel<T> paramAnimatedGeoModel, double paramDouble) {
    super(paramRenderManager, paramAnimatedGeoModel, paramDouble);
  }
  
  protected HashSet<String> d() {
    HashSet<String> hashSet = super.d();
    hashSet.add("figure");
    return hashSet;
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\bv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */