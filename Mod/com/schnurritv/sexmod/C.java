package com.schnurritv.sexmod;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Base64;
import java.util.stream.Collectors;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.geo.render.built.GeoCube;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class c extends GeoItemRenderer<al> {
  Minecraft a = Minecraft.func_71410_x();
  
  static ResourceLocation b = null;
  
  public c() {
    super(new H());
  }
  
  ResourceLocation a() {
    if (b == null)
      try {
        URL uRL1 = new URL("https://sessionserver.mojang.com/session/minecraft/profile/" + (Minecraft.func_71410_x()).field_71439_g.getPersistentID().toString().replace("-", ""));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRL1.openStream()));
        String str1 = bufferedReader.lines().collect(Collectors.joining());
        int i = str1.indexOf("\"value\" : ");
        int j = i + 11;
        StringBuilder stringBuilder1 = new StringBuilder();
        byte b1 = 0;
        try {
          while (str1.charAt(j + b1) != '"') {
            stringBuilder1.append(str1.charAt(j + b1));
            b1++;
          } 
        } catch (Exception exception) {
          throw a(null);
        } 
        String str2 = new String(Base64.getDecoder().decode(stringBuilder1.toString()));
        int k = str2.indexOf("\"url\" : ");
        int m = k + 9;
        StringBuilder stringBuilder2 = new StringBuilder();
        byte b2 = 0;
        try {
          while (str2.charAt(m + b2) != '"') {
            stringBuilder2.append(str2.charAt(m + b2));
            b2++;
          } 
        } catch (Exception exception) {
          throw a(null);
        } 
        URL uRL2 = new URL(stringBuilder2.toString());
        BufferedImage bufferedImage1 = ImageIO.read(uRL2);
        BufferedImage bufferedImage2 = ImageIO.read(this.a.func_110442_L().func_110536_a((new H()).b(new al())).func_110527_b());
        for (byte b3 = 0; b3 < bufferedImage2.getWidth(); b3++) {
          for (byte b = 0; b < bufferedImage2.getHeight(); b++) {
            int n = bufferedImage1.getRGB(b3, b);
            try {
              if (n != 0)
                bufferedImage2.setRGB(b3, b, n); 
            } catch (Exception exception) {
              throw a(null);
            } 
          } 
        } 
        b = (Minecraft.func_71410_x().func_175598_ae()).field_78724_e.func_110578_a("lamptex", new DynamicTexture(bufferedImage2));
      } catch (Exception exception) {
        b = (new H()).b(new al());
      }  
    return b;
  }
  
  public void a(GeoModel paramGeoModel, al paramal, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5) {
    GlStateManager.func_179129_p();
    GlStateManager.func_179091_B();
    renderEarly(paramal, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5);
    renderLate(paramal, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5);
    BufferBuilder bufferBuilder = Tessellator.func_178181_a().func_178180_c();
    bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181712_l);
    for (GeoBone geoBone : paramGeoModel.topLevelBones)
      a(bufferBuilder, paramal, geoBone, paramFloat2, paramFloat3, paramFloat4, paramFloat5); 
    Tessellator.func_178181_a().func_78381_a();
    renderAfter(paramal, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5);
    GlStateManager.func_179101_C();
    GlStateManager.func_179089_o();
  }
  
  public void a(BufferBuilder paramBufferBuilder, al paramal, GeoBone paramGeoBone, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    try {
      MATRIX_STACK.push();
      MATRIX_STACK.translate(paramGeoBone);
      MATRIX_STACK.moveToPivot(paramGeoBone);
      MATRIX_STACK.rotate(paramGeoBone);
      MATRIX_STACK.scale(paramGeoBone);
      MATRIX_STACK.moveBackFromPivot(paramGeoBone);
      this.a.field_71446_o.func_110577_a(a());
      if (a(paramGeoBone.getName()))
        b(paramBufferBuilder, paramal, paramGeoBone, paramFloat1, paramFloat2, paramFloat3, paramFloat4); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    MATRIX_STACK.pop();
  }
  
  boolean a(String paramString) {
    try {
      if (!paramString.equals("leftArm"))
        try {
          if (!paramString.equals("rightArm"))
            return true; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.a.field_71439_g.getEntityData().func_74767_n("sexmodAllieInUse"))
        try {
          if (this.a.field_71474_y.field_74320_O == 0);
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  void b(BufferBuilder paramBufferBuilder, al paramal, GeoBone paramGeoBone, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    if (!paramGeoBone.isHidden) {
      for (GeoCube geoCube : paramGeoBone.childCubes) {
        MATRIX_STACK.push();
        GlStateManager.func_179094_E();
        renderCube(paramBufferBuilder, geoCube, paramFloat1, paramFloat2, paramFloat3, paramFloat4);
        GlStateManager.func_179121_F();
        MATRIX_STACK.pop();
      } 
      for (GeoBone geoBone : paramGeoBone.childBones)
        a(paramBufferBuilder, paramal, geoBone, paramFloat1, paramFloat2, paramFloat3, paramFloat4); 
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */