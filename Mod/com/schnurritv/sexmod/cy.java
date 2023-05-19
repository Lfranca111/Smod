package com.schnurritv.sexmod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.event.EntityViewRenderEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@EventBusSubscriber
public class cY {
  public static final float e = 1.2345679F;
  
  Vec3d c = null;
  
  Vec3d a = null;
  
  bo b = null;
  
  boolean d = false;
  
  @SideOnly(Side.CLIENT)
  @SubscribeEvent
  public void a(RenderPlayerEvent.Pre paramPre) {
    try {
      if (paramPre.getPartialRenderTick() == 1.2345679F)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    bo.e();
    bo bo1 = bo.f(paramPre.getEntityPlayer().getPersistentID());
    try {
      if (bo1 == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    paramPre.setCanceled(true);
    a(bo1, paramPre.getEntityPlayer(), paramPre.getX(), paramPre.getY(), paramPre.getZ(), paramPre.getPartialRenderTick());
  }
  
  @SideOnly(Side.CLIENT)
  public static void a(bo parambo, EntityPlayer paramEntityPlayer, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
    // Byte code:
    //   0: invokestatic func_71410_x : ()Lnet/minecraft/client/Minecraft;
    //   3: astore #9
    //   5: aload_1
    //   6: aload #9
    //   8: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   11: invokevirtual func_98034_c : (Lnet/minecraft/entity/player/EntityPlayer;)Z
    //   14: ifeq -> 22
    //   17: return
    //   18: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   21: athrow
    //   22: aload #9
    //   24: invokevirtual func_175598_ae : ()Lnet/minecraft/client/renderer/entity/RenderManager;
    //   27: astore #10
    //   29: aload_0
    //   30: aload_1
    //   31: getfield field_70177_z : F
    //   34: putfield field_70177_z : F
    //   37: aload_0
    //   38: aload_1
    //   39: getfield field_70758_at : F
    //   42: putfield field_70758_at : F
    //   45: aload_0
    //   46: aload_1
    //   47: getfield field_70759_as : F
    //   50: putfield field_70759_as : F
    //   53: aload_0
    //   54: aload_1
    //   55: getfield field_70127_C : F
    //   58: putfield field_70127_C : F
    //   61: aload_0
    //   62: aload_1
    //   63: getfield field_70125_A : F
    //   66: putfield field_70125_A : F
    //   69: aload_0
    //   70: aload_1
    //   71: getfield field_70126_B : F
    //   74: putfield field_70126_B : F
    //   77: aload_0
    //   78: aload_1
    //   79: getfield field_70169_q : D
    //   82: putfield field_70169_q : D
    //   85: aload_0
    //   86: aload_1
    //   87: getfield field_70167_r : D
    //   90: putfield field_70167_r : D
    //   93: aload_0
    //   94: aload_1
    //   95: getfield field_70166_s : D
    //   98: putfield field_70166_s : D
    //   101: aload_0
    //   102: aload_1
    //   103: getfield field_70761_aq : F
    //   106: putfield field_70761_aq : F
    //   109: aload_0
    //   110: aload_1
    //   111: getfield field_70760_ar : F
    //   114: putfield field_70760_ar : F
    //   117: aload_0
    //   118: aload_1
    //   119: invokevirtual func_70093_af : ()Z
    //   122: putfield aj : Z
    //   125: aload_0
    //   126: aload_1
    //   127: invokevirtual func_70051_ag : ()Z
    //   130: putfield ai : Z
    //   133: aload_0
    //   134: aload_1
    //   135: invokevirtual func_184218_aH : ()Z
    //   138: putfield Z : Z
    //   141: aload_0
    //   142: aload_1
    //   143: getfield field_70122_E : Z
    //   146: putfield ag : Z
    //   149: aload_0
    //   150: aload_1
    //   151: invokevirtual func_184605_cv : ()I
    //   154: ifeq -> 165
    //   157: iconst_1
    //   158: goto -> 166
    //   161: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   164: athrow
    //   165: iconst_0
    //   166: putfield W : Z
    //   169: aload_1
    //   170: getfield field_70142_S : D
    //   173: aload_1
    //   174: getfield field_70165_t : D
    //   177: dsub
    //   178: dstore #11
    //   180: aload_1
    //   181: getfield field_70161_v : D
    //   184: aload_1
    //   185: getfield field_70136_U : D
    //   188: dsub
    //   189: dstore #13
    //   191: ldc2_w 0.017453292519943295
    //   194: aload_1
    //   195: getfield field_70177_z : F
    //   198: f2d
    //   199: dmul
    //   200: dstore #15
    //   202: aload_0
    //   203: new javax/vecmath/Vector2f
    //   206: dup
    //   207: dload #11
    //   209: dload #15
    //   211: invokestatic cos : (D)D
    //   214: dmul
    //   215: dload #13
    //   217: dload #15
    //   219: invokestatic sin : (D)D
    //   222: dmul
    //   223: dadd
    //   224: d2f
    //   225: dload #11
    //   227: dload #15
    //   229: invokestatic sin : (D)D
    //   232: dmul
    //   233: dload #13
    //   235: dload #15
    //   237: invokestatic cos : (D)D
    //   240: dmul
    //   241: dadd
    //   242: d2f
    //   243: invokespecial <init> : (FF)V
    //   246: putfield Y : Ljavax/vecmath/Vector2f;
    //   249: fconst_0
    //   250: fstore #17
    //   252: aload_0
    //   253: invokevirtual func_184212_Q : ()Lnet/minecraft/network/datasync/EntityDataManager;
    //   256: getstatic com/schnurritv/sexmod/bS.z : Lnet/minecraft/network/datasync/DataParameter;
    //   259: invokevirtual func_187225_a : (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
    //   262: checkcast java/lang/Boolean
    //   265: invokevirtual booleanValue : ()Z
    //   268: ifne -> 455
    //   271: aload_1
    //   272: invokevirtual func_184614_ca : ()Lnet/minecraft/item/ItemStack;
    //   275: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   278: instanceof net/minecraft/item/ItemBow
    //   281: ifne -> 311
    //   284: goto -> 291
    //   287: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   290: athrow
    //   291: aload_1
    //   292: invokevirtual func_184592_cb : ()Lnet/minecraft/item/ItemStack;
    //   295: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   298: instanceof net/minecraft/item/ItemBow
    //   301: ifeq -> 339
    //   304: goto -> 311
    //   307: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   310: athrow
    //   311: aload_0
    //   312: getfield W : Z
    //   315: ifeq -> 339
    //   318: goto -> 325
    //   321: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   324: athrow
    //   325: aload_0
    //   326: getstatic com/schnurritv/sexmod/m.BOW : Lcom/schnurritv/sexmod/m;
    //   329: invokevirtual c : (Lcom/schnurritv/sexmod/m;)V
    //   332: goto -> 339
    //   335: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   338: athrow
    //   339: aload_0
    //   340: invokevirtual o : ()Lcom/schnurritv/sexmod/m;
    //   343: getstatic com/schnurritv/sexmod/m.BOW : Lcom/schnurritv/sexmod/m;
    //   346: if_acmpne -> 377
    //   349: aload_0
    //   350: getfield W : Z
    //   353: ifne -> 377
    //   356: goto -> 363
    //   359: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   362: athrow
    //   363: aload_0
    //   364: getstatic com/schnurritv/sexmod/m.NULL : Lcom/schnurritv/sexmod/m;
    //   367: invokevirtual c : (Lcom/schnurritv/sexmod/m;)V
    //   370: goto -> 377
    //   373: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   376: athrow
    //   377: aload_0
    //   378: invokevirtual o : ()Lcom/schnurritv/sexmod/m;
    //   381: getstatic com/schnurritv/sexmod/m.BOW : Lcom/schnurritv/sexmod/m;
    //   384: if_acmpne -> 418
    //   387: aload_0
    //   388: aload_0
    //   389: getfield field_70759_as : F
    //   392: putfield field_70177_z : F
    //   395: aload_0
    //   396: aload_0
    //   397: getfield field_70759_as : F
    //   400: putfield field_70761_aq : F
    //   403: aload_0
    //   404: aload_0
    //   405: getfield field_70758_at : F
    //   408: putfield field_70760_ar : F
    //   411: goto -> 418
    //   414: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   417: athrow
    //   418: aload_0
    //   419: getfield Z : Z
    //   422: ifeq -> 455
    //   425: aload_1
    //   426: invokevirtual func_184187_bx : ()Lnet/minecraft/entity/Entity;
    //   429: instanceof net/minecraft/entity/item/EntityBoat
    //   432: ifeq -> 451
    //   435: goto -> 442
    //   438: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   441: athrow
    //   442: ldc 0.4
    //   444: goto -> 453
    //   447: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   450: athrow
    //   451: ldc 0.2
    //   453: fstore #17
    //   455: iconst_1
    //   456: putstatic com/schnurritv/sexmod/bm.A : Z
    //   459: aload #10
    //   461: aload_0
    //   462: dload_2
    //   463: dload #4
    //   465: fload #17
    //   467: f2d
    //   468: dadd
    //   469: dload #6
    //   471: ldc 90.0
    //   473: fload #8
    //   475: iconst_0
    //   476: invokevirtual func_188391_a : (Lnet/minecraft/entity/Entity;DDDFFZ)V
    //   479: return
    // Exception table:
    //   from	to	target	type
    //   5	18	18	java/lang/RuntimeException
    //   29	161	161	java/lang/RuntimeException
    //   252	284	287	java/lang/RuntimeException
    //   271	304	307	java/lang/RuntimeException
    //   291	318	321	java/lang/RuntimeException
    //   311	332	335	java/lang/RuntimeException
    //   339	356	359	java/lang/RuntimeException
    //   349	370	373	java/lang/RuntimeException
    //   377	411	414	java/lang/RuntimeException
    //   418	435	438	java/lang/RuntimeException
    //   425	447	447	java/lang/RuntimeException
  }
  
  @SideOnly(Side.CLIENT)
  @SubscribeEvent
  public void a(TickEvent.RenderTickEvent paramRenderTickEvent) {
    Minecraft minecraft = Minecraft.func_71410_x();
    try {
      if (minecraft.field_71439_g == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramRenderTickEvent.phase == TickEvent.Phase.END) {
        try {
          if (this.c != null) {
            minecraft.field_71439_g.func_70107_b(this.c.field_72450_a, this.c.field_72448_b, this.c.field_72449_c);
            minecraft.field_71439_g.field_70142_S = this.a.field_72450_a;
            minecraft.field_71439_g.field_70137_T = this.a.field_72448_b;
            minecraft.field_71439_g.field_70136_U = this.a.field_72449_c;
            this.c = null;
            this.a = null;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (minecraft.field_71474_y.field_74320_O != 0)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    bo bo1 = bo.f(minecraft.field_71439_g.getPersistentID());
    try {
      if (bo1 == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!bo1.b())
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.c = minecraft.field_71439_g.func_174791_d();
    this.a = new Vec3d(minecraft.field_71439_g.field_70142_S, minecraft.field_71439_g.field_70137_T, minecraft.field_71439_g.field_70136_U);
    Vec3d vec3d = bo1.e("girlCam");
    vec3d = vec3d.func_178787_e(aH.a(this.a, this.c, paramRenderTickEvent.renderTickTime));
    minecraft.field_71439_g.field_70165_t = vec3d.field_72450_a;
    minecraft.field_71439_g.field_70163_u = vec3d.field_72448_b - minecraft.field_71439_g.func_70047_e();
    minecraft.field_71439_g.field_70161_v = vec3d.field_72449_c;
    minecraft.field_71439_g.field_70142_S = vec3d.field_72450_a;
    minecraft.field_71439_g.field_70137_T = vec3d.field_72448_b - minecraft.field_71439_g.func_70047_e();
    minecraft.field_71439_g.field_70136_U = vec3d.field_72449_c;
    m m = bo1.o();
    float f = bo1.s().floatValue();
    if (m.flipGirlYaw)
      f += 180.0F; 
    try {
      if (minecraft.field_71439_g.field_70125_A > m.maxGirlPitch) {
        minecraft.field_71439_g.field_70125_A = m.maxGirlPitch;
        minecraft.field_71439_g.field_70127_C = m.maxGirlPitch;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (minecraft.field_71439_g.field_70125_A < m.minGirlPitch) {
        minecraft.field_71439_g.field_70125_A = m.minGirlPitch;
        minecraft.field_71439_g.field_70127_C = m.minGirlPitch;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (minecraft.field_71439_g.field_70177_z > f + 90.0F) {
        minecraft.field_71439_g.field_70177_z = f + 90.0F;
        minecraft.field_71439_g.field_70126_B = f + 90.0F;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (minecraft.field_71439_g.field_70177_z < f - 90.0F) {
        minecraft.field_71439_g.field_70177_z = f - 90.0F;
        minecraft.field_71439_g.field_70126_B = f - 90.0F;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  @SideOnly(Side.CLIENT)
  @SubscribeEvent
  public void a(EntityViewRenderEvent.CameraSetup paramCameraSetup) {
    Minecraft minecraft = Minecraft.func_71410_x();
    try {
      if (minecraft.field_71439_g == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    bo bo1 = bo.f(minecraft.field_71439_g.getPersistentID());
    try {
      if (bo1 == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!bo1.p())
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!bo1.b())
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    paramCameraSetup.setRoll(180.0F);
    paramCameraSetup.setPitch(-paramCameraSetup.getPitch());
    paramCameraSetup.setYaw(-paramCameraSetup.getYaw());
  }
  
  @SideOnly(Side.CLIENT)
  @SubscribeEvent
  public void a(RenderWorldLastEvent paramRenderWorldLastEvent) {
    Minecraft minecraft = Minecraft.func_71410_x();
    try {
      if (this.c == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (minecraft.field_71474_y.field_74320_O != 0)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    bo bo1 = bo.f(minecraft.field_71439_g.getPersistentID());
    try {
      if (bo1 == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Vec3d vec3d1 = minecraft.field_71439_g.func_174791_d();
    Vec3d vec3d2 = aH.a(this.a, this.c, paramRenderWorldLastEvent.getPartialTicks());
    Vec3d vec3d3 = vec3d2.func_178788_d(vec3d1);
    a(bo1, (EntityPlayer)minecraft.field_71439_g, vec3d3.field_72450_a, vec3d3.field_72448_b, vec3d3.field_72449_c, paramRenderWorldLastEvent.getPartialTicks());
    GlStateManager.func_179145_e();
    GlStateManager.func_179126_j();
    GlStateManager.func_179141_d();
  }
  
  @SideOnly(Side.CLIENT)
  @SubscribeEvent
  public void b(TickEvent.RenderTickEvent paramRenderTickEvent) {
    Minecraft minecraft = Minecraft.func_71410_x();
    try {
      if (minecraft.field_71439_g == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramRenderTickEvent.phase == TickEvent.Phase.END)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    bo bo1 = bo.f(minecraft.field_71439_g.getPersistentID());
    try {
      if (bo1 == null) {
        try {
          if (this.d) {
            this.d = false;
            minecraft.field_71439_g.eyeHeight = minecraft.field_71439_g.getDefaultEyeHeight();
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (bo1.b()) {
        try {
          if (this.d) {
            this.d = false;
            minecraft.field_71439_g.eyeHeight = minecraft.field_71439_g.getDefaultEyeHeight();
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.b != bo1) {
        a(bo1, (EntityPlayer)minecraft.field_71439_g, 0.0D, 500.0D, 0.0D, paramRenderTickEvent.renderTickTime);
        this.b = bo1;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    minecraft.field_71439_g.eyeHeight = bo1.v();
    this.d = true;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\cY.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */