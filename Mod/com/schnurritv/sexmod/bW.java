package com.schnurritv.sexmod;

import java.util.HashSet;
import javax.vecmath.Vector3f;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class bw extends bm {
  Vector3f J = new Vector3f(0.0F, 0.0F, 0.0F);
  
  Vector3f G = new Vector3f(0.0F, 0.0F, 0.0F);
  
  Vector3f H = new Vector3f(0.0F, 0.0F, 0.0F);
  
  Vector3f K = new Vector3f(0.0F, 0.0F, 0.0F);
  
  Vector3f I = new Vector3f(0.0F, 0.0F, 0.0F);
  
  Vector3f F = new Vector3f(0.0F, 0.0F, 0.0F);
  
  Vector3f E = new Vector3f(0.0F, 0.0F, 0.0F);
  
  public bw(RenderManager paramRenderManager, AnimatedGeoModel paramAnimatedGeoModel) {
    super(paramRenderManager, paramAnimatedGeoModel);
  }
  
  protected void c() {
    GlStateManager.func_179109_b(0.0F, -1.25F, 0.0F);
    GlStateManager.func_179152_a(0.8F, 0.8F, 0.8F);
  }
  
  protected void a(String paramString, GeoBone paramGeoBone) {
    try {
      if ("slime".equals(paramString)) {
        this.H = new Vector3f(paramGeoBone.getRotationX(), paramGeoBone.getRotationY(), paramGeoBone.getRotationZ());
        this.J = new Vector3f(paramGeoBone.getScaleX(), paramGeoBone.getScaleY(), paramGeoBone.getScaleZ());
        this.G = new Vector3f(paramGeoBone.getPositionX(), paramGeoBone.getPositionY(), paramGeoBone.getPositionZ());
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if ("upperBody".equals(paramString))
        this.F = new Vector3f(paramGeoBone.getRotationX(), paramGeoBone.getRotationY(), paramGeoBone.getRotationZ()); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if ("torso".equals(paramString))
        this.K = new Vector3f(paramGeoBone.getRotationX(), paramGeoBone.getRotationY(), paramGeoBone.getRotationZ()); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if ("head".equals(paramString))
        this.E = new Vector3f(paramGeoBone.getRotationX(), paramGeoBone.getRotationY(), paramGeoBone.getRotationZ()); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if ("boobs".equals(paramString))
        this.I = new Vector3f(paramGeoBone.getRotationX(), paramGeoBone.getRotationY(), paramGeoBone.getRotationZ()); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if ("figure".equals(paramString)) {
        paramGeoBone.setRotationX(this.H.x);
        paramGeoBone.setRotationY(this.H.y);
        paramGeoBone.setRotationZ(this.H.z);
        paramGeoBone.setScaleX(this.J.x);
        paramGeoBone.setScaleY(this.J.y);
        paramGeoBone.setScaleZ(this.J.z);
        paramGeoBone.setPositionX(this.G.x);
        paramGeoBone.setPositionY(this.G.y);
        paramGeoBone.setPositionZ(this.G.z);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if ("dress".equals(paramString)) {
        paramGeoBone.setRotationX(this.F.x);
        paramGeoBone.setRotationY(this.F.y);
        paramGeoBone.setRotationZ(this.F.z);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if ("hat".equals(paramString)) {
        paramGeoBone.setRotationX(this.E.x);
        paramGeoBone.setRotationY(this.E.y);
        paramGeoBone.setRotationZ(this.E.z);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if ("boobsSlime".equals(paramString)) {
        paramGeoBone.setRotationX(this.I.x);
        paramGeoBone.setRotationY(this.I.y);
        paramGeoBone.setRotationZ(this.I.z);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  protected void a(boolean paramBoolean) {
    try {
      super.a(paramBoolean);
      if (paramBoolean) {
        GlStateManager.func_179109_b(0.15F, 0.0F, 0.0F);
      } else {
        GlStateManager.func_179137_b(-0.02D, 0.0D, 0.0D);
        GlStateManager.func_179114_b(90.0F, 1.0F, 0.0F, 0.0F);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  protected HashSet<String> d() {
    HashSet<String> hashSet = super.d();
    hashSet.add("figure");
    return hashSet;
  }
  
  protected void a(boolean paramBoolean1, boolean paramBoolean2) {
    try {
      super.a(paramBoolean1, paramBoolean2);
      if (paramBoolean1)
        try {
          if (!paramBoolean2) {
            GlStateManager.func_179137_b(-0.025D, -0.025D, 0.0D);
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
            GlStateManager.func_179137_b(0.0D, 0.4D, -0.1D);
            GlStateManager.func_179114_b(-30.0F, 1.0F, 0.0F, 0.0F);
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  protected void a(boolean paramBoolean, ItemStack paramItemStack) {
    try {
      super.a(paramBoolean, paramItemStack);
      switch (a.a[paramItemStack.func_77973_b().func_77661_b(paramItemStack).ordinal()]) {
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
    GlStateManager.func_179114_b(paramBoolean ? 30.0F : 135.0F, 1.0F, 0.0F, 0.0F);
    GlStateManager.func_179137_b(0.0D, 0.05D, -0.05D);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\bw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */