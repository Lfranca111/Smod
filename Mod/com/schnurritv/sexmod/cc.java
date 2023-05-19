package com.schnurritv.sexmod;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class cc extends RenderLiving<cE> {
  private static final ResourceLocation a = new ResourceLocation("textures/entity/slime/slime.png");
  
  public cc(RenderManager paramRenderManager) {
    super(paramRenderManager, new af(), 0.25F);
    func_177094_a(new aE(this));
  }
  
  public void a(cE paramcE, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    this.field_76989_e = 0.25F * paramcE.e();
    super.func_76986_a(paramcE, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  protected void a(cE paramcE, float paramFloat) {
    float f1 = 0.999F;
    GlStateManager.func_179152_a(0.999F, 0.999F, 0.999F);
    float f2 = paramcE.e();
    float f3 = (paramcE.a + (paramcE.g - paramcE.a) * paramFloat) / (f2 * 0.5F + 1.0F);
    float f4 = 1.0F / (f3 + 1.0F);
    GlStateManager.func_179152_a(f4 * f2, 1.0F / f4 * f2, f4 * f2);
  }
  
  protected ResourceLocation a(cE paramcE) {
    return a;
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\cc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */