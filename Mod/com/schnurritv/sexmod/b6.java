package com.schnurritv.sexmod;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class b6 extends b0 {
  public b6(RenderManager paramRenderManager, AnimatedGeoModel<T> paramAnimatedGeoModel, double paramDouble) {
    super(paramRenderManager, paramAnimatedGeoModel, paramDouble);
  }
  
  public void a(GeoModel paramGeoModel, bS parambS, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5) {
    bW bW = (bW)parambS;
    try {
      if (parambS.o() == m.NULL)
        try {
          if (!parambS.l)
            return; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    bW.O = (bW.O == 1.0F) ? bW.O : (bW.O - 0.01F);
    paramFloat5 = bW.O;
    try {
      GlStateManager.func_179152_a(paramFloat5, paramFloat5, paramFloat5);
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    GlStateManager.func_179109_b(0.0F, (paramFloat5 == 1.0F) ? 0.0F : (3.0F - paramFloat5 * 3.0F), 0.0F);
    super.a(paramGeoModel, parambS, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5);
  }
  
  protected void a(double paramDouble1, double paramDouble2, double paramDouble3) {
    try {
      if (this.n.o() == m.NULL)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (((bS)this.n).l)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if ((this.n.o()).hideNameTag)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if ((this.g.func_175598_ae()).field_78734_h == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    func_147906_a((Entity)this.n, this.n.H(), paramDouble1, paramDouble2 + this.n.e(), paramDouble3, 300);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\b6.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */