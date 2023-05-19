package com.schnurritv.sexmod;

import com.google.common.base.Optional;
import com.google.common.collect.UnmodifiableIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import javax.vecmath.Vector4d;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.item.EntityFallingBlock;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.SoundKeyframeEvent;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.resource.GeckoLibCache;

public class b3 extends br implements a, IInventory, aI {
  public static final EyeAndKoboldColor aP = EyeAndKoboldColor.PURPLE;
  
  public static final float aZ = 0.25F;
  
  static final int ae = 20;
  
  static final int Z = 2;
  
  static final int a0 = 30;
  
  static final int ay = 84;
  
  static final int aA = 32;
  
  static final int aD = 5;
  
  static final float ao = 1.5F;
  
  static final float aU = 20.0F;
  
  static final double ad = 10.0D;
  
  static final double aM = 2.0D;
  
  static final double T = 3.0D;
  
  static final int am = 300;
  
  static final int aO = 5;
  
  static final int aW = 100;
  
  static final int ar = 100;
  
  static final int au = 2;
  
  static final float aq = 2.0F;
  
  static final int al = 300;
  
  static final float aB = 0.2F;
  
  static final int ak = 5;
  
  static final double av = 0.7D;
  
  static final int aw = 142;
  
  public static final DataParameter<Float> aG = EntityDataManager.func_187226_a(b3.class, DataSerializers.field_187193_c).func_187156_b().func_187161_a(122);
  
  public static final DataParameter<String> S = EntityDataManager.func_187226_a(b3.class, DataSerializers.field_187194_d).func_187156_b().func_187161_a(123);
  
  public static final DataParameter<Boolean> ap = EntityDataManager.func_187226_a(b3.class, DataSerializers.field_187198_h).func_187156_b().func_187161_a(124);
  
  public static final DataParameter<Boolean> aN = EntityDataManager.func_187226_a(b3.class, DataSerializers.field_187198_h).func_187156_b().func_187161_a(125);
  
  public static final DataParameter<String> ai = EntityDataManager.func_187226_a(b3.class, DataSerializers.field_187194_d).func_187156_b().func_187161_a(126);
  
  public static final DataParameter<Boolean> aY = EntityDataManager.func_187226_a(b3.class, DataSerializers.field_187198_h).func_187156_b().func_187161_a(127);
  
  public static final DataParameter<Boolean> at = EntityDataManager.func_187226_a(b3.class, DataSerializers.field_187198_h).func_187156_b().func_187161_a(128);
  
  public static final DataParameter<Optional<UUID>> aC = EntityDataManager.func_187226_a(b3.class, DataSerializers.field_187203_m).func_187156_b().func_187161_a(129);
  
  public static double af = 69.0D;
  
  public static List<Vector4d> az = new ArrayList<>();
  
  ItemStackHandler aF = new ItemStackHandler(27);
  
  public String Y = null;
  
  boolean an = false;
  
  int W = 0;
  
  int aV = 0;
  
  boolean as = false;
  
  int aH = 0;
  
  int aI = 0;
  
  float a1 = Float.MAX_VALUE;
  
  static long R = Long.MIN_VALUE;
  
  String[] aT = new String[] { 
      "What the fuck did you just fucking say about me, you little bitch? I'll have you know I graduated top of my class in the Navy Seals, and I've been involved in numerous secret raids on Al-Quaeda, and I have over 300 confirmed kills. I am trained in gorilla warfare and I'm the top sniper in the entire US armed forces. You are nothing to me but just another target. I will wipe you the fuck out with precision the likes of which has never been seen before on this Earth, mark my fucking words. You think you can get away with saying that shit to me over the Internet? Think again, fucker. As we speak I am contacting my secret network of spies across the USA and your IP is being traced right now so you better prepare for the storm, maggot. The storm that wipes out the pathetic little thing you call your life. You're fucking dead, kid. I can be anywhere, anytime, and I can kill you in over seven hundred ways, and that's just with my bare hands. Not only am I extensively trained in unarmed combat, but I have access to the entire arsenal of the United States Marine Corps and I will use it to its full extent to wipe your miserable ass off the face of the continent, you little shit. If only you could have known what unholy retribution your little \"clever\" comment was about to bring down upon you, maybe you would have held your fucking tongue. But you couldn't, you didn't, and now you're paying the price, you goddamn idiot. I will shit fury all over you and you will drown in it. You're fucking dead, kiddo.", "suck my iron cock you worthless piece of shit!", "you'll die a fucking virgin!", "not even Johnny sins would wanna stick his cock up ur ass", "fuck you with ur borderline illegal fetishes!", "ur cum tastes terrible!", "I've always faked my orgasms when having sex with you!", "Not even Jenny would fuck you for 6 diamonds!", "U look like u'd use a shovel to mine diamonds, fucking idiot!", "Why tf does ur cock smell like my asshole???", 
      "do all of us a favor and hit [ALT]+[F4]!", "I'm about to say the N word!", "you are under attack retard", "Eat my ass!", "my tongue is longer than ur fucking dick bitch!", "Ligma titties!", "touch some grass bitch!" };
  
  IBlockState M = null;
  
  IBlockState aJ = null;
  
  BlockPos ax = null;
  
  boolean N = true;
  
  Vec3d U = Vec3d.field_186680_a;
  
  BlockPos V = null;
  
  BlockPos aS = null;
  
  int aa = 0;
  
  int aL = 0;
  
  int ac = 0;
  
  int Q = 0;
  
  boolean aj = false;
  
  BlockPos ag = null;
  
  int X = 0;
  
  int aE = 24;
  
  int O = 0;
  
  ItemStack ah = null;
  
  public boolean ab = false;
  
  int aX = -1;
  
  boolean aR = true;
  
  boolean aQ = false;
  
  public boolean P = false;
  
  int aK = 0;
  
  public b3(World paramWorld) {
    super(paramWorld);
    func_70105_a(0.5F, 0.99F);
  }
  
  b3(World paramWorld, UUID paramUUID, float paramFloat) {
    this(paramWorld);
    this.p.func_187227_b(aC, Optional.of(paramUUID));
    this.p.func_187227_b(aG, Float.valueOf(paramFloat));
  }
  
  public static b3 a(World paramWorld, UUID paramUUID) {
    float f = p();
    return a(paramWorld, paramUUID, f);
  }
  
  public static b3 a(World paramWorld, UUID paramUUID, float paramFloat) {
    af = 10.0D - paramFloat * 25.0D;
    return new b3(paramWorld, paramUUID, paramFloat);
  }
  
  protected String a(StringBuilder paramStringBuilder) {
    b(paramStringBuilder, 8);
    b(paramStringBuilder, 3);
    b(paramStringBuilder);
    b(paramStringBuilder);
    a(paramStringBuilder, 2);
    a(paramStringBuilder, 2);
    a(paramStringBuilder, 1);
    a(paramStringBuilder, 1);
    return paramStringBuilder.toString();
  }
  
  public ArrayList<Integer> J() {
    return new b();
  }
  
  public ArrayList<Integer> j() {
    ArrayList<Integer> arrayList = new ArrayList();
    arrayList.add(Integer.valueOf(Math.round(((Float)this.p.func_187225_a(aG)).floatValue() * 100.0F / 0.25F)));
    arrayList.add(Integer.valueOf(EyeAndKoboldColor.indexOf(EyeAndKoboldColor.safeValueOf((String)this.p.func_187225_a(G)))));
    arrayList.add(Integer.valueOf(EyeAndKoboldColor.indexOf(EyeAndKoboldColor.safeValueOf((Vec3i)this.p.func_187225_a(L)))));
    return arrayList;
  }
  
  public void a(List<Integer> paramList) {
    StringBuilder stringBuilder = new StringBuilder();
    for (byte b = 0; b < paramList.size(); b++) {
      int i = ((Integer)paramList.get(b)).intValue();
      try {
        String str1;
        String str2;
        switch (b) {
          case 0:
            this.p.func_187227_b(aG, Float.valueOf(i / 100.0F * 0.25F));
            break;
          case 1:
            str1 = (String)this.p.func_187225_a(G);
            str2 = EyeAndKoboldColor.values()[i].toString();
            try {
              if (!str2.equals(str1))
                this.ab = true; 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            this.p.func_187227_b(G, str2);
            break;
          case 2:
            this.p.func_187227_b(L, new BlockPos(EyeAndKoboldColor.values()[i].getMainColor()));
            break;
          default:
            c(stringBuilder, i);
            break;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    this.p.func_187227_b(H, stringBuilder.toString());
    bJ.c();
  }
  
  void m() {
    try {
      if (this.n == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    StringBuilder stringBuilder = new StringBuilder();
    for (byte b = 0; b < this.n.size(); b++) {
      Map.Entry entry = this.n.get(b);
      int i = ((Integer)((Map.Entry)entry.getValue()).getValue()).intValue();
      try {
        switch (b) {
          case 0:
            this.p.func_187227_b(aG, Float.valueOf(i / 100.0F * 0.25F));
            break;
          case 1:
            this.p.func_187227_b(G, EyeAndKoboldColor.values()[i].toString());
            break;
          case 2:
            this.p.func_187227_b(L, new BlockPos(EyeAndKoboldColor.values()[i].getMainColor()));
            break;
          default:
            c(stringBuilder, i);
            break;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    this.p.func_187227_b(H, stringBuilder.toString());
    bJ.c();
  }
  
  public cb e(int paramInt) {
    try {
      switch (paramInt) {
        case 0:
          return new cb(160, 0);
        case 1:
          return new cb(180, 0);
        case 2:
          return new cb(200, 0);
        case 3:
          return new cb(220, 0);
        case 4:
          return new cb(227, 20);
        case 5:
          return new cb(140, 40);
        case 6:
          return new cb(160, 40);
        case 7:
          return new cb(180, 40);
        case 8:
          return new cb(227, 40);
        case 9:
          return new cb(0, 130);
        case 10:
          return new cb(20, 130);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return cb.a;
  }
  
  public String H() {
    return (String)this.p.func_187225_a(S);
  }
  
  public float e() {
    return 0.2F - 0.25F - ((Float)this.p.func_187225_a(aG)).floatValue();
  }
  
  public float func_70047_e() {
    return 0.94F;
  }
  
  public static float p() {
    return (float)(Math.random() * 0.25D);
  }
  
  protected void func_70088_a() {
    super.func_70088_a();
    EyeAndKoboldColor eyeAndKoboldColor = EyeAndKoboldColor.values()[func_70681_au().nextInt((EyeAndKoboldColor.values()).length)];
    this.p.func_187214_a(L, new BlockPos(eyeAndKoboldColor.getMainColor()));
    this.p.func_187214_a(G, aP.name());
    this.p.func_187214_a(aC, Optional.absent());
    this.p.func_187214_a(aG, Float.valueOf(0.0F));
    this.p.func_187214_a(S, aC.values()[func_70681_au().nextInt((aC.values()).length)].toString());
    this.p.func_187214_a(ap, Boolean.valueOf(false));
    this.p.func_187214_a(aN, Boolean.valueOf(false));
    this.p.func_187214_a(ai, "null");
    this.p.func_187214_a(aY, Boolean.valueOf(false));
    this.p.func_187214_a(at, Boolean.valueOf(false));
  }
  
  protected void func_184651_r() {
    this.t = new q((EntityLiving)this, (Class)EntityPlayer.class, 3.0F, 1.0F);
    this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAITempt(this, 0.4D, false, new HashSet<>(i)));
    this.field_70714_bg.func_75776_a(3, new ao((EntityLiving)this));
    this.field_70714_bg.func_75776_a(5, (EntityAIBase)this.t);
  }
  
  protected float func_175134_bD() {
    return 0.45F;
  }
  
  protected void func_110147_ax() {
    super.func_110147_ax();
    func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(af);
    func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.5D);
    func_110148_a(SharedMonsterAttributes.field_111265_b).func_111128_a(30.0D);
  }
  
  public boolean func_70104_M() {
    return true;
  }
  
  protected boolean func_184645_a(EntityPlayer paramEntityPlayer, EnumHand paramEnumHand) {
    try {
      if (n() != null)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    ItemStack itemStack1 = paramEntityPlayer.func_184586_b(EnumHand.MAIN_HAND);
    if (!itemStack1.func_77973_b().equals(Items.field_151057_cb))
      itemStack1 = paramEntityPlayer.func_184586_b(EnumHand.OFF_HAND); 
    try {
      if (itemStack1.func_77973_b().equals(Items.field_151057_cb))
        try {
          if (paramEntityPlayer.getPersistentID().toString().equals(this.p.func_187225_a(b))) {
            this.p.func_187227_b(S, itemStack1.func_82833_r());
            itemStack1.func_190918_g(1);
            return true;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (((Boolean)this.p.func_187225_a(ap)).booleanValue())
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (o() == m.SLEEP)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    ItemStack itemStack2 = paramEntityPlayer.func_184586_b(EnumHand.MAIN_HAND);
    if (itemStack2.func_77973_b() != aF.b)
      itemStack2 = paramEntityPlayer.func_184586_b(EnumHand.OFF_HAND); 
    try {
      if (!O())
        try {
          if (itemStack2.func_77973_b() == aF.b) {
            try {
              if (!this.field_70170_p.field_72995_K)
                return true; 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            Optional optional = (Optional)this.p.func_187225_a(aC);
            try {
              if (!optional.isPresent())
                return true; 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            try {
              if (!az.isEmpty())
                return true; 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            m((UUID)optional.get());
            return true;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (O())
        try {
          if (itemStack2.func_77973_b() == aF.b)
            try {
              if (((String)this.p.func_187225_a(b)).equals(paramEntityPlayer.getPersistentID().toString())) {
                paramEntityPlayer.openGui(Main.instance, 1, this.field_70170_p, func_180425_c().func_177958_n(), func_180425_c().func_177956_o(), func_180425_c().func_177952_p());
                return true;
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
      if (this.field_70170_p.field_72995_K) {
        try {
          if (O())
            try {
              if (((String)this.p.func_187225_a(b)).equals(paramEntityPlayer.getPersistentID().toString()))
                a(L.GIRLS_KOBOLD_MASTER); 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        a(paramEntityPlayer);
      } else {
        e(paramEntityPlayer.getPersistentID());
        func_70661_as().func_75499_g();
        a((float)(Math.atan2(this.field_70161_v - paramEntityPlayer.field_70161_v, this.field_70165_t - paramEntityPlayer.field_70165_t) * 57.29577951308232D + 90.0D));
        a(new Vec3d(this.field_70165_t, Math.floor(this.field_70163_u), this.field_70161_v));
        this.p.func_187227_b(z, Boolean.valueOf(true));
        c(m.NULL);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return true;
  }
  
  @SideOnly(Side.CLIENT)
  void m(UUID paramUUID) {
    Minecraft.func_71410_x().func_147108_a(new aX(paramUUID));
  }
  
  @SideOnly(Side.CLIENT)
  public boolean a(EntityPlayer paramEntityPlayer) {
    try {
      if (O())
        try {
          if (paramEntityPlayer.getPersistentID().toString().equals(this.p.func_187225_a(b))) {
            Minecraft.func_71410_x().func_147108_a(new X(this, paramEntityPlayer, new String[] { "anal", "oral", "mating" }, null, false));
            return true;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (func_70660_b(ba.b) != null) {
        Minecraft.func_71410_x().func_147108_a(new X(this, paramEntityPlayer, new String[] { "anal", "oral" }, null, false));
        return true;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Minecraft.func_71410_x().func_147108_a(new X(this, paramEntityPlayer, new String[] { "anal", "oral" }, new ItemStack[] { new ItemStack(Items.field_151043_k, 3), new ItemStack(Items.field_151035_b) }false));
    return true;
  }
  
  @SideOnly(Side.CLIENT)
  public void F() {
    try {
      if (this.an) {
        this.an = false;
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    e((UUID)null);
    a("shouldbeattargetpos", "false");
  }
  
  public void i() {
    this.P = false;
    super.i();
  }
  
  protected void a(boolean paramBoolean, UUID paramUUID) {
    a(paramBoolean, true, paramUUID);
    aK.a(false);
  }
  
  public void a(String paramString, UUID paramUUID) {
    try {
      this.an = true;
      if ("oral".equals(paramString)) {
        a("animationFollowUp", m.STARTBLOWJOB.toString());
        a(true, paramUUID);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if ("anal".equals(paramString)) {
        a("animationFollowUp", m.KOBOLD_ANAL_START.toString());
        a(true, paramUUID);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if ("mating".equals(paramString)) {
        a("animationFollowUp", m.MATING_PRESS_START.toString());
        a(true, paramUUID);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void b() {
    this.as = true;
    this.p.func_187227_b(z, Boolean.valueOf(false));
  }
  
  protected void a() {
    bJ.c();
  }
  
  boolean f() {
    try {
      if (!this.as)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.aH++;
    this.field_70145_X = false;
    func_189654_d(false);
    if (this.aH > 40) {
      this.as = false;
      this.aH = 0;
      EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(n());
      a(entityPlayer.field_70177_z + 180.0F);
      this.p.func_187227_b(z, Boolean.valueOf(true));
      entityPlayer.field_70145_X = true;
      entityPlayer.func_189654_d(true);
      this.field_70145_X = true;
      func_189654_d(true);
      func_70661_as().func_75499_g();
      q();
      return true;
    } 
    this.field_70177_z = s().floatValue();
    func_189654_d(false);
    Vec3d vec3d = aH.a(func_174791_d(), I(), 40 - this.aH);
    func_70107_b(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c);
    c(m.NULL);
    Optional optional = (Optional)this.p.func_187225_a(aC);
    try {
      if (!optional.isPresent())
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Collection<g> collection = s.j((UUID)optional.get());
    try {
      if (collection == null)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    for (g g : collection)
      g.b(this); 
    return true;
  }
  
  void f(UUID paramUUID) {
    try {
      if (this.aX == -1)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (++this.aX < 132)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      this.aX = -1;
      if (o() != m.MATING_PRESS_CUM)
        return; 
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
    EyeAndKoboldColor eyeAndKoboldColor = s.p(paramUUID);
    ItemStack itemStack = new ItemStack(bP.a, 1, eyeAndKoboldColor.getWoolMeta());
    NBTTagCompound nBTTagCompound = itemStack.func_77978_p();
    if (nBTTagCompound == null)
      nBTTagCompound = new NBTTagCompound(); 
    nBTTagCompound.func_74778_a("tribeID", paramUUID.toString());
    nBTTagCompound.func_74778_a("tribeColor", eyeAndKoboldColor.toString());
    itemStack.func_77982_d(nBTTagCompound);
    entityPlayer.field_71071_by.func_70441_a(itemStack);
  }
  
  public void func_70619_bc() {
    super.func_70619_bc();
    this.aj = false;
    Optional optional = (Optional)this.p.func_187225_a(aC);
    if (optional.isPresent()) {
      f((UUID)optional.get());
      s.e((UUID)optional.get());
      EntityPlayer entityPlayer = l();
      try {
        if (entityPlayer != null)
          s.a((UUID)optional.get(), entityPlayer.getPersistentID()); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    try {
      if (f())
        return; 
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
      if (!((Boolean)this.p.func_187225_a(ap)).booleanValue()) {
        try {
          if (func_110143_aJ() != func_110138_aP())
            try {
              if (++this.aI >= 100) {
                func_70606_j(func_110143_aJ() + 2.0F);
                this.aI = 0;
                aV.a.sendToAllTracking(new d(N(), EnumParticleTypes.HEART.func_179346_b()), (Entity)this);
              } 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } else {
        this.aI = 0;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!((Boolean)this.p.func_187225_a(z)).booleanValue())
        func_189654_d(false); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!optional.isPresent())
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      this.W--;
      if (o() == m.ATTACK) {
        try {
          func_70661_as().func_75499_g();
          this.field_70177_z = s().floatValue();
          this.field_70759_as = s().floatValue();
          this.aV++;
          if (22 == this.aV)
            j(); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        if (32 == this.aV) {
          HashSet<EntityLivingBase> hashSet1 = s.b((UUID)optional.get());
          HashSet<EntityLivingBase> hashSet2 = new HashSet();
          for (EntityLivingBase entityLivingBase : hashSet1) {
            try {
              if (entityLivingBase.func_70032_d((Entity)this) > 2.0F)
                continue; 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            try {
              entityLivingBase.func_70097_a(DamageSource.func_76358_a((EntityLivingBase)this), 5.0F);
              if (entityLivingBase.field_70128_L)
                hashSet2.add(entityLivingBase); 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
          } 
          for (EntityLivingBase entityLivingBase : hashSet2)
            s.a((UUID)optional.get(), entityLivingBase); 
        } 
        try {
          if (84 <= this.aV) {
            c(m.NULL);
            this.p.func_187227_b(z, Boolean.valueOf(false));
            this.aV = 0;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.p.func_187227_b(ap, Boolean.valueOf(a((UUID)optional.get(), false)));
    this.p.func_187227_b(aN, Boolean.valueOf(s.e((UUID)optional.get(), this)));
    this.p.func_187227_b(aY, Boolean.valueOf(s.h((UUID)optional.get())));
    t();
    k();
    this.t.a = g();
  }
  
  public void func_70071_h_() {
    super.func_70071_h_();
    u();
    e();
    o();
    d();
    m();
  }
  
  void d() {
    try {
      if (!this.field_70170_p.field_72995_K)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.field_70170_p.func_82737_E() - 300L < R)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!O())
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (o() != m.NULL)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!"".equals(this.p.func_187225_a(u)))
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (((Boolean)this.p.func_187225_a(aY)).booleanValue())
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    String str = (String)this.p.func_187225_a(b);
    EntityPlayer entityPlayer = this.field_70170_p.func_72890_a((Entity)this, 10.0D);
    try {
      if (entityPlayer == null) {
        this.a1 = Float.MAX_VALUE;
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!entityPlayer.getPersistentID().toString().equals(str))
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    float f = func_70032_d((Entity)entityPlayer);
    try {
      if (f < 2.0F)
        try {
          if (this.a1 > 2.0F) {
            b(L.a(L.GIRLS_KOBOLD_HEYMASTER));
            b("Hey master!");
            R = this.field_70170_p.func_82737_E();
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.a1 = f;
  }
  
  void o() {
    try {
      if (!this.field_70170_p.field_72995_K)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (o() == m.SLEEP)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!((Boolean)this.p.func_187225_a(aY)).booleanValue())
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!O())
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(UUID.fromString((String)this.p.func_187225_a(b)));
    try {
      if (entityPlayer == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    a(entityPlayer);
  }
  
  void u() {
    try {
      if (((Boolean)this.p.func_187225_a(ap)).booleanValue())
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (O())
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Optional optional = (Optional)this.p.func_187225_a(aC);
    try {
      if (!optional.isPresent())
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    for (EntityPlayer entityPlayer : this.field_70170_p.field_73010_i) {
      double d1 = entityPlayer.func_174791_d().func_72438_d(func_174791_d());
      double d2 = d1;
      if (!this.field_70170_p.field_72995_K)
        for (b3 b31 : s.m((UUID)optional.get())) {
          double d = entityPlayer.func_174791_d().func_72438_d(b31.func_174791_d());
          if (d < d2)
            d2 = d; 
        }  
      try {
        if (d2 > 10.0D)
          continue; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (entityPlayer.func_184586_b(EnumHand.MAIN_HAND).func_77973_b() != aF.b)
          try {
            if (entityPlayer.func_184586_b(EnumHand.OFF_HAND).func_77973_b() != aF.b)
              return; 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      PathNavigate pathNavigate = func_70661_as();
      try {
        pathNavigate.func_75499_g();
        if (this.field_70170_p.field_72995_K) {
          a(entityPlayer);
        } else if (d1 > 2.0D) {
          BlockPos blockPos = c(entityPlayer.func_180425_c());
          pathNavigate.func_75492_a(blockPos.func_177958_n(), blockPos.func_177956_o(), blockPos.func_177952_p(), 0.3499999940395355D);
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      return;
    } 
  }
  
  protected void q() {
    // Byte code:
    //   0: aload_0
    //   1: getfield p : Lnet/minecraft/network/datasync/EntityDataManager;
    //   4: getstatic com/schnurritv/sexmod/bS.u : Lnet/minecraft/network/datasync/DataParameter;
    //   7: invokevirtual func_187225_a : (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
    //   10: checkcast java/lang/String
    //   13: astore_1
    //   14: aload_0
    //   15: getstatic com/schnurritv/sexmod/ba.b : Lnet/minecraft/potion/Potion;
    //   18: invokevirtual func_70660_b : (Lnet/minecraft/potion/Potion;)Lnet/minecraft/potion/PotionEffect;
    //   21: ifnull -> 32
    //   24: iconst_1
    //   25: goto -> 33
    //   28: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   31: athrow
    //   32: iconst_0
    //   33: istore_2
    //   34: iconst_0
    //   35: istore_3
    //   36: aload_0
    //   37: invokevirtual O : ()Z
    //   40: ifeq -> 67
    //   43: aload_0
    //   44: getfield p : Lnet/minecraft/network/datasync/EntityDataManager;
    //   47: getstatic com/schnurritv/sexmod/b3.b : Lnet/minecraft/network/datasync/DataParameter;
    //   50: invokevirtual func_187225_a : (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
    //   53: checkcast java/lang/String
    //   56: aload_0
    //   57: invokevirtual n : ()Ljava/util/UUID;
    //   60: invokevirtual toString : ()Ljava/lang/String;
    //   63: invokevirtual equals : (Ljava/lang/Object;)Z
    //   66: istore_3
    //   67: iload_2
    //   68: ifne -> 90
    //   71: iload_3
    //   72: ifne -> 90
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   81: athrow
    //   82: iconst_1
    //   83: goto -> 91
    //   86: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   89: athrow
    //   90: iconst_0
    //   91: istore #4
    //   93: aload_1
    //   94: getstatic com/schnurritv/sexmod/m.STARTBLOWJOB : Lcom/schnurritv/sexmod/m;
    //   97: invokevirtual toString : ()Ljava/lang/String;
    //   100: invokevirtual equals : (Ljava/lang/Object;)Z
    //   103: ifeq -> 156
    //   106: iload #4
    //   108: ifeq -> 135
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   117: athrow
    //   118: aload_0
    //   119: invokevirtual o : ()Lcom/schnurritv/sexmod/m;
    //   122: getstatic com/schnurritv/sexmod/m.PAYMENT : Lcom/schnurritv/sexmod/m;
    //   125: if_acmpne -> 149
    //   128: goto -> 135
    //   131: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   134: athrow
    //   135: aload_0
    //   136: getstatic com/schnurritv/sexmod/m.STARTBLOWJOB : Lcom/schnurritv/sexmod/m;
    //   139: invokevirtual c : (Lcom/schnurritv/sexmod/m;)V
    //   142: goto -> 156
    //   145: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   148: athrow
    //   149: aload_0
    //   150: getstatic com/schnurritv/sexmod/m.PAYMENT : Lcom/schnurritv/sexmod/m;
    //   153: invokevirtual c : (Lcom/schnurritv/sexmod/m;)V
    //   156: aload_1
    //   157: getstatic com/schnurritv/sexmod/m.KOBOLD_ANAL_START : Lcom/schnurritv/sexmod/m;
    //   160: invokevirtual toString : ()Ljava/lang/String;
    //   163: invokevirtual equals : (Ljava/lang/Object;)Z
    //   166: ifeq -> 219
    //   169: iload #4
    //   171: ifeq -> 198
    //   174: goto -> 181
    //   177: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   180: athrow
    //   181: aload_0
    //   182: invokevirtual o : ()Lcom/schnurritv/sexmod/m;
    //   185: getstatic com/schnurritv/sexmod/m.PAYMENT : Lcom/schnurritv/sexmod/m;
    //   188: if_acmpne -> 212
    //   191: goto -> 198
    //   194: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   197: athrow
    //   198: aload_0
    //   199: getstatic com/schnurritv/sexmod/m.KOBOLD_ANAL_START : Lcom/schnurritv/sexmod/m;
    //   202: invokevirtual c : (Lcom/schnurritv/sexmod/m;)V
    //   205: goto -> 219
    //   208: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   211: athrow
    //   212: aload_0
    //   213: getstatic com/schnurritv/sexmod/m.PAYMENT : Lcom/schnurritv/sexmod/m;
    //   216: invokevirtual c : (Lcom/schnurritv/sexmod/m;)V
    //   219: aload_1
    //   220: getstatic com/schnurritv/sexmod/m.MATING_PRESS_START : Lcom/schnurritv/sexmod/m;
    //   223: invokevirtual toString : ()Ljava/lang/String;
    //   226: invokevirtual equals : (Ljava/lang/Object;)Z
    //   229: ifeq -> 246
    //   232: aload_0
    //   233: getstatic com/schnurritv/sexmod/m.MATING_PRESS_START : Lcom/schnurritv/sexmod/m;
    //   236: invokevirtual c : (Lcom/schnurritv/sexmod/m;)V
    //   239: goto -> 246
    //   242: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   245: athrow
    //   246: return
    // Exception table:
    //   from	to	target	type
    //   14	28	28	java/lang/RuntimeException
    //   67	75	78	java/lang/RuntimeException
    //   71	86	86	java/lang/RuntimeException
    //   93	111	114	java/lang/RuntimeException
    //   106	128	131	java/lang/RuntimeException
    //   118	145	145	java/lang/RuntimeException
    //   156	174	177	java/lang/RuntimeException
    //   169	191	194	java/lang/RuntimeException
    //   181	208	208	java/lang/RuntimeException
    //   219	239	242	java/lang/RuntimeException
  }
  
  void e() {
    try {
      if (!this.field_70170_p.field_72995_K)
        return; 
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
    try {
      if (!((Boolean)this.p.func_187225_a(z)).booleanValue())
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (o() != m.NULL)
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
    a(entityPlayer);
  }
  
  void a(EntityPlayer paramEntityPlayer) {
    bo bo = bo.f(paramEntityPlayer.getPersistentID());
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Vec3d vec3d1 = new Vec3d(paramEntityPlayer.field_70165_t, paramEntityPlayer.field_70163_u + ((bo == null) ? paramEntityPlayer.eyeHeight : bo.func_70047_e()), paramEntityPlayer.field_70161_v);
    Vec3d vec3d2 = new Vec3d(this.field_70165_t, this.field_70163_u + func_70047_e(), this.field_70161_v);
    double d1 = vec3d2.func_72438_d(vec3d1);
    double d2 = vec3d1.field_72448_b - vec3d2.field_72448_b;
    this.field_70125_A = (float)-(Math.sin(d2 / d1) * 57.29577951308232D);
  }
  
  void j() {}
  
  boolean g() {
    try {
      if (o() != m.NULL)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (Math.abs(this.field_70159_w) + Math.abs(this.field_70179_y) > 0.01D)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (a())
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return true;
  }
  
  void t() {
    Optional optional = (Optional)this.p.func_187225_a(aC);
    try {
      if (!optional.isPresent())
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    UUID uUID = (UUID)optional.get();
    try {
      if (!((Boolean)this.p.func_187225_a(ap)).booleanValue())
        try {
          if (s.h(uUID)) {
            try {
              if (!O())
                return; 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            EntityPlayer entityPlayer = l();
            try {
              if (entityPlayer == null)
                return; 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            for (g g : s.j(uUID)) {
              try {
                if (g.c(this)) {
                  g.b(this);
                  c(m.NULL);
                  this.p.func_187227_b(z, Boolean.valueOf(false));
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
            } 
            this.field_70145_X = false;
            func_189654_d(false);
            PathNavigate pathNavigate = func_70661_as();
            double d = func_174791_d().func_72438_d(entityPlayer.func_174791_d());
            try {
              if (d > 2.0D)
                try {
                  pathNavigate.func_75497_a((Entity)entityPlayer, a(entityPlayer, d));
                  C();
                  if (d > 15.0D)
                    b(entityPlayer); 
                } catch (RuntimeException runtimeException) {
                  throw a(null);
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
    try {
      if (s.e(uUID, this)) {
        d(uUID);
      } else {
        n(uUID);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  protected double a(EntityPlayer paramEntityPlayer, double paramDouble) {
    double d1;
    if (paramEntityPlayer.func_70051_ag()) {
      d1 = 0.7D;
    } else {
      d1 = 0.35D;
    } 
    double d2 = Math.floor(paramDouble / 5.0D) * 0.3D;
    d1 += d2;
    if (func_70090_H())
      d1 *= 60.0D; 
    return d1;
  }
  
  void i(UUID paramUUID) {
    BlockPos blockPos = s.l(paramUUID);
    try {
      if (blockPos == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.aJ != null)
        this.field_70170_p.func_175656_a(blockPos, this.aJ); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.M != null)
        this.field_70170_p.func_175656_a(blockPos.func_177982_a(0, -1, 0), this.M); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  void d(UUID paramUUID) {
    try {
      if (s(paramUUID))
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!O())
        try {
          if (s.g(paramUUID)) {
            func_70661_as().func_75499_g();
            this.V = null;
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    T t1 = s.q(paramUUID);
    T t2 = q();
    try {
      if (t1 != t2)
        try {
          s.a(paramUUID, t2);
          switch (c.b[t2.ordinal()]) {
            case 1:
              l(paramUUID);
              s.c(paramUUID, (BlockPos)null);
              a("okay resting time owo");
              break;
            case 2:
              i(paramUUID);
              a(paramUUID);
              break;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      switch (c.b[t2.ordinal()]) {
        case 2:
          this.ax = null;
          q(paramUUID);
          break;
        case 1:
          j(paramUUID);
          break;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  void l(UUID paramUUID) {
    Collection<g> collection = s.j(paramUUID);
    for (g g : collection)
      g.e(); 
  }
  
  void a(UUID paramUUID) {
    try {
      if (!O())
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    List<b3> list = s.m(paramUUID);
    for (b3 b31 : list) {
      try {
        s.b(b31);
        if (b31.n() != null)
          continue; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      b31.field_70145_X = false;
      b31.func_189654_d(false);
      b31.func_184212_Q().func_187227_b(z, Boolean.valueOf(false));
      b31.c(m.NULL);
    } 
  }
  
  void j(UUID paramUUID) {
    Collection<g> collection = s.j(paramUUID);
    if (collection != null)
      for (g g : collection)
        g.b(this);  
    try {
      if (O()) {
        t(paramUUID);
      } else {
        r(paramUUID);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  void t(UUID paramUUID) {
    BlockPos[] arrayOfBlockPos = s.a(this);
    if (arrayOfBlockPos != null) {
      Vec3d vec3d1 = new Vec3d((arrayOfBlockPos[0].func_177958_n() + 0.5F), arrayOfBlockPos[0].func_177956_o() + 0.5625D, (arrayOfBlockPos[0].func_177952_p() + 0.5F));
      Vec3d vec3d2 = new Vec3d((arrayOfBlockPos[1].func_177958_n() + 0.5F), arrayOfBlockPos[1].func_177956_o() + 0.5625D, (arrayOfBlockPos[1].func_177952_p() + 0.5F));
      try {
      
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      boolean bool = ((vec3d1.func_178788_d(vec3d2)).field_72450_a == 0.0D) ? true : false;
      Vec3d vec3d3 = aH.a(vec3d1, vec3d2, 0.5D);
      try {
        this.p.func_187227_b(z, Boolean.valueOf(true));
        a(vec3d3);
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      a(bool ? 0.0F : 90.0F);
      this.field_70145_X = true;
      func_189654_d(true);
      return;
    } 
    HashSet<BlockPos> hashSet = s.c(paramUUID);
    BlockPos blockPos = null;
    try {
      if (hashSet == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    for (BlockPos blockPos1 : hashSet) {
      IBlockState iBlockState = this.field_70170_p.func_180495_p(blockPos1);
      boolean bool = false;
      UnmodifiableIterator<Map.Entry> unmodifiableIterator = iBlockState.func_177228_b().entrySet().iterator();
      while (unmodifiableIterator.hasNext()) {
        Map.Entry entry = unmodifiableIterator.next();
        if (entry.getKey() instanceof net.minecraft.block.properties.PropertyBool) {
          bool = Boolean.valueOf(((Boolean)entry.getValue()).booleanValue()).booleanValue();
          break;
        } 
      } 
      try {
        if (bool)
          continue; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (s.a(blockPos1))
          continue; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      if (blockPos == null) {
        blockPos = blockPos1;
        continue;
      } 
      if (func_174818_b(blockPos) > func_174818_b(blockPos1))
        blockPos = blockPos1; 
    } 
    try {
      if (blockPos == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (blockPos.func_185332_f((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v) > 2.0D) {
        try {
          if (Math.abs(blockPos.func_177973_b((Vec3i)func_180425_c()).func_177956_o()) > 4) {
            a(blockPos.func_177982_a(0, 1, 0));
          } else {
            BlockPos blockPos1 = c(blockPos);
            try {
              func_70661_as().func_75492_a(blockPos1.func_177958_n(), blockPos1.func_177956_o(), blockPos1.func_177952_p(), 0.3499999940395355D);
              if (func_70661_as().func_75505_d() == null)
                a(blockPos.func_177982_a(0, 1, 0)); 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    s.a(this, blockPos);
    c(m.SLEEP);
  }
  
  void r(UUID paramUUID) {
    BlockPos blockPos = s.l(paramUUID);
    try {
      if (blockPos == null && s.e(paramUUID, this)) {
        BlockPos blockPos1 = func_180425_c().func_177982_a(1, 0, 0);
        this.M = this.field_70170_p.func_180495_p(blockPos1.func_177982_a(0, -1, 0));
        this.aJ = this.field_70170_p.func_180495_p(blockPos1);
        this.field_70170_p.func_175656_a(blockPos1.func_177982_a(0, -1, 0), Blocks.field_150424_aL.func_176223_P());
        this.field_70170_p.func_175656_a(blockPos1, z.a.func_176223_P());
        s.c(paramUUID, blockPos1);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (blockPos == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.ax == null) {
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        this.ax = blockPos.func_177982_a((func_70681_au().nextBoolean() ? 1 : -1) * (func_70681_au().nextInt(2) + 1), 0, (func_70681_au().nextBoolean() ? 1 : -1) * (func_70681_au().nextInt(2) + 1));
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    func_70661_as().func_75492_a(this.ax.func_177958_n(), this.ax.func_177956_o(), this.ax.func_177952_p(), 0.3499999940395355D);
    C();
  }
  
  void q(UUID paramUUID) {
    try {
      if (O()) {
        s.c(paramUUID, (BlockPos)null);
        g(paramUUID);
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Collection<g> collection = s.j(paramUUID);
    try {
      if (collection == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.N) {
        this.V = null;
        a(paramUUID, collection);
      } else {
        b(paramUUID, collection);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  void a(UUID paramUUID, Collection<g> paramCollection) {
    try {
      if (paramCollection.isEmpty()) {
        this.N = false;
        u(paramUUID);
        a("Lets go somewhere else");
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  void b(UUID paramUUID, Collection<g> paramCollection) {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic l : (Ljava/util/UUID;)Lnet/minecraft/util/math/BlockPos;
    //   4: astore_3
    //   5: aload_3
    //   6: ifnonnull -> 19
    //   9: aload_0
    //   10: aload_1
    //   11: invokevirtual u : (Ljava/util/UUID;)V
    //   14: return
    //   15: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   18: athrow
    //   19: aload_0
    //   20: getfield field_70173_aa : I
    //   23: bipush #40
    //   25: irem
    //   26: ifne -> 75
    //   29: aload_0
    //   30: getfield U : Lnet/minecraft/util/math/Vec3d;
    //   33: aload_0
    //   34: invokevirtual func_174791_d : ()Lnet/minecraft/util/math/Vec3d;
    //   37: invokevirtual equals : (Ljava/lang/Object;)Z
    //   40: ifeq -> 67
    //   43: goto -> 50
    //   46: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   49: athrow
    //   50: aload_0
    //   51: aload_1
    //   52: invokevirtual u : (Ljava/util/UUID;)V
    //   55: aload_0
    //   56: aconst_null
    //   57: putfield V : Lnet/minecraft/util/math/BlockPos;
    //   60: goto -> 67
    //   63: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   66: athrow
    //   67: aload_0
    //   68: aload_0
    //   69: invokevirtual func_174791_d : ()Lnet/minecraft/util/math/Vec3d;
    //   72: putfield U : Lnet/minecraft/util/math/Vec3d;
    //   75: aload_0
    //   76: getfield V : Lnet/minecraft/util/math/BlockPos;
    //   79: ifnull -> 118
    //   82: aload_0
    //   83: getfield V : Lnet/minecraft/util/math/BlockPos;
    //   86: aload_0
    //   87: getfield field_70165_t : D
    //   90: d2i
    //   91: aload_0
    //   92: getfield field_70163_u : D
    //   95: d2i
    //   96: aload_0
    //   97: getfield field_70161_v : D
    //   100: d2i
    //   101: invokevirtual func_185332_f : (III)D
    //   104: ldc2_w 4.0
    //   107: dcmpg
    //   108: ifge -> 134
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   117: athrow
    //   118: aload_0
    //   119: aload_0
    //   120: aload_1
    //   121: invokevirtual o : (Ljava/util/UUID;)Lnet/minecraft/util/math/BlockPos;
    //   124: putfield V : Lnet/minecraft/util/math/BlockPos;
    //   127: goto -> 134
    //   130: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   133: athrow
    //   134: aload_0
    //   135: invokevirtual func_70661_as : ()Lnet/minecraft/pathfinding/PathNavigate;
    //   138: aload_0
    //   139: getfield V : Lnet/minecraft/util/math/BlockPos;
    //   142: invokevirtual func_177958_n : ()I
    //   145: i2d
    //   146: aload_0
    //   147: getfield V : Lnet/minecraft/util/math/BlockPos;
    //   150: invokevirtual func_177956_o : ()I
    //   153: i2d
    //   154: aload_0
    //   155: getfield V : Lnet/minecraft/util/math/BlockPos;
    //   158: invokevirtual func_177952_p : ()I
    //   161: i2d
    //   162: ldc2_w 0.3499999940395355
    //   165: invokevirtual func_75492_a : (DDDD)Z
    //   168: pop
    //   169: aload_0
    //   170: invokevirtual C : ()V
    //   173: aload_0
    //   174: invokevirtual func_180425_c : ()Lnet/minecraft/util/math/BlockPos;
    //   177: aload_3
    //   178: invokevirtual func_177951_i : (Lnet/minecraft/util/math/Vec3i;)D
    //   181: invokestatic sqrt : (D)D
    //   184: ldc2_w 5.0
    //   187: dcmpl
    //   188: ifle -> 196
    //   191: return
    //   192: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   195: athrow
    //   196: aload_0
    //   197: iconst_1
    //   198: putfield N : Z
    //   201: aload_0
    //   202: ldc 'Time to work bitches!'
    //   204: invokevirtual a : (Ljava/lang/String;)V
    //   207: aload_1
    //   208: invokestatic d : (Ljava/util/UUID;)I
    //   211: istore #4
    //   213: iconst_1
    //   214: istore #5
    //   216: iload #5
    //   218: iload #4
    //   220: if_icmpge -> 239
    //   223: aload_0
    //   224: aload_1
    //   225: aload_2
    //   226: invokevirtual c : (Ljava/util/UUID;Ljava/util/Collection;)V
    //   229: iinc #5, 1
    //   232: goto -> 216
    //   235: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   238: athrow
    //   239: aload_1
    //   240: aconst_null
    //   241: invokestatic c : (Ljava/util/UUID;Lnet/minecraft/util/math/BlockPos;)V
    //   244: return
    // Exception table:
    //   from	to	target	type
    //   5	15	15	java/lang/RuntimeException
    //   19	43	46	java/lang/RuntimeException
    //   29	60	63	java/lang/RuntimeException
    //   75	111	114	java/lang/RuntimeException
    //   82	127	130	java/lang/RuntimeException
    //   134	192	192	java/lang/RuntimeException
    //   216	235	235	java/lang/RuntimeException
  }
  
  protected void b(EntityPlayer paramEntityPlayer) {
    BlockPos blockPos;
    byte b = 0;
    do {
      blockPos = paramEntityPlayer.func_180425_c().func_177982_a(U.f.nextInt(10), 0, U.f.nextInt(10));
    } while (++b < 20 && !func_184595_k(blockPos.func_177958_n(), blockPos.func_177956_o(), blockPos.func_177952_p()));
    try {
      if (b == 20)
        func_70107_b(paramEntityPlayer.field_70165_t, paramEntityPlayer.field_70163_u, paramEntityPlayer.field_70161_v); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.field_70159_w = 0.0D;
    this.field_70181_x = 0.0D;
    this.field_70179_y = 0.0D;
  }
  
  BlockPos o(UUID paramUUID) {
    BlockPos blockPos = s.l(paramUUID);
    try {
      if (blockPos == null)
        return BlockPos.field_177992_a; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return c(blockPos);
  }
  
  BlockPos c(BlockPos paramBlockPos) {
    BlockPos blockPos1 = func_180425_c();
    BlockPos blockPos2 = paramBlockPos.func_177973_b((Vec3i)blockPos1);
    try {
      if (Math.abs(blockPos2.func_177958_n()) + Math.abs(blockPos2.func_177952_p()) < 20)
        return paramBlockPos; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    double d1 = Math.min(Math.abs(blockPos2.func_177958_n()), Math.abs(blockPos2.func_177952_p()));
    double d2 = Math.max(Math.abs(blockPos2.func_177958_n()), Math.abs(blockPos2.func_177952_p()));
    double d3 = d1 / (d2 + d1);
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    int i = (int)((((blockPos2.func_177958_n() > 0) ? 1 : -1) * 20) * ((d1 == Math.abs(blockPos2.func_177958_n())) ? d3 : (1.0D - d3)));
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    int j = (int)((((blockPos2.func_177952_p() > 0) ? 1 : -1) * 20) * ((d1 == Math.abs(blockPos2.func_177952_p())) ? d3 : (1.0D - d3)));
    null = func_180425_c().func_177982_a(i, 0, j);
    return new BlockPos(null.func_177958_n(), aH.a(this.field_70170_p, null.func_177958_n(), null.func_177952_p()) + 1, null.func_177952_p());
  }
  
  void u(UUID paramUUID) {
    BlockPos blockPos;
    byte b = 0;
    while (true) {
      b++;
      blockPos = func_180425_c();
      try {
      
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      blockPos = blockPos.func_177982_a((50 + func_70681_au().nextInt(50)) * (func_70681_au().nextBoolean() ? 1 : -1), 0, (50 + func_70681_au().nextInt(50)) * (func_70681_au().nextBoolean() ? 1 : -1));
      blockPos = new BlockPos(blockPos.func_177958_n(), aH.a(this.field_70170_p, blockPos.func_177958_n(), blockPos.func_177952_p()), blockPos.func_177952_p());
      try {
        if (blockPos.func_177956_o() > 0) {
          try {
            if (!func_70661_as().func_188555_b(blockPos))
              continue; 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          break;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      continue;
      if (b >= 100)
        break; 
    } 
    s.c(paramUUID, blockPos);
  }
  
  void c(UUID paramUUID, Collection<g> paramCollection) {
    List<BlockPos> list = a(func_180425_c(), BlockLog.class, 30, 4, (HashSet<Biome>)null);
    BlockPos blockPos = null;
    for (BlockPos blockPos1 : list) {
      Block block = this.field_70170_p.func_180495_p(blockPos1.func_177977_b()).func_177230_c();
      if (!(block instanceof BlockLog)) {
        try {
          if (block == Blocks.field_150350_a)
            continue; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        boolean bool = false;
        for (g g : paramCollection) {
          if (g.c(blockPos1)) {
            bool = true;
            break;
          } 
        } 
        if (!bool) {
          blockPos = blockPos1;
          break;
        } 
      } 
    } 
    try {
      if (blockPos == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    g.a(this.field_70170_p, blockPos, paramUUID);
    a("Someone, go fall this tree!");
  }
  
  T q() {
    long l = this.field_70170_p.func_72820_D();
    try {
      if (l >= 12300L)
        try {
          return (l <= 23850L) ? T.REST : T.ACTIVE;
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return T.ACTIVE;
  }
  
  boolean s(UUID paramUUID) {
    return a(paramUUID, true);
  }
  
  boolean a(UUID paramUUID, boolean paramBoolean) {
    EntityLivingBase entityLivingBase;
    HashSet<EntityLivingBase> hashSet = s.b(paramUUID);
    b3 b31 = s.i(paramUUID);
    try {
      if (b31 == null)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    for (b3 b32 : this.field_70170_p.func_72872_a(b3.class, new AxisAlignedBB(b31.field_70165_t - 30.0D, b31.field_70163_u - 30.0D, b31.field_70161_v - 30.0D, b31.field_70165_t + 30.0D, b31.field_70163_u + 30.0D, b31.field_70161_v + 30.0D))) {
      try {
        if (!func_70685_l((Entity)b32))
          continue; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (b32.O())
          try {
            if (O())
              continue; 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      Optional optional = (Optional)b32.func_184212_Q().func_187225_a(aC);
      try {
        if (!optional.isPresent()) {
          hashSet.add(b32);
          continue;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (!((UUID)optional.get()).equals(paramUUID))
          hashSet.add(b32); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    Entity entity = null;
    ArrayList<EntityLivingBase> arrayList = new ArrayList();
    for (EntityLivingBase entityLivingBase1 : hashSet) {
      try {
        if (entityLivingBase1.field_70128_L) {
          arrayList.add(entityLivingBase1);
          continue;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (b31.func_70032_d((Entity)entityLivingBase1) > 30.0F)
          continue; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (entity == null || func_70032_d(entity) > func_70032_d((Entity)entityLivingBase1))
          entityLivingBase = entityLivingBase1; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    for (EntityLivingBase entityLivingBase1 : arrayList)
      s.a(paramUUID, entityLivingBase1); 
    try {
      if (entityLivingBase == null)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!paramBoolean)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (o() != m.ATTACK) {
        this.p.func_187227_b(z, Boolean.valueOf(false));
        c(m.NULL);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    BlockPos blockPos = c(entityLivingBase.func_180425_c());
    try {
      func_70661_as().func_75492_a(blockPos.func_177958_n(), blockPos.func_177956_o(), blockPos.func_177952_p(), 0.7D);
      C();
      if (func_70032_d((Entity)entityLivingBase) > 1.5F)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.W > 0)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    float f = (float)(Math.atan2(this.field_70161_v - entityLivingBase.field_70161_v, this.field_70165_t - entityLivingBase.field_70165_t) * 57.29577951308232D + 90.0D);
    a(f);
    c(m.ATTACK);
    this.W = 84;
    return true;
  }
  
  void n(UUID paramUUID) {
    try {
      if (s(paramUUID))
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    T t = s.q(paramUUID);
    try {
      switch (c.b[t.ordinal()]) {
        case 1:
          j(paramUUID);
          break;
        case 2:
          this.ax = null;
          p(paramUUID);
          break;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  void p(UUID paramUUID) {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic l : (Ljava/util/UUID;)Lnet/minecraft/util/math/BlockPos;
    //   4: astore_2
    //   5: aload_2
    //   6: ifnonnull -> 24
    //   9: aload_0
    //   10: aconst_null
    //   11: putfield V : Lnet/minecraft/util/math/BlockPos;
    //   14: aload_0
    //   15: aload_1
    //   16: invokevirtual g : (Ljava/util/UUID;)V
    //   19: return
    //   20: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   23: athrow
    //   24: aload_1
    //   25: invokestatic i : (Ljava/util/UUID;)Lcom/schnurritv/sexmod/b3;
    //   28: astore_3
    //   29: aload_1
    //   30: invokestatic g : (Ljava/util/UUID;)Z
    //   33: ifeq -> 53
    //   36: aload_0
    //   37: invokevirtual func_70661_as : ()Lnet/minecraft/pathfinding/PathNavigate;
    //   40: invokevirtual func_75499_g : ()V
    //   43: aload_0
    //   44: aconst_null
    //   45: putfield V : Lnet/minecraft/util/math/BlockPos;
    //   48: return
    //   49: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   52: athrow
    //   53: aload_3
    //   54: ifnonnull -> 92
    //   57: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   60: new java/lang/StringBuilder
    //   63: dup
    //   64: invokespecial <init> : ()V
    //   67: ldc 'leader of tribe '
    //   69: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   72: aload_1
    //   73: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   76: ldc ' is null'
    //   78: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: invokevirtual toString : ()Ljava/lang/String;
    //   84: invokevirtual println : (Ljava/lang/String;)V
    //   87: return
    //   88: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   91: athrow
    //   92: aload_3
    //   93: aload_0
    //   94: invokevirtual func_70032_d : (Lnet/minecraft/entity/Entity;)F
    //   97: ldc 20.0
    //   99: fcmpl
    //   100: ifle -> 131
    //   103: aload_0
    //   104: aload_3
    //   105: getfield field_70165_t : D
    //   108: aload_3
    //   109: getfield field_70163_u : D
    //   112: aload_3
    //   113: getfield field_70161_v : D
    //   116: invokevirtual func_70107_b : (DDD)V
    //   119: aload_0
    //   120: aconst_null
    //   121: putfield V : Lnet/minecraft/util/math/BlockPos;
    //   124: goto -> 131
    //   127: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   130: athrow
    //   131: aload_0
    //   132: getfield field_70173_aa : I
    //   135: bipush #40
    //   137: irem
    //   138: ifne -> 186
    //   141: aload_0
    //   142: getfield U : Lnet/minecraft/util/math/Vec3d;
    //   145: aload_0
    //   146: invokevirtual func_174791_d : ()Lnet/minecraft/util/math/Vec3d;
    //   149: invokevirtual equals : (Ljava/lang/Object;)Z
    //   152: ifeq -> 178
    //   155: goto -> 162
    //   158: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   161: athrow
    //   162: aload_0
    //   163: aload_0
    //   164: aload_1
    //   165: invokevirtual o : (Ljava/util/UUID;)Lnet/minecraft/util/math/BlockPos;
    //   168: putfield V : Lnet/minecraft/util/math/BlockPos;
    //   171: goto -> 178
    //   174: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   177: athrow
    //   178: aload_0
    //   179: aload_0
    //   180: invokevirtual func_174791_d : ()Lnet/minecraft/util/math/Vec3d;
    //   183: putfield U : Lnet/minecraft/util/math/Vec3d;
    //   186: aload_0
    //   187: getfield V : Lnet/minecraft/util/math/BlockPos;
    //   190: ifnull -> 229
    //   193: aload_0
    //   194: getfield V : Lnet/minecraft/util/math/BlockPos;
    //   197: aload_0
    //   198: getfield field_70165_t : D
    //   201: d2i
    //   202: aload_0
    //   203: getfield field_70163_u : D
    //   206: d2i
    //   207: aload_0
    //   208: getfield field_70161_v : D
    //   211: d2i
    //   212: invokevirtual func_185332_f : (III)D
    //   215: ldc2_w 4.0
    //   218: dcmpg
    //   219: ifge -> 245
    //   222: goto -> 229
    //   225: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   228: athrow
    //   229: aload_0
    //   230: aload_0
    //   231: aload_1
    //   232: invokevirtual o : (Ljava/util/UUID;)Lnet/minecraft/util/math/BlockPos;
    //   235: putfield V : Lnet/minecraft/util/math/BlockPos;
    //   238: goto -> 245
    //   241: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   244: athrow
    //   245: aload_0
    //   246: invokevirtual func_70661_as : ()Lnet/minecraft/pathfinding/PathNavigate;
    //   249: aload_0
    //   250: getfield V : Lnet/minecraft/util/math/BlockPos;
    //   253: invokevirtual func_177958_n : ()I
    //   256: i2d
    //   257: aload_0
    //   258: getfield V : Lnet/minecraft/util/math/BlockPos;
    //   261: invokevirtual func_177956_o : ()I
    //   264: i2d
    //   265: aload_0
    //   266: getfield V : Lnet/minecraft/util/math/BlockPos;
    //   269: invokevirtual func_177952_p : ()I
    //   272: i2d
    //   273: ldc2_w 0.3499999940395355
    //   276: invokevirtual func_75492_a : (DDDD)Z
    //   279: pop
    //   280: aload_0
    //   281: invokevirtual C : ()V
    //   284: return
    // Exception table:
    //   from	to	target	type
    //   5	20	20	java/lang/RuntimeException
    //   29	49	49	java/lang/RuntimeException
    //   53	88	88	java/lang/RuntimeException
    //   92	124	127	java/lang/RuntimeException
    //   131	155	158	java/lang/RuntimeException
    //   141	171	174	java/lang/RuntimeException
    //   186	222	225	java/lang/RuntimeException
    //   193	238	241	java/lang/RuntimeException
  }
  
  void g(UUID paramUUID) {
    try {
      if (n() != null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Collection<g> collection = s.j(paramUUID);
    try {
      if (collection == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    g g = null;
    for (g g1 : collection) {
      if (g1.c(this)) {
        g = g1;
        break;
      } 
    } 
    if (g == null)
      for (g g1 : collection) {
        try {
          if (O())
            try {
              if (!a(paramUUID, g1))
                continue; 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        try {
          if (!a(g1)) {
            this.aj = true;
            continue;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        if (g1.a(this)) {
          g = g1;
          try {
            this.aS = null;
            if (g1.c() == g.a.FALL_TREE) {
              a("Ima fall this tree owo");
              break;
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          a("Ima go mine uwu");
          a(g1.f());
          this.field_70170_p.func_175656_a(g1.f(), Blocks.field_150350_a.func_176223_P());
          break;
        } 
      }  
    try {
      if (g == null) {
        k(paramUUID);
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (g.c() == g.a.FALL_TREE)
        a(paramUUID, g.f(), g); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (g.c() == g.a.MINE)
        c(paramUUID, g); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  void a(BlockPos paramBlockPos) {
    aV.a.sendToAllTracking(new d(N(), EnumParticleTypes.PORTAL.func_179346_b(), 30), new NetworkRegistry.TargetPoint(this.field_71093_bK, this.field_70165_t, this.field_70163_u, this.field_70161_v, 30.0D));
    func_70107_b((0.5F + paramBlockPos.func_177958_n()), paramBlockPos.func_177956_o(), (0.5F + paramBlockPos.func_177952_p()));
    aV.a.sendToAllTracking(new d(N(), EnumParticleTypes.PORTAL.func_179346_b(), 30), new NetworkRegistry.TargetPoint(this.field_71093_bK, this.field_70165_t, this.field_70163_u, this.field_70161_v, 30.0D));
  }
  
  void c(UUID paramUUID, g paramg) {
    try {
      if (o() != m.MINE) {
        b(paramUUID, paramg);
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.aL--;
    this.aa--;
    if (this.aa == 0) {
      IBlockState iBlockState1 = this.field_70170_p.func_180495_p(this.aS.func_177984_a());
      if (!(iBlockState1.func_177230_c() instanceof net.minecraft.block.BlockFalling)) {
        paramg.b(this.aS);
        EntityPlayer entityPlayer = l();
        try {
          if (entityPlayer != null)
            aV.a.sendTo(new B(this.aS, false), (EntityPlayerMP)entityPlayer); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } 
      IBlockState iBlockState2 = this.field_70170_p.func_180495_p(this.aS);
      b(new ItemStack(iBlockState2.func_177230_c().func_180660_a(iBlockState2, func_70681_au(), 0), 1, iBlockState2.func_177230_c().func_180651_a(iBlockState2)));
      this.field_70170_p.func_175655_b(this.aS, false);
    } 
    try {
      if (this.aL <= 0) {
        this.aL = 100;
        this.aa = 24;
        c(m.NULL);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  void b(UUID paramUUID, g paramg) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual func_70661_as : ()Lnet/minecraft/pathfinding/PathNavigate;
    //   4: astore_3
    //   5: aload_0
    //   6: getfield aS : Lnet/minecraft/util/math/BlockPos;
    //   9: ifnull -> 33
    //   12: aload_2
    //   13: invokevirtual g : ()Ljava/util/HashSet;
    //   16: aload_0
    //   17: getfield aS : Lnet/minecraft/util/math/BlockPos;
    //   20: invokevirtual contains : (Ljava/lang/Object;)Z
    //   23: ifne -> 281
    //   26: goto -> 33
    //   29: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   32: athrow
    //   33: aload_0
    //   34: aload_0
    //   35: aload_2
    //   36: aload_1
    //   37: invokevirtual a : (Lcom/schnurritv/sexmod/g;Ljava/util/UUID;)Lnet/minecraft/util/math/BlockPos;
    //   40: putfield aS : Lnet/minecraft/util/math/BlockPos;
    //   43: aload_0
    //   44: getfield aS : Lnet/minecraft/util/math/BlockPos;
    //   47: ifnonnull -> 172
    //   50: goto -> 57
    //   53: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   56: athrow
    //   57: aload_2
    //   58: invokevirtual g : ()Ljava/util/HashSet;
    //   61: invokevirtual isEmpty : ()Z
    //   64: istore #4
    //   66: aload_1
    //   67: aload_2
    //   68: invokestatic a : (Ljava/util/UUID;Lcom/schnurritv/sexmod/g;)Ljava/util/HashSet;
    //   71: astore #5
    //   73: aload_1
    //   74: invokestatic n : (Ljava/util/UUID;)Ljava/util/UUID;
    //   77: astore #6
    //   79: aload #6
    //   81: ifnonnull -> 89
    //   84: return
    //   85: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   88: athrow
    //   89: aload_0
    //   90: getfield field_70170_p : Lnet/minecraft/world/World;
    //   93: aload #6
    //   95: invokevirtual func_152378_a : (Ljava/util/UUID;)Lnet/minecraft/entity/player/EntityPlayer;
    //   98: astore #7
    //   100: aload #7
    //   102: ifnonnull -> 110
    //   105: return
    //   106: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   109: athrow
    //   110: iload #4
    //   112: ifne -> 150
    //   115: aload #7
    //   117: new net/minecraft/util/text/TextComponentString
    //   120: dup
    //   121: ldc '<%s> It's impossible to mine here...'
    //   123: iconst_1
    //   124: anewarray java/lang/Object
    //   127: dup
    //   128: iconst_0
    //   129: aload_0
    //   130: invokevirtual H : ()Ljava/lang/String;
    //   133: aastore
    //   134: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   137: invokespecial <init> : (Ljava/lang/String;)V
    //   140: invokevirtual func_145747_a : (Lnet/minecraft/util/text/ITextComponent;)V
    //   143: goto -> 150
    //   146: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   149: athrow
    //   150: getstatic com/schnurritv/sexmod/aV.a : Lnet/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper;
    //   153: new com/schnurritv/sexmod/B
    //   156: dup
    //   157: aload #5
    //   159: iconst_0
    //   160: invokespecial <init> : (Ljava/util/HashSet;Z)V
    //   163: aload #7
    //   165: checkcast net/minecraft/entity/player/EntityPlayerMP
    //   168: invokevirtual sendTo : (Lnet/minecraftforge/fml/common/network/simpleimpl/IMessage;Lnet/minecraft/entity/player/EntityPlayerMP;)V
    //   171: return
    //   172: aload_0
    //   173: invokevirtual func_180425_c : ()Lnet/minecraft/util/math/BlockPos;
    //   176: invokevirtual func_177956_o : ()I
    //   179: aload_2
    //   180: invokevirtual f : ()Lnet/minecraft/util/math/BlockPos;
    //   183: invokevirtual func_177956_o : ()I
    //   186: isub
    //   187: invokestatic abs : (I)I
    //   190: iconst_3
    //   191: if_icmple -> 235
    //   194: aload_2
    //   195: invokevirtual f : ()Lnet/minecraft/util/math/BlockPos;
    //   198: aload_2
    //   199: invokevirtual b : ()Lnet/minecraft/util/EnumFacing;
    //   202: invokevirtual func_176734_d : ()Lnet/minecraft/util/EnumFacing;
    //   205: invokevirtual func_176730_m : ()Lnet/minecraft/util/math/Vec3i;
    //   208: invokevirtual func_177971_a : (Lnet/minecraft/util/math/Vec3i;)Lnet/minecraft/util/math/BlockPos;
    //   211: astore #4
    //   213: aload_0
    //   214: getfield field_70170_p : Lnet/minecraft/world/World;
    //   217: aload #4
    //   219: getstatic net/minecraft/init/Blocks.field_150350_a : Lnet/minecraft/block/Block;
    //   222: invokevirtual func_176223_P : ()Lnet/minecraft/block/state/IBlockState;
    //   225: invokevirtual func_175656_a : (Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)Z
    //   228: pop
    //   229: aload_0
    //   230: aload #4
    //   232: invokevirtual a : (Lnet/minecraft/util/math/BlockPos;)V
    //   235: aload_0
    //   236: getfield aS : Lnet/minecraft/util/math/BlockPos;
    //   239: aload_2
    //   240: invokevirtual b : ()Lnet/minecraft/util/EnumFacing;
    //   243: invokevirtual func_176734_d : ()Lnet/minecraft/util/EnumFacing;
    //   246: invokevirtual func_176730_m : ()Lnet/minecraft/util/math/Vec3i;
    //   249: invokevirtual func_177971_a : (Lnet/minecraft/util/math/Vec3i;)Lnet/minecraft/util/math/BlockPos;
    //   252: astore #4
    //   254: aload_3
    //   255: aload #4
    //   257: invokevirtual func_177958_n : ()I
    //   260: i2d
    //   261: aload #4
    //   263: invokevirtual func_177956_o : ()I
    //   266: i2d
    //   267: aload #4
    //   269: invokevirtual func_177952_p : ()I
    //   272: i2d
    //   273: ldc2_w 0.3499999940395355
    //   276: invokevirtual func_75492_a : (DDDD)Z
    //   279: pop
    //   280: return
    //   281: aload_0
    //   282: getfield field_70170_p : Lnet/minecraft/world/World;
    //   285: aload_0
    //   286: getfield aS : Lnet/minecraft/util/math/BlockPos;
    //   289: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   292: astore #4
    //   294: aload_0
    //   295: new net/minecraft/item/ItemStack
    //   298: dup
    //   299: aload #4
    //   301: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   306: aload #4
    //   308: getstatic com/schnurritv/sexmod/U.f : Ljava/util/Random;
    //   311: iconst_0
    //   312: invokevirtual func_180660_a : (Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;I)Lnet/minecraft/item/Item;
    //   315: invokespecial <init> : (Lnet/minecraft/item/Item;)V
    //   318: invokevirtual a : (Lnet/minecraft/item/ItemStack;)Z
    //   321: ifne -> 341
    //   324: aload_0
    //   325: iconst_1
    //   326: putfield aj : Z
    //   329: aload_0
    //   330: aload_1
    //   331: iconst_1
    //   332: invokevirtual b : (Ljava/util/UUID;Z)Z
    //   335: pop
    //   336: return
    //   337: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   340: athrow
    //   341: aload_0
    //   342: getfield field_70159_w : D
    //   345: dconst_0
    //   346: dcmpl
    //   347: ifne -> 445
    //   350: aload_0
    //   351: getfield field_70179_y : D
    //   354: dconst_0
    //   355: dcmpl
    //   356: ifne -> 445
    //   359: goto -> 366
    //   362: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   365: athrow
    //   366: aload_0
    //   367: getfield field_70122_E : Z
    //   370: ifeq -> 445
    //   373: goto -> 380
    //   376: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   379: athrow
    //   380: aload_0
    //   381: aload_0
    //   382: getfield aS : Lnet/minecraft/util/math/BlockPos;
    //   385: invokevirtual func_177958_n : ()I
    //   388: i2d
    //   389: aload_0
    //   390: getfield aS : Lnet/minecraft/util/math/BlockPos;
    //   393: invokevirtual func_177956_o : ()I
    //   396: i2d
    //   397: aload_0
    //   398: getfield aS : Lnet/minecraft/util/math/BlockPos;
    //   401: invokevirtual func_177952_p : ()I
    //   404: i2d
    //   405: invokevirtual func_70011_f : (DDD)D
    //   408: ldc2_w 3.0
    //   411: dcmpl
    //   412: ifgt -> 445
    //   415: goto -> 422
    //   418: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   421: athrow
    //   422: aload_0
    //   423: dup
    //   424: getfield ac : I
    //   427: iconst_1
    //   428: iadd
    //   429: dup_x1
    //   430: putfield ac : I
    //   433: bipush #10
    //   435: if_icmpge -> 491
    //   438: goto -> 445
    //   441: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   444: athrow
    //   445: aload_0
    //   446: getfield aS : Lnet/minecraft/util/math/BlockPos;
    //   449: aload_2
    //   450: invokevirtual b : ()Lnet/minecraft/util/EnumFacing;
    //   453: invokevirtual func_176734_d : ()Lnet/minecraft/util/EnumFacing;
    //   456: invokevirtual func_176730_m : ()Lnet/minecraft/util/math/Vec3i;
    //   459: invokevirtual func_177971_a : (Lnet/minecraft/util/math/Vec3i;)Lnet/minecraft/util/math/BlockPos;
    //   462: astore #5
    //   464: aload_3
    //   465: aload #5
    //   467: invokevirtual func_177958_n : ()I
    //   470: i2d
    //   471: aload #5
    //   473: invokevirtual func_177956_o : ()I
    //   476: i2d
    //   477: aload #5
    //   479: invokevirtual func_177952_p : ()I
    //   482: i2d
    //   483: ldc2_w 0.3499999940395355
    //   486: invokevirtual func_75492_a : (DDDD)Z
    //   489: pop
    //   490: return
    //   491: aload_3
    //   492: invokevirtual func_75499_g : ()V
    //   495: aload_0
    //   496: iconst_0
    //   497: putfield ac : I
    //   500: aload_0
    //   501: getstatic com/schnurritv/sexmod/m.MINE : Lcom/schnurritv/sexmod/m;
    //   504: invokevirtual c : (Lcom/schnurritv/sexmod/m;)V
    //   507: aload_0
    //   508: aload_0
    //   509: getfield field_70161_v : D
    //   512: aload_0
    //   513: getfield aS : Lnet/minecraft/util/math/BlockPos;
    //   516: invokevirtual func_177952_p : ()I
    //   519: i2d
    //   520: dsub
    //   521: aload_0
    //   522: getfield field_70165_t : D
    //   525: aload_0
    //   526: getfield aS : Lnet/minecraft/util/math/BlockPos;
    //   529: invokevirtual func_177958_n : ()I
    //   532: i2d
    //   533: dsub
    //   534: invokestatic atan2 : (DD)D
    //   537: ldc2_w 57.29577951308232
    //   540: dmul
    //   541: ldc2_w 90.0
    //   544: dadd
    //   545: d2f
    //   546: putfield field_70759_as : F
    //   549: aload_0
    //   550: aload_0
    //   551: getfield field_70759_as : F
    //   554: putfield field_70177_z : F
    //   557: aload_0
    //   558: getfield p : Lnet/minecraft/network/datasync/EntityDataManager;
    //   561: getstatic com/schnurritv/sexmod/b3.at : Lnet/minecraft/network/datasync/DataParameter;
    //   564: iconst_0
    //   565: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   568: invokevirtual func_187227_b : (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
    //   571: return
    // Exception table:
    //   from	to	target	type
    //   5	26	29	java/lang/RuntimeException
    //   12	50	53	java/lang/RuntimeException
    //   79	85	85	java/lang/RuntimeException
    //   100	106	106	java/lang/RuntimeException
    //   110	143	146	java/lang/RuntimeException
    //   294	337	337	java/lang/RuntimeException
    //   341	359	362	java/lang/RuntimeException
    //   350	373	376	java/lang/RuntimeException
    //   366	415	418	java/lang/RuntimeException
    //   380	438	441	java/lang/RuntimeException
  }
  
  @Nullable
  public EntityPlayer l() {
    try {
      if (!O())
        return null; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    UUID uUID = UUID.fromString((String)this.p.func_187225_a(b));
    return this.field_70170_p.func_152378_a(uUID);
  }
  
  BlockPos a(g paramg, UUID paramUUID) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual g : ()Ljava/util/HashSet;
    //   4: astore_3
    //   5: aload_1
    //   6: invokevirtual b : ()Lnet/minecraft/util/EnumFacing;
    //   9: astore #4
    //   11: new java/util/ArrayList
    //   14: dup
    //   15: invokespecial <init> : ()V
    //   18: astore #5
    //   20: aconst_null
    //   21: astore #6
    //   23: aload_3
    //   24: invokevirtual isEmpty : ()Z
    //   27: ifeq -> 36
    //   30: aconst_null
    //   31: areturn
    //   32: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   35: athrow
    //   36: aload_3
    //   37: invokevirtual iterator : ()Ljava/util/Iterator;
    //   40: astore #7
    //   42: aload #7
    //   44: invokeinterface hasNext : ()Z
    //   49: ifeq -> 303
    //   52: aload #7
    //   54: invokeinterface next : ()Ljava/lang/Object;
    //   59: checkcast net/minecraft/util/math/BlockPos
    //   62: astore #8
    //   64: getstatic com/schnurritv/sexmod/b3$c.a : [I
    //   67: aload #4
    //   69: invokevirtual ordinal : ()I
    //   72: iaload
    //   73: tableswitch default -> 300, 1 -> 104, 2 -> 159, 3 -> 207, 4 -> 255
    //   104: aload #6
    //   106: ifnull -> 136
    //   109: goto -> 116
    //   112: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   115: athrow
    //   116: aload #8
    //   118: invokevirtual func_177952_p : ()I
    //   121: aload #6
    //   123: invokevirtual intValue : ()I
    //   126: if_icmplt -> 300
    //   129: goto -> 136
    //   132: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   135: athrow
    //   136: aload #8
    //   138: invokevirtual func_177952_p : ()I
    //   141: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   144: astore #6
    //   146: aload #5
    //   148: aload #8
    //   150: invokeinterface add : (Ljava/lang/Object;)Z
    //   155: pop
    //   156: goto -> 300
    //   159: aload #6
    //   161: ifnull -> 184
    //   164: aload #8
    //   166: invokevirtual func_177952_p : ()I
    //   169: aload #6
    //   171: invokevirtual intValue : ()I
    //   174: if_icmpgt -> 300
    //   177: goto -> 184
    //   180: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   183: athrow
    //   184: aload #8
    //   186: invokevirtual func_177952_p : ()I
    //   189: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   192: astore #6
    //   194: aload #5
    //   196: aload #8
    //   198: invokeinterface add : (Ljava/lang/Object;)Z
    //   203: pop
    //   204: goto -> 300
    //   207: aload #6
    //   209: ifnull -> 232
    //   212: aload #8
    //   214: invokevirtual func_177958_n : ()I
    //   217: aload #6
    //   219: invokevirtual intValue : ()I
    //   222: if_icmpgt -> 300
    //   225: goto -> 232
    //   228: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   231: athrow
    //   232: aload #8
    //   234: invokevirtual func_177958_n : ()I
    //   237: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   240: astore #6
    //   242: aload #5
    //   244: aload #8
    //   246: invokeinterface add : (Ljava/lang/Object;)Z
    //   251: pop
    //   252: goto -> 300
    //   255: aload #6
    //   257: ifnull -> 280
    //   260: aload #8
    //   262: invokevirtual func_177958_n : ()I
    //   265: aload #6
    //   267: invokevirtual intValue : ()I
    //   270: if_icmplt -> 300
    //   273: goto -> 280
    //   276: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   279: athrow
    //   280: aload #8
    //   282: invokevirtual func_177958_n : ()I
    //   285: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   288: astore #6
    //   290: aload #5
    //   292: aload #8
    //   294: invokeinterface add : (Ljava/lang/Object;)Z
    //   299: pop
    //   300: goto -> 42
    //   303: new java/util/ArrayList
    //   306: dup
    //   307: invokespecial <init> : ()V
    //   310: astore #7
    //   312: aload #5
    //   314: invokeinterface iterator : ()Ljava/util/Iterator;
    //   319: astore #8
    //   321: aload #8
    //   323: invokeinterface hasNext : ()Z
    //   328: ifeq -> 466
    //   331: aload #8
    //   333: invokeinterface next : ()Ljava/lang/Object;
    //   338: checkcast net/minecraft/util/math/BlockPos
    //   341: astore #9
    //   343: aload #4
    //   345: getstatic net/minecraft/util/EnumFacing.NORTH : Lnet/minecraft/util/EnumFacing;
    //   348: if_acmpeq -> 366
    //   351: aload #4
    //   353: getstatic net/minecraft/util/EnumFacing.SOUTH : Lnet/minecraft/util/EnumFacing;
    //   356: if_acmpne -> 403
    //   359: goto -> 366
    //   362: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   365: athrow
    //   366: aload #9
    //   368: invokevirtual func_177952_p : ()I
    //   371: aload #6
    //   373: invokevirtual intValue : ()I
    //   376: if_icmpne -> 403
    //   379: goto -> 386
    //   382: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   385: athrow
    //   386: aload #7
    //   388: aload #9
    //   390: invokeinterface add : (Ljava/lang/Object;)Z
    //   395: pop
    //   396: goto -> 403
    //   399: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   402: athrow
    //   403: aload #4
    //   405: getstatic net/minecraft/util/EnumFacing.EAST : Lnet/minecraft/util/EnumFacing;
    //   408: if_acmpeq -> 426
    //   411: aload #4
    //   413: getstatic net/minecraft/util/EnumFacing.WEST : Lnet/minecraft/util/EnumFacing;
    //   416: if_acmpne -> 463
    //   419: goto -> 426
    //   422: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   425: athrow
    //   426: aload #9
    //   428: invokevirtual func_177958_n : ()I
    //   431: aload #6
    //   433: invokevirtual intValue : ()I
    //   436: if_icmpne -> 463
    //   439: goto -> 446
    //   442: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   445: athrow
    //   446: aload #7
    //   448: aload #9
    //   450: invokeinterface add : (Ljava/lang/Object;)Z
    //   455: pop
    //   456: goto -> 463
    //   459: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   462: athrow
    //   463: goto -> 321
    //   466: aload #7
    //   468: invokeinterface isEmpty : ()Z
    //   473: ifeq -> 482
    //   476: aconst_null
    //   477: areturn
    //   478: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   481: athrow
    //   482: new java/util/ArrayList
    //   485: dup
    //   486: invokespecial <init> : ()V
    //   489: astore #8
    //   491: aload_1
    //   492: invokevirtual b : ()Lnet/minecraft/util/EnumFacing;
    //   495: astore #9
    //   497: aload_1
    //   498: invokevirtual f : ()Lnet/minecraft/util/math/BlockPos;
    //   501: astore #10
    //   503: aload #9
    //   505: invokevirtual func_176740_k : ()Lnet/minecraft/util/EnumFacing$Axis;
    //   508: getstatic net/minecraft/util/EnumFacing$Axis.Z : Lnet/minecraft/util/EnumFacing$Axis;
    //   511: if_acmpne -> 932
    //   514: new net/minecraft/util/math/BlockPos
    //   517: dup
    //   518: aload #10
    //   520: invokevirtual func_177958_n : ()I
    //   523: aload #10
    //   525: invokevirtual func_177956_o : ()I
    //   528: aload #7
    //   530: iconst_0
    //   531: invokeinterface get : (I)Ljava/lang/Object;
    //   536: checkcast net/minecraft/util/math/BlockPos
    //   539: invokevirtual func_177952_p : ()I
    //   542: invokespecial <init> : (III)V
    //   545: astore #11
    //   547: aload #9
    //   549: getstatic net/minecraft/util/EnumFacing.NORTH : Lnet/minecraft/util/EnumFacing;
    //   552: if_acmpne -> 565
    //   555: aload #11
    //   557: invokevirtual func_177978_c : ()Lnet/minecraft/util/math/BlockPos;
    //   560: astore #11
    //   562: goto -> 572
    //   565: aload #11
    //   567: invokevirtual func_177968_d : ()Lnet/minecraft/util/math/BlockPos;
    //   570: astore #11
    //   572: aload #8
    //   574: aload #11
    //   576: invokevirtual func_177977_b : ()Lnet/minecraft/util/math/BlockPos;
    //   579: invokeinterface add : (Ljava/lang/Object;)Z
    //   584: pop
    //   585: aload #8
    //   587: aload #11
    //   589: invokevirtual func_177977_b : ()Lnet/minecraft/util/math/BlockPos;
    //   592: invokevirtual func_177974_f : ()Lnet/minecraft/util/math/BlockPos;
    //   595: invokeinterface add : (Ljava/lang/Object;)Z
    //   600: pop
    //   601: aload #8
    //   603: aload #11
    //   605: invokevirtual func_177977_b : ()Lnet/minecraft/util/math/BlockPos;
    //   608: invokevirtual func_177976_e : ()Lnet/minecraft/util/math/BlockPos;
    //   611: invokeinterface add : (Ljava/lang/Object;)Z
    //   616: pop
    //   617: aload #8
    //   619: aload #11
    //   621: invokeinterface add : (Ljava/lang/Object;)Z
    //   626: pop
    //   627: aload #8
    //   629: aload #11
    //   631: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   634: invokeinterface add : (Ljava/lang/Object;)Z
    //   639: pop
    //   640: aload #8
    //   642: aload #11
    //   644: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   647: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   650: invokeinterface add : (Ljava/lang/Object;)Z
    //   655: pop
    //   656: aload #8
    //   658: aload #11
    //   660: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   663: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   666: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   669: invokeinterface add : (Ljava/lang/Object;)Z
    //   674: pop
    //   675: aload #8
    //   677: aload #11
    //   679: invokevirtual func_177976_e : ()Lnet/minecraft/util/math/BlockPos;
    //   682: invokeinterface add : (Ljava/lang/Object;)Z
    //   687: pop
    //   688: aload #8
    //   690: aload #11
    //   692: invokevirtual func_177976_e : ()Lnet/minecraft/util/math/BlockPos;
    //   695: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   698: invokeinterface add : (Ljava/lang/Object;)Z
    //   703: pop
    //   704: aload #8
    //   706: aload #11
    //   708: invokevirtual func_177976_e : ()Lnet/minecraft/util/math/BlockPos;
    //   711: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   714: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   717: invokeinterface add : (Ljava/lang/Object;)Z
    //   722: pop
    //   723: aload #8
    //   725: aload #11
    //   727: invokevirtual func_177976_e : ()Lnet/minecraft/util/math/BlockPos;
    //   730: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   733: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   736: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   739: invokeinterface add : (Ljava/lang/Object;)Z
    //   744: pop
    //   745: aload #8
    //   747: aload #11
    //   749: invokevirtual func_177976_e : ()Lnet/minecraft/util/math/BlockPos;
    //   752: invokevirtual func_177976_e : ()Lnet/minecraft/util/math/BlockPos;
    //   755: invokeinterface add : (Ljava/lang/Object;)Z
    //   760: pop
    //   761: aload #8
    //   763: aload #11
    //   765: invokevirtual func_177976_e : ()Lnet/minecraft/util/math/BlockPos;
    //   768: invokevirtual func_177976_e : ()Lnet/minecraft/util/math/BlockPos;
    //   771: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   774: invokeinterface add : (Ljava/lang/Object;)Z
    //   779: pop
    //   780: aload #8
    //   782: aload #11
    //   784: invokevirtual func_177976_e : ()Lnet/minecraft/util/math/BlockPos;
    //   787: invokevirtual func_177976_e : ()Lnet/minecraft/util/math/BlockPos;
    //   790: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   793: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   796: invokeinterface add : (Ljava/lang/Object;)Z
    //   801: pop
    //   802: aload #8
    //   804: aload #11
    //   806: invokevirtual func_177974_f : ()Lnet/minecraft/util/math/BlockPos;
    //   809: invokeinterface add : (Ljava/lang/Object;)Z
    //   814: pop
    //   815: aload #8
    //   817: aload #11
    //   819: invokevirtual func_177974_f : ()Lnet/minecraft/util/math/BlockPos;
    //   822: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   825: invokeinterface add : (Ljava/lang/Object;)Z
    //   830: pop
    //   831: aload #8
    //   833: aload #11
    //   835: invokevirtual func_177974_f : ()Lnet/minecraft/util/math/BlockPos;
    //   838: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   841: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   844: invokeinterface add : (Ljava/lang/Object;)Z
    //   849: pop
    //   850: aload #8
    //   852: aload #11
    //   854: invokevirtual func_177974_f : ()Lnet/minecraft/util/math/BlockPos;
    //   857: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   860: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   863: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   866: invokeinterface add : (Ljava/lang/Object;)Z
    //   871: pop
    //   872: aload #8
    //   874: aload #11
    //   876: invokevirtual func_177974_f : ()Lnet/minecraft/util/math/BlockPos;
    //   879: invokevirtual func_177974_f : ()Lnet/minecraft/util/math/BlockPos;
    //   882: invokeinterface add : (Ljava/lang/Object;)Z
    //   887: pop
    //   888: aload #8
    //   890: aload #11
    //   892: invokevirtual func_177974_f : ()Lnet/minecraft/util/math/BlockPos;
    //   895: invokevirtual func_177974_f : ()Lnet/minecraft/util/math/BlockPos;
    //   898: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   901: invokeinterface add : (Ljava/lang/Object;)Z
    //   906: pop
    //   907: aload #8
    //   909: aload #11
    //   911: invokevirtual func_177974_f : ()Lnet/minecraft/util/math/BlockPos;
    //   914: invokevirtual func_177974_f : ()Lnet/minecraft/util/math/BlockPos;
    //   917: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   920: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   923: invokeinterface add : (Ljava/lang/Object;)Z
    //   928: pop
    //   929: goto -> 1347
    //   932: new net/minecraft/util/math/BlockPos
    //   935: dup
    //   936: aload #7
    //   938: iconst_0
    //   939: invokeinterface get : (I)Ljava/lang/Object;
    //   944: checkcast net/minecraft/util/math/BlockPos
    //   947: invokevirtual func_177958_n : ()I
    //   950: aload #10
    //   952: invokevirtual func_177956_o : ()I
    //   955: aload #10
    //   957: invokevirtual func_177952_p : ()I
    //   960: invokespecial <init> : (III)V
    //   963: astore #11
    //   965: aload #9
    //   967: getstatic net/minecraft/util/EnumFacing.EAST : Lnet/minecraft/util/EnumFacing;
    //   970: if_acmpne -> 983
    //   973: aload #11
    //   975: invokevirtual func_177974_f : ()Lnet/minecraft/util/math/BlockPos;
    //   978: astore #11
    //   980: goto -> 990
    //   983: aload #11
    //   985: invokevirtual func_177976_e : ()Lnet/minecraft/util/math/BlockPos;
    //   988: astore #11
    //   990: aload #8
    //   992: aload #11
    //   994: invokevirtual func_177977_b : ()Lnet/minecraft/util/math/BlockPos;
    //   997: invokeinterface add : (Ljava/lang/Object;)Z
    //   1002: pop
    //   1003: aload #8
    //   1005: aload #11
    //   1007: invokevirtual func_177977_b : ()Lnet/minecraft/util/math/BlockPos;
    //   1010: invokevirtual func_177978_c : ()Lnet/minecraft/util/math/BlockPos;
    //   1013: invokeinterface add : (Ljava/lang/Object;)Z
    //   1018: pop
    //   1019: aload #8
    //   1021: aload #11
    //   1023: invokevirtual func_177977_b : ()Lnet/minecraft/util/math/BlockPos;
    //   1026: invokevirtual func_177968_d : ()Lnet/minecraft/util/math/BlockPos;
    //   1029: invokeinterface add : (Ljava/lang/Object;)Z
    //   1034: pop
    //   1035: aload #8
    //   1037: aload #11
    //   1039: invokeinterface add : (Ljava/lang/Object;)Z
    //   1044: pop
    //   1045: aload #8
    //   1047: aload #11
    //   1049: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   1052: invokeinterface add : (Ljava/lang/Object;)Z
    //   1057: pop
    //   1058: aload #8
    //   1060: aload #11
    //   1062: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   1065: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   1068: invokeinterface add : (Ljava/lang/Object;)Z
    //   1073: pop
    //   1074: aload #8
    //   1076: aload #11
    //   1078: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   1081: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   1084: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   1087: invokeinterface add : (Ljava/lang/Object;)Z
    //   1092: pop
    //   1093: aload #8
    //   1095: aload #11
    //   1097: invokevirtual func_177968_d : ()Lnet/minecraft/util/math/BlockPos;
    //   1100: invokeinterface add : (Ljava/lang/Object;)Z
    //   1105: pop
    //   1106: aload #8
    //   1108: aload #11
    //   1110: invokevirtual func_177968_d : ()Lnet/minecraft/util/math/BlockPos;
    //   1113: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   1116: invokeinterface add : (Ljava/lang/Object;)Z
    //   1121: pop
    //   1122: aload #8
    //   1124: aload #11
    //   1126: invokevirtual func_177968_d : ()Lnet/minecraft/util/math/BlockPos;
    //   1129: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   1132: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   1135: invokeinterface add : (Ljava/lang/Object;)Z
    //   1140: pop
    //   1141: aload #8
    //   1143: aload #11
    //   1145: invokevirtual func_177968_d : ()Lnet/minecraft/util/math/BlockPos;
    //   1148: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   1151: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   1154: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   1157: invokeinterface add : (Ljava/lang/Object;)Z
    //   1162: pop
    //   1163: aload #8
    //   1165: aload #11
    //   1167: invokevirtual func_177968_d : ()Lnet/minecraft/util/math/BlockPos;
    //   1170: invokevirtual func_177968_d : ()Lnet/minecraft/util/math/BlockPos;
    //   1173: invokeinterface add : (Ljava/lang/Object;)Z
    //   1178: pop
    //   1179: aload #8
    //   1181: aload #11
    //   1183: invokevirtual func_177968_d : ()Lnet/minecraft/util/math/BlockPos;
    //   1186: invokevirtual func_177968_d : ()Lnet/minecraft/util/math/BlockPos;
    //   1189: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   1192: invokeinterface add : (Ljava/lang/Object;)Z
    //   1197: pop
    //   1198: aload #8
    //   1200: aload #11
    //   1202: invokevirtual func_177968_d : ()Lnet/minecraft/util/math/BlockPos;
    //   1205: invokevirtual func_177968_d : ()Lnet/minecraft/util/math/BlockPos;
    //   1208: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   1211: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   1214: invokeinterface add : (Ljava/lang/Object;)Z
    //   1219: pop
    //   1220: aload #8
    //   1222: aload #11
    //   1224: invokevirtual func_177978_c : ()Lnet/minecraft/util/math/BlockPos;
    //   1227: invokeinterface add : (Ljava/lang/Object;)Z
    //   1232: pop
    //   1233: aload #8
    //   1235: aload #11
    //   1237: invokevirtual func_177978_c : ()Lnet/minecraft/util/math/BlockPos;
    //   1240: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   1243: invokeinterface add : (Ljava/lang/Object;)Z
    //   1248: pop
    //   1249: aload #8
    //   1251: aload #11
    //   1253: invokevirtual func_177978_c : ()Lnet/minecraft/util/math/BlockPos;
    //   1256: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   1259: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   1262: invokeinterface add : (Ljava/lang/Object;)Z
    //   1267: pop
    //   1268: aload #8
    //   1270: aload #11
    //   1272: invokevirtual func_177978_c : ()Lnet/minecraft/util/math/BlockPos;
    //   1275: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   1278: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   1281: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   1284: invokeinterface add : (Ljava/lang/Object;)Z
    //   1289: pop
    //   1290: aload #8
    //   1292: aload #11
    //   1294: invokevirtual func_177978_c : ()Lnet/minecraft/util/math/BlockPos;
    //   1297: invokevirtual func_177978_c : ()Lnet/minecraft/util/math/BlockPos;
    //   1300: invokeinterface add : (Ljava/lang/Object;)Z
    //   1305: pop
    //   1306: aload #8
    //   1308: aload #11
    //   1310: invokevirtual func_177978_c : ()Lnet/minecraft/util/math/BlockPos;
    //   1313: invokevirtual func_177978_c : ()Lnet/minecraft/util/math/BlockPos;
    //   1316: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   1319: invokeinterface add : (Ljava/lang/Object;)Z
    //   1324: pop
    //   1325: aload #8
    //   1327: aload #11
    //   1329: invokevirtual func_177978_c : ()Lnet/minecraft/util/math/BlockPos;
    //   1332: invokevirtual func_177978_c : ()Lnet/minecraft/util/math/BlockPos;
    //   1335: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   1338: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   1341: invokeinterface add : (Ljava/lang/Object;)Z
    //   1346: pop
    //   1347: new java/util/HashSet
    //   1350: dup
    //   1351: invokespecial <init> : ()V
    //   1354: astore #12
    //   1356: aload #8
    //   1358: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1363: astore #13
    //   1365: aload #13
    //   1367: invokeinterface hasNext : ()Z
    //   1372: ifeq -> 1461
    //   1375: aload #13
    //   1377: invokeinterface next : ()Ljava/lang/Object;
    //   1382: checkcast net/minecraft/util/math/BlockPos
    //   1385: astore #14
    //   1387: aload_0
    //   1388: getfield field_70170_p : Lnet/minecraft/world/World;
    //   1391: aload #14
    //   1393: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   1396: invokeinterface func_185904_a : ()Lnet/minecraft/block/material/Material;
    //   1401: invokevirtual func_76224_d : ()Z
    //   1404: ifeq -> 1458
    //   1407: aload_0
    //   1408: getfield field_70170_p : Lnet/minecraft/world/World;
    //   1411: aload #14
    //   1413: getstatic net/minecraft/init/Blocks.field_150347_e : Lnet/minecraft/block/Block;
    //   1416: invokevirtual func_176223_P : ()Lnet/minecraft/block/state/IBlockState;
    //   1419: iconst_2
    //   1420: invokevirtual func_180501_a : (Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;I)Z
    //   1423: pop
    //   1424: aload #7
    //   1426: aload #14
    //   1428: invokeinterface contains : (Ljava/lang/Object;)Z
    //   1433: ifeq -> 1458
    //   1436: goto -> 1443
    //   1439: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1442: athrow
    //   1443: aload #12
    //   1445: aload #14
    //   1447: invokevirtual add : (Ljava/lang/Object;)Z
    //   1450: pop
    //   1451: goto -> 1458
    //   1454: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1457: athrow
    //   1458: goto -> 1365
    //   1461: aload #12
    //   1463: invokevirtual isEmpty : ()Z
    //   1466: ifne -> 1514
    //   1469: aload_1
    //   1470: aload #12
    //   1472: invokevirtual a : (Ljava/util/HashSet;)V
    //   1475: aload_0
    //   1476: invokevirtual l : ()Lnet/minecraft/entity/player/EntityPlayer;
    //   1479: astore #13
    //   1481: aload #13
    //   1483: ifnull -> 1514
    //   1486: getstatic com/schnurritv/sexmod/aV.a : Lnet/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper;
    //   1489: new com/schnurritv/sexmod/B
    //   1492: dup
    //   1493: aload #12
    //   1495: iconst_1
    //   1496: invokespecial <init> : (Ljava/util/HashSet;Z)V
    //   1499: aload #13
    //   1501: checkcast net/minecraft/entity/player/EntityPlayerMP
    //   1504: invokevirtual sendTo : (Lnet/minecraftforge/fml/common/network/simpleimpl/IMessage;Lnet/minecraft/entity/player/EntityPlayerMP;)V
    //   1507: goto -> 1514
    //   1510: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1513: athrow
    //   1514: aload #8
    //   1516: invokeinterface clear : ()V
    //   1521: aload #8
    //   1523: aload #11
    //   1525: invokevirtual func_177977_b : ()Lnet/minecraft/util/math/BlockPos;
    //   1528: invokeinterface add : (Ljava/lang/Object;)Z
    //   1533: pop
    //   1534: aload #9
    //   1536: invokevirtual func_176740_k : ()Lnet/minecraft/util/EnumFacing$Axis;
    //   1539: getstatic net/minecraft/util/EnumFacing$Axis.Z : Lnet/minecraft/util/EnumFacing$Axis;
    //   1542: if_acmpne -> 1584
    //   1545: aload #8
    //   1547: aload #11
    //   1549: invokevirtual func_177977_b : ()Lnet/minecraft/util/math/BlockPos;
    //   1552: invokevirtual func_177976_e : ()Lnet/minecraft/util/math/BlockPos;
    //   1555: invokeinterface add : (Ljava/lang/Object;)Z
    //   1560: pop
    //   1561: aload #8
    //   1563: aload #11
    //   1565: invokevirtual func_177977_b : ()Lnet/minecraft/util/math/BlockPos;
    //   1568: invokevirtual func_177974_f : ()Lnet/minecraft/util/math/BlockPos;
    //   1571: invokeinterface add : (Ljava/lang/Object;)Z
    //   1576: pop
    //   1577: goto -> 1616
    //   1580: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1583: athrow
    //   1584: aload #8
    //   1586: aload #11
    //   1588: invokevirtual func_177977_b : ()Lnet/minecraft/util/math/BlockPos;
    //   1591: invokevirtual func_177978_c : ()Lnet/minecraft/util/math/BlockPos;
    //   1594: invokeinterface add : (Ljava/lang/Object;)Z
    //   1599: pop
    //   1600: aload #8
    //   1602: aload #11
    //   1604: invokevirtual func_177977_b : ()Lnet/minecraft/util/math/BlockPos;
    //   1607: invokevirtual func_177968_d : ()Lnet/minecraft/util/math/BlockPos;
    //   1610: invokeinterface add : (Ljava/lang/Object;)Z
    //   1615: pop
    //   1616: aload #8
    //   1618: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1623: astore #13
    //   1625: aload #13
    //   1627: invokeinterface hasNext : ()Z
    //   1632: ifeq -> 1699
    //   1635: aload #13
    //   1637: invokeinterface next : ()Ljava/lang/Object;
    //   1642: checkcast net/minecraft/util/math/BlockPos
    //   1645: astore #14
    //   1647: aload_0
    //   1648: getfield field_70170_p : Lnet/minecraft/world/World;
    //   1651: aload #14
    //   1653: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   1656: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   1661: aload_0
    //   1662: getfield field_70170_p : Lnet/minecraft/world/World;
    //   1665: aload #14
    //   1667: invokevirtual func_176205_b : (Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Z
    //   1670: ifeq -> 1696
    //   1673: aload_0
    //   1674: getfield field_70170_p : Lnet/minecraft/world/World;
    //   1677: aload #14
    //   1679: getstatic net/minecraft/init/Blocks.field_150347_e : Lnet/minecraft/block/Block;
    //   1682: invokevirtual func_176223_P : ()Lnet/minecraft/block/state/IBlockState;
    //   1685: invokevirtual func_175656_a : (Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)Z
    //   1688: pop
    //   1689: goto -> 1696
    //   1692: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1695: athrow
    //   1696: goto -> 1625
    //   1699: new java/util/HashSet
    //   1702: dup
    //   1703: invokespecial <init> : ()V
    //   1706: astore #13
    //   1708: aload #7
    //   1710: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1715: astore #14
    //   1717: aload #14
    //   1719: invokeinterface hasNext : ()Z
    //   1724: ifeq -> 1781
    //   1727: aload #14
    //   1729: invokeinterface next : ()Ljava/lang/Object;
    //   1734: checkcast net/minecraft/util/math/BlockPos
    //   1737: astore #15
    //   1739: aload_0
    //   1740: getfield field_70170_p : Lnet/minecraft/world/World;
    //   1743: aload #15
    //   1745: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   1748: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   1753: astore #16
    //   1755: aload #16
    //   1757: getstatic net/minecraft/init/Blocks.field_150350_a : Lnet/minecraft/block/Block;
    //   1760: if_acmpne -> 1778
    //   1763: aload #13
    //   1765: aload #15
    //   1767: invokevirtual add : (Ljava/lang/Object;)Z
    //   1770: pop
    //   1771: goto -> 1778
    //   1774: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1777: athrow
    //   1778: goto -> 1717
    //   1781: aload #13
    //   1783: invokevirtual isEmpty : ()Z
    //   1786: ifne -> 1860
    //   1789: aload #7
    //   1791: aload #13
    //   1793: invokeinterface removeAll : (Ljava/util/Collection;)Z
    //   1798: pop
    //   1799: aload_1
    //   1800: aload #13
    //   1802: invokevirtual b : (Ljava/util/HashSet;)V
    //   1805: aload_2
    //   1806: invokestatic n : (Ljava/util/UUID;)Ljava/util/UUID;
    //   1809: astore #14
    //   1811: aload #14
    //   1813: ifnull -> 1860
    //   1816: aload_0
    //   1817: getfield field_70170_p : Lnet/minecraft/world/World;
    //   1820: aload #14
    //   1822: invokevirtual func_152378_a : (Ljava/util/UUID;)Lnet/minecraft/entity/player/EntityPlayer;
    //   1825: astore #15
    //   1827: aload #15
    //   1829: ifnull -> 1860
    //   1832: getstatic com/schnurritv/sexmod/aV.a : Lnet/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper;
    //   1835: new com/schnurritv/sexmod/B
    //   1838: dup
    //   1839: aload #13
    //   1841: iconst_0
    //   1842: invokespecial <init> : (Ljava/util/HashSet;Z)V
    //   1845: aload #15
    //   1847: checkcast net/minecraft/entity/player/EntityPlayerMP
    //   1850: invokevirtual sendTo : (Lnet/minecraftforge/fml/common/network/simpleimpl/IMessage;Lnet/minecraft/entity/player/EntityPlayerMP;)V
    //   1853: goto -> 1860
    //   1856: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1859: athrow
    //   1860: aload #7
    //   1862: invokeinterface isEmpty : ()Z
    //   1867: ifeq -> 1881
    //   1870: aload_0
    //   1871: aload_1
    //   1872: aload_2
    //   1873: invokevirtual a : (Lcom/schnurritv/sexmod/g;Ljava/util/UUID;)Lnet/minecraft/util/math/BlockPos;
    //   1876: areturn
    //   1877: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1880: athrow
    //   1881: aconst_null
    //   1882: astore #14
    //   1884: aload_1
    //   1885: invokevirtual a : ()Ljava/util/List;
    //   1888: astore #15
    //   1890: iconst_0
    //   1891: istore #16
    //   1893: iload #16
    //   1895: aload #15
    //   1897: invokeinterface size : ()I
    //   1902: if_icmpge -> 2156
    //   1905: aload #15
    //   1907: iload #16
    //   1909: invokeinterface get : (I)Ljava/lang/Object;
    //   1914: checkcast com/schnurritv/sexmod/b3
    //   1917: invokevirtual func_145782_y : ()I
    //   1920: aload_0
    //   1921: invokevirtual func_145782_y : ()I
    //   1924: if_icmpeq -> 1941
    //   1927: goto -> 1934
    //   1930: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1933: athrow
    //   1934: goto -> 2150
    //   1937: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1940: athrow
    //   1941: iload #16
    //   1943: ifne -> 2010
    //   1946: aload_0
    //   1947: aload #7
    //   1949: iconst_m1
    //   1950: aload_1
    //   1951: invokevirtual b : ()Lnet/minecraft/util/EnumFacing;
    //   1954: aload_1
    //   1955: invokevirtual f : ()Lnet/minecraft/util/math/BlockPos;
    //   1958: invokevirtual a : (Ljava/util/List;ILnet/minecraft/util/EnumFacing;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/BlockPos;
    //   1961: astore #14
    //   1963: aload #14
    //   1965: ifnonnull -> 2156
    //   1968: aload_0
    //   1969: aload #7
    //   1971: iconst_0
    //   1972: aload_1
    //   1973: invokevirtual b : ()Lnet/minecraft/util/EnumFacing;
    //   1976: aload_1
    //   1977: invokevirtual f : ()Lnet/minecraft/util/math/BlockPos;
    //   1980: invokevirtual a : (Ljava/util/List;ILnet/minecraft/util/EnumFacing;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/BlockPos;
    //   1983: astore #14
    //   1985: aload #14
    //   1987: ifnonnull -> 2156
    //   1990: aload_0
    //   1991: aload #7
    //   1993: iconst_1
    //   1994: aload_1
    //   1995: invokevirtual b : ()Lnet/minecraft/util/EnumFacing;
    //   1998: aload_1
    //   1999: invokevirtual f : ()Lnet/minecraft/util/math/BlockPos;
    //   2002: invokevirtual a : (Ljava/util/List;ILnet/minecraft/util/EnumFacing;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/BlockPos;
    //   2005: astore #14
    //   2007: goto -> 2156
    //   2010: iload #16
    //   2012: iconst_1
    //   2013: if_icmpne -> 2080
    //   2016: aload_0
    //   2017: aload #7
    //   2019: iconst_1
    //   2020: aload_1
    //   2021: invokevirtual b : ()Lnet/minecraft/util/EnumFacing;
    //   2024: aload_1
    //   2025: invokevirtual f : ()Lnet/minecraft/util/math/BlockPos;
    //   2028: invokevirtual a : (Ljava/util/List;ILnet/minecraft/util/EnumFacing;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/BlockPos;
    //   2031: astore #14
    //   2033: aload #14
    //   2035: ifnonnull -> 2156
    //   2038: aload_0
    //   2039: aload #7
    //   2041: iconst_0
    //   2042: aload_1
    //   2043: invokevirtual b : ()Lnet/minecraft/util/EnumFacing;
    //   2046: aload_1
    //   2047: invokevirtual f : ()Lnet/minecraft/util/math/BlockPos;
    //   2050: invokevirtual a : (Ljava/util/List;ILnet/minecraft/util/EnumFacing;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/BlockPos;
    //   2053: astore #14
    //   2055: aload #14
    //   2057: ifnonnull -> 2156
    //   2060: aload_0
    //   2061: aload #7
    //   2063: iconst_m1
    //   2064: aload_1
    //   2065: invokevirtual b : ()Lnet/minecraft/util/EnumFacing;
    //   2068: aload_1
    //   2069: invokevirtual f : ()Lnet/minecraft/util/math/BlockPos;
    //   2072: invokevirtual a : (Ljava/util/List;ILnet/minecraft/util/EnumFacing;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/BlockPos;
    //   2075: astore #14
    //   2077: goto -> 2156
    //   2080: iload #16
    //   2082: iconst_2
    //   2083: if_icmpne -> 2150
    //   2086: aload_0
    //   2087: aload #7
    //   2089: iconst_0
    //   2090: aload_1
    //   2091: invokevirtual b : ()Lnet/minecraft/util/EnumFacing;
    //   2094: aload_1
    //   2095: invokevirtual f : ()Lnet/minecraft/util/math/BlockPos;
    //   2098: invokevirtual a : (Ljava/util/List;ILnet/minecraft/util/EnumFacing;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/BlockPos;
    //   2101: astore #14
    //   2103: aload #14
    //   2105: ifnonnull -> 2156
    //   2108: aload_0
    //   2109: aload #7
    //   2111: iconst_1
    //   2112: aload_1
    //   2113: invokevirtual b : ()Lnet/minecraft/util/EnumFacing;
    //   2116: aload_1
    //   2117: invokevirtual f : ()Lnet/minecraft/util/math/BlockPos;
    //   2120: invokevirtual a : (Ljava/util/List;ILnet/minecraft/util/EnumFacing;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/BlockPos;
    //   2123: astore #14
    //   2125: aload #14
    //   2127: ifnonnull -> 2156
    //   2130: aload_0
    //   2131: aload #7
    //   2133: iconst_m1
    //   2134: aload_1
    //   2135: invokevirtual b : ()Lnet/minecraft/util/EnumFacing;
    //   2138: aload_1
    //   2139: invokevirtual f : ()Lnet/minecraft/util/math/BlockPos;
    //   2142: invokevirtual a : (Ljava/util/List;ILnet/minecraft/util/EnumFacing;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/BlockPos;
    //   2145: astore #14
    //   2147: goto -> 2156
    //   2150: iinc #16, 1
    //   2153: goto -> 1893
    //   2156: aload #14
    //   2158: areturn
    // Exception table:
    //   from	to	target	type
    //   23	32	32	java/lang/RuntimeException
    //   64	109	112	java/lang/RuntimeException
    //   104	129	132	java/lang/RuntimeException
    //   159	177	180	java/lang/RuntimeException
    //   207	225	228	java/lang/RuntimeException
    //   255	273	276	java/lang/RuntimeException
    //   343	359	362	java/lang/RuntimeException
    //   351	379	382	java/lang/RuntimeException
    //   366	396	399	java/lang/RuntimeException
    //   403	419	422	java/lang/RuntimeException
    //   411	439	442	java/lang/RuntimeException
    //   426	456	459	java/lang/RuntimeException
    //   466	478	478	java/lang/RuntimeException
    //   1387	1436	1439	java/lang/RuntimeException
    //   1407	1451	1454	java/lang/RuntimeException
    //   1481	1507	1510	java/lang/RuntimeException
    //   1514	1580	1580	java/lang/RuntimeException
    //   1647	1689	1692	java/lang/RuntimeException
    //   1755	1771	1774	java/lang/RuntimeException
    //   1827	1853	1856	java/lang/RuntimeException
    //   1860	1877	1877	java/lang/RuntimeException
    //   1893	1927	1930	java/lang/RuntimeException
    //   1905	1937	1937	java/lang/RuntimeException
  }
  
  @Nullable
  BlockPos a(List<BlockPos> paramList, int paramInt, EnumFacing paramEnumFacing, BlockPos paramBlockPos) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface isEmpty : ()Z
    //   6: ifeq -> 15
    //   9: aconst_null
    //   10: areturn
    //   11: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   14: athrow
    //   15: new java/util/ArrayList
    //   18: dup
    //   19: invokespecial <init> : ()V
    //   22: astore #5
    //   24: new java/util/ArrayList
    //   27: dup
    //   28: invokespecial <init> : ()V
    //   31: astore #6
    //   33: new java/util/ArrayList
    //   36: dup
    //   37: invokespecial <init> : ()V
    //   40: astore #7
    //   42: aload_3
    //   43: getstatic net/minecraft/util/EnumFacing.SOUTH : Lnet/minecraft/util/EnumFacing;
    //   46: if_acmpeq -> 63
    //   49: aload_3
    //   50: getstatic net/minecraft/util/EnumFacing.WEST : Lnet/minecraft/util/EnumFacing;
    //   53: if_acmpne -> 71
    //   56: goto -> 63
    //   59: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   62: athrow
    //   63: iconst_m1
    //   64: goto -> 72
    //   67: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   70: athrow
    //   71: iconst_1
    //   72: istore #8
    //   74: aload_3
    //   75: invokevirtual func_176740_k : ()Lnet/minecraft/util/EnumFacing$Axis;
    //   78: getstatic net/minecraft/util/EnumFacing$Axis.Z : Lnet/minecraft/util/EnumFacing$Axis;
    //   81: if_acmpne -> 498
    //   84: new net/minecraft/util/math/BlockPos
    //   87: dup
    //   88: aload #4
    //   90: invokevirtual func_177958_n : ()I
    //   93: aload #4
    //   95: invokevirtual func_177956_o : ()I
    //   98: aload_1
    //   99: iconst_0
    //   100: invokeinterface get : (I)Ljava/lang/Object;
    //   105: checkcast net/minecraft/util/math/BlockPos
    //   108: invokevirtual func_177952_p : ()I
    //   111: invokespecial <init> : (III)V
    //   114: astore #9
    //   116: aload #7
    //   118: aload #9
    //   120: invokeinterface add : (Ljava/lang/Object;)Z
    //   125: pop
    //   126: aload #7
    //   128: aload #9
    //   130: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   133: invokeinterface add : (Ljava/lang/Object;)Z
    //   138: pop
    //   139: aload #7
    //   141: aload #9
    //   143: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   146: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   149: invokeinterface add : (Ljava/lang/Object;)Z
    //   154: pop
    //   155: aload #7
    //   157: aload #9
    //   159: invokevirtual func_177976_e : ()Lnet/minecraft/util/math/BlockPos;
    //   162: invokeinterface add : (Ljava/lang/Object;)Z
    //   167: pop
    //   168: aload #7
    //   170: aload #9
    //   172: invokevirtual func_177976_e : ()Lnet/minecraft/util/math/BlockPos;
    //   175: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   178: invokeinterface add : (Ljava/lang/Object;)Z
    //   183: pop
    //   184: aload #7
    //   186: aload #9
    //   188: invokevirtual func_177976_e : ()Lnet/minecraft/util/math/BlockPos;
    //   191: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   194: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   197: invokeinterface add : (Ljava/lang/Object;)Z
    //   202: pop
    //   203: aload #7
    //   205: aload #9
    //   207: invokevirtual func_177974_f : ()Lnet/minecraft/util/math/BlockPos;
    //   210: invokeinterface add : (Ljava/lang/Object;)Z
    //   215: pop
    //   216: aload #7
    //   218: aload #9
    //   220: invokevirtual func_177974_f : ()Lnet/minecraft/util/math/BlockPos;
    //   223: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   226: invokeinterface add : (Ljava/lang/Object;)Z
    //   231: pop
    //   232: aload #7
    //   234: aload #9
    //   236: invokevirtual func_177974_f : ()Lnet/minecraft/util/math/BlockPos;
    //   239: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   242: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   245: invokeinterface add : (Ljava/lang/Object;)Z
    //   250: pop
    //   251: iload_2
    //   252: ifne -> 383
    //   255: aload #7
    //   257: invokeinterface iterator : ()Ljava/util/Iterator;
    //   262: astore #10
    //   264: aload #10
    //   266: invokeinterface hasNext : ()Z
    //   271: ifeq -> 318
    //   274: aload #10
    //   276: invokeinterface next : ()Ljava/lang/Object;
    //   281: checkcast net/minecraft/util/math/BlockPos
    //   284: astore #11
    //   286: aload #6
    //   288: aload #11
    //   290: iconst_2
    //   291: invokevirtual func_177965_g : (I)Lnet/minecraft/util/math/BlockPos;
    //   294: invokeinterface add : (Ljava/lang/Object;)Z
    //   299: pop
    //   300: aload #6
    //   302: aload #11
    //   304: bipush #-2
    //   306: invokevirtual func_177965_g : (I)Lnet/minecraft/util/math/BlockPos;
    //   309: invokeinterface add : (Ljava/lang/Object;)Z
    //   314: pop
    //   315: goto -> 264
    //   318: aload_1
    //   319: invokeinterface iterator : ()Ljava/util/Iterator;
    //   324: astore #10
    //   326: aload #10
    //   328: invokeinterface hasNext : ()Z
    //   333: ifeq -> 380
    //   336: aload #10
    //   338: invokeinterface next : ()Ljava/lang/Object;
    //   343: checkcast net/minecraft/util/math/BlockPos
    //   346: astore #11
    //   348: aload #6
    //   350: aload #11
    //   352: invokeinterface contains : (Ljava/lang/Object;)Z
    //   357: ifne -> 377
    //   360: aload #5
    //   362: aload #11
    //   364: invokeinterface add : (Ljava/lang/Object;)Z
    //   369: pop
    //   370: goto -> 377
    //   373: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   376: athrow
    //   377: goto -> 326
    //   380: goto -> 498
    //   383: aload #7
    //   385: invokeinterface iterator : ()Ljava/util/Iterator;
    //   390: astore #10
    //   392: aload #10
    //   394: invokeinterface hasNext : ()Z
    //   399: ifeq -> 436
    //   402: aload #10
    //   404: invokeinterface next : ()Ljava/lang/Object;
    //   409: checkcast net/minecraft/util/math/BlockPos
    //   412: astore #11
    //   414: aload #6
    //   416: aload #11
    //   418: iload #8
    //   420: iconst_2
    //   421: imul
    //   422: iload_2
    //   423: imul
    //   424: invokevirtual func_177965_g : (I)Lnet/minecraft/util/math/BlockPos;
    //   427: invokeinterface add : (Ljava/lang/Object;)Z
    //   432: pop
    //   433: goto -> 392
    //   436: aload #6
    //   438: invokeinterface iterator : ()Ljava/util/Iterator;
    //   443: astore #10
    //   445: aload #10
    //   447: invokeinterface hasNext : ()Z
    //   452: ifeq -> 498
    //   455: aload #10
    //   457: invokeinterface next : ()Ljava/lang/Object;
    //   462: checkcast net/minecraft/util/math/BlockPos
    //   465: astore #11
    //   467: aload_1
    //   468: aload #11
    //   470: invokeinterface contains : (Ljava/lang/Object;)Z
    //   475: ifeq -> 495
    //   478: aload #5
    //   480: aload #11
    //   482: invokeinterface add : (Ljava/lang/Object;)Z
    //   487: pop
    //   488: goto -> 495
    //   491: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   494: athrow
    //   495: goto -> 445
    //   498: aload_3
    //   499: invokevirtual func_176740_k : ()Lnet/minecraft/util/EnumFacing$Axis;
    //   502: getstatic net/minecraft/util/EnumFacing$Axis.X : Lnet/minecraft/util/EnumFacing$Axis;
    //   505: if_acmpne -> 922
    //   508: new net/minecraft/util/math/BlockPos
    //   511: dup
    //   512: aload_1
    //   513: iconst_0
    //   514: invokeinterface get : (I)Ljava/lang/Object;
    //   519: checkcast net/minecraft/util/math/BlockPos
    //   522: invokevirtual func_177958_n : ()I
    //   525: aload #4
    //   527: invokevirtual func_177956_o : ()I
    //   530: aload #4
    //   532: invokevirtual func_177952_p : ()I
    //   535: invokespecial <init> : (III)V
    //   538: astore #9
    //   540: aload #7
    //   542: aload #9
    //   544: invokeinterface add : (Ljava/lang/Object;)Z
    //   549: pop
    //   550: aload #7
    //   552: aload #9
    //   554: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   557: invokeinterface add : (Ljava/lang/Object;)Z
    //   562: pop
    //   563: aload #7
    //   565: aload #9
    //   567: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   570: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   573: invokeinterface add : (Ljava/lang/Object;)Z
    //   578: pop
    //   579: aload #7
    //   581: aload #9
    //   583: invokevirtual func_177978_c : ()Lnet/minecraft/util/math/BlockPos;
    //   586: invokeinterface add : (Ljava/lang/Object;)Z
    //   591: pop
    //   592: aload #7
    //   594: aload #9
    //   596: invokevirtual func_177978_c : ()Lnet/minecraft/util/math/BlockPos;
    //   599: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   602: invokeinterface add : (Ljava/lang/Object;)Z
    //   607: pop
    //   608: aload #7
    //   610: aload #9
    //   612: invokevirtual func_177978_c : ()Lnet/minecraft/util/math/BlockPos;
    //   615: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   618: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   621: invokeinterface add : (Ljava/lang/Object;)Z
    //   626: pop
    //   627: aload #7
    //   629: aload #9
    //   631: invokevirtual func_177968_d : ()Lnet/minecraft/util/math/BlockPos;
    //   634: invokeinterface add : (Ljava/lang/Object;)Z
    //   639: pop
    //   640: aload #7
    //   642: aload #9
    //   644: invokevirtual func_177968_d : ()Lnet/minecraft/util/math/BlockPos;
    //   647: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   650: invokeinterface add : (Ljava/lang/Object;)Z
    //   655: pop
    //   656: aload #7
    //   658: aload #9
    //   660: invokevirtual func_177968_d : ()Lnet/minecraft/util/math/BlockPos;
    //   663: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   666: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   669: invokeinterface add : (Ljava/lang/Object;)Z
    //   674: pop
    //   675: iload_2
    //   676: ifne -> 807
    //   679: aload #7
    //   681: invokeinterface iterator : ()Ljava/util/Iterator;
    //   686: astore #10
    //   688: aload #10
    //   690: invokeinterface hasNext : ()Z
    //   695: ifeq -> 742
    //   698: aload #10
    //   700: invokeinterface next : ()Ljava/lang/Object;
    //   705: checkcast net/minecraft/util/math/BlockPos
    //   708: astore #11
    //   710: aload #6
    //   712: aload #11
    //   714: iconst_2
    //   715: invokevirtual func_177970_e : (I)Lnet/minecraft/util/math/BlockPos;
    //   718: invokeinterface add : (Ljava/lang/Object;)Z
    //   723: pop
    //   724: aload #6
    //   726: aload #11
    //   728: bipush #-2
    //   730: invokevirtual func_177970_e : (I)Lnet/minecraft/util/math/BlockPos;
    //   733: invokeinterface add : (Ljava/lang/Object;)Z
    //   738: pop
    //   739: goto -> 688
    //   742: aload_1
    //   743: invokeinterface iterator : ()Ljava/util/Iterator;
    //   748: astore #10
    //   750: aload #10
    //   752: invokeinterface hasNext : ()Z
    //   757: ifeq -> 804
    //   760: aload #10
    //   762: invokeinterface next : ()Ljava/lang/Object;
    //   767: checkcast net/minecraft/util/math/BlockPos
    //   770: astore #11
    //   772: aload #6
    //   774: aload #11
    //   776: invokeinterface contains : (Ljava/lang/Object;)Z
    //   781: ifne -> 801
    //   784: aload #5
    //   786: aload #11
    //   788: invokeinterface add : (Ljava/lang/Object;)Z
    //   793: pop
    //   794: goto -> 801
    //   797: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   800: athrow
    //   801: goto -> 750
    //   804: goto -> 922
    //   807: aload #7
    //   809: invokeinterface iterator : ()Ljava/util/Iterator;
    //   814: astore #10
    //   816: aload #10
    //   818: invokeinterface hasNext : ()Z
    //   823: ifeq -> 860
    //   826: aload #10
    //   828: invokeinterface next : ()Ljava/lang/Object;
    //   833: checkcast net/minecraft/util/math/BlockPos
    //   836: astore #11
    //   838: aload #6
    //   840: aload #11
    //   842: iload #8
    //   844: iconst_2
    //   845: imul
    //   846: iload_2
    //   847: imul
    //   848: invokevirtual func_177970_e : (I)Lnet/minecraft/util/math/BlockPos;
    //   851: invokeinterface add : (Ljava/lang/Object;)Z
    //   856: pop
    //   857: goto -> 816
    //   860: aload #6
    //   862: invokeinterface iterator : ()Ljava/util/Iterator;
    //   867: astore #10
    //   869: aload #10
    //   871: invokeinterface hasNext : ()Z
    //   876: ifeq -> 922
    //   879: aload #10
    //   881: invokeinterface next : ()Ljava/lang/Object;
    //   886: checkcast net/minecraft/util/math/BlockPos
    //   889: astore #11
    //   891: aload_1
    //   892: aload #11
    //   894: invokeinterface contains : (Ljava/lang/Object;)Z
    //   899: ifeq -> 919
    //   902: aload #5
    //   904: aload #11
    //   906: invokeinterface add : (Ljava/lang/Object;)Z
    //   911: pop
    //   912: goto -> 919
    //   915: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   918: athrow
    //   919: goto -> 869
    //   922: aload #5
    //   924: invokeinterface isEmpty : ()Z
    //   929: ifeq -> 938
    //   932: aconst_null
    //   933: areturn
    //   934: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   937: athrow
    //   938: aload #5
    //   940: aload_0
    //   941: invokevirtual func_70681_au : ()Ljava/util/Random;
    //   944: aload #5
    //   946: invokeinterface size : ()I
    //   951: invokevirtual nextInt : (I)I
    //   954: invokeinterface get : (I)Ljava/lang/Object;
    //   959: checkcast net/minecraft/util/math/BlockPos
    //   962: areturn
    // Exception table:
    //   from	to	target	type
    //   0	11	11	java/lang/RuntimeException
    //   42	56	59	java/lang/RuntimeException
    //   49	67	67	java/lang/RuntimeException
    //   348	370	373	java/lang/RuntimeException
    //   467	488	491	java/lang/RuntimeException
    //   772	794	797	java/lang/RuntimeException
    //   891	912	915	java/lang/RuntimeException
    //   922	934	934	java/lang/RuntimeException
  }
  
  void k(UUID paramUUID) {
    try {
      if (b(paramUUID, false))
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    n();
  }
  
  void n() {
    // Byte code:
    //   0: aload_0
    //   1: getfield field_70170_p : Lnet/minecraft/world/World;
    //   4: aload_0
    //   5: ldc2_w 15.0
    //   8: invokevirtual func_72890_a : (Lnet/minecraft/entity/Entity;D)Lnet/minecraft/entity/player/EntityPlayer;
    //   11: astore_1
    //   12: aload_0
    //   13: invokevirtual O : ()Z
    //   16: ifeq -> 92
    //   19: aload_1
    //   20: ifnull -> 92
    //   23: goto -> 30
    //   26: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   29: athrow
    //   30: aload_1
    //   31: aload_0
    //   32: invokevirtual func_70032_d : (Lnet/minecraft/entity/Entity;)F
    //   35: fconst_2
    //   36: fcmpg
    //   37: ifge -> 92
    //   40: goto -> 47
    //   43: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   46: athrow
    //   47: aload_0
    //   48: getfield p : Lnet/minecraft/network/datasync/EntityDataManager;
    //   51: getstatic com/schnurritv/sexmod/b3.b : Lnet/minecraft/network/datasync/DataParameter;
    //   54: invokevirtual func_187225_a : (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
    //   57: checkcast java/lang/String
    //   60: aload_1
    //   61: invokevirtual getPersistentID : ()Ljava/util/UUID;
    //   64: invokevirtual toString : ()Ljava/lang/String;
    //   67: invokevirtual equals : (Ljava/lang/Object;)Z
    //   70: ifeq -> 92
    //   73: goto -> 80
    //   76: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   79: athrow
    //   80: aload_0
    //   81: invokevirtual func_70661_as : ()Lnet/minecraft/pathfinding/PathNavigate;
    //   84: invokevirtual func_75499_g : ()V
    //   87: return
    //   88: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   91: athrow
    //   92: aload_0
    //   93: getfield ag : Lnet/minecraft/util/math/BlockPos;
    //   96: ifnull -> 158
    //   99: aload_0
    //   100: aload_0
    //   101: getfield ag : Lnet/minecraft/util/math/BlockPos;
    //   104: invokevirtual func_177958_n : ()I
    //   107: i2d
    //   108: aload_0
    //   109: getfield ag : Lnet/minecraft/util/math/BlockPos;
    //   112: invokevirtual func_177956_o : ()I
    //   115: i2d
    //   116: aload_0
    //   117: getfield ag : Lnet/minecraft/util/math/BlockPos;
    //   120: invokevirtual func_177952_p : ()I
    //   123: i2d
    //   124: invokevirtual func_70011_f : (DDD)D
    //   127: aload_0
    //   128: invokevirtual h : ()D
    //   131: dcmpl
    //   132: ifgt -> 158
    //   135: goto -> 142
    //   138: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   141: athrow
    //   142: aload_0
    //   143: getfield X : I
    //   146: bipush #100
    //   148: if_icmple -> 286
    //   151: goto -> 158
    //   154: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   157: athrow
    //   158: aload_0
    //   159: invokevirtual func_70681_au : ()Ljava/util/Random;
    //   162: invokevirtual nextBoolean : ()Z
    //   165: ifeq -> 183
    //   168: goto -> 175
    //   171: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   174: athrow
    //   175: iconst_1
    //   176: goto -> 184
    //   179: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   182: athrow
    //   183: iconst_m1
    //   184: aload_0
    //   185: invokevirtual func_70681_au : ()Ljava/util/Random;
    //   188: iconst_5
    //   189: invokevirtual nextInt : (I)I
    //   192: imul
    //   193: istore_2
    //   194: aload_0
    //   195: invokevirtual func_70681_au : ()Ljava/util/Random;
    //   198: invokevirtual nextBoolean : ()Z
    //   201: ifeq -> 212
    //   204: iconst_1
    //   205: goto -> 213
    //   208: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   211: athrow
    //   212: iconst_m1
    //   213: aload_0
    //   214: invokevirtual func_70681_au : ()Ljava/util/Random;
    //   217: iconst_5
    //   218: invokevirtual nextInt : (I)I
    //   221: imul
    //   222: istore_3
    //   223: aload_0
    //   224: getfield field_70170_p : Lnet/minecraft/world/World;
    //   227: aload_0
    //   228: invokevirtual func_180425_c : ()Lnet/minecraft/util/math/BlockPos;
    //   231: invokevirtual func_177958_n : ()I
    //   234: iload_2
    //   235: iadd
    //   236: aload_0
    //   237: invokevirtual func_180425_c : ()Lnet/minecraft/util/math/BlockPos;
    //   240: invokevirtual func_177952_p : ()I
    //   243: iload_3
    //   244: iadd
    //   245: invokestatic a : (Lnet/minecraft/world/World;II)I
    //   248: istore #4
    //   250: aload_0
    //   251: new net/minecraft/util/math/BlockPos
    //   254: dup
    //   255: aload_0
    //   256: invokevirtual func_180425_c : ()Lnet/minecraft/util/math/BlockPos;
    //   259: invokevirtual func_177958_n : ()I
    //   262: iload_2
    //   263: iadd
    //   264: iload #4
    //   266: aload_0
    //   267: invokevirtual func_180425_c : ()Lnet/minecraft/util/math/BlockPos;
    //   270: invokevirtual func_177952_p : ()I
    //   273: iload_3
    //   274: iadd
    //   275: invokespecial <init> : (III)V
    //   278: putfield ag : Lnet/minecraft/util/math/BlockPos;
    //   281: aload_0
    //   282: iconst_0
    //   283: putfield X : I
    //   286: aload_0
    //   287: getfield ag : Lnet/minecraft/util/math/BlockPos;
    //   290: aload_0
    //   291: invokevirtual func_180425_c : ()Lnet/minecraft/util/math/BlockPos;
    //   294: invokevirtual func_177951_i : (Lnet/minecraft/util/math/Vec3i;)D
    //   297: invokestatic sqrt : (D)D
    //   300: ldc2_w 2.0
    //   303: dcmpl
    //   304: ifle -> 353
    //   307: aload_0
    //   308: invokevirtual func_70661_as : ()Lnet/minecraft/pathfinding/PathNavigate;
    //   311: aload_0
    //   312: getfield ag : Lnet/minecraft/util/math/BlockPos;
    //   315: invokevirtual func_177958_n : ()I
    //   318: i2d
    //   319: aload_0
    //   320: getfield ag : Lnet/minecraft/util/math/BlockPos;
    //   323: invokevirtual func_177956_o : ()I
    //   326: i2d
    //   327: aload_0
    //   328: getfield ag : Lnet/minecraft/util/math/BlockPos;
    //   331: invokevirtual func_177952_p : ()I
    //   334: i2d
    //   335: ldc2_w 0.3499999940395355
    //   338: invokevirtual func_75492_a : (DDDD)Z
    //   341: pop
    //   342: aload_0
    //   343: invokevirtual C : ()V
    //   346: goto -> 363
    //   349: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   352: athrow
    //   353: aload_0
    //   354: dup
    //   355: getfield X : I
    //   358: iconst_1
    //   359: iadd
    //   360: putfield X : I
    //   363: return
    // Exception table:
    //   from	to	target	type
    //   12	23	26	java/lang/RuntimeException
    //   19	40	43	java/lang/RuntimeException
    //   30	73	76	java/lang/RuntimeException
    //   47	88	88	java/lang/RuntimeException
    //   92	135	138	java/lang/RuntimeException
    //   99	151	154	java/lang/RuntimeException
    //   142	168	171	java/lang/RuntimeException
    //   158	179	179	java/lang/RuntimeException
    //   194	208	208	java/lang/RuntimeException
    //   286	349	349	java/lang/RuntimeException
  }
  
  double h() {
    return Math.sqrt(800.0D);
  }
  
  boolean b(UUID paramUUID, boolean paramBoolean) {
    try {
      if (s())
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (c(paramUUID, paramBoolean)) {
        this.Q = 0;
        return true;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (--this.Q < 0)
        try {
          if (this.aj) {
            this.Q = 300;
            EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(UUID.fromString((String)this.p.func_187225_a(b)));
            EyeAndKoboldColor eyeAndKoboldColor = EyeAndKoboldColor.valueOf((String)this.p.func_187225_a(G));
            try {
              if (entityPlayer != null)
                entityPlayer.func_146105_b((ITextComponent)new TextComponentString(eyeAndKoboldColor.getTextColor() + H() + "s " + TextFormatting.WHITE + "inventory is full and there are either no chests to put her items in or said chests are full as well"), false); 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            return false;
          } 
          return false;
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  boolean c(UUID paramUUID, boolean paramBoolean) {
    HashSet<BlockPos> hashSet = s.o(paramUUID);
    try {
      if (hashSet == null)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    BlockPos blockPos = null;
    for (BlockPos blockPos1 : hashSet) {
      TileEntityChest tileEntityChest = (TileEntityChest)this.field_70170_p.func_175625_s(blockPos1);
      IItemHandler iItemHandler = tileEntityChest.getSingleChestHandler();
      boolean bool = false;
      for (byte b = 0; b < this.aF.getSlots(); b++) {
        ItemStack itemStack = this.aF.getStackInSlot(b);
        try {
          if (!itemStack.func_190926_b()) {
            for (byte b1 = 0; b1 < iItemHandler.getSlots(); b1++) {
              ItemStack itemStack1 = iItemHandler.insertItem(b1, itemStack, true);
              if (itemStack1.func_190916_E() != itemStack.func_190916_E()) {
                bool = true;
                break;
              } 
            } 
            try {
              if (bool)
                break; 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } 
      try {
        if (!bool)
          continue; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      if (blockPos == null) {
        blockPos = blockPos1;
        continue;
      } 
      if (func_174818_b(blockPos) > func_174818_b(blockPos1))
        blockPos = blockPos1; 
    } 
    try {
      if (blockPos == null)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    if (func_70011_f(blockPos.func_177958_n(), blockPos.func_177956_o(), blockPos.func_177952_p()) < 2.0D) {
      TileEntityChest tileEntityChest = (TileEntityChest)this.field_70170_p.func_175625_s(blockPos);
      IItemHandler iItemHandler = tileEntityChest.getSingleChestHandler();
      for (byte b = 0; b < this.aF.getSlots(); b++) {
        ItemStack itemStack = this.aF.getStackInSlot(b);
        try {
          if (!itemStack.func_190926_b())
            for (byte b1 = 0; b1 < iItemHandler.getSlots(); b1++) {
              ItemStack itemStack1 = iItemHandler.insertItem(b1, itemStack, false);
              try {
                if (itemStack1.func_190916_E() <= 0) {
                  this.aF.setStackInSlot(b, ItemStack.field_190927_a);
                  break;
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              this.aF.setStackInSlot(b, itemStack1);
              itemStack = itemStack1;
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } 
      this.field_70170_p.func_184133_a(null, blockPos, SoundEvents.field_187654_U, SoundCategory.BLOCKS, 1.0F, 1.0F);
      return true;
    } 
    try {
      if (Math.abs(blockPos.func_177956_o() - func_180425_c().func_177956_o()) > 4) {
        try {
          if (paramBoolean) {
            a(blockPos);
          } else {
            return false;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } else {
        PathNavigate pathNavigate = func_70661_as();
        BlockPos blockPos1 = c(blockPos);
        try {
          pathNavigate.func_75492_a(blockPos1.func_177958_n(), blockPos1.func_177956_o(), blockPos1.func_177952_p(), 0.3499999940395355D);
          if (pathNavigate.func_75505_d() == null)
            try {
              if (paramBoolean) {
                a(blockPos);
              } else {
                return false;
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
    return true;
  }
  
  boolean a(UUID paramUUID, g paramg) {
    List<b3> list = s.m(paramUUID);
    Collection<g> collection = s.j(paramUUID);
    b3 b31 = null;
    Vec3d vec3d = new Vec3d(paramg.f().func_177958_n(), paramg.f().func_177956_o(), paramg.f().func_177952_p());
    for (b3 b32 : list) {
      boolean bool = false;
      for (g g1 : collection) {
        if (g1.c(b32)) {
          bool = true;
          break;
        } 
      } 
      try {
        if (bool)
          continue; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (b32.n() != null)
          continue; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      if (b31 == null) {
        b31 = b32;
        continue;
      } 
      if (b31.func_174791_d().func_72438_d(vec3d) > b32.func_174791_d().func_72438_d(vec3d))
        b31 = b32; 
    } 
    return equals(b31);
  }
  
  void a(UUID paramUUID, g paramg, BlockPos paramBlockPos) {
    if (this.ah == null) {
      this.aE = 24;
      this.O = 0;
      c(m.NULL);
      this.p.func_187227_b(z, Boolean.valueOf(false));
      EntityPlayer entityPlayer1 = l();
      HashSet<BlockPos> hashSet1 = paramg.g();
      try {
        if (entityPlayer1 != null)
          try {
            if (!hashSet1.isEmpty())
              aV.a.sendTo(new B(hashSet1, false), (EntityPlayerMP)entityPlayer1); 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      s.b(paramUUID, this);
      return;
    } 
    try {
      switch (this.ah.func_77960_j()) {
        case 3:
        case 5:
          this.field_70170_p.func_175656_a(paramBlockPos, Blocks.field_150345_g.getStateForPlacement(this.field_70170_p, paramBlockPos, EnumFacing.NORTH, paramBlockPos.func_177958_n(), paramBlockPos.func_177956_o(), paramBlockPos.func_177952_p(), this.ah.func_77960_j(), (EntityLivingBase)this, EnumHand.MAIN_HAND));
          this.field_70170_p.func_175656_a(paramBlockPos.func_177978_c(), Blocks.field_150345_g.getStateForPlacement(this.field_70170_p, paramBlockPos.func_177978_c(), EnumFacing.NORTH, paramBlockPos.func_177958_n(), paramBlockPos.func_177956_o(), (paramBlockPos.func_177952_p() + 1), this.ah.func_77960_j(), (EntityLivingBase)this, EnumHand.MAIN_HAND));
          this.field_70170_p.func_175656_a(paramBlockPos.func_177976_e(), Blocks.field_150345_g.getStateForPlacement(this.field_70170_p, paramBlockPos.func_177976_e(), EnumFacing.NORTH, (paramBlockPos.func_177958_n() + 1), paramBlockPos.func_177956_o(), paramBlockPos.func_177952_p(), this.ah.func_77960_j(), (EntityLivingBase)this, EnumHand.MAIN_HAND));
          this.field_70170_p.func_175656_a(paramBlockPos.func_177978_c().func_177976_e(), Blocks.field_150345_g.getStateForPlacement(this.field_70170_p, paramBlockPos.func_177978_c().func_177976_e(), EnumFacing.NORTH, (paramBlockPos.func_177958_n() + 1), paramBlockPos.func_177956_o(), (paramBlockPos.func_177952_p() + 1), this.ah.func_77960_j(), (EntityLivingBase)this, EnumHand.MAIN_HAND));
          break;
        default:
          this.field_70170_p.func_175656_a(paramBlockPos, Blocks.field_150345_g.getStateForPlacement(this.field_70170_p, paramBlockPos, EnumFacing.NORTH, paramBlockPos.func_177958_n(), paramBlockPos.func_177956_o(), paramBlockPos.func_177952_p(), this.ah.func_77960_j(), (EntityLivingBase)this, EnumHand.MAIN_HAND));
          break;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.aE = 24;
    this.O = 0;
    this.ah = null;
    c(m.NULL);
    this.p.func_187227_b(z, Boolean.valueOf(false));
    EntityPlayer entityPlayer = l();
    HashSet<BlockPos> hashSet = paramg.g();
    try {
      if (entityPlayer != null)
        try {
          if (!hashSet.isEmpty())
            aV.a.sendTo(new B(hashSet, false), (EntityPlayerMP)entityPlayer); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    s.b(paramUUID, this);
  }
  
  void a(UUID paramUUID, BlockPos paramBlockPos, g paramg) {
    try {
      if (o() != m.MINE) {
        a(paramBlockPos, paramUUID);
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      this.O--;
      if (this.O > 0)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.O == 0)
        aV.a.sendToAllAround(new aq(N()), c()); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.field_70170_p.func_180495_p(paramBlockPos).func_177230_c() == Blocks.field_150350_a) {
        a(paramUUID, paramg, paramBlockPos);
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      this.aE--;
      if (this.aE >= 0)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.aE = 24;
    this.O = 78;
    HashSet<BlockPos> hashSet1 = new HashSet();
    EntityPlayer entityPlayer = l();
    for (BlockPos blockPos : paramg.g()) {
      try {
        if (this.field_70170_p.func_180495_p(blockPos).func_177230_c() == Blocks.field_150350_a) {
          hashSet1.add(blockPos);
          continue;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (blockPos.func_177958_n() == paramBlockPos.func_177958_n())
          try {
            if (blockPos.func_177952_p() == paramBlockPos.func_177952_p())
              continue; 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      ItemStack itemStack1 = this.field_70170_p.func_180495_p(blockPos).func_177230_c().func_185473_a(this.field_70170_p, paramBlockPos, this.field_70170_p.func_180495_p(paramBlockPos));
      try {
        if (itemStack1.func_77973_b() != Items.field_190931_a)
          b(itemStack1); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        this.ah = b(blockPos);
        this.field_70170_p.func_175655_b(blockPos, false);
        paramg.b(blockPos);
        paramg.b(hashSet1);
        hashSet1.add(blockPos);
        if (entityPlayer != null)
          aV.a.sendTo(new B(hashSet1, false), (EntityPlayerMP)entityPlayer); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      return;
    } 
    ItemStack itemStack = this.field_70170_p.func_180495_p(paramBlockPos).func_177230_c().func_185473_a(this.field_70170_p, paramBlockPos, this.field_70170_p.func_180495_p(paramBlockPos));
    try {
      if (itemStack.func_77973_b() != Items.field_190931_a)
        b(itemStack); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.ah = b(paramBlockPos);
    this.field_70170_p.func_175655_b(paramBlockPos, false);
    byte b1 = 0;
    for (BlockPos blockPos : paramg.g()) {
      try {
        if (this.field_70170_p.func_180495_p(blockPos).func_177230_c() instanceof BlockLog)
          b1++; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    HashSet<BlockPos> hashSet2 = new HashSet();
    byte b2 = 0;
    try {
      while (b2 < b1) {
        hashSet2.add(paramBlockPos.func_177982_a(0, b2, 0));
        b2++;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    HashSet<BlockPos> hashSet3 = new HashSet();
    for (BlockPos blockPos : paramg.g()) {
      try {
        if (!hashSet2.contains(blockPos))
          hashSet3.add(blockPos); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    try {
      if (!hashSet3.isEmpty())
        try {
          if (entityPlayer != null)
            aV.a.sendTo(new B(hashSet3, false), (EntityPlayerMP)entityPlayer); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    for (byte b4 = 1;; b4++) {
      BlockPos blockPos = paramBlockPos.func_177982_a(0, b4, 0);
      IBlockState iBlockState = this.field_70170_p.func_180495_p(blockPos);
      if (this.field_70170_p.func_180495_p(blockPos).func_177230_c() instanceof BlockLog) {
        this.field_70170_p.func_175655_b(blockPos, false);
        EntityFallingBlock entityFallingBlock = new EntityFallingBlock(this.field_70170_p, blockPos.func_177958_n() + 0.5D, blockPos.func_177956_o(), blockPos.func_177952_p() + 0.5D, iBlockState);
        entityFallingBlock.field_145812_b = 1;
        this.field_70170_p.func_72838_d((Entity)entityFallingBlock);
      } 
      try {
        if (!paramg.g().contains(blockPos))
          break; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
  }
  
  ItemStack b(BlockPos paramBlockPos) {
    ItemStack itemStack = new ItemStack(Item.func_150898_a(this.field_70170_p.func_180495_p(paramBlockPos).func_177230_c()));
    int i = ItemBlock.func_150891_b(itemStack.func_77973_b());
    int j = itemStack.func_77973_b().getMetadata(itemStack);
    try {
      if (i == 17)
        try {
          if (j == 1)
            return new ItemStack(Blocks.field_150345_g, 1, 1); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (i == 17)
        try {
          if (j == 2)
            return new ItemStack(Blocks.field_150345_g, 1, 2); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (i == 17)
        try {
          if (j == 3)
            return new ItemStack(Blocks.field_150345_g, 1, 3); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (i == 162)
        try {
          if (j == 0)
            return new ItemStack(Blocks.field_150345_g, 1, 4); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (i == 162)
        try {
          if (j == 1)
            return new ItemStack(Blocks.field_150345_g, 1, 5); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return new ItemStack(Blocks.field_150345_g, 1, 0);
  }
  
  void a(BlockPos paramBlockPos, UUID paramUUID) {
    BlockPos blockPos = null;
    ArrayList<BlockPos> arrayList = new ArrayList();
    try {
      if (this.field_70170_p.func_180495_p(paramBlockPos.func_177978_c().func_177977_b()).func_185917_h())
        try {
          if (!this.field_70170_p.func_180495_p(paramBlockPos.func_177978_c()).func_185913_b())
            arrayList.add(paramBlockPos.func_177978_c()); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.field_70170_p.func_180495_p(paramBlockPos.func_177974_f().func_177977_b()).func_185917_h())
        try {
          if (!this.field_70170_p.func_180495_p(paramBlockPos.func_177974_f()).func_185913_b())
            arrayList.add(paramBlockPos.func_177974_f()); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.field_70170_p.func_180495_p(paramBlockPos.func_177968_d().func_177977_b()).func_185917_h())
        try {
          if (!this.field_70170_p.func_180495_p(paramBlockPos.func_177968_d()).func_185913_b())
            arrayList.add(paramBlockPos.func_177968_d()); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.field_70170_p.func_180495_p(paramBlockPos.func_177976_e().func_177977_b()).func_185917_h())
        try {
          if (!this.field_70170_p.func_180495_p(paramBlockPos.func_177976_e()).func_185913_b())
            arrayList.add(paramBlockPos.func_177976_e()); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    for (BlockPos blockPos1 : arrayList) {
      if (blockPos == null) {
        blockPos = blockPos1;
        continue;
      } 
      double d1 = (new Vec3d((blockPos.func_177958_n() + 0.5F), blockPos.func_177956_o(), (blockPos.func_177952_p() + 0.5F))).func_72438_d(func_174791_d());
      double d2 = (new Vec3d((blockPos1.func_177958_n() + 0.5F), blockPos1.func_177956_o(), (blockPos1.func_177952_p() + 0.5F))).func_72438_d(func_174791_d());
      if (d2 < d1)
        blockPos = blockPos1; 
    } 
    if (blockPos == null) {
      s.b(paramUUID, this);
      EntityPlayer entityPlayer = l();
      try {
        if (entityPlayer == null)
          return; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      entityPlayer.func_146105_b((ITextComponent)new TextComponentString("Your kobolds cannot fall this tree because it starts underground"), true);
      return;
    } 
    try {
      if (func_180425_c().func_185332_f(blockPos.func_177958_n(), blockPos.func_177956_o(), blockPos.func_177952_p()) > 1.0D) {
        try {
          if (Math.abs(func_180425_c().func_177956_o() - blockPos.func_177956_o()) > 4) {
            a(blockPos);
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        BlockPos blockPos1 = c(blockPos);
        func_70661_as().func_75492_a(blockPos1.func_177958_n() + 0.5D, blockPos1.func_177956_o(), blockPos1.func_177952_p() + 0.5D, 0.35D);
        C();
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    float f = 0.0F;
    if (blockPos.func_177973_b((Vec3i)paramBlockPos).equals(new BlockPos(0, 0, -1)))
      f = 0.0F; 
    if (blockPos.func_177973_b((Vec3i)paramBlockPos).equals(new BlockPos(1, 0, 0)))
      f = 90.0F; 
    if (blockPos.func_177973_b((Vec3i)paramBlockPos).equals(new BlockPos(0, 0, 1)))
      f = 180.0F; 
    if (blockPos.func_177973_b((Vec3i)paramBlockPos).equals(new BlockPos(-1, 0, 0)))
      f = -90.0F; 
    a(new Vec3d(blockPos.func_177958_n() + 0.5D, blockPos.func_177956_o(), blockPos.func_177952_p() + 0.5D));
    a(f);
    this.p.func_187227_b(z, Boolean.valueOf(true));
    this.p.func_187227_b(at, Boolean.valueOf(true));
    c(m.MINE);
    this.field_70170_p.func_175655_b(blockPos.func_177984_a(), false);
  }
  
  void k() {
    try {
      if (this.ab)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Optional optional = (Optional)this.p.func_187225_a(aC);
    try {
      if (!optional.isPresent())
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.p.func_187227_b(G, s.p((UUID)optional.get()).toString());
  }
  
  public void c(m paramm) {
    try {
      if (o() == m.MATING_PRESS_CUM)
        try {
          if (paramm != m.MATING_PRESS_SOFT) {
            try {
              if (paramm == m.MATING_PRESS_HARD)
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
      if (o() == m.KOBOLD_ANAL_CUM)
        try {
          if (paramm != m.KOBOLD_ANAL_SLOW) {
            try {
              if (paramm == m.KOBOLD_ANAL_FAST)
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
      if (o() == m.CUMBLOWJOB)
        try {
          if (paramm != m.SUCKBLOWJOB) {
            try {
              if (paramm == m.THRUSTBLOWJOB)
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
      if (paramm == m.MATING_PRESS_CUM)
        this.aX = 0; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    super.c(paramm);
  }
  
  public void func_70645_a(DamageSource paramDamageSource) {
    try {
      super.func_70645_a(paramDamageSource);
      if (this.field_70170_p.field_72995_K)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Optional optional = (Optional)this.p.func_187225_a(aC);
    try {
      if (!optional.isPresent())
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    UUID uUID = (UUID)optional.get();
    s.d(uUID, this);
    if (O()) {
      EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(UUID.fromString((String)func_184212_Q().func_187225_a(b)));
      try {
        if (entityPlayer != null)
          entityPlayer.func_145747_a((ITextComponent)new TextComponentString(String.format("%s%s%s has perished %suwu", new Object[] { TextFormatting.RED, H(), TextFormatting.WHITE, TextFormatting.RED }))); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
  }
  
  protected m b(m paramm) {
    try {
      if (paramm == m.SUCKBLOWJOB_BLINK)
        return m.THRUSTBLOWJOB; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramm == m.KOBOLD_ANAL_SLOW)
        return m.KOBOLD_ANAL_FAST; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return null;
  }
  
  protected m a(m paramm) {
    try {
      if (paramm != m.THRUSTBLOWJOB) {
        try {
          if (paramm == m.SUCKBLOWJOB_BLINK)
            return m.CUMBLOWJOB; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } else {
        return m.CUMBLOWJOB;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramm != m.KOBOLD_ANAL_SLOW) {
        try {
          if (paramm == m.KOBOLD_ANAL_FAST)
            return m.KOBOLD_ANAL_CUM; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } else {
        return m.KOBOLD_ANAL_CUM;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramm != m.MATING_PRESS_HARD)
        try {
          return (paramm != m.MATING_PRESS_SOFT) ? null : m.MATING_PRESS_CUM;
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return m.MATING_PRESS_CUM;
  }
  
  public void func_70014_b(NBTTagCompound paramNBTTagCompound) {
    super.func_70014_b(paramNBTTagCompound);
    paramNBTTagCompound.func_74776_a("body_size", ((Float)this.p.func_187225_a(aG)).floatValue());
    paramNBTTagCompound.func_74768_a("eyeColorX", ((BlockPos)this.p.func_187225_a(L)).func_177958_n());
    paramNBTTagCompound.func_74768_a("eyeColorY", ((BlockPos)this.p.func_187225_a(L)).func_177956_o());
    paramNBTTagCompound.func_74768_a("eyeColorZ", ((BlockPos)this.p.func_187225_a(L)).func_177952_p());
    paramNBTTagCompound.func_74778_a("model", (String)this.p.func_187225_a(H));
    paramNBTTagCompound.func_74778_a("name", (String)this.p.func_187225_a(S));
    paramNBTTagCompound.func_74778_a("master", (String)this.p.func_187225_a(b));
    paramNBTTagCompound.func_74782_a("inventory", (NBTBase)this.aF.serializeNBT());
    paramNBTTagCompound.func_74778_a("bodyColor", (String)this.p.func_187225_a(G));
    paramNBTTagCompound.func_74757_a("editedColorManually", this.ab);
    Optional optional = (Optional)this.p.func_187225_a(aC);
    try {
      if (optional.isPresent()) {
        paramNBTTagCompound.func_186854_a("tribeId", (UUID)optional.get());
        paramNBTTagCompound.func_74757_a("isLeader", s.e((UUID)optional.get(), this));
        paramNBTTagCompound.func_74778_a("tribeName", (String)this.p.func_187225_a(ai));
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void func_70037_a(NBTTagCompound paramNBTTagCompound) {
    super.func_70037_a(paramNBTTagCompound);
    String str1 = paramNBTTagCompound.func_74779_i("model");
    try {
      if (!"".equals(str1))
        this.p.func_187227_b(H, str1); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    BlockPos blockPos = new BlockPos(paramNBTTagCompound.func_74762_e("eyeColorX"), paramNBTTagCompound.func_74762_e("eyeColorY"), paramNBTTagCompound.func_74762_e("eyeColorZ"));
    try {
      if (!BlockPos.field_177992_a.equals(blockPos))
        this.p.func_187227_b(L, blockPos); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.p.func_187227_b(aG, Float.valueOf(paramNBTTagCompound.func_74760_g("body_size")));
    this.p.func_187227_b(S, paramNBTTagCompound.func_74779_i("name"));
    this.p.func_187227_b(b, paramNBTTagCompound.func_74779_i("master"));
    this.aF.deserializeNBT(paramNBTTagCompound.func_74775_l("inventory"));
    String str2 = paramNBTTagCompound.func_74779_i("bodyColor");
    try {
      if (!"".equals(str2))
        this.p.func_187227_b(G, paramNBTTagCompound.func_74779_i("bodyColor")); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.ab = paramNBTTagCompound.func_74767_n("editedColorManually");
    UUID uUID = paramNBTTagCompound.func_186857_a("tribeId");
    try {
      if (uUID != null)
        try {
          if (!this.field_70128_L) {
            try {
              this.p.func_187227_b(aC, Optional.of(uUID));
              if (!s.k(uUID))
                s.a(uUID, EyeAndKoboldColor.valueOf((String)this.p.func_187225_a(G))); 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            try {
              s.a(uUID, this);
              if (paramNBTTagCompound.func_74767_n("isLeader"))
                s.c(uUID, this); 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            this.p.func_187227_b(ai, paramNBTTagCompound.func_74779_i("tribeName"));
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public boolean a() {
    try {
      if (this.l)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Block block = this.field_70170_p.func_180495_p(func_180425_c().func_177982_a(0, 1, 0)).func_177230_c();
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return !block.func_176205_b((IBlockAccess)this.field_70170_p, func_180425_c().func_177982_a(0, 1, 0));
  }
  
  boolean s() {
    byte b = 0;
    while (true) {
      try {
        if (b < this.aF.getSlots()) {
          try {
            if (!this.aF.getStackInSlot(b).func_190926_b())
              return false; 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          b++;
          continue;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      return true;
    } 
  }
  
  boolean a(g paramg) {
    ArrayList<ItemStack> arrayList = new ArrayList();
    for (BlockPos blockPos : paramg.g()) {
      IBlockState iBlockState = this.field_70170_p.func_180495_p(blockPos);
      ItemStack itemStack = iBlockState.func_177230_c().func_185473_a(this.field_70170_p, blockPos, iBlockState);
      arrayList.add(itemStack);
    } 
    return a(arrayList);
  }
  
  boolean a(ItemStack paramItemStack) {
    return a(this.aF, paramItemStack, true, false);
  }
  
  boolean a(List<ItemStack> paramList) {
    ItemStackHandler itemStackHandler = new ItemStackHandler(this.aF.getSlots());
    byte b = 0;
    try {
      while (b < itemStackHandler.getSlots()) {
        itemStackHandler.setStackInSlot(b, this.aF.getStackInSlot(b));
        b++;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    for (ItemStack itemStack : paramList) {
      try {
        if (!a(itemStackHandler, itemStack, true, false))
          return false; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    return true;
  }
  
  boolean b(ItemStack paramItemStack) {
    return a(this.aF, paramItemStack, false, true);
  }
  
  boolean a(ItemStackHandler paramItemStackHandler, ItemStack paramItemStack, boolean paramBoolean1, boolean paramBoolean2) {
    byte b;
    for (b = 0; b < paramItemStackHandler.getSlots(); b++) {
      ItemStack itemStack = paramItemStackHandler.getStackInSlot(b);
      try {
        if (itemStack.func_77973_b() == paramItemStack.func_77973_b())
          try {
            if (itemStack.func_77960_j() == paramItemStack.func_77960_j()) {
              int i = itemStack.func_77976_d();
              try {
                if (i > paramItemStack.func_190916_E() + itemStack.func_190916_E()) {
                  try {
                    if (!paramBoolean1)
                      itemStack.func_190920_e(itemStack.func_190916_E() + paramItemStack.func_190916_E()); 
                  } catch (RuntimeException runtimeException) {
                    throw a(null);
                  } 
                  return true;
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              int j = i - itemStack.func_190916_E();
              itemStack.func_190920_e(i);
              paramItemStack.func_190920_e(paramItemStack.func_190916_E() - j);
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    for (b = 0; b < paramItemStackHandler.getSlots(); b++) {
      ItemStack itemStack = paramItemStackHandler.getStackInSlot(b);
      try {
        if (itemStack.func_77973_b() == Items.field_190931_a) {
          try {
            if (!paramBoolean1)
              paramItemStackHandler.setStackInSlot(b, paramItemStack); 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          return true;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    try {
      if (paramBoolean1)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!paramBoolean2)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    EntityItem entityItem = new EntityItem(this.field_70170_p);
    entityItem.func_92058_a(paramItemStack);
    entityItem.func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
    this.field_70170_p.func_72838_d((Entity)entityItem);
    return false;
  }
  
  void b(SoundEvent paramSoundEvent, float paramFloat) {
    float f1 = 0.25F - ((Float)this.p.func_187225_a(aG)).floatValue();
    double d = (f1 / 0.25F);
    float f2 = (float)aH.b(0.8999999761581421D, 1.100000023841858D, d);
    a(paramSoundEvent, paramFloat, f2);
  }
  
  void b(SoundEvent paramSoundEvent) {
    b(paramSoundEvent, 1.0F);
  }
  
  void a(SoundEvent[] paramArrayOfSoundEvent) {
    b(paramArrayOfSoundEvent, 1.0F);
  }
  
  void b(SoundEvent[] paramArrayOfSoundEvent, float paramFloat) {
    b(paramArrayOfSoundEvent[func_70681_au().nextInt(paramArrayOfSoundEvent.length)], paramFloat);
  }
  
  protected <E extends software.bernie.geckolib3.core.IAnimatable> PlayState a(AnimationEvent<E> paramAnimationEvent) {
    try {
      if (this.field_70170_p instanceof com.c)
        return PlayState.STOP; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.k == null)
        S(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    float f = 0.25F - ((Float)func_184212_Q().func_187225_a(aG)).floatValue();
    (GeckoLibCache.getInstance()).parser.setValue("size", f);
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
      double d;
      switch (b) {
        case 0:
          try {
            if (o() != m.NULL) {
              a("animation.kobold.null", true, paramAnimationEvent);
              break;
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          a("animation.kobold.blink", true, paramAnimationEvent);
          break;
        case 1:
          try {
            if (o() != m.NULL) {
              a("animation.kobold.null", true, paramAnimationEvent);
              break;
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          try {
            if (func_184218_aH()) {
              a("animation.kobold.sit", true, paramAnimationEvent);
              break;
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          d = Math.abs(this.field_70169_q - this.field_70165_t) + Math.abs(this.field_70166_s - this.field_70161_v);
          try {
            if (!((Boolean)this.p.func_187225_a(z)).booleanValue())
              try {
                if (d > 0.0D) {
                  try {
                    if (this.field_70122_E && Math.abs(Math.abs(this.field_70167_r) - Math.abs(this.field_70163_u)) < 0.10000000149011612D) {
                      this.field_70177_z = this.field_70759_as;
                      double d1 = 1.0D + (f * 2.0F);
                      try {
                        this.q.setAnimationSpeed(d1);
                        if (a()) {
                          a("animation.kobold.crouch_walk", true, paramAnimationEvent);
                          break;
                        } 
                      } catch (RuntimeException runtimeException) {
                        throw a(null);
                      } 
                      try {
                        if (((Boolean)this.p.func_187225_a(ap)).booleanValue()) {
                          a("animation.kobold.run_armed", true, paramAnimationEvent);
                          break;
                        } 
                      } catch (RuntimeException runtimeException) {
                        throw a(null);
                      } 
                      try {
                        if (d > 0.20000000298023224D) {
                          a("animation.kobold.run", true, paramAnimationEvent);
                          break;
                        } 
                      } catch (RuntimeException runtimeException) {
                        throw a(null);
                      } 
                      a("animation.kobold.walk", true, paramAnimationEvent);
                      break;
                    } 
                  } catch (RuntimeException runtimeException) {
                    throw a(null);
                  } 
                  a("animation.kobold.fly", true, paramAnimationEvent);
                  break;
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              }  
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          try {
            if (a()) {
              a("animation.kobold.crouch_idle", true, paramAnimationEvent);
              break;
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          try {
          
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          a(((Boolean)this.p.func_187225_a(ap)).booleanValue() ? "animation.kobold.idle_armed" : "animation.kobold.idle", true, paramAnimationEvent);
          break;
        case 2:
          try {
            String str1;
            String str2;
            switch (c.c[o().ordinal()]) {
              case 1:
                a("animation.kobold.null", true, paramAnimationEvent);
                break;
              case 2:
                a("animation.kobold.attack", false, paramAnimationEvent);
                break;
              case 3:
              case 4:
                a("animation.kobold.sit", true, paramAnimationEvent);
                break;
              case 5:
                a("animation.kobold.fall_tree", true, paramAnimationEvent);
                break;
              case 6:
                a("animation.kobold.paymentBackpack", true, paramAnimationEvent);
                break;
              case 7:
                a("animation.kobold.blowjobStart", false, paramAnimationEvent);
                break;
              case 8:
                try {
                
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                } 
                str1 = this.aR ? "R" : "L";
                try {
                
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                } 
                str2 = this.aQ ? "Switch" : "";
                a("animation.kobold.blowjobSlow" + str1 + str2, true, paramAnimationEvent);
                break;
              case 9:
                a("animation.kobold.blowjobFast", true, paramAnimationEvent);
                break;
              case 10:
                a("animation.kobold.blowjobCum", false, paramAnimationEvent);
                break;
              case 11:
                a("animation.kobold.analStart", false, paramAnimationEvent);
                break;
              case 12:
                a("animation.kobold.analSoft", true, paramAnimationEvent);
                break;
              case 13:
                a("animation.kobold.analHard", true, paramAnimationEvent);
                break;
              case 14:
                a("animation.kobold.analCum", true, paramAnimationEvent);
                break;
              case 15:
                a("animation.kobold.sleep", true, paramAnimationEvent);
                break;
              case 16:
                a("animation.kobold.mating_press_start", false, paramAnimationEvent);
                break;
              case 17:
                a("animation.kobold.mating_press_soft", true, paramAnimationEvent);
                break;
              case 18:
                a("animation.kobold.mating_press_hard", true, paramAnimationEvent);
                break;
              case 19:
                a("animation.kobold.mating_press_cum", true, paramAnimationEvent);
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
            case -1540620298:
              if (str.equals("paymentMSG1"))
                b = 1; 
              break;
            case 3443919:
              if (str.equals("plob"))
                b = 2; 
              break;
            case 403702091:
              if (str.equals("blackScreen"))
                b = 3; 
              break;
            case -1540860248:
              if (str.equals("paymentDone"))
                b = 4; 
              break;
            case 1272160711:
              if (str.equals("blowjobStartMSG1"))
                b = 5; 
              break;
            case 1272160712:
              if (str.equals("blowjobStartMSG2"))
                b = 6; 
              break;
            case 1259653724:
              if (str.equals("lipsound"))
                b = 7; 
              break;
            case 110550847:
              if (str.equals("touch"))
                b = 8; 
              break;
            case 1271920761:
              if (str.equals("blowjobStartDone"))
                b = 9; 
              break;
            case -889473228:
              if (str.equals("switch"))
                b = 10; 
              break;
            case 1611717615:
              if (str.equals("endSwitch"))
                b = 11; 
              break;
            case 1077887465:
              if (str.equals("blowjobFastDone"))
                b = 12; 
              break;
            case 1121200173:
              if (str.equals("cumLoud"))
                b = 13; 
              break;
            case 402251961:
              if (str.equals("cumQuiet"))
                b = 14; 
              break;
            case 153907237:
              if (str.equals("analCumDone"))
                b = 15; 
              break;
            case 2094332690:
              if (str.equals("blowjobCumDone"))
                b = 16; 
              break;
            case 538866892:
              if (str.equals("analStartDone"))
                b = 17; 
              break;
            case 1402854725:
              if (str.equals("analStartCam"))
                b = 18; 
              break;
            case 809204182:
              if (str.equals("pounding"))
                b = 19; 
              break;
            case -1665766456:
              if (str.equals("analFastRapid"))
                b = 20; 
              break;
            case -1026028358:
              if (str.equals("analDone"))
                b = 21; 
              break;
            case -1025922525:
              if (str.equals("analHard"))
                b = 22; 
              break;
            case -1025581726:
              if (str.equals("analSoft"))
                b = 23; 
              break;
            case 98875:
              if (str.equals("cum"))
                b = 24; 
              break;
            case -1246024133:
              if (str.equals("giggle"))
                b = 25; 
              break;
            case 3357007:
              if (str.equals("moan"))
                b = 26; 
              break;
            case -316463951:
              if (str.equals("moanMating"))
                b = 27; 
              break;
            case 201728403:
              if (str.equals("analHardMSG1"))
                b = 28; 
              break;
            case -1008684777:
              if (str.equals("orgasm"))
                b = 29; 
              break;
            case -1380923296:
              if (str.equals("breath"))
                b = 30; 
              break;
            case 103048:
              if (str.equals("haa"))
                b = 31; 
              break;
            case -1598910135:
              if (str.equals("interested"))
                b = 32; 
              break;
            case 119524:
              if (str.equals("yep"))
                b = 33; 
              break;
            case -1388060265:
              if (str.equals("bjmoan"))
                b = 34; 
              break;
            case -888451209:
              if (str.equals("blowjobStartbreath"))
                b = 35; 
              break;
            case 791865837:
              if (str.equals("matingCam"))
                b = 36; 
              break;
            case 2073184843:
              if (str.equals("mating_press_startDone"))
                b = 37; 
              break;
            case 1913550566:
              if (str.equals("mating_press_hardDone"))
                b = 38; 
              break;
            case 2118446816:
              if (str.equals("mating_press_softReady"))
                b = 39; 
              break;
            case -796855617:
              if (str.equals("mating_press_hardReady"))
                b = 40; 
              break;
            case -2015095026:
              if (str.equals("mating_cum_cam"))
                b = 41; 
              break;
            case -1349304506:
              if (str.equals("cumMsg"))
                b = 42; 
              break;
            case 1839619727:
              if (str.equals("renderEgg"))
                b = 43; 
              break;
            case 1178966372:
              if (str.equals("mating_press_cumDone"))
                b = 44; 
              break;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        try {
          EntityPlayerSP entityPlayerSP;
          Vec3d vec3d1;
          int i;
          Vec3d vec3d2;
          switch (b) {
            case 0:
              a(SoundEvents.field_187727_dV);
              break;
            case 1:
              a(n(), "I'd like to use ur services owo");
              a(L.MISC_PLOB, new int[0]);
              break;
            case 2:
              a(L.MISC_PLOB, new int[0]);
              break;
            case 3:
              try {
                if (k())
                  bd.b(); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 4:
              try {
                if (k())
                  q(); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 5:
              try {
                if (!k())
                  break; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              entityPlayerSP = (Minecraft.func_71410_x()).field_71439_g;
              vec3d1 = aH.a(new Vec3d(0.0D, 0.625D - entityPlayerSP.func_70047_e(), -1.0D), s().floatValue() + 180.0F);
              aV.a.sendToServer(new an(n().toString(), I().func_178787_e(vec3d1), s().floatValue() + 180.0F, 0.0F));
              break;
            case 6:
              try {
                if (!k())
                  break; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              entityPlayerSP = (Minecraft.func_71410_x()).field_71439_g;
              vec3d1 = aH.a(new Vec3d(0.5D, 0.5D - entityPlayerSP.func_70047_e(), -0.6875D), s().floatValue() + 180.0F);
              aV.a.sendToServer(new an(n().toString(), I().func_178787_e(vec3d1), s().floatValue() + 180.0F - 40.0F, 0.0F));
              break;
            case 7:
              try {
                if (func_70681_au().nextBoolean()) {
                  a(L.GIRLS_ALLIE_LIPSOUND, 1.5F);
                } else {
                  a(L.GIRLS_JENNY_LIPSOUND, 1.5F);
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              cG.a(0.019999999552965164D);
              break;
            case 8:
              a(L.MISC_TOUCH, new int[0]);
              break;
            case 9:
              try {
                c(m.SUCKBLOWJOB_BLINK);
                this.aQ = false;
                this.aR = true;
                if (k())
                  cG.d(); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 10:
              this.aQ = func_70681_au().nextBoolean();
              this.k.clearAnimationCache();
              break;
            case 11:
              try {
                this.aQ = false;
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              this.aR = !this.aR;
              this.k.clearAnimationCache();
              break;
            case 12:
              try {
                if (!k())
                  break; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              try {
                if (!aK.b)
                  c(m.SUCKBLOWJOB_BLINK); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 13:
              a(L.MISC_SMALLINSERTS, 3.0F);
              break;
            case 14:
              a(L.MISC_SMALLINSERTS, 1.5F);
              break;
            case 15:
            case 16:
              try {
                if (k()) {
                  i();
                  cG.a();
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 17:
              try {
                c(m.KOBOLD_ANAL_SLOW);
                if (k())
                  cG.d(); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 18:
              try {
                if (!k())
                  break; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              entityPlayerSP = (Minecraft.func_71410_x()).field_71439_g;
              vec3d1 = aH.a(new Vec3d(0.0D, 0.5625D - entityPlayerSP.func_70047_e(), 0.5625D), s().floatValue() + 180.0F);
              aV.a.sendToServer(new an(n().toString(), I().func_178787_e(vec3d1), s().floatValue(), 0.0F));
              break;
            case 19:
              a(L.MISC_POUNDING, new int[0]);
              break;
            case 20:
              try {
                if (!k())
                  break; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              try {
                if (aK.b) {
                  try {
                    if (o() == m.KOBOLD_ANAL_FAST)
                      this.k.tickOffset = 0.0D; 
                  } catch (RuntimeException runtimeException) {
                    throw a(null);
                  } 
                  c(m.KOBOLD_ANAL_FAST);
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 21:
              try {
                if (o() == m.KOBOLD_ANAL_FAST)
                  c(m.KOBOLD_ANAL_SLOW); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 22:
              try {
                if (k())
                  cG.a(0.03999999910593033D); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 23:
              try {
                if (k())
                  cG.a(0.019999999552965164D); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 24:
              a(L.MISC_SMALLINSERTS, 2.0F);
              break;
            case 25:
              a(L.GIRLS_KOBOLD_GIGGLE);
              break;
            case 26:
              a(L.GIRLS_KOBOLD_MOAN);
              break;
            case 27:
              try {
                this.aK--;
                if (this.aK <= 0) {
                  this.aK = 3;
                  a(L.GIRLS_KOBOLD_MOAN);
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 28:
              try {
                this.aK--;
                if (this.aK <= 0) {
                  this.aK = 4;
                  a(L.GIRLS_KOBOLD_MOAN);
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 29:
              a(L.GIRLS_KOBOLD_ORGASM);
              break;
            case 30:
              b(L.GIRLS_KOBOLD_LIGHTBREATHING, 0.5F);
              break;
            case 31:
              b(L.GIRLS_KOBOLD_HAA, 0.7F);
              break;
            case 32:
              a(L.GIRLS_KOBOLD_INTERESTED);
              break;
            case 33:
              a(L.GIRLS_KOBOLD_YEP);
              break;
            case 34:
              b(L.a(L.GIRLS_KOBOLD_BJMOAN));
              break;
            case 35:
              i = func_70681_au().nextInt(3);
              b(L.GIRLS_KOBOLD_LIGHTBREATHING[i]);
              break;
            case 36:
              try {
                if (!k())
                  break; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              entityPlayerSP = (Minecraft.func_71410_x()).field_71439_g;
              vec3d2 = new Vec3d(0.0D, 0.4375D - ((EntityPlayer)entityPlayerSP).eyeHeight, -0.6875D);
              vec3d2 = aH.a(vec3d2, s().floatValue() + 180.0F);
              vec3d2 = vec3d2.func_178787_e(I());
              aV.a.sendToServer(new an(entityPlayerSP.getPersistentID().toString(), vec3d2, s().floatValue() + 180.0F, 10.0F));
              break;
            case 37:
              try {
                if (k())
                  cG.d(); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
            case 38:
              try {
                if (k())
                  c(m.MATING_PRESS_SOFT); 
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
              try {
                if (k())
                  try {
                    if (aK.b)
                      c(m.MATING_PRESS_HARD); 
                  } catch (RuntimeException runtimeException) {
                    throw a(null);
                  }  
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 40:
              try {
                if (k())
                  cG.a(0.03999999910593033D); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
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
            case 41:
              try {
                if (!k())
                  break; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              entityPlayerSP = (Minecraft.func_71410_x()).field_71439_g;
              vec3d2 = new Vec3d(0.0D, 1.1875D - ((EntityPlayer)entityPlayerSP).eyeHeight, 0.125D);
              vec3d2 = aH.a(vec3d2, s().floatValue() + 180.0F);
              vec3d2 = vec3d2.func_178787_e(I());
              aV.a.sendToServer(new an(entityPlayerSP.getPersistentID().toString(), vec3d2, s().floatValue() + 180.0F, 70.0F));
              break;
            case 42:
              b("I.. hope I am satisfying you sir");
              b(L.GIRLS_KOBOLD_SAD[func_70681_au().nextInt(1)]);
              break;
            case 43:
              this.P = true;
              a(L.MISC_PLOB, 0.5F);
              break;
            case 44:
              try {
                if (k())
                  i(); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
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
  
  public int func_70302_i_() {
    return 27;
  }
  
  public boolean func_191420_l() {
    return false;
  }
  
  public ItemStack func_70301_a(int paramInt) {
    try {
      if (paramInt >= this.aF.getSlots())
        return ItemStack.field_190927_a; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return this.aF.getStackInSlot(paramInt);
  }
  
  public ItemStack func_70298_a(int paramInt1, int paramInt2) {
    return this.aF.extractItem(paramInt1, paramInt2, false);
  }
  
  public ItemStack func_70304_b(int paramInt) {
    return this.aF.extractItem(paramInt, this.aF.getStackInSlot(paramInt).func_190916_E(), false);
  }
  
  public void func_70299_a(int paramInt, ItemStack paramItemStack) {
    this.aF.setStackInSlot(paramInt, paramItemStack);
  }
  
  public int func_70297_j_() {
    return 64;
  }
  
  public void func_70296_d() {}
  
  public boolean func_70300_a(EntityPlayer paramEntityPlayer) {
    return true;
  }
  
  public void func_174889_b(EntityPlayer paramEntityPlayer) {}
  
  public void func_174886_c(EntityPlayer paramEntityPlayer) {}
  
  public boolean func_94041_b(int paramInt, ItemStack paramItemStack) {
    return true;
  }
  
  public int func_174887_a_(int paramInt) {
    return paramInt;
  }
  
  public void func_174885_b(int paramInt1, int paramInt2) {}
  
  public int func_174890_g() {
    return 0;
  }
  
  public void func_174888_l() {}
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  public static class a {
    int a = 0;
    
    @SubscribeEvent
    public void a(LivingDeathEvent param1LivingDeathEvent) {
      if (param1LivingDeathEvent.getEntityLiving() instanceof b3) {
        b3 b3 = (b3)param1LivingDeathEvent.getEntityLiving();
        try {
          if (b3.field_70170_p.field_72995_K)
            return; 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        } 
        for (byte b = 0; b < b3.aF.getSlots(); b++) {
          ItemStack itemStack = b3.aF.getStackInSlot(b);
          try {
            if (itemStack.func_77973_b() != Items.field_190931_a)
              b3.func_145779_a(itemStack.func_77973_b(), itemStack.func_190916_E()); 
          } catch (ConcurrentModificationException concurrentModificationException) {
            throw a(null);
          } 
        } 
      } 
    }
    
    @SubscribeEvent
    public void b(LivingHurtEvent param1LivingHurtEvent) {
      Entity entity1 = param1LivingHurtEvent.getEntity();
      World world = entity1.func_130014_f_();
      try {
        if (world.field_72995_K)
          return; 
      } catch (ConcurrentModificationException concurrentModificationException) {
        throw a(null);
      } 
      try {
        if (!(entity1 instanceof b3))
          return; 
      } catch (ConcurrentModificationException concurrentModificationException) {
        throw a(null);
      } 
      b3 b3 = (b3)entity1;
      Optional optional = (Optional)b3.func_184212_Q().func_187225_a(b3.aC);
      try {
        if (!optional.isPresent())
          return; 
      } catch (ConcurrentModificationException concurrentModificationException) {
        throw a(null);
      } 
      Entity entity2 = param1LivingHurtEvent.getSource().func_76346_g();
      try {
        if (entity2 == null)
          return; 
      } catch (ConcurrentModificationException concurrentModificationException) {
        throw a(null);
      } 
      try {
        if (!(entity2 instanceof EntityLivingBase))
          return; 
      } catch (ConcurrentModificationException concurrentModificationException) {
        throw a(null);
      } 
      if (entity2 instanceof EntityPlayer) {
        EntityPlayer entityPlayer1 = (EntityPlayer)entity2;
        try {
          if (entityPlayer1.field_71075_bZ.field_75098_d)
            return; 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        } 
        try {
          if (entityPlayer1.equals(b3.l()))
            return; 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        } 
      } 
      EntityPlayer entityPlayer = b3.l();
      try {
        if (entityPlayer != null)
          entityPlayer.func_146105_b((ITextComponent)new TextComponentString(TextFormatting.RED + "Your Tribe is under Attack!"), true); 
      } catch (ConcurrentModificationException concurrentModificationException) {
        throw a(null);
      } 
      s.b((UUID)optional.get(), (EntityLivingBase)entity2);
    }
    
    @SubscribeEvent
    public void a(WorldEvent.Unload param1Unload) {
      try {
        for (bS bS : bS.l()) {
          try {
            if (!(bS instanceof b3))
              continue; 
          } catch (ConcurrentModificationException concurrentModificationException) {
            throw a(null);
          } 
          b3 b3 = (b3)bS;
          Optional optional = (Optional)b3.func_184212_Q().func_187225_a(b3.aC);
          try {
            if (!optional.isPresent())
              continue; 
          } catch (ConcurrentModificationException concurrentModificationException) {
            throw a(null);
          } 
          try {
            if (!s.e((UUID)optional.get(), b3))
              continue; 
          } catch (ConcurrentModificationException concurrentModificationException) {
            throw a(null);
          } 
          b3.i((UUID)optional.get());
        } 
      } catch (ConcurrentModificationException concurrentModificationException) {}
    }
    
    @SubscribeEvent
    public void a(LivingHurtEvent param1LivingHurtEvent) {
      try {
        if (param1LivingHurtEvent.getSource() != DamageSource.field_76368_d)
          return; 
      } catch (ConcurrentModificationException concurrentModificationException) {
        throw a(null);
      } 
      Entity entity = param1LivingHurtEvent.getEntity();
      try {
        if (entity instanceof b3) {
          entity.func_70107_b(entity.field_70165_t, entity.field_70163_u + 1.0D, entity.field_70161_v);
          param1LivingHurtEvent.setCanceled(true);
        } 
      } catch (ConcurrentModificationException concurrentModificationException) {
        throw a(null);
      } 
    }
    
    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public void a(TickEvent.ClientTickEvent param1ClientTickEvent) {
      WorldClient worldClient = (Minecraft.func_71410_x()).field_71441_e;
      try {
        if (worldClient == null)
          return; 
      } catch (ConcurrentModificationException concurrentModificationException) {
        throw a(null);
      } 
      try {
        if (++this.a % 20 == 0)
          aV.a.sendToServer(new v()); 
      } catch (ConcurrentModificationException concurrentModificationException) {
        throw a(null);
      } 
    }
    
    private static ConcurrentModificationException a(ConcurrentModificationException param1ConcurrentModificationException) {
      return param1ConcurrentModificationException;
    }
  }
  
  class b extends ArrayList<Integer> {
    b() {
      add(Integer.valueOf(101));
      add(Integer.valueOf((EyeAndKoboldColor.values()).length));
      add(Integer.valueOf((EyeAndKoboldColor.values()).length));
      add(Integer.valueOf(8));
      add(Integer.valueOf(3));
      add(Integer.valueOf(101));
      add(Integer.valueOf(101));
      add(Integer.valueOf(3));
      add(Integer.valueOf(3));
      add(Integer.valueOf(4));
      add(Integer.valueOf(2));
    }
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\b3.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */