package com.schnurritv.sexmod;

import java.io.IOException;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class ay extends GuiScreen {
  static final float a = 100.0F;
  
  static final float e = 15.0F;
  
  static final float k = 5.0F;
  
  static final float d = 0.5F;
  
  static final float j = 0.5F;
  
  static final ResourceLocation c = new ResourceLocation("sexmod", "textures/gui/command.png");
  
  float l = 0.0F;
  
  float b = 0.0F;
  
  float g = 0.0F;
  
  float h = 0.0F;
  
  float f = 0.0F;
  
  bf i;
  
  public ay(bf parambf) {
    this.i = parambf;
  }
  
  public void func_146281_b() {
    try {
      super.func_146281_b();
      if (this.h == 0.0F)
        try {
          if (this.f == 0.0F)
            try {
              if (this.b == 0.0F)
                return; 
            } catch (NullPointerException nullPointerException) {
              throw a(null);
            }  
        } catch (NullPointerException nullPointerException) {
          throw a(null);
        }  
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    try {
      if (this.b > 0.0F) {
        b();
        return;
      } 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    try {
      if (this.h > this.f) {
        d();
      } else {
        c();
      } 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
  }
  
  void d() {
    this.i.f((Minecraft.func_71410_x()).field_71439_g.getPersistentID());
  }
  
  void c() {
    this.i.a((Minecraft.func_71410_x()).field_71439_g.getPersistentID());
  }
  
  void b() {
    try {
      if (this.i.n() != null)
        return; 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    this.i.c(m.START_THROWING);
  }
  
  void a() {
    this.i.f((Minecraft.func_71410_x()).field_71439_g.getPersistentID());
  }
  
  public void func_146282_l() throws IOException {
    try {
      if (ClientProxy.keyBindings[0].func_151463_i() == Keyboard.getEventKey())
        try {
          if (!Keyboard.getEventKeyState()) {
            (Minecraft.func_71410_x()).field_71439_g.func_71053_j();
            return;
          } 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    super.func_146282_l();
  }
  
  public void func_73863_a(int paramInt1, int paramInt2, float paramFloat) {
    super.func_73863_a(paramInt1, paramInt2, paramFloat);
    GL11.glEnable(3042);
    OpenGlHelper.func_148821_a(770, 771, 1, 0);
    GL11.glBlendFunc(770, 771);
    try {
      this.l = Math.min(1.0F, this.l + this.field_146297_k.func_193989_ak() / 5.0F);
    } catch (NullPointerException nullPointerException) {}
    float f1 = (float)a(this.l);
    float f2 = (1.0F - f1) * 100.0F;
    try {
    
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    try {
      this.b += ((paramInt1 < this.field_146294_l / 2) ? true : -1) * this.field_146297_k.func_193989_ak();
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    try {
      this.g += ((paramInt1 > this.field_146294_l / 2) ? true : -1) * this.field_146297_k.func_193989_ak();
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    try {
      this.h += ((paramInt2 < this.field_146295_m / 2 - 1) ? true : -1) * this.field_146297_k.func_193989_ak();
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    try {
      this.f += ((paramInt2 > this.field_146295_m / 2) ? true : -1) * this.field_146297_k.func_193989_ak();
      this.b = aH.b(this.b, 0.0F, 1.0F);
      this.g = aH.b(this.g, 0.0F, 1.0F);
      this.h = aH.b(this.h, 0.0F, 1.0F);
      this.f = aH.b(this.f, 0.0F, 1.0F);
      GlStateManager.func_179094_E();
      GlStateManager.func_179109_b(this.field_146294_l / 2.0F, this.field_146295_m / 2.0F, 0.0F);
      GlStateManager.func_179152_a(f1, f1, f1);
      this.field_146297_k.field_71446_o.func_110577_a(c);
      GlStateManager.func_179094_E();
      GlStateManager.func_179152_a(1.0F + this.b * 0.5F, 1.0F + this.b * 0.5F, 1.0F);
      func_175174_a(-62.0F + f2 - this.b * 15.0F, f2 - 32.0F, 0, 0, 64, 64);
      func_175174_a(-62.0F + f2 - this.b * 15.0F, f2 - 32.0F, 64, 128, 64, 64);
      GlStateManager.func_179121_F();
      GlStateManager.func_179094_E();
      GlStateManager.func_179152_a(1.0F - this.g, 1.0F - this.g, 1.0F);
      func_175174_a(-2.0F - f2 + this.g * 32.0F, -f2 - 32.0F, 0, 0, 64, 64);
      func_175174_a(-2.0F - f2 + this.g * 32.0F, -f2 - 32.0F, 0, 128, 64, 64);
      GlStateManager.func_179121_F();
      if (this.g > 0.0F) {
        GlStateManager.func_179094_E();
        GlStateManager.func_179152_a(-1.0F + this.g + 1.0F + this.h * 0.5F, -1.0F + this.g + 1.0F + this.h * 0.5F, 1.0F);
        func_175174_a(-2.0F - f2 + this.h * 5.0F, -f2 - 64.0F - this.h * 5.0F / 2.0F, 0, 0, 64, 64);
        func_175174_a(-2.0F - f2 + this.h * 5.0F, -f2 - 64.0F - this.h * 5.0F / 2.0F, 128, 128, 64, 64);
        GlStateManager.func_179121_F();
        GlStateManager.func_179094_E();
        GlStateManager.func_179152_a(-1.0F + this.g + 1.0F + this.f * 0.5F, -1.0F + this.g + 1.0F + this.f * 0.5F, 1.0F);
        func_175174_a(-2.0F - f2 + this.f * 5.0F, -f2 + this.f * 5.0F / 2.0F, 0, 0, 64, 64);
        func_175174_a(-2.0F - f2 + this.f * 5.0F, -f2 + this.f * 5.0F / 2.0F, 192, 128, 64, 64);
        GlStateManager.func_179121_F();
      } 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    GlStateManager.func_179121_F();
    GL11.glDisable(3042);
  }
  
  double a(double paramDouble) {
    double d1 = 1.70158D;
    double d2 = d1 + 1.0D;
    return 1.0D + d2 * Math.pow(paramDouble - 1.0D, 3.0D) + d1 * Math.pow(paramDouble - 1.0D, 2.0D);
  }
  
  public boolean func_73868_f() {
    return false;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\ay.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */