package com.schnurritv.sexmod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class bd extends GuiScreen {
  private static boolean e = false;
  
  private static double b = 0.0D;
  
  static ResourceLocation a = new ResourceLocation("sexmod", "textures/gui/transitionscreen.png");
  
  static ResourceLocation d = new ResourceLocation("sexmod", "textures/gui/mirroredtransitionscreen.png");
  
  static ResourceLocation c = new ResourceLocation("sexmod", "textures/gui/blackscreen.png");
  
  public static boolean a() {
    return e;
  }
  
  public static void b() {
    e = true;
  }
  
  public boolean func_73868_f() {
    return false;
  }
  
  @SubscribeEvent
  public void a(RenderGameOverlayEvent paramRenderGameOverlayEvent) {
    float f;
    try {
      if (!e)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramRenderGameOverlayEvent.getType() != RenderGameOverlayEvent.ElementType.TEXT)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Minecraft minecraft = Minecraft.func_71410_x();
    b += (minecraft.func_193989_ak() * 0.75F);
    int i = minecraft.field_71474_y.field_74335_Z;
    if (i == 1) {
      f = (float)aH.b(-1800.0D, 1000.0D, 0.5D * Math.cos(b / 25.0D) + 0.5D);
    } else if (i == 2) {
      f = (float)aH.b(-900.0D, 750.0D, 0.5D * Math.cos(b / 25.0D) + 0.5D);
    } else {
      f = (float)aH.b(-900.0D, 600.0D, 0.5D * Math.cos(b / 25.0D) + 0.5D);
    } 
    try {
      GlStateManager.func_179094_E();
      if (i == 1)
        GlStateManager.func_179152_a(2.0F, 2.0F, 2.0F); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (i == 2)
        GlStateManager.func_179139_a(1.5D, 1.5D, 1.5D); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      minecraft.field_71446_o.func_110577_a(a);
      func_175174_a(f, 0.0F, 0, (int)(b * 1.5D), 256, 256);
      func_175174_a(f, 256.0F, 0, (int)(b * 1.5D), 256, 256);
      func_175174_a(f, 512.0F, 0, (int)(b * 1.5D), 256, 256);
      minecraft.field_71446_o.func_110577_a(d);
      func_175174_a(f + 600.0F, 0.0F, 0, (int)(b * 1.5D), 256, 256);
      func_175174_a(f + 600.0F, 256.0F, 0, (int)(b * 1.5D), 256, 256);
      func_175174_a(f + 600.0F, 512.0F, 0, (int)(b * 1.5D), 256, 256);
      minecraft.field_71446_o.func_110577_a(c);
      func_175174_a(f + 200.0F, 0.0F, 0, 0, 400, 256);
      func_175174_a(f + 200.0F, 256.0F, 0, 0, 400, 256);
      func_175174_a(f + 200.0F, 512.0F, 0, 0, 400, 256);
      if (b > 30.0D)
        cG.a(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (b > 69.0D) {
        b = 0.0D;
        e = false;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    GlStateManager.func_179121_F();
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\bd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */