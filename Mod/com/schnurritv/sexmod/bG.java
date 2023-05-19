package com.schnurritv.sexmod;

import java.util.HashSet;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.resources.I18n;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.Path;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.pathfinding.PathPoint;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.SoundKeyframeEvent;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;

public class bg extends bA implements a, ci {
  public static double X = 0.01D;
  
  public ItemStack U = new ItemStack((Item)r.a);
  
  public static final DataParameter<Float> ar = EntityDataManager.func_187226_a(bg.class, DataSerializers.field_187193_c).func_187156_b().func_187161_a(121);
  
  public static final DataParameter<ItemStack> Y = EntityDataManager.func_187226_a(bg.class, DataSerializers.field_187196_f).func_187156_b().func_187161_a(120);
  
  public static final DataParameter<Boolean> am = EntityDataManager.func_187226_a(bg.class, DataSerializers.field_187198_h).func_187156_b().func_187161_a(119);
  
  public static final DataParameter<ItemStack> aj = EntityDataManager.func_187226_a(bg.class, DataSerializers.field_187196_f).func_187156_b().func_187161_a(118);
  
  static final float ah = 3.0F;
  
  static final float ap = 1200.0F;
  
  @Nullable
  public aY ac;
  
  public float ae = 1.0F;
  
  public float ai = 0.0F;
  
  int af = 8000;
  
  public boolean at = false;
  
  int au = 0;
  
  boolean ak = false;
  
  int Z = 0;
  
  int al = 0;
  
  public BlockPos ag;
  
  int V = 0;
  
  int as = 0;
  
  boolean ad;
  
  long W = 0L;
  
  boolean ab = false;
  
  Path an = null;
  
  int ao = 0;
  
  HashSet<BlockPos> aq = new HashSet<>();
  
  boolean aa = false;
  
  boolean av = false;
  
  public bg(World paramWorld) {
    super(paramWorld);
    if (this.M.getStackInSlot(0) == ItemStack.field_190927_a)
      this.M.setStackInSlot(0, new ItemStack(Items.field_151036_c)); 
    try {
      if (this.M.getStackInSlot(6) == ItemStack.field_190927_a)
        this.M.setStackInSlot(6, new ItemStack((Item)Items.field_151112_aM)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public String H() {
    return "Luna";
  }
  
  public float e() {
    return -0.2F;
  }
  
  protected void func_70088_a() {
    super.func_70088_a();
    this.p.func_187214_a(ar, Float.valueOf(0.0F));
    this.p.func_187214_a(Y, ItemStack.field_190927_a);
    this.p.func_187214_a(am, Boolean.valueOf(false));
    this.p.func_187214_a(aj, ItemStack.field_190927_a);
  }
  
  public void c() {
    b("Love it here owo");
    a(L.GIRLS_LUNA_OWO, new int[0]);
  }
  
  public void c(m paramm) {
    try {
      if (o() == m.COWGIRL_SITTING_CUM)
        try {
          if (paramm != m.COWGIRL_SITTING_SLOW) {
            try {
              if (paramm == m.COWGIRL_SITTING_FAST)
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
      if (o() == m.TOUCH_BOOBS_CUM)
        try {
          if (paramm != m.TOUCH_BOOBS_FAST) {
            try {
              if (paramm == m.TOUCH_BOOBS_SLOW)
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
    super.c(paramm);
  }
  
  public void b() {
    this.at = true;
  }
  
  public float func_70047_e() {
    return 1.34F;
  }
  
  public boolean func_184645_a(EntityPlayer paramEntityPlayer, EnumHand paramEnumHand) {
    try {
      if (super.func_184645_a(paramEntityPlayer, paramEnumHand))
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    ItemStack itemStack = paramEntityPlayer.func_184586_b(paramEnumHand);
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    boolean bool = (itemStack.func_77973_b() == Items.field_151057_cb) ? true : false;
    try {
      if (bool) {
        itemStack.func_111282_a(paramEntityPlayer, (EntityLivingBase)this, paramEnumHand);
        return true;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.field_70170_p.field_72995_K)
        try {
          if (!a(paramEntityPlayer))
            b(I18n.func_135052_a("bia.dialogue.busy", new Object[0])); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return true;
  }
  
  public boolean a(EntityPlayer paramEntityPlayer) {
    String[] arrayOfString = { "action.names.sex", "action.names.touchboobs", "action.names.headpat" };
    ItemStack[] arrayOfItemStack = { new ItemStack(Items.field_151115_aP, 3, 0), new ItemStack(Items.field_151115_aP, 2, 1), null };
    a(paramEntityPlayer, this, arrayOfString, arrayOfItemStack);
    return true;
  }
  
  @SideOnly(Side.CLIENT)
  protected static void a(EntityPlayer paramEntityPlayer, bS parambS, String[] paramArrayOfString, ItemStack[] paramArrayOfItemStack) {
    Minecraft.func_71410_x().func_147108_a(new X(parambS, paramEntityPlayer, paramArrayOfString, paramArrayOfItemStack, true));
  }
  
  public void b(ItemStack paramItemStack) {
    this.p.func_187227_b(aj, paramItemStack);
  }
  
  public void D() {
    this.c = new EntityAIWanderAvoidWater(this, 0.35D);
    this.t = new q((EntityLiving)this, (Class)EntityPlayer.class, 3.0F, 1.0F);
    this.field_70714_bg.func_75776_a(5, (EntityAIBase)this.t);
    this.field_70714_bg.func_75776_a(5, (EntityAIBase)this.c);
  }
  
  public void func_70619_bc() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial func_70619_bc : ()V
    //   4: aload_0
    //   5: invokevirtual O : ()Z
    //   8: ifne -> 31
    //   11: aload_0
    //   12: getstatic net/minecraft/entity/SharedMonsterAttributes.field_111263_d : Lnet/minecraft/entity/ai/attributes/IAttribute;
    //   15: invokevirtual func_110148_a : (Lnet/minecraft/entity/ai/attributes/IAttribute;)Lnet/minecraft/entity/ai/attributes/IAttributeInstance;
    //   18: dconst_1
    //   19: invokeinterface func_111128_a : (D)V
    //   24: goto -> 46
    //   27: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   30: athrow
    //   31: aload_0
    //   32: getstatic net/minecraft/entity/SharedMonsterAttributes.field_111263_d : Lnet/minecraft/entity/ai/attributes/IAttribute;
    //   35: invokevirtual func_110148_a : (Lnet/minecraft/entity/ai/attributes/IAttribute;)Lnet/minecraft/entity/ai/attributes/IAttributeInstance;
    //   38: ldc2_w 0.5
    //   41: invokeinterface func_111128_a : (D)V
    //   46: aload_0
    //   47: invokevirtual s : ()V
    //   50: aload_0
    //   51: invokevirtual k : ()V
    //   54: aload_0
    //   55: getfield p : Lnet/minecraft/network/datasync/EntityDataManager;
    //   58: getstatic com/schnurritv/sexmod/bg.am : Lnet/minecraft/network/datasync/DataParameter;
    //   61: aload_0
    //   62: getfield ac : Lcom/schnurritv/sexmod/aY;
    //   65: ifnull -> 99
    //   68: aload_0
    //   69: getfield p : Lnet/minecraft/network/datasync/EntityDataManager;
    //   72: getstatic com/schnurritv/sexmod/bg.aj : Lnet/minecraft/network/datasync/DataParameter;
    //   75: invokevirtual func_187225_a : (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
    //   78: getstatic net/minecraft/item/ItemStack.field_190927_a : Lnet/minecraft/item/ItemStack;
    //   81: if_acmpne -> 99
    //   84: goto -> 91
    //   87: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   90: athrow
    //   91: iconst_1
    //   92: goto -> 100
    //   95: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   98: athrow
    //   99: iconst_0
    //   100: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   103: invokevirtual func_187227_b : (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
    //   106: aload_0
    //   107: getfield W : J
    //   110: aload_0
    //   111: getfield field_70170_p : Lnet/minecraft/world/World;
    //   114: invokevirtual func_82737_E : ()J
    //   117: lcmp
    //   118: ifne -> 158
    //   121: aload_0
    //   122: getfield ac : Lcom/schnurritv/sexmod/aY;
    //   125: ifnull -> 158
    //   128: goto -> 135
    //   131: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   134: athrow
    //   135: aload_0
    //   136: getfield field_70170_p : Lnet/minecraft/world/World;
    //   139: aload_0
    //   140: getfield ac : Lcom/schnurritv/sexmod/aY;
    //   143: invokevirtual func_72900_e : (Lnet/minecraft/entity/Entity;)V
    //   146: aload_0
    //   147: aconst_null
    //   148: putfield ac : Lcom/schnurritv/sexmod/aY;
    //   151: goto -> 158
    //   154: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   157: athrow
    //   158: aload_0
    //   159: getfield ak : Z
    //   162: ifeq -> 343
    //   165: aload_0
    //   166: invokevirtual I : ()Lnet/minecraft/util/math/Vec3d;
    //   169: aload_0
    //   170: invokevirtual func_174791_d : ()Lnet/minecraft/util/math/Vec3d;
    //   173: invokevirtual func_72438_d : (Lnet/minecraft/util/math/Vec3d;)D
    //   176: dstore_1
    //   177: dload_1
    //   178: ldc2_w 0.5
    //   181: dcmpg
    //   182: iflt -> 202
    //   185: aload_0
    //   186: getfield Z : I
    //   189: sipush #200
    //   192: if_icmple -> 265
    //   195: goto -> 202
    //   198: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   201: athrow
    //   202: aload_0
    //   203: iconst_0
    //   204: putfield ak : Z
    //   207: aload_0
    //   208: iconst_0
    //   209: putfield Z : I
    //   212: aload_0
    //   213: getfield p : Lnet/minecraft/network/datasync/EntityDataManager;
    //   216: getstatic com/schnurritv/sexmod/bg.z : Lnet/minecraft/network/datasync/DataParameter;
    //   219: iconst_1
    //   220: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   223: invokevirtual func_187227_b : (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
    //   226: aload_0
    //   227: iconst_1
    //   228: putfield field_70145_X : Z
    //   231: aload_0
    //   232: iconst_1
    //   233: invokevirtual func_189654_d : (Z)V
    //   236: aload_0
    //   237: dconst_0
    //   238: putfield field_70159_w : D
    //   241: aload_0
    //   242: dconst_0
    //   243: putfield field_70181_x : D
    //   246: aload_0
    //   247: dconst_0
    //   248: putfield field_70179_y : D
    //   251: aload_0
    //   252: getstatic com/schnurritv/sexmod/m.WAIT_CAT : Lcom/schnurritv/sexmod/m;
    //   255: invokevirtual c : (Lcom/schnurritv/sexmod/m;)V
    //   258: goto -> 343
    //   261: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   264: athrow
    //   265: aload_0
    //   266: dup
    //   267: getfield Z : I
    //   270: iconst_1
    //   271: iadd
    //   272: dup_x1
    //   273: putfield Z : I
    //   276: bipush #60
    //   278: if_icmpeq -> 297
    //   281: aload_0
    //   282: getfield Z : I
    //   285: bipush #120
    //   287: if_icmpne -> 343
    //   290: goto -> 297
    //   293: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   296: athrow
    //   297: aload_0
    //   298: invokevirtual func_70661_as : ()Lnet/minecraft/pathfinding/PathNavigate;
    //   301: invokevirtual func_75499_g : ()V
    //   304: aload_0
    //   305: invokevirtual func_70661_as : ()Lnet/minecraft/pathfinding/PathNavigate;
    //   308: aload_0
    //   309: invokevirtual I : ()Lnet/minecraft/util/math/Vec3d;
    //   312: getfield field_72450_a : D
    //   315: aload_0
    //   316: invokevirtual I : ()Lnet/minecraft/util/math/Vec3d;
    //   319: getfield field_72448_b : D
    //   322: aload_0
    //   323: invokevirtual I : ()Lnet/minecraft/util/math/Vec3d;
    //   326: getfield field_72449_c : D
    //   329: ldc2_w 0.2
    //   332: invokevirtual func_75492_a : (DDDD)Z
    //   335: pop
    //   336: goto -> 343
    //   339: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   342: athrow
    //   343: aload_0
    //   344: getfield at : Z
    //   347: ifeq -> 517
    //   350: aload_0
    //   351: dup
    //   352: getfield au : I
    //   355: iconst_1
    //   356: iadd
    //   357: putfield au : I
    //   360: aload_0
    //   361: invokevirtual func_174791_d : ()Lnet/minecraft/util/math/Vec3d;
    //   364: aload_0
    //   365: invokevirtual I : ()Lnet/minecraft/util/math/Vec3d;
    //   368: invokevirtual equals : (Ljava/lang/Object;)Z
    //   371: ifne -> 397
    //   374: goto -> 381
    //   377: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   380: athrow
    //   381: aload_0
    //   382: getfield au : I
    //   385: bipush #40
    //   387: if_icmple -> 466
    //   390: goto -> 397
    //   393: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   396: athrow
    //   397: aload_0
    //   398: iconst_0
    //   399: putfield at : Z
    //   402: aload_0
    //   403: iconst_0
    //   404: putfield au : I
    //   407: aload_0
    //   408: aload_0
    //   409: getfield field_70170_p : Lnet/minecraft/world/World;
    //   412: invokevirtual func_73046_m : ()Lnet/minecraft/server/MinecraftServer;
    //   415: invokevirtual func_184103_al : ()Lnet/minecraft/server/management/PlayerList;
    //   418: aload_0
    //   419: invokevirtual n : ()Ljava/util/UUID;
    //   422: invokevirtual func_177451_a : (Ljava/util/UUID;)Lnet/minecraft/entity/player/EntityPlayerMP;
    //   425: getfield field_70177_z : F
    //   428: ldc 180.0
    //   430: fadd
    //   431: invokevirtual a : (F)V
    //   434: aload_0
    //   435: getfield p : Lnet/minecraft/network/datasync/EntityDataManager;
    //   438: getstatic com/schnurritv/sexmod/bg.z : Lnet/minecraft/network/datasync/DataParameter;
    //   441: iconst_1
    //   442: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   445: invokevirtual func_187227_b : (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
    //   448: aload_0
    //   449: invokevirtual func_70661_as : ()Lnet/minecraft/pathfinding/PathNavigate;
    //   452: invokevirtual func_75499_g : ()V
    //   455: aload_0
    //   456: invokevirtual q : ()V
    //   459: goto -> 517
    //   462: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   465: athrow
    //   466: aload_0
    //   467: aload_0
    //   468: invokevirtual s : ()Ljava/lang/Float;
    //   471: invokevirtual floatValue : ()F
    //   474: putfield field_70177_z : F
    //   477: aload_0
    //   478: iconst_0
    //   479: invokevirtual func_189654_d : (Z)V
    //   482: aload_0
    //   483: invokevirtual func_174791_d : ()Lnet/minecraft/util/math/Vec3d;
    //   486: aload_0
    //   487: invokevirtual I : ()Lnet/minecraft/util/math/Vec3d;
    //   490: bipush #40
    //   492: aload_0
    //   493: getfield au : I
    //   496: isub
    //   497: invokestatic a : (Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;I)Lnet/minecraft/util/math/Vec3d;
    //   500: astore_1
    //   501: aload_0
    //   502: aload_1
    //   503: getfield field_72450_a : D
    //   506: aload_1
    //   507: getfield field_72448_b : D
    //   510: aload_1
    //   511: getfield field_72449_c : D
    //   514: invokevirtual func_70107_b : (DDD)V
    //   517: aload_0
    //   518: invokevirtual n : ()V
    //   521: aload_0
    //   522: getfield p : Lnet/minecraft/network/datasync/EntityDataManager;
    //   525: getstatic com/schnurritv/sexmod/bg.Y : Lnet/minecraft/network/datasync/DataParameter;
    //   528: aload_0
    //   529: getfield M : Lnet/minecraftforge/items/ItemStackHandler;
    //   532: bipush #6
    //   534: invokevirtual getStackInSlot : (I)Lnet/minecraft/item/ItemStack;
    //   537: invokevirtual func_187227_b : (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
    //   540: return
    // Exception table:
    //   from	to	target	type
    //   0	27	27	java/lang/RuntimeException
    //   46	84	87	java/lang/RuntimeException
    //   68	95	95	java/lang/RuntimeException
    //   100	128	131	java/lang/RuntimeException
    //   121	151	154	java/lang/RuntimeException
    //   177	195	198	java/lang/RuntimeException
    //   185	261	261	java/lang/RuntimeException
    //   265	290	293	java/lang/RuntimeException
    //   281	336	339	java/lang/RuntimeException
    //   343	374	377	java/lang/RuntimeException
    //   350	390	393	java/lang/RuntimeException
    //   381	462	462	java/lang/RuntimeException
  }
  
  void n() {
    ItemStack itemStack1 = this.U;
    ItemStack itemStack2 = (ItemStack)this.p.func_187225_a(Y);
    try {
      if (itemStack2.equals(ItemStack.field_190927_a))
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Map map = EnchantmentHelper.func_82781_a(itemStack2);
    EnchantmentHelper.func_82782_a(map, itemStack1);
  }
  
  public void func_70071_h_() {
    try {
      super.func_70071_h_();
      if (m.WAIT_CAT.equals(o())) {
        o();
      } else {
        this.al = 0;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  void o() {
    EntityPlayer entityPlayer = this.field_70170_p.func_72890_a((Entity)this, 10.0D);
    try {
      if (entityPlayer == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (entityPlayer.func_70032_d((Entity)this) > 1.25F)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.field_70170_p.field_72995_K) {
        a(entityPlayer, this.al);
      } else {
        try {
          if (this.al == 25) {
            e(entityPlayer.getPersistentID());
            entityPlayer.func_191958_b(0.0F, 0.0F, 0.0F, 0.0F);
            entityPlayer.func_70634_a((func_174791_d()).field_72450_a, (func_174791_d()).field_72448_b, (func_174791_d()).field_72449_c);
            c(m.COWGIRL_SITTING_INTRO);
            entityPlayer.func_70034_d(s().floatValue() + 180.0F);
            entityPlayer.field_70177_z = s().floatValue() + 180.0F;
            entityPlayer.field_70126_B = s().floatValue() + 180.0F;
            this.h = s().floatValue() + 180.0F;
            a(0.0D, -0.07500000298023224D, -0.7109375D, 0.0F, 0.0F);
            this.p.func_187227_b(F, Integer.valueOf(0));
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.al++;
  }
  
  @SideOnly(Side.CLIENT)
  void a(EntityPlayer paramEntityPlayer, int paramInt) {
    if (paramInt == 0) {
      EntityPlayerSP entityPlayerSP = (Minecraft.func_71410_x()).field_71439_g;
      try {
        if (entityPlayerSP.getPersistentID().equals(paramEntityPlayer.getPersistentID())) {
          bd.b();
          entityPlayerSP.func_70016_h(0.0D, 0.0D, 0.0D);
          aK.a(false);
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    if (paramInt == 25) {
      EntityPlayerSP entityPlayerSP = (Minecraft.func_71410_x()).field_71439_g;
      try {
        if (entityPlayerSP.getPersistentID().equals(paramEntityPlayer.getPersistentID()))
          (Minecraft.func_71410_x()).field_71474_y.field_74320_O = 2; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
  }
  
  public void a() {
    this.p.func_187227_b(z, Boolean.valueOf(false));
    c(m.NULL);
    this.ab = true;
    BlockPos blockPos = a(func_180425_c());
    try {
      if (blockPos == null) {
        a(L.GIRLS_LUNA_GIGGLE, new int[0]);
        aV.a.sendToAllAround(new a_("<" + H() + "> Heh.. there is no bed nearby.. but I already ate the fish so nya~ hehe", this.field_71093_bK, N()), c());
      } else {
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
            a(L.GIRLS_LUNA_GIGGLE, new int[0]);
            b("Heh.. the bed is obscured.. but I already ate the fish so nya~ hehe");
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        Vec3d vec3d2 = vec3d1.func_178787_e(arrayOfVec3d[b][0]);
        a(arrayOfInt[b]);
        a(new Vec3d(vec3d2.field_72450_a, vec3d2.field_72448_b, vec3d2.field_72449_c));
        this.h = s().floatValue();
        func_70661_as().func_75499_g();
        func_70661_as().func_75492_a(vec3d2.field_72450_a, vec3d2.field_72448_b, vec3d2.field_72449_c, 0.2D);
        this.ak = true;
        this.Z = 0;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void e() {
    EntityItem entityItem = new EntityItem(this.field_70170_p, this.field_70165_t, this.field_70163_u, this.field_70161_v, (ItemStack)this.p.func_187225_a(aj));
    Vec3d vec3d = aH.a(new Vec3d(0.0D, 0.20000000298023224D + Math.random() * 0.10000000149011612D, -0.20000000298023224D + Math.random() * -0.10000000149011612D), this.field_70177_z);
    entityItem.field_70159_w = vec3d.field_72450_a;
    entityItem.field_70181_x = vec3d.field_72448_b;
    entityItem.field_70179_y = vec3d.field_72449_c;
    this.field_70170_p.func_72838_d((Entity)entityItem);
    this.p.func_187227_b(aj, ItemStack.field_190927_a);
  }
  
  public void l() {
    try {
      this.ag = null;
      this.V = 0;
      this.as = 0;
      this.ad = false;
      this.p.func_187227_b(z, Boolean.valueOf(false));
      this.p.func_187227_b(aj, ItemStack.field_190927_a);
      func_174810_b(false);
      c(m.NULL);
      if (this.ac != null) {
        this.field_70170_p.func_72900_e(this.ac);
        this.ac = null;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (n() != null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      this.t = new q((EntityLiving)this, (Class)EntityPlayer.class, 3.0F, 1.0F);
      this.field_70714_bg.func_75776_a(5, (EntityAIBase)this.t);
      if (O())
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.c = new EntityAIWanderAvoidWater(this, 0.35D);
    this.field_70714_bg.func_75776_a(5, (EntityAIBase)this.c);
  }
  
  public void r() {
    try {
      l();
      if (++this.ao >= 3) {
        this.ao = 0;
        this.af = 0;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  void k() {
    try {
      if (!O())
        try {
          if (n() == null)
            try {
              if (!this.ab) {
                try {
                  if (++this.af < 1200.0F)
                    return; 
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                } 
                try {
                  if (this.ac != null && this.ac.c == 15) {
                    ((r)this.U.func_77973_b()).a(this.field_70170_p, this, EnumHand.MAIN_HAND);
                    this.W = this.field_70170_p.func_82737_E() + 20L;
                    ItemStack itemStack = (ItemStack)this.p.func_187225_a(aj);
                    try {
                      if (itemStack != ItemStack.field_190927_a)
                        try {
                          if (itemStack.func_77973_b() instanceof net.minecraft.item.ItemFood) {
                            c(m.FISHING_EAT);
                          } else {
                            c(m.FISHING_THROW_AWAY);
                          } 
                        } catch (RuntimeException runtimeException) {
                          throw a(null);
                        }  
                    } catch (RuntimeException runtimeException) {
                      throw a(null);
                    } 
                  } 
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                } 
                try {
                  if (!o().toString().toLowerCase().contains("fishing")) {
                    j();
                    m();
                  } 
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                } 
                try {
                  if (this.ag != null)
                    try {
                      if (this.an == null)
                        try {
                          if (func_70661_as().func_75505_d() == null)
                            try {
                              if (!this.field_70171_ac && this.field_70122_E) {
                                RayTraceResult rayTraceResult = this.field_70170_p.func_72901_a(func_174791_d().func_72441_c(0.0D, func_70047_e(), 0.0D), new Vec3d(this.ag.func_177958_n(), this.ag.func_177956_o(), this.ag.func_177952_p()), true);
                                try {
                                  func_174810_b(true);
                                  if (this.c != null) {
                                    this.field_70714_bg.func_85156_a((EntityAIBase)this.c);
                                    this.c = null;
                                  } 
                                } catch (RuntimeException runtimeException) {
                                  throw a(null);
                                } 
                                try {
                                  if (this.t != null) {
                                    this.field_70714_bg.func_85156_a((EntityAIBase)this.t);
                                    this.t = null;
                                  } 
                                } catch (RuntimeException runtimeException) {
                                  throw a(null);
                                } 
                                try {
                                  if (o() == m.NULL) {
                                    c(m.FISHING_START);
                                    a(func_174791_d());
                                    this.p.func_187227_b(z, Boolean.valueOf(true));
                                    a((float)Math.atan2(this.field_70161_v - this.ag.func_177952_p(), this.field_70165_t - this.ag.func_177958_n()) * 57.29578F + 90.0F);
                                  } 
                                } catch (RuntimeException runtimeException) {
                                  throw a(null);
                                } 
                                return;
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
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                } 
                this.an = func_70661_as().func_75505_d();
                return;
              } 
              try {
                if (((Boolean)this.p.func_187225_a(am)).booleanValue())
                  l(); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
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
      if (((Boolean)this.p.func_187225_a(am)).booleanValue())
        l(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void d() {
    this.aq.add(this.ag);
    l();
  }
  
  void m() {
    try {
      if (this.ag == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    PathNavigate pathNavigate = func_70661_as();
    pathNavigate.func_75492_a(this.ag.func_177958_n(), this.ag.func_177956_o(), this.ag.func_177952_p(), 0.3499999940395355D);
    Path path = pathNavigate.func_75505_d();
    try {
      if (path == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    if (path.func_75874_d() > path.func_75873_e() + 1) {
      PathPoint pathPoint1 = path.func_75877_a(path.func_75873_e() + 1);
      PathPoint pathPoint2 = path.func_75877_a(path.func_75874_d() - 1);
      Vec3d vec3d = new Vec3d(pathPoint2.field_75839_a, pathPoint2.field_75837_b, pathPoint2.field_75838_c);
      BlockPos blockPos = new BlockPos(pathPoint1.field_75839_a, pathPoint1.field_75837_b, pathPoint1.field_75838_c);
      try {
        if (func_174791_d().func_72438_d(vec3d) < 0.75D) {
          pathNavigate.func_75499_g();
          func_70107_b(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c);
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (this.field_70170_p.func_180495_p(blockPos.func_177982_a(0, 1, 0)).func_177230_c() == Blocks.field_150355_j)
          pathNavigate.func_75499_g(); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (this.field_70170_p.func_180495_p(blockPos).func_177230_c() == Blocks.field_150355_j)
          pathNavigate.func_75499_g(); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (this.field_70170_p.func_180495_p(blockPos.func_177982_a(0, -1, 0)).func_177230_c() == Blocks.field_150355_j)
          pathNavigate.func_75499_g(); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
  }
  
  void j() {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: iconst_0
    //   5: istore_3
    //   6: iinc #1, 1
    //   9: iload_1
    //   10: bipush #50
    //   12: if_icmpge -> 253
    //   15: aload_0
    //   16: aload_0
    //   17: invokevirtual func_180425_c : ()Lnet/minecraft/util/math/BlockPos;
    //   20: iload_1
    //   21: iconst_1
    //   22: iadd
    //   23: getstatic net/minecraft/init/Blocks.field_150355_j : Lnet/minecraft/block/BlockStaticLiquid;
    //   26: bipush #60
    //   28: bipush #10
    //   30: new java/util/HashSet
    //   33: dup
    //   34: bipush #7
    //   36: anewarray net/minecraft/world/biome/Biome
    //   39: dup
    //   40: iconst_0
    //   41: getstatic net/minecraft/init/Biomes.field_76781_i : Lnet/minecraft/world/biome/Biome;
    //   44: aastore
    //   45: dup
    //   46: iconst_1
    //   47: getstatic net/minecraft/init/Biomes.field_76771_b : Lnet/minecraft/world/biome/Biome;
    //   50: aastore
    //   51: dup
    //   52: iconst_2
    //   53: getstatic net/minecraft/init/Biomes.field_150575_M : Lnet/minecraft/world/biome/Biome;
    //   56: aastore
    //   57: dup
    //   58: iconst_3
    //   59: getstatic net/minecraft/init/Biomes.field_76787_r : Lnet/minecraft/world/biome/Biome;
    //   62: aastore
    //   63: dup
    //   64: iconst_4
    //   65: getstatic net/minecraft/init/Biomes.field_150576_N : Lnet/minecraft/world/biome/Biome;
    //   68: aastore
    //   69: dup
    //   70: iconst_5
    //   71: getstatic net/minecraft/init/Biomes.field_76780_h : Lnet/minecraft/world/biome/Biome;
    //   74: aastore
    //   75: dup
    //   76: bipush #6
    //   78: getstatic net/minecraft/init/Biomes.field_150599_m : Lnet/minecraft/world/biome/Biome;
    //   81: aastore
    //   82: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   85: invokespecial <init> : (Ljava/util/Collection;)V
    //   88: invokevirtual a : (Lnet/minecraft/util/math/BlockPos;ILnet/minecraft/block/Block;IILjava/util/HashSet;)Lnet/minecraft/util/math/BlockPos;
    //   91: astore #4
    //   93: aload #4
    //   95: ifnonnull -> 105
    //   98: goto -> 253
    //   101: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   104: athrow
    //   105: aload_0
    //   106: getfield field_70170_p : Lnet/minecraft/world/World;
    //   109: aload #4
    //   111: iconst_0
    //   112: iconst_1
    //   113: iconst_0
    //   114: invokevirtual func_177982_a : (III)Lnet/minecraft/util/math/BlockPos;
    //   117: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   120: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   125: getstatic net/minecraft/init/Blocks.field_150355_j : Lnet/minecraft/block/BlockStaticLiquid;
    //   128: if_acmpne -> 144
    //   131: aload #4
    //   133: iconst_0
    //   134: iconst_1
    //   135: iconst_0
    //   136: invokevirtual func_177982_a : (III)Lnet/minecraft/util/math/BlockPos;
    //   139: astore #4
    //   141: goto -> 105
    //   144: iconst_1
    //   145: istore #5
    //   147: aload #4
    //   149: astore #6
    //   151: aload_0
    //   152: getfield field_70170_p : Lnet/minecraft/world/World;
    //   155: aload #6
    //   157: iconst_0
    //   158: iconst_m1
    //   159: iconst_0
    //   160: invokevirtual func_177982_a : (III)Lnet/minecraft/util/math/BlockPos;
    //   163: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   166: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   171: getstatic net/minecraft/init/Blocks.field_150355_j : Lnet/minecraft/block/BlockStaticLiquid;
    //   174: if_acmpne -> 193
    //   177: aload #6
    //   179: iconst_0
    //   180: iconst_m1
    //   181: iconst_0
    //   182: invokevirtual func_177982_a : (III)Lnet/minecraft/util/math/BlockPos;
    //   185: astore #6
    //   187: iinc #5, 1
    //   190: goto -> 151
    //   193: aload_0
    //   194: getfield aq : Ljava/util/HashSet;
    //   197: aload #4
    //   199: invokevirtual contains : (Ljava/lang/Object;)Z
    //   202: ifeq -> 212
    //   205: goto -> 6
    //   208: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   211: athrow
    //   212: aload_2
    //   213: ifnonnull -> 225
    //   216: aload #4
    //   218: astore_2
    //   219: iload #5
    //   221: istore_3
    //   222: goto -> 6
    //   225: iload #5
    //   227: iload_3
    //   228: if_icmple -> 250
    //   231: aload #4
    //   233: astore_2
    //   234: iload #5
    //   236: istore_3
    //   237: iload_3
    //   238: bipush #6
    //   240: if_icmplt -> 250
    //   243: goto -> 253
    //   246: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   249: athrow
    //   250: goto -> 6
    //   253: aload_2
    //   254: ifnonnull -> 262
    //   257: return
    //   258: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   261: athrow
    //   262: aload_0
    //   263: getfield ag : Lnet/minecraft/util/math/BlockPos;
    //   266: ifnull -> 284
    //   269: aload_0
    //   270: getfield V : I
    //   273: iload_3
    //   274: if_icmpge -> 301
    //   277: goto -> 284
    //   280: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   283: athrow
    //   284: aload_0
    //   285: aload_2
    //   286: putfield ag : Lnet/minecraft/util/math/BlockPos;
    //   289: aload_0
    //   290: iload_3
    //   291: putfield V : I
    //   294: goto -> 301
    //   297: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   300: athrow
    //   301: aload_0
    //   302: getfield ag : Lnet/minecraft/util/math/BlockPos;
    //   305: aload_2
    //   306: invokevirtual equals : (Ljava/lang/Object;)Z
    //   309: ifeq -> 324
    //   312: aload_0
    //   313: iconst_0
    //   314: putfield as : I
    //   317: goto -> 357
    //   320: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   323: athrow
    //   324: aload_0
    //   325: dup
    //   326: getfield as : I
    //   329: iconst_1
    //   330: iadd
    //   331: dup_x1
    //   332: putfield as : I
    //   335: bipush #20
    //   337: if_icmple -> 357
    //   340: aload_0
    //   341: aload_2
    //   342: putfield ag : Lnet/minecraft/util/math/BlockPos;
    //   345: aload_0
    //   346: iload_3
    //   347: putfield V : I
    //   350: goto -> 357
    //   353: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   356: athrow
    //   357: return
    // Exception table:
    //   from	to	target	type
    //   93	101	101	java/lang/RuntimeException
    //   193	208	208	java/lang/RuntimeException
    //   237	246	246	java/lang/RuntimeException
    //   253	258	258	java/lang/RuntimeException
    //   262	277	280	java/lang/RuntimeException
    //   269	294	297	java/lang/RuntimeException
    //   301	320	320	java/lang/RuntimeException
    //   324	350	353	java/lang/RuntimeException
  }
  
  void s() {
    Path path = func_70661_as().func_75505_d();
    try {
      if (path == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    PathPoint pathPoint1 = path.func_75870_c();
    PathPoint pathPoint2 = new PathPoint(aH.b(this.field_70165_t), aH.b(this.field_70163_u), aH.b(this.field_70161_v));
    try {
      if (pathPoint1 == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.p.func_187227_b(ar, Float.valueOf(pathPoint1.func_75829_a(pathPoint2)));
  }
  
  public void a(String paramString, UUID paramUUID) {
    try {
      super.a(paramString, paramUUID);
      if ("action.names.touchboobs".equals(paramString)) {
        e(paramUUID);
        a(true, true, paramUUID);
        a("animationFollowUp", "touch_boobs");
        a("currentModel", "0");
        aK.a(false);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if ("action.names.sex".equals(paramString)) {
        e(paramUUID);
        a(true, true, paramUUID);
        a("animationFollowUp", "sex");
        aK.a(false);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if ("action.names.headpat".equals(paramString)) {
        e(paramUUID);
        a(true, true, paramUUID);
        aK.a(false);
        a("animationFollowUp", "headpat");
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  protected m b(m paramm) {
    try {
      if (paramm == m.TOUCH_BOOBS_SLOW)
        return m.TOUCH_BOOBS_FAST; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramm == m.COWGIRL_SITTING_SLOW)
        return m.COWGIRL_SITTING_FAST; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return null;
  }
  
  protected m a(m paramm) {
    try {
      if (paramm != m.TOUCH_BOOBS_SLOW) {
        try {
          if (paramm == m.TOUCH_BOOBS_FAST)
            return m.TOUCH_BOOBS_CUM; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } else {
        return m.TOUCH_BOOBS_CUM;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramm != m.COWGIRL_SITTING_FAST)
        try {
          return (paramm != m.COWGIRL_SITTING_SLOW) ? null : m.COWGIRL_SITTING_CUM;
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return m.COWGIRL_SITTING_CUM;
  }
  
  protected void q() {
    String str = (String)this.p.func_187225_a(u);
    byte b = -1;
    try {
      switch (str.hashCode()) {
        case 2014427283:
          if (str.equals("touch_boobs"))
            b = 0; 
          break;
        case 113766:
          if (str.equals("sex"))
            b = 1; 
          break;
        case 795317955:
          if (str.equals("headpat"))
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
            if (o() != m.PAYMENT) {
              c(m.PAYMENT);
              return;
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          c(m.TOUCH_BOOBS_INTRO);
          break;
        case 1:
          try {
            if (o() != m.PAYMENT) {
              c(m.PAYMENT);
            } else {
              aV.a.sendToServer(new E(N()));
              aV.a.sendToServer(new I(N()));
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          return;
        case 2:
          c(m.HEAD_PAT);
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
  
  protected void func_184581_c(DamageSource paramDamageSource) {
    a(L.GIRLS_LUNA_OUU, new int[0]);
  }
  
  @Nullable
  protected SoundEvent func_184615_bR() {
    try {
      if (func_70681_au().nextFloat() * 100.0F > 95.0F)
        return L.GIRLS_ALLIE_SCAWY[2]; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return L.GIRLS_LUNA_OUU[12];
  }
  
  protected void func_110147_ax() {
    super.func_110147_ax();
    func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(1.0D);
  }
  
  protected float func_175134_bD() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return func_70090_H() ? 1.0F : 0.5F;
  }
  
  protected <E extends software.bernie.geckolib3.core.IAnimatable> PlayState a(AnimationEvent<E> paramAnimationEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield field_70170_p : Lnet/minecraft/world/World;
    //   4: instanceof com/c
    //   7: ifeq -> 18
    //   10: getstatic software/bernie/geckolib3/core/PlayState.STOP : Lsoftware/bernie/geckolib3/core/PlayState;
    //   13: areturn
    //   14: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   17: athrow
    //   18: aload_1
    //   19: invokevirtual getController : ()Lsoftware/bernie/geckolib3/core/controller/AnimationController;
    //   22: invokevirtual getName : ()Ljava/lang/String;
    //   25: astore_2
    //   26: iconst_m1
    //   27: istore_3
    //   28: aload_2
    //   29: invokevirtual hashCode : ()I
    //   32: lookupswitch default -> 114, -1422950858 -> 103, -103677777 -> 89, 3128418 -> 68
    //   68: aload_2
    //   69: ldc 'eyes'
    //   71: invokevirtual equals : (Ljava/lang/Object;)Z
    //   74: ifeq -> 114
    //   77: goto -> 84
    //   80: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   83: athrow
    //   84: iconst_0
    //   85: istore_3
    //   86: goto -> 114
    //   89: aload_2
    //   90: ldc 'movement'
    //   92: invokevirtual equals : (Ljava/lang/Object;)Z
    //   95: ifeq -> 114
    //   98: iconst_1
    //   99: istore_3
    //   100: goto -> 114
    //   103: aload_2
    //   104: ldc 'action'
    //   106: invokevirtual equals : (Ljava/lang/Object;)Z
    //   109: ifeq -> 114
    //   112: iconst_2
    //   113: istore_3
    //   114: iload_3
    //   115: tableswitch default -> 818, 0 -> 140, 1 -> 183, 2 -> 419
    //   140: aload_0
    //   141: invokevirtual o : ()Lcom/schnurritv/sexmod/m;
    //   144: getstatic com/schnurritv/sexmod/m.NULL : Lcom/schnurritv/sexmod/m;
    //   147: if_acmpeq -> 172
    //   150: goto -> 157
    //   153: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   156: athrow
    //   157: aload_0
    //   158: ldc 'animation.cat.null'
    //   160: iconst_1
    //   161: aload_1
    //   162: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   165: goto -> 818
    //   168: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   171: athrow
    //   172: aload_0
    //   173: ldc 'animation.cat.blink'
    //   175: iconst_1
    //   176: aload_1
    //   177: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   180: goto -> 818
    //   183: aload_0
    //   184: invokevirtual o : ()Lcom/schnurritv/sexmod/m;
    //   187: getstatic com/schnurritv/sexmod/m.NULL : Lcom/schnurritv/sexmod/m;
    //   190: if_acmpeq -> 208
    //   193: aload_0
    //   194: ldc 'animation.cat.null'
    //   196: iconst_1
    //   197: aload_1
    //   198: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   201: goto -> 818
    //   204: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   207: athrow
    //   208: aload_0
    //   209: invokevirtual func_184218_aH : ()Z
    //   212: ifeq -> 230
    //   215: aload_0
    //   216: ldc 'animation.cat.sit'
    //   218: iconst_1
    //   219: aload_1
    //   220: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   223: goto -> 818
    //   226: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   229: athrow
    //   230: aload_0
    //   231: getfield field_70169_q : D
    //   234: aload_0
    //   235: getfield field_70165_t : D
    //   238: dsub
    //   239: invokestatic abs : (D)D
    //   242: aload_0
    //   243: getfield field_70166_s : D
    //   246: aload_0
    //   247: getfield field_70161_v : D
    //   250: dsub
    //   251: invokestatic abs : (D)D
    //   254: dadd
    //   255: dconst_0
    //   256: dcmpl
    //   257: ifle -> 374
    //   260: aload_0
    //   261: getfield field_70122_E : Z
    //   264: ifeq -> 355
    //   267: goto -> 274
    //   270: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   273: athrow
    //   274: aload_0
    //   275: getfield field_70167_r : D
    //   278: invokestatic abs : (D)D
    //   281: aload_0
    //   282: getfield field_70163_u : D
    //   285: invokestatic abs : (D)D
    //   288: dsub
    //   289: invokestatic abs : (D)D
    //   292: ldc2_w 0.10000000149011612
    //   295: dcmpg
    //   296: ifge -> 355
    //   299: goto -> 306
    //   302: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   305: athrow
    //   306: aload_0
    //   307: aload_0
    //   308: getfield p : Lnet/minecraft/network/datasync/EntityDataManager;
    //   311: getstatic com/schnurritv/sexmod/bg.ar : Lnet/minecraft/network/datasync/DataParameter;
    //   314: invokevirtual func_187225_a : (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
    //   317: checkcast java/lang/Float
    //   320: invokevirtual floatValue : ()F
    //   323: ldc 3.0
    //   325: fcmpg
    //   326: ifge -> 345
    //   329: goto -> 336
    //   332: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   335: athrow
    //   336: ldc 'animation.cat.walk'
    //   338: goto -> 347
    //   341: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   344: athrow
    //   345: ldc 'animation.cat.run'
    //   347: iconst_1
    //   348: aload_1
    //   349: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   352: goto -> 363
    //   355: aload_0
    //   356: ldc 'animation.cat.fly'
    //   358: iconst_1
    //   359: aload_1
    //   360: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   363: aload_0
    //   364: aload_0
    //   365: getfield field_70759_as : F
    //   368: putfield field_70177_z : F
    //   371: goto -> 818
    //   374: aload_0
    //   375: new java/lang/StringBuilder
    //   378: dup
    //   379: invokespecial <init> : ()V
    //   382: ldc 'animation.cat.idle'
    //   384: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   387: aload_0
    //   388: getfield av : Z
    //   391: ifeq -> 403
    //   394: ldc '2'
    //   396: goto -> 405
    //   399: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   402: athrow
    //   403: ldc ''
    //   405: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   408: invokevirtual toString : ()Ljava/lang/String;
    //   411: iconst_1
    //   412: aload_1
    //   413: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   416: goto -> 818
    //   419: getstatic com/schnurritv/sexmod/bg$a.a : [I
    //   422: aload_0
    //   423: invokevirtual o : ()Lcom/schnurritv/sexmod/m;
    //   426: invokevirtual ordinal : ()I
    //   429: iaload
    //   430: tableswitch default -> 818, 1 -> 532, 2 -> 547, 3 -> 578, 4 -> 578, 5 -> 589, 6 -> 600, 7 -> 611, 8 -> 622, 9 -> 633, 10 -> 644, 11 -> 655, 12 -> 666, 13 -> 677, 14 -> 688, 15 -> 733, 16 -> 744, 17 -> 755, 18 -> 766, 19 -> 777, 20 -> 788, 21 -> 799, 22 -> 810
    //   532: aload_0
    //   533: ldc 'animation.cat.null'
    //   535: iconst_1
    //   536: aload_1
    //   537: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   540: goto -> 818
    //   543: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   546: athrow
    //   547: aload_0
    //   548: new java/lang/StringBuilder
    //   551: dup
    //   552: invokespecial <init> : ()V
    //   555: ldc 'animation.cat.attack'
    //   557: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   560: aload_0
    //   561: getfield T : I
    //   564: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   567: invokevirtual toString : ()Ljava/lang/String;
    //   570: iconst_0
    //   571: aload_1
    //   572: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   575: goto -> 818
    //   578: aload_0
    //   579: ldc 'animation.cat.sit'
    //   581: iconst_1
    //   582: aload_1
    //   583: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   586: goto -> 818
    //   589: aload_0
    //   590: ldc 'animation.cat.bowcharge'
    //   592: iconst_0
    //   593: aload_1
    //   594: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   597: goto -> 818
    //   600: aload_0
    //   601: ldc 'animation.cat.throwpearl'
    //   603: iconst_1
    //   604: aload_1
    //   605: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   608: goto -> 818
    //   611: aload_0
    //   612: ldc 'animation.cat.downed'
    //   614: iconst_1
    //   615: aload_1
    //   616: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   619: goto -> 818
    //   622: aload_0
    //   623: ldc 'animation.cat.start_fishing'
    //   625: iconst_0
    //   626: aload_1
    //   627: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   630: goto -> 818
    //   633: aload_0
    //   634: ldc 'animation.cat.idle_fishing'
    //   636: iconst_1
    //   637: aload_1
    //   638: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   641: goto -> 818
    //   644: aload_0
    //   645: ldc 'animation.cat.eat_fishing'
    //   647: iconst_0
    //   648: aload_1
    //   649: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   652: goto -> 818
    //   655: aload_0
    //   656: ldc 'animation.cat.throw_away'
    //   658: iconst_0
    //   659: aload_1
    //   660: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   663: goto -> 818
    //   666: aload_0
    //   667: ldc 'animation.cat.payment'
    //   669: iconst_0
    //   670: aload_1
    //   671: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   674: goto -> 818
    //   677: aload_0
    //   678: ldc 'animation.cat.touch_boobs_intro'
    //   680: iconst_0
    //   681: aload_1
    //   682: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   685: goto -> 818
    //   688: aload_0
    //   689: new java/lang/StringBuilder
    //   692: dup
    //   693: invokespecial <init> : ()V
    //   696: ldc 'animation.cat.touch_boobs_slow'
    //   698: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   701: aload_0
    //   702: getfield aa : Z
    //   705: ifeq -> 717
    //   708: ldc '1'
    //   710: goto -> 719
    //   713: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   716: athrow
    //   717: ldc ''
    //   719: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   722: invokevirtual toString : ()Ljava/lang/String;
    //   725: iconst_1
    //   726: aload_1
    //   727: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   730: goto -> 818
    //   733: aload_0
    //   734: ldc 'animation.cat.touch_boobs_fast'
    //   736: iconst_1
    //   737: aload_1
    //   738: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   741: goto -> 818
    //   744: aload_0
    //   745: ldc 'animation.cat.touch_boobs_cum'
    //   747: iconst_0
    //   748: aload_1
    //   749: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   752: goto -> 818
    //   755: aload_0
    //   756: ldc 'animation.cat.wait'
    //   758: iconst_0
    //   759: aload_1
    //   760: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   763: goto -> 818
    //   766: aload_0
    //   767: ldc 'animation.cat.sitting_intro'
    //   769: iconst_0
    //   770: aload_1
    //   771: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   774: goto -> 818
    //   777: aload_0
    //   778: ldc 'animation.cat.sitting_slow'
    //   780: iconst_1
    //   781: aload_1
    //   782: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   785: goto -> 818
    //   788: aload_0
    //   789: ldc 'animation.cat.sitting_fast'
    //   791: iconst_1
    //   792: aload_1
    //   793: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   796: goto -> 818
    //   799: aload_0
    //   800: ldc 'animation.cat.sitting_cum'
    //   802: iconst_0
    //   803: aload_1
    //   804: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   807: goto -> 818
    //   810: aload_0
    //   811: ldc 'animation.cat.head_pat'
    //   813: iconst_1
    //   814: aload_1
    //   815: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   818: getstatic software/bernie/geckolib3/core/PlayState.CONTINUE : Lsoftware/bernie/geckolib3/core/PlayState;
    //   821: areturn
    // Exception table:
    //   from	to	target	type
    //   0	14	14	java/lang/RuntimeException
    //   28	77	80	java/lang/RuntimeException
    //   114	150	153	java/lang/RuntimeException
    //   140	168	168	java/lang/RuntimeException
    //   183	204	204	java/lang/RuntimeException
    //   208	226	226	java/lang/RuntimeException
    //   230	267	270	java/lang/RuntimeException
    //   260	299	302	java/lang/RuntimeException
    //   274	329	332	java/lang/RuntimeException
    //   306	341	341	java/lang/RuntimeException
    //   374	399	399	java/lang/RuntimeException
    //   419	543	543	java/lang/RuntimeException
    //   688	713	713	java/lang/RuntimeException
  }
  
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
            case 54906230:
              if (str.equals("idleDone"))
                b = 2; 
              break;
            case 1684190080:
              if (str.equals("idle2Done"))
                b = 3; 
              break;
            case 106540102:
              if (str.equals("pearl"))
                b = 4; 
              break;
            case -922762033:
              if (str.equals("start_fishingDone"))
                b = 5; 
              break;
            case 1672277927:
              if (str.equals("rod_shoot"))
                b = 6; 
              break;
            case 100184:
              if (str.equals("eat"))
                b = 7; 
              break;
            case -1310305744:
              if (str.equals("eatPay"))
                b = 8; 
              break;
            case 3035601:
              if (str.equals("burp"))
                b = 9; 
              break;
            case 350188588:
              if (str.equals("eatingDone"))
                b = 10; 
              break;
            case -274246489:
              if (str.equals("throw_away"))
                b = 11; 
              break;
            case 1193768393:
              if (str.equals("renderItem"))
                b = 12; 
              break;
            case -1540620298:
              if (str.equals("paymentMSG1"))
                b = 13; 
              break;
            case -1540620297:
              if (str.equals("paymentMSG2"))
                b = 14; 
              break;
            case -1540620296:
              if (str.equals("paymentMSG3"))
                b = 15; 
              break;
            case -1540620295:
              if (str.equals("paymentMSG4"))
                b = 16; 
              break;
            case -1540860248:
              if (str.equals("paymentDone"))
                b = 17; 
              break;
            case -1380923296:
              if (str.equals("breath"))
                b = 18; 
              break;
            case -176763432:
              if (str.equals("rod_breath"))
                b = 19; 
              break;
            case 695019737:
              if (str.equals("happyOh"))
                b = 20; 
              break;
            case 620933088:
              if (str.equals("cutenya3"))
                b = 21; 
              break;
            case 620933087:
              if (str.equals("cutenya2"))
                b = 22; 
              break;
            case 103675:
              if (str.equals("huh"))
                b = 23; 
              break;
            case 3206589:
              if (str.equals("hmph"))
                b = 24; 
              break;
            case 3198650:
              if (str.equals("hehe"))
                b = 25; 
              break;
            case -1246024133:
              if (str.equals("giggle"))
                b = 26; 
              break;
            case 2094529267:
              if (str.equals("singing"))
                b = 27; 
              break;
            case 816936963:
              if (str.equals("touch_boobsMSG1"))
                b = 28; 
              break;
            case 110550847:
              if (str.equals("touch"))
                b = 29; 
              break;
            case 3273774:
              if (str.equals("jump"))
                b = 30; 
              break;
            case -334109968:
              if (str.equals("horninya"))
                b = 31; 
              break;
            case -1767474366:
              if (str.equals("horninya2"))
                b = 32; 
              break;
            case -108443135:
              if (str.equals("touch_boobs_cumMSG3"))
                b = 33; 
              break;
            case 296663352:
              if (str.equals("sitting_cumMSG1"))
                b = 34; 
              break;
            case 3357007:
              if (str.equals("moan"))
                b = 35; 
              break;
            case 298467170:
              if (str.equals("touch_boobs_introDone"))
                b = 36; 
              break;
            case -548534449:
              if (str.equals("touch_boobs_slowDone"))
                b = 37; 
              break;
            case -1265327365:
              if (str.equals("addCumSlow"))
                b = 38; 
              break;
            case -1265725098:
              if (str.equals("addCumFast"))
                b = 39; 
              break;
            case 968155646:
              if (str.equals("fastDone"))
                b = 40; 
              break;
            case -146438396:
              if (str.equals("moanOrNya"))
                b = 41; 
              break;
            case 403702091:
              if (str.equals("blackScreen"))
                b = 42; 
              break;
            case -108683087:
              if (str.equals("touch_boobs_cumDone"))
                b = 43; 
              break;
            case 2023406731:
              if (str.equals("resetGirl"))
                b = 44; 
              break;
            case -108443137:
              if (str.equals("touch_boobs_cumMSG1"))
                b = 45; 
              break;
            case -108443136:
              if (str.equals("touch_boobs_cumMSG2"))
                b = 46; 
              break;
            case -253569070:
              if (str.equals("call_playerMSG1"))
                b = 47; 
              break;
            case 809204182:
              if (str.equals("pounding"))
                b = 48; 
              break;
            case -1235980887:
              if (str.equals("sitting_introMSG1"))
                b = 49; 
              break;
            case -1236220837:
              if (str.equals("sitting_introDone"))
                b = 50; 
              break;
            case -874895228:
              if (str.equals("sitting_slowMSG1"))
                b = 51; 
              break;
            case 1177514335:
              if (str.equals("sitting_fastMSG1"))
                b = 52; 
              break;
            case 1177274385:
              if (str.equals("sitting_fastDone"))
                b = 53; 
              break;
            case 1185581771:
              if (str.equals("sitting_fastTp"))
                b = 54; 
              break;
            case 1888271923:
              if (str.equals("headpatMSG1"))
                b = 55; 
              break;
            case 1888271924:
              if (str.equals("headpatMSG2"))
                b = 56; 
              break;
            case 1888271925:
              if (str.equals("headpatMSG3"))
                b = 57; 
              break;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        try {
          int[] arrayOfInt;
          int i;
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
              
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              this.av = (func_70681_au().nextInt(10) == 0);
              break;
            case 3:
              this.av = false;
              break;
            case 4:
              aV.a.sendToServer(new co(N()));
              break;
            case 5:
              try {
                if (E())
                  c(m.FISHING_IDLE); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 6:
              try {
                if (E())
                  aV.a.sendToServer(new ar(N())); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 7:
              a(L.a(L.MISC_EAT), 0.5F + 0.5F * this.field_70146_Z.nextInt(2), (this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat()) * 0.2F + 1.0F);
              this.ae -= 0.33333334F;
              break;
            case 8:
              a(L.a(L.MISC_EAT), 0.5F + 0.5F * this.field_70146_Z.nextInt(2), (this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat()) * 0.2F + 1.0F);
              this.E -= 0.33333334F;
              break;
            case 9:
              a(SoundEvents.field_187739_dZ, 0.5F, this.field_70146_Z.nextFloat() * 0.1F + 0.9F);
              break;
            case 10:
              try {
                if (E()) {
                  aV.a.sendToServer(new am(N()));
                  c(m.NULL);
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              this.ae = 1.0F;
              this.ai = 0.0F;
              break;
            case 11:
              try {
                if (E())
                  aV.a.sendToServer(new a9(N())); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              this.ae = 1.0F;
              this.ai = 0.0F;
              break;
            case 12:
              this.ai = 1.0F;
              break;
            case 13:
              a(n(), "Here, I know u like fish and yea.. these are for you");
              a(L.MISC_PLOB[0]);
              break;
            case 14:
              b("huh~?");
              a(L.GIRLS_LUNA_HUH, new int[0]);
              break;
            case 15:
              b("nyyyaaaa~ :D");
              arrayOfInt = new int[] { 1, 7, 10, 11 };
              i = arrayOfInt[func_70681_au().nextInt(arrayOfInt.length)];
              a(L.GIRLS_LUNA_CUTENYA[i]);
              break;
            case 16:
              b("tankuuuu owowowo");
              a(L.GIRLS_LUNA_OWO, new int[0]);
              break;
            case 17:
              try {
                if (E())
                  q(); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              this.E = 1.0F;
              break;
            case 18:
            case 19:
              a(L.GIRLS_LUNA_LIGHTBREATHING, new int[0]);
              break;
            case 20:
              a(L.GIRLS_LUNA_HAPPYOH, new int[0]);
              break;
            case 21:
              a(L.GIRLS_LUNA_CUTENYA[3]);
              break;
            case 22:
              a(L.GIRLS_LUNA_CUTENYA[2]);
              break;
            case 23:
              a(L.GIRLS_LUNA_HUH, new int[0]);
              break;
            case 24:
              a(L.GIRLS_LUNA_HMPH, new int[0]);
              break;
            case 25:
            case 26:
              a(L.GIRLS_LUNA_GIGGLE, new int[0]);
              break;
            case 27:
              a(L.GIRLS_LUNA_SINGING, new int[0]);
              break;
            case 28:
              b("comon~ touch me hihi~");
              a(L.GIRLS_LUNA_GIGGLE, new int[0]);
              break;
            case 29:
              a(L.MISC_TOUCH, new int[0]);
              break;
            case 30:
              a(L.MISC_JUMP[0], 0.2F);
              break;
            case 31:
              a(L.GIRLS_LUNA_HORNINYA, new int[0]);
              break;
            case 32:
            case 33:
            case 34:
              a(L.GIRLS_LUNA_HORNINYA[1]);
              a(L.MISC_CUMINFLATION[0], 5.0F);
              break;
            case 35:
              a(L.a(L.GIRLS_LUNA_MOAN));
              break;
            case 36:
              try {
                c(m.TOUCH_BOOBS_SLOW);
                if (k()) {
                  cG.c();
                  cG.d();
                  aK.a(false);
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 37:
              try {
                if (this.aa) {
                  this.aa = false;
                  break;
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              try {
              
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              this.aa = (Math.random() < 0.5D);
              break;
            case 38:
              try {
                if (k())
                  cG.a(0.019999999552965164D); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 39:
              try {
                if (k())
                  cG.a(0.03999999910593033D); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 40:
              try {
                if (!k())
                  break; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              try {
                if (!aK.b)
                  c(m.TOUCH_BOOBS_SLOW); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 41:
              try {
                if (Math.random() > 0.5D) {
                  a(L.a(L.GIRLS_LUNA_MOAN));
                  break;
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              a(L.a(L.GIRLS_LUNA_HORNINYA));
              break;
            case 42:
              try {
                if (k())
                  bd.b(); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 43:
              try {
                if (k()) {
                  cG.c();
                  i();
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 44:
              try {
                if (E())
                  i(); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 45:
              a(L.GIRLS_LUNA_HORNINYA[3]);
              break;
            case 46:
              a(L.GIRLS_LUNA_HORNINYA[9]);
              break;
            case 47:
              a(L.GIRLS_LUNA_GIGGLE, new int[0]);
              b("come here - big guy hehe~");
              break;
            case 48:
              a(L.a(L.MISC_POUNDING));
              break;
            case 49:
              a(L.GIRLS_LUNA_GIGGLE, new int[0]);
              b("hehe~");
              break;
            case 50:
              try {
                if (k()) {
                  c(m.COWGIRL_SITTING_SLOW);
                  cG.c();
                  cG.d();
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 51:
              try {
                if (func_70681_au().nextBoolean()) {
                  try {
                    if (func_70681_au().nextBoolean()) {
                      a(L.a(L.GIRLS_LUNA_HORNINYA));
                      break;
                    } 
                  } catch (RuntimeException runtimeException) {
                    throw a(null);
                  } 
                  a(L.a(L.GIRLS_LUNA_MOAN));
                } else {
                  a(L.a(L.GIRLS_LUNA_LIGHTBREATHING));
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              try {
                if (k())
                  cG.a(0.02D); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 52:
              try {
                if (func_70681_au().nextBoolean()) {
                  a(L.a(L.GIRLS_LUNA_HORNINYA));
                } else {
                  a(L.a(L.GIRLS_LUNA_MOAN));
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
            case 53:
              try {
                if (k() && !aK.b) {
                  c(m.COWGIRL_SITTING_SLOW);
                  Vec3d vec3d1 = new Vec3d(0.0D, -0.07500000298023224D, -0.7109375D);
                  Vec3d vec3d2 = aH.a(vec3d1, s().floatValue() + 180.0F);
                  (Minecraft.func_71410_x()).field_71439_g.func_70107_b((I()).field_72450_a + vec3d2.field_72450_a, (I()).field_72448_b + vec3d2.field_72448_b, (I()).field_72449_c + vec3d2.field_72449_c);
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 54:
              if (k()) {
                Vec3d vec3d1 = new Vec3d(0.0D, -0.160625D, -0.9925D);
                Vec3d vec3d2 = aH.a(vec3d1, s().floatValue() + 180.0F);
                (Minecraft.func_71410_x()).field_71439_g.func_70107_b((I()).field_72450_a + vec3d2.field_72450_a, (I()).field_72448_b + vec3d2.field_72448_b, (I()).field_72449_c + vec3d2.field_72449_c);
              } 
              break;
            case 55:
              b("huh?~");
              a(L.GIRLS_LUNA_HUH, new int[0]);
              break;
            case 56:
              a(L.GIRLS_LUNA_MMM, new int[0]);
              break;
            case 57:
              b("nya~");
              a(L.GIRLS_LUNA_HORNINYA[0]);
              break;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      };
    this.q.transitionLengthTicks = 10.0D;
    this.k.registerSoundListener(iSoundListener);
    paramAnimationData.addAnimationController(this.k);
    paramAnimationData.addAnimationController(this.q);
    paramAnimationData.addAnimationController(this.o);
  }
  
  public void func_70037_a(NBTTagCompound paramNBTTagCompound) {
    super.func_70037_a(paramNBTTagCompound);
    func_189654_d(false);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  public static class b {
    @SubscribeEvent
    public void a(EntityJoinWorldEvent param1EntityJoinWorldEvent) {
      Entity entity = param1EntityJoinWorldEvent.getEntity();
      if (entity instanceof EntityCreeper) {
        EntityCreeper entityCreeper = (EntityCreeper)entity;
        entityCreeper.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAIAvoidEntity((EntityCreature)entityCreeper, bg.class, 6.0F, 1.0D, 1.2D));
      } 
    }
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\bg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */