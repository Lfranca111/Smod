package com.schnurritv.sexmod;

import java.util.ArrayList;
import java.util.UUID;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.Packet;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.network.play.server.SPacketSoundEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHandSide;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class e extends EntityLivingBase implements IAnimatable {
  static final int e = 12000;
  
  private final AnimationFactory d = new AnimationFactory(this);
  
  public UUID c = null;
  
  static AnimationController<e> f;
  
  public static final DataParameter<String> a = EntityDataManager.func_187226_a(e.class, DataSerializers.field_187194_d).func_187156_b().func_187161_a(115);
  
  public static final DataParameter<Integer> b = EntityDataManager.func_187226_a(e.class, DataSerializers.field_187192_b).func_187156_b().func_187161_a(116);
  
  public e(World paramWorld) {
    super(paramWorld);
    func_70105_a(0.5F, 0.5F);
  }
  
  protected void func_70088_a() {
    super.func_70088_a();
    this.field_70180_af.func_187214_a(a, b3.aP.toString());
    this.field_70180_af.func_187214_a(b, Integer.valueOf(0));
  }
  
  public void func_70071_h_() {
    super.func_70071_h_();
    int i = ((Integer)this.field_70180_af.func_187225_a(b)).intValue();
    try {
      if (i >= 12000)
        a(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!this.field_70170_p.field_72995_K)
        this.field_70180_af.func_187227_b(b, Integer.valueOf(i + 1)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public boolean canTrample(World paramWorld, Block paramBlock, BlockPos paramBlockPos, float paramFloat) {
    return false;
  }
  
  public boolean func_70097_a(DamageSource paramDamageSource, float paramFloat) {
    boolean bool = super.func_70097_a(paramDamageSource, paramFloat);
    try {
      if (!bool)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    func_70106_y();
    return true;
  }
  
  void a() {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: iload_1
    //   3: bipush #30
    //   5: if_icmpge -> 147
    //   8: getstatic com/schnurritv/sexmod/U.f : Ljava/util/Random;
    //   11: invokevirtual nextBoolean : ()Z
    //   14: ifeq -> 32
    //   17: goto -> 24
    //   20: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   23: athrow
    //   24: iconst_1
    //   25: goto -> 33
    //   28: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   31: athrow
    //   32: iconst_m1
    //   33: i2f
    //   34: getstatic com/schnurritv/sexmod/U.f : Ljava/util/Random;
    //   37: invokevirtual nextFloat : ()F
    //   40: fmul
    //   41: fstore_2
    //   42: getstatic com/schnurritv/sexmod/U.f : Ljava/util/Random;
    //   45: invokevirtual nextBoolean : ()Z
    //   48: ifeq -> 59
    //   51: iconst_1
    //   52: goto -> 60
    //   55: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   58: athrow
    //   59: iconst_m1
    //   60: i2f
    //   61: getstatic com/schnurritv/sexmod/U.f : Ljava/util/Random;
    //   64: invokevirtual nextFloat : ()F
    //   67: fmul
    //   68: fstore_3
    //   69: getstatic com/schnurritv/sexmod/U.f : Ljava/util/Random;
    //   72: invokevirtual nextBoolean : ()Z
    //   75: ifeq -> 86
    //   78: iconst_1
    //   79: goto -> 87
    //   82: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   85: athrow
    //   86: iconst_m1
    //   87: i2f
    //   88: getstatic com/schnurritv/sexmod/U.f : Ljava/util/Random;
    //   91: invokevirtual nextFloat : ()F
    //   94: fmul
    //   95: fstore #4
    //   97: aload_0
    //   98: getfield field_70170_p : Lnet/minecraft/world/World;
    //   101: getstatic net/minecraft/util/EnumParticleTypes.EXPLOSION_NORMAL : Lnet/minecraft/util/EnumParticleTypes;
    //   104: ldc2_w 0.5
    //   107: aload_0
    //   108: getfield field_70165_t : D
    //   111: dadd
    //   112: ldc2_w 0.5
    //   115: aload_0
    //   116: getfield field_70163_u : D
    //   119: dadd
    //   120: ldc2_w 0.5
    //   123: aload_0
    //   124: getfield field_70161_v : D
    //   127: dadd
    //   128: fload_2
    //   129: f2d
    //   130: fload_3
    //   131: f2d
    //   132: fload #4
    //   134: f2d
    //   135: iconst_0
    //   136: newarray int
    //   138: invokevirtual func_175688_a : (Lnet/minecraft/util/EnumParticleTypes;DDDDDD[I)V
    //   141: iinc #1, 1
    //   144: goto -> 2
    //   147: aload_0
    //   148: getfield field_70170_p : Lnet/minecraft/world/World;
    //   151: getfield field_72995_K : Z
    //   154: ifeq -> 162
    //   157: return
    //   158: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   161: athrow
    //   162: aload_0
    //   163: getfield c : Ljava/util/UUID;
    //   166: ifnonnull -> 183
    //   169: aload_0
    //   170: invokestatic randomUUID : ()Ljava/util/UUID;
    //   173: putfield c : Ljava/util/UUID;
    //   176: goto -> 183
    //   179: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   182: athrow
    //   183: aload_0
    //   184: getfield field_70170_p : Lnet/minecraft/world/World;
    //   187: aload_0
    //   188: getfield c : Ljava/util/UUID;
    //   191: invokestatic a : (Lnet/minecraft/world/World;Ljava/util/UUID;)Lcom/schnurritv/sexmod/b3;
    //   194: astore_1
    //   195: aload_0
    //   196: getfield c : Ljava/util/UUID;
    //   199: aload_1
    //   200: invokestatic a : (Ljava/util/UUID;Lcom/schnurritv/sexmod/b3;)V
    //   203: aload_0
    //   204: getfield c : Ljava/util/UUID;
    //   207: invokestatic n : (Ljava/util/UUID;)Ljava/util/UUID;
    //   210: astore_2
    //   211: aload_2
    //   212: ifnull -> 236
    //   215: aload_1
    //   216: invokevirtual func_184212_Q : ()Lnet/minecraft/network/datasync/EntityDataManager;
    //   219: getstatic com/schnurritv/sexmod/bS.b : Lnet/minecraft/network/datasync/DataParameter;
    //   222: aload_2
    //   223: invokevirtual toString : ()Ljava/lang/String;
    //   226: invokevirtual func_187227_b : (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
    //   229: goto -> 236
    //   232: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   235: athrow
    //   236: aload_0
    //   237: getfield c : Ljava/util/UUID;
    //   240: invokestatic m : (Ljava/util/UUID;)Ljava/util/List;
    //   243: astore_3
    //   244: aconst_null
    //   245: astore #4
    //   247: aload_3
    //   248: invokeinterface iterator : ()Ljava/util/Iterator;
    //   253: astore #5
    //   255: aload #5
    //   257: invokeinterface hasNext : ()Z
    //   262: ifeq -> 313
    //   265: aload #5
    //   267: invokeinterface next : ()Ljava/lang/Object;
    //   272: checkcast com/schnurritv/sexmod/b3
    //   275: astore #6
    //   277: aload #6
    //   279: invokevirtual func_184212_Q : ()Lnet/minecraft/network/datasync/EntityDataManager;
    //   282: getstatic com/schnurritv/sexmod/b3.ai : Lnet/minecraft/network/datasync/DataParameter;
    //   285: invokevirtual func_187225_a : (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
    //   288: checkcast java/lang/String
    //   291: astore #7
    //   293: ldc ''
    //   295: aload #7
    //   297: invokevirtual equals : (Ljava/lang/Object;)Z
    //   300: ifne -> 310
    //   303: aload #7
    //   305: astore #4
    //   307: goto -> 313
    //   310: goto -> 255
    //   313: aload #4
    //   315: ifnull -> 337
    //   318: aload_1
    //   319: invokevirtual func_184212_Q : ()Lnet/minecraft/network/datasync/EntityDataManager;
    //   322: getstatic com/schnurritv/sexmod/b3.ai : Lnet/minecraft/network/datasync/DataParameter;
    //   325: aload #4
    //   327: invokevirtual func_187227_b : (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
    //   330: goto -> 337
    //   333: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   336: athrow
    //   337: aload_1
    //   338: ldc2_w 0.5
    //   341: aload_0
    //   342: getfield field_70165_t : D
    //   345: dadd
    //   346: aload_0
    //   347: getfield field_70163_u : D
    //   350: ldc2_w 0.5
    //   353: aload_0
    //   354: getfield field_70161_v : D
    //   357: dadd
    //   358: invokevirtual func_70107_b : (DDD)V
    //   361: aload_0
    //   362: getfield field_70170_p : Lnet/minecraft/world/World;
    //   365: aload_1
    //   366: invokevirtual func_72838_d : (Lnet/minecraft/entity/Entity;)Z
    //   369: pop
    //   370: aload_0
    //   371: aload_1
    //   372: invokevirtual a : (Lcom/schnurritv/sexmod/b3;)V
    //   375: aload_0
    //   376: getfield field_70170_p : Lnet/minecraft/world/World;
    //   379: aconst_null
    //   380: aload_0
    //   381: invokevirtual func_180425_c : ()Lnet/minecraft/util/math/BlockPos;
    //   384: getstatic net/minecraft/init/SoundEvents.field_187539_bB : Lnet/minecraft/util/SoundEvent;
    //   387: getstatic net/minecraft/util/SoundCategory.BLOCKS : Lnet/minecraft/util/SoundCategory;
    //   390: ldc 0.5
    //   392: fconst_1
    //   393: invokevirtual func_184133_a : (Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/SoundEvent;Lnet/minecraft/util/SoundCategory;FF)V
    //   396: aload_0
    //   397: getfield field_70170_p : Lnet/minecraft/world/World;
    //   400: aload_0
    //   401: invokevirtual func_72900_e : (Lnet/minecraft/entity/Entity;)V
    //   404: return
    // Exception table:
    //   from	to	target	type
    //   2	17	20	java/lang/RuntimeException
    //   8	28	28	java/lang/RuntimeException
    //   42	55	55	java/lang/RuntimeException
    //   69	82	82	java/lang/RuntimeException
    //   147	158	158	java/lang/RuntimeException
    //   162	176	179	java/lang/RuntimeException
    //   211	229	232	java/lang/RuntimeException
    //   313	330	333	java/lang/RuntimeException
  }
  
  void a(b3 paramb3) {
    EntityPlayer entityPlayer = paramb3.l();
    try {
      if (entityPlayer == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    EntityPlayerMP entityPlayerMP = (EntityPlayerMP)entityPlayer;
    EyeAndKoboldColor eyeAndKoboldColor = s.p(this.c);
    entityPlayer.func_145747_a((ITextComponent)new TextComponentString(String.format("%s%s %shas become a %snew tribe member%s!", new Object[] { eyeAndKoboldColor.getTextColor(), paramb3.H(), TextFormatting.WHITE, TextFormatting.RED, TextFormatting.WHITE })));
    entityPlayerMP.field_71135_a.func_147359_a((Packet)new SPacketSoundEffect(SoundEvents.field_187734_u, SoundCategory.NEUTRAL, entityPlayer.field_70165_t, entityPlayer.field_70163_u, entityPlayer.field_70161_v, 1.0F, 1.0F));
    entityPlayerMP.field_71135_a.func_147359_a((Packet)new SPacketSoundEffect(SoundEvents.field_187640_br, SoundCategory.NEUTRAL, entityPlayer.field_70165_t, entityPlayer.field_70163_u, entityPlayer.field_70161_v, 1.0F, 1.0F));
  }
  
  public void registerControllers(AnimationData paramAnimationData) {
    f = new AnimationController(this, "controller", 5.0F, this::a);
    paramAnimationData.addAnimationController(f);
  }
  
  public AnimationFactory getFactory() {
    return this.d;
  }
  
  public void func_70014_b(NBTTagCompound paramNBTTagCompound) {
    try {
      if (this.c != null)
        paramNBTTagCompound.func_74778_a("tribeID", this.c.toString()); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    paramNBTTagCompound.func_74778_a("egg_color", (String)this.field_70180_af.func_187225_a(a));
    paramNBTTagCompound.func_74768_a("eggAge", ((Integer)this.field_70180_af.func_187225_a(b)).intValue());
    super.func_70014_b(paramNBTTagCompound);
  }
  
  public void func_70037_a(NBTTagCompound paramNBTTagCompound) {
    super.func_70037_a(paramNBTTagCompound);
    String str = paramNBTTagCompound.func_74779_i("tribeID");
    try {
      if (!"".equals(str))
        this.c = UUID.fromString(str); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.field_70180_af.func_187227_b(a, paramNBTTagCompound.func_74779_i("egg_color"));
    this.field_70180_af.func_187227_b(b, Integer.valueOf(paramNBTTagCompound.func_74762_e("eggAge")));
  }
  
  protected <E extends IAnimatable> PlayState a(AnimationEvent<E> paramAnimationEvent) {
    int i = ((Integer)this.field_70180_af.func_187225_a(b)).intValue();
    try {
      if (12000 - i < 20) {
        paramAnimationEvent.getController().setAnimation((new AnimationBuilder()).addAnimation("animation.model.hatch", Boolean.valueOf(true)));
        return PlayState.CONTINUE;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    float f = i / 12000.0F;
    try {
      if (f > 0.98D) {
        paramAnimationEvent.getController().setAnimation((new AnimationBuilder()).addAnimation("animation.model.veryfast", Boolean.valueOf(true)));
        return PlayState.CONTINUE;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (f > 0.85D) {
        paramAnimationEvent.getController().setAnimation((new AnimationBuilder()).addAnimation("animation.model.fast", Boolean.valueOf(true)));
        return PlayState.CONTINUE;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (f > 0.75D) {
        paramAnimationEvent.getController().setAnimation((new AnimationBuilder()).addAnimation("animation.model.medium", Boolean.valueOf(true)));
        return PlayState.CONTINUE;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (f > 0.5D) {
        paramAnimationEvent.getController().setAnimation((new AnimationBuilder()).addAnimation("animation.model.slow", Boolean.valueOf(true)));
        return PlayState.CONTINUE;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return PlayState.CONTINUE;
  }
  
  public Iterable<ItemStack> func_184193_aE() {
    return new ArrayList<>();
  }
  
  public ItemStack func_184582_a(EntityEquipmentSlot paramEntityEquipmentSlot) {
    return ItemStack.field_190927_a;
  }
  
  public void func_184201_a(EntityEquipmentSlot paramEntityEquipmentSlot, ItemStack paramItemStack) {}
  
  public EnumHandSide func_184591_cq() {
    return EnumHandSide.LEFT;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */