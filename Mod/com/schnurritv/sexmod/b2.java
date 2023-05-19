package com.schnurritv.sexmod;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import javax.annotation.Nullable;
import javax.vecmath.Vector4f;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.geo.render.built.GeoCube;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class b2 extends bM<bf> {
  static final Vec3i M = new Vec3i(255, 255, 255);
  
  static final float S = -420.69F;
  
  static final float C = 8.0F;
  
  static final float B = 3.0F;
  
  static final Vec3d y = new Vec3d(10.0D, -20.0D, -10.0D);
  
  static final float Q = 0.1F;
  
  static final HashSet<String> P = new HashSet<>(Arrays.asList(new String[] { 
          "meatTorso", "meatCheekR", "meatCheekL", "meatFootR", "meatFootL", "meatShinR", "meatShinL", "meatLegL", "meatLegR", "nippleR", 
          "nippleL", "preggy", "shoeL", "shoeR", "frontAndInside", "Lside", "Rside", "cheekR", "cheekL", "fuckhole", 
          "head", "nose", "neck", "armL", "lowerArmL", "armR", "lowerArmR", "torso", "LegL", "LegR", 
          "shinL", "shinR" }));
  
  static final HashSet<String> N = new HashSet<>(Arrays.asList(new String[] { "lashR", "lashL", "closedR", "closedL", "browL", "browR", "closedL", "closedL" }));
  
  static final HashSet<String> G = new HashSet<>(Arrays.asList(new String[] { "meatLegR", "meatShinR", "meatFootR", "boobR", "boobR1", "boobR2" }));
  
  static Minecraft K;
  
  float J = 0.0F;
  
  boolean z = false;
  
  boolean D = false;
  
  float L = 0.0F;
  
  float E = 0.0F;
  
  float H = 0.0F;
  
  float A = 0.0F;
  
  float F = 0.0F;
  
  float O = 0.0F;
  
  float I = 0.0F;
  
  float R = 0.0F;
  
  public b2(RenderManager paramRenderManager, AnimatedGeoModel paramAnimatedGeoModel, double paramDouble) {
    super(paramRenderManager, paramAnimatedGeoModel, paramDouble);
    K = Minecraft.func_71410_x();
  }
  
  protected ResourceLocation a(bf parambf) throws IOException {
    ResourceLocation resourceLocation;
    UUID uUID = parambf.n();
    if (uUID == null)
      uUID = parambf.m(); 
    try {
      if (parambf.field_70170_p instanceof com.c || uUID == null) {
        resourceLocation = q.get(K.func_110432_I().func_148256_e().getId());
        try {
          if (resourceLocation == null)
            return a(K.func_110432_I().func_148256_e().getId(), parambf.field_70170_p); 
        } catch (IOException iOException) {
          throw b(null);
        } 
      } else {
        resourceLocation = q.get(uUID);
        try {
          if (resourceLocation == null)
            return a(uUID, parambf.field_70170_p); 
        } catch (IOException iOException) {
          throw b(null);
        } 
      } 
    } catch (IOException iOException) {
      throw b(null);
    } 
    return resourceLocation;
  }
  
  public void b(bf parambf, float paramFloat) {
    K.func_175598_ae().func_188391_a((Entity)parambf, 0.0D, 0.0D, 0.0D, -420.69F, paramFloat, false);
  }
  
  private void a(float paramFloat) {
    if (K.func_175606_aa() instanceof EntityPlayer) {
      EntityPlayer entityPlayer = (EntityPlayer)K.func_175606_aa();
      float f1 = entityPlayer.field_70140_Q - entityPlayer.field_70141_P;
      float f2 = -(entityPlayer.field_70140_Q + f1 * paramFloat);
      float f3 = entityPlayer.field_71107_bF + (entityPlayer.field_71109_bG - entityPlayer.field_71107_bF) * paramFloat;
      float f4 = MathHelper.func_76126_a(f2 * 3.1415927F) * f3 * 0.5F;
      GlStateManager.func_179137_b(Math.cos(K.field_71439_g.field_70177_z * 0.017453292519943295D) * f4, Math.abs(MathHelper.func_76134_b(f2 * 3.1415927F) * f3), Math.sin(K.field_71439_g.field_70177_z * 0.017453292519943295D) * f4);
    } 
  }
  
  public void a(GeoModel paramGeoModel, bf parambf, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5) {
    super.a(paramGeoModel, parambf, paramFloat1, paramFloat2, paramFloat3, paramFloat4, parambf.T);
  }
  
  public void func_76979_b(Entity paramEntity, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    try {
      if (!(paramEntity instanceof bf)) {
        super.func_76979_b(paramEntity, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    bf bf = (bf)paramEntity;
    try {
      if (bf.o() != m.PICK_UP)
        try {
          if (bf.o() != m.SHOULDER_IDLE) {
            super.func_76979_b(paramEntity, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
            return;
          } 
          return;
        } catch (RuntimeException runtimeException) {
          throw b(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
  }
  
  Vec3d a(World paramWorld, bf parambf, UUID paramUUID, double paramDouble1, double paramDouble2, double paramDouble3) {
    try {
      if (paramWorld == null)
        return new Vec3d(paramDouble1, paramDouble2, paramDouble3); 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    try {
      if (paramUUID == null)
        return new Vec3d(paramDouble1, paramDouble2, paramDouble3); 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    try {
      if (parambf == null)
        return new Vec3d(paramDouble1, paramDouble2, paramDouble3); 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    EntityPlayer entityPlayer = paramWorld.func_152378_a(paramUUID);
    try {
      if (entityPlayer == null)
        return new Vec3d(paramDouble1, paramDouble2, paramDouble3); 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    Vec3d vec3d1 = entityPlayer.func_174791_d();
    Vec3d vec3d2 = K.field_71439_g.func_174791_d();
    parambf.field_70760_ar = entityPlayer.field_70758_at;
    parambf.field_70761_aq = entityPlayer.field_70759_as;
    parambf.c(m.START_THROWING);
    return vec3d1.func_178788_d(vec3d2);
  }
  
  public void a(bf parambf, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: putfield n : Lcom/schnurritv/sexmod/bS;
    //   5: aload_0
    //   6: ldc -420.69
    //   8: fload #8
    //   10: fcmpl
    //   11: ifne -> 39
    //   14: aload_1
    //   15: invokevirtual o : ()Lcom/schnurritv/sexmod/m;
    //   18: getstatic com/schnurritv/sexmod/m.SHOULDER_IDLE : Lcom/schnurritv/sexmod/m;
    //   21: if_acmpne -> 39
    //   24: goto -> 31
    //   27: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   30: athrow
    //   31: iconst_1
    //   32: goto -> 40
    //   35: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   38: athrow
    //   39: iconst_0
    //   40: putfield z : Z
    //   43: aload_0
    //   44: ldc -420.69
    //   46: fload #8
    //   48: fcmpl
    //   49: ifne -> 77
    //   52: aload_1
    //   53: invokevirtual o : ()Lcom/schnurritv/sexmod/m;
    //   56: getstatic com/schnurritv/sexmod/m.PICK_UP : Lcom/schnurritv/sexmod/m;
    //   59: if_acmpne -> 77
    //   62: goto -> 69
    //   65: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   68: athrow
    //   69: iconst_1
    //   70: goto -> 78
    //   73: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   76: athrow
    //   77: iconst_0
    //   78: putfield D : Z
    //   81: aload_0
    //   82: aload_1
    //   83: getfield field_70170_p : Lnet/minecraft/world/World;
    //   86: aload_1
    //   87: invokevirtual func_180425_c : ()Lnet/minecraft/util/math/BlockPos;
    //   90: iconst_1
    //   91: invokevirtual func_175721_c : (Lnet/minecraft/util/math/BlockPos;Z)I
    //   94: i2f
    //   95: putfield E : F
    //   98: aload_0
    //   99: fload #9
    //   101: putfield J : F
    //   104: aload_0
    //   105: fload #8
    //   107: putfield L : F
    //   110: aload_1
    //   111: invokevirtual o : ()Lcom/schnurritv/sexmod/m;
    //   114: astore #10
    //   116: aload_1
    //   117: invokevirtual m : ()Ljava/util/UUID;
    //   120: astore #11
    //   122: aload_1
    //   123: getfield aP : Z
    //   126: ifeq -> 167
    //   129: aload_0
    //   130: aload_1
    //   131: getfield field_70170_p : Lnet/minecraft/world/World;
    //   134: aload_1
    //   135: aload #11
    //   137: dload_2
    //   138: dload #4
    //   140: dload #6
    //   142: invokevirtual a : (Lnet/minecraft/world/World;Lcom/schnurritv/sexmod/bf;Ljava/util/UUID;DDD)Lnet/minecraft/util/math/Vec3d;
    //   145: astore #12
    //   147: aload #12
    //   149: getfield field_72450_a : D
    //   152: dstore_2
    //   153: aload #12
    //   155: getfield field_72448_b : D
    //   158: dstore #4
    //   160: aload #12
    //   162: getfield field_72449_c : D
    //   165: dstore #6
    //   167: aload #10
    //   169: getstatic com/schnurritv/sexmod/m.THROWN : Lcom/schnurritv/sexmod/m;
    //   172: if_acmpeq -> 190
    //   175: aload #10
    //   177: getstatic com/schnurritv/sexmod/m.START_THROWING : Lcom/schnurritv/sexmod/m;
    //   180: if_acmpne -> 271
    //   183: goto -> 190
    //   186: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   189: athrow
    //   190: getstatic com/schnurritv/sexmod/b2.K : Lnet/minecraft/client/Minecraft;
    //   193: getfield field_71474_y : Lnet/minecraft/client/settings/GameSettings;
    //   196: getfield field_74320_O : I
    //   199: ifne -> 243
    //   202: goto -> 209
    //   205: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   208: athrow
    //   209: fload #8
    //   211: ldc -420.69
    //   213: fcmpl
    //   214: ifne -> 243
    //   217: goto -> 224
    //   220: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   223: athrow
    //   224: aload_1
    //   225: getfield aP : Z
    //   228: ifne -> 243
    //   231: goto -> 238
    //   234: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   237: athrow
    //   238: return
    //   239: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   242: athrow
    //   243: aload_1
    //   244: getfield aP : Z
    //   247: ifne -> 271
    //   250: aload_1
    //   251: invokevirtual s : ()Ljava/lang/Float;
    //   254: invokevirtual floatValue : ()F
    //   257: fstore #12
    //   259: aload_1
    //   260: fload #12
    //   262: putfield field_70760_ar : F
    //   265: aload_1
    //   266: fload #12
    //   268: putfield field_70761_aq : F
    //   271: aload_1
    //   272: aload #10
    //   274: invokestatic a : (Lcom/schnurritv/sexmod/bf;Lcom/schnurritv/sexmod/m;)Z
    //   277: ifeq -> 653
    //   280: getstatic com/schnurritv/sexmod/b2.K : Lnet/minecraft/client/Minecraft;
    //   283: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   286: invokevirtual getPersistentID : ()Ljava/util/UUID;
    //   289: aload #11
    //   291: invokevirtual equals : (Ljava/lang/Object;)Z
    //   294: ifeq -> 472
    //   297: goto -> 304
    //   300: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   303: athrow
    //   304: ldc -420.69
    //   306: fload #8
    //   308: fcmpl
    //   309: ifeq -> 324
    //   312: goto -> 319
    //   315: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   318: athrow
    //   319: return
    //   320: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   323: athrow
    //   324: aload_1
    //   325: getstatic com/schnurritv/sexmod/b2.K : Lnet/minecraft/client/Minecraft;
    //   328: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   331: getfield field_70177_z : F
    //   334: ldc 180.0
    //   336: fadd
    //   337: putfield field_70761_aq : F
    //   340: aload_1
    //   341: getstatic com/schnurritv/sexmod/b2.K : Lnet/minecraft/client/Minecraft;
    //   344: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   347: getfield field_70177_z : F
    //   350: ldc 180.0
    //   352: fadd
    //   353: putfield field_70760_ar : F
    //   356: getstatic com/schnurritv/sexmod/b2.K : Lnet/minecraft/client/Minecraft;
    //   359: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   362: invokevirtual func_70040_Z : ()Lnet/minecraft/util/math/Vec3d;
    //   365: astore #12
    //   367: invokestatic func_179094_E : ()V
    //   370: aload #12
    //   372: getfield field_72450_a : D
    //   375: aload #12
    //   377: getfield field_72448_b : D
    //   380: getstatic com/schnurritv/sexmod/b2.K : Lnet/minecraft/client/Minecraft;
    //   383: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   386: invokevirtual func_70047_e : ()F
    //   389: f2d
    //   390: dadd
    //   391: aload #12
    //   393: getfield field_72449_c : D
    //   396: invokestatic func_179137_b : (DDD)V
    //   399: new net/minecraft/util/math/Vec3d
    //   402: dup
    //   403: getstatic com/schnurritv/sexmod/b2.K : Lnet/minecraft/client/Minecraft;
    //   406: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   409: getfield field_70125_A : F
    //   412: invokestatic abs : (F)F
    //   415: fneg
    //   416: f2d
    //   417: dconst_0
    //   418: dconst_0
    //   419: invokespecial <init> : (DDD)V
    //   422: getstatic com/schnurritv/sexmod/b2.K : Lnet/minecraft/client/Minecraft;
    //   425: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   428: getfield field_70177_z : F
    //   431: invokestatic a : (Lnet/minecraft/util/math/Vec3d;F)Lnet/minecraft/util/math/Vec3d;
    //   434: astore #13
    //   436: getstatic com/schnurritv/sexmod/b2.K : Lnet/minecraft/client/Minecraft;
    //   439: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   442: getfield field_70125_A : F
    //   445: aload #13
    //   447: getfield field_72450_a : D
    //   450: d2f
    //   451: fconst_0
    //   452: aload #13
    //   454: getfield field_72449_c : D
    //   457: d2f
    //   458: invokestatic func_179114_b : (FFFF)V
    //   461: dconst_0
    //   462: dstore_2
    //   463: dconst_0
    //   464: dstore #4
    //   466: dconst_0
    //   467: dstore #6
    //   469: goto -> 991
    //   472: aload_1
    //   473: getfield aP : Z
    //   476: ifeq -> 515
    //   479: aload #11
    //   481: ifnull -> 515
    //   484: goto -> 491
    //   487: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   490: athrow
    //   491: getstatic com/schnurritv/sexmod/b2.K : Lnet/minecraft/client/Minecraft;
    //   494: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   497: invokevirtual getPersistentID : ()Ljava/util/UUID;
    //   500: aload #11
    //   502: invokevirtual equals : (Ljava/lang/Object;)Z
    //   505: ifeq -> 621
    //   508: goto -> 515
    //   511: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   514: athrow
    //   515: aload #11
    //   517: ifnull -> 595
    //   520: goto -> 527
    //   523: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   526: athrow
    //   527: getstatic com/schnurritv/sexmod/b2.K : Lnet/minecraft/client/Minecraft;
    //   530: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   533: invokevirtual getPersistentID : ()Ljava/util/UUID;
    //   536: aload #11
    //   538: invokevirtual equals : (Ljava/lang/Object;)Z
    //   541: ifne -> 595
    //   544: goto -> 551
    //   547: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   550: athrow
    //   551: aload_1
    //   552: getfield field_70170_p : Lnet/minecraft/world/World;
    //   555: aload #11
    //   557: invokevirtual func_152378_a : (Ljava/util/UUID;)Lnet/minecraft/entity/player/EntityPlayer;
    //   560: astore #12
    //   562: aload #12
    //   564: ifnull -> 592
    //   567: aload_1
    //   568: aload #12
    //   570: getfield field_70177_z : F
    //   573: putfield field_70761_aq : F
    //   576: aload_1
    //   577: aload #12
    //   579: getfield field_70177_z : F
    //   582: putfield field_70760_ar : F
    //   585: goto -> 592
    //   588: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   591: athrow
    //   592: goto -> 621
    //   595: aload_1
    //   596: getstatic com/schnurritv/sexmod/b2.K : Lnet/minecraft/client/Minecraft;
    //   599: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   602: getfield field_70177_z : F
    //   605: putfield field_70761_aq : F
    //   608: aload_1
    //   609: getstatic com/schnurritv/sexmod/b2.K : Lnet/minecraft/client/Minecraft;
    //   612: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   615: getfield field_70177_z : F
    //   618: putfield field_70760_ar : F
    //   621: aload_0
    //   622: aload_1
    //   623: fload #9
    //   625: invokevirtual a : (Lcom/schnurritv/sexmod/bf;F)Lnet/minecraft/util/math/Vec3d;
    //   628: astore #12
    //   630: aload #12
    //   632: getfield field_72450_a : D
    //   635: dstore_2
    //   636: aload #12
    //   638: getfield field_72448_b : D
    //   641: dstore #4
    //   643: aload #12
    //   645: getfield field_72449_c : D
    //   648: dstore #6
    //   650: goto -> 991
    //   653: aload_0
    //   654: getfield z : Z
    //   657: ifeq -> 782
    //   660: aload_0
    //   661: fload #9
    //   663: invokespecial a : (F)V
    //   666: new net/minecraft/util/math/Vec3d
    //   669: dup
    //   670: ldc -0.1
    //   672: ldc 0.2
    //   674: getstatic com/schnurritv/sexmod/b2.K : Lnet/minecraft/client/Minecraft;
    //   677: getfield field_71474_y : Lnet/minecraft/client/settings/GameSettings;
    //   680: getfield field_74334_X : F
    //   683: ldc 110.0
    //   685: fdiv
    //   686: invokestatic a : (FFF)F
    //   689: f2d
    //   690: dconst_0
    //   691: dconst_0
    //   692: invokespecial <init> : (DDD)V
    //   695: astore #12
    //   697: aload #12
    //   699: getstatic com/schnurritv/sexmod/b2.K : Lnet/minecraft/client/Minecraft;
    //   702: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   705: getfield field_70177_z : F
    //   708: invokestatic a : (Lnet/minecraft/util/math/Vec3d;F)Lnet/minecraft/util/math/Vec3d;
    //   711: astore #12
    //   713: aload #12
    //   715: getfield field_72450_a : D
    //   718: dstore_2
    //   719: aload #12
    //   721: getfield field_72448_b : D
    //   724: dstore #4
    //   726: aload #12
    //   728: getfield field_72449_c : D
    //   731: dstore #6
    //   733: aload_1
    //   734: getstatic com/schnurritv/sexmod/b2.K : Lnet/minecraft/client/Minecraft;
    //   737: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   740: getfield field_70177_z : F
    //   743: putfield field_70761_aq : F
    //   746: aload_1
    //   747: getstatic com/schnurritv/sexmod/b2.K : Lnet/minecraft/client/Minecraft;
    //   750: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   753: getfield field_70126_B : F
    //   756: putfield field_70760_ar : F
    //   759: getstatic com/schnurritv/sexmod/b2.K : Lnet/minecraft/client/Minecraft;
    //   762: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   765: invokevirtual func_70093_af : ()Z
    //   768: ifeq -> 779
    //   771: dload #4
    //   773: ldc2_w 0.075
    //   776: dsub
    //   777: dstore #4
    //   779: goto -> 991
    //   782: aload #10
    //   784: getstatic com/schnurritv/sexmod/m.SHOULDER_IDLE : Lcom/schnurritv/sexmod/m;
    //   787: if_acmpne -> 930
    //   790: aload #11
    //   792: ifnonnull -> 807
    //   795: goto -> 802
    //   798: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   801: athrow
    //   802: return
    //   803: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   806: athrow
    //   807: getstatic com/schnurritv/sexmod/b2.K : Lnet/minecraft/client/Minecraft;
    //   810: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   813: invokevirtual getPersistentID : ()Ljava/util/UUID;
    //   816: aload #11
    //   818: invokevirtual equals : (Ljava/lang/Object;)Z
    //   821: ifeq -> 848
    //   824: getstatic com/schnurritv/sexmod/b2.K : Lnet/minecraft/client/Minecraft;
    //   827: getfield field_71474_y : Lnet/minecraft/client/settings/GameSettings;
    //   830: getfield field_74320_O : I
    //   833: ifne -> 848
    //   836: goto -> 843
    //   839: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   842: athrow
    //   843: return
    //   844: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   847: athrow
    //   848: aload_1
    //   849: getfield field_70170_p : Lnet/minecraft/world/World;
    //   852: aload #11
    //   854: invokevirtual func_152378_a : (Ljava/util/UUID;)Lnet/minecraft/entity/player/EntityPlayer;
    //   857: astore #12
    //   859: aload #12
    //   861: ifnonnull -> 869
    //   864: return
    //   865: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   868: athrow
    //   869: aload_0
    //   870: aload #12
    //   872: fload #9
    //   874: invokevirtual a : (Lnet/minecraft/entity/player/EntityPlayer;F)Ljavax/vecmath/Vector4f;
    //   877: astore #13
    //   879: aload #13
    //   881: getfield x : F
    //   884: f2d
    //   885: dstore_2
    //   886: aload #13
    //   888: getfield y : F
    //   891: f2d
    //   892: dstore #4
    //   894: aload #13
    //   896: getfield z : F
    //   899: f2d
    //   900: dstore #6
    //   902: aload_1
    //   903: aload #13
    //   905: getfield w : F
    //   908: putfield field_70761_aq : F
    //   911: aload #12
    //   913: invokevirtual func_70093_af : ()Z
    //   916: ifeq -> 927
    //   919: dload #4
    //   921: ldc2_w 0.32
    //   924: dsub
    //   925: dstore #4
    //   927: goto -> 991
    //   930: aload #10
    //   932: getstatic com/schnurritv/sexmod/m.PICK_UP : Lcom/schnurritv/sexmod/m;
    //   935: if_acmpne -> 991
    //   938: aload #11
    //   940: ifnull -> 991
    //   943: goto -> 950
    //   946: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   949: athrow
    //   950: aload_1
    //   951: getfield field_70170_p : Lnet/minecraft/world/World;
    //   954: aload #11
    //   956: invokevirtual func_152378_a : (Ljava/util/UUID;)Lnet/minecraft/entity/player/EntityPlayer;
    //   959: astore #12
    //   961: aload #12
    //   963: ifnull -> 991
    //   966: aload_1
    //   967: aload #12
    //   969: getfield field_70758_at : F
    //   972: putfield field_70760_ar : F
    //   975: aload_1
    //   976: aload #12
    //   978: getfield field_70759_as : F
    //   981: putfield field_70761_aq : F
    //   984: goto -> 991
    //   987: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   990: athrow
    //   991: aload_0
    //   992: aload_1
    //   993: dload_2
    //   994: dload #4
    //   996: dload #6
    //   998: fload #8
    //   1000: fload #9
    //   1002: invokespecial a : (Lcom/schnurritv/sexmod/bS;DDDFF)V
    //   1005: aload_1
    //   1006: aload #10
    //   1008: invokestatic a : (Lcom/schnurritv/sexmod/bf;Lcom/schnurritv/sexmod/m;)Z
    //   1011: ifeq -> 1067
    //   1014: getstatic com/schnurritv/sexmod/b2.K : Lnet/minecraft/client/Minecraft;
    //   1017: getfield field_71474_y : Lnet/minecraft/client/settings/GameSettings;
    //   1020: getfield field_74320_O : I
    //   1023: ifne -> 1067
    //   1026: goto -> 1033
    //   1029: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1032: athrow
    //   1033: getstatic com/schnurritv/sexmod/b2.K : Lnet/minecraft/client/Minecraft;
    //   1036: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   1039: invokevirtual getPersistentID : ()Ljava/util/UUID;
    //   1042: aload #11
    //   1044: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1047: ifeq -> 1067
    //   1050: goto -> 1057
    //   1053: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1056: athrow
    //   1057: invokestatic func_179121_F : ()V
    //   1060: goto -> 1067
    //   1063: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1066: athrow
    //   1067: return
    // Exception table:
    //   from	to	target	type
    //   0	24	27	java/lang/RuntimeException
    //   14	35	35	java/lang/RuntimeException
    //   40	62	65	java/lang/RuntimeException
    //   52	73	73	java/lang/RuntimeException
    //   167	183	186	java/lang/RuntimeException
    //   175	202	205	java/lang/RuntimeException
    //   190	217	220	java/lang/RuntimeException
    //   209	231	234	java/lang/RuntimeException
    //   224	239	239	java/lang/RuntimeException
    //   271	297	300	java/lang/RuntimeException
    //   280	312	315	java/lang/RuntimeException
    //   304	320	320	java/lang/RuntimeException
    //   472	484	487	java/lang/RuntimeException
    //   479	508	511	java/lang/RuntimeException
    //   491	520	523	java/lang/RuntimeException
    //   515	544	547	java/lang/RuntimeException
    //   562	585	588	java/lang/RuntimeException
    //   782	795	798	java/lang/RuntimeException
    //   790	803	803	java/lang/RuntimeException
    //   807	836	839	java/lang/RuntimeException
    //   824	844	844	java/lang/RuntimeException
    //   859	865	865	java/lang/RuntimeException
    //   930	943	946	java/lang/RuntimeException
    //   961	984	987	java/lang/RuntimeException
    //   991	1026	1029	java/lang/RuntimeException
    //   1014	1050	1053	java/lang/RuntimeException
    //   1033	1060	1063	java/lang/RuntimeException
  }
  
  public static boolean a(bf parambf, m paramm) {
    try {
      if (paramm == m.START_THROWING)
        try {
          if (!parambf.aP)
            return false; 
        } catch (RuntimeException runtimeException) {
          throw b(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    try {
      if (K.field_71474_y.field_74320_O != 0)
        try {
          if (paramm != m.START_THROWING) {
            try {
              if (paramm == m.PICK_UP)
                return false; 
            } catch (RuntimeException runtimeException) {
              throw b(null);
            } 
          } else {
            return false;
          } 
        } catch (RuntimeException runtimeException) {
          throw b(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    try {
      switch (b.a[paramm.ordinal()]) {
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
          return true;
      } 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    return false;
  }
  
  Vec3d a(bf parambf, float paramFloat) {
    UUID uUID = parambf.m();
    try {
      if (uUID == null)
        return Vec3d.field_186680_a; 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    EntityPlayer entityPlayer = parambf.field_70170_p.func_152378_a(uUID);
    try {
      if (entityPlayer == null)
        return Vec3d.field_186680_a; 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    Vec3d vec3d1 = aH.a(new Vec3d(entityPlayer.field_70169_q, entityPlayer.field_70167_r, entityPlayer.field_70166_s), entityPlayer.func_174791_d(), paramFloat);
    Vec3d vec3d2 = aH.a(new Vec3d(K.field_71439_g.field_70169_q, K.field_71439_g.field_70167_r, K.field_71439_g.field_70166_s), K.field_71439_g.func_174791_d(), paramFloat);
    return vec3d1.func_178788_d(vec3d2);
  }
  
  Vector4f a(EntityPlayer paramEntityPlayer, float paramFloat) {
    EntityPlayerSP entityPlayerSP = K.field_71439_g;
    float f = aH.a(paramEntityPlayer.field_70760_ar, paramEntityPlayer.field_70761_aq, paramFloat);
    Vec3d vec3d1 = aH.a(new Vec3d(paramEntityPlayer.field_70142_S, paramEntityPlayer.field_70137_T, paramEntityPlayer.field_70136_U), paramEntityPlayer.func_174791_d(), paramFloat);
    Vec3d vec3d2 = aH.a(new Vec3d(((EntityPlayer)entityPlayerSP).field_70142_S, ((EntityPlayer)entityPlayerSP).field_70137_T, ((EntityPlayer)entityPlayerSP).field_70136_U), entityPlayerSP.func_174791_d(), paramFloat);
    Vec3d vec3d3 = vec3d1.func_178788_d(vec3d2);
    return new Vector4f((float)vec3d3.field_72450_a, (float)vec3d3.field_72448_b, (float)vec3d3.field_72449_c, f);
  }
  
  protected Vec3i a(String paramString) {
    String[] arrayOfString = br.a(this.n);
    try {
      if (arrayOfString.length < 8)
        return x; 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    try {
      if (paramString.contains("band"))
        return M; 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    try {
      if (!paramString.contains("eyeColor")) {
        try {
          if (paramString.contains("eyeColor2"))
            return b(arrayOfString[8]); 
        } catch (RuntimeException runtimeException) {
          throw b(null);
        } 
      } else {
        return b(arrayOfString[8]);
      } 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    try {
      if (!paramString.contains("variant"))
        try {
          if (!paramString.contains("boob")) {
            try {
              if (paramString.contains("hair"))
                return d(arrayOfString[6]); 
            } catch (RuntimeException runtimeException) {
              throw b(null);
            } 
            try {
              if (P.contains(paramString))
                return c(arrayOfString[7]); 
            } catch (RuntimeException runtimeException) {
              throw b(null);
            } 
            try {
              if (N.contains(paramString))
                return d(arrayOfString[6]); 
            } catch (RuntimeException runtimeException) {
              throw b(null);
            } 
            return x;
          } 
          return c(arrayOfString[7]);
        } catch (RuntimeException runtimeException) {
          throw b(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    return c(arrayOfString[7]);
  }
  
  public static Vec3i b(String paramString) {
    return aD.values()[Integer.parseInt(paramString)].a();
  }
  
  public static Vec3i c(String paramString) {
    return G.values()[Integer.parseInt(paramString)].a();
  }
  
  public static Vec3i d(String paramString) {
    return F.values()[Integer.parseInt(paramString)].a();
  }
  
  protected void a(BufferBuilder paramBufferBuilder, String paramString, GeoBone paramGeoBone) {
    try {
      if (this.n.field_70170_p instanceof com.c)
        return; 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    String[] arrayOfString = br.a(this.n);
    try {
      if (arrayOfString.length < 8)
        return; 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    String str = paramString;
    byte b = -1;
    try {
      switch (str.hashCode()) {
        case 3105718:
          if (str.equals("earL"))
            b = 0; 
          break;
        case 3105724:
          if (str.equals("earR"))
            b = 1; 
          break;
        case 3194850:
          if (str.equals("hair"))
            b = 2; 
          break;
        case 3029410:
          if (str.equals("body"))
            b = 3; 
          break;
        case 2364452:
          if (str.equals("LegR"))
            b = 4; 
          break;
        case 93921650:
          if (str.equals("boobR"))
            b = 5; 
          break;
        case -1383396097:
          if (str.equals("boobR1"))
            b = 6; 
          break;
        case -1383396096:
          if (str.equals("boobR2"))
            b = 7; 
          break;
      } 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    try {
      switch (b) {
        case 0:
          a(paramGeoBone, arrayOfString[0], arrayOfString[1], arrayOfString[3]);
          break;
        case 1:
          a(paramGeoBone, arrayOfString[0], arrayOfString[2], arrayOfString[4]);
          break;
        case 2:
          a(paramGeoBone, arrayOfString[5]);
          break;
        case 3:
          paramGeoBone.setPivotY(-0.15F);
          a(paramGeoBone);
          break;
        case 4:
          a(paramGeoBone, 25.0F, 25.0F);
          break;
        case 5:
          a(paramGeoBone, 30.0F, 30.0F);
          break;
        case 6:
          a(paramGeoBone, 10.0F, 15.0F);
          break;
        case 7:
          a(paramGeoBone, 5.0F, 3.0F);
          break;
      } 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    try {
      if (paramString.contains("crown"))
        a(this.n, paramGeoBone, arrayOfString[9]); 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
  }
  
  public static void a(bS parambS, GeoBone paramGeoBone, String paramString) {
    try {
      if (parambS.l) {
        paramGeoBone.setHidden(true);
      } else if (parambS instanceof bf) {
        int i = Integer.parseInt(paramString);
        try {
        
        } catch (RuntimeException runtimeException) {
          throw b(null);
        } 
        paramGeoBone.setHidden((i == 0));
      } else {
        try {
          if (parambS instanceof be)
            paramGeoBone.setHidden(((ItemStack)parambS.func_184212_Q().func_187225_a(bA.I)).func_190926_b()); 
        } catch (RuntimeException runtimeException) {
          throw b(null);
        } 
      } 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
  }
  
  void a(GeoBone paramGeoBone, float paramFloat1, float paramFloat2) {
    try {
      if (K.func_147113_T())
        return; 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    try {
      if (!this.z)
        return; 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    paramGeoBone.setRotationX(paramGeoBone.getRotationX() + aH.b(aH.b(this.R, -paramFloat1, paramFloat1)));
    paramGeoBone.setRotationZ(paramGeoBone.getRotationZ() + aH.b(aH.b(this.I, -paramFloat2, paramFloat2)));
  }
  
  void a(GeoBone paramGeoBone) {
    try {
      if (this.L == -420.69F)
        try {
          if (this.n.o() == m.SHOULDER_IDLE) {
            UUID uUID = this.n.m();
            try {
              if (uUID == null)
                return; 
            } catch (RuntimeException runtimeException) {
              throw b(null);
            } 
            EntityPlayer entityPlayer = this.n.field_70170_p.func_152378_a(uUID);
            try {
              if (entityPlayer == null)
                return; 
            } catch (RuntimeException runtimeException) {
              throw b(null);
            } 
            float f = -(K.func_175598_ae()).field_78732_j;
            try {
              paramGeoBone.setPivotY(8.0F);
              if (K.func_147113_T())
                return; 
            } catch (RuntimeException runtimeException) {
              throw b(null);
            } 
            paramGeoBone.setRotationX(paramGeoBone.getRotationX() + aH.b(f));
            return;
          } 
          return;
        } catch (RuntimeException runtimeException) {
          throw b(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
  }
  
  public static void a(GeoBone paramGeoBone, String paramString) {
    int i = Integer.parseInt(paramString);
    a(paramGeoBone, i);
  }
  
  static HashSet<Integer> b(int paramInt, String paramString) {
    int i = Integer.parseInt(paramString);
    int j = paramInt - 1;
    ArrayList<HashSet<Integer>> arrayList = a(j);
    while (i >= arrayList.size())
      i -= arrayList.size(); 
    return arrayList.get(i);
  }
  
  static ArrayList<HashSet<Integer>> a(int paramInt) {
    ArrayList<HashSet<Integer>> arrayList = new ArrayList();
    a(0, new HashSet<>(), paramInt, arrayList);
    return arrayList;
  }
  
  static void a(int paramInt1, HashSet<Integer> paramHashSet, int paramInt2, ArrayList<HashSet<Integer>> paramArrayList) {
    try {
      if (paramInt1 > paramInt2) {
        paramArrayList.add(paramHashSet);
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    HashSet<Integer> hashSet = new HashSet<>(paramHashSet);
    a(paramInt1 + 1, paramHashSet, paramInt2, paramArrayList);
    hashSet.add(Integer.valueOf(paramInt1));
    a(paramInt1 + 1, hashSet, paramInt2, paramArrayList);
  }
  
  static HashSet<Integer> a(int paramInt, String paramString) {
    HashSet<Integer> hashSet = new HashSet();
    int i = Integer.parseInt(paramString);
    i = (int)(0.01F * i * i);
    int j = Math.round(i / 100.0F * paramInt);
    Random random = new Random(i);
    for (byte b = 0; b < j; b++) {
      int k = random.nextInt(paramInt);
      try {
        if (!hashSet.contains(Integer.valueOf(k))) {
          hashSet.add(Integer.valueOf(k));
        } else {
          b--;
        } 
      } catch (RuntimeException runtimeException) {
        throw b(null);
      } 
    } 
    return hashSet;
  }
  
  static void a(GeoBone paramGeoBone, String paramString1, String paramString2, String paramString3) {
    GeoBone geoBone1 = a(paramGeoBone, Integer.parseInt(paramString1));
    GeoBone geoBone2 = a(geoBone1, Integer.parseInt(paramString2));
    List list = geoBone2.childBones;
    int i = list.size();
    HashSet<Integer> hashSet = b(i, paramString3);
    geoBone2.childBones.forEach(paramGeoBone -> paramGeoBone.setHidden(true));
    hashSet.forEach(paramInteger -> b(paramGeoBone, paramInteger.intValue()));
  }
  
  protected Vec3i a(Vec3i paramVec3i) {
    try {
      if (!this.z)
        try {
          if (!this.D)
            return paramVec3i; 
        } catch (RuntimeException runtimeException) {
          throw b(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    float f = aH.b(this.E, 2.0F, 15.0F) / 15.0F;
    return new Vec3i((paramVec3i.func_177958_n() * f), (paramVec3i.func_177956_o() * f), (paramVec3i.func_177952_p() * f));
  }
  
  protected ItemStack a(@Nullable ItemStack paramItemStack) {
    m m = this.n.o();
    try {
      if (m != m.RUN)
        try {
          return (m != m.CATCH) ? paramItemStack : (ItemStack)this.n.func_184212_Q().func_187225_a(bf.U);
        } catch (RuntimeException runtimeException) {
          throw b(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    return (ItemStack)this.n.func_184212_Q().func_187225_a(bf.U);
  }
  
  protected HashSet<String> d() {
    return new a();
  }
  
  protected float a() {
    try {
      if (this.n.o() == m.CATCH)
        return 0.5F; 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    return 1.0F;
  }
  
  protected Vec3d a(ItemStack paramItemStack) {
    try {
      if (paramItemStack == null)
        return Vec3d.field_186680_a; 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    try {
      if (!(paramItemStack.func_77973_b() instanceof net.minecraft.item.ItemBlock))
        try {
          return (paramItemStack.func_77976_d() != 1) ? new Vec3d(180.0D, 0.0D, 0.0D) : super.a(paramItemStack);
        } catch (RuntimeException runtimeException) {
          throw b(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    return super.a(paramItemStack);
  }
  
  public void a(BufferBuilder paramBufferBuilder, GeoCube paramGeoCube, GeoBone paramGeoBone, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, double paramDouble) {
    try {
      if (this.z)
        try {
          if (!G.contains(paramGeoBone.getName()))
            return; 
        } catch (RuntimeException runtimeException) {
          throw b(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    try {
      if (this.d.contains(paramGeoBone.getName()))
        return; 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    this.t = paramGeoBone;
    super.a(paramBufferBuilder, paramGeoCube, paramGeoBone, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramDouble);
  }
  
  private static Exception b(Exception paramException) {
    return paramException;
  }
  
  class a extends HashSet<String> {
    a() {
      add("boobs");
      add("booty");
      add("vagina");
      add("fuckhole");
      add("preggy");
      add("LegL");
      add("LegR");
      add("cheekR");
      add("cheekL");
    }
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\b2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */