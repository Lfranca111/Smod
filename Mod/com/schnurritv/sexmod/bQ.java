package com.schnurritv.sexmod;

import javax.annotation.Nullable;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class bq extends bm {
  float E = 0.0F;
  
  public bq(RenderManager paramRenderManager, AnimatedGeoModel paramAnimatedGeoModel) {
    super(paramRenderManager, paramAnimatedGeoModel);
  }
  
  protected void c() {
    GlStateManager.func_179109_b(0.0F, -1.0F, 0.0F);
    GlStateManager.func_179152_a(0.65F, 0.65F, 0.65F);
  }
  
  protected ItemStack a(@Nullable ItemStack paramItemStack) {
    ItemStack itemStack;
    switch (a.a[this.n.o().ordinal()]) {
      case 1:
      case 2:
        itemStack = ((bg)this.n).U;
        this.n.func_184611_a(EnumHand.MAIN_HAND, itemStack);
        return itemStack;
    } 
    return paramItemStack;
  }
  
  boolean d() {
    return ((Boolean)this.n.func_184212_Q().func_187225_a(bS.z)).booleanValue();
  }
  
  protected void a(String paramString, GeoBone paramGeoBone) {
    try {
      if (Minecraft.func_71410_x().func_147113_T())
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    String str = paramString;
    byte b = -1;
    try {
      switch (str.hashCode()) {
        case 3198432:
          if (str.equals("head"))
            b = 0; 
          break;
        case 2120576361:
          if (str.equals("backHair"))
            b = 1; 
          break;
        case -345841663:
          if (str.equals("frontHairL"))
            b = 2; 
          break;
        case -345841657:
          if (str.equals("frontHairR"))
            b = 3; 
          break;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      switch (b) {
        case 0:
          this.E = paramGeoBone.getRotationX();
          break;
        case 1:
          try {
            if (!d() && this.E > 0.0F) {
              double d = (this.E / aH.b(45.0F));
              float f = (float)aH.b(0.0D, 0.75D, d);
              paramGeoBone.setPositionZ(f);
              paramGeoBone.setPositionY(f);
              paramGeoBone.setRotationX(-this.E);
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          break;
        case 2:
        case 3:
          try {
            if (d())
              break; 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          paramGeoBone.setRotationX(-this.E);
          break;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  protected void a(boolean paramBoolean, ItemStack paramItemStack) {
    try {
      super.a(paramBoolean, paramItemStack);
      switch (a.b[paramItemStack.func_77973_b().func_77661_b(paramItemStack).ordinal()]) {
        case 1:
        case 2:
          return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    GlStateManager.func_179114_b(paramBoolean ? 60.0F : 150.0F, 1.0F, 0.0F, 0.0F);
    GlStateManager.func_179137_b(0.0D, 0.08D, -0.05D);
  }
  
  protected void a(boolean paramBoolean) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      GlStateManager.func_179114_b(paramBoolean ? 60.0F : 150.0F, 1.0F, 0.0F, 0.0F);
      if (paramBoolean)
        GlStateManager.func_179137_b(0.12D, 0.0D, 0.0D); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  protected void a(boolean paramBoolean1, boolean paramBoolean2) {
    try {
      super.a(paramBoolean1, paramBoolean2);
      if (!paramBoolean1)
        try {
          if (paramBoolean2) {
            GlStateManager.func_179114_b(120.0F, 0.0F, 1.0F, 0.0F);
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!paramBoolean1)
        try {
          if (!paramBoolean2) {
            GlStateManager.func_179137_b(0.0D, 0.3D, -0.15D);
            GlStateManager.func_179114_b(-45.0F, 1.0F, 0.0F, 0.0F);
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
            GlStateManager.func_179137_b(-0.025D, -0.05D, 0.0D);
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\bq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */