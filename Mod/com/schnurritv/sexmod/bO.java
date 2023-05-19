package com.schnurritv.sexmod;

import com.google.common.base.Optional;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Hashtable;
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
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class bo extends bA {
  public static final String ae = "sexmod:CustomModel";
  
  public static final String U = "sexmod:GirlSpecific";
  
  public static final float ad = 0.0F;
  
  public static final int V = 100;
  
  public static final int aa = 65;
  
  public static boolean ab = true;
  
  public Vector2f Y = new Vector2f(0.0F, 0.0F);
  
  public boolean aj = false;
  
  public boolean ai = false;
  
  public boolean Z = false;
  
  public boolean ag = true;
  
  public boolean W = false;
  
  protected static final DataParameter<Optional<UUID>> ak = EntityDataManager.func_187226_a(bS.class, DataSerializers.field_187203_m).func_187156_b().func_187161_a(118);
  
  public static Hashtable<UUID, bo> X = new Hashtable<>();
  
  public static List<bo> ah = new ArrayList<>();
  
  int ac = -1;
  
  public boolean af = true;
  
  protected bo(World paramWorld) {
    super(paramWorld);
    func_70105_a(0.1F, 0.1F);
    ah.add(this);
  }
  
  protected bo(World paramWorld, UUID paramUUID) {
    this(paramWorld);
    this.p.func_187227_b(ak, Optional.of(paramUUID));
  }
  
  @Nullable
  public static bo f(UUID paramUUID) {
    return X.get(paramUUID);
  }
  
  @Nullable
  public static bo b(@Nonnull EntityPlayer paramEntityPlayer) {
    return X.get(paramEntityPlayer.getPersistentID());
  }
  
  @Nullable
  public static bo e(UUID paramUUID) {
    try {
      for (bS bS : l()) {
        try {
          if (bS.field_70170_p.field_72995_K)
            continue; 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw b(null);
        } 
        try {
          if (!(bS instanceof bo))
            continue; 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw b(null);
        } 
        bo bo1 = (bo)bS;
        if (paramUUID.equals(bo1.d()))
          return bo1; 
      } 
    } catch (ConcurrentModificationException concurrentModificationException) {}
    return null;
  }
  
  public NetworkRegistry.TargetPoint c() {
    return new NetworkRegistry.TargetPoint(this.field_71093_bK, this.field_70165_t, this.field_70163_u - 0.0D, this.field_70161_v, 50.0D);
  }
  
  public void a(int paramInt, m paramm) {
    aV.a.sendToAllTracking(new a4(d(), paramInt, paramm), c());
  }
  
  public boolean func_70067_L() {
    return false;
  }
  
  public boolean v() {
    return true;
  }
  
  public boolean s() {
    return false;
  }
  
  @SideOnly(Side.CLIENT)
  public void j() {}
  
  public boolean l() {
    return true;
  }
  
  public boolean a(String paramString) {
    return false;
  }
  
  public boolean n() {
    return false;
  }
  
  public String H() {
    if (((Optional)this.p.func_187225_a(ak)).isPresent()) {
      EntityPlayer entityPlayer = this.field_70170_p.func_152378_a((UUID)((Optional)this.p.func_187225_a(ak)).get());
      try {
        if (entityPlayer != null)
          return entityPlayer.func_70005_c_(); 
      } catch (ConcurrentModificationException concurrentModificationException) {
        throw b(null);
      } 
    } 
    return "anonymous horny girl";
  }
  
  public void b() {}
  
  public abstract void b(String paramString, UUID paramUUID);
  
  public abstract o b(int paramInt);
  
  public abstract String a(int paramInt);
  
  public Vec3i c(int paramInt) {
    return new Vec3i(255, 255, 255);
  }
  
  public boolean func_70104_M() {
    return false;
  }
  
  public boolean func_70058_J() {
    return true;
  }
  
  public boolean p() {
    return false;
  }
  
  public void o() {
    this.p.func_187227_b(field_184621_as, Byte.valueOf("1"));
  }
  
  protected void func_70088_a() {
    super.func_70088_a();
    this.p.func_187214_a(ak, Optional.absent());
  }
  
  @SideOnly(Side.CLIENT)
  public static void r() {
    bo bo1 = f((Minecraft.func_71410_x()).field_71439_g.getPersistentID());
    try {
      if (bo1 == null)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw b(null);
    } 
    bo1.i();
  }
  
  public void i() {
    try {
      this.w = null;
      func_189654_d(false);
      if (this.field_70170_p.field_72995_K)
        P(); 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw b(null);
    } 
  }
  
  @SideOnly(Side.CLIENT)
  protected void P() {
    try {
      if (k() || c()) {
        aK.a(true);
        EntityPlayerSP entityPlayerSP = (Minecraft.func_71410_x()).field_71439_g;
        entityPlayerSP.func_82142_c(false);
        entityPlayerSP.func_189654_d(false);
        ((EntityPlayer)entityPlayerSP).field_70145_X = false;
        this.p.func_187227_b(z, Boolean.valueOf(false));
        aV.a.sendToServer(new I(N()));
      } 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw b(null);
    } 
  }
  
  @SideOnly(Side.CLIENT)
  public boolean r() {
    Minecraft minecraft = Minecraft.func_71410_x();
    try {
      if (c()) {
        try {
          if (minecraft.field_71474_y.field_74320_O != 0);
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw b(null);
        } 
        return false;
      } 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw b(null);
    } 
  }
  
  protected void b(boolean paramBoolean) {
    try {
      if (!ab)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw b(null);
    } 
    try {
      if (d() == null)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw b(null);
    } 
    EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(d());
    try {
      if (entityPlayer == null)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw b(null);
    } 
    try {
      entityPlayer.field_71075_bZ.field_75101_c = paramBoolean;
      if (!paramBoolean)
        entityPlayer.field_71075_bZ.field_75100_b = false; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw b(null);
    } 
    entityPlayer.func_71016_p();
  }
  
  public static boolean g(UUID paramUUID) {
    e();
    for (Map.Entry<UUID, bo> entry : X.entrySet()) {
      UUID uUID = (UUID)entry.getKey();
      try {
        if (paramUUID.equals(uUID))
          return true; 
      } catch (ConcurrentModificationException concurrentModificationException) {
        throw b(null);
      } 
    } 
    return false;
  }
  
  public static boolean d(EntityPlayer paramEntityPlayer) {
    return g(paramEntityPlayer.getPersistentID());
  }
  
  protected EntityPlayer w() {
    List list = this.field_70170_p.field_73010_i;
    EntityPlayer entityPlayer = null;
    for (EntityPlayer entityPlayer1 : list) {
      try {
        if (entityPlayer1.getPersistentID().equals(((Optional)this.p.func_187225_a(ak)).get()))
          continue; 
      } catch (ConcurrentModificationException concurrentModificationException) {
        throw b(null);
      } 
      if (entityPlayer == null) {
        entityPlayer = entityPlayer1;
        continue;
      } 
      double d1 = entityPlayer.func_70092_e((t()).field_72450_a, (t()).field_72448_b, (t()).field_72449_c);
      double d2 = entityPlayer1.func_70092_e((t()).field_72450_a, (t()).field_72448_b, (t()).field_72449_c);
      if (d2 < d1)
        entityPlayer = entityPlayer1; 
    } 
    return entityPlayer;
  }
  
  @SideOnly(Side.CLIENT)
  public boolean E() {
    EntityPlayer entityPlayer = w();
    try {
      if (entityPlayer == null)
        return false; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw b(null);
    } 
    return entityPlayer.getPersistentID().equals((Minecraft.func_71410_x()).field_71439_g.getPersistentID());
  }
  
  public Vec3d t() {
    return new Vec3d(this.field_70165_t, this.field_70163_u - 0.0D, this.field_70161_v);
  }
  
  protected void d(UUID paramUUID) {
    EntityPlayerMP entityPlayerMP1 = (EntityPlayerMP)this.field_70170_p.func_152378_a(paramUUID);
    EntityPlayerMP entityPlayerMP2 = (EntityPlayerMP)this.field_70170_p.func_152378_a((UUID)((Optional)this.p.func_187225_a(ak)).get());
    aV.a.sendTo(new aw(false), entityPlayerMP1);
    aV.a.sendTo(new aw(false), entityPlayerMP2);
    e(paramUUID);
    this.field_70177_z = 0.0F;
    this.field_70759_as = 0.0F;
    entityPlayerMP1.field_70177_z = 180.0F;
    entityPlayerMP1.field_70759_as = 180.0F;
    entityPlayerMP1.func_189654_d(true);
    entityPlayerMP1.field_70145_X = true;
    Vec3d vec3d = func_174791_d();
    entityPlayerMP1.func_70634_a(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c + 1.0D);
    entityPlayerMP1.field_71075_bZ.field_75100_b = true;
    entityPlayerMP2.field_71075_bZ.field_75100_b = true;
    b(paramUUID);
    this.p.func_187227_b(z, Boolean.valueOf(true));
    a(vec3d);
    a(0.0F);
  }
  
  protected void func_180429_a(BlockPos paramBlockPos, Block paramBlock) {
    super.func_180429_a(paramBlockPos, paramBlock);
  }
  
  public AxisAlignedBB a(EntityPlayer paramEntityPlayer) {
    return paramEntityPlayer.func_174813_aQ();
  }
  
  public void func_70071_h_() {
    try {
      this.field_70145_X = true;
      func_189654_d(true);
      super.func_70071_h_();
      x();
      if (!this.field_70170_p.field_72995_K)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw b(null);
    } 
    try {
      if (c())
        cK.a.b(); 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw b(null);
    } 
  }
  
  @SideOnly(Side.CLIENT)
  void B() {
    (Minecraft.func_71410_x()).field_71439_g.eyeHeight = func_70047_e();
  }
  
  @SideOnly(Side.CLIENT)
  public boolean c() {
    try {
      if (!((Optional)this.p.func_187225_a(ak)).isPresent())
        return false; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw b(null);
    } 
    return ((UUID)((Optional)this.p.func_187225_a(ak)).get()).equals((Minecraft.func_71410_x()).field_71439_g.getPersistentID());
  }
  
  void e(EntityPlayer paramEntityPlayer) {
    NBTTagCompound nBTTagCompound = paramEntityPlayer.getEntityData();
    String str = nBTTagCompound.func_74779_i("sexmod:CustomModel" + bB.a((Entity)this));
    c(str);
  }
  
  public void func_70619_bc() {
    e();
    g();
    h();
    UUID uUID = d();
    try {
      if (uUID == null)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw b(null);
    } 
    EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(uUID);
    try {
      if (entityPlayer == null) {
        func_70634_a(this.field_70165_t, 0.0D, this.field_70161_v);
        return;
      } 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw b(null);
    } 
    e(entityPlayer);
    if (b()) {
      Vec3d vec3d = I();
      func_70634_a(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c);
    } else {
      func_70634_a(entityPlayer.field_70165_t, entityPlayer.field_70163_u + 0.0D, entityPlayer.field_70161_v);
    } 
    m m = o();
    try {
      if (m == m.NULL)
        try {
          if (entityPlayer.field_82175_bq)
            c(m.ATTACK); 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw b(null);
        }  
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw b(null);
    } 
    try {
      if (m == m.ATTACK)
        try {
          if (!entityPlayer.field_82175_bq)
            c(m.NULL); 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw b(null);
        }  
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw b(null);
    } 
  }
  
  void x() {
    try {
      if (this.ac == -1)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw b(null);
    } 
    try {
      this.ac++;
      if (!this.field_70170_p.field_72995_K)
        try {
          if (this.ac == 65) {
            try {
            
            } catch (ConcurrentModificationException concurrentModificationException) {
              throw b(null);
            } 
            c((L() == 0) ? 1 : 0);
          } 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw b(null);
        }  
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw b(null);
    } 
    try {
      if (this.ac < 100)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw b(null);
    } 
    try {
      if (o() != m.STRIP)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw b(null);
    } 
    try {
      if (this.field_70170_p.field_72995_K) {
        z();
        return;
      } 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw b(null);
    } 
    c(m.NULL);
  }
  
  @SideOnly(Side.CLIENT)
  void z() {
    if (c()) {
      Minecraft minecraft = Minecraft.func_71410_x();
      minecraft.field_71474_y.field_74320_O = 0;
      minecraft.field_71460_t.func_175066_a(minecraft.func_175606_aa());
      aK.a(true);
    } 
  }
  
  public void c(m paramm) {
    try {
      if (!this.field_70170_p.field_72995_K)
        try {
          if (paramm == m.NULL)
            try {
              if (b()) {
                System.out.println("prevented a potential animation break");
                return;
              } 
            } catch (ConcurrentModificationException concurrentModificationException) {
              throw b(null);
            }  
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw b(null);
        }  
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw b(null);
    } 
    try {
      if (paramm == m.STRIP) {
        try {
        
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw b(null);
        } 
        this.ac = this.field_70170_p.field_72995_K ? 5 : 0;
      } 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw b(null);
    } 
    super.c(paramm);
  }
  
  void c(EntityPlayer paramEntityPlayer) {
    this.p.func_187227_b(I, ItemStack.field_190927_a);
    this.p.func_187227_b(S, ItemStack.field_190927_a);
    this.p.func_187227_b(L, ItemStack.field_190927_a);
    this.p.func_187227_b(H, ItemStack.field_190927_a);
    for (ItemStack itemStack : paramEntityPlayer.func_184193_aE()) {
      try {
        if (itemStack.func_77973_b() instanceof net.minecraft.item.ItemElytra) {
          this.p.func_187227_b(S, itemStack);
          continue;
        } 
      } catch (ConcurrentModificationException concurrentModificationException) {
        throw b(null);
      } 
      try {
        if (!(itemStack.func_77973_b() instanceof ItemArmor))
          continue; 
      } catch (ConcurrentModificationException concurrentModificationException) {
        throw b(null);
      } 
      ItemArmor itemArmor = (ItemArmor)itemStack.func_77973_b();
      try {
        switch (a.a[itemArmor.func_185083_B_().ordinal()]) {
          case 1:
            this.p.func_187227_b(I, itemStack);
          case 2:
            this.p.func_187227_b(S, itemStack);
          case 3:
            this.p.func_187227_b(L, itemStack);
          case 4:
            this.p.func_187227_b(H, itemStack);
        } 
      } catch (ConcurrentModificationException concurrentModificationException) {
        throw b(null);
      } 
    } 
  }
  
  public UUID d() {
    try {
      if (((Optional)this.p.func_187225_a(ak)).isPresent())
        return (UUID)((Optional)this.p.func_187225_a(ak)).get(); 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw b(null);
    } 
    return null;
  }
  
  @Nullable
  public EntityPlayer m() {
    UUID uUID = d();
    try {
      if (uUID == null)
        return null; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw b(null);
    } 
    return this.field_70170_p.func_152378_a(uUID);
  }
  
  public void a(Optional<UUID> paramOptional) {
    this.p.func_187227_b(ak, paramOptional);
  }
  
  public void y() {}
  
  public void a() {}
  
  public static void e() {
    ArrayList<bo> arrayList = new ArrayList();
    try {
      for (bo bo1 : ah) {
        try {
          if (bo1.d() != null) {
            X.put(bo1.d(), bo1);
            arrayList.add(bo1);
          } 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw b(null);
        } 
      } 
    } catch (ConcurrentModificationException concurrentModificationException) {}
    for (bo bo1 : arrayList)
      ah.remove(bo1); 
    u();
  }
  
  static void u() {
    ArrayList arrayList = new ArrayList();
    for (Map.Entry<UUID, bo> entry : X.entrySet()) {
      try {
        if (((bo)entry.getValue()).field_70128_L)
          arrayList.add(entry.getKey()); 
      } catch (ConcurrentModificationException concurrentModificationException) {
        throw b(null);
      } 
    } 
    for (UUID uUID : arrayList)
      X.remove(uUID); 
  }
  
  protected boolean a(UUID paramUUID) {
    try {
      if (paramUUID == null)
        return false; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw b(null);
    } 
    bo bo1 = f(paramUUID);
    try {
    
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw b(null);
    } 
    return (bo1 != null);
  }
  
  public void a(String paramString, UUID paramUUID) {
    try {
      if (a(paramString))
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw b(null);
    } 
    try {
      if (!((Optional)this.p.func_187225_a(ak)).isPresent())
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw b(null);
    } 
    aV.a.sendToServer(new ap(paramString, paramUUID, (UUID)((Optional)this.p.func_187225_a(ak)).get(), this.af));
    this.af = true;
  }
  
  public void func_70014_b(NBTTagCompound paramNBTTagCompound) {
    super.func_70014_b(paramNBTTagCompound);
    paramNBTTagCompound.func_74778_a("owner", ((UUID)((Optional)this.p.func_187225_a(ak)).get()).toString());
  }
  
  public void func_70037_a(NBTTagCompound paramNBTTagCompound) {
    super.func_70037_a(paramNBTTagCompound);
    this.p.func_187227_b(ak, Optional.of(UUID.fromString(paramNBTTagCompound.func_74779_i("owner"))));
    ah.add(this);
  }
  
  public void a(SoundEvent paramSoundEvent, float paramFloat1, float paramFloat2) {
    Vec3d vec3d = t();
    try {
      if (this.field_70170_p.field_72995_K) {
        this.field_70170_p.func_184134_a(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c, paramSoundEvent, SoundCategory.NEUTRAL, paramFloat1, paramFloat2, false);
      } else {
        this.field_70170_p.func_184133_a(null, new BlockPos(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c), paramSoundEvent, SoundCategory.PLAYERS, paramFloat1, paramFloat2);
      } 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw b(null);
    } 
  }
  
  public void a(SoundEvent paramSoundEvent) {
    a(paramSoundEvent, 1.0F, 1.0F);
  }
  
  public void a(SoundEvent[] paramArrayOfSoundEvent) {
    a(paramArrayOfSoundEvent[func_70681_au().nextInt(paramArrayOfSoundEvent.length)], 1.0F, 1.0F);
  }
  
  public void a(SoundEvent paramSoundEvent, float paramFloat) {
    a(paramSoundEvent, paramFloat, 1.0F);
  }
  
  protected void q() {}
  
  private static ConcurrentModificationException b(ConcurrentModificationException paramConcurrentModificationException) {
    return paramConcurrentModificationException;
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\bo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */