package com.schnurritv.sexmod;

import java.util.UUID;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.SoundKeyframeEvent;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;

public class b8 extends bA implements a, ci {
  public boolean V = false;
  
  public boolean ab = false;
  
  public boolean X = false;
  
  public static final DataParameter<Boolean> Z = EntityDataManager.func_187226_a(bS.class, DataSerializers.field_187198_h).func_187156_b().func_187161_a(118);
  
  int aa = 0;
  
  int W = 0;
  
  int Y = 0;
  
  boolean U = false;
  
  public b8(World paramWorld) {
    super(paramWorld);
    func_70105_a(0.49F, 1.95F);
    this.J = 140;
    this.O = 50;
    this.K = 140;
    this.G = new Vec3d(0.0D, -0.029999997854232782D, -0.2D);
  }
  
  public static b8 a(World paramWorld) {
    b8 b81 = new b8(paramWorld);
    b81.y = true;
    return b81;
  }
  
  public String H() {
    return "Jenny";
  }
  
  public float e() {
    return -0.2F;
  }
  
  protected void func_70088_a() {
    super.func_70088_a();
    this.p.func_187214_a(Z, Boolean.valueOf(false));
  }
  
  public void c() {
    b("Alright, this is my new Home~");
    a(L.GIRLS_JENNY_HAPPYOH[1]);
  }
  
  public float func_70047_e() {
    return 1.64F;
  }
  
  protected SoundEvent func_184615_bR() {
    return L.a(L.GIRLS_JENNY_SIGH);
  }
  
  protected SoundEvent func_184601_bQ(DamageSource paramDamageSource) {
    return null;
  }
  
  public void func_70619_bc() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial func_70619_bc : ()V
    //   4: aload_0
    //   5: getfield field_70170_p : Lnet/minecraft/world/World;
    //   8: aload_0
    //   9: ldc2_w 15.0
    //   12: invokevirtual func_72890_a : (Lnet/minecraft/entity/Entity;D)Lnet/minecraft/entity/player/EntityPlayer;
    //   15: astore_1
    //   16: aload_0
    //   17: getfield X : Z
    //   20: ifeq -> 201
    //   23: aload_1
    //   24: ifnull -> 201
    //   27: goto -> 34
    //   30: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   33: athrow
    //   34: aload_1
    //   35: invokevirtual func_174791_d : ()Lnet/minecraft/util/math/Vec3d;
    //   38: aload_0
    //   39: invokevirtual func_174791_d : ()Lnet/minecraft/util/math/Vec3d;
    //   42: invokevirtual func_72438_d : (Lnet/minecraft/util/math/Vec3d;)D
    //   45: ldc2_w 0.5
    //   48: dcmpg
    //   49: ifge -> 201
    //   52: goto -> 59
    //   55: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   58: athrow
    //   59: aload_0
    //   60: iconst_0
    //   61: putfield X : Z
    //   64: aload_0
    //   65: getfield p : Lnet/minecraft/network/datasync/EntityDataManager;
    //   68: getstatic com/schnurritv/sexmod/b8.D : Lnet/minecraft/network/datasync/DataParameter;
    //   71: aload_0
    //   72: getfield field_70170_p : Lnet/minecraft/world/World;
    //   75: aload_0
    //   76: ldc2_w 15.0
    //   79: invokevirtual func_72890_a : (Lnet/minecraft/entity/Entity;D)Lnet/minecraft/entity/player/EntityPlayer;
    //   82: invokevirtual getPersistentID : ()Ljava/util/UUID;
    //   85: invokevirtual toString : ()Ljava/lang/String;
    //   88: invokevirtual func_187227_b : (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
    //   91: aload_0
    //   92: invokevirtual func_184102_h : ()Lnet/minecraft/server/MinecraftServer;
    //   95: invokevirtual func_184103_al : ()Lnet/minecraft/server/management/PlayerList;
    //   98: aload_0
    //   99: invokevirtual n : ()Ljava/util/UUID;
    //   102: invokevirtual func_177451_a : (Ljava/util/UUID;)Lnet/minecraft/entity/player/EntityPlayerMP;
    //   105: astore_2
    //   106: aload_0
    //   107: getfield p : Lnet/minecraft/network/datasync/EntityDataManager;
    //   110: getstatic com/schnurritv/sexmod/b8.D : Lnet/minecraft/network/datasync/DataParameter;
    //   113: aload_2
    //   114: invokevirtual getPersistentID : ()Ljava/util/UUID;
    //   117: invokevirtual toString : ()Ljava/lang/String;
    //   120: invokevirtual func_187227_b : (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
    //   123: aload_2
    //   124: aload_0
    //   125: invokevirtual func_174791_d : ()Lnet/minecraft/util/math/Vec3d;
    //   128: getfield field_72450_a : D
    //   131: aload_0
    //   132: invokevirtual func_174791_d : ()Lnet/minecraft/util/math/Vec3d;
    //   135: getfield field_72448_b : D
    //   138: aload_0
    //   139: invokevirtual func_174791_d : ()Lnet/minecraft/util/math/Vec3d;
    //   142: getfield field_72449_c : D
    //   145: invokevirtual func_70634_a : (DDD)V
    //   148: aload_0
    //   149: aload_2
    //   150: iconst_0
    //   151: invokevirtual a : (Lnet/minecraft/entity/player/EntityPlayerMP;Z)V
    //   154: aload_2
    //   155: fconst_0
    //   156: fconst_0
    //   157: fconst_0
    //   158: fconst_0
    //   159: invokevirtual func_191958_b : (FFFF)V
    //   162: aload_0
    //   163: dconst_0
    //   164: dconst_0
    //   165: ldc2_w 0.4
    //   168: fconst_0
    //   169: ldc 60.0
    //   171: invokevirtual a : (DDDFF)V
    //   174: aload_0
    //   175: aconst_null
    //   176: putfield w : Lnet/minecraft/util/math/Vec3d;
    //   179: aload_0
    //   180: getstatic com/schnurritv/sexmod/m.DOGGYSTART : Lcom/schnurritv/sexmod/m;
    //   183: invokevirtual c : (Lcom/schnurritv/sexmod/m;)V
    //   186: getstatic com/schnurritv/sexmod/aV.a : Lnet/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper;
    //   189: new com/schnurritv/sexmod/aw
    //   192: dup
    //   193: iconst_0
    //   194: invokespecial <init> : (Z)V
    //   197: aload_2
    //   198: invokevirtual sendTo : (Lnet/minecraftforge/fml/common/network/simpleimpl/IMessage;Lnet/minecraft/entity/player/EntityPlayerMP;)V
    //   201: aload_0
    //   202: getfield V : Z
    //   205: ifeq -> 394
    //   208: aload_0
    //   209: invokevirtual func_174791_d : ()Lnet/minecraft/util/math/Vec3d;
    //   212: aload_0
    //   213: invokevirtual I : ()Lnet/minecraft/util/math/Vec3d;
    //   216: invokevirtual func_72438_d : (Lnet/minecraft/util/math/Vec3d;)D
    //   219: ldc2_w 0.6
    //   222: dcmpg
    //   223: iflt -> 250
    //   226: goto -> 233
    //   229: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   232: athrow
    //   233: aload_0
    //   234: getfield W : I
    //   237: sipush #200
    //   240: if_icmple -> 313
    //   243: goto -> 250
    //   246: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   249: athrow
    //   250: aload_0
    //   251: iconst_0
    //   252: putfield V : Z
    //   255: aload_0
    //   256: getfield p : Lnet/minecraft/network/datasync/EntityDataManager;
    //   259: getstatic com/schnurritv/sexmod/b8.z : Lnet/minecraft/network/datasync/DataParameter;
    //   262: iconst_1
    //   263: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   266: invokevirtual func_187227_b : (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
    //   269: aload_0
    //   270: iconst_0
    //   271: putfield W : I
    //   274: aload_0
    //   275: iconst_1
    //   276: putfield field_70145_X : Z
    //   279: aload_0
    //   280: iconst_1
    //   281: invokevirtual func_189654_d : (Z)V
    //   284: aload_0
    //   285: dconst_0
    //   286: putfield field_70159_w : D
    //   289: aload_0
    //   290: dconst_0
    //   291: putfield field_70181_x : D
    //   294: aload_0
    //   295: dconst_0
    //   296: putfield field_70179_y : D
    //   299: aload_0
    //   300: getstatic com/schnurritv/sexmod/m.STARTDOGGY : Lcom/schnurritv/sexmod/m;
    //   303: invokevirtual c : (Lcom/schnurritv/sexmod/m;)V
    //   306: goto -> 394
    //   309: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   312: athrow
    //   313: aload_0
    //   314: dup
    //   315: getfield W : I
    //   318: iconst_1
    //   319: iadd
    //   320: putfield W : I
    //   323: aload_0
    //   324: getfield W : I
    //   327: bipush #60
    //   329: if_icmpeq -> 348
    //   332: aload_0
    //   333: getfield W : I
    //   336: bipush #120
    //   338: if_icmpne -> 394
    //   341: goto -> 348
    //   344: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   347: athrow
    //   348: aload_0
    //   349: invokevirtual func_70661_as : ()Lnet/minecraft/pathfinding/PathNavigate;
    //   352: invokevirtual func_75499_g : ()V
    //   355: aload_0
    //   356: invokevirtual func_70661_as : ()Lnet/minecraft/pathfinding/PathNavigate;
    //   359: aload_0
    //   360: invokevirtual I : ()Lnet/minecraft/util/math/Vec3d;
    //   363: getfield field_72450_a : D
    //   366: aload_0
    //   367: invokevirtual I : ()Lnet/minecraft/util/math/Vec3d;
    //   370: getfield field_72448_b : D
    //   373: aload_0
    //   374: invokevirtual I : ()Lnet/minecraft/util/math/Vec3d;
    //   377: getfield field_72449_c : D
    //   380: ldc2_w 0.35
    //   383: invokevirtual func_75492_a : (DDDD)Z
    //   386: pop
    //   387: goto -> 394
    //   390: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   393: athrow
    //   394: aload_0
    //   395: getfield ab : Z
    //   398: ifeq -> 609
    //   401: aload_0
    //   402: dup
    //   403: getfield aa : I
    //   406: iconst_1
    //   407: iadd
    //   408: putfield aa : I
    //   411: aload_0
    //   412: invokevirtual func_174791_d : ()Lnet/minecraft/util/math/Vec3d;
    //   415: getstatic com/schnurritv/sexmod/b8.m : Lnet/minecraft/network/datasync/DataParameter;
    //   418: invokevirtual equals : (Ljava/lang/Object;)Z
    //   421: ifne -> 447
    //   424: goto -> 431
    //   427: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   430: athrow
    //   431: aload_0
    //   432: getfield aa : I
    //   435: bipush #40
    //   437: if_icmple -> 550
    //   440: goto -> 447
    //   443: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   446: athrow
    //   447: aload_0
    //   448: iconst_0
    //   449: putfield ab : Z
    //   452: aload_0
    //   453: iconst_0
    //   454: putfield aa : I
    //   457: aload_0
    //   458: aload_0
    //   459: getfield field_70170_p : Lnet/minecraft/world/World;
    //   462: invokevirtual func_73046_m : ()Lnet/minecraft/server/MinecraftServer;
    //   465: invokevirtual func_184103_al : ()Lnet/minecraft/server/management/PlayerList;
    //   468: aload_0
    //   469: invokevirtual n : ()Ljava/util/UUID;
    //   472: invokevirtual func_177451_a : (Ljava/util/UUID;)Lnet/minecraft/entity/player/EntityPlayerMP;
    //   475: getfield field_70177_z : F
    //   478: ldc 180.0
    //   480: fadd
    //   481: invokevirtual a : (F)V
    //   484: aload_0
    //   485: getfield p : Lnet/minecraft/network/datasync/EntityDataManager;
    //   488: getstatic com/schnurritv/sexmod/b8.z : Lnet/minecraft/network/datasync/DataParameter;
    //   491: iconst_1
    //   492: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   495: invokevirtual func_187227_b : (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
    //   498: aload_0
    //   499: invokevirtual func_70661_as : ()Lnet/minecraft/pathfinding/PathNavigate;
    //   502: invokevirtual func_75499_g : ()V
    //   505: aload_0
    //   506: getfield p : Lnet/minecraft/network/datasync/EntityDataManager;
    //   509: getstatic com/schnurritv/sexmod/b8.Z : Lnet/minecraft/network/datasync/DataParameter;
    //   512: invokevirtual func_187225_a : (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
    //   515: checkcast java/lang/Boolean
    //   518: invokevirtual booleanValue : ()Z
    //   521: ifeq -> 540
    //   524: goto -> 531
    //   527: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   530: athrow
    //   531: aload_0
    //   532: invokevirtual q : ()V
    //   535: return
    //   536: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   539: athrow
    //   540: aload_0
    //   541: getstatic com/schnurritv/sexmod/m.PAYMENT : Lcom/schnurritv/sexmod/m;
    //   544: invokevirtual c : (Lcom/schnurritv/sexmod/m;)V
    //   547: goto -> 609
    //   550: aload_0
    //   551: aload_0
    //   552: invokevirtual s : ()Ljava/lang/Float;
    //   555: invokevirtual floatValue : ()F
    //   558: putfield field_70177_z : F
    //   561: aload_0
    //   562: aload_0
    //   563: invokevirtual y : ()Lnet/minecraft/util/math/Vec3d;
    //   566: invokevirtual a : (Lnet/minecraft/util/math/Vec3d;)V
    //   569: aload_0
    //   570: iconst_0
    //   571: invokevirtual func_189654_d : (Z)V
    //   574: aload_0
    //   575: invokevirtual func_174791_d : ()Lnet/minecraft/util/math/Vec3d;
    //   578: aload_0
    //   579: invokevirtual I : ()Lnet/minecraft/util/math/Vec3d;
    //   582: bipush #40
    //   584: aload_0
    //   585: getfield aa : I
    //   588: isub
    //   589: invokestatic a : (Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;I)Lnet/minecraft/util/math/Vec3d;
    //   592: astore_2
    //   593: aload_0
    //   594: aload_2
    //   595: getfield field_72450_a : D
    //   598: aload_2
    //   599: getfield field_72448_b : D
    //   602: aload_2
    //   603: getfield field_72449_c : D
    //   606: invokevirtual func_70107_b : (DDD)V
    //   609: return
    // Exception table:
    //   from	to	target	type
    //   16	27	30	java/lang/RuntimeException
    //   23	52	55	java/lang/RuntimeException
    //   201	226	229	java/lang/RuntimeException
    //   208	243	246	java/lang/RuntimeException
    //   233	309	309	java/lang/RuntimeException
    //   313	341	344	java/lang/RuntimeException
    //   332	387	390	java/lang/RuntimeException
    //   394	424	427	java/lang/RuntimeException
    //   401	440	443	java/lang/RuntimeException
    //   431	524	527	java/lang/RuntimeException
    //   447	536	536	java/lang/RuntimeException
  }
  
  public boolean func_184645_a(EntityPlayer paramEntityPlayer, EnumHand paramEnumHand) {
    try {
      if (super.func_184645_a(paramEntityPlayer, paramEnumHand))
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.field_70170_p.field_72995_K)
        try {
          if (!a(paramEntityPlayer))
            b(I18n.func_135052_a("jenny.dialogue.busy", new Object[0])); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return true;
  }
  
  public void func_70071_h_() {
    try {
      super.func_70071_h_();
      if (!this.field_70170_p.field_72995_K)
        this.p.func_187227_b(Z, Boolean.valueOf(func_70644_a(ba.b))); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public boolean a(EntityPlayer paramEntityPlayer) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual n : ()Ljava/util/UUID;
    //   4: ifnonnull -> 259
    //   7: aload_0
    //   8: invokevirtual O : ()Z
    //   11: ifeq -> 59
    //   14: goto -> 21
    //   17: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   20: athrow
    //   21: aload_0
    //   22: getfield p : Lnet/minecraft/network/datasync/EntityDataManager;
    //   25: getstatic com/schnurritv/sexmod/b8.b : Lnet/minecraft/network/datasync/DataParameter;
    //   28: invokevirtual func_187225_a : (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
    //   31: checkcast java/lang/String
    //   34: invokestatic func_71410_x : ()Lnet/minecraft/client/Minecraft;
    //   37: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   40: invokevirtual getPersistentID : ()Ljava/util/UUID;
    //   43: invokevirtual toString : ()Ljava/lang/String;
    //   46: invokevirtual equals : (Ljava/lang/Object;)Z
    //   49: ifeq -> 259
    //   52: goto -> 59
    //   55: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   58: athrow
    //   59: iconst_4
    //   60: anewarray java/lang/String
    //   63: dup
    //   64: iconst_0
    //   65: ldc 'action.names.blowjob'
    //   67: aastore
    //   68: dup
    //   69: iconst_1
    //   70: ldc 'action.names.boobjob'
    //   72: aastore
    //   73: dup
    //   74: iconst_2
    //   75: ldc 'action.names.doggy'
    //   77: aastore
    //   78: dup
    //   79: iconst_3
    //   80: aload_0
    //   81: getfield p : Lnet/minecraft/network/datasync/EntityDataManager;
    //   84: getstatic com/schnurritv/sexmod/b8.F : Lnet/minecraft/network/datasync/DataParameter;
    //   87: invokevirtual func_187225_a : (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
    //   90: checkcast java/lang/Integer
    //   93: invokevirtual intValue : ()I
    //   96: iconst_1
    //   97: if_icmpne -> 116
    //   100: goto -> 107
    //   103: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   106: athrow
    //   107: ldc 'action.names.strip'
    //   109: goto -> 118
    //   112: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   115: athrow
    //   116: ldc 'action.names.dressup'
    //   118: aastore
    //   119: astore_2
    //   120: aload_0
    //   121: getfield p : Lnet/minecraft/network/datasync/EntityDataManager;
    //   124: getstatic com/schnurritv/sexmod/b8.Z : Lnet/minecraft/network/datasync/DataParameter;
    //   127: invokevirtual func_187225_a : (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
    //   130: checkcast java/lang/Boolean
    //   133: invokevirtual booleanValue : ()Z
    //   136: ifeq -> 152
    //   139: aload_1
    //   140: aload_0
    //   141: aload_2
    //   142: iconst_1
    //   143: invokestatic a : (Lnet/minecraft/entity/player/EntityPlayer;Lcom/schnurritv/sexmod/bS;[Ljava/lang/String;Z)V
    //   146: iconst_1
    //   147: ireturn
    //   148: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   151: athrow
    //   152: aload_1
    //   153: aload_0
    //   154: aload_2
    //   155: iconst_4
    //   156: anewarray net/minecraft/item/ItemStack
    //   159: dup
    //   160: iconst_0
    //   161: new net/minecraft/item/ItemStack
    //   164: dup
    //   165: getstatic net/minecraft/init/Items.field_151166_bC : Lnet/minecraft/item/Item;
    //   168: iconst_3
    //   169: invokespecial <init> : (Lnet/minecraft/item/Item;I)V
    //   172: aastore
    //   173: dup
    //   174: iconst_1
    //   175: new net/minecraft/item/ItemStack
    //   178: dup
    //   179: getstatic net/minecraft/init/Items.field_151079_bi : Lnet/minecraft/item/Item;
    //   182: iconst_2
    //   183: invokespecial <init> : (Lnet/minecraft/item/Item;I)V
    //   186: aastore
    //   187: dup
    //   188: iconst_2
    //   189: new net/minecraft/item/ItemStack
    //   192: dup
    //   193: getstatic net/minecraft/init/Items.field_151045_i : Lnet/minecraft/item/Item;
    //   196: iconst_2
    //   197: invokespecial <init> : (Lnet/minecraft/item/Item;I)V
    //   200: aastore
    //   201: dup
    //   202: iconst_3
    //   203: aload_0
    //   204: getfield p : Lnet/minecraft/network/datasync/EntityDataManager;
    //   207: getstatic com/schnurritv/sexmod/b8.F : Lnet/minecraft/network/datasync/DataParameter;
    //   210: invokevirtual func_187225_a : (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
    //   213: checkcast java/lang/Integer
    //   216: invokevirtual intValue : ()I
    //   219: iconst_1
    //   220: if_icmpne -> 241
    //   223: new net/minecraft/item/ItemStack
    //   226: dup
    //   227: getstatic net/minecraft/init/Items.field_151043_k : Lnet/minecraft/item/Item;
    //   230: iconst_1
    //   231: invokespecial <init> : (Lnet/minecraft/item/Item;I)V
    //   234: goto -> 252
    //   237: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   240: athrow
    //   241: new net/minecraft/item/ItemStack
    //   244: dup
    //   245: getstatic net/minecraft/init/Items.field_190931_a : Lnet/minecraft/item/Item;
    //   248: iconst_0
    //   249: invokespecial <init> : (Lnet/minecraft/item/Item;I)V
    //   252: aastore
    //   253: iconst_1
    //   254: invokestatic a : (Lnet/minecraft/entity/player/EntityPlayer;Lcom/schnurritv/sexmod/bS;[Ljava/lang/String;[Lnet/minecraft/item/ItemStack;Z)V
    //   257: iconst_1
    //   258: ireturn
    //   259: iconst_0
    //   260: ireturn
    // Exception table:
    //   from	to	target	type
    //   0	14	17	java/lang/RuntimeException
    //   7	52	55	java/lang/RuntimeException
    //   21	100	103	java/lang/RuntimeException
    //   59	112	112	java/lang/RuntimeException
    //   120	148	148	java/lang/RuntimeException
    //   152	237	237	java/lang/RuntimeException
  }
  
  public void a(String paramString, UUID paramUUID) {
    try {
      super.a(paramString, paramUUID);
      if ("action.names.blowjob".equals(paramString)) {
        a("animationFollowUp", "blowjob");
        a(true, paramUUID);
      } else {
        try {
          if ("action.names.boobjob".equals(paramString)) {
            a("animationFollowUp", "boobjob");
            a(true, paramUUID);
          } else {
            try {
              if ("action.names.doggy".equals(paramString)) {
                a("animationFollowUp", "doggy");
                a(true, paramUUID);
              } else {
                try {
                  if ("action.names.strip".equals(paramString)) {
                    a("animationFollowUp", "strip");
                    a(true, paramUUID);
                  } else {
                    try {
                      if ("action.names.dressup".equals(paramString))
                        c(m.STRIP); 
                    } catch (RuntimeException runtimeException) {
                      throw a(null);
                    } 
                  } 
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                } 
              } 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  protected void a(boolean paramBoolean, UUID paramUUID) {
    a(paramBoolean, true, paramUUID);
    aK.a(false);
  }
  
  public void a() {
    BlockPos blockPos = a(func_180425_c());
    try {
      if (blockPos == null) {
        a(L.GIRLS_JENNY_HMPH[2]);
        b(I18n.func_135052_a("jenny.dialogue.nobedinsight", new Object[0]));
      } else {
        this.field_70714_bg.func_85156_a((EntityAIBase)this.c);
        this.field_70714_bg.func_85156_a((EntityAIBase)this.t);
        Vec3d vec3d1 = new Vec3d(blockPos.func_177958_n(), blockPos.func_177956_o(), blockPos.func_177952_p());
        int[] arrayOfInt = { 0, 180, -90, 90 };
        Vec3d[][] arrayOfVec3d = { { new Vec3d(0.5D, 0.0D, -0.5D), new Vec3d(0.0D, 0.0D, -1.0D) }, { new Vec3d(0.5D, 0.0D, 1.5D), new Vec3d(0.0D, 0.0D, 1.0D) }, { new Vec3d(-0.5D, 0.0D, 0.5D), new Vec3d(-1.0D, 0.0D, 0.0D) }, { new Vec3d(1.5D, 0.0D, 0.5D), new Vec3d(1.0D, 0.0D, 0.0D) } };
        byte b = -1;
        for (byte b1 = 0; b1 < arrayOfVec3d.length; b1++) {
          Vec3d vec3d = vec3d1.func_178787_e(arrayOfVec3d[b1][1]);
          try {
            if (this.field_70170_p.func_180495_p(new BlockPos(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c)).func_177230_c() == Blocks.field_150350_a)
              if (b == -1) {
                b = b1;
              } else {
                double d1 = func_180425_c().func_177954_c((vec3d1.func_178787_e(arrayOfVec3d[b][0])).field_72450_a, (vec3d1.func_178787_e(arrayOfVec3d[b][0])).field_72448_b, (vec3d1.func_178787_e(arrayOfVec3d[b][0])).field_72449_c);
                double d2 = func_180425_c().func_177954_c((vec3d1.func_178787_e(arrayOfVec3d[b1][0])).field_72450_a, (vec3d1.func_178787_e(arrayOfVec3d[b1][0])).field_72448_b, (vec3d1.func_178787_e(arrayOfVec3d[b1][0])).field_72449_c);
                if (d2 < d1)
                  b = b1; 
              }  
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
        } 
        try {
          if (b == -1) {
            a(L.GIRLS_JENNY_HMPH[2]);
            b(I18n.func_135052_a("jenny.dialogue.bedobscured", new Object[0]));
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        Vec3d vec3d2 = vec3d1.func_178787_e(arrayOfVec3d[b][0]);
        a(false);
        a(arrayOfInt[b]);
        a(new Vec3d(vec3d2.field_72450_a, vec3d2.field_72448_b, vec3d2.field_72449_c));
        this.h = s().floatValue();
        func_70661_as().func_75499_g();
        func_70661_as().func_75492_a(vec3d2.field_72450_a, vec3d2.field_72448_b, vec3d2.field_72449_c, 0.35D);
        this.V = true;
        this.W = 0;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void c(m paramm) {
    m m1 = o();
    try {
      if (m1 == m.DOGGYCUM)
        try {
          if (paramm != m.DOGGYSLOW) {
            try {
              if (paramm == m.DOGGYFAST)
                return; 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
          } else {
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (m1 == m.CUMBLOWJOB)
        try {
          if (paramm != m.THRUSTBLOWJOB) {
            try {
              if (paramm == m.SUCKBLOWJOB)
                return; 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
          } else {
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (m1 == m.PAIZURI_CUM)
        try {
          if (paramm != m.PAIZURI_SLOW) {
            try {
              if (paramm == m.PAIZURI_FAST)
                return; 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
          } else {
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      super.c(paramm);
      if (m1 != m.STARTBLOWJOB)
        try {
          if (m1 != m.PAIZURI_START)
            return; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    UUID uUID = n();
    try {
      if (uUID == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(uUID);
    try {
      if (entityPlayer == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Vec3d vec3d = aH.a(new Vec3d(0.0D, 0.0D, 0.2D), s().floatValue() + 180.0F);
    entityPlayer.func_70634_a(entityPlayer.field_70165_t + vec3d.field_72450_a, entityPlayer.field_70163_u, entityPlayer.field_70161_v + vec3d.field_72449_c);
  }
  
  protected m a(m paramm) {
    try {
      if (paramm != m.SUCKBLOWJOB) {
        try {
          if (paramm == m.THRUSTBLOWJOB) {
            a(0.0D, 0.0D, 0.0D, 0.0F, 70.0F);
            return m.CUMBLOWJOB;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } else {
        a(0.0D, 0.0D, 0.0D, 0.0F, 70.0F);
        return m.CUMBLOWJOB;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramm != m.DOGGYSLOW) {
        try {
          if (paramm == m.DOGGYFAST)
            return m.DOGGYCUM; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } else {
        return m.DOGGYCUM;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramm != m.PAIZURI_FAST)
        try {
          return (paramm != m.PAIZURI_SLOW) ? null : m.PAIZURI_CUM;
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return m.PAIZURI_CUM;
  }
  
  protected m b(m paramm) {
    try {
      switch (a.b[paramm.ordinal()]) {
        case 1:
          return m.THRUSTBLOWJOB;
        case 2:
          return m.DOGGYFAST;
        case 3:
          try {
            if (this.U) {
              this.U = false;
              a(0.0D, 0.0D, 0.20000000298023224D, 0.0F, 70.0F);
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          return m.PAIZURI_FAST;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return null;
  }
  
  public void b() {
    this.ab = true;
  }
  
  public void D() {
    this.c = new EntityAIWanderAvoidWater(this, 0.35D);
    this.t = new q((EntityLiving)this, (Class)EntityPlayer.class, 3.0F, 1.0F);
    this.field_70714_bg.func_75776_a(5, (EntityAIBase)this.t);
    this.field_70714_bg.func_75776_a(5, (EntityAIBase)this.c);
  }
  
  protected void q() {
    String str = (String)this.p.func_187225_a(u);
    byte b = -1;
    try {
      switch (str.hashCode()) {
        case 109773592:
          if (str.equals("strip"))
            b = 0; 
          break;
        case -20842805:
          if (str.equals("blowjob"))
            b = 1; 
          break;
        case 64419037:
          if (str.equals("boobjob"))
            b = 2; 
          break;
        case 95761198:
          if (str.equals("doggy"))
            b = 3; 
          break;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      switch (b) {
        case 0:
          f();
          c(m.STRIP);
          break;
        case 1:
          c(m.STARTBLOWJOB);
          break;
        case 2:
          try {
            if (((Integer)this.p.func_187225_a(bS.F)).intValue() != 0) {
              c(m.STRIP);
              return;
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          c(m.PAIZURI_START);
          break;
        case 3:
          try {
            if (((Integer)this.p.func_187225_a(bS.F)).intValue() != 0) {
              c(m.STRIP);
              f();
              return;
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          try {
            i();
            if (this.field_70170_p.field_72995_K) {
              aV.a.sendToServer(new E(N()));
              break;
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          f();
          a();
          break;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.field_70170_p.field_72995_K) {
        a("animationFollowUp", "");
      } else {
        this.p.func_187227_b(u, "");
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  protected <E extends software.bernie.geckolib3.core.IAnimatable> PlayState a(AnimationEvent<E> paramAnimationEvent) {
    try {
      if (this.field_70170_p instanceof com.c)
        return null; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    String str = paramAnimationEvent.getController().getName();
    byte b = -1;
    try {
      switch (str.hashCode()) {
        case 3128418:
          if (str.equals("eyes"))
            b = 0; 
          break;
        case -103677777:
          if (str.equals("movement"))
            b = 1; 
          break;
        case -1422950858:
          if (str.equals("action"))
            b = 2; 
          break;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      switch (b) {
        case 0:
          try {
            if (o() == m.NULL) {
              try {
                if ((o()).autoBlink) {
                  a("animation.jenny.fhappy", true, paramAnimationEvent);
                  break;
                } 
                a("animation.jenny.null", true, paramAnimationEvent);
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          a("animation.jenny.null", true, paramAnimationEvent);
        case 1:
          try {
            if (o() != m.NULL)
              try {
                if (o() != null) {
                  a("animation.jenny.null", true, paramAnimationEvent);
                  break;
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              }  
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          try {
            if (func_184218_aH()) {
              a("animation.jenny.sit", true, paramAnimationEvent);
              break;
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          try {
            if (Math.abs(this.field_70169_q - this.field_70165_t) + Math.abs(this.field_70166_s - this.field_70161_v) > 0.0D) {
              try {
                switch (a.a[w().ordinal()]) {
                  case 1:
                    a("animation.jenny.run", true, paramAnimationEvent);
                    break;
                  case 2:
                    a("animation.jenny.fastwalk", true, paramAnimationEvent);
                    break;
                  case 3:
                    a("animation.jenny.walk", true, paramAnimationEvent);
                    break;
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              this.field_70177_z = this.field_70759_as;
              break;
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          a("animation.jenny.idle", true, paramAnimationEvent);
          break;
        case 2:
          try {
            switch (a.b[o().ordinal()]) {
              case 4:
                a("animation.jenny.null", true, paramAnimationEvent);
                break;
              case 5:
                a("animation.jenny.strip", false, paramAnimationEvent);
                break;
              case 6:
                a("animation.jenny.payment", false, paramAnimationEvent);
                break;
              case 7:
                a("animation.jenny.blowjobintro", false, paramAnimationEvent);
                break;
              case 1:
                a("animation.jenny.blowjobsuck", true, paramAnimationEvent);
                break;
              case 8:
                a("animation.jenny.blowjobthrust", true, paramAnimationEvent);
                break;
              case 9:
                a("animation.jenny.blowjobcum", false, paramAnimationEvent);
                break;
              case 10:
                a("animation.jenny.doggygoonbed", false, paramAnimationEvent);
                break;
              case 11:
                a("animation.jenny.doggywait", true, paramAnimationEvent);
                break;
              case 12:
                a("animation.jenny.doggystart", false, paramAnimationEvent);
                break;
              case 2:
                a("animation.jenny.doggyslow", true, paramAnimationEvent);
                break;
              case 13:
                a("animation.jenny.doggyfast", true, paramAnimationEvent);
                break;
              case 14:
                a("animation.jenny.doggycum", false, paramAnimationEvent);
                break;
              case 15:
                a("animation.jenny.attack" + this.T, false, paramAnimationEvent);
                break;
              case 16:
                a("animation.jenny.bowcharge", false, paramAnimationEvent);
                break;
              case 17:
                a("animation.jenny.ride", true, paramAnimationEvent);
                break;
              case 18:
                a("animation.jenny.sit", true, paramAnimationEvent);
                break;
              case 19:
                a("animation.jenny.throwpearl", false, paramAnimationEvent);
                break;
              case 20:
                a("animation.jenny.downed", true, paramAnimationEvent);
                break;
              case 21:
                a("animation.jenny.paizuri_start", false, paramAnimationEvent);
                break;
              case 3:
                a("animation.jenny.paizuri_slow", true, paramAnimationEvent);
                break;
              case 22:
                a("animation.jenny.paizuri_fast", true, paramAnimationEvent);
                break;
              case 23:
                a("animation.jenny.paizuri_cum", false, paramAnimationEvent);
                break;
              case 24:
                a("animation.jenny.wave", true, paramAnimationEvent);
                break;
              case 25:
                a("animation.jenny.wave_idle", true, paramAnimationEvent);
                break;
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          break;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return PlayState.CONTINUE;
  }
  
  @SideOnly(Side.CLIENT)
  public void registerControllers(AnimationData paramAnimationData) {
    try {
      super.registerControllers(paramAnimationData);
      if (this.k == null)
        S(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    AnimationController.ISoundListener iSoundListener = paramSoundKeyframeEvent -> {
        String str = paramSoundKeyframeEvent.sound;
        byte b = -1;
        try {
          switch (str.hashCode()) {
            case -676816985:
              if (str.equals("attackSound"))
                b = 0; 
              break;
            case -1961942550:
              if (str.equals("attackDone"))
                b = 1; 
              break;
            case -558244113:
              if (str.equals("becomeNude"))
                b = 2; 
              break;
            case -188461382:
              if (str.equals("stripDone"))
                b = 3; 
              break;
            case -188221432:
              if (str.equals("stripMSG1"))
                b = 4; 
              break;
            case -1540620298:
              if (str.equals("paymentMSG1"))
                b = 5; 
              break;
            case -1540620297:
              if (str.equals("paymentMSG2"))
                b = 6; 
              break;
            case -1540620296:
              if (str.equals("paymentMSG3"))
                b = 7; 
              break;
            case 1988710681:
              if (str.equals("sexUiOn"))
                b = 8; 
              break;
            case -1540620295:
              if (str.equals("paymentMSG4"))
                b = 9; 
              break;
            case -1540860248:
              if (str.equals("paymentDone"))
                b = 10; 
              break;
            case -84916847:
              if (str.equals("bjiMSG1"))
                b = 11; 
              break;
            case -84916846:
              if (str.equals("bjiMSG2"))
                b = 12; 
              break;
            case -84916845:
              if (str.equals("bjiMSG3"))
                b = 13; 
              break;
            case -84916844:
              if (str.equals("bjiMSG4"))
                b = 14; 
              break;
            case -84916843:
              if (str.equals("bjiMSG5"))
                b = 15; 
              break;
            case -84916842:
              if (str.equals("bjiMSG6"))
                b = 16; 
              break;
            case -84916841:
              if (str.equals("bjiMSG7"))
                b = 17; 
              break;
            case -84916840:
              if (str.equals("bjiMSG8"))
                b = 18; 
              break;
            case -84916839:
              if (str.equals("bjiMSG9"))
                b = 19; 
              break;
            case 1662545087:
              if (str.equals("bjiMSG10"))
                b = 20; 
              break;
            case 1662545088:
              if (str.equals("bjiMSG11"))
                b = 21; 
              break;
            case 1662545089:
              if (str.equals("bjiMSG12"))
                b = 22; 
              break;
            case -74758116:
              if (str.equals("bjtMSG1"))
                b = 23; 
              break;
            case -85156797:
              if (str.equals("bjiDone"))
                b = 24; 
              break;
            case -74998066:
              if (str.equals("bjtDone"))
                b = 25; 
              break;
            case 441346873:
              if (str.equals("doggyfastReady"))
                b = 26; 
              break;
            case 1982646231:
              if (str.equals("bjtReady"))
                b = 27; 
              break;
            case 1668024441:
              if (str.equals("paizuriReady"))
                b = 28; 
              break;
            case -90457973:
              if (str.equals("bjcMSG1"))
                b = 29; 
              break;
            case -90457972:
              if (str.equals("bjcMSG2"))
                b = 30; 
              break;
            case -90457971:
              if (str.equals("bjcMSG3"))
                b = 31; 
              break;
            case -90457970:
              if (str.equals("bjcMSG4"))
                b = 32; 
              break;
            case -90457969:
              if (str.equals("bjcMSG5"))
                b = 33; 
              break;
            case -90457968:
              if (str.equals("bjcMSG6"))
                b = 34; 
              break;
            case -90457967:
              if (str.equals("bjcMSG7"))
                b = 35; 
              break;
            case -1370194640:
              if (str.equals("bjcBlackScreen"))
                b = 36; 
              break;
            case -90697923:
              if (str.equals("bjcDone"))
                b = 37; 
              break;
            case -669376408:
              if (str.equals("paizuri_cumDone"))
                b = 38; 
              break;
            case 1092262223:
              if (str.equals("doggyCumDone"))
                b = 39; 
              break;
            case 2106063356:
              if (str.equals("doggyGoOnBedMSG1"))
                b = 40; 
              break;
            case 2106063357:
              if (str.equals("doggyGoOnBedMSG2"))
                b = 41; 
              break;
            case 2106063358:
              if (str.equals("doggyGoOnBedMSG3"))
                b = 42; 
              break;
            case 2106063359:
              if (str.equals("doggyGoOnBedMSG4"))
                b = 43; 
              break;
            case 2105823406:
              if (str.equals("doggyGoOnBedDone"))
                b = 44; 
              break;
            case -1648851740:
              if (str.equals("doggystartMSG1"))
                b = 45; 
              break;
            case -1648851739:
              if (str.equals("doggystartMSG2"))
                b = 46; 
              break;
            case -1648851738:
              if (str.equals("doggystartMSG3"))
                b = 47; 
              break;
            case -1648851737:
              if (str.equals("doggystartMSG4"))
                b = 48; 
              break;
            case -1648851736:
              if (str.equals("doggystartMSG5"))
                b = 49; 
              break;
            case -1649091690:
              if (str.equals("doggystartDone"))
                b = 50; 
              break;
            case -2038339681:
              if (str.equals("doggyslowMSG1"))
                b = 51; 
              break;
            case -2038339680:
              if (str.equals("doggyslowMSG2"))
                b = 52; 
              break;
            case 14069882:
              if (str.equals("doggyfastMSG1"))
                b = 53; 
              break;
            case 13829932:
              if (str.equals("doggyfastDone"))
                b = 54; 
              break;
            case -572151107:
              if (str.equals("doggycumMSG1"))
                b = 55; 
              break;
            case -572151106:
              if (str.equals("doggycumMSG2"))
                b = 56; 
              break;
            case -572151105:
              if (str.equals("doggycumMSG3"))
                b = 57; 
              break;
            case -572151104:
              if (str.equals("doggycumMSG4"))
                b = 58; 
              break;
            case -572151103:
              if (str.equals("doggycumMSG5"))
                b = 59; 
              break;
            case 106540102:
              if (str.equals("pearl"))
                b = 60; 
              break;
            case -1149499193:
              if (str.equals("boobjob_camera"))
                b = 61; 
              break;
            case -362733489:
              if (str.equals("paizuri_startDone"))
                b = 62; 
              break;
            case 1179444406:
              if (str.equals("paizuriFastMSG1"))
                b = 63; 
              break;
            case -872965157:
              if (str.equals("paizuriSlowMSG1"))
                b = 64; 
              break;
            case 118020136:
              if (str.equals("paizuriStartMSG1"))
                b = 65; 
              break;
            case 1302251347:
              if (str.equals("paizuri_fastDone"))
                b = 66; 
              break;
            case -362282087:
              if (str.equals("paizuri_startStep"))
                b = 67; 
              break;
            case 738157628:
              if (str.equals("paizuri_cumStart"))
                b = 68; 
              break;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        try {
          String str1;
          String str2;
          int i;
          int j;
          UUID uUID;
          IBlockState iBlockState;
          switch (b) {
            case 0:
              a(SoundEvents.field_187727_dV);
              break;
            case 1:
              try {
                c(m.NULL);
                if (++this.T == 3)
                  this.T = 0; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 2:
              try {
                if (E()) {
                  try {
                  
                  } catch (RuntimeException runtimeException) {
                    throw a(null);
                  } 
                  a("currentModel", (((Integer)this.p.func_187225_a(F)).intValue() == 1) ? "0" : "1");
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 3:
              try {
                if (!((String)this.p.func_187225_a(u)).equals("boobjob"))
                  i(); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              q();
              break;
            case 4:
              a(I18n.func_135052_a("jenny.dialogue.hihi", new Object[0]));
              a(L.a(L.GIRLS_JENNY_GIGGLE));
              break;
            case 5:
              a(I18n.func_135052_a("jenny.dialogue.huh", new Object[0]));
              a(L.GIRLS_JENNY_HUH[1]);
              break;
            case 6:
              a(L.MISC_PLOB[0], 0.5F);
              str1 = "<" + (Minecraft.func_71410_x()).field_71439_g.func_70005_c_() + "> ";
              str2 = (String)this.p.func_187225_a(u);
              j = -1;
              try {
                switch (str2.hashCode()) {
                  case 109773592:
                    if (str2.equals("strip"))
                      j = 0; 
                    break;
                  case -20842805:
                    if (str2.equals("blowjob"))
                      j = 1; 
                    break;
                  case 95761198:
                    if (str2.equals("doggy"))
                      j = 2; 
                    break;
                  case 64419037:
                    if (str2.equals("boobjob"))
                      j = 3; 
                    break;
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              try {
                switch (j) {
                  case 0:
                    a(str1 + I18n.func_135052_a("jenny.dialogue.showBobsandveganapls", new Object[0]), true);
                    break;
                  case 1:
                    a(str1 + I18n.func_135052_a("jenny.dialogue.giveblowjob", new Object[0]), true);
                    break;
                  case 2:
                    a(str1 + I18n.func_135052_a("jenny.dialogue.givesex", new Object[0]), true);
                    break;
                  case 3:
                    a(str1 + I18n.func_135052_a("jenny.dialogue.givebooba", new Object[0]), true);
                    break;
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              a(str1 + "sex pls", true);
              break;
            case 7:
              a(I18n.func_135052_a("jenny.dialogue.hehe", new Object[0]));
              a(L.a(L.GIRLS_JENNY_GIGGLE));
              break;
            case 8:
              try {
                if (k())
                  cG.d(); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 9:
              a(L.MISC_PLOB[0], 0.25F);
              break;
            case 10:
              q();
              break;
            case 11:
              try {
                a(I18n.func_135052_a("jenny.dialogue.blowjobtext1", new Object[0]));
                a(L.GIRLS_JENNY_MMM[8]);
                this.h = this.field_70177_z + 180.0F;
                if (k())
                  cG.c(); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 12:
              a(I18n.func_135052_a("jenny.dialogue.blowjobtext2", new Object[0]));
              a(L.GIRLS_JENNY_LIGHTBREATHING[8]);
              break;
            case 13:
              a(I18n.func_135052_a("jenny.dialogue.blowjobtext3", new Object[0]));
              a(L.GIRLS_JENNY_AFTERSESSIONMOAN[0]);
              break;
            case 14:
              a(L.MISC_BELLJINGLE[0]);
              break;
            case 15:
              try {
                a(I18n.func_135052_a("jenny.dialogue.blowjobtext4", new Object[0]));
                a(L.GIRLS_JENNY_HMPH[1], 0.5F);
                if (k())
                  cG.c(); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 16:
              a(I18n.func_135052_a("jenny.dialogue.blowjobtext5", new Object[0]));
              a(L.GIRLS_JENNY_LIGHTBREATHING[8]);
              break;
            case 17:
              a(I18n.func_135052_a("jenny.dialogue.blowjobtext6", new Object[0]));
              a(L.GIRLS_JENNY_GIGGLE[4]);
              break;
            case 18:
              a("<" + (Minecraft.func_71410_x()).field_71439_g.func_70005_c_() + "> " + I18n.func_135052_a("jenny.dialogue.blowjobtext7", new Object[0]), true);
              a(L.MISC_PLOB[0], 0.5F);
              break;
            case 19:
              a(I18n.func_135052_a("jenny.dialogue.blowjobtext8", new Object[0]));
              a(L.GIRLS_JENNY_GIGGLE[2]);
              break;
            case 20:
              try {
                if (k())
                  a(-0.65D, -0.8D, -0.25D, 60.0F, -3.0F); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 21:
              try {
                if (k())
                  try {
                    if (aK.b)
                      p(); 
                  } catch (RuntimeException runtimeException) {
                    throw a(null);
                  }  
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              try {
                a(L.a(L.GIRLS_JENNY_LIPSOUND));
                if (k())
                  cG.a(0.02D); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 22:
              try {
                if (U.f.nextInt(5) == 0)
                  a(L.a(L.GIRLS_JENNY_BJMOAN)); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              try {
                a(L.a(L.GIRLS_JENNY_LIPSOUND));
                if (k())
                  cG.a(0.02D); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 23:
              try {
                a(L.a(L.GIRLS_JENNY_MMM));
                a(L.a(L.GIRLS_JENNY_LIPSOUND));
                if (k())
                  cG.a(0.04D); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 24:
              try {
                c(m.SUCKBLOWJOB);
                if (k())
                  cG.d(); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 25:
              c(m.SUCKBLOWJOB);
              break;
            case 26:
              try {
                if (!k())
                  break; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              try {
                if (aK.b)
                  p(); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 27:
            case 28:
              try {
                if (k())
                  try {
                    if (aK.b)
                      p(); 
                  } catch (RuntimeException runtimeException) {
                    throw a(null);
                  }  
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 29:
              a(L.GIRLS_JENNY_BJMOAN[1]);
              break;
            case 30:
              try {
                a(L.GIRLS_JENNY_BJMOAN[7]);
                if (k())
                  cG.a(); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 31:
              a(L.GIRLS_JENNY_AFTERSESSIONMOAN[1]);
              break;
            case 32:
              a(L.GIRLS_JENNY_LIGHTBREATHING[0]);
              break;
            case 33:
              a(L.GIRLS_JENNY_LIGHTBREATHING[1]);
              break;
            case 34:
              a(L.GIRLS_JENNY_LIGHTBREATHING[2]);
              break;
            case 35:
              a(L.GIRLS_JENNY_LIGHTBREATHING[3]);
              break;
            case 36:
              try {
                if (k())
                  bd.b(); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 37:
            case 38:
            case 39:
              try {
                if (k()) {
                  cG.c();
                  i();
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 40:
              a(L.MISC_BEDRUSTLE[0]);
              this.h = this.field_70177_z;
              break;
            case 41:
              b(I18n.func_135052_a("jenny.dialogue.doggytext1", new Object[0]));
              a(L.GIRLS_JENNY_LIGHTBREATHING[9]);
              break;
            case 42:
              b(I18n.func_135052_a("jenny.dialogue.doggytext2", new Object[0]));
              a(L.GIRLS_JENNY_GIGGLE[0]);
              break;
            case 43:
              a(L.MISC_SLAP[0], 0.75F);
              break;
            case 44:
              aV.a.sendToServer(new cA(N(), (Minecraft.func_71410_x()).field_71439_g.getPersistentID()));
              c(m.WAITDOGGY);
              break;
            case 45:
              a(L.MISC_TOUCH[0]);
              break;
            case 46:
              a(L.MISC_TOUCH[1]);
              break;
            case 47:
              a(L.MISC_BEDRUSTLE[1], 0.5F);
              break;
            case 48:
              try {
                a(L.a(L.MISC_SMALLINSERTS));
                a(L.GIRLS_JENNY_MMM[1]);
                if (k())
                  cG.c(); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 49:
              a(L.a(L.MISC_POUNDING), 0.33F);
              a(L.a(L.GIRLS_JENNY_MOAN));
              break;
            case 50:
              try {
                c(m.DOGGYSLOW);
                if (k())
                  cG.d(); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 51:
              a(L.a(L.MISC_POUNDING), 0.33F);
              i = U.f.nextInt(4);
              if (i == 0) {
                i = U.f.nextInt(2);
                try {
                  if (i == 0) {
                    a(L.a(L.GIRLS_JENNY_MMM));
                  } else {
                    a(L.a(L.GIRLS_JENNY_MOAN));
                  } 
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                } 
              } else {
                a(L.a(L.GIRLS_JENNY_HEAVYBREATHING));
              } 
              try {
                if (k())
                  cG.a(0.00666D); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 52:
              a(L.a(L.GIRLS_JENNY_LIGHTBREATHING), 0.5F);
              break;
            case 53:
              try {
                a(L.a(L.MISC_POUNDING), 0.75F);
                if (k())
                  cG.a(0.02D); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              this.Y++;
              if (this.Y % 2 == 0) {
                j = U.f.nextInt(2);
                try {
                  if (j == 0) {
                    a(L.a(L.GIRLS_JENNY_MOAN));
                    break;
                  } 
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                } 
                a(L.a(L.GIRLS_JENNY_HEAVYBREATHING));
                break;
              } 
              a(L.a(L.GIRLS_JENNY_AHH));
              break;
            case 54:
              c(m.DOGGYSLOW);
              break;
            case 55:
              a(L.MISC_CUMINFLATION[0], 2.0F);
              a(L.a(L.MISC_POUNDING), 2.0F);
              a(L.a(L.GIRLS_JENNY_MOAN));
              break;
            case 56:
              a(L.GIRLS_JENNY_HEAVYBREATHING[4]);
              break;
            case 57:
              a(L.GIRLS_JENNY_HEAVYBREATHING[5]);
              break;
            case 58:
              a(L.GIRLS_JENNY_HEAVYBREATHING[6]);
              break;
            case 59:
              a(L.GIRLS_JENNY_HEAVYBREATHING[7]);
              break;
            case 60:
              aV.a.sendToServer(new co(N()));
              break;
            case 61:
              uUID = (Minecraft.func_71410_x()).field_71439_g.getPersistentID();
              try {
                if (uUID.equals(this.field_70170_p.func_72890_a((Entity)B(), 2.0D).getPersistentID()))
                  try {
                    this.h = (this.field_70170_p.func_152378_a(uUID)).field_70177_z;
                    e(uUID);
                    if (!this.U) {
                      this.U = true;
                      a(-0.7D, -0.6D, 0.2D, 60.0F, -3.0F);
                    } 
                  } catch (RuntimeException runtimeException) {
                    throw a(null);
                  }  
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 62:
              try {
                if (k()) {
                  c(m.PAIZURI_SLOW);
                  cG.c();
                  cG.d();
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 63:
              try {
                a(L.a(L.MISC_POUNDING));
                if (func_70681_au().nextBoolean()) {
                  a(L.a(L.GIRLS_JENNY_MMM));
                } else {
                  a(L.a(L.GIRLS_JENNY_AHH));
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              try {
                if (k())
                  cG.a(0.04D); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 64:
            case 65:
              try {
                a(L.a(L.MISC_POUNDING));
                if (k())
                  cG.a(0.02D); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 66:
              try {
                c(m.PAIZURI_SLOW);
                if (k())
                  try {
                    if (!this.U) {
                      this.U = true;
                      a(-0.7D, -0.6D, 0.2D, 60.0F, -3.0F);
                    } 
                  } catch (RuntimeException runtimeException) {
                    throw a(null);
                  }  
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 67:
              iBlockState = this.field_70170_p.func_180495_p(func_180425_c().func_177973_b(new Vec3i(0, 1, 0)));
              a(iBlockState.func_177230_c().getSoundType(iBlockState, this.field_70170_p, func_180425_c(), (Entity)this).func_185844_d());
              break;
            case 68:
              try {
                if (k())
                  try {
                    if (!this.U)
                      a(-0.7D, -0.6D, 0.2D, 60.0F, -3.0F); 
                  } catch (RuntimeException runtimeException) {
                    throw a(null);
                  }  
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      };
    this.k.registerSoundListener(iSoundListener);
    paramAnimationData.addAnimationController(this.k);
    paramAnimationData.addAnimationController(this.q);
    paramAnimationData.addAnimationController(this.o);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\b8.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */