package com.schnurritv.sexmod;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class g {
  public static final int e = 30;
  
  BlockPos f;
  
  a d;
  
  HashSet<BlockPos> a;
  
  List<b3> c = new ArrayList<>();
  
  EnumFacing b = EnumFacing.NORTH;
  
  public g(BlockPos paramBlockPos, a parama, HashSet<BlockPos> paramHashSet) {
    this.f = paramBlockPos;
    this.d = parama;
    this.a = paramHashSet;
  }
  
  public g(BlockPos paramBlockPos, a parama, HashSet<BlockPos> paramHashSet, EnumFacing paramEnumFacing) {
    this.f = paramBlockPos;
    this.d = parama;
    this.a = paramHashSet;
    this.b = paramEnumFacing;
  }
  
  public EnumFacing b() {
    return this.b;
  }
  
  public BlockPos f() {
    return this.f;
  }
  
  public a c() {
    return this.d;
  }
  
  public HashSet<BlockPos> g() {
    return this.a;
  }
  
  public void a(BlockPos paramBlockPos) {
    this.a.add(paramBlockPos);
  }
  
  public void a(HashSet<BlockPos> paramHashSet) {
    this.a.addAll(paramHashSet);
  }
  
  public void b(BlockPos paramBlockPos) {
    this.a.remove(paramBlockPos);
  }
  
  public void b(HashSet<BlockPos> paramHashSet) {
    try {
      if (!paramHashSet.isEmpty())
        this.a.removeAll(paramHashSet); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public boolean c(BlockPos paramBlockPos) {
    return this.a.contains(paramBlockPos);
  }
  
  public boolean a(b3 paramb3) {
    try {
      if (this.d.b <= this.c.size())
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.c.add(paramb3);
    return true;
  }
  
  public List<b3> a() {
    return this.c;
  }
  
  public void e() {
    for (b3 b3 : this.c) {
      try {
        if (b3.n() == null) {
          b3.func_189654_d(false);
          b3.field_70145_X = false;
          b3.c(m.NULL);
          b3.func_184212_Q().func_187227_b(bS.z, Boolean.valueOf(false));
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    this.c.clear();
  }
  
  public void b(b3 paramb3) {
    this.c.remove(paramb3);
  }
  
  public boolean d() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (this.d.b <= this.c.size());
  }
  
  public boolean c(b3 paramb3) {
    return this.c.contains(paramb3);
  }
  
  public static HashSet<BlockPos> a(World paramWorld, BlockPos paramBlockPos, UUID paramUUID) {
    BlockPos blockPos1;
    for (blockPos1 = paramBlockPos; !c(paramWorld, blockPos1); blockPos1 = paramBlockPos.func_177977_b());
    BlockPos blockPos2;
    for (blockPos2 = paramBlockPos; !b(paramWorld, blockPos2); blockPos2 = blockPos2.func_177984_a());
    HashSet<BlockPos> hashSet1 = new HashSet();
    int i = blockPos2.func_177956_o() - blockPos1.func_177956_o();
    byte b = 0;
    try {
      while (b <= i) {
        hashSet1.add(blockPos1.func_177982_a(0, b, 0));
        b++;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    HashSet<BlockPos> hashSet2 = a(paramWorld, blockPos1);
    HashSet<BlockPos> hashSet3 = new HashSet();
    for (BlockPos blockPos : hashSet2) {
      try {
        if (blockPos.func_177958_n() == blockPos1.func_177958_n())
          try {
            if (blockPos.func_177952_p() == blockPos1.func_177952_p())
              hashSet3.add(blockPos); 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    for (BlockPos blockPos : hashSet3)
      hashSet2.remove(blockPos); 
    hashSet1.addAll(hashSet2);
    HashSet<BlockPos> hashSet4 = new HashSet();
    for (BlockPos blockPos : hashSet1) {
      for (g g2 : s.j(paramUUID)) {
        HashSet<BlockPos> hashSet = g2.g();
        try {
          if (hashSet.contains(blockPos)) {
            hashSet4.add(blockPos);
            break;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } 
    } 
    hashSet1.removeAll(hashSet4);
    g g1 = new g(blockPos1, a.FALL_TREE, hashSet1);
    s.b(paramUUID, g1);
    return hashSet1;
  }
  
  static boolean b(World paramWorld, BlockPos paramBlockPos) {
    Block block = paramWorld.func_180495_p(paramBlockPos.func_177984_a()).func_177230_c();
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return !(block instanceof net.minecraft.block.BlockLog);
  }
  
  static boolean c(World paramWorld, BlockPos paramBlockPos) {
    IBlockState iBlockState = paramWorld.func_180495_p(paramBlockPos.func_177977_b());
    try {
      if (!(iBlockState instanceof net.minecraft.block.BlockLog))
        try {
          if (iBlockState.func_185904_a() != Material.field_151579_a);
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  static HashSet<BlockPos> a(World paramWorld, BlockPos paramBlockPos) {
    return a(paramWorld, paramBlockPos, new HashSet<>());
  }
  
  static HashSet<BlockPos> a(World paramWorld, BlockPos paramBlockPos, HashSet<BlockPos> paramHashSet) {
    try {
      if (paramHashSet.contains(paramBlockPos))
        return new HashSet<>(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      paramHashSet.add(paramBlockPos);
      if (paramWorld.func_180495_p(paramBlockPos.func_177982_a(1, 0, 0)).func_177230_c() instanceof net.minecraft.block.BlockLog)
        paramHashSet.addAll(a(paramWorld, paramBlockPos.func_177982_a(1, 0, 0), paramHashSet)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramWorld.func_180495_p(paramBlockPos.func_177982_a(-1, 0, 0)).func_177230_c() instanceof net.minecraft.block.BlockLog)
        paramHashSet.addAll(a(paramWorld, paramBlockPos.func_177982_a(-1, 0, 0), paramHashSet)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramWorld.func_180495_p(paramBlockPos.func_177982_a(0, 0, 1)).func_177230_c() instanceof net.minecraft.block.BlockLog)
        paramHashSet.addAll(a(paramWorld, paramBlockPos.func_177982_a(0, 0, 1), paramHashSet)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramWorld.func_180495_p(paramBlockPos.func_177982_a(0, 0, -1)).func_177230_c() instanceof net.minecraft.block.BlockLog)
        paramHashSet.addAll(a(paramWorld, paramBlockPos.func_177982_a(0, 0, -1), paramHashSet)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramWorld.func_180495_p(paramBlockPos.func_177982_a(1, 0, 1)).func_177230_c() instanceof net.minecraft.block.BlockLog)
        paramHashSet.addAll(a(paramWorld, paramBlockPos.func_177982_a(1, 0, 1), paramHashSet)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramWorld.func_180495_p(paramBlockPos.func_177982_a(-1, 0, -1)).func_177230_c() instanceof net.minecraft.block.BlockLog)
        paramHashSet.addAll(a(paramWorld, paramBlockPos.func_177982_a(-1, 0, -1), paramHashSet)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramWorld.func_180495_p(paramBlockPos.func_177982_a(-1, 0, 1)).func_177230_c() instanceof net.minecraft.block.BlockLog)
        paramHashSet.addAll(a(paramWorld, paramBlockPos.func_177982_a(-1, 0, 1), paramHashSet)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramWorld.func_180495_p(paramBlockPos.func_177982_a(1, 0, -1)).func_177230_c() instanceof net.minecraft.block.BlockLog)
        paramHashSet.addAll(a(paramWorld, paramBlockPos.func_177982_a(1, 0, -1), paramHashSet)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramWorld.func_180495_p(paramBlockPos.func_177982_a(0, 1, 0)).func_177230_c() instanceof net.minecraft.block.BlockLog)
        paramHashSet.addAll(a(paramWorld, paramBlockPos.func_177982_a(0, 1, 0), paramHashSet)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramWorld.func_180495_p(paramBlockPos.func_177982_a(1, 1, 0)).func_177230_c() instanceof net.minecraft.block.BlockLog)
        paramHashSet.addAll(a(paramWorld, paramBlockPos.func_177982_a(1, 1, 0), paramHashSet)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramWorld.func_180495_p(paramBlockPos.func_177982_a(-1, 1, 0)).func_177230_c() instanceof net.minecraft.block.BlockLog)
        paramHashSet.addAll(a(paramWorld, paramBlockPos.func_177982_a(-1, 1, 0), paramHashSet)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramWorld.func_180495_p(paramBlockPos.func_177982_a(0, 1, 1)).func_177230_c() instanceof net.minecraft.block.BlockLog)
        paramHashSet.addAll(a(paramWorld, paramBlockPos.func_177982_a(0, 1, 1), paramHashSet)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramWorld.func_180495_p(paramBlockPos.func_177982_a(0, 1, -1)).func_177230_c() instanceof net.minecraft.block.BlockLog)
        paramHashSet.addAll(a(paramWorld, paramBlockPos.func_177982_a(0, 1, -1), paramHashSet)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramWorld.func_180495_p(paramBlockPos.func_177982_a(1, 1, 1)).func_177230_c() instanceof net.minecraft.block.BlockLog)
        paramHashSet.addAll(a(paramWorld, paramBlockPos.func_177982_a(1, 1, 1), paramHashSet)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramWorld.func_180495_p(paramBlockPos.func_177982_a(-1, 1, -1)).func_177230_c() instanceof net.minecraft.block.BlockLog)
        paramHashSet.addAll(a(paramWorld, paramBlockPos.func_177982_a(-1, 1, -1), paramHashSet)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramWorld.func_180495_p(paramBlockPos.func_177982_a(-1, 1, 1)).func_177230_c() instanceof net.minecraft.block.BlockLog)
        paramHashSet.addAll(a(paramWorld, paramBlockPos.func_177982_a(-1, 1, 1), paramHashSet)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramWorld.func_180495_p(paramBlockPos.func_177982_a(1, 1, -1)).func_177230_c() instanceof net.minecraft.block.BlockLog)
        paramHashSet.addAll(a(paramWorld, paramBlockPos.func_177982_a(1, 1, -1), paramHashSet)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return paramHashSet;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  public enum a {
    FALL_TREE(1),
    MINE(3);
    
    int b;
    
    a(int param1Int1) {
      this.b = param1Int1;
    }
    
    int a() {
      return this.b;
    }
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */