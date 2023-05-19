package com.schnurritv.sexmod;

import com.google.common.base.Optional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockChest;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.monster.AbstractSkeleton;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraft.world.storage.WorldSavedData;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.player.PlayerSleepInBedEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class s {
  static final int d = 4;
  
  private static final HashMap<UUID, b> a = new HashMap<>();
  
  static final Vec3d[] c = new Vec3d[] { new Vec3d(0.0D, 0.0D, 0.0D), new Vec3d(0.5D, 0.0D, 0.0D), new Vec3d(-0.5D, 0.0D, 0.0D), new Vec3d(0.0D, 0.0D, 0.5D), new Vec3d(0.0D, 0.0D, -0.5D) };
  
  static HashMap<b3, BlockPos[]> b = (HashMap)new HashMap<>();
  
  public static void a() {
    a.clear();
    b.clear();
  }
  
  public static void a(World paramWorld, Vec3d paramVec3d) {
    UUID uUID = UUID.randomUUID();
    float[] arrayOfFloat = new float[4];
    arrayOfFloat[0] = 0.25F;
    byte b1 = 1;
    try {
      while (b1 < arrayOfFloat.length) {
        arrayOfFloat[b1] = b3.p();
        b1++;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    ArrayList<b3> arrayList = new ArrayList();
    for (float f : arrayOfFloat) {
      b3 b3 = b3.a(paramWorld, uUID, f);
      arrayList.add(b3);
    } 
    EyeAndKoboldColor eyeAndKoboldColor = EyeAndKoboldColor.values()[U.f.nextInt((EyeAndKoboldColor.values()).length)];
    b b = new b(uUID, eyeAndKoboldColor, arrayList.get(0), arrayList);
    a.put(uUID, b);
    byte b2 = 0;
    for (b3 b3 : arrayList) {
      b3.func_70107_b(paramVec3d.field_72450_a + (c[b2]).field_72450_a, paramVec3d.field_72448_b, paramVec3d.field_72449_c + (c[b2]).field_72449_c);
      paramWorld.func_72838_d((Entity)b3);
      b2++;
    } 
  }
  
  public static boolean k(UUID paramUUID) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (a.get(paramUUID) != null);
  }
  
  public static void a(UUID paramUUID1, UUID paramUUID2) {
    b b = a.get(paramUUID1);
    try {
      if (b == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    b.b(paramUUID2);
  }
  
  public static void a(UUID paramUUID, EyeAndKoboldColor paramEyeAndKoboldColor) {
    b b = a.get(paramUUID);
    try {
      if (b != null) {
        System.out.println("tribe of UUID " + paramUUID.toString() + " does already exist lol");
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    a.put(paramUUID, new b(paramUUID, paramEyeAndKoboldColor));
  }
  
  public static boolean a(BlockPos paramBlockPos) {
    for (Map.Entry<b3, BlockPos> entry : b.entrySet()) {
      BlockPos[] arrayOfBlockPos = (BlockPos[])entry.getValue();
      try {
        if (arrayOfBlockPos[0].equals(paramBlockPos))
          return true; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (arrayOfBlockPos[1].equals(paramBlockPos))
          return true; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    return false;
  }
  
  public static BlockPos[] a(b3 paramb3) {
    return b.get(paramb3);
  }
  
  public static void a(b3 paramb3, BlockPos paramBlockPos) {
    World world = paramb3.field_70170_p;
    BlockPos blockPos = null;
    if (world.func_180495_p(paramBlockPos.func_177978_c()).func_177230_c() instanceof net.minecraft.block.BlockBed)
      blockPos = paramBlockPos.func_177978_c(); 
    if (world.func_180495_p(paramBlockPos.func_177974_f()).func_177230_c() instanceof net.minecraft.block.BlockBed)
      blockPos = paramBlockPos.func_177974_f(); 
    if (world.func_180495_p(paramBlockPos.func_177968_d()).func_177230_c() instanceof net.minecraft.block.BlockBed)
      blockPos = paramBlockPos.func_177968_d(); 
    if (world.func_180495_p(paramBlockPos.func_177976_e()).func_177230_c() instanceof net.minecraft.block.BlockBed)
      blockPos = paramBlockPos.func_177976_e(); 
    try {
      if (blockPos == null) {
        System.out.println("bed @" + paramBlockPos.toString() + " apparently doesn't have another half.. wtf");
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    b.put(paramb3, new BlockPos[] { paramBlockPos, blockPos });
  }
  
  public static void b(b3 paramb3) {
    b.remove(paramb3);
  }
  
  public static void c(UUID paramUUID, b3 paramb3) {
    b b = a.get(paramUUID);
    try {
      if (b == null) {
        System.out.println("tribe of UUID " + paramUUID.toString() + " not found uwu");
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    b.c = paramb3;
  }
  
  public static void a(UUID paramUUID, b3 paramb3) {
    b b = a.get(paramUUID);
    try {
      if (b == null) {
        System.out.println("tribe of UUID " + paramUUID.toString() + " not found uwu");
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      b.a(paramb3);
      a.replace(paramUUID, b);
      paramb3.func_184212_Q().func_187227_b(b3.aC, Optional.of(paramUUID));
      if (!paramb3.ab)
        paramb3.func_184212_Q().func_187227_b(b3.G, b.m.toString()); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public static void e(UUID paramUUID) {
    b b = a.get(paramUUID);
    try {
      if (b == null) {
        System.out.println("tribe of UUID " + paramUUID.toString() + " not found uwu");
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    b3 b3 = b.c;
    try {
      if (b3 != null) {
        try {
          if (b3.field_70128_L) {
            b.c = b.c();
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    b.c = b.c();
  }
  
  public static void d(UUID paramUUID, b3 paramb3) {
    b b = a.get(paramUUID);
    try {
      if (b == null) {
        System.out.println("tribe of UUID " + paramUUID.toString() + " not found uwu");
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      b.b(paramb3);
      b.a(paramb3.N());
      if (b.c != null && b.c.func_145782_y() == paramb3.func_145782_y()) {
        b3 b31 = b.c();
        try {
          if (b31 != null)
            b.c = b31; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    for (g g : b.h)
      g.b(paramb3); 
    try {
      if (!b.k.isEmpty()) {
        a.replace(paramUUID, b);
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!paramb3.O())
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    EntityPlayer entityPlayer = paramb3.l();
    if (entityPlayer != null) {
      HashSet<BlockPos> hashSet = new HashSet();
      hashSet.addAll(b.a);
      hashSet.addAll(b.l);
      for (g g : b.h)
        hashSet.addAll(g.a); 
      aV.a.sendTo(new B(hashSet, false), (EntityPlayerMP)entityPlayer);
      entityPlayer.func_145747_a((ITextComponent)new TextComponentString(String.format("ur %stribe %shas been %seradicated %suwu", new Object[] { TextFormatting.RED, TextFormatting.WHITE, TextFormatting.RED, TextFormatting.WHITE })));
    } 
  }
  
  @Nullable
  public static b3 i(UUID paramUUID) {
    b b = a.get(paramUUID);
    try {
      if (b == null) {
        System.out.println("tribe of UUID " + paramUUID.toString() + " not found uwu");
        return null;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return b.c;
  }
  
  public static boolean e(UUID paramUUID, b3 paramb3) {
    b b = a.get(paramUUID);
    try {
      if (b == null) {
        System.out.println("tribe of UUID " + paramUUID.toString() + " not found uwu");
        return false;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (b.c == null)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (b.c.func_145782_y() == paramb3.func_145782_y());
  }
  
  public static EyeAndKoboldColor p(UUID paramUUID) {
    b b = a.get(paramUUID);
    try {
      if (b == null) {
        System.out.println("tribe of UUID " + paramUUID.toString() + " not found uwu");
        return b3.aP;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return b.m;
  }
  
  public static HashSet<BlockPos> c(UUID paramUUID) {
    b b = a.get(paramUUID);
    try {
      if (b == null) {
        System.out.println("tribe of UUID " + paramUUID.toString() + " not found uwu");
        return new HashSet<>();
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return b.l;
  }
  
  public static void d(UUID paramUUID, BlockPos paramBlockPos) {
    try {
      if (paramBlockPos == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    b b = a.get(paramUUID);
    try {
      if (b == null) {
        System.out.println("tribe of UUID " + paramUUID.toString() + " not found uwu");
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    b.l.add(paramBlockPos);
  }
  
  public static void f(UUID paramUUID, BlockPos paramBlockPos) {
    b b = a.get(paramUUID);
    try {
      if (b == null) {
        System.out.println("tribe of UUID " + paramUUID.toString() + " not found uwu");
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    b.l.remove(paramBlockPos);
  }
  
  public static HashSet<BlockPos> o(UUID paramUUID) {
    b b = a.get(paramUUID);
    try {
      if (b == null) {
        System.out.println("tribe of UUID " + paramUUID.toString() + " not found uwu");
        return null;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return b.a;
  }
  
  public static void e(UUID paramUUID, BlockPos paramBlockPos) {
    try {
      if (paramBlockPos == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    b b = a.get(paramUUID);
    try {
      if (b == null) {
        System.out.println("tribe of UUID " + paramUUID.toString() + " not found uwu");
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    b.a.add(paramBlockPos);
  }
  
  public static void b(UUID paramUUID, BlockPos paramBlockPos) {
    b b = a.get(paramUUID);
    try {
      if (b == null) {
        System.out.println("tribe of UUID " + paramUUID.toString() + " not found uwu");
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    b.a.remove(paramBlockPos);
  }
  
  public static HashSet<BlockPos> a(UUID paramUUID, g paramg) {
    b b = a.get(paramUUID);
    try {
      if (b == null) {
        System.out.println("tribe of UUID " + paramUUID.toString() + " not found uwu");
        return new HashSet<>();
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramg != null) {
        b.b(paramg);
        return paramg.a;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return new HashSet<>();
  }
  
  public static HashSet<BlockPos> a(UUID paramUUID, BlockPos paramBlockPos) {
    b b = a.get(paramUUID);
    try {
      if (b == null) {
        System.out.println("tribe of UUID " + paramUUID.toString() + " not found uwu");
        return new HashSet<>();
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    g g = null;
    for (g g1 : b.h) {
      if (g1.a.contains(paramBlockPos)) {
        g = g1;
        break;
      } 
    } 
    return a(paramUUID, g);
  }
  
  public static void b(UUID paramUUID, g paramg) {
    b b = a.get(paramUUID);
    try {
      if (b == null) {
        System.out.println("tribe of UUID " + paramUUID.toString() + " not found uwu");
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    b.a(paramg);
  }
  
  public static void b(UUID paramUUID, b3 paramb3) {
    b b = a.get(paramUUID);
    try {
      if (b == null) {
        System.out.println("tribe of UUID " + paramUUID.toString() + " not found uwu");
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    g g = null;
    for (g g1 : b.h) {
      if (g1.c(paramb3))
        g = g1; 
    } 
    try {
      if (g == null) {
        System.out.println("task of worker " + paramb3.N() + " not found uwu");
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    b.b(g);
  }
  
  @Nullable
  public static Collection<g> j(UUID paramUUID) {
    b b = a.get(paramUUID);
    try {
      if (b == null) {
        System.out.println("tribe of UUID " + paramUUID.toString() + " not found uwu");
        return null;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return b.h;
  }
  
  public static T q(UUID paramUUID) {
    b b = a.get(paramUUID);
    try {
      if (b == null) {
        System.out.println("tribe of UUID " + paramUUID.toString() + " not found uwu");
        return T.REST;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return b.a();
  }
  
  public static void a(UUID paramUUID, T paramT) {
    b b = a.get(paramUUID);
    try {
      if (b == null) {
        System.out.println("tribe of UUID " + paramUUID.toString() + " not found uwu");
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    b.a(paramT);
  }
  
  public static int d(UUID paramUUID) {
    b b = a.get(paramUUID);
    try {
      if (b == null) {
        System.out.println("tribe of UUID " + paramUUID.toString() + " not found uwu");
        return 0;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return b.e();
  }
  
  public static List<b3> m(UUID paramUUID) {
    b b = a.get(paramUUID);
    try {
      if (b == null) {
        System.out.println("tribe of UUID " + paramUUID.toString() + " not found uwu");
        return new ArrayList<>();
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return b.k;
  }
  
  public static void c(UUID paramUUID, BlockPos paramBlockPos) {
    b b = a.get(paramUUID);
    try {
      if (b == null) {
        System.out.println("tribe of UUID " + paramUUID.toString() + " not found uwu");
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    b.a(paramBlockPos);
  }
  
  @Nullable
  public static BlockPos l(UUID paramUUID) {
    b b = a.get(paramUUID);
    try {
      if (b == null) {
        System.out.println("tribe of UUID " + paramUUID.toString() + " not found uwu");
        return null;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return b.f();
  }
  
  public static HashSet<EntityLivingBase> b(UUID paramUUID) {
    b b = a.get(paramUUID);
    try {
      if (b == null) {
        System.out.println("tribe of UUID " + paramUUID.toString() + " not found uwu");
        return new HashSet<>();
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return b.g();
  }
  
  public static void b(UUID paramUUID, EntityLivingBase paramEntityLivingBase) {
    b b = a.get(paramUUID);
    try {
      if (b == null) {
        System.out.println("tribe of UUID " + paramUUID.toString() + " not found uwu");
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    b.b(paramEntityLivingBase);
  }
  
  public static void a(UUID paramUUID, EntityLivingBase paramEntityLivingBase) {
    b b = a.get(paramUUID);
    try {
      if (b == null) {
        System.out.println("tribe of UUID " + paramUUID.toString() + " not found uwu");
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    b.a(paramEntityLivingBase);
  }
  
  public static boolean g(UUID paramUUID) {
    b b = a.get(paramUUID);
    try {
      if (b == null) {
        System.out.println("tribe of UUID " + paramUUID.toString() + " not found uwu");
        return false;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    for (b3 b3 : b.k) {
      try {
        if (b3.n() != null)
          return true; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    return false;
  }
  
  public static boolean h(UUID paramUUID) {
    b b = a.get(paramUUID);
    try {
      if (b == null) {
        System.out.println("tribe of UUID " + paramUUID.toString() + " not found uwu");
        return false;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return b.e;
  }
  
  public static void a(UUID paramUUID, boolean paramBoolean) {
    b b = a.get(paramUUID);
    try {
      if (b == null) {
        System.out.println("tribe of UUID " + paramUUID.toString() + " not found uwu");
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    b.e = paramBoolean;
  }
  
  @Nullable
  public static UUID a(UUID paramUUID) {
    try {
      if (paramUUID == null)
        return null; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    for (Map.Entry<UUID, b> entry : a.entrySet()) {
      b b = (b)entry.getValue();
      try {
        if (b.b().size() == 0)
          try {
            if (b.e() == 0)
              continue; 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (paramUUID.equals(((b)entry.getValue()).d()))
          return (UUID)entry.getKey(); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    return null;
  }
  
  @Nullable
  public static UUID n(UUID paramUUID) {
    b b = a.get(paramUUID);
    try {
      if (b == null) {
        System.out.println("tribe of UUID " + paramUUID.toString() + " not found uwu");
        return null;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    List<b3> list = b.k;
    try {
      if (list.isEmpty())
        return null; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    b3 b3 = list.get(0);
    try {
      if (!b3.O())
        return null; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    String str = (String)((b3)list.get(0)).func_184212_Q().func_187225_a(bS.b);
    return UUID.fromString(str);
  }
  
  public static HashSet<BlockPos> f(UUID paramUUID) {
    b b = a.get(paramUUID);
    HashSet<BlockPos> hashSet = new HashSet();
    try {
      if (b == null) {
        System.out.println("tribe of UUID " + paramUUID.toString() + " not found uwu");
        return hashSet;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    for (g g : b.h)
      hashSet.addAll(g.a); 
    hashSet.addAll(b.a);
    hashSet.addAll(b.l);
    return hashSet;
  }
  
  public static HashMap<UUID, BlockPos> a(UUID paramUUID, World paramWorld) {
    b b = a.get(paramUUID);
    try {
      if (b == null) {
        System.out.println("tribe of UUID " + paramUUID.toString() + " not found uwu");
        return new HashMap<>();
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    HashMap<UUID, BlockPos> hashMap = b.g;
    ArrayList<UUID> arrayList = new ArrayList();
    for (Map.Entry<UUID, BlockPos> entry : hashMap.entrySet()) {
      BlockPos blockPos = (BlockPos)entry.getValue();
      UUID uUID = (UUID)entry.getKey();
      try {
        if (!paramWorld.func_175697_a(blockPos, 5))
          continue; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      AxisAlignedBB axisAlignedBB = new AxisAlignedBB(blockPos.func_177973_b(new Vec3i(-3, -3, -3)), blockPos.func_177982_a(3, 3, 3));
      List list = paramWorld.func_72872_a(b3.class, axisAlignedBB);
      boolean bool = false;
      for (b3 b3 : list) {
        if (uUID.equals(b3.N())) {
          bool = true;
          break;
        } 
      } 
      try {
        if (!bool)
          arrayList.add(uUID); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    for (UUID uUID : arrayList) {
      System.out.println("fail save of non existant members was called");
      hashMap.remove(uUID);
    } 
    b.g = hashMap;
    return hashMap;
  }
  
  public static void a(UUID paramUUID1, UUID paramUUID2, BlockPos paramBlockPos) {
    b b = a.get(paramUUID1);
    try {
      if (b == null) {
        System.out.println("tribe of UUID " + paramUUID1.toString() + " not found uwu");
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    b.a(paramUUID2, paramBlockPos);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  public static class a extends WorldSavedData {
    public a(String param1String) {
      super(param1String);
    }
    
    @SubscribeEvent
    public void a(WorldEvent.Save param1Save) {
      World world = param1Save.getWorld();
      world.func_175693_T().func_75745_a("tribes", this);
      func_76185_a();
    }
    
    @SubscribeEvent
    public void a(WorldEvent.Load param1Load) {
      World world = param1Load.getWorld();
      world.func_175693_T().func_75742_a(a.class, "tribes");
    }
    
    @SubscribeEvent
    public void a(PlayerSleepInBedEvent param1PlayerSleepInBedEvent) {
      try {
        if (s.a(param1PlayerSleepInBedEvent.getPos()))
          param1PlayerSleepInBedEvent.setResult(EntityPlayer.SleepResult.OTHER_PROBLEM); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    }
    
    @SubscribeEvent
    public void a(BlockEvent.PlaceEvent param1PlaceEvent) {
      BlockPos blockPos1 = param1PlaceEvent.getPos();
      IBlockState iBlockState = param1PlaceEvent.getState();
      World world = param1PlaceEvent.getWorld();
      try {
        if (world.field_72995_K)
          return; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (!(iBlockState.func_177230_c() instanceof BlockChest))
          return; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      BlockChest.Type type = ((BlockChest)world.func_180495_p(blockPos1).func_177230_c()).field_149956_a;
      BlockPos blockPos2 = null;
      try {
        if (world.func_180495_p(blockPos1.func_177978_c()).func_177230_c() instanceof BlockChest && type.equals(((BlockChest)world.func_180495_p(blockPos1.func_177978_c()).func_177230_c()).field_149956_a))
          blockPos2 = blockPos1.func_177978_c(); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (world.func_180495_p(blockPos1.func_177974_f()).func_177230_c() instanceof BlockChest && type.equals(((BlockChest)world.func_180495_p(blockPos1.func_177974_f()).func_177230_c()).field_149956_a))
          blockPos2 = blockPos1.func_177974_f(); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (world.func_180495_p(blockPos1.func_177968_d()).func_177230_c() instanceof BlockChest && type.equals(((BlockChest)world.func_180495_p(blockPos1.func_177968_d()).func_177230_c()).field_149956_a))
          blockPos2 = blockPos1.func_177968_d(); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (world.func_180495_p(blockPos1.func_177976_e()).func_177230_c() instanceof BlockChest && type.equals(((BlockChest)world.func_180495_p(blockPos1.func_177976_e()).func_177230_c()).field_149956_a))
          blockPos2 = blockPos1.func_177976_e(); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (blockPos2 == null)
          return; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      for (Map.Entry entry : s.a.entrySet()) {
        s.b b = (s.b)entry.getValue();
        try {
          if (!b.a.contains(blockPos2))
            continue; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        b.a.add(blockPos1);
        UUID uUID = s.n((UUID)entry.getKey());
        try {
          if (uUID == null)
            continue; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        EntityPlayerMP entityPlayerMP = (EntityPlayerMP)world.func_152378_a(uUID);
        try {
          if (entityPlayerMP == null)
            continue; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        aV.a.sendTo(new B(blockPos1, true), entityPlayerMP);
      } 
    }
    
    @SubscribeEvent
    public void a(EntityJoinWorldEvent param1EntityJoinWorldEvent) {
      Entity entity = param1EntityJoinWorldEvent.getEntity();
      if (entity instanceof EntityZombie) {
        EntityZombie entityZombie = (EntityZombie)entity;
        entityZombie.field_70715_bh.func_75776_a(3, (EntityAIBase)new av((EntityCreature)entityZombie, true, false));
      } 
      if (entity instanceof AbstractSkeleton) {
        AbstractSkeleton abstractSkeleton = (AbstractSkeleton)entity;
        abstractSkeleton.field_70715_bh.func_75776_a(3, (EntityAIBase)new av((EntityCreature)abstractSkeleton, true, false));
      } 
      if (entity instanceof EntitySpider) {
        EntitySpider entitySpider = (EntitySpider)entity;
        entitySpider.field_70715_bh.func_75776_a(3, (EntityAIBase)new av((EntityCreature)entitySpider, true, true));
      } 
    }
    
    @SubscribeEvent
    public void a(BlockEvent.BreakEvent param1BreakEvent) {
      BlockPos blockPos = param1BreakEvent.getPos();
      World world = param1BreakEvent.getWorld();
      try {
        if (world.field_72995_K)
          return; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      IBlockState iBlockState = world.func_180495_p(blockPos);
      Block block = iBlockState.func_177230_c();
      if (block instanceof BlockChest)
        for (Map.Entry entry : s.a.entrySet()) {
          s.b b = (s.b)entry.getValue();
          try {
            if (!b.a.contains(blockPos))
              continue; 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          b.a.remove(blockPos);
          UUID uUID = s.n((UUID)entry.getKey());
          try {
            if (uUID == null)
              continue; 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          EntityPlayerMP entityPlayerMP = (EntityPlayerMP)world.func_152378_a(uUID);
          try {
            if (entityPlayerMP == null)
              continue; 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          aV.a.sendTo(new B(blockPos, false), entityPlayerMP);
        }  
      if (block instanceof net.minecraft.block.BlockBed)
        for (Map.Entry entry : s.a.entrySet()) {
          s.b b = (s.b)entry.getValue();
          try {
            if (!b.l.contains(blockPos))
              continue; 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          BlockPos blockPos1 = aH.a(blockPos, iBlockState);
          b.l.remove(blockPos);
          b.l.remove(blockPos1);
          UUID uUID = s.n((UUID)entry.getKey());
          try {
            if (uUID == null)
              continue; 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          EntityPlayerMP entityPlayerMP = (EntityPlayerMP)world.func_152378_a(uUID);
          try {
            if (entityPlayerMP == null)
              continue; 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          HashSet<BlockPos> hashSet = new HashSet();
          hashSet.add(blockPos);
          hashSet.add(blockPos1);
          aV.a.sendTo(new B(hashSet, false), entityPlayerMP);
        }  
    }
    
    String a(String param1String, NBTTagCompound param1NBTTagCompound) {
      String str = param1NBTTagCompound.func_74779_i(param1String);
      param1NBTTagCompound.func_74778_a(param1String, "");
      return str;
    }
    
    public void func_76184_a(NBTTagCompound param1NBTTagCompound) {
      // Byte code:
      //   0: iconst_0
      //   1: istore_2
      //   2: aload_0
      //   3: new java/lang/StringBuilder
      //   6: dup
      //   7: invokespecial <init> : ()V
      //   10: ldc 'tribeId'
      //   12: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   15: iload_2
      //   16: invokevirtual append : (I)Ljava/lang/StringBuilder;
      //   19: invokevirtual toString : ()Ljava/lang/String;
      //   22: aload_1
      //   23: invokevirtual a : (Ljava/lang/String;Lnet/minecraft/nbt/NBTTagCompound;)Ljava/lang/String;
      //   26: astore_3
      //   27: ldc ''
      //   29: aload_3
      //   30: invokevirtual equals : (Ljava/lang/Object;)Z
      //   33: ifeq -> 43
      //   36: goto -> 873
      //   39: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      //   42: athrow
      //   43: aload_3
      //   44: invokestatic fromString : (Ljava/lang/String;)Ljava/util/UUID;
      //   47: astore #4
      //   49: aload_0
      //   50: new java/lang/StringBuilder
      //   53: dup
      //   54: invokespecial <init> : ()V
      //   57: ldc 'tribeColor'
      //   59: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   62: iload_2
      //   63: invokevirtual append : (I)Ljava/lang/StringBuilder;
      //   66: invokevirtual toString : ()Ljava/lang/String;
      //   69: aload_1
      //   70: invokevirtual a : (Ljava/lang/String;Lnet/minecraft/nbt/NBTTagCompound;)Ljava/lang/String;
      //   73: invokestatic valueOf : (Ljava/lang/String;)Lcom/schnurritv/sexmod/EyeAndKoboldColor;
      //   76: astore #5
      //   78: aload #4
      //   80: aload #5
      //   82: invokestatic a : (Ljava/util/UUID;Lcom/schnurritv/sexmod/EyeAndKoboldColor;)V
      //   85: aload_0
      //   86: new java/lang/StringBuilder
      //   89: dup
      //   90: invokespecial <init> : ()V
      //   93: ldc 'tribeMaster'
      //   95: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   98: iload_2
      //   99: invokevirtual append : (I)Ljava/lang/StringBuilder;
      //   102: invokevirtual toString : ()Ljava/lang/String;
      //   105: aload_1
      //   106: invokevirtual a : (Ljava/lang/String;Lnet/minecraft/nbt/NBTTagCompound;)Ljava/lang/String;
      //   109: astore #6
      //   111: ldc ''
      //   113: aload #6
      //   115: invokevirtual equals : (Ljava/lang/Object;)Z
      //   118: ifne -> 138
      //   121: aload #4
      //   123: aload #6
      //   125: invokestatic fromString : (Ljava/lang/String;)Ljava/util/UUID;
      //   128: invokestatic a : (Ljava/util/UUID;Ljava/util/UUID;)V
      //   131: goto -> 138
      //   134: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      //   137: athrow
      //   138: iconst_0
      //   139: istore #7
      //   141: aload_0
      //   142: new java/lang/StringBuilder
      //   145: dup
      //   146: invokespecial <init> : ()V
      //   149: aload #4
      //   151: invokevirtual toString : ()Ljava/lang/String;
      //   154: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   157: ldc 'member'
      //   159: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   162: iload #7
      //   164: invokevirtual append : (I)Ljava/lang/StringBuilder;
      //   167: ldc 'pos'
      //   169: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   172: invokevirtual toString : ()Ljava/lang/String;
      //   175: aload_1
      //   176: invokevirtual a : (Ljava/lang/String;Lnet/minecraft/nbt/NBTTagCompound;)Ljava/lang/String;
      //   179: astore #8
      //   181: ldc ''
      //   183: aload #8
      //   185: invokevirtual equals : (Ljava/lang/Object;)Z
      //   188: ifeq -> 198
      //   191: goto -> 316
      //   194: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      //   197: athrow
      //   198: aload_0
      //   199: new java/lang/StringBuilder
      //   202: dup
      //   203: invokespecial <init> : ()V
      //   206: aload #4
      //   208: invokevirtual toString : ()Ljava/lang/String;
      //   211: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   214: ldc 'member'
      //   216: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   219: iload #7
      //   221: invokevirtual append : (I)Ljava/lang/StringBuilder;
      //   224: ldc 'id'
      //   226: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   229: invokevirtual toString : ()Ljava/lang/String;
      //   232: aload_1
      //   233: invokevirtual a : (Ljava/lang/String;Lnet/minecraft/nbt/NBTTagCompound;)Ljava/lang/String;
      //   236: astore #9
      //   238: ldc ''
      //   240: aload #9
      //   242: invokevirtual equals : (Ljava/lang/Object;)Z
      //   245: ifeq -> 255
      //   248: goto -> 316
      //   251: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      //   254: athrow
      //   255: aload #8
      //   257: ldc '\|'
      //   259: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
      //   262: astore #10
      //   264: new net/minecraft/util/math/BlockPos
      //   267: dup
      //   268: aload #10
      //   270: iconst_0
      //   271: aaload
      //   272: invokestatic parseInt : (Ljava/lang/String;)I
      //   275: aload #10
      //   277: iconst_1
      //   278: aaload
      //   279: invokestatic parseInt : (Ljava/lang/String;)I
      //   282: aload #10
      //   284: iconst_2
      //   285: aaload
      //   286: invokestatic parseInt : (Ljava/lang/String;)I
      //   289: invokespecial <init> : (III)V
      //   292: astore #11
      //   294: aload #9
      //   296: invokestatic fromString : (Ljava/lang/String;)Ljava/util/UUID;
      //   299: astore #12
      //   301: aload #4
      //   303: aload #12
      //   305: aload #11
      //   307: invokestatic a : (Ljava/util/UUID;Ljava/util/UUID;Lnet/minecraft/util/math/BlockPos;)V
      //   310: iinc #7, 1
      //   313: goto -> 141
      //   316: iconst_0
      //   317: istore #8
      //   319: aload_0
      //   320: new java/lang/StringBuilder
      //   323: dup
      //   324: invokespecial <init> : ()V
      //   327: aload #4
      //   329: invokevirtual toString : ()Ljava/lang/String;
      //   332: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   335: ldc 'bed'
      //   337: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   340: iload #8
      //   342: invokevirtual append : (I)Ljava/lang/StringBuilder;
      //   345: invokevirtual toString : ()Ljava/lang/String;
      //   348: aload_1
      //   349: invokevirtual a : (Ljava/lang/String;Lnet/minecraft/nbt/NBTTagCompound;)Ljava/lang/String;
      //   352: astore #9
      //   354: ldc ''
      //   356: aload #9
      //   358: invokevirtual equals : (Ljava/lang/Object;)Z
      //   361: ifeq -> 371
      //   364: goto -> 423
      //   367: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      //   370: athrow
      //   371: aload #9
      //   373: ldc '\|'
      //   375: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
      //   378: astore #10
      //   380: new net/minecraft/util/math/BlockPos
      //   383: dup
      //   384: aload #10
      //   386: iconst_0
      //   387: aaload
      //   388: invokestatic parseInt : (Ljava/lang/String;)I
      //   391: aload #10
      //   393: iconst_1
      //   394: aaload
      //   395: invokestatic parseInt : (Ljava/lang/String;)I
      //   398: aload #10
      //   400: iconst_2
      //   401: aaload
      //   402: invokestatic parseInt : (Ljava/lang/String;)I
      //   405: invokespecial <init> : (III)V
      //   408: astore #11
      //   410: aload #4
      //   412: aload #11
      //   414: invokestatic d : (Ljava/util/UUID;Lnet/minecraft/util/math/BlockPos;)V
      //   417: iinc #8, 1
      //   420: goto -> 319
      //   423: iconst_0
      //   424: istore #9
      //   426: aload_0
      //   427: new java/lang/StringBuilder
      //   430: dup
      //   431: invokespecial <init> : ()V
      //   434: aload #4
      //   436: invokevirtual toString : ()Ljava/lang/String;
      //   439: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   442: ldc 'chest'
      //   444: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   447: iload #9
      //   449: invokevirtual append : (I)Ljava/lang/StringBuilder;
      //   452: invokevirtual toString : ()Ljava/lang/String;
      //   455: aload_1
      //   456: invokevirtual a : (Ljava/lang/String;Lnet/minecraft/nbt/NBTTagCompound;)Ljava/lang/String;
      //   459: astore #10
      //   461: ldc ''
      //   463: aload #10
      //   465: invokevirtual equals : (Ljava/lang/Object;)Z
      //   468: ifeq -> 478
      //   471: goto -> 530
      //   474: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      //   477: athrow
      //   478: aload #10
      //   480: ldc '\|'
      //   482: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
      //   485: astore #11
      //   487: new net/minecraft/util/math/BlockPos
      //   490: dup
      //   491: aload #11
      //   493: iconst_0
      //   494: aaload
      //   495: invokestatic parseInt : (Ljava/lang/String;)I
      //   498: aload #11
      //   500: iconst_1
      //   501: aaload
      //   502: invokestatic parseInt : (Ljava/lang/String;)I
      //   505: aload #11
      //   507: iconst_2
      //   508: aaload
      //   509: invokestatic parseInt : (Ljava/lang/String;)I
      //   512: invokespecial <init> : (III)V
      //   515: astore #12
      //   517: aload #4
      //   519: aload #12
      //   521: invokestatic e : (Ljava/util/UUID;Lnet/minecraft/util/math/BlockPos;)V
      //   524: iinc #9, 1
      //   527: goto -> 426
      //   530: iconst_0
      //   531: istore #10
      //   533: aload_0
      //   534: new java/lang/StringBuilder
      //   537: dup
      //   538: invokespecial <init> : ()V
      //   541: aload #4
      //   543: invokevirtual toString : ()Ljava/lang/String;
      //   546: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   549: iload #10
      //   551: invokevirtual append : (I)Ljava/lang/StringBuilder;
      //   554: ldc 'taskKind'
      //   556: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   559: invokevirtual toString : ()Ljava/lang/String;
      //   562: aload_1
      //   563: invokevirtual a : (Ljava/lang/String;Lnet/minecraft/nbt/NBTTagCompound;)Ljava/lang/String;
      //   566: astore #11
      //   568: ldc ''
      //   570: aload #11
      //   572: invokevirtual equals : (Ljava/lang/Object;)Z
      //   575: ifeq -> 585
      //   578: goto -> 867
      //   581: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      //   584: athrow
      //   585: aload_0
      //   586: new java/lang/StringBuilder
      //   589: dup
      //   590: invokespecial <init> : ()V
      //   593: aload #4
      //   595: invokevirtual toString : ()Ljava/lang/String;
      //   598: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   601: iload #10
      //   603: invokevirtual append : (I)Ljava/lang/StringBuilder;
      //   606: ldc 'facing'
      //   608: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   611: invokevirtual toString : ()Ljava/lang/String;
      //   614: aload_1
      //   615: invokevirtual a : (Ljava/lang/String;Lnet/minecraft/nbt/NBTTagCompound;)Ljava/lang/String;
      //   618: astore #12
      //   620: getstatic net/minecraft/util/EnumFacing.NORTH : Lnet/minecraft/util/EnumFacing;
      //   623: astore #13
      //   625: ldc ''
      //   627: aload #12
      //   629: invokevirtual equals : (Ljava/lang/Object;)Z
      //   632: ifne -> 642
      //   635: aload #12
      //   637: invokestatic func_176739_a : (Ljava/lang/String;)Lnet/minecraft/util/EnumFacing;
      //   640: astore #13
      //   642: aload_0
      //   643: new java/lang/StringBuilder
      //   646: dup
      //   647: invokespecial <init> : ()V
      //   650: aload #4
      //   652: invokevirtual toString : ()Ljava/lang/String;
      //   655: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   658: iload #10
      //   660: invokevirtual append : (I)Ljava/lang/StringBuilder;
      //   663: ldc 'pos'
      //   665: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   668: invokevirtual toString : ()Ljava/lang/String;
      //   671: aload_1
      //   672: invokevirtual a : (Ljava/lang/String;Lnet/minecraft/nbt/NBTTagCompound;)Ljava/lang/String;
      //   675: astore #14
      //   677: aload #14
      //   679: ldc '\|'
      //   681: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
      //   684: astore #15
      //   686: new net/minecraft/util/math/BlockPos
      //   689: dup
      //   690: aload #15
      //   692: iconst_0
      //   693: aaload
      //   694: invokestatic parseInt : (Ljava/lang/String;)I
      //   697: aload #15
      //   699: iconst_1
      //   700: aaload
      //   701: invokestatic parseInt : (Ljava/lang/String;)I
      //   704: aload #15
      //   706: iconst_2
      //   707: aaload
      //   708: invokestatic parseInt : (Ljava/lang/String;)I
      //   711: invokespecial <init> : (III)V
      //   714: astore #16
      //   716: new java/util/HashSet
      //   719: dup
      //   720: invokespecial <init> : ()V
      //   723: astore #17
      //   725: iconst_0
      //   726: istore #18
      //   728: aload_0
      //   729: new java/lang/StringBuilder
      //   732: dup
      //   733: invokespecial <init> : ()V
      //   736: aload #4
      //   738: invokevirtual toString : ()Ljava/lang/String;
      //   741: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   744: iload #10
      //   746: invokevirtual append : (I)Ljava/lang/StringBuilder;
      //   749: ldc 'block'
      //   751: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   754: iload #18
      //   756: invokevirtual append : (I)Ljava/lang/StringBuilder;
      //   759: invokevirtual toString : ()Ljava/lang/String;
      //   762: aload_1
      //   763: invokevirtual a : (Ljava/lang/String;Lnet/minecraft/nbt/NBTTagCompound;)Ljava/lang/String;
      //   766: astore #19
      //   768: ldc ''
      //   770: aload #19
      //   772: invokevirtual equals : (Ljava/lang/Object;)Z
      //   775: ifeq -> 785
      //   778: goto -> 838
      //   781: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      //   784: athrow
      //   785: aload #19
      //   787: ldc '\|'
      //   789: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
      //   792: astore #20
      //   794: new net/minecraft/util/math/BlockPos
      //   797: dup
      //   798: aload #20
      //   800: iconst_0
      //   801: aaload
      //   802: invokestatic parseInt : (Ljava/lang/String;)I
      //   805: aload #20
      //   807: iconst_1
      //   808: aaload
      //   809: invokestatic parseInt : (Ljava/lang/String;)I
      //   812: aload #20
      //   814: iconst_2
      //   815: aaload
      //   816: invokestatic parseInt : (Ljava/lang/String;)I
      //   819: invokespecial <init> : (III)V
      //   822: astore #21
      //   824: aload #17
      //   826: aload #21
      //   828: invokevirtual add : (Ljava/lang/Object;)Z
      //   831: pop
      //   832: iinc #18, 1
      //   835: goto -> 728
      //   838: aload #4
      //   840: new com/schnurritv/sexmod/g
      //   843: dup
      //   844: aload #16
      //   846: aload #11
      //   848: invokestatic valueOf : (Ljava/lang/String;)Lcom/schnurritv/sexmod/g$a;
      //   851: aload #17
      //   853: aload #13
      //   855: invokespecial <init> : (Lnet/minecraft/util/math/BlockPos;Lcom/schnurritv/sexmod/g$a;Ljava/util/HashSet;Lnet/minecraft/util/EnumFacing;)V
      //   858: invokestatic b : (Ljava/util/UUID;Lcom/schnurritv/sexmod/g;)V
      //   861: iinc #10, 1
      //   864: goto -> 533
      //   867: iinc #2, 1
      //   870: goto -> 2
      //   873: return
      // Exception table:
      //   from	to	target	type
      //   27	39	39	java/lang/RuntimeException
      //   111	131	134	java/lang/RuntimeException
      //   181	194	194	java/lang/RuntimeException
      //   238	251	251	java/lang/RuntimeException
      //   354	367	367	java/lang/RuntimeException
      //   461	474	474	java/lang/RuntimeException
      //   568	581	581	java/lang/RuntimeException
      //   768	781	781	java/lang/RuntimeException
    }
    
    public NBTTagCompound func_189551_b(NBTTagCompound param1NBTTagCompound) {
      byte b = 0;
      for (Map.Entry entry : s.a.entrySet()) {
        s.b b1 = (s.b)entry.getValue();
        UUID uUID1 = (UUID)entry.getKey();
        UUID uUID2 = b1.d();
        try {
          param1NBTTagCompound.func_74778_a("tribeId" + b, uUID1.toString());
          param1NBTTagCompound.func_74778_a("tribeColor" + b, b1.m.toString());
          if (uUID2 != null)
            param1NBTTagCompound.func_74778_a("tribeMaster" + b, uUID2.toString()); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        byte b2 = 0;
        HashSet<UUID> hashSet = new HashSet();
        for (b3 b31 : b1.k) {
          try {
            if (b31.field_70128_L)
              continue; 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          BlockPos blockPos = b31.func_180425_c();
          UUID uUID = b31.N();
          param1NBTTagCompound.func_74778_a(uUID1.toString() + "member" + b2 + "pos", blockPos.func_177958_n() + "|" + blockPos.func_177956_o() + "|" + blockPos.func_177952_p());
          param1NBTTagCompound.func_74778_a(uUID1.toString() + "member" + b2 + "id", uUID.toString());
          hashSet.add(uUID);
          b2++;
        } 
        for (Map.Entry<UUID, BlockPos> entry1 : b1.g.entrySet()) {
          UUID uUID = (UUID)entry1.getKey();
          BlockPos blockPos = (BlockPos)entry1.getValue();
          try {
            if (hashSet.contains(uUID))
              continue; 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          param1NBTTagCompound.func_74778_a(uUID1.toString() + "member" + b2 + "pos", blockPos.func_177958_n() + "|" + blockPos.func_177956_o() + "|" + blockPos.func_177952_p());
          param1NBTTagCompound.func_74778_a(uUID1.toString() + "member" + b2 + "id", uUID.toString());
          hashSet.add(uUID);
          b2++;
        } 
        byte b3 = 0;
        for (BlockPos blockPos : b1.l) {
          param1NBTTagCompound.func_74778_a(uUID1.toString() + "bed" + b3, blockPos.func_177958_n() + "|" + blockPos.func_177956_o() + "|" + blockPos.func_177952_p());
          b3++;
        } 
        byte b4 = 0;
        for (BlockPos blockPos : b1.a) {
          param1NBTTagCompound.func_74778_a(uUID1.toString() + "chest" + b4, blockPos.func_177958_n() + "|" + blockPos.func_177956_o() + "|" + blockPos.func_177952_p());
          b4++;
        } 
        byte b5 = 0;
        for (g g : b1.h) {
          param1NBTTagCompound.func_74778_a(uUID1.toString() + b5 + "taskKind", g.d.toString());
          param1NBTTagCompound.func_74778_a(uUID1.toString() + b5 + "pos", g.f.func_177958_n() + "|" + g.f.func_177956_o() + "|" + g.f.func_177952_p());
          param1NBTTagCompound.func_74778_a(uUID1.toString() + b5 + "facing", g.b.func_176610_l());
          byte b6 = 0;
          for (BlockPos blockPos : g.a) {
            param1NBTTagCompound.func_74778_a(uUID1.toString() + b5 + "block" + b6, blockPos.func_177958_n() + "|" + blockPos.func_177956_o() + "|" + blockPos.func_177952_p());
            b6++;
          } 
          b5++;
        } 
        b++;
      } 
      return param1NBTTagCompound;
    }
    
    private static RuntimeException a(RuntimeException param1RuntimeException) {
      return param1RuntimeException;
    }
  }
  
  public static class b {
    UUID i;
    
    UUID f;
    
    b3 c;
    
    List<b3> k;
    
    EyeAndKoboldColor m;
    
    T d = T.REST;
    
    BlockPos j = null;
    
    Collection<g> h = new ArrayList<>();
    
    HashSet<EntityLivingBase> b = new HashSet<>();
    
    HashSet<BlockPos> a = new HashSet<>();
    
    HashSet<BlockPos> l = new HashSet<>();
    
    HashMap<UUID, BlockPos> g = new HashMap<>();
    
    boolean e = false;
    
    public b(UUID param1UUID, EyeAndKoboldColor param1EyeAndKoboldColor, b3 param1b3, List<b3> param1List) {
      this.i = param1UUID;
      this.m = param1EyeAndKoboldColor;
      this.c = param1b3;
      this.k = param1List;
    }
    
    public b(UUID param1UUID, EyeAndKoboldColor param1EyeAndKoboldColor) {
      this.i = param1UUID;
      this.m = param1EyeAndKoboldColor;
      this.k = new ArrayList<>();
    }
    
    public void b(UUID param1UUID) {
      this.f = param1UUID;
    }
    
    public UUID d() {
      return this.f;
    }
    
    public void b(g param1g) {
      try {
        if (!this.h.contains(param1g))
          return; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      for (b3 b31 : param1g.c) {
        b31.c(m.NULL);
        b31.func_189654_d(false);
        b31.field_70145_X = false;
        b31.func_184212_Q().func_187227_b(bS.z, Boolean.valueOf(false));
      } 
      try {
        this.h.remove(param1g);
        if (!param1g.a.isEmpty())
          try {
            if (this.f != null) {
              EntityPlayerMP entityPlayerMP = FMLCommonHandler.instance().getMinecraftServerInstance().func_184103_al().func_177451_a(this.f);
              try {
                if (entityPlayerMP == null)
                  return; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              aV.a.sendTo(new B(param1g.a, false), entityPlayerMP);
              return;
            } 
            return;
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    }
    
    public HashMap<UUID, BlockPos> b() {
      return this.g;
    }
    
    public void a(UUID param1UUID, BlockPos param1BlockPos) {
      this.g.put(param1UUID, param1BlockPos);
    }
    
    public void a(UUID param1UUID) {
      this.g.remove(param1UUID);
    }
    
    public void a(EntityLivingBase param1EntityLivingBase) {
      this.b.remove(param1EntityLivingBase);
    }
    
    public void b(EntityLivingBase param1EntityLivingBase) {
      this.b.add(param1EntityLivingBase);
    }
    
    public HashSet<EntityLivingBase> g() {
      return this.b;
    }
    
    public int e() {
      HashSet<UUID> hashSet = new HashSet();
      for (b3 b31 : this.k)
        hashSet.add(b31.N()); 
      for (Map.Entry<UUID, BlockPos> entry : this.g.entrySet())
        hashSet.add((UUID)entry.getKey()); 
      return hashSet.size();
    }
    
    public BlockPos f() {
      return this.j;
    }
    
    public void a(BlockPos param1BlockPos) {
      this.j = param1BlockPos;
    }
    
    public void a(g param1g) {
      this.h.add(param1g);
    }
    
    public T a() {
      return this.d;
    }
    
    public void a(T param1T) {
      this.d = param1T;
    }
    
    public void a(b3 param1b3) {
      try {
        if (!this.k.contains(param1b3))
          this.k.add(param1b3); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    }
    
    public void b(b3 param1b3) {
      this.k.remove(param1b3);
    }
    
    b3 c() {
      b3 b31 = null;
      for (b3 b32 : this.k) {
        try {
          if (b32.field_70128_L)
            continue; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        if (b31 == null) {
          b31 = b32;
          continue;
        } 
        float f1 = ((Float)b31.func_184212_Q().func_187225_a(b3.aG)).floatValue();
        float f2 = ((Float)b32.func_184212_Q().func_187225_a(b3.aG)).floatValue();
        if (f2 < f1)
          b31 = b32; 
      } 
      return b31;
    }
    
    private static RuntimeException a(RuntimeException param1RuntimeException) {
      return param1RuntimeException;
    }
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\s.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */