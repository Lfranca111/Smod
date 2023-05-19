package com.schnurritv.sexmod;

import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.AnimationProcessor;
import software.bernie.geckolib3.core.processor.IBone;

public class bl extends bE {
  final float d = 60.0F;
  
  Minecraft c = Minecraft.func_71410_x();
  
  protected ResourceLocation[] a() {
    return new ResourceLocation[] { new ResourceLocation("sexmod", "geo/goblin/goblin.geo.json"), new ResourceLocation("sexmod", "geo/goblin/armored.geo.json") };
  }
  
  public ResourceLocation b() {
    return new ResourceLocation("sexmod", "textures/entity/goblin/goblin.png");
  }
  
  public ResourceLocation c() {
    return new ResourceLocation("sexmod", "animations/goblin/goblin.animation.json");
  }
  
  protected boolean a(bS parambS) {
    try {
      if (!(parambS instanceof bf))
        return super.a(parambS); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    bf bf = (bf)parambS;
    UUID uUID = bf.n();
    if (uUID == null)
      uUID = bf.m(); 
    try {
      if (uUID == null)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    World world = bf.field_70170_p;
    AbstractClientPlayer abstractClientPlayer = (AbstractClientPlayer)world.func_152378_a(uUID);
    try {
      if (abstractClientPlayer == null)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return "default".equals(abstractClientPlayer.func_175154_l());
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
    //   29: instanceof com/schnurritv/sexmod/bf
    //   32: istore #5
    //   34: aload #4
    //   36: ldc 'preggy'
    //   38: invokevirtual getBone : (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
    //   41: astore #6
    //   43: aload #6
    //   45: aload_1
    //   46: invokevirtual func_184212_Q : ()Lnet/minecraft/network/datasync/EntityDataManager;
    //   49: getstatic com/schnurritv/sexmod/bf.N : Lnet/minecraft/network/datasync/DataParameter;
    //   52: invokevirtual func_187225_a : (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
    //   55: checkcast java/lang/Boolean
    //   58: invokevirtual booleanValue : ()Z
    //   61: ifne -> 72
    //   64: iconst_1
    //   65: goto -> 73
    //   68: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   71: athrow
    //   72: iconst_0
    //   73: invokeinterface setHidden : (Z)V
    //   78: aload #4
    //   80: ldc 'body'
    //   82: invokevirtual getBone : (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
    //   85: astore #7
    //   87: aload #4
    //   89: ldc 'head'
    //   91: invokevirtual getBone : (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
    //   94: astore #8
    //   96: aload_1
    //   97: invokevirtual o : ()Lcom/schnurritv/sexmod/m;
    //   100: astore #9
    //   102: aload #9
    //   104: getstatic com/schnurritv/sexmod/m.BREEDING_SLOW_2 : Lcom/schnurritv/sexmod/m;
    //   107: if_acmpeq -> 140
    //   110: aload #9
    //   112: getstatic com/schnurritv/sexmod/m.BREEDING_FAST_2 : Lcom/schnurritv/sexmod/m;
    //   115: if_acmpeq -> 140
    //   118: goto -> 125
    //   121: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   124: athrow
    //   125: aload #9
    //   127: getstatic com/schnurritv/sexmod/m.BREEDING_CUM_2 : Lcom/schnurritv/sexmod/m;
    //   130: if_acmpne -> 184
    //   133: goto -> 140
    //   136: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   139: athrow
    //   140: aload_0
    //   141: getfield c : Lnet/minecraft/client/Minecraft;
    //   144: getfield field_71474_y : Lnet/minecraft/client/settings/GameSettings;
    //   147: getfield field_74320_O : I
    //   150: ifne -> 184
    //   153: goto -> 160
    //   156: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   159: athrow
    //   160: aload #7
    //   162: aload #7
    //   164: invokeinterface getPositionY : ()F
    //   169: ldc 1.5
    //   171: fadd
    //   172: invokeinterface setPositionY : (F)V
    //   177: goto -> 184
    //   180: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   183: athrow
    //   184: iload #5
    //   186: ifne -> 194
    //   189: return
    //   190: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   193: athrow
    //   194: aload_1
    //   195: checkcast com/schnurritv/sexmod/bf
    //   198: astore #10
    //   200: aload #9
    //   202: getstatic com/schnurritv/sexmod/m.AWAIT_PICK_UP : Lcom/schnurritv/sexmod/m;
    //   205: if_acmpeq -> 223
    //   208: aload #9
    //   210: getstatic com/schnurritv/sexmod/m.VANISH : Lcom/schnurritv/sexmod/m;
    //   213: if_acmpne -> 240
    //   216: goto -> 223
    //   219: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   222: athrow
    //   223: aload_0
    //   224: aload #10
    //   226: aload #7
    //   228: aload #8
    //   230: invokevirtual a : (Lcom/schnurritv/sexmod/bf;Lsoftware/bernie/geckolib3/core/processor/IBone;Lsoftware/bernie/geckolib3/core/processor/IBone;)V
    //   233: goto -> 240
    //   236: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   239: athrow
    //   240: aload #9
    //   242: getstatic com/schnurritv/sexmod/m.SIT : Lcom/schnurritv/sexmod/m;
    //   245: if_acmpne -> 263
    //   248: aload_0
    //   249: aload #10
    //   251: aload #8
    //   253: invokevirtual a : (Lcom/schnurritv/sexmod/bf;Lsoftware/bernie/geckolib3/core/processor/IBone;)V
    //   256: goto -> 263
    //   259: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   262: athrow
    //   263: aload #9
    //   265: getstatic com/schnurritv/sexmod/m.START_THROWING : Lcom/schnurritv/sexmod/m;
    //   268: if_acmpne -> 329
    //   271: aload_0
    //   272: getfield c : Lnet/minecraft/client/Minecraft;
    //   275: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   278: invokevirtual getPersistentID : ()Ljava/util/UUID;
    //   281: aload #10
    //   283: invokevirtual m : ()Ljava/util/UUID;
    //   286: invokevirtual equals : (Ljava/lang/Object;)Z
    //   289: ifeq -> 316
    //   292: goto -> 299
    //   295: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   298: athrow
    //   299: aload_0
    //   300: aload #7
    //   302: aload #4
    //   304: aload #10
    //   306: invokevirtual b : (Lsoftware/bernie/geckolib3/core/processor/IBone;Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;Lcom/schnurritv/sexmod/bf;)V
    //   309: goto -> 337
    //   312: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   315: athrow
    //   316: aload_0
    //   317: aload #7
    //   319: aload #4
    //   321: aload #10
    //   323: invokevirtual a : (Lsoftware/bernie/geckolib3/core/processor/IBone;Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;Lcom/schnurritv/sexmod/bf;)V
    //   326: goto -> 337
    //   329: aload #7
    //   331: iconst_0
    //   332: invokeinterface setHidden : (Z)V
    //   337: aload #7
    //   339: invokeinterface isHidden : ()Z
    //   344: ifne -> 362
    //   347: aload #9
    //   349: getstatic com/schnurritv/sexmod/m.START_THROWING : Lcom/schnurritv/sexmod/m;
    //   352: if_acmpeq -> 377
    //   355: goto -> 362
    //   358: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   361: athrow
    //   362: aload #9
    //   364: getstatic com/schnurritv/sexmod/m.THROWN : Lcom/schnurritv/sexmod/m;
    //   367: if_acmpne -> 726
    //   370: goto -> 377
    //   373: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   376: athrow
    //   377: aload_1
    //   378: invokevirtual func_174791_d : ()Lnet/minecraft/util/math/Vec3d;
    //   381: aload_1
    //   382: getfield field_70142_S : D
    //   385: aload_1
    //   386: getfield field_70137_T : D
    //   389: aload_1
    //   390: getfield field_70136_U : D
    //   393: invokevirtual func_178786_a : (DDD)Lnet/minecraft/util/math/Vec3d;
    //   396: astore #11
    //   398: new net/minecraft/util/math/Vec3d
    //   401: dup
    //   402: aload #11
    //   404: getfield field_72450_a : D
    //   407: invokestatic abs : (D)D
    //   410: aload #11
    //   412: getfield field_72448_b : D
    //   415: invokestatic abs : (D)D
    //   418: aload #11
    //   420: getfield field_72449_c : D
    //   423: invokestatic abs : (D)D
    //   426: invokespecial <init> : (DDD)V
    //   429: astore #12
    //   431: aload #12
    //   433: getfield field_72450_a : D
    //   436: aload #12
    //   438: getfield field_72450_a : D
    //   441: aload #12
    //   443: getfield field_72448_b : D
    //   446: dadd
    //   447: aload #12
    //   449: getfield field_72449_c : D
    //   452: dadd
    //   453: ddiv
    //   454: dstore #13
    //   456: aload #12
    //   458: getfield field_72448_b : D
    //   461: aload #12
    //   463: getfield field_72450_a : D
    //   466: aload #12
    //   468: getfield field_72448_b : D
    //   471: dadd
    //   472: aload #12
    //   474: getfield field_72449_c : D
    //   477: dadd
    //   478: ddiv
    //   479: dstore #15
    //   481: aload #12
    //   483: getfield field_72449_c : D
    //   486: aload #12
    //   488: getfield field_72450_a : D
    //   491: aload #12
    //   493: getfield field_72448_b : D
    //   496: dadd
    //   497: aload #12
    //   499: getfield field_72449_c : D
    //   502: dadd
    //   503: ddiv
    //   504: dstore #17
    //   506: new net/minecraft/util/math/Vec3d
    //   509: dup
    //   510: aload #11
    //   512: getfield field_72450_a : D
    //   515: dconst_0
    //   516: dcmpl
    //   517: ifle -> 528
    //   520: iconst_1
    //   521: goto -> 529
    //   524: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   527: athrow
    //   528: iconst_m1
    //   529: i2d
    //   530: dload #13
    //   532: dmul
    //   533: aload #11
    //   535: getfield field_72448_b : D
    //   538: dconst_0
    //   539: dcmpl
    //   540: ifle -> 547
    //   543: iconst_1
    //   544: goto -> 548
    //   547: iconst_m1
    //   548: i2d
    //   549: dload #15
    //   551: dmul
    //   552: aload #11
    //   554: getfield field_72449_c : D
    //   557: dconst_0
    //   558: dcmpl
    //   559: ifle -> 566
    //   562: iconst_1
    //   563: goto -> 567
    //   566: iconst_m1
    //   567: i2d
    //   568: dload #17
    //   570: dmul
    //   571: invokespecial <init> : (DDD)V
    //   574: astore #19
    //   576: aload #19
    //   578: getfield field_72448_b : D
    //   581: ldc2_w 2.0
    //   584: ddiv
    //   585: ldc2_w 0.5
    //   588: dadd
    //   589: dstore #20
    //   591: ldc2_w -180.0
    //   594: dconst_0
    //   595: dload #20
    //   597: invokestatic b : (DDD)D
    //   600: d2f
    //   601: fstore #22
    //   603: fload #22
    //   605: invokestatic isNaN : (F)Z
    //   608: ifeq -> 615
    //   611: ldc -90.0
    //   613: fstore #22
    //   615: dload #20
    //   617: ldc2_w 0.5
    //   620: dcmpg
    //   621: ifge -> 632
    //   624: fconst_0
    //   625: goto -> 643
    //   628: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   631: athrow
    //   632: dconst_0
    //   633: ldc2_w 16.0
    //   636: dload #20
    //   638: dneg
    //   639: invokestatic b : (DDD)D
    //   642: d2f
    //   643: fstore #23
    //   645: fload #23
    //   647: invokestatic isNaN : (F)Z
    //   650: ifeq -> 656
    //   653: fconst_0
    //   654: fstore #23
    //   656: ldc2_w 4.0
    //   659: ldc2_w 1.5707963267948966
    //   662: dload #20
    //   664: ldc2_w 2.0
    //   667: dmul
    //   668: ldc2_w 3.141592653589793
    //   671: dmul
    //   672: dadd
    //   673: invokestatic sin : (D)D
    //   676: ldc2_w 4.0
    //   679: dmul
    //   680: dsub
    //   681: d2f
    //   682: fstore #24
    //   684: fload #24
    //   686: invokestatic isNaN : (F)Z
    //   689: ifeq -> 696
    //   692: ldc 8.0
    //   694: fstore #24
    //   696: aload #7
    //   698: fload #22
    //   700: invokestatic b : (F)F
    //   703: invokeinterface setRotationX : (F)V
    //   708: aload #7
    //   710: fload #23
    //   712: invokeinterface setPositionY : (F)V
    //   717: aload #7
    //   719: fload #24
    //   721: invokeinterface setPositionZ : (F)V
    //   726: aload #9
    //   728: getstatic com/schnurritv/sexmod/m.START_THROWING : Lcom/schnurritv/sexmod/m;
    //   731: if_acmpeq -> 749
    //   734: aload #9
    //   736: getstatic com/schnurritv/sexmod/m.PICK_UP : Lcom/schnurritv/sexmod/m;
    //   739: if_acmpne -> 764
    //   742: goto -> 749
    //   745: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   748: athrow
    //   749: aload_0
    //   750: aload #4
    //   752: aload #10
    //   754: invokevirtual a : (Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;Lcom/schnurritv/sexmod/bf;)V
    //   757: goto -> 764
    //   760: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   763: athrow
    //   764: return
    // Exception table:
    //   from	to	target	type
    //   0	18	18	java/lang/RuntimeException
    //   43	68	68	java/lang/RuntimeException
    //   102	118	121	java/lang/RuntimeException
    //   110	133	136	java/lang/RuntimeException
    //   125	153	156	java/lang/RuntimeException
    //   140	177	180	java/lang/RuntimeException
    //   184	190	190	java/lang/RuntimeException
    //   200	216	219	java/lang/RuntimeException
    //   208	233	236	java/lang/RuntimeException
    //   240	256	259	java/lang/RuntimeException
    //   263	292	295	java/lang/RuntimeException
    //   271	312	312	java/lang/RuntimeException
    //   337	355	358	java/lang/RuntimeException
    //   347	370	373	java/lang/RuntimeException
    //   506	524	524	java/lang/RuntimeException
    //   615	628	628	java/lang/RuntimeException
    //   726	742	745	java/lang/RuntimeException
    //   734	757	760	java/lang/RuntimeException
  }
  
  void a(AnimationProcessor paramAnimationProcessor, bf parambf) {
    UUID uUID = parambf.m();
    try {
      if (uUID == null)
        parambf.n(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (uUID == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    EntityPlayer entityPlayer = parambf.field_70170_p.func_152378_a(uUID);
    try {
      if (entityPlayer == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    float f1 = aH.a(entityPlayer.field_184618_aE, entityPlayer.field_70721_aZ, this.c.func_184121_ak());
    float f2 = entityPlayer.field_184619_aG;
    float f3 = (float)Math.sin(f2);
    IBone iBone1 = paramAnimationProcessor.getBone("LeftLeg");
    IBone iBone2 = paramAnimationProcessor.getBone("RightLeg");
    float f4 = aH.b(60.0F * f3 * f1);
    iBone1.setRotationX(f4);
    iBone2.setRotationX(-f4);
  }
  
  void a(bf parambf, IBone paramIBone) {
    EntityPlayer entityPlayer = parambf.field_70170_p.func_72890_a((Entity)parambf, 15.0D);
    try {
      if (entityPlayer == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Vec3d vec3d1 = entityPlayer.func_174791_d();
    Vec3d vec3d2 = parambf.func_174791_d();
    Vec3d vec3d3 = vec3d1.func_178788_d(vec3d2);
    float f1 = parambf.field_70177_z;
    boolean bool = false;
    try {
      switch ((int)f1) {
        case 0:
          try {
          
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          bool = (vec3d1.field_72449_c > vec3d2.field_72449_c) ? true : false;
          break;
        case 180:
          try {
          
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          bool = (vec3d1.field_72449_c < vec3d2.field_72449_c) ? true : false;
          break;
        case 90:
          try {
          
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          bool = (vec3d1.field_72450_a < vec3d2.field_72450_a) ? true : false;
          break;
        case -90:
          try {
          
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          bool = (vec3d1.field_72450_a > vec3d2.field_72450_a) ? true : false;
          break;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!bool) {
        paramIBone.setRotationY(0.0F);
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    float f2 = 0.0F;
    switch ((int)f1) {
      case 180:
        f2 = 90.0F;
        break;
      case 90:
        f2 = 180.0F;
        break;
      case 0:
        f2 = -90.0F;
        break;
    } 
    float f3 = (float)-(MathHelper.func_181159_b(vec3d3.field_72449_c, vec3d3.field_72450_a) * 57.29577951308232D + f2);
    float f4 = aH.b((float)(entityPlayer.func_70047_e() + vec3d1.field_72448_b - parambf.func_70047_e() + vec3d2.field_72448_b), -0.75F, 0.75F);
    paramIBone.setRotationY(aH.b(f3));
    paramIBone.setRotationX(f4);
  }
  
  void a(bf parambf, IBone paramIBone1, IBone paramIBone2) {
    EntityPlayer entityPlayer = parambf.field_70170_p.func_72890_a((Entity)parambf, 15.0D);
    try {
      if (entityPlayer == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Vec3d vec3d1 = entityPlayer.func_174791_d();
    Vec3d vec3d2 = parambf.func_174791_d();
    Vec3d vec3d3 = vec3d1.func_178788_d(vec3d2);
    float f1 = (float)-(Math.atan2(vec3d3.field_72449_c, vec3d3.field_72450_a) * 57.29577951308232D) + 90.0F;
    float f2 = aH.b((float)(entityPlayer.func_70047_e() + vec3d1.field_72448_b - parambf.func_70047_e() + vec3d2.field_72448_b), -0.75F, 0.75F);
    paramIBone1.setRotationY(aH.b(f1));
    paramIBone2.setRotationX(f2);
  }
  
  void a(IBone paramIBone, AnimationProcessor paramAnimationProcessor, bf parambf) {
    try {
      if (parambf.aP) {
        paramIBone.setHidden(true);
      } else {
        paramIBone.setHidden(false);
        paramAnimationProcessor.getBone("steve").setHidden(true);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  void b(IBone paramIBone, AnimationProcessor paramAnimationProcessor, bf parambf) {
    try {
      if (parambf.aP) {
        paramIBone.setHidden(true);
      } else {
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        paramIBone.setHidden((parambf.aw < 15));
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!parambf.aP)
        paramAnimationProcessor.getBone("steve").setHidden(true); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public String[] d() {
    return new String[] { "armorHelmet" };
  }
  
  public String[] g() {
    return new String[] { "armorBoobL", "armorBoobR" };
  }
  
  public String[] a() {
    return new String[] { "nippleL", "nippleR" };
  }
  
  public String[] e() {
    return new String[] { "armorCheekR", "armorCheekL", "armorLegL", "armorLegR", "armorShinL", "armorShinR", "armorTorso" };
  }
  
  public String[] c() {
    return new String[] { "fuckhole", "vagina", "meatCheekR", "meatCheekL", "meatLegL", "meatLegR", "meatShinL", "meatShinR" };
  }
  
  public String[] f() {
    return new String[] { "armorFootL", "armorFootR" };
  }
  
  public String[] b() {
    return new String[] { "meatFootL", "meatFootR" };
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\bl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */