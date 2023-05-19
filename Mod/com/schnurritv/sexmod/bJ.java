package com.schnurritv.sexmod;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.core.AnimationState;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.AnimationProcessor;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class bj extends bE {
  static final float c = 1.2F;
  
  static final float d = 1.0F;
  
  protected ResourceLocation[] a() {
    return new ResourceLocation[] { new ResourceLocation("sexmod", "geo/kobold/kobold.geo.json"), new ResourceLocation("sexmod", "geo/kobold/armored.geo.json") };
  }
  
  public ResourceLocation b() {
    return new ResourceLocation("sexmod", "textures/entity/kobold/kobold.png");
  }
  
  public ResourceLocation c() {
    return new ResourceLocation("sexmod", "animations/kobold/kobold.animation.json");
  }
  
  public void a(bS parambS, Integer paramInteger, AnimationEvent paramAnimationEvent) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: aload_3
    //   4: invokespecial a : (Lcom/schnurritv/sexmod/bS;Ljava/lang/Integer;Lsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   7: aload_1
    //   8: getfield field_70170_p : Lnet/minecraft/world/World;
    //   11: instanceof com/c
    //   14: ifeq -> 22
    //   17: return
    //   18: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   21: athrow
    //   22: aload_0
    //   23: invokevirtual getAnimationProcessor : ()Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;
    //   26: astore #4
    //   28: aload_1
    //   29: getfield l : Z
    //   32: ifne -> 130
    //   35: aload_1
    //   36: instanceof com/schnurritv/sexmod/b3
    //   39: ifeq -> 130
    //   42: goto -> 49
    //   45: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   48: athrow
    //   49: aload #4
    //   51: ldc 'crown'
    //   53: invokevirtual getBone : (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
    //   56: aload_1
    //   57: invokevirtual func_184212_Q : ()Lnet/minecraft/network/datasync/EntityDataManager;
    //   60: getstatic com/schnurritv/sexmod/b3.aN : Lnet/minecraft/network/datasync/DataParameter;
    //   63: invokevirtual func_187225_a : (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
    //   66: checkcast java/lang/Boolean
    //   69: invokevirtual booleanValue : ()Z
    //   72: ifne -> 90
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   81: athrow
    //   82: iconst_1
    //   83: goto -> 91
    //   86: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   89: athrow
    //   90: iconst_0
    //   91: invokeinterface setHidden : (Z)V
    //   96: aload #4
    //   98: ldc 'egg'
    //   100: invokevirtual getBone : (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
    //   103: aload_1
    //   104: checkcast com/schnurritv/sexmod/b3
    //   107: getfield P : Z
    //   110: ifne -> 121
    //   113: iconst_1
    //   114: goto -> 122
    //   117: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   120: athrow
    //   121: iconst_0
    //   122: invokeinterface setHidden : (Z)V
    //   127: goto -> 156
    //   130: aload #4
    //   132: ldc 'crown'
    //   134: invokevirtual getBone : (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
    //   137: iconst_1
    //   138: invokeinterface setHidden : (Z)V
    //   143: aload #4
    //   145: ldc 'egg'
    //   147: invokevirtual getBone : (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
    //   150: iconst_1
    //   151: invokeinterface setHidden : (Z)V
    //   156: aload_1
    //   157: invokestatic a : (Lcom/schnurritv/sexmod/bS;)[Ljava/lang/String;
    //   160: astore #5
    //   162: aload_0
    //   163: aload #4
    //   165: aload #5
    //   167: iconst_0
    //   168: aaload
    //   169: invokevirtual b : (Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;Ljava/lang/String;)V
    //   172: aload_0
    //   173: aload #4
    //   175: aload #5
    //   177: iconst_1
    //   178: aaload
    //   179: invokevirtual d : (Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;Ljava/lang/String;)V
    //   182: aload_0
    //   183: aload #4
    //   185: aload #5
    //   187: iconst_2
    //   188: aaload
    //   189: ldc 0.75
    //   191: ldc 1.35
    //   193: iconst_3
    //   194: anewarray java/lang/String
    //   197: dup
    //   198: iconst_0
    //   199: ldc 'boobL'
    //   201: aastore
    //   202: dup
    //   203: iconst_1
    //   204: ldc 'boobR'
    //   206: aastore
    //   207: dup
    //   208: iconst_2
    //   209: ldc 'armorBoobs'
    //   211: aastore
    //   212: invokevirtual a : (Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;Ljava/lang/String;FF[Ljava/lang/String;)V
    //   215: aload_0
    //   216: aload #4
    //   218: aload #5
    //   220: iconst_3
    //   221: aaload
    //   222: fconst_1
    //   223: ldc 1.2
    //   225: iconst_2
    //   226: anewarray java/lang/String
    //   229: dup
    //   230: iconst_0
    //   231: ldc 'eyeL'
    //   233: aastore
    //   234: dup
    //   235: iconst_1
    //   236: ldc 'eyeR'
    //   238: aastore
    //   239: invokevirtual a : (Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;Ljava/lang/String;FF[Ljava/lang/String;)V
    //   242: aload_0
    //   243: aload #4
    //   245: aload #5
    //   247: iconst_3
    //   248: aaload
    //   249: fconst_1
    //   250: ldc 1.2
    //   252: invokevirtual a : (Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;Ljava/lang/String;FF)V
    //   255: aload_0
    //   256: aload #4
    //   258: aload #5
    //   260: iconst_4
    //   261: aaload
    //   262: invokevirtual c : (Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;Ljava/lang/String;)V
    //   265: aload_0
    //   266: aload #4
    //   268: aload #5
    //   270: iconst_5
    //   271: aaload
    //   272: invokevirtual e : (Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;Ljava/lang/String;)V
    //   275: aload_0
    //   276: aload_1
    //   277: aload #4
    //   279: aload #5
    //   281: bipush #6
    //   283: aaload
    //   284: invokevirtual a : (Lcom/schnurritv/sexmod/bS;Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;Ljava/lang/String;)V
    //   287: getstatic com/schnurritv/sexmod/bj$a.a : [I
    //   290: aload_1
    //   291: invokevirtual o : ()Lcom/schnurritv/sexmod/m;
    //   294: invokevirtual ordinal : ()I
    //   297: iaload
    //   298: tableswitch default -> 348, 1 -> 328, 2 -> 328, 3 -> 328, 4 -> 328
    //   328: aload #4
    //   330: ldc 'tounge'
    //   332: invokevirtual getBone : (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
    //   335: iconst_0
    //   336: invokeinterface setHidden : (Z)V
    //   341: goto -> 361
    //   344: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   347: athrow
    //   348: aload #4
    //   350: ldc 'tounge'
    //   352: invokevirtual getBone : (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
    //   355: iconst_1
    //   356: invokeinterface setHidden : (Z)V
    //   361: aload_0
    //   362: aload_1
    //   363: aload #4
    //   365: invokevirtual b : (Lcom/schnurritv/sexmod/bS;Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;)V
    //   368: return
    // Exception table:
    //   from	to	target	type
    //   0	18	18	java/lang/RuntimeException
    //   28	42	45	java/lang/RuntimeException
    //   35	75	78	java/lang/RuntimeException
    //   49	86	86	java/lang/RuntimeException
    //   91	117	117	java/lang/RuntimeException
    //   162	344	344	java/lang/RuntimeException
  }
  
  void b(bS parambS, AnimationProcessor paramAnimationProcessor) {
    IBone iBone;
    try {
      if (parambS.k.getAnimationState() != AnimationState.Transitioning)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    float f = ((Float)parambS.func_184212_Q().func_187225_a(b3.aG)).floatValue();
    f = 0.25F - f;
    switch (a.a[parambS.o().ordinal()]) {
      case 2:
      case 3:
      case 4:
        iBone = paramAnimationProcessor.getBone("body");
        iBone.setPositionZ(11.43F + f * -7.0F);
        return;
      case 5:
      case 6:
      case 7:
      case 8:
        iBone = paramAnimationProcessor.getBone("body");
        iBone.setPositionX(1.78F + f * -1.5F);
        iBone.setPositionY(13.07F + f * -11.0F);
        iBone.setPositionZ(2.05F + f * -8.0F);
        return;
      case 9:
      case 10:
      case 11:
      case 12:
        iBone = paramAnimationProcessor.getBone("body");
        iBone.setPositionX(0.0F);
        iBone.setPositionY(2.85F);
        iBone.setPositionZ(-7.0F + f * 4.7F);
        return;
    } 
  }
  
  void a(bS parambS, AnimationProcessor paramAnimationProcessor, String paramString) {
    int i = Integer.parseInt(paramString);
    IBone iBone1 = paramAnimationProcessor.getBone("backpack");
    IBone iBone2 = paramAnimationProcessor.getBone("tailpack");
    try {
      switch (i) {
        case 0:
          iBone1.setHidden(false);
          iBone2.setHidden(true);
          break;
        case 1:
          iBone1.setHidden(false);
          iBone2.setHidden(false);
          break;
        case 2:
          iBone1.setHidden(true);
          iBone2.setHidden(false);
          break;
        case 3:
          iBone1.setHidden(true);
          iBone2.setHidden(true);
          break;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (parambS.o() == m.PAYMENT)
        iBone1.setHidden(false); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  void e(AnimationProcessor paramAnimationProcessor, String paramString) {
    int i = Integer.parseInt(paramString);
    IBone iBone1 = paramAnimationProcessor.getBone("frecklesHR1");
    IBone iBone2 = paramAnimationProcessor.getBone("frecklesHR2");
    IBone iBone3 = paramAnimationProcessor.getBone("frecklesHL1");
    IBone iBone4 = paramAnimationProcessor.getBone("frecklesHL2");
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      iBone3.setHidden((i != 1));
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      iBone1.setHidden((i != 1));
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      iBone4.setHidden((i != 2));
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    iBone2.setHidden((i != 2));
  }
  
  void c(AnimationProcessor paramAnimationProcessor, String paramString) {
    int i = Integer.parseInt(paramString);
    IBone iBone1 = paramAnimationProcessor.getBone("frecklesAR1");
    IBone iBone2 = paramAnimationProcessor.getBone("frecklesAR2");
    IBone iBone3 = paramAnimationProcessor.getBone("frecklesAL1");
    IBone iBone4 = paramAnimationProcessor.getBone("frecklesAL2");
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      iBone3.setHidden((i != 1));
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      iBone1.setHidden((i != 1));
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      iBone4.setHidden((i != 2));
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    iBone2.setHidden((i != 2));
  }
  
  void a(AnimationProcessor paramAnimationProcessor, String paramString, float paramFloat1, float paramFloat2) {
    try {
      if (Minecraft.func_71410_x().func_147113_T())
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    float f = Float.parseFloat(paramString);
    f /= 100.0F;
    f = paramFloat1 + (paramFloat2 - paramFloat1) * f - 1.0F;
    IBone iBone1 = paramAnimationProcessor.getBone("eyeL");
    iBone1.setPositionX(iBone1.getPositionX() + f);
    IBone iBone2 = paramAnimationProcessor.getBone("eyeR");
    iBone2.setPositionX(iBone2.getPositionX() - f);
  }
  
  void a(AnimationProcessor paramAnimationProcessor, String paramString, float paramFloat1, float paramFloat2, String... paramVarArgs) {
    float f = Float.parseFloat(paramString);
    f /= 100.0F;
    f = paramFloat1 + (paramFloat2 - paramFloat1) * f;
    for (String str : paramVarArgs) {
      IBone iBone = paramAnimationProcessor.getBone(str);
      try {
        if (iBone != null) {
          iBone.setScaleX(f);
          iBone.setScaleY(f);
          iBone.setScaleZ(f);
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
  }
  
  void d(AnimationProcessor paramAnimationProcessor, String paramString) {
    List<IBone> list1 = a(paramAnimationProcessor, "hornDL");
    List<IBone> list2 = a(paramAnimationProcessor, "hornDR");
    a(list1);
    a(list2);
    int i = (new Integer(paramString)).intValue();
    paramAnimationProcessor.getBone("hornDL" + i).setHidden(false);
    paramAnimationProcessor.getBone("hornDR" + i).setHidden(false);
  }
  
  void b(AnimationProcessor paramAnimationProcessor, String paramString) {
    List<IBone> list1 = a(paramAnimationProcessor, "hornUL");
    List<IBone> list2 = a(paramAnimationProcessor, "hornUR");
    a(list1);
    a(list2);
    int i = (new Integer(paramString)).intValue();
    paramAnimationProcessor.getBone("hornUL" + i).setHidden(false);
    paramAnimationProcessor.getBone("hornUR" + i).setHidden(false);
  }
  
  List<IBone> a(AnimationProcessor paramAnimationProcessor, String paramString) {
    ArrayList<IBone> arrayList = new ArrayList();
    for (byte b = 0;; b++) {
      IBone iBone = paramAnimationProcessor.getBone(paramString + b);
      try {
        if (iBone == null)
          return arrayList; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      arrayList.add(iBone);
    } 
  }
  
  void a(List<IBone> paramList) {
    for (IBone iBone : paramList)
      iBone.setHidden(true); 
  }
  
  protected void a(bS parambS, AnimationProcessor paramAnimationProcessor, AnimationEvent paramAnimationEvent) {
    try {
      if (parambS.field_70170_p instanceof com.c)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      switch (a.a[parambS.o().ordinal()]) {
        case 13:
          try {
            if (Math.abs(parambS.field_70169_q - parambS.field_70165_t) + Math.abs(parambS.field_70166_s - parambS.field_70161_v) < 0.0D)
              break; 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          try {
            if (parambS.field_70122_E)
              try {
                if (Math.abs(Math.abs(parambS.field_70167_r) - Math.abs(parambS.field_70163_u)) > 0.10000000149011612D)
                  break; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              }  
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          try {
            if (!((aI)parambS).a())
              break; 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
        default:
          return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    EntityModelData entityModelData = paramAnimationEvent.getExtraDataOfType(EntityModelData.class).get(0);
    IBone iBone1 = paramAnimationProcessor.getBone("head");
    try {
      iBone1.setRotationY(entityModelData.netHeadYaw * 0.017453292F);
      iBone1.setRotationX(entityModelData.headPitch * 0.017453292F);
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    IBone iBone2 = (paramAnimationProcessor.getBone("body") == null) ? paramAnimationProcessor.getBone("dd") : paramAnimationProcessor.getBone("body");
    iBone2.setRotationY(0.0F);
  }
  
  public String[] d() {
    return new String[] { "armorHelmet" };
  }
  
  public String[] g() {
    return new String[] { "armorShoulderR", "armorShoulderL", "armorChest", "armorBoobs" };
  }
  
  public String[] a() {
    return new String[] { "boobsFlesh", "upperBodyL", "upperBodyR" };
  }
  
  public String[] e() {
    return new String[] { "armorBootyR", "armorBootyL", "armorPantsLowL", "armorPantsLowR", "armorPantsLowR", "armorPantsUpR", "armorPantsUpL", "armorHip", "armorKneeR", "armorKneeL" };
  }
  
  public String[] c() {
    return new String[] { "fleshL", "fleshR", "vagina", "fuckhole", "curvesL", "curvesR", "kneeL", "kneeR" };
  }
  
  public String[] f() {
    return new String[] { "armorShoesL", "armorShoesR" };
  }
  
  public String[] b() {
    return new String[] { "toesR", "toesL" };
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\bj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */