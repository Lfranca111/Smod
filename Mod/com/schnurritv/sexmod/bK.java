package com.schnurritv.sexmod;

import net.minecraft.util.ResourceLocation;

public class bk extends bE {
  protected ResourceLocation[] a() {
    return new ResourceLocation[] { new ResourceLocation("sexmod", "geo/allie/allie.geo.json"), new ResourceLocation("sexmod", "geo/allie/armored.geo.json"), new ResourceLocation("sexmod", "geo/allie/allie.geo.json") };
  }
  
  public ResourceLocation d(bS parambS) {
    try {
      if (parambS.field_70170_p instanceof com.c)
        return this.b[0]; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (((Integer)parambS.func_184212_Q().func_187225_a(bS.F)).intValue() > this.b.length) {
        System.out.println("Girl doesn't have an outfit Nr." + parambS.func_184212_Q().func_187225_a(bS.F) + " so im just making her nude lol");
        return this.b[0];
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (parambS instanceof bc)
        return this.b[((Integer)parambS.func_184212_Q().func_187225_a(bS.F)).intValue()]; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (((Integer)parambS.func_184212_Q().func_187225_a(bS.F)).intValue() == 1)
        return this.b[2]; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return this.b[0];
  }
  
  public ResourceLocation b() {
    return new ResourceLocation("sexmod", "textures/entity/allie/allie.png");
  }
  
  public ResourceLocation c() {
    return new ResourceLocation("sexmod", "animations/allie/allie.animation.json");
  }
  
  public String[] d() {
    return new String[] { "armorHelmet" };
  }
  
  public String[] g() {
    return new String[] { "armorShoulderR", "armorShoulderL", "armorChest", "armorBoobs" };
  }
  
  public String[] a() {
    return new String[] { "boobsFlesh", "clothes", "clothesR", "clothesL" };
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\bk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */