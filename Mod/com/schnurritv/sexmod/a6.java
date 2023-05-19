package com.schnurritv.sexmod;

import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class a6 extends GuiContainer {
  static final ResourceLocation c = new ResourceLocation("sexmod", "textures/gui/girlinventory.png");
  
  UUID d;
  
  bS a;
  
  UUID b;
  
  public a6(bS parambS, InventoryPlayer paramInventoryPlayer, UUID paramUUID) {
    super(new A(parambS, paramInventoryPlayer, paramUUID));
    this.d = paramUUID;
    this.a = parambS;
    this.b = paramInventoryPlayer.field_70458_d.getPersistentID();
  }
  
  public void func_73863_a(int paramInt1, int paramInt2, float paramFloat) {
    func_146276_q_();
    super.func_73863_a(paramInt1, paramInt2, paramFloat);
    func_191948_b(paramInt1, paramInt2);
  }
  
  public void func_146281_b() {
    super.func_146281_b();
    for (A a : A.c) {
      if (a.d.equals(this.d)) {
        ItemStack[] arrayOfItemStack = new ItemStack[42];
        (Minecraft.func_71410_x()).field_71439_g.field_71071_by.field_70462_a.toArray((Object[])arrayOfItemStack);
        arrayOfItemStack[36] = a.func_75139_a(0).func_75211_c();
        arrayOfItemStack[37] = a.func_75139_a(1).func_75211_c();
        arrayOfItemStack[38] = a.func_75139_a(2).func_75211_c();
        arrayOfItemStack[39] = a.func_75139_a(3).func_75211_c();
        arrayOfItemStack[40] = a.func_75139_a(4).func_75211_c();
        arrayOfItemStack[41] = a.func_75139_a(5).func_75211_c();
        aV.a.sendToServer(new Q(this.a.N(), this.b, arrayOfItemStack));
      } 
    } 
  }
  
  protected void func_146976_a(float paramFloat, int paramInt1, int paramInt2) {
    GlStateManager.func_179131_c(1.0F, 1.0F, 1.0F, 1.0F);
    this.field_146297_k.field_71446_o.func_110577_a(c);
    func_73729_b(this.field_146294_l / 2 - 88, this.field_146295_m / 2 - 7 - 24, 33, 16, 176, 114);
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\a6.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */