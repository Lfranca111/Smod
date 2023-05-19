package com.schnurritv.sexmod;

import java.util.ArrayList;
import java.util.Collection;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Vec2f;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class bh extends bm {
  static final float M = 8.0F;
  
  static final float I = 1.68F;
  
  static final float K = 5.0F;
  
  static Collection<bh> L = new ArrayList<>();
  
  double E = 0.0D;
  
  double J = 0.0D;
  
  double H = 0.0D;
  
  double G = 0.0D;
  
  float P = 0.0F;
  
  float N = 0.0F;
  
  float R;
  
  float F;
  
  double Q = 0.0D;
  
  double O = 0.0D;
  
  public bh(RenderManager paramRenderManager, AnimatedGeoModel paramAnimatedGeoModel) {
    super(paramRenderManager, paramAnimatedGeoModel);
    L.add(this);
  }
  
  protected void c() {
    GlStateManager.func_179109_b(0.0F, -1.1F, 0.0F);
    GlStateManager.func_179152_a(0.7F, 0.7F, 0.7F);
  }
  
  protected void a(boolean paramBoolean, ItemStack paramItemStack) {
    try {
      super.a(paramBoolean, paramItemStack);
      switch (b.a[paramItemStack.func_77973_b().func_77661_b(paramItemStack).ordinal()]) {
        case 1:
        case 2:
          return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!paramBoolean)
        GlStateManager.func_179114_b(20.0F, 1.0F, 0.0F, 0.0F); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    GlStateManager.func_179137_b(0.0D, 0.05D, 0.0D);
  }
  
  protected void a(boolean paramBoolean) {
    try {
      super.a(paramBoolean);
      if (paramBoolean) {
        GlStateManager.func_179137_b(0.15D, 0.0D, 0.0D);
      } else {
        GlStateManager.func_179137_b(-0.05D, 0.0D, 0.0D);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  protected void a(boolean paramBoolean1, boolean paramBoolean2) {
    try {
      super.a(paramBoolean1, paramBoolean2);
      if (paramBoolean1)
        try {
          if (!paramBoolean2) {
            GlStateManager.func_179137_b(-0.025D, -0.1D, -0.1D);
            GlStateManager.func_179114_b(10.0F, 1.0F, 0.0F, 0.0F);
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
            GlStateManager.func_179137_b(-0.05D, -0.125D, 0.125D);
            GlStateManager.func_179114_b(50.0F, 1.0F, 0.0F, 0.0F);
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  protected void a(String paramString, GeoBone paramGeoBone) {
    try {
      if (((Boolean)this.z.func_184212_Q().func_187225_a(bS.z)).booleanValue())
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if ("tail".equals(paramString))
        a(paramGeoBone, 0.0F, 0.0F, 1.0F); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if ("body".equals(paramString))
        a(paramGeoBone); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.z.o() == m.BOW)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if ("armL".equals(paramString))
        a(paramGeoBone, 0.0F, -0.34906584F, 0.15F); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.z.o() == m.ATTACK)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if ("armR".equals(paramString))
        a(paramGeoBone, 0.0F, 0.34906584F, 0.15F); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  void a(GeoBone paramGeoBone, float paramFloat1, float paramFloat2, float paramFloat3) {
    double d1 = this.E - this.H;
    double d2 = this.J - this.G;
    double d3 = 0.017453292519943295D * this.z.field_70177_z;
    Vec2f vec2f = new Vec2f((float)(d1 * Math.cos(d3) + d2 * Math.sin(d3)), (float)(-d1 * Math.sin(d3) + d2 * Math.cos(d3)));
    this.R = vec2f.field_189983_j * -8.0F;
    this.F = vec2f.field_189982_i * 8.0F;
    this.R = aH.b(this.R, -1.68F, 1.68F);
    this.F = aH.b(this.F, -1.68F, 1.68F);
    this.R = aH.a(this.P, this.R, this.x);
    this.F = aH.a(this.N, this.F, this.x);
    paramGeoBone.setRotationX(paramFloat1 + this.R * paramFloat3);
    paramGeoBone.setRotationZ(paramFloat2 + this.F * paramFloat3);
  }
  
  void a(GeoBone paramGeoBone) {
    double d1 = this.E - this.H;
    double d2 = this.J - this.G;
    try {
      this.O = (Math.abs(d1) + Math.abs(d2)) * 5.0D;
      this.O = aH.b((float)this.O, 0.0F, 1.0F);
      paramGeoBone.setPositionY((float)aH.a(5.0D, 0.0D, aH.b(this.Q, this.O, this.x)));
      if (this.z instanceof bc)
        ((bc)this.z).aq = (float)aH.a(0.30000001192092896D, 0.0D, aH.b(this.Q, this.O, this.x)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  void a() {
    try {
      if (this.z == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      this.P = this.R;
      this.N = this.F;
      this.Q = this.O;
      if (this.z.d() == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    EntityPlayer entityPlayer = ((bS)this.n).field_70170_p.func_152378_a(this.z.d());
    try {
      if (entityPlayer == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.H = this.E;
    this.G = this.J;
    this.E = entityPlayer.field_70165_t;
    this.J = entityPlayer.field_70161_v;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  @EventBusSubscriber
  public static class a {
    @SubscribeEvent
    public void a(TickEvent.ClientTickEvent param1ClientTickEvent) {
      for (bh bh : bh.L)
        bh.a(); 
    }
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\bh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */