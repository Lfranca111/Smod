package com.schnurritv.sexmod;

import java.util.HashSet;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class by extends bm {
  public by(RenderManager paramRenderManager, AnimatedGeoModel paramAnimatedGeoModel) {
    super(paramRenderManager, paramAnimatedGeoModel);
  }
  
  protected void c() {
    GlStateManager.func_179137_b(0.0D, -1.0D, -0.05D);
    GlStateManager.func_179152_a(0.65F, 0.65F, 0.65F);
  }
  
  protected void a(boolean paramBoolean) {
    try {
      super.a(paramBoolean);
      if (paramBoolean)
        GlStateManager.func_179137_b(0.15D, 0.0D, 0.0D); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  protected void a(boolean paramBoolean1, boolean paramBoolean2) {
    try {
      super.a(paramBoolean1, paramBoolean2);
      if (!paramBoolean1)
        try {
          if (!paramBoolean2) {
            GlStateManager.func_179137_b(0.0D, -0.1D, 0.05D);
            GlStateManager.func_179114_b(40.0F, 1.0F, 0.0F, 0.0F);
            GlStateManager.func_179114_b(0.0F, 0.0F, 1.0F, 0.0F);
            GlStateManager.func_179114_b(0.0F, 0.0F, 0.0F, 1.0F);
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramBoolean1)
        try {
          if (!paramBoolean2) {
            GlStateManager.func_179137_b(-0.025D, -0.1D, 0.0D);
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  protected HashSet<String> d() {
    return new a();
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  class a extends HashSet<String> {
    a() {
      add("boobs");
      add("booty");
      add("vagina");
      add("fuckhole");
      add("leaf7");
      add("leaf8");
    }
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\by.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */