package com.schnurritv.sexmod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.vecmath.Vector2f;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
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
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.SoundKeyframeEvent;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;

public class bf extends br {
  public static final G ar = G.DARK_GREEN;
  
  public static final Vec3i V = new Vec3i(11, 6, 11);
  
  public static final Vec3d Q = new Vec3d(5.0D, 1.0D, 9.0D);
  
  public static final Vec3d aV = new Vec3d(3.0D, -1.0D, 6.0D);
  
  public static final Vec3d W = new Vec3d(1.0D, 1.0D, 5.0D);
  
  public static final Vec3d as = new Vec3d(-6.0D, -1.0D, 3.0D);
  
  public static final Vec3d ae = new Vec3d(5.0D, 1.0D, 1.0D);
  
  public static final Vec3d ad = new Vec3d(-3.0D, -1.0D, -6.0D);
  
  public static final Vec3d aj = new Vec3d(9.0D, 1.0D, 5.0D);
  
  public static final Vec3d aN = new Vec3d(0.0D, -1.0D, -4.0D);
  
  public static final Vec3d am = new Vec3d(1.0D, -1.0D, -3.0D);
  
  public static final Vec3d O = new Vec3d(-1.0D, -1.0D, -3.0D);
  
  public static final Vec3d aJ = new Vec3d(6.0D, -1.0D, -3.0D);
  
  public static final int az = 39;
  
  public static final int aE = 15;
  
  public static final int af = 8400;
  
  static final int aL = 45;
  
  static final int at = 32000;
  
  static final int R = 26;
  
  static final int aX = 205;
  
  static final int aB = 100;
  
  static final int P = 1200;
  
  static final int av = 30;
  
  static final int aD = 37;
  
  static final float aO = 2.0F;
  
  static final int an = 5;
  
  static final int aW = 100;
  
  static final int aI = 20;
  
  static final float aK = 0.825F;
  
  static final Vector2f aA = new Vector2f(0.5F, 0.99F);
  
  static final HashSet<Item> al = new HashSet<>(Arrays.asList(new Item[] { 
          Items.field_151013_M, Items.field_151136_bY, Items.field_151043_k, Items.field_151153_ao, Items.field_151006_E, Items.field_151011_C, Items.field_151005_D, Items.field_151010_B, Items.field_151150_bK, (Item)Items.field_151169_ag, 
          (Item)Items.field_151151_aj, (Item)Items.field_151171_ah, (Item)Items.field_151149_ai, Items.field_151043_k, Items.field_151074_bl, Item.func_150898_a(Blocks.field_150340_R), Item.func_150898_a(Blocks.field_150352_o) }));
  
  public static final DataParameter<String> ah = EntityDataManager.func_187226_a(bf.class, DataSerializers.field_187194_d).func_187156_b().func_187161_a(122);
  
  public static final DataParameter<String> aQ = EntityDataManager.func_187226_a(bf.class, DataSerializers.field_187194_d).func_187156_b().func_187161_a(123);
  
  public static final DataParameter<ItemStack> U = EntityDataManager.func_187226_a(bf.class, DataSerializers.field_187196_f).func_187156_b().func_187161_a(124);
  
  public static final DataParameter<Boolean> aG = EntityDataManager.func_187226_a(bf.class, DataSerializers.field_187198_h).func_187156_b().func_187161_a(125);
  
  public static final DataParameter<Boolean> N = EntityDataManager.func_187226_a(bf.class, DataSerializers.field_187198_h).func_187156_b().func_187161_a(126);
  
  public boolean aP = false;
  
  public boolean ai = false;
  
  public float S = 0.0F;
  
  public long ab = -1L;
  
  public Vec3d aF = Vec3d.field_186680_a;
  
  List<UUID> Z = new ArrayList<>();
  
  int au = 31520;
  
  int X = -1;
  
  public int aw = -1;
  
  boolean aC = false;
  
  BlockPos ap = null;
  
  int aa = 0;
  
  int ac = 0;
  
  int aM = 0;
  
  int ag = -1;
  
  int ak = 0;
  
  long aR = 0L;
  
  List<bf> Y = new ArrayList<>();
  
  int aS = -1;
  
  int ax = -1;
  
  m aT = null;
  
  public float T = 1.0F;
  
  int aq = -1;
  
  boolean ay = true;
  
  boolean M = true;
  
  boolean aU = false;
  
  String aH = "";
  
  boolean ao = false;
  
  public bf(World paramWorld) {
    super(paramWorld);
    func_70105_a(aA.x, aA.y);
  }
  
  public bf(World paramWorld, @Nonnull String paramString, int paramInt) {
    this(paramWorld);
    this.p.func_187227_b(aQ, paramString);
    this.p.func_187227_b(H, a(new StringBuilder(), paramInt));
  }
  
  public bf(World paramWorld, boolean paramBoolean, float paramFloat, Vec3d paramVec3d) {
    this(paramWorld);
    if (!paramBoolean)
      return; 
    this.p.func_187227_b(H, b(new StringBuilder()));
    this.S = paramFloat;
    this.aF = paramVec3d;
    this.ai = true;
    a(paramVec3d);
    a(paramFloat);
    c(m.SIT);
    a(true);
    func_70107_b(paramVec3d.field_72450_a, paramVec3d.field_72448_b, paramVec3d.field_72449_c);
  }
  
  public void D() {
    super.D();
    d((UUID)null);
    this.field_70145_X = false;
    func_189654_d(false);
  }
  
  protected void func_70088_a() {
    super.func_70088_a();
    aD aD = aD.values()[func_70681_au().nextInt((aD.values()).length)];
    this.p.func_187214_a(L, new BlockPos(aD.a()));
    this.p.func_187214_a(G, ar.name());
    this.p.func_187214_a(ah, "");
    this.p.func_187214_a(aQ, "");
    this.p.func_187214_a(U, ItemStack.field_190927_a);
    this.p.func_187214_a(aG, Boolean.valueOf(false));
    this.p.func_187214_a(N, Boolean.valueOf(false));
  }
  
  protected void a() {
    b2.c();
  }
  
  public void func_70106_y() {
    try {
      super.func_70106_y();
      d((UUID)null);
      if (this.field_70170_p.field_72995_K)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    ItemStack itemStack = (ItemStack)this.p.func_187225_a(U);
    try {
      if (itemStack == ItemStack.field_190927_a)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    EntityItem entityItem = new EntityItem(this.field_70170_p, this.field_70165_t, this.field_70163_u, this.field_70161_v, itemStack);
    this.field_70170_p.func_72838_d((Entity)entityItem);
  }
  
  public void a(String paramString, UUID paramUUID) {
    try {
      if ("take ur stuff back".equals(paramString))
        c(m.START_THROWING); 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if ("use her".equals(paramString))
        f(paramUUID); 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
  }
  
  public void f(UUID paramUUID) {
    this.aS = 0;
    bd.b();
    aK.a(false);
    e(paramUUID);
  }
  
  public void a(UUID paramUUID) {
    this.ax = 0;
    bd.b();
    aK.a(false);
    e(paramUUID);
  }
  
  public String H() {
    return "Goblin";
  }
  
  public float func_70047_e() {
    return 0.75F;
  }
  
  public float e() {
    return 0.1F;
  }
  
  public void d(UUID paramUUID) {
    try {
      if (paramUUID == null) {
        this.p.func_187227_b(ah, "");
        return;
      } 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    this.p.func_187227_b(ah, paramUUID.toString());
  }
  
  @Nullable
  public UUID m() {
    String str = (String)this.p.func_187225_a(ah);
    try {
      if ("".equals(str))
        return null; 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      return UUID.fromString((String)this.p.func_187225_a(ah));
    } catch (Exception exception) {
      exception.printStackTrace();
      return null;
    } 
  }
  
  protected String b(StringBuilder paramStringBuilder) {
    a(paramStringBuilder, 3);
    a(paramStringBuilder, 2);
    a(paramStringBuilder, 2);
    c(paramStringBuilder, 7);
    c(paramStringBuilder, 7);
    a(paramStringBuilder, 5);
    a(paramStringBuilder, (F.values()).length - 1);
    a(paramStringBuilder, (G.values()).length - 1);
    a(paramStringBuilder, (aD.values()).length - 1);
    c(paramStringBuilder, 1);
    return paramStringBuilder.toString();
  }
  
  protected String a(StringBuilder paramStringBuilder) {
    a(paramStringBuilder, 3);
    a(paramStringBuilder, 2);
    a(paramStringBuilder, 2);
    a(paramStringBuilder, 8);
    a(paramStringBuilder, 8);
    a(paramStringBuilder, 5);
    a(paramStringBuilder, (F.values()).length - 1);
    a(paramStringBuilder, (G.values()).length - 1);
    a(paramStringBuilder, (aD.values()).length - 1);
    c(paramStringBuilder, 0);
    return paramStringBuilder.toString();
  }
  
  public ArrayList<Integer> J() {
    return new c();
  }
  
  public List<Integer> x() {
    return Collections.singletonList(Integer.valueOf(2));
  }
  
  public cb e(int paramInt) {
    try {
      switch (paramInt) {
        case 0:
          return new cb(40, 130);
        case 1:
          return new cb(60, 130);
        case 2:
          return new cb(80, 130);
        case 3:
          return new cb(100, 130);
        case 4:
          return new cb(120, 130);
        case 5:
          return new cb(140, 130);
        case 6:
          return new cb(160, 130);
        case 7:
          return new cb(180, 130);
        case 8:
          return new cb(200, 0);
        case 9:
          return new cb(200, 130);
      } 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    return cb.a;
  }
  
  public void a(List<Integer> paramList) {
    StringBuilder stringBuilder = new StringBuilder();
    Iterator<Integer> iterator = paramList.iterator();
    while (iterator.hasNext()) {
      int i = ((Integer)iterator.next()).intValue();
      c(stringBuilder, i);
    } 
    try {
      c(stringBuilder, Integer.parseInt(a(this)[9]));
      this.p.func_187227_b(H, stringBuilder.toString());
      if (Main.proxy instanceof ClientProxy)
        b2.c(); 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
  }
  
  void L() {
    try {
      if (this.n == null)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    StringBuilder stringBuilder = new StringBuilder();
    for (Map.Entry<ah, Map.Entry<List<String>, Integer>> entry : this.n) {
      int i = ((Integer)((Map.Entry)entry.getValue()).getValue()).intValue();
      c(stringBuilder, i);
    } 
    c(stringBuilder, Integer.parseInt(a(this)[9]));
    this.p.func_187227_b(H, stringBuilder.toString());
    b2.c();
  }
  
  protected String a(StringBuilder paramStringBuilder, int paramInt) {
    a(paramStringBuilder, 3);
    a(paramStringBuilder, 2);
    a(paramStringBuilder, 2);
    a(paramStringBuilder, 7);
    a(paramStringBuilder, 7);
    a(paramStringBuilder, 5);
    a(paramStringBuilder, (F.values()).length - 1);
    c(paramStringBuilder, paramInt);
    a(paramStringBuilder, (aD.values()).length - 1);
    c(paramStringBuilder, 0);
    return paramStringBuilder.toString();
  }
  
  public void func_70014_b(NBTTagCompound paramNBTTagCompound) {
    try {
      super.func_70014_b(paramNBTTagCompound);
      paramNBTTagCompound.func_74778_a("bodyColor", (String)this.p.func_187225_a(G));
      paramNBTTagCompound.func_74768_a("eyeColorX", ((BlockPos)this.p.func_187225_a(L)).func_177958_n());
      paramNBTTagCompound.func_74768_a("eyeColorY", ((BlockPos)this.p.func_187225_a(L)).func_177956_o());
      paramNBTTagCompound.func_74768_a("eyeColorZ", ((BlockPos)this.p.func_187225_a(L)).func_177952_p());
      paramNBTTagCompound.func_74778_a("model", (String)this.p.func_187225_a(H));
      paramNBTTagCompound.func_74778_a("girlID", (String)this.p.func_187225_a(x));
      paramNBTTagCompound.func_74778_a("queen", (String)this.p.func_187225_a(aQ));
      paramNBTTagCompound.func_74757_a("isQueen", this.ai);
      paramNBTTagCompound.func_74757_a("isTamed", ((Boolean)this.p.func_187225_a(aG)).booleanValue());
      paramNBTTagCompound.func_74768_a("robTicks", this.au);
      if (!this.ai)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    paramNBTTagCompound.func_74757_a("preggo", ((Boolean)this.p.func_187225_a(N)).booleanValue());
    paramNBTTagCompound.func_74776_a("throneRot", this.S);
    paramNBTTagCompound.func_74780_a("thronePosX", this.aF.field_72450_a);
    paramNBTTagCompound.func_74780_a("thronePosY", this.aF.field_72448_b);
    paramNBTTagCompound.func_74780_a("thronePosZ", this.aF.field_72449_c);
    paramNBTTagCompound.func_74772_a("impregnationTick", this.ab);
    byte b = 0;
    try {
      while (b < this.Z.size()) {
        paramNBTTagCompound.func_74778_a("guard" + b, ((UUID)this.Z.get(b)).toString());
        b++;
      } 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
  }
  
  public void func_70037_a(NBTTagCompound paramNBTTagCompound) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial func_70037_a : (Lnet/minecraft/nbt/NBTTagCompound;)V
    //   5: aload_0
    //   6: aload_1
    //   7: ldc 'isQueen'
    //   9: invokevirtual func_74767_n : (Ljava/lang/String;)Z
    //   12: putfield ai : Z
    //   15: aload_0
    //   16: getfield p : Lnet/minecraft/network/datasync/EntityDataManager;
    //   19: getstatic com/schnurritv/sexmod/bf.H : Lnet/minecraft/network/datasync/DataParameter;
    //   22: aload_1
    //   23: ldc 'model'
    //   25: invokevirtual func_74779_i : (Ljava/lang/String;)Ljava/lang/String;
    //   28: invokevirtual func_187227_b : (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
    //   31: aload_0
    //   32: getfield p : Lnet/minecraft/network/datasync/EntityDataManager;
    //   35: getstatic com/schnurritv/sexmod/bf.G : Lnet/minecraft/network/datasync/DataParameter;
    //   38: aload_1
    //   39: ldc 'bodyColor'
    //   41: invokevirtual func_74779_i : (Ljava/lang/String;)Ljava/lang/String;
    //   44: invokevirtual func_187227_b : (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
    //   47: aload_0
    //   48: invokestatic a : (Lcom/schnurritv/sexmod/bS;)[Ljava/lang/String;
    //   51: astore_2
    //   52: aload_2
    //   53: iconst_3
    //   54: aaload
    //   55: invokestatic parseInt : (Ljava/lang/String;)I
    //   58: bipush #7
    //   60: if_icmpgt -> 81
    //   63: aload_2
    //   64: iconst_4
    //   65: aaload
    //   66: invokestatic parseInt : (Ljava/lang/String;)I
    //   69: bipush #7
    //   71: if_icmple -> 126
    //   74: goto -> 81
    //   77: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   80: athrow
    //   81: aload_0
    //   82: getfield p : Lnet/minecraft/network/datasync/EntityDataManager;
    //   85: getstatic com/schnurritv/sexmod/bf.H : Lnet/minecraft/network/datasync/DataParameter;
    //   88: aload_0
    //   89: new java/lang/StringBuilder
    //   92: dup
    //   93: invokespecial <init> : ()V
    //   96: aload_0
    //   97: invokevirtual a : ()I
    //   100: invokevirtual a : (Ljava/lang/StringBuilder;I)Ljava/lang/String;
    //   103: invokevirtual func_187227_b : (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
    //   106: getstatic com/schnurritv/sexmod/Main.LOGGER : Lorg/apache/logging/log4j/Logger;
    //   109: getstatic org/apache/logging/log4j/Level.INFO : Lorg/apache/logging/log4j/Level;
    //   112: ldc 'updated an old Goblin'
    //   114: invokeinterface log : (Lorg/apache/logging/log4j/Level;Ljava/lang/String;)V
    //   119: goto -> 126
    //   122: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   125: athrow
    //   126: aload_0
    //   127: getfield p : Lnet/minecraft/network/datasync/EntityDataManager;
    //   130: getstatic com/schnurritv/sexmod/bf.L : Lnet/minecraft/network/datasync/DataParameter;
    //   133: new net/minecraft/util/math/BlockPos
    //   136: dup
    //   137: aload_1
    //   138: ldc 'eyeColorX'
    //   140: invokevirtual func_74762_e : (Ljava/lang/String;)I
    //   143: aload_1
    //   144: ldc 'eyeColorY'
    //   146: invokevirtual func_74762_e : (Ljava/lang/String;)I
    //   149: aload_1
    //   150: ldc 'eyeColorZ'
    //   152: invokevirtual func_74762_e : (Ljava/lang/String;)I
    //   155: invokespecial <init> : (III)V
    //   158: invokevirtual func_187227_b : (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
    //   161: aload_0
    //   162: getfield p : Lnet/minecraft/network/datasync/EntityDataManager;
    //   165: getstatic com/schnurritv/sexmod/bf.x : Lnet/minecraft/network/datasync/DataParameter;
    //   168: aload_1
    //   169: ldc 'girlID'
    //   171: invokevirtual func_74779_i : (Ljava/lang/String;)Ljava/lang/String;
    //   174: invokevirtual func_187227_b : (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
    //   177: aload_0
    //   178: getfield p : Lnet/minecraft/network/datasync/EntityDataManager;
    //   181: getstatic com/schnurritv/sexmod/bf.aQ : Lnet/minecraft/network/datasync/DataParameter;
    //   184: aload_1
    //   185: ldc 'queen'
    //   187: invokevirtual func_74779_i : (Ljava/lang/String;)Ljava/lang/String;
    //   190: invokevirtual func_187227_b : (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
    //   193: aload_0
    //   194: getfield p : Lnet/minecraft/network/datasync/EntityDataManager;
    //   197: getstatic com/schnurritv/sexmod/bf.aG : Lnet/minecraft/network/datasync/DataParameter;
    //   200: aload_1
    //   201: ldc 'isTamed'
    //   203: invokevirtual func_74767_n : (Ljava/lang/String;)Z
    //   206: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   209: invokevirtual func_187227_b : (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
    //   212: aload_0
    //   213: aload_1
    //   214: ldc 'robTicks'
    //   216: invokevirtual func_74762_e : (Ljava/lang/String;)I
    //   219: putfield au : I
    //   222: aload_0
    //   223: getfield ai : Z
    //   226: ifne -> 234
    //   229: return
    //   230: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   233: athrow
    //   234: aload_0
    //   235: aload_1
    //   236: ldc 'throneRot'
    //   238: invokevirtual func_74760_g : (Ljava/lang/String;)F
    //   241: putfield S : F
    //   244: aload_0
    //   245: new net/minecraft/util/math/Vec3d
    //   248: dup
    //   249: aload_1
    //   250: ldc 'thronePosX'
    //   252: invokevirtual func_74769_h : (Ljava/lang/String;)D
    //   255: aload_1
    //   256: ldc 'thronePosY'
    //   258: invokevirtual func_74769_h : (Ljava/lang/String;)D
    //   261: aload_1
    //   262: ldc 'thronePosZ'
    //   264: invokevirtual func_74769_h : (Ljava/lang/String;)D
    //   267: invokespecial <init> : (DDD)V
    //   270: putfield aF : Lnet/minecraft/util/math/Vec3d;
    //   273: iconst_0
    //   274: istore_3
    //   275: ldc ''
    //   277: aload_1
    //   278: new java/lang/StringBuilder
    //   281: dup
    //   282: invokespecial <init> : ()V
    //   285: ldc 'guard'
    //   287: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   290: iload_3
    //   291: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   294: invokevirtual toString : ()Ljava/lang/String;
    //   297: invokevirtual func_74779_i : (Ljava/lang/String;)Ljava/lang/String;
    //   300: invokevirtual equals : (Ljava/lang/Object;)Z
    //   303: ifne -> 352
    //   306: aload_0
    //   307: getfield Z : Ljava/util/List;
    //   310: aload_1
    //   311: new java/lang/StringBuilder
    //   314: dup
    //   315: invokespecial <init> : ()V
    //   318: ldc 'guard'
    //   320: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   323: iload_3
    //   324: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   327: invokevirtual toString : ()Ljava/lang/String;
    //   330: invokevirtual func_74779_i : (Ljava/lang/String;)Ljava/lang/String;
    //   333: invokestatic fromString : (Ljava/lang/String;)Ljava/util/UUID;
    //   336: invokeinterface add : (Ljava/lang/Object;)Z
    //   341: pop
    //   342: iinc #3, 1
    //   345: goto -> 275
    //   348: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   351: athrow
    //   352: aload_0
    //   353: getfield p : Lnet/minecraft/network/datasync/EntityDataManager;
    //   356: getstatic com/schnurritv/sexmod/bf.N : Lnet/minecraft/network/datasync/DataParameter;
    //   359: aload_1
    //   360: ldc 'preggo'
    //   362: invokevirtual func_74767_n : (Ljava/lang/String;)Z
    //   365: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   368: invokevirtual func_187227_b : (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
    //   371: aload_0
    //   372: aload_1
    //   373: ldc 'impregnationTick'
    //   375: invokevirtual func_74763_f : (Ljava/lang/String;)J
    //   378: putfield ab : J
    //   381: return
    // Exception table:
    //   from	to	target	type
    //   52	74	77	java/util/ConcurrentModificationException
    //   63	119	122	java/util/ConcurrentModificationException
    //   126	230	230	java/util/ConcurrentModificationException
    //   275	348	348	java/util/ConcurrentModificationException
  }
  
  protected boolean func_184645_a(EntityPlayer paramEntityPlayer, EnumHand paramEnumHand) {
    try {
      if (this.field_70170_p.field_72995_K)
        return true; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (this.ai)
        return true; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (o() == m.RUN) {
        try {
          if (func_70032_d((Entity)paramEntityPlayer) > 3.5D) {
            paramEntityPlayer.func_146105_b((ITextComponent)new TextComponentString("get a bit closer..."), true);
          } else {
            a(paramEntityPlayer.func_174791_d());
            a(paramEntityPlayer.field_70177_z);
            c(m.CATCH);
            this.p.func_187227_b(u, "bj");
            d(paramEntityPlayer.getPersistentID());
            e(paramEntityPlayer.getPersistentID());
            func_70661_as().func_75499_g();
            this.field_70159_w = 0.0D;
            this.field_70181_x = 0.0D;
            this.field_70179_y = 0.0D;
          } 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        } 
        return true;
      } 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (e(paramEntityPlayer.getPersistentID())) {
        paramEntityPlayer.func_146105_b((ITextComponent)new TextComponentString("you are already carrying a Goblin"), true);
      } else {
        d(paramEntityPlayer.getPersistentID());
        c(m.PICK_UP);
        this.X = 45;
        a(false);
        this.p.func_187227_b(aG, Boolean.valueOf(true));
        func_70661_as().func_75499_g();
      } 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    return true;
  }
  
  boolean e(UUID paramUUID) {
    try {
      if (paramUUID == null)
        return false; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      for (bS bS : bS.l()) {
        try {
          if (!(bS instanceof bf))
            continue; 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        } 
        try {
          if (bS.field_70170_p.field_72995_K)
            continue; 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        } 
        try {
          if (!bS.field_70128_L && paramUUID.equals(((bf)bS).m()))
            return true; 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        } 
      } 
    } catch (ConcurrentModificationException concurrentModificationException) {}
    return false;
  }
  
  protected void func_184651_r() {
    this.t = new q((EntityLiving)this, (Class)EntityPlayer.class, 2.0F, 1.0F);
    this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.field_70714_bg.func_75776_a(3, new ao((EntityLiving)this));
    this.field_70714_bg.func_75776_a(5, (EntityAIBase)this.t);
  }
  
  public void func_70619_bc() {
    super.func_70619_bc();
    t();
    l();
    x();
    b();
    E();
    u();
    I();
    v();
    r();
    T();
    B();
    N();
    U();
    K();
  }
  
  public boolean func_70067_L() {
    m m1 = o();
    try {
      if (m1 == m.THROWN)
        return false; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (m1 == m.RUN)
        return super.func_70067_L(); 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (m1 == m.AWAIT_PICK_UP)
        return super.func_70067_L(); 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (m() != null)
        return false; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (m1 != m.NULL)
        return false; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    return super.func_70067_L();
  }
  
  void b(EntityPlayer paramEntityPlayer) {
    bo bo = bo.f(paramEntityPlayer.getPersistentID());
    try {
    
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    Vec3d vec3d1 = new Vec3d(paramEntityPlayer.field_70165_t, paramEntityPlayer.field_70163_u + ((bo == null) ? paramEntityPlayer.eyeHeight : bo.func_70047_e()), paramEntityPlayer.field_70161_v);
    Vec3d vec3d2 = new Vec3d(this.field_70165_t, this.field_70163_u + func_70047_e(), this.field_70161_v);
    double d1 = vec3d2.func_72438_d(vec3d1);
    double d2 = vec3d1.field_72448_b - vec3d2.field_72448_b;
    this.field_70125_A = (float)-(Math.sin(d2 / d1) * 57.29577951308232D);
  }
  
  void K() {
    // Byte code:
    //   0: aload_0
    //   1: getfield p : Lnet/minecraft/network/datasync/EntityDataManager;
    //   4: getstatic com/schnurritv/sexmod/bf.aG : Lnet/minecraft/network/datasync/DataParameter;
    //   7: invokevirtual func_187225_a : (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
    //   10: checkcast java/lang/Boolean
    //   13: invokevirtual booleanValue : ()Z
    //   16: ifne -> 24
    //   19: return
    //   20: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   23: athrow
    //   24: aload_0
    //   25: invokevirtual n : ()Ljava/util/UUID;
    //   28: ifnull -> 36
    //   31: return
    //   32: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   35: athrow
    //   36: aload_0
    //   37: invokevirtual o : ()Lcom/schnurritv/sexmod/m;
    //   40: getstatic com/schnurritv/sexmod/m.NULL : Lcom/schnurritv/sexmod/m;
    //   43: if_acmpeq -> 51
    //   46: return
    //   47: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   50: athrow
    //   51: aload_0
    //   52: getfield field_70170_p : Lnet/minecraft/world/World;
    //   55: aload_0
    //   56: ldc2_w 15.0
    //   59: invokevirtual func_72890_a : (Lnet/minecraft/entity/Entity;D)Lnet/minecraft/entity/player/EntityPlayer;
    //   62: astore_1
    //   63: aload_1
    //   64: ifnull -> 101
    //   67: aload_1
    //   68: aload_0
    //   69: invokevirtual func_70032_d : (Lnet/minecraft/entity/Entity;)F
    //   72: fconst_2
    //   73: fcmpg
    //   74: ifge -> 101
    //   77: goto -> 84
    //   80: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   83: athrow
    //   84: aload_0
    //   85: aload_1
    //   86: invokevirtual b : (Lnet/minecraft/entity/player/EntityPlayer;)V
    //   89: aload_0
    //   90: invokevirtual func_70661_as : ()Lnet/minecraft/pathfinding/PathNavigate;
    //   93: invokevirtual func_75499_g : ()V
    //   96: return
    //   97: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   100: athrow
    //   101: aload_0
    //   102: getfield ap : Lnet/minecraft/util/math/BlockPos;
    //   105: ifnull -> 167
    //   108: aload_0
    //   109: aload_0
    //   110: getfield ap : Lnet/minecraft/util/math/BlockPos;
    //   113: invokevirtual func_177958_n : ()I
    //   116: i2d
    //   117: aload_0
    //   118: getfield ap : Lnet/minecraft/util/math/BlockPos;
    //   121: invokevirtual func_177956_o : ()I
    //   124: i2d
    //   125: aload_0
    //   126: getfield ap : Lnet/minecraft/util/math/BlockPos;
    //   129: invokevirtual func_177952_p : ()I
    //   132: i2d
    //   133: invokevirtual func_70011_f : (DDD)D
    //   136: aload_0
    //   137: invokevirtual c : ()D
    //   140: dcmpl
    //   141: ifgt -> 167
    //   144: goto -> 151
    //   147: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   150: athrow
    //   151: aload_0
    //   152: getfield aa : I
    //   155: bipush #100
    //   157: if_icmple -> 295
    //   160: goto -> 167
    //   163: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   166: athrow
    //   167: aload_0
    //   168: invokevirtual func_70681_au : ()Ljava/util/Random;
    //   171: invokevirtual nextBoolean : ()Z
    //   174: ifeq -> 192
    //   177: goto -> 184
    //   180: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   183: athrow
    //   184: iconst_1
    //   185: goto -> 193
    //   188: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   191: athrow
    //   192: iconst_m1
    //   193: aload_0
    //   194: invokevirtual func_70681_au : ()Ljava/util/Random;
    //   197: iconst_5
    //   198: invokevirtual nextInt : (I)I
    //   201: imul
    //   202: istore_2
    //   203: aload_0
    //   204: invokevirtual func_70681_au : ()Ljava/util/Random;
    //   207: invokevirtual nextBoolean : ()Z
    //   210: ifeq -> 221
    //   213: iconst_1
    //   214: goto -> 222
    //   217: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   220: athrow
    //   221: iconst_m1
    //   222: aload_0
    //   223: invokevirtual func_70681_au : ()Ljava/util/Random;
    //   226: iconst_5
    //   227: invokevirtual nextInt : (I)I
    //   230: imul
    //   231: istore_3
    //   232: aload_0
    //   233: getfield field_70170_p : Lnet/minecraft/world/World;
    //   236: aload_0
    //   237: invokevirtual func_180425_c : ()Lnet/minecraft/util/math/BlockPos;
    //   240: invokevirtual func_177958_n : ()I
    //   243: iload_2
    //   244: iadd
    //   245: aload_0
    //   246: invokevirtual func_180425_c : ()Lnet/minecraft/util/math/BlockPos;
    //   249: invokevirtual func_177952_p : ()I
    //   252: iload_3
    //   253: iadd
    //   254: invokestatic a : (Lnet/minecraft/world/World;II)I
    //   257: istore #4
    //   259: aload_0
    //   260: new net/minecraft/util/math/BlockPos
    //   263: dup
    //   264: aload_0
    //   265: invokevirtual func_180425_c : ()Lnet/minecraft/util/math/BlockPos;
    //   268: invokevirtual func_177958_n : ()I
    //   271: iload_2
    //   272: iadd
    //   273: iload #4
    //   275: aload_0
    //   276: invokevirtual func_180425_c : ()Lnet/minecraft/util/math/BlockPos;
    //   279: invokevirtual func_177952_p : ()I
    //   282: iload_3
    //   283: iadd
    //   284: invokespecial <init> : (III)V
    //   287: putfield ap : Lnet/minecraft/util/math/BlockPos;
    //   290: aload_0
    //   291: iconst_0
    //   292: putfield aa : I
    //   295: aload_0
    //   296: getfield ap : Lnet/minecraft/util/math/BlockPos;
    //   299: aload_0
    //   300: invokevirtual func_180425_c : ()Lnet/minecraft/util/math/BlockPos;
    //   303: invokevirtual func_177951_i : (Lnet/minecraft/util/math/Vec3i;)D
    //   306: invokestatic sqrt : (D)D
    //   309: ldc2_w 2.0
    //   312: dcmpl
    //   313: ifle -> 362
    //   316: aload_0
    //   317: invokevirtual func_70661_as : ()Lnet/minecraft/pathfinding/PathNavigate;
    //   320: aload_0
    //   321: getfield ap : Lnet/minecraft/util/math/BlockPos;
    //   324: invokevirtual func_177958_n : ()I
    //   327: i2d
    //   328: aload_0
    //   329: getfield ap : Lnet/minecraft/util/math/BlockPos;
    //   332: invokevirtual func_177956_o : ()I
    //   335: i2d
    //   336: aload_0
    //   337: getfield ap : Lnet/minecraft/util/math/BlockPos;
    //   340: invokevirtual func_177952_p : ()I
    //   343: i2d
    //   344: ldc2_w 0.30000001192092896
    //   347: invokevirtual func_75492_a : (DDDD)Z
    //   350: pop
    //   351: aload_0
    //   352: invokevirtual C : ()V
    //   355: goto -> 372
    //   358: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   361: athrow
    //   362: aload_0
    //   363: dup
    //   364: getfield aa : I
    //   367: iconst_1
    //   368: iadd
    //   369: putfield aa : I
    //   372: return
    // Exception table:
    //   from	to	target	type
    //   0	20	20	java/util/ConcurrentModificationException
    //   24	32	32	java/util/ConcurrentModificationException
    //   36	47	47	java/util/ConcurrentModificationException
    //   63	77	80	java/util/ConcurrentModificationException
    //   67	97	97	java/util/ConcurrentModificationException
    //   101	144	147	java/util/ConcurrentModificationException
    //   108	160	163	java/util/ConcurrentModificationException
    //   151	177	180	java/util/ConcurrentModificationException
    //   167	188	188	java/util/ConcurrentModificationException
    //   203	217	217	java/util/ConcurrentModificationException
    //   295	358	358	java/util/ConcurrentModificationException
  }
  
  double c() {
    return Math.sqrt(800.0D);
  }
  
  void U() {
    try {
      if (o() != m.STAND_UP)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (++this.ac < 37)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    this.ac = 0;
    c(m.NULL);
  }
  
  void N() {
    try {
      if (o() != m.THROWN)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (!this.field_70122_E)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (++this.aM < 30)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    this.aM = 0;
    c(m.STAND_UP);
  }
  
  void B() {
    try {
      if (!this.ai)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (!((Boolean)this.p.func_187225_a(N)).booleanValue())
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (this.ab + 8400L < this.field_70170_p.func_82737_E())
        this.p.func_187227_b(N, Boolean.valueOf(false)); 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
  }
  
  void T() {
    try {
      if (!this.ai)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (this.Y.isEmpty())
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    boolean bool = false;
    for (bf bf1 : this.Y) {
      if (((Boolean)bf1.func_184212_Q().func_187225_a(aG)).booleanValue())
        bool = true; 
    } 
    try {
      if (!bool)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    a("Farewell my knight. You are welcome once I am breedable again.");
    for (bf bf1 : this.Y) {
      try {
        if (!((Boolean)bf1.func_184212_Q().func_187225_a(aG)).booleanValue())
          bf1.c(m.VANISH); 
      } catch (ConcurrentModificationException concurrentModificationException) {
        throw a(null);
      } 
    } 
    this.Y.clear();
    e((UUID)null);
  }
  
  void r() {
    try {
      if (!this.ai)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (this.aq == -1)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (++this.aq < 100)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    this.aq = -1;
    UUID uUID = n();
    try {
      if (uUID == null) {
        i();
        return;
      } 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(uUID);
    try {
      if (entityPlayer == null) {
        i();
        return;
      } 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    e((UUID)null);
    for (bf bf3 : this.Y)
      bf3.e((UUID)null); 
    List<bf> list = J();
    float f = this.S + 180.0F;
    Vec3d vec3d1 = this.aF.func_178787_e(a(am, f));
    Vec3d vec3d2 = this.aF.func_178787_e(a(O, f));
    Vec3d vec3d3 = this.aF.func_178787_e(a(aN, f));
    bf bf1 = list.get(0);
    bf bf2 = list.get(1);
    bf1.a(vec3d1);
    bf2.a(vec3d2);
    bf1.a(0.0F);
    bf2.a(0.0F);
    bf1.a(true);
    bf2.a(true);
    bf1.c(m.AWAIT_PICK_UP);
    bf2.c(m.AWAIT_PICK_UP);
    bf1.func_189654_d(false);
    bf2.func_189654_d(false);
    entityPlayer.func_189654_d(false);
    bf1.field_70145_X = false;
    bf2.field_70145_X = false;
    entityPlayer.field_70145_X = false;
    entityPlayer.field_70177_z = f;
    entityPlayer.field_70125_A = 30.0F;
    entityPlayer.func_70634_a(vec3d3.field_72450_a, vec3d3.field_72448_b, vec3d3.field_72449_c);
    aV.a.sendTo(new aw(true), (EntityPlayerMP)entityPlayer);
    a("Thanks to you, my clan is soon going to get a few new members! In return I will bear of one of my guards to serve as your personal Onahole. Choose wisely~");
  }
  
  void v() {
    try {
      if (!this.ai)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (this.ag == -1)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (++this.ag < 205)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    this.ag = -1;
    UUID uUID = n();
    try {
      if (uUID == null)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(uUID);
    try {
      if (entityPlayer == null)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    Vec3d vec3d = a(new Vec3d(0.0D, 0.15625D - entityPlayer.func_70047_e(), -0.8859375D), this.S - 180.0F);
    vec3d = vec3d.func_178787_e(I());
    entityPlayer.func_70634_a(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c);
  }
  
  public static Vec3d a(Vec3d paramVec3d, float paramFloat) {
    return a(paramVec3d, 0.0F, paramFloat);
  }
  
  public static Vec3d a(Vec3d paramVec3d, float paramFloat1, float paramFloat2) {
    Vec3d vec3d = new Vec3d(paramVec3d.field_72450_a, paramVec3d.field_72448_b * Math.cos(paramFloat1 * 0.017453292519943295D) - paramVec3d.field_72449_c * Math.sin(paramFloat1 * 0.017453292519943295D), paramVec3d.field_72448_b * Math.sin(paramFloat1 * 0.017453292519943295D) + paramVec3d.field_72449_c * Math.cos(paramFloat1 * 0.017453292519943295D));
    return new Vec3d(-Math.sin((paramFloat2 + 90.0F) * 0.017453292519943295D) * vec3d.field_72450_a - Math.sin(paramFloat2 * 0.017453292519943295D) * vec3d.field_72449_c, vec3d.field_72448_b, Math.cos((paramFloat2 + 90.0F) * 0.017453292519943295D) * vec3d.field_72450_a + Math.cos(paramFloat2 * 0.017453292519943295D) * vec3d.field_72449_c);
  }
  
  void I() {
    Vec3d vec3d1;
    try {
      if (!this.ai)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (o() != m.JUMP_0)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (++this.ak < 26)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    this.ak = 0;
    switch ((int)this.S) {
      case 90:
        vec3d1 = this.aF.func_178787_e(as);
        break;
      case 180:
        vec3d1 = this.aF.func_178787_e(ad);
        break;
      case -90:
        vec3d1 = this.aF.func_178787_e(aJ);
        break;
      default:
        vec3d1 = this.aF.func_178787_e(aV);
        break;
    } 
    UUID uUID = n();
    try {
      if (uUID == null)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(uUID);
    try {
      if (entityPlayer == null)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    a(vec3d1);
    a(this.S);
    c(m.BREEDING_INTRO_0);
    this.field_70145_X = true;
    func_189654_d(true);
    Vec3d vec3d2 = a(new Vec3d(0.0D, 0.44375D - entityPlayer.eyeHeight, -0.7875D), this.S - 180.0F);
    entityPlayer.field_70145_X = true;
    entityPlayer.func_189654_d(true);
    entityPlayer.func_70634_a(vec3d2.field_72450_a + vec3d1.field_72450_a, vec3d2.field_72448_b + vec3d1.field_72448_b, vec3d2.field_72449_c + vec3d1.field_72449_c);
    List<bf> list = J();
    if (list.size() >= 1) {
      bf bf1 = list.get(0);
      bf1.a(vec3d1);
      bf1.a(this.S);
      bf1.c(m.BREEDING_INTRO_1);
      bf1.field_70145_X = true;
      bf1.func_189654_d(true);
    } 
    if (list.size() >= 2) {
      bf bf1 = list.get(1);
      bf1.a(vec3d1);
      bf1.a(this.S);
      bf1.c(m.BREEDING_INTRO_2);
      bf1.field_70145_X = true;
      bf1.func_189654_d(true);
    } 
    this.ag = 0;
  }
  
  AxisAlignedBB a(Vec3d paramVec3d1, Vec3d paramVec3d2) {
    return new AxisAlignedBB(paramVec3d1.field_72450_a, paramVec3d1.field_72448_b, paramVec3d1.field_72449_c, paramVec3d2.field_72450_a, paramVec3d2.field_72448_b, paramVec3d2.field_72449_c);
  }
  
  void u() {
    try {
      if (!this.ai)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (n() != null)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    Vec3d vec3d1 = null;
    switch ((int)this.S) {
      case 0:
        vec3d1 = ae;
        break;
      case 90:
        vec3d1 = aj;
        break;
      case 180:
        vec3d1 = Q;
        break;
      case -90:
        vec3d1 = W;
        break;
    } 
    try {
      if (vec3d1 == null)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    Vec3d vec3d2 = this.aF.func_178786_a(0.5D, 0.0D, 0.5D).func_178788_d(vec3d1);
    AxisAlignedBB axisAlignedBB = a(vec3d2, vec3d2.func_72441_c(V.func_177958_n(), V.func_177956_o(), V.func_177952_p()));
    List<EntityPlayer> list = this.field_70170_p.func_72872_a(EntityPlayer.class, axisAlignedBB);
    try {
      if (list.isEmpty())
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    EntityPlayer entityPlayer = list.get(0);
    try {
      if (!entityPlayer.field_70122_E)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (((Boolean)this.p.func_187225_a(N)).booleanValue()) {
        try {
          if (this.aR + 1200L < this.field_70170_p.func_82737_E()) {
            entityPlayer.func_146105_b((ITextComponent)new TextComponentString("The Queen is still pregnant - so no breeding for you uwu"), true);
            this.aR = this.field_70170_p.func_82737_E();
          } 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        } 
        return;
      } 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    UUID uUID = entityPlayer.getPersistentID();
    Vec3d vec3d3 = entityPlayer.func_174791_d();
    float f = entityPlayer.field_70177_z + 180.0F;
    aV.a.sendTo(new aw(false), (EntityPlayerMP)entityPlayer);
    e(uUID);
    c(m.JUMP_0);
    a(vec3d3);
    a(f);
    a(true);
    List<bf> list1 = J();
    if (list1.size() > 0) {
      bf bf1 = list1.get(0);
      bf1.e(uUID);
      bf1.c(m.JUMP_1);
      bf1.a(vec3d3);
      bf1.a(f);
      bf1.a(true);
      if (list1.size() > 1) {
        bf bf2 = list1.get(1);
        bf2.e(uUID);
        bf2.c(m.JUMP_2);
        bf2.a(vec3d3);
        bf2.a(f);
        bf2.a(true);
      } 
    } 
  }
  
  List<bf> J() {
    try {
      if (this.Y.size() > 1)
        return this.Y; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    for (bf bf3 : this.Y)
      this.field_70170_p.func_72900_e((Entity)bf3); 
    this.Y.clear();
    bf bf1 = new bf(this.field_70170_p, N().toString(), a());
    bf1.func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
    this.field_70170_p.func_72838_d((Entity)bf1);
    this.Y.add(bf1);
    bf bf2 = new bf(this.field_70170_p, N().toString(), a());
    bf2.func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
    this.field_70170_p.func_72838_d((Entity)bf2);
    this.Y.add(bf2);
    return this.Y;
  }
  
  void t() {
    try {
      if (this.aC)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      this.field_70145_X = false;
      func_189654_d(false);
      if (!this.ai)
        try {
          if (!((Boolean)this.p.func_187225_a(aG)).booleanValue())
            try {
              if (!((String)this.p.func_187225_a(aQ)).equals(""))
                try {
                  if (o() == m.NULL)
                    this.field_70170_p.func_72900_e((Entity)this); 
                } catch (ConcurrentModificationException concurrentModificationException) {
                  throw a(null);
                }  
            } catch (ConcurrentModificationException concurrentModificationException) {
              throw a(null);
            }  
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        }  
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    this.aC = true;
  }
  
  void o() {
    try {
      if (this.aw == -1)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    this.aw++;
    if (this.aw == 15) {
      Vec3d vec3d1 = z();
      float f1 = s();
      float f2 = P();
      func_70634_a(vec3d1.field_72450_a, vec3d1.field_72448_b, vec3d1.field_72449_c);
      Vec3d vec3d2 = a(new Vec3d(0.0D, 0.0D, 1.5D), f1, f2);
      try {
        this.field_70159_w = vec3d2.field_72450_a;
        this.field_70181_x = vec3d2.field_72448_b;
        this.field_70179_y = vec3d2.field_72449_c;
        if (!this.field_70170_p.field_72995_K) {
          a(f2);
          this.field_70145_X = false;
          func_189654_d(false);
        } 
      } catch (ConcurrentModificationException concurrentModificationException) {
        throw a(null);
      } 
    } 
    try {
      if (this.aw == 39) {
        this.aw = -1;
        c(m.THROWN);
        e((UUID)null);
        d((UUID)null);
      } 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
  }
  
  Vec3d z() {
    UUID uUID = m();
    try {
      if (uUID == null)
        return func_174791_d(); 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(uUID);
    try {
      if (entityPlayer == null)
        return func_174791_d(); 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    return entityPlayer.func_174791_d().func_72441_c(0.0D, entityPlayer.func_70047_e(), 0.0D).func_178787_e(a(new Vec3d(0.4000000059604645D, 0.0D, 0.0D), s(), P()));
  }
  
  float P() {
    UUID uUID = m();
    try {
      if (uUID == null)
        return 0.0F; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(uUID);
    try {
      if (entityPlayer == null)
        return 0.0F; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    return entityPlayer.field_70759_as;
  }
  
  float s() {
    UUID uUID = m();
    try {
      if (uUID == null)
        return 0.0F; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(uUID);
    try {
      if (entityPlayer == null)
        return 0.0F; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    return entityPlayer.field_70125_A;
  }
  
  void E() {
    boolean bool;
    try {
      if (!this.field_70122_E)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (o() != m.RUN)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    EntityPlayer entityPlayer = this.field_70170_p.func_72890_a((Entity)this, 100.0D);
    try {
      if (entityPlayer == null)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    double d = 20.0D;
    do {
      if (d <= 0.0D)
        return; 
      Vec3d vec3d1 = func_174791_d().func_178788_d(entityPlayer.func_174791_d());
      Vec3d vec3d2 = new Vec3d(Math.abs(vec3d1.field_72450_a), Math.abs(vec3d1.field_72448_b), Math.abs(vec3d1.field_72449_c));
      double d1 = vec3d2.field_72450_a / (vec3d2.field_72450_a + vec3d2.field_72449_c);
      double d2 = vec3d2.field_72449_c / (vec3d2.field_72450_a + vec3d2.field_72449_c);
      try {
      
      } catch (ConcurrentModificationException concurrentModificationException) {
        throw a(null);
      } 
      Vec3d vec3d3 = func_174791_d().func_178787_e(new Vec3d(((vec3d1.field_72450_a > 0.0D) ? true : -1) * d1 * d, 0.0D, ((vec3d1.field_72449_c > 0.0D) ? true : -1) * d2 * d));
      PathNavigate pathNavigate = func_70661_as();
      pathNavigate.func_75499_g();
      bool = pathNavigate.func_75492_a(vec3d3.field_72450_a, vec3d3.field_72448_b, vec3d3.field_72449_c, 0.824999988079071D);
      d--;
    } while (!bool);
  }
  
  protected void func_70664_aZ() {
    try {
      if (o() == m.RUN)
        try {
          if (!d())
            return; 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        }  
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    super.func_70664_aZ();
  }
  
  boolean d() {
    PathNavigate pathNavigate = func_70661_as();
    Path path = pathNavigate.func_75505_d();
    try {
      if (path == null)
        return true; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    int i = path.func_75873_e();
    int j = path.func_75874_d();
    try {
      if (j != i)
        try {
          if (j - 1 != i) {
            PathPoint pathPoint1 = path.func_75877_a(i);
            PathPoint pathPoint2 = path.func_75877_a(i + 1);
            try {
            
            } catch (ConcurrentModificationException concurrentModificationException) {
              throw a(null);
            } 
            return (pathPoint2.field_75837_b - pathPoint1.field_75837_b == 1);
          } 
          return true;
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        }  
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    return true;
  }
  
  void b() {
    try {
      if (!this.ai)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (((Boolean)this.p.func_187225_a(aG)).booleanValue())
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (((Boolean)this.p.func_187225_a(N)).booleanValue())
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (o() != m.SIT)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (++this.au < 32000)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    EntityPlayer entityPlayer = this.field_70170_p.func_72890_a((Entity)this, 3000.0D);
    try {
      if (entityPlayer == null)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (!entityPlayer.field_70122_E)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (entityPlayer.field_70160_al)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    Integer integer = a(entityPlayer);
    try {
      if (integer == null)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    Vec3d vec3d1 = entityPlayer.func_174791_d();
    Vec3d vec3d2 = func_174791_d();
    Vec3d vec3d3 = vec3d1.func_178788_d(vec3d2);
    double d = Math.sqrt(vec3d3.field_72450_a * vec3d3.field_72450_a + vec3d3.field_72449_c * vec3d3.field_72449_c);
    try {
      if (d > 100.0D)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    ItemStack itemStack = entityPlayer.field_71071_by.func_70301_a(integer.intValue()).func_77946_l();
    bf bf1 = new bf(this.field_70170_p, N().toString(), a());
    Vec3d vec3d4 = a(new Vec3d(0.0D, 0.0D, -0.20000000298023224D), entityPlayer.field_70759_as);
    bf1.func_70107_b(entityPlayer.field_70165_t + vec3d4.field_72450_a, entityPlayer.field_70163_u, entityPlayer.field_70161_v + vec3d4.field_72449_c);
    bf1.c(m.RUN);
    this.field_70170_p.func_72838_d((Entity)bf1);
    bf1.p.func_187227_b(U, itemStack);
    entityPlayer.func_145747_a((ITextComponent)new TextComponentString(String.format("<%s> I got your %s hehe~", new Object[] { bf1.H(), itemStack.func_82833_r() })));
    entityPlayer.field_71071_by.func_70304_b(integer.intValue());
    this.au = 0;
  }
  
  int a() {
    return Integer.parseInt(a(this)[7]);
  }
  
  @Nullable
  Integer a(EntityPlayer paramEntityPlayer) {
    NonNullList nonNullList = paramEntityPlayer.field_71071_by.field_70462_a;
    ArrayList<Integer> arrayList = new ArrayList();
    for (byte b = 0; b < nonNullList.size(); b++) {
      ItemStack itemStack = (ItemStack)nonNullList.get(b);
      try {
        if (itemStack != ItemStack.field_190927_a)
          try {
            if (al.contains(itemStack.func_77973_b()))
              arrayList.add(Integer.valueOf(b)); 
          } catch (ConcurrentModificationException concurrentModificationException) {
            throw a(null);
          }  
      } catch (ConcurrentModificationException concurrentModificationException) {
        throw a(null);
      } 
    } 
    try {
      if (arrayList.isEmpty())
        return null; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    return arrayList.get(func_70681_au().nextInt(arrayList.size()));
  }
  
  void x() {
    try {
      if (!this.ai)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (n() != null)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    a(this.aF);
    a(this.S);
    a(true);
    func_189654_d(true);
    c(m.SIT);
  }
  
  public void func_70071_h_() {
    try {
      L();
      k();
      o();
      super.func_70071_h_();
      j();
      R();
      G();
      if (this.field_70170_p.field_72995_K)
        try {
          n();
          e();
          if (m() != null)
            this.field_70145_X = true; 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        }  
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
  }
  
  void k() {
    m m1 = o();
    try {
      if (this.aT != m.START_THROWING)
        try {
          if (m1 == m.START_THROWING)
            this.aw = 0; 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        }  
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    this.aT = m1;
  }
  
  public void func_70015_d(int paramInt) {
    try {
      if (m() == null)
        super.func_70015_d(paramInt); 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
  }
  
  void G() {
    try {
      if (o() != m.VANISH)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      this.T -= 0.05F;
      if (this.T > 0.0F)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    this.field_70170_p.func_72900_e((Entity)this);
  }
  
  void R() {
    try {
      if (((Boolean)this.p.func_187225_a(aG)).booleanValue())
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (o() != m.THROWN)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (!this.field_70122_E)
        try {
          if (!func_70090_H())
            return; 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        }  
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      this.T = (float)(this.T - 0.05D);
      if (this.T > 0.0F)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (this.field_70170_p.field_72995_K)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    c(m.NULL);
    e((UUID)null);
    d((UUID)null);
    this.field_70170_p.func_72900_e((Entity)this);
  }
  
  @SideOnly(Side.CLIENT)
  void n() {
    try {
      if (this.aS == -1)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (++this.aS != 15)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    this.aS = -1;
    c(m.PAIZURI_START);
    (Minecraft.func_71410_x()).field_71439_g.func_71053_j();
  }
  
  @SideOnly(Side.CLIENT)
  void e() {
    try {
      if (this.ax == -1)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (++this.ax != 15)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    this.ax = -1;
    c(m.NELSON_INTRO);
    Minecraft minecraft = Minecraft.func_71410_x();
    minecraft.field_71439_g.func_71053_j();
    minecraft.field_71474_y.field_74320_O = 2;
  }
  
  public void c(m paramm) {
    m m1 = o();
    try {
      if (m1 == m.PAIZURI_CUM)
        try {
          if (paramm != m.PAIZURI_SLOW) {
            try {
              if (paramm == m.PAIZURI_FAST)
                return; 
            } catch (ConcurrentModificationException concurrentModificationException) {
              throw a(null);
            } 
          } else {
            return;
          } 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        }  
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (m1 == m.NELSON_CUM)
        try {
          if (paramm != m.NELSON_SLOW) {
            try {
              if (paramm == m.NELSON_FAST)
                return; 
            } catch (ConcurrentModificationException concurrentModificationException) {
              throw a(null);
            } 
          } else {
            return;
          } 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        }  
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (m1 == m.BREEDING_CUM_0)
        try {
          if (paramm != m.BREEDING_SLOW_0) {
            try {
              if (paramm == m.BREEDING_FAST_0)
                return; 
            } catch (ConcurrentModificationException concurrentModificationException) {
              throw a(null);
            } 
          } else {
            return;
          } 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        }  
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (paramm == m.START_THROWING)
        try {
          if (!this.field_70170_p.field_72995_K) {
            e(m());
            w();
          } 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        }  
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (paramm == m.PAIZURI_START)
        try {
          if (!this.field_70170_p.field_72995_K)
            O(); 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        }  
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (paramm == m.NELSON_INTRO)
        try {
          if (!this.field_70170_p.field_72995_K)
            H(); 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        }  
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (o() == m.PAIZURI_CUM)
        try {
          if (paramm == m.NULL)
            try {
              if (!this.field_70170_p.field_72995_K)
                Q(); 
            } catch (ConcurrentModificationException concurrentModificationException) {
              throw a(null);
            }  
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        }  
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (paramm == m.BREEDING_CUM_0) {
        this.p.func_187227_b(N, Boolean.valueOf(true));
        this.ab = this.field_70170_p.func_82737_E();
        this.aR = this.field_70170_p.func_82737_E();
      } 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (paramm == m.BREEDING_CUM_0)
        this.aq = 0; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (paramm == m.NELSON_CUM)
        this.p.func_187227_b(N, Boolean.valueOf(true)); 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (m1 == m.NELSON_CUM)
        try {
          if (paramm != m.NELSON_CUM)
            this.p.func_187227_b(N, Boolean.valueOf(false)); 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        }  
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    super.c(paramm);
  }
  
  void Q() {
    EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(n());
    try {
      if (entityPlayer != null)
        I.a.a((EntityPlayerMP)entityPlayer); 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      e((UUID)null);
      a(false);
      this.field_70145_X = false;
      func_189654_d(false);
      this.p.func_187227_b(U, ItemStack.field_190927_a);
      if (!((Boolean)this.p.func_187225_a(aG)).booleanValue()) {
        func_70634_a(this.f.field_72450_a, this.f.field_72448_b, this.f.field_72449_c);
        this.field_70170_p.func_72900_e((Entity)this);
      } 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
  }
  
  void H() {
    EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(n());
    try {
      if (entityPlayer == null)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    d((UUID)null);
    a(entityPlayer.func_174791_d());
    a(entityPlayer.field_70177_z);
    a(true);
    this.field_70145_X = true;
    func_189654_d(true);
    entityPlayer.func_189654_d(true);
    entityPlayer.field_70145_X = true;
    e(entityPlayer.getPersistentID());
  }
  
  void O() {
    EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(n());
    try {
      if (entityPlayer == null)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    d((UUID)null);
    a(entityPlayer.func_174791_d());
    a(entityPlayer.field_70177_z + 180.0F);
    a(true);
    this.field_70145_X = true;
    func_189654_d(true);
    entityPlayer.func_189654_d(true);
    entityPlayer.field_70145_X = true;
    e(entityPlayer.getPersistentID());
    entityPlayer.func_70634_a(entityPlayer.field_70165_t, entityPlayer.field_70163_u - 0.5D, entityPlayer.field_70161_v);
    entityPlayer.field_70125_A = 70.0F;
    entityPlayer.field_70127_C = 70.0F;
  }
  
  void w() {
    ItemStack itemStack = (ItemStack)this.p.func_187225_a(U);
    try {
      if (itemStack == ItemStack.field_190927_a)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(n());
    try {
      if (entityPlayer == null)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    entityPlayer.field_71071_by.func_70441_a(itemStack.func_77946_l());
    this.p.func_187227_b(U, ItemStack.field_190927_a);
  }
  
  void l() {
    try {
      if (o() != m.PICK_UP)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    UUID uUID = m();
    try {
      if (uUID == null) {
        this.X = -1;
        c(m.NULL);
        d((UUID)null);
        return;
      } 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(uUID);
    try {
      if (entityPlayer == null) {
        this.X = -1;
        c(m.NULL);
        d((UUID)null);
        return;
      } 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      func_70107_b(entityPlayer.field_70165_t, entityPlayer.field_70163_u, entityPlayer.field_70161_v);
      if (func_174791_d().func_72438_d(entityPlayer.func_174791_d()) > 10.0D) {
        this.X = -1;
        c(m.NULL);
        d((UUID)null);
        return;
      } 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (this.X-- != 0)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    c(m.SHOULDER_IDLE);
    this.field_70145_X = true;
  }
  
  @SideOnly(Side.CLIENT)
  public boolean T() {
    try {
      if (o() != m.NULL)
        return false; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (m() != null)
        return false; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (!((Boolean)this.p.func_187225_a(aG)).booleanValue())
        try {
          if (!(Minecraft.func_71410_x()).field_71439_g.func_70685_l((Entity)this))
            return false; 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        }  
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
    
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    return (m() == null);
  }
  
  void j() {
    try {
      if (o() != m.SHOULDER_IDLE)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    UUID uUID = m();
    try {
      if (uUID == null)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(uUID);
    try {
      if (entityPlayer == null)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    func_70107_b(entityPlayer.field_70165_t, entityPlayer.field_70163_u, entityPlayer.field_70161_v);
    this.field_70145_X = true;
    func_189654_d(true);
  }
  
  protected m b(m paramm) {
    try {
      switch (b.a[paramm.ordinal()]) {
        case 1:
        case 2:
          return m.PAIZURI_FAST;
        case 3:
          return m.BREEDING_FAST_0;
        case 4:
          return m.BREEDING_FAST_2;
        case 5:
          return m.NELSON_FAST;
      } 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    return null;
  }
  
  protected m a(m paramm) {
    try {
      switch (b.a[paramm.ordinal()]) {
        case 2:
        case 6:
        case 7:
          return m.PAIZURI_CUM;
        case 8:
          return m.BREEDING_CUM_1;
        case 4:
        case 9:
          return m.BREEDING_CUM_2;
        case 5:
        case 10:
          return m.NELSON_CUM;
        case 3:
        case 11:
          for (bf bf1 : this.Y)
            bf1.a(paramm); 
          return m.BREEDING_CUM_0;
      } 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    return null;
  }
  
  public boolean y() {
    Block block = this.field_70170_p.func_180495_p(func_180425_c().func_177982_a(0, 1, 0)).func_177230_c();
    try {
    
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    return !block.func_176205_b((IBlockAccess)this.field_70170_p, func_180425_c().func_177982_a(0, 1, 0));
  }
  
  public void func_180430_e(float paramFloat1, float paramFloat2) {
    m m1 = o();
    try {
      if (m1 != m.THROWN)
        try {
          if (m1 != m.START_THROWING) {
            super.func_180430_e(paramFloat1, paramFloat2);
            return;
          } 
          return;
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        }  
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
  }
  
  protected <E extends software.bernie.geckolib3.core.IAnimatable> PlayState a(AnimationEvent<E> paramAnimationEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield field_70170_p : Lnet/minecraft/world/World;
    //   4: instanceof com/c
    //   7: ifeq -> 18
    //   10: getstatic software/bernie/geckolib3/core/PlayState.STOP : Lsoftware/bernie/geckolib3/core/PlayState;
    //   13: areturn
    //   14: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   17: athrow
    //   18: aload_0
    //   19: getfield k : Lsoftware/bernie/geckolib3/core/controller/AnimationController;
    //   22: ifnonnull -> 36
    //   25: aload_0
    //   26: invokevirtual S : ()V
    //   29: goto -> 36
    //   32: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   35: athrow
    //   36: aload_1
    //   37: invokevirtual getController : ()Lsoftware/bernie/geckolib3/core/controller/AnimationController;
    //   40: invokevirtual getName : ()Ljava/lang/String;
    //   43: astore_2
    //   44: iconst_m1
    //   45: istore_3
    //   46: aload_2
    //   47: invokevirtual hashCode : ()I
    //   50: lookupswitch default -> 130, -1422950858 -> 119, -103677777 -> 105, 3128418 -> 84
    //   84: aload_2
    //   85: ldc 'eyes'
    //   87: invokevirtual equals : (Ljava/lang/Object;)Z
    //   90: ifeq -> 130
    //   93: goto -> 100
    //   96: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   99: athrow
    //   100: iconst_0
    //   101: istore_3
    //   102: goto -> 130
    //   105: aload_2
    //   106: ldc 'movement'
    //   108: invokevirtual equals : (Ljava/lang/Object;)Z
    //   111: ifeq -> 130
    //   114: iconst_1
    //   115: istore_3
    //   116: goto -> 130
    //   119: aload_2
    //   120: ldc 'action'
    //   122: invokevirtual equals : (Ljava/lang/Object;)Z
    //   125: ifeq -> 130
    //   128: iconst_2
    //   129: istore_3
    //   130: iload_3
    //   131: tableswitch default -> 1263, 0 -> 156, 1 -> 199, 2 -> 402
    //   156: aload_0
    //   157: invokevirtual o : ()Lcom/schnurritv/sexmod/m;
    //   160: getstatic com/schnurritv/sexmod/m.NULL : Lcom/schnurritv/sexmod/m;
    //   163: if_acmpeq -> 188
    //   166: goto -> 173
    //   169: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   172: athrow
    //   173: aload_0
    //   174: ldc 'animation.goblin.null'
    //   176: iconst_1
    //   177: aload_1
    //   178: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   181: goto -> 1263
    //   184: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   187: athrow
    //   188: aload_0
    //   189: ldc 'animation.goblin.blink'
    //   191: iconst_1
    //   192: aload_1
    //   193: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   196: goto -> 1263
    //   199: aload_0
    //   200: invokevirtual o : ()Lcom/schnurritv/sexmod/m;
    //   203: getstatic com/schnurritv/sexmod/m.NULL : Lcom/schnurritv/sexmod/m;
    //   206: if_acmpeq -> 224
    //   209: aload_0
    //   210: ldc 'animation.goblin.null'
    //   212: iconst_1
    //   213: aload_1
    //   214: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   217: goto -> 1263
    //   220: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   223: athrow
    //   224: aload_0
    //   225: getfield field_70169_q : D
    //   228: aload_0
    //   229: getfield field_70165_t : D
    //   232: dsub
    //   233: invokestatic abs : (D)D
    //   236: aload_0
    //   237: getfield field_70166_s : D
    //   240: aload_0
    //   241: getfield field_70161_v : D
    //   244: dsub
    //   245: invokestatic abs : (D)D
    //   248: dadd
    //   249: dstore #4
    //   251: aload_0
    //   252: getfield p : Lnet/minecraft/network/datasync/EntityDataManager;
    //   255: getstatic com/schnurritv/sexmod/bf.z : Lnet/minecraft/network/datasync/DataParameter;
    //   258: invokevirtual func_187225_a : (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
    //   261: checkcast java/lang/Boolean
    //   264: invokevirtual booleanValue : ()Z
    //   267: ifne -> 391
    //   270: dload #4
    //   272: dconst_0
    //   273: dcmpl
    //   274: ifle -> 391
    //   277: goto -> 284
    //   280: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   283: athrow
    //   284: aload_0
    //   285: getfield field_70122_E : Z
    //   288: ifeq -> 380
    //   291: goto -> 298
    //   294: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   297: athrow
    //   298: aload_0
    //   299: getfield field_70167_r : D
    //   302: invokestatic abs : (D)D
    //   305: aload_0
    //   306: getfield field_70163_u : D
    //   309: invokestatic abs : (D)D
    //   312: dsub
    //   313: invokestatic abs : (D)D
    //   316: ldc2_w 0.10000000149011612
    //   319: dcmpg
    //   320: ifge -> 380
    //   323: goto -> 330
    //   326: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   329: athrow
    //   330: dload #4
    //   332: ldc2_w 0.20000000298023224
    //   335: dcmpl
    //   336: ifle -> 361
    //   339: goto -> 346
    //   342: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   345: athrow
    //   346: aload_0
    //   347: ldc 'animation.goblin.walk'
    //   349: iconst_1
    //   350: aload_1
    //   351: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   354: goto -> 369
    //   357: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   360: athrow
    //   361: aload_0
    //   362: ldc 'animation.goblin.walk'
    //   364: iconst_1
    //   365: aload_1
    //   366: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   369: aload_0
    //   370: aload_0
    //   371: getfield field_70759_as : F
    //   374: putfield field_70177_z : F
    //   377: goto -> 1263
    //   380: aload_0
    //   381: ldc 'animation.goblin.fly'
    //   383: iconst_1
    //   384: aload_1
    //   385: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   388: goto -> 1263
    //   391: aload_0
    //   392: ldc 'animation.goblin.idle'
    //   394: iconst_1
    //   395: aload_1
    //   396: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   399: goto -> 1263
    //   402: invokestatic func_71410_x : ()Lnet/minecraft/client/Minecraft;
    //   405: astore #6
    //   407: aload #6
    //   409: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   412: invokevirtual getPersistentID : ()Ljava/util/UUID;
    //   415: aload_0
    //   416: invokevirtual m : ()Ljava/util/UUID;
    //   419: invokevirtual equals : (Ljava/lang/Object;)Z
    //   422: ifeq -> 452
    //   425: aload #6
    //   427: getfield field_71474_y : Lnet/minecraft/client/settings/GameSettings;
    //   430: getfield field_74320_O : I
    //   433: ifne -> 452
    //   436: goto -> 443
    //   439: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   442: athrow
    //   443: ldc '1'
    //   445: goto -> 454
    //   448: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   451: athrow
    //   452: ldc '3'
    //   454: astore #7
    //   456: getstatic com/schnurritv/sexmod/bf$b.a : [I
    //   459: aload_0
    //   460: invokevirtual o : ()Lcom/schnurritv/sexmod/m;
    //   463: invokevirtual ordinal : ()I
    //   466: iaload
    //   467: tableswitch default -> 1263, 1 -> 888, 2 -> 835, 3 -> 976, 4 -> 1021, 5 -> 1165, 6 -> 866, 7 -> 877, 8 -> 1121, 9 -> 1077, 10 -> 1210, 11 -> 1032, 12 -> 628, 13 -> 643, 14 -> 654, 15 -> 677, 16 -> 688, 17 -> 721, 18 -> 744, 19 -> 767, 20 -> 790, 21 -> 813, 22 -> 824, 23 -> 899, 24 -> 910, 25 -> 921, 26 -> 932, 27 -> 943, 28 -> 954, 29 -> 965, 30 -> 1088, 31 -> 1099, 32 -> 1110, 33 -> 1132, 34 -> 1132, 35 -> 1143, 36 -> 1154, 37 -> 1255
    //   628: aload_0
    //   629: ldc 'animation.goblin.null'
    //   631: iconst_1
    //   632: aload_1
    //   633: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   636: goto -> 1263
    //   639: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   642: athrow
    //   643: aload_0
    //   644: ldc 'animation.goblin.shoulder_idle'
    //   646: iconst_1
    //   647: aload_1
    //   648: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   651: goto -> 1263
    //   654: aload_0
    //   655: ldc 'animation.goblin.pick_up_%sperson'
    //   657: iconst_1
    //   658: anewarray java/lang/Object
    //   661: dup
    //   662: iconst_0
    //   663: aload #7
    //   665: aastore
    //   666: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   669: iconst_1
    //   670: aload_1
    //   671: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   674: goto -> 1263
    //   677: aload_0
    //   678: ldc 'animation.goblin.sit'
    //   680: iconst_1
    //   681: aload_1
    //   682: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   685: goto -> 1263
    //   688: aload_0
    //   689: getfield field_70122_E : Z
    //   692: ifeq -> 710
    //   695: aload_0
    //   696: ldc 'animation.goblin.running'
    //   698: iconst_1
    //   699: aload_1
    //   700: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   703: goto -> 1263
    //   706: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   709: athrow
    //   710: aload_0
    //   711: ldc 'animation.goblin.fly'
    //   713: iconst_1
    //   714: aload_1
    //   715: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   718: goto -> 1263
    //   721: aload_0
    //   722: ldc 'animation.goblin.catch_%sperson'
    //   724: iconst_1
    //   725: anewarray java/lang/Object
    //   728: dup
    //   729: iconst_0
    //   730: aload #7
    //   732: aastore
    //   733: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   736: iconst_1
    //   737: aload_1
    //   738: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   741: goto -> 1263
    //   744: aload_0
    //   745: ldc 'animation.goblin.catch_%spersonBj'
    //   747: iconst_1
    //   748: anewarray java/lang/Object
    //   751: dup
    //   752: iconst_0
    //   753: aload #7
    //   755: aastore
    //   756: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   759: iconst_1
    //   760: aload_1
    //   761: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   764: goto -> 1263
    //   767: aload_0
    //   768: ldc 'animation.goblin.catch_%spersonBj_idle'
    //   770: iconst_1
    //   771: anewarray java/lang/Object
    //   774: dup
    //   775: iconst_0
    //   776: aload #7
    //   778: aastore
    //   779: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   782: iconst_1
    //   783: aload_1
    //   784: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   787: goto -> 1263
    //   790: aload_0
    //   791: ldc 'animation.goblin.throw_%sperson'
    //   793: iconst_1
    //   794: anewarray java/lang/Object
    //   797: dup
    //   798: iconst_0
    //   799: aload #7
    //   801: aastore
    //   802: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   805: iconst_1
    //   806: aload_1
    //   807: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   810: goto -> 1263
    //   813: aload_0
    //   814: ldc 'animation.goblin.thrown'
    //   816: iconst_1
    //   817: aload_1
    //   818: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   821: goto -> 1263
    //   824: aload_0
    //   825: ldc 'animation.goblin.paizuri_start'
    //   827: iconst_1
    //   828: aload_1
    //   829: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   832: goto -> 1263
    //   835: aload_0
    //   836: new java/lang/StringBuilder
    //   839: dup
    //   840: invokespecial <init> : ()V
    //   843: ldc 'animation.goblin.paizuri_slow'
    //   845: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   848: aload_0
    //   849: getfield aH : Ljava/lang/String;
    //   852: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   855: invokevirtual toString : ()Ljava/lang/String;
    //   858: iconst_1
    //   859: aload_1
    //   860: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   863: goto -> 1263
    //   866: aload_0
    //   867: ldc 'animation.goblin.paizuri_fast'
    //   869: iconst_1
    //   870: aload_1
    //   871: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   874: goto -> 1263
    //   877: aload_0
    //   878: ldc 'animation.goblin.paizuri_fast_countinues'
    //   880: iconst_1
    //   881: aload_1
    //   882: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   885: goto -> 1263
    //   888: aload_0
    //   889: ldc 'animation.goblin.paizuri_idle'
    //   891: iconst_1
    //   892: aload_1
    //   893: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   896: goto -> 1263
    //   899: aload_0
    //   900: ldc 'animation.goblin.paizuri_cum'
    //   902: iconst_1
    //   903: aload_1
    //   904: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   907: goto -> 1263
    //   910: aload_0
    //   911: ldc 'animation.goblin.jump_1'
    //   913: iconst_1
    //   914: aload_1
    //   915: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   918: goto -> 1263
    //   921: aload_0
    //   922: ldc 'animation.goblin.jump_2'
    //   924: iconst_1
    //   925: aload_1
    //   926: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   929: goto -> 1263
    //   932: aload_0
    //   933: ldc 'animation.goblin.jump_3'
    //   935: iconst_1
    //   936: aload_1
    //   937: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   940: goto -> 1263
    //   943: aload_0
    //   944: ldc 'animation.goblin.breeding_intro_1'
    //   946: iconst_1
    //   947: aload_1
    //   948: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   951: goto -> 1263
    //   954: aload_0
    //   955: ldc 'animation.goblin.breeding_intro_2'
    //   957: iconst_1
    //   958: aload_1
    //   959: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   962: goto -> 1263
    //   965: aload_0
    //   966: ldc 'animation.goblin.breeding_intro_3'
    //   968: iconst_1
    //   969: aload_1
    //   970: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   973: goto -> 1263
    //   976: aload_0
    //   977: new java/lang/StringBuilder
    //   980: dup
    //   981: invokespecial <init> : ()V
    //   984: ldc 'animation.goblin.breeding_slow_1'
    //   986: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   989: aload_0
    //   990: getfield ay : Z
    //   993: ifeq -> 1005
    //   996: ldc 'l'
    //   998: goto -> 1007
    //   1001: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1004: athrow
    //   1005: ldc 'r'
    //   1007: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1010: invokevirtual toString : ()Ljava/lang/String;
    //   1013: iconst_1
    //   1014: aload_1
    //   1015: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   1018: goto -> 1263
    //   1021: aload_0
    //   1022: ldc 'animation.goblin.breeding_slow_3'
    //   1024: iconst_1
    //   1025: aload_1
    //   1026: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   1029: goto -> 1263
    //   1032: aload_0
    //   1033: new java/lang/StringBuilder
    //   1036: dup
    //   1037: invokespecial <init> : ()V
    //   1040: ldc 'animation.goblin.breeding_fast_1'
    //   1042: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1045: aload_0
    //   1046: getfield ao : Z
    //   1049: ifeq -> 1061
    //   1052: ldc 'c'
    //   1054: goto -> 1063
    //   1057: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1060: athrow
    //   1061: ldc 's'
    //   1063: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1066: invokevirtual toString : ()Ljava/lang/String;
    //   1069: iconst_1
    //   1070: aload_1
    //   1071: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   1074: goto -> 1263
    //   1077: aload_0
    //   1078: ldc 'animation.goblin.breeding_fast_3'
    //   1080: iconst_1
    //   1081: aload_1
    //   1082: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   1085: goto -> 1263
    //   1088: aload_0
    //   1089: ldc 'animation.goblin.breeding_cum_1'
    //   1091: iconst_1
    //   1092: aload_1
    //   1093: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   1096: goto -> 1263
    //   1099: aload_0
    //   1100: ldc 'animation.goblin.breeding_cum_2'
    //   1102: iconst_1
    //   1103: aload_1
    //   1104: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   1107: goto -> 1263
    //   1110: aload_0
    //   1111: ldc 'animation.goblin.breeding_cum_3'
    //   1113: iconst_1
    //   1114: aload_1
    //   1115: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   1118: goto -> 1263
    //   1121: aload_0
    //   1122: ldc 'animation.goblin.breeding_2'
    //   1124: iconst_1
    //   1125: aload_1
    //   1126: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   1129: goto -> 1263
    //   1132: aload_0
    //   1133: ldc 'animation.goblin.await_pick_up'
    //   1135: iconst_1
    //   1136: aload_1
    //   1137: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   1140: goto -> 1263
    //   1143: aload_0
    //   1144: ldc 'animation.goblin.stand_up'
    //   1146: iconst_0
    //   1147: aload_1
    //   1148: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   1151: goto -> 1263
    //   1154: aload_0
    //   1155: ldc 'animation.goblin.nelson_intro'
    //   1157: iconst_1
    //   1158: aload_1
    //   1159: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   1162: goto -> 1263
    //   1165: aload_0
    //   1166: new java/lang/StringBuilder
    //   1169: dup
    //   1170: invokespecial <init> : ()V
    //   1173: ldc 'animation.goblin.nelson_slow'
    //   1175: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1178: aload_0
    //   1179: getfield M : Z
    //   1182: ifeq -> 1194
    //   1185: ldc ''
    //   1187: goto -> 1196
    //   1190: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1193: athrow
    //   1194: ldc '2'
    //   1196: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1199: invokevirtual toString : ()Ljava/lang/String;
    //   1202: iconst_1
    //   1203: aload_1
    //   1204: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   1207: goto -> 1263
    //   1210: aload_0
    //   1211: new java/lang/StringBuilder
    //   1214: dup
    //   1215: invokespecial <init> : ()V
    //   1218: ldc 'animation.goblin.nelson_fast'
    //   1220: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1223: aload_0
    //   1224: getfield aU : Z
    //   1227: ifeq -> 1239
    //   1230: ldc 'c'
    //   1232: goto -> 1241
    //   1235: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1238: athrow
    //   1239: ldc 's'
    //   1241: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1244: invokevirtual toString : ()Ljava/lang/String;
    //   1247: iconst_1
    //   1248: aload_1
    //   1249: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   1252: goto -> 1263
    //   1255: aload_0
    //   1256: ldc 'animation.goblin.nelson_cum'
    //   1258: iconst_1
    //   1259: aload_1
    //   1260: invokevirtual a : (Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   1263: getstatic software/bernie/geckolib3/core/PlayState.CONTINUE : Lsoftware/bernie/geckolib3/core/PlayState;
    //   1266: areturn
    // Exception table:
    //   from	to	target	type
    //   0	14	14	java/util/ConcurrentModificationException
    //   18	29	32	java/util/ConcurrentModificationException
    //   46	93	96	java/util/ConcurrentModificationException
    //   130	166	169	java/util/ConcurrentModificationException
    //   156	184	184	java/util/ConcurrentModificationException
    //   199	220	220	java/util/ConcurrentModificationException
    //   251	277	280	java/util/ConcurrentModificationException
    //   270	291	294	java/util/ConcurrentModificationException
    //   284	323	326	java/util/ConcurrentModificationException
    //   298	339	342	java/util/ConcurrentModificationException
    //   330	357	357	java/util/ConcurrentModificationException
    //   407	436	439	java/util/ConcurrentModificationException
    //   425	448	448	java/util/ConcurrentModificationException
    //   456	639	639	java/util/ConcurrentModificationException
    //   688	706	706	java/util/ConcurrentModificationException
    //   976	1001	1001	java/util/ConcurrentModificationException
    //   1032	1057	1057	java/util/ConcurrentModificationException
    //   1165	1190	1190	java/util/ConcurrentModificationException
    //   1210	1235	1235	java/util/ConcurrentModificationException
  }
  
  @SideOnly(Side.CLIENT)
  public void registerControllers(AnimationData paramAnimationData) {
    try {
      super.registerControllers(paramAnimationData);
      if (this.k == null)
        S(); 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    AnimationController.ISoundListener iSoundListener = paramSoundKeyframeEvent -> {
        String str = paramSoundKeyframeEvent.sound;
        byte b = -1;
        try {
          switch (str.hashCode()) {
            case 555758782:
              if (str.equals("catchEh"))
                b = 0; 
              break;
            case 1911168065:
              if (str.equals("catchAkward"))
                b = 1; 
              break;
            case 1508781609:
              if (str.equals("catchWell"))
                b = 2; 
              break;
            case -1906421909:
              if (str.equals("catchRather"))
                b = 3; 
              break;
            case 555759027:
              if (str.equals("catchMe"))
                b = 4; 
              break;
            case 1508225245:
              if (str.equals("catchDone"))
                b = 5; 
              break;
            case 1937367685:
              if (str.equals("catchBjDone"))
                b = 6; 
              break;
            case -257095285:
              if (str.equals("paizuriChoice"))
                b = 7; 
              break;
            case -85206549:
              if (str.equals("paizuriBoth"))
                b = 8; 
              break;
            case -1471320445:
              if (str.equals("paizruiUse"))
                b = 9; 
              break;
            case 214655774:
              if (str.equals("paizuriSwitch"))
                b = 10; 
              break;
            case 110550847:
              if (str.equals("touch"))
                b = 11; 
              break;
            case 106857100:
              if (str.equals("pound"))
                b = 12; 
              break;
            case -362733489:
              if (str.equals("paizuri_startDone"))
                b = 13; 
              break;
            case 1179204456:
              if (str.equals("paizuriFastDone"))
                b = 14; 
              break;
            case -2086748547:
              if (str.equals("paizuriFastReady"))
                b = 15; 
              break;
            case -773653315:
              if (str.equals("paizuriFastContinuesReady"))
                b = 16; 
              break;
            case 1216022981:
              if (str.equals("smallPound"))
                b = 17; 
              break;
            case -1471338293:
              if (str.equals("paizruiCam"))
                b = 18; 
              break;
            case 403702091:
              if (str.equals("blackScreen"))
                b = 19; 
              break;
            case 989222323:
              if (str.equals("paizuriCumDone"))
                b = 20; 
              break;
            case 403932052:
              if (str.equals("cumSound"))
                b = 21; 
              break;
            case -1255179071:
              if (str.equals("jumpCam"))
                b = 22; 
              break;
            case -1502522566:
              if (str.equals("breedingHmm"))
                b = 23; 
              break;
            case -816950732:
              if (str.equals("breedingFound"))
                b = 24; 
              break;
            case 414606590:
              if (str.equals("breedingEnough"))
                b = 25; 
              break;
            case 666280273:
              if (str.equals("breedingCam2"))
                b = 26; 
              break;
            case 642185664:
              if (str.equals("breedingIntroDone"))
                b = 27; 
              break;
            case -1257666335:
              if (str.equals("breeding_slow1Done"))
                b = 28; 
              break;
            case -2057479322:
              if (str.equals("breeding_fast1Done"))
                b = 29; 
              break;
            case 655269439:
              if (str.equals("breeding_fast1Ready"))
                b = 30; 
              break;
            case 98875:
              if (str.equals("cum"))
                b = 31; 
              break;
            case -1999384079:
              if (str.equals("breeding_intro_3Done"))
                b = 32; 
              break;
            case -1532770072:
              if (str.equals("breeding_3_wiggle"))
                b = 33; 
              break;
            case 1942611875:
              if (str.equals("breeding_fast_3Done"))
                b = 34; 
              break;
            case -2000307600:
              if (str.equals("breeding_intro_2Done"))
                b = 35; 
              break;
            case 1258509061:
              if (str.equals("breeding_cumCam"))
                b = 36; 
              break;
            case -1583482882:
              if (str.equals("neslon_introDone"))
                b = 37; 
              break;
            case 408494917:
              if (str.equals("nelson_slowDone"))
                b = 38; 
              break;
            case 45790400:
              if (str.equals("neslon_fastSwitch"))
                b = 39; 
              break;
            case -1402440057:
              if (str.equals("neslon_fastBackSwitch"))
                b = 40; 
              break;
            case 662391035:
              if (str.equals("nelsonFastDone"))
                b = 41; 
              break;
            case -1186189829:
              if (str.equals("nelson_cumDone"))
                b = 42; 
              break;
          } 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        } 
        try {
          EntityPlayerSP entityPlayerSP;
          switch (b) {
            case 0:
              b("ehh..");
              a(L.MISC_PLOB, new int[0]);
              break;
            case 1:
              b("awkward..");
              a(L.MISC_PLOB, new int[0]);
              break;
            case 2:
              b("well...");
              a(L.MISC_PLOB, new int[0]);
              break;
            case 3:
              b("would you rather have this stupid... thing?");
              a(L.MISC_PLOB, new int[0]);
              break;
            case 4:
              b("...or use me?~");
              a(L.MISC_PLOB, new int[0]);
              break;
            case 5:
              try {
                if ("bj".equals(this.p.func_187225_a(u)))
                  c(m.CATCH_BJ); 
              } catch (ConcurrentModificationException concurrentModificationException) {
                throw a(null);
              } 
              break;
            case 6:
              c(m.CATCH_BJ_IDLE);
              if (k()) {
                EntityPlayerSP entityPlayerSP1 = (Minecraft.func_71410_x()).field_71439_g;
                a((EntityPlayer)entityPlayerSP1, this, new String[] { "use her", "take ur stuff back" }, (ItemStack[])null, false);
              } 
              break;
            case 7:
              b("good choice!~");
              a(L.MISC_PLOB, new int[0]);
              break;
            case 8:
              b("...for both of us!");
              a(L.MISC_PLOB, new int[0]);
              break;
            case 9:
              b("now use me like a fuck toy!~");
              a(L.MISC_PLOB, new int[0]);
              break;
            case 10:
              try {
                if (func_70681_au().nextBoolean())
                  break; 
              } catch (ConcurrentModificationException concurrentModificationException) {
                throw a(null);
              } 
              try {
              
              } catch (ConcurrentModificationException concurrentModificationException) {
                throw a(null);
              } 
              this.aH = "".equals(this.aH) ? "2" : "";
              break;
            case 11:
              a(L.MISC_TOUCH, 3.0F);
              break;
            case 12:
              try {
                a(L.MISC_POUNDING, new int[0]);
                if (k())
                  cG.a(0.03999999910593033D); 
              } catch (ConcurrentModificationException concurrentModificationException) {
                throw a(null);
              } 
              break;
            case 13:
              try {
                c(m.PAIZURI_IDLE);
                if (k())
                  cG.d(); 
              } catch (ConcurrentModificationException concurrentModificationException) {
                throw a(null);
              } 
              break;
            case 14:
              c(m.PAIZURI_SLOW);
              break;
            case 15:
              try {
                if (!k())
                  break; 
              } catch (ConcurrentModificationException concurrentModificationException) {
                throw a(null);
              } 
              try {
                if (aK.b)
                  c(m.PAIZURI_FAST_CONTINUES); 
              } catch (ConcurrentModificationException concurrentModificationException) {
                throw a(null);
              } 
              break;
            case 16:
              try {
                if (k())
                  try {
                    if (aK.b)
                      p(); 
                  } catch (ConcurrentModificationException concurrentModificationException) {
                    throw a(null);
                  }  
              } catch (ConcurrentModificationException concurrentModificationException) {
                throw a(null);
              } 
              break;
            case 17:
              try {
                a(L.MISC_POUNDING, 0.25F);
                if (k())
                  cG.a(0.019999999552965164D); 
              } catch (ConcurrentModificationException concurrentModificationException) {
                throw a(null);
              } 
              break;
            case 18:
              try {
                if (!k())
                  break; 
              } catch (ConcurrentModificationException concurrentModificationException) {
                throw a(null);
              } 
              entityPlayerSP = (Minecraft.func_71410_x()).field_71439_g;
              ((EntityPlayer)entityPlayerSP).field_70125_A = 70.0F;
              ((EntityPlayer)entityPlayerSP).field_70127_C = 70.0F;
              break;
            case 19:
              try {
                if (k())
                  bd.b(); 
              } catch (ConcurrentModificationException concurrentModificationException) {
                throw a(null);
              } 
              break;
            case 20:
              c(m.NULL);
              break;
            case 21:
              a(L.MISC_SMALLINSERTS, 3.0F);
              break;
            case 22:
              if (k()) {
                Minecraft minecraft = Minecraft.func_71410_x();
                minecraft.field_71439_g.field_70177_z = s().floatValue() + 170.0F;
                minecraft.field_71439_g.field_70125_A = -20.0F;
                minecraft.field_71439_g.field_70759_as = minecraft.field_71439_g.field_70177_z;
                minecraft.field_71474_y.field_74320_O = 2;
              } 
              break;
            case 23:
              if (k()) {
                Minecraft minecraft = Minecraft.func_71410_x();
                minecraft.field_71439_g.field_70177_z = s().floatValue() + 180.0F;
                minecraft.field_71439_g.field_70125_A = -15.0F;
                minecraft.field_71439_g.field_70759_as = minecraft.field_71439_g.field_70177_z;
                minecraft.field_71474_y.field_74320_O = 0;
              } 
              b("hmm...");
              a(L.MISC_PLOB, new int[0]);
              break;
            case 24:
              b("guess we found a worthy breeding partner!");
              a(L.MISC_PLOB, new int[0]);
              break;
            case 25:
              b("Eh.. go pin him down, before he runs off!");
              a(L.MISC_PLOB, new int[0]);
              break;
            case 26:
              if (k()) {
                Minecraft minecraft = Minecraft.func_71410_x();
                minecraft.field_71474_y.field_74320_O = 2;
                minecraft.field_71439_g.field_70177_z = s().floatValue() - 120.0F;
                minecraft.field_71439_g.field_70125_A = -30.0F;
              } 
            case 27:
              try {
                c(m.BREEDING_SLOW_0);
                if (k())
                  cG.d(); 
              } catch (ConcurrentModificationException concurrentModificationException) {
                throw a(null);
              } 
              break;
            case 28:
              try {
                if (func_70681_au().nextBoolean()) {
                  try {
                  
                  } catch (ConcurrentModificationException concurrentModificationException) {
                    throw a(null);
                  } 
                  this.ay = !this.ay;
                } 
              } catch (ConcurrentModificationException concurrentModificationException) {
                throw a(null);
              } 
              try {
                if (k())
                  try {
                    if (aK.b) {
                      c(m.BREEDING_FAST_0);
                      this.ao = false;
                    } 
                  } catch (ConcurrentModificationException concurrentModificationException) {
                    throw a(null);
                  }  
              } catch (ConcurrentModificationException concurrentModificationException) {
                throw a(null);
              } 
              break;
            case 29:
              try {
                c(m.BREEDING_SLOW_0);
                if (!k())
                  break; 
              } catch (ConcurrentModificationException concurrentModificationException) {
                throw a(null);
              } 
              this.ao = false;
              break;
            case 30:
              try {
                if (!k())
                  break; 
              } catch (ConcurrentModificationException concurrentModificationException) {
                throw a(null);
              } 
              try {
                if (aK.b) {
                  this.ao = true;
                  p();
                  this.k.tickOffset = 0.0D;
                } 
              } catch (ConcurrentModificationException concurrentModificationException) {
                throw a(null);
              } 
              break;
            case 31:
              a(L.MISC_SMALLINSERTS, 2.0F);
              break;
            case 32:
              c(m.BREEDING_SLOW_2);
              break;
            case 33:
              try {
                if (func_70681_au().nextBoolean())
                  this.k.tickOffset = 0.0D; 
              } catch (ConcurrentModificationException concurrentModificationException) {
                throw a(null);
              } 
              break;
            case 34:
              try {
                if (!k())
                  break; 
              } catch (ConcurrentModificationException concurrentModificationException) {
                throw a(null);
              } 
              try {
                if (!aK.b)
                  c(m.BREEDING_SLOW_2); 
              } catch (ConcurrentModificationException concurrentModificationException) {
                throw a(null);
              } 
              break;
            case 35:
              c(m.BREEDING_1);
              break;
            case 36:
              if (k()) {
                Minecraft minecraft = Minecraft.func_71410_x();
                minecraft.field_71474_y.field_74320_O = 0;
                minecraft.field_71439_g.field_70177_z = s().floatValue() + 180.0F;
                minecraft.field_71439_g.field_70125_A = -15.0F;
                minecraft.field_71439_g.field_70759_as = minecraft.field_71439_g.field_70177_z;
                minecraft.field_71474_y.field_74320_O = 0;
              } 
              break;
            case 37:
              try {
                c(m.NELSON_SLOW);
                if (k())
                  cG.d(); 
              } catch (ConcurrentModificationException concurrentModificationException) {
                throw a(null);
              } 
              break;
            case 38:
              try {
                if (func_70681_au().nextBoolean()) {
                  try {
                  
                  } catch (ConcurrentModificationException concurrentModificationException) {
                    throw a(null);
                  } 
                  this.M = !this.M;
                } 
              } catch (ConcurrentModificationException concurrentModificationException) {
                throw a(null);
              } 
              break;
            case 39:
              try {
                if (!k()) {
                  this.aU = true;
                  return;
                } 
              } catch (ConcurrentModificationException concurrentModificationException) {
                throw a(null);
              } 
              try {
                if (aK.b)
                  this.aU = true; 
              } catch (ConcurrentModificationException concurrentModificationException) {
                throw a(null);
              } 
              break;
            case 40:
              try {
                if (!k()) {
                  this.k.tickOffset = 0.0D;
                  break;
                } 
              } catch (ConcurrentModificationException concurrentModificationException) {
                throw a(null);
              } 
              try {
                if (aK.b)
                  this.k.tickOffset = 0.0D; 
              } catch (ConcurrentModificationException concurrentModificationException) {
                throw a(null);
              } 
              break;
            case 41:
              try {
                this.aU = false;
                if (k())
                  c(m.NELSON_SLOW); 
              } catch (ConcurrentModificationException concurrentModificationException) {
                throw a(null);
              } 
              break;
            case 42:
              try {
                if (k()) {
                  i();
                  c(m.NULL);
                } 
              } catch (ConcurrentModificationException concurrentModificationException) {
                throw a(null);
              } 
              break;
          } 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        } 
      };
    this.k.registerSoundListener(iSoundListener);
    this.q.transitionLengthTicks = 10.0D;
    paramAnimationData.addAnimationController(this.k);
    paramAnimationData.addAnimationController(this.q);
    paramAnimationData.addAnimationController(this.o);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  public static class a {
    static Minecraft a = null;
    
    @SubscribeEvent
    public void a(LivingAttackEvent param1LivingAttackEvent) {
      try {
        if (param1LivingAttackEvent.getSource() == DamageSource.field_76380_i)
          return; 
      } catch (ConcurrentModificationException concurrentModificationException) {
        throw a(null);
      } 
      EntityLivingBase entityLivingBase = param1LivingAttackEvent.getEntityLiving();
      try {
        if (!(entityLivingBase instanceof bf))
          return; 
      } catch (ConcurrentModificationException concurrentModificationException) {
        throw a(null);
      } 
      bf bf = (bf)entityLivingBase;
      try {
        if (bf.m() != null)
          param1LivingAttackEvent.setCanceled(true); 
      } catch (ConcurrentModificationException concurrentModificationException) {
        throw a(null);
      } 
    }
    
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void a(InputEvent.KeyInputEvent param1KeyInputEvent) {
      try {
        if (a == null)
          a = Minecraft.func_71410_x(); 
      } catch (ConcurrentModificationException concurrentModificationException) {
        throw a(null);
      } 
      try {
        if (a.field_71462_r instanceof ay)
          return; 
      } catch (ConcurrentModificationException concurrentModificationException) {
        throw a(null);
      } 
      try {
        if (!ClientProxy.keyBindings[0].func_151468_f())
          return; 
      } catch (ConcurrentModificationException concurrentModificationException) {
        throw a(null);
      } 
      bf bf = null;
      UUID uUID = (Minecraft.func_71410_x()).field_71439_g.getPersistentID();
      try {
        for (bS bS : bS.l()) {
          if (bS.field_70170_p.field_72995_K) {
            try {
              if (!(bS instanceof bf))
                continue; 
            } catch (ConcurrentModificationException concurrentModificationException) {
              throw a(null);
            } 
            bf bf1 = (bf)bS;
            if (uUID.equals(bf1.m())) {
              bf = bf1;
              break;
            } 
          } 
        } 
      } catch (ConcurrentModificationException concurrentModificationException) {}
      try {
        if (bf == null)
          return; 
      } catch (ConcurrentModificationException concurrentModificationException) {
        throw a(null);
      } 
      try {
        if (bf.o() != m.SHOULDER_IDLE)
          return; 
      } catch (ConcurrentModificationException concurrentModificationException) {
        throw a(null);
      } 
      Minecraft.func_71410_x().func_147108_a(new ay(bf));
    }
    
    private static ConcurrentModificationException a(ConcurrentModificationException param1ConcurrentModificationException) {
      return param1ConcurrentModificationException;
    }
  }
  
  class c extends ArrayList<Integer> {
    c() {
      add(Integer.valueOf(4));
      add(Integer.valueOf(3));
      add(Integer.valueOf(3));
      add(Integer.valueOf(16));
      add(Integer.valueOf(16));
      add(Integer.valueOf(6));
      add(Integer.valueOf((F.values()).length));
      add(Integer.valueOf((G.values()).length));
      add(Integer.valueOf((aD.values()).length));
    }
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\bf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */