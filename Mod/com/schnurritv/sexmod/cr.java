package com.schnurritv.sexmod;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class cr extends GuiScreen {
  List<EntityLivingBase> c = new ArrayList<>();
  
  int a = 0;
  
  static float b = 0.0F;
  
  public cr(HashMap<bB, String> paramHashMap) {
    for (bB bB : bB.values()) {
      try {
        if (!bB.isNpcOnly)
          try {
            Constructor<? extends bS> constructor = bB.npcClass.getConstructor(new Class[] { World.class });
            bS bS = constructor.newInstance(new Object[] { this.field_146297_k.field_71441_e });
            bS.l = true;
            this.c.add(bS);
            String str = paramHashMap.get(bB);
            if (str != null)
              bS.a(bS.f(str)); 
          } catch (Exception exception) {
            exception.printStackTrace();
          }  
      } catch (Exception exception) {
        throw a(null);
      } 
    } 
    this.c.add(this.field_146297_k.field_71439_g);
  }
  
  public void func_73863_a(int paramInt1, int paramInt2, float paramFloat) {
    super.func_73863_a(paramInt1, paramInt2, paramFloat);
    this.field_146292_n.clear();
    a(this.field_146294_l / 2, this.field_146295_m / 2 + 20, 30, this.c.get(this.a));
    this.field_146292_n.add(new GuiButton(1, this.field_146294_l / 2 + 30, this.field_146295_m / 2 - 10, 20, 20, ">"));
    this.field_146292_n.add(new GuiButton(2, this.field_146294_l / 2 - 50, this.field_146295_m / 2 - 10, 20, 20, "<"));
    this.field_146292_n.add(new GuiButton(0, this.field_146294_l / 2 - 30, this.field_146295_m / 2 + 30, 60, 20, "pick"));
  }
  
  protected void func_146284_a(GuiButton paramGuiButton) {
    try {
      if (">".equals(paramGuiButton.field_146126_j))
        try {
          if (++this.a >= this.c.size())
            this.a = 0; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if ("<".equals(paramGuiButton.field_146126_j))
        try {
          if (--this.a < 0)
            this.a = this.c.size() - 1; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    if (paramGuiButton.field_146127_k == 0) {
      aV.a.sendToServer(new cN(bB.a((Entity)this.c.get(this.a))));
      EntityPlayerSP entityPlayerSP = (Minecraft.func_71410_x()).field_71439_g;
      try {
        entityPlayerSP.func_71053_j();
        ((EntityPlayer)entityPlayerSP).eyeHeight = entityPlayerSP.getDefaultEyeHeight();
        if (!((EntityPlayer)entityPlayerSP).field_71075_bZ.field_75101_c)
          ((EntityPlayer)entityPlayerSP).field_71075_bZ.field_75101_c = ((EntityPlayer)entityPlayerSP).field_71075_bZ.field_75098_d; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
  }
  
  public boolean func_73868_f() {
    return false;
  }
  
  public static void a(int paramInt1, int paramInt2, int paramInt3, EntityLivingBase paramEntityLivingBase) {
    float f1 = paramEntityLivingBase.field_70761_aq;
    float f2 = paramEntityLivingBase.field_70177_z;
    float f3 = paramEntityLivingBase.field_70125_A;
    float f4 = paramEntityLivingBase.field_70758_at;
    float f5 = paramEntityLivingBase.field_70759_as;
    try {
      if (!(paramEntityLivingBase instanceof EntityPlayer)) {
        paramEntityLivingBase.field_70165_t = 0.0D;
        paramEntityLivingBase.field_70163_u = 0.0D;
        paramEntityLivingBase.field_70161_v = 0.0D;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    paramEntityLivingBase.field_70761_aq = 0.0F;
    paramEntityLivingBase.field_70177_z = 0.0F;
    paramEntityLivingBase.field_70125_A = 0.0F;
    paramEntityLivingBase.field_70758_at = 0.0F;
    paramEntityLivingBase.field_70759_as = 0.0F;
    float f6 = Minecraft.func_175610_ah();
    if (f6 == 0.0F)
      f6 = 0.1F; 
    b += 60.0F / f6;
    GlStateManager.func_179142_g();
    GlStateManager.func_179094_E();
    GlStateManager.func_179109_b(paramInt1, paramInt2, 50.0F);
    GlStateManager.func_179152_a(-paramInt3, paramInt3, paramInt3);
    GlStateManager.func_179114_b(180.0F, 0.0F, 0.0F, 1.0F);
    GlStateManager.func_179114_b(135.0F, 0.0F, 1.0F, 0.0F);
    RenderHelper.func_74519_b();
    GlStateManager.func_179114_b(-135.0F, 0.0F, 1.0F, 0.0F);
    GlStateManager.func_179114_b(b, 0.0F, 1.0F, 0.0F);
    GlStateManager.func_179109_b(0.0F, 0.0F, 0.0F);
    RenderManager renderManager = Minecraft.func_71410_x().func_175598_ae();
    renderManager.func_178631_a(180.0F);
    renderManager.func_178633_a(false);
    renderManager.func_188391_a((Entity)paramEntityLivingBase, 0.0D, 0.0D, 0.0D, 0.0F, 1.2345679F, false);
    renderManager.func_178633_a(true);
    GlStateManager.func_179121_F();
    RenderHelper.func_74518_a();
    GlStateManager.func_179101_C();
    GlStateManager.func_179138_g(OpenGlHelper.field_77476_b);
    GlStateManager.func_179090_x();
    GlStateManager.func_179138_g(OpenGlHelper.field_77478_a);
    paramEntityLivingBase.field_70761_aq = f1;
    paramEntityLivingBase.field_70177_z = f2;
    paramEntityLivingBase.field_70125_A = f3;
    paramEntityLivingBase.field_70758_at = f4;
    paramEntityLivingBase.field_70759_as = f5;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\cr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */