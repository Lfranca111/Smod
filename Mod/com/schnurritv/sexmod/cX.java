package com.schnurritv.sexmod;

import java.util.ArrayList;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHandSide;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.util.MatrixStack;

public class cX extends EntityLivingBase implements IAnimatable {
  static final float c = 11000.0F;
  
  public static final DataParameter<String> a = EntityDataManager.func_187226_a(cX.class, DataSerializers.field_187194_d).func_187156_b().func_187161_a(101);
  
  public static final DataParameter<String> g = EntityDataManager.func_187226_a(cX.class, DataSerializers.field_187194_d).func_187156_b().func_187161_a(102);
  
  AnimationFactory d = new AnimationFactory(this);
  
  public boolean f = false;
  
  public MatrixStack e = new MatrixStack();
  
  ah b = null;
  
  public cX(World paramWorld) {
    super(paramWorld);
  }
  
  public cX(World paramWorld, UUID paramUUID, String paramString) {
    this(paramWorld);
    this.field_70180_af.func_187227_b(a, paramUUID.toString());
    this.field_70180_af.func_187227_b(g, paramString);
  }
  
  public static cX a(World paramWorld, UUID paramUUID, ah paramah) {
    cX cX1 = new cX(paramWorld);
    cX1.func_184212_Q().func_187227_b(a, paramUUID.toString());
    cX1.f = true;
    cX1.b = paramah;
    return cX1;
  }
  
  protected void func_70088_a() {
    super.func_70088_a();
    this.field_70180_af.func_187214_a(a, "");
    this.field_70180_af.func_187214_a(g, "");
  }
  
  public AxisAlignedBB func_184177_bl() {
    BlockPos blockPos = func_180425_c();
    Vec3i vec3i = new Vec3i(0.5D, 0.5D, 0.5D);
    return new AxisAlignedBB(blockPos.func_177973_b(vec3i), blockPos.func_177971_a(vec3i));
  }
  
  @SideOnly(Side.CLIENT)
  public boolean func_145770_h(double paramDouble1, double paramDouble2, double paramDouble3) {
    double d1 = this.field_70165_t - paramDouble1;
    double d2 = this.field_70163_u - paramDouble2;
    double d3 = this.field_70161_v - paramDouble3;
    double d4 = d1 * d1 + d2 * d2 + d3 * d3;
    return func_70112_a(d4);
  }
  
  @SideOnly(Side.CLIENT)
  public boolean func_70112_a(double paramDouble) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (paramDouble < 11000.0D);
  }
  
  @Nullable
  public UUID b() {
    String str = (String)this.field_70180_af.func_187225_a(a);
    try {
      if ("".equals(str))
        return null; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return UUID.fromString(str);
  }
  
  public boolean func_70097_a(DamageSource paramDamageSource, float paramFloat) {
    try {
      if (paramDamageSource != DamageSource.field_76380_i)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return super.func_70097_a(paramDamageSource, paramFloat);
  }
  
  @Nullable
  public String a() {
    String str = (String)this.field_70180_af.func_187225_a(g);
    try {
      if ("".equals(str))
        return null; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return str;
  }
  
  public boolean func_70104_M() {
    return false;
  }
  
  public boolean func_70067_L() {
    return false;
  }
  
  public void func_70645_a(DamageSource paramDamageSource) {
    super.func_70645_a(paramDamageSource);
  }
  
  public AnimationFactory getFactory() {
    return this.d;
  }
  
  public void registerControllers(AnimationData paramAnimationData) {}
  
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


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\cX.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */