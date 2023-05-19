package com.schnurritv.sexmod;

import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.IGeoRenderer;

public class b1 extends b0 {
  float w;
  
  public b1(RenderManager paramRenderManager, AnimatedGeoModel<T> paramAnimatedGeoModel, double paramDouble) {
    super(paramRenderManager, paramAnimatedGeoModel, paramDouble);
  }
  
  protected ItemStack a(@Nullable ItemStack paramItemStack) {
    ItemStack itemStack1;
    ItemStack itemStack2;
    Map map;
    switch (a.a[this.n.o().ordinal()]) {
      case 1:
      case 2:
        itemStack1 = ((bg)this.n).U;
        itemStack2 = (ItemStack)this.n.func_184212_Q().func_187225_a(bg.Y);
        try {
          if (itemStack2.equals(ItemStack.field_190927_a))
            return itemStack1; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        map = EnchantmentHelper.func_82781_a(itemStack2);
        EnchantmentHelper.func_82782_a(map, itemStack1);
        this.n.func_184611_a(EnumHand.MAIN_HAND, itemStack1);
        return itemStack1;
    } 
    return paramItemStack;
  }
  
  boolean b() {
    return ((Boolean)this.n.func_184212_Q().func_187225_a(bS.z)).booleanValue();
  }
  
  protected void a(BufferBuilder paramBufferBuilder, String paramString, GeoBone paramGeoBone) {
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
        case -1870254695:
          if (str.equals("sideHairR"))
            b = 2; 
          break;
        case -1870254701:
          if (str.equals("sideHairL"))
            b = 3; 
          break;
        case -345841663:
          if (str.equals("frontHairL"))
            b = 4; 
          break;
        case -345841657:
          if (str.equals("frontHairR"))
            b = 5; 
          break;
        case -1548738978:
          if (str.equals("offhand"))
            b = 6; 
          break;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      double d;
      float f;
      bg bg;
      ItemStack itemStack;
      switch (b) {
        case 0:
          this.w = paramGeoBone.getRotationX();
          break;
        case 1:
          try {
            if (b())
              break; 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          d = (this.w / aH.b(45.0F));
          f = (float)aH.b(0.0D, 0.75D, d);
          paramGeoBone.setPositionZ(f);
          paramGeoBone.setPositionY(f);
          paramGeoBone.setRotationX(-this.w);
          break;
        case 2:
        case 3:
          try {
            if (b())
              break; 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          d = (this.w / aH.b(45.0F));
          f = (float)aH.b(0.0D, 1.2999999523162842D, d);
          paramGeoBone.setPositionZ(-f);
          paramGeoBone.setPositionY(f);
        case 4:
        case 5:
          try {
            if (b())
              break; 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          paramGeoBone.setRotationX(-this.w);
          break;
        case 6:
          bg = (bg)this.n;
          itemStack = (ItemStack)this.n.func_184212_Q().func_187225_a(bg.aj);
          try {
            if (itemStack.equals(ItemStack.field_190927_a))
              break; 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          try {
            if (bg.ai != 1.0F)
              break; 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          GlStateManager.func_179094_E();
          Tessellator.func_178181_a().func_78381_a();
          cB.a(IGeoRenderer.MATRIX_STACK, paramGeoBone);
          GlStateManager.func_179114_b(90.0F, 1.0F, 0.0F, 0.0F);
          GlStateManager.func_179152_a(bg.ae, bg.ae, bg.ae);
          Minecraft.func_71410_x().func_175597_ag().func_178099_a((EntityLivingBase)this.n, itemStack, ItemCameraTransforms.TransformType.THIRD_PERSON_RIGHT_HAND);
          b0.s.func_181668_a(7, DefaultVertexFormats.field_181712_l);
          func_110776_a(Objects.<ResourceLocation>requireNonNull(getEntityTexture((EntityLivingBase)this.n)));
          GlStateManager.func_179121_F();
          break;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\b1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */