package com.schnurritv.sexmod;

import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelElytra;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.core.util.Color;
import software.bernie.geckolib3.renderers.geo.GeoLayerRenderer;
import software.bernie.geckolib3.renderers.geo.IGeoRenderer;

public class w extends GeoLayerRenderer {
  private static final ResourceLocation a = new ResourceLocation("textures/entity/elytra.png");
  
  private final ModelElytra b = new ModelElytra();
  
  public w(IGeoRenderer paramIGeoRenderer) {
    super(paramIGeoRenderer);
  }
  
  public void render(EntityLivingBase paramEntityLivingBase, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, Color paramColor) {
    try {
      if (!(paramEntityLivingBase instanceof bA))
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    bA bA = (bA)paramEntityLivingBase;
    ItemStack itemStack = (ItemStack)bA.func_184212_Q().func_187225_a(bA.S);
    EntityPlayer entityPlayer = null;
    if (bA instanceof bo) {
      UUID uUID = ((bo)bA).d();
      if (uUID != null)
        entityPlayer = paramEntityLivingBase.field_70170_p.func_152378_a(uUID); 
    } 
    try {
      if (itemStack.func_77973_b() != Items.field_185160_cR)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    GlStateManager.func_179131_c(1.0F, 1.0F, 1.0F, 1.0F);
    GlStateManager.func_179147_l();
    GlStateManager.func_187401_a(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
    (Minecraft.func_71410_x().func_175598_ae()).field_78724_e.func_110577_a(a);
    GlStateManager.func_179094_E();
    GlStateManager.func_179109_b(0.0F, 0.0F, 0.125F);
    float f = a();
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      this.b.func_78087_a(paramFloat1, paramFloat2, paramFloat4, paramFloat5, paramFloat6, f, (entityPlayer == null) ? (Entity)paramEntityLivingBase : (Entity)entityPlayer);
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.b.func_78088_a((entityPlayer == null) ? (Entity)paramEntityLivingBase : (Entity)entityPlayer, paramFloat1, paramFloat2, paramFloat4, paramFloat5, paramFloat6, f);
    GlStateManager.func_179084_k();
    GlStateManager.func_179121_F();
  }
  
  public float a() {
    GlStateManager.func_179091_B();
    GlStateManager.func_179152_a(-1.0F, -1.0F, 1.0F);
    GlStateManager.func_179109_b(0.0F, -1.501F, 0.0F);
    return 0.0625F;
  }
  
  public void func_177141_a(EntityLivingBase paramEntityLivingBase, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7) {}
  
  public boolean func_177142_b() {
    return false;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\w.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */