package com.schnurritv.sexmod;

import java.util.HashMap;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;

public class bu extends bE {
  HashMap<Integer, float[]> c = new a();
  
  protected ResourceLocation[] a() {
    return new ResourceLocation[] { new ResourceLocation("sexmod", "geo/ellie/nude.geo.json"), new ResourceLocation("sexmod", "geo/ellie/dressed.geo.json") };
  }
  
  public ResourceLocation b() {
    return new ResourceLocation("sexmod", "textures/entity/ellie/ellie.png");
  }
  
  public ResourceLocation c() {
    return new ResourceLocation("sexmod", "animations/ellie/ellie.animation.json");
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
    //   22: aload_1
    //   23: instanceof com/schnurritv/sexmod/bo
    //   26: ifeq -> 34
    //   29: return
    //   30: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   33: athrow
    //   34: aload_1
    //   35: invokevirtual o : ()Lcom/schnurritv/sexmod/m;
    //   38: getstatic com/schnurritv/sexmod/m.SITDOWNIDLE : Lcom/schnurritv/sexmod/m;
    //   41: if_acmpeq -> 49
    //   44: return
    //   45: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   48: athrow
    //   49: aload_1
    //   50: getfield field_70170_p : Lnet/minecraft/world/World;
    //   53: aload_1
    //   54: ldc2_w 15.0
    //   57: invokevirtual func_72890_a : (Lnet/minecraft/entity/Entity;D)Lnet/minecraft/entity/player/EntityPlayer;
    //   60: astore #4
    //   62: aload #4
    //   64: ifnonnull -> 72
    //   67: return
    //   68: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   71: athrow
    //   72: aload_0
    //   73: invokevirtual getAnimationProcessor : ()Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;
    //   76: ldc 'head'
    //   78: invokevirtual getBone : (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
    //   81: astore #5
    //   83: aload_1
    //   84: invokevirtual func_174791_d : ()Lnet/minecraft/util/math/Vec3d;
    //   87: aload #4
    //   89: invokevirtual func_174791_d : ()Lnet/minecraft/util/math/Vec3d;
    //   92: invokevirtual func_178788_d : (Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;
    //   95: astore #6
    //   97: aload_1
    //   98: invokevirtual s : ()Ljava/lang/Float;
    //   101: invokevirtual floatValue : ()F
    //   104: invokestatic round : (F)I
    //   107: istore #7
    //   109: iload #7
    //   111: sipush #180
    //   114: if_icmpne -> 243
    //   117: aload #6
    //   119: getfield field_72450_a : D
    //   122: aload #6
    //   124: getfield field_72449_c : D
    //   127: invokestatic atan2 : (DD)D
    //   130: d2f
    //   131: ldc 1.2
    //   133: fmul
    //   134: fstore #8
    //   136: fload #8
    //   138: fconst_0
    //   139: fcmpl
    //   140: ifle -> 160
    //   143: ldc 1.5
    //   145: ldc 3.14
    //   147: fload #8
    //   149: invokestatic min : (FF)F
    //   152: invokestatic max : (FF)F
    //   155: fstore #8
    //   157: goto -> 174
    //   160: ldc -3.14
    //   162: ldc -1.5
    //   164: fload #8
    //   166: invokestatic min : (FF)F
    //   169: invokestatic max : (FF)F
    //   172: fstore #8
    //   174: fload #8
    //   176: ldc 1.5
    //   178: fcmpl
    //   179: ifeq -> 227
    //   182: fload #8
    //   184: ldc 3.14
    //   186: fcmpl
    //   187: ifeq -> 227
    //   190: goto -> 197
    //   193: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   196: athrow
    //   197: fload #8
    //   199: ldc -3.14
    //   201: fcmpl
    //   202: ifeq -> 227
    //   205: goto -> 212
    //   208: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   211: athrow
    //   212: fload #8
    //   214: ldc -1.5
    //   216: fcmpl
    //   217: ifne -> 233
    //   220: goto -> 227
    //   223: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   226: athrow
    //   227: fconst_0
    //   228: fstore #8
    //   230: goto -> 364
    //   233: fload #8
    //   235: ldc 3.0
    //   237: fadd
    //   238: fstore #8
    //   240: goto -> 364
    //   243: aload_0
    //   244: getfield c : Ljava/util/HashMap;
    //   247: iload #7
    //   249: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   252: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   255: checkcast [F
    //   258: iconst_1
    //   259: faload
    //   260: fstore #9
    //   262: aload_0
    //   263: getfield c : Ljava/util/HashMap;
    //   266: iload #7
    //   268: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   271: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   274: checkcast [F
    //   277: iconst_2
    //   278: faload
    //   279: fstore #10
    //   281: aload #6
    //   283: getfield field_72450_a : D
    //   286: aload #6
    //   288: getfield field_72449_c : D
    //   291: invokestatic atan2 : (DD)D
    //   294: aload_0
    //   295: getfield c : Ljava/util/HashMap;
    //   298: iload #7
    //   300: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   303: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   306: checkcast [F
    //   309: iconst_0
    //   310: faload
    //   311: f2d
    //   312: dadd
    //   313: d2f
    //   314: aload_1
    //   315: invokevirtual s : ()Ljava/lang/Float;
    //   318: invokevirtual floatValue : ()F
    //   321: fadd
    //   322: ldc 0.8
    //   324: fmul
    //   325: fstore #8
    //   327: fload #8
    //   329: fload #9
    //   331: fload #10
    //   333: invokestatic b : (FFF)F
    //   336: fstore #8
    //   338: fload #8
    //   340: fload #9
    //   342: fcmpl
    //   343: ifeq -> 361
    //   346: fload #8
    //   348: fload #10
    //   350: fcmpl
    //   351: ifne -> 364
    //   354: goto -> 361
    //   357: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   360: athrow
    //   361: fconst_0
    //   362: fstore #8
    //   364: fload #8
    //   366: fconst_0
    //   367: fcmpl
    //   368: ifne -> 379
    //   371: fconst_0
    //   372: goto -> 401
    //   375: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   378: athrow
    //   379: aload #4
    //   381: getfield field_70163_u : D
    //   384: aload_1
    //   385: getfield field_70163_u : D
    //   388: dsub
    //   389: ldc2_w 0.5
    //   392: dmul
    //   393: d2f
    //   394: ldc -0.75
    //   396: ldc 0.75
    //   398: invokestatic b : (FFF)F
    //   401: fstore #9
    //   403: aload #5
    //   405: fload #8
    //   407: invokeinterface setRotationY : (F)V
    //   412: aload #5
    //   414: fload #9
    //   416: invokeinterface setRotationX : (F)V
    //   421: return
    // Exception table:
    //   from	to	target	type
    //   0	18	18	java/lang/RuntimeException
    //   22	30	30	java/lang/RuntimeException
    //   34	45	45	java/lang/RuntimeException
    //   62	68	68	java/lang/RuntimeException
    //   174	190	193	java/lang/RuntimeException
    //   182	205	208	java/lang/RuntimeException
    //   197	220	223	java/lang/RuntimeException
    //   338	354	357	java/lang/RuntimeException
    //   364	375	375	java/lang/RuntimeException
  }
  
  public String[] d() {
    return new String[] { "armorHelmet" };
  }
  
  public String[] h() {
    return new String[] { "headband" };
  }
  
  public String[] g() {
    return new String[] { "armorShoulderR", "armorShoulderL", "armorChest", "armorBoobs" };
  }
  
  public String[] a() {
    return new String[] { "boobsFlesh", "upperBodyL", "upperBodyR" };
  }
  
  public String[] e() {
    return new String[] { "armorBootyR", "armorBootyL", "armorPantsLowL", "armorPantsLowR", "armorPantsLowR", "armorPantsUpR", "armorPantsUpL", "armorHip" };
  }
  
  public String[] c() {
    return new String[] { "fleshL", "fleshR", "vagina", "hotpants", "slip", "curvesL", "curvesR", "kneeL", "kneeR" };
  }
  
  public String[] f() {
    return new String[] { "armorShoesL", "armorShoesR" };
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  class a extends HashMap<Integer, float[]> {
    a() {
      put(Integer.valueOf(0), new float[] { 0.0F, -1.2F, 1.2F });
      put(Integer.valueOf(-90), new float[] { 2.0F, -71.56F, -68.0F });
      put(Integer.valueOf(90), new float[] { -2.0F, 68.0F, 70.5F });
    }
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\bu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */