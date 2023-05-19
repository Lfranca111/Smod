package com.schnurritv.sexmod;

import java.util.Arrays;
import javax.vecmath.Tuple3f;
import javax.vecmath.Vector3f;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.AnimationProcessor;
import software.bernie.geckolib3.core.processor.IBone;

public class bz extends bE {
  m[] c = new m[] { m.STARTDOGGY, m.DOGGYCUM, m.DOGGYSLOW, m.DOGGYFAST, m.DOGGYCUM, m.DOGGYSTART, m.WAITDOGGY };
  
  protected ResourceLocation[] a() {
    return new ResourceLocation[] { new ResourceLocation("sexmod", "geo/slime/nude.geo.json"), new ResourceLocation("sexmod", "geo/slime/armored.geo.json"), new ResourceLocation("sexmod", "geo/slime/dressed.geo.json") };
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
      if (parambS instanceof bK)
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
    return new ResourceLocation("sexmod", "textures/entity/slime/slime.png");
  }
  
  public ResourceLocation c() {
    return new ResourceLocation("sexmod", "animations/slime/slime.animation.json");
  }
  
  public void a(bS parambS, Integer paramInteger, AnimationEvent paramAnimationEvent) {
    super.a(parambS, paramInteger, paramAnimationEvent);
    AnimationProcessor animationProcessor = getAnimationProcessor();
    try {
      if (!(parambS.field_70170_p instanceof com.c))
        try {
          if (animationProcessor.getBone("bedSlime") != null)
            try {
              if (animationProcessor.getBone("bedSlimeLayer") != null) {
                try {
                
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                } 
                try {
                  animationProcessor.getBone("bedSlime").setHidden(!Arrays.<m>asList(this.c).contains(parambS.o()));
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                } 
                animationProcessor.getBone("bedSlimeLayer").setHidden(!Arrays.<m>asList(this.c).contains(parambS.o()));
              } 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (parambS instanceof bo)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    a(new String[] { "head" }, "hat");
  }
  
  void a(String[] paramArrayOfString, String paramString) {
    AnimationProcessor animationProcessor = getAnimationProcessor();
    IBone iBone = animationProcessor.getBone(paramString);
    IBone[] arrayOfIBone = new IBone[paramArrayOfString.length];
    byte b = 0;
    try {
      while (b < arrayOfIBone.length) {
        arrayOfIBone[b] = animationProcessor.getBone(paramArrayOfString[b]);
        b++;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Vector3f vector3f1 = new Vector3f(0.0F, 0.0F, 0.0F);
    Vector3f vector3f2 = new Vector3f(0.0F, 0.0F, 0.0F);
    for (IBone iBone1 : arrayOfIBone) {
      vector3f1.add((Tuple3f)new Vector3f(iBone1.getRotationX(), iBone1.getRotationY(), iBone1.getRotationZ()));
      vector3f2.add((Tuple3f)new Vector3f(iBone1.getPositionX(), iBone1.getPositionY(), iBone1.getPositionZ()));
    } 
    iBone.setRotationX(vector3f1.x);
    iBone.setRotationY(vector3f1.y);
    iBone.setRotationZ(vector3f1.z);
    iBone.setPositionX(vector3f2.x);
    iBone.setPositionY(vector3f2.y);
    iBone.setPositionZ(vector3f2.z);
    iBone.setPositionZ(vector3f2.z);
  }
  
  public String[] d() {
    return new String[] { "armorHelmet" };
  }
  
  public String[] h() {
    return new String[] { "bigblob" };
  }
  
  public String[] g() {
    return new String[] { "armorShoulderR", "armorShoulderL", "armorChest", "armorBoobs" };
  }
  
  public String[] a() {
    return new String[] { "boobsFlesh", "upperBodyL", "upperBodyR", "cloth" };
  }
  
  public String[] e() {
    return new String[] { "armorBootyR", "armorBootyL", "armorPantsLowL", "armorPantsLowR", "armorPantsLowR", "armorPantsUpR", "armorPantsUpL", "armorHip" };
  }
  
  public String[] c() {
    return new String[] { "fleshL", "fleshR", "vagina", "curvesL", "curvesR", "kneeL", "kneeR" };
  }
  
  public String[] f() {
    return new String[] { "armorShoesL", "armorShoesR" };
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\bz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */