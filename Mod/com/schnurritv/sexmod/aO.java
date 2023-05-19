package com.schnurritv.sexmod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.pathfinding.Path;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.pathfinding.PathPoint;
import net.minecraft.util.math.BlockPos;

public class ao extends EntityAIBase {
  protected EntityLiving f;
  
  protected BlockPos c = BlockPos.field_177992_a;
  
  protected BlockDoor g;
  
  boolean e;
  
  float d;
  
  float b;
  
  int a = 10;
  
  public ao(EntityLiving paramEntityLiving) {
    this.f = paramEntityLiving;
    if (!(paramEntityLiving.func_70661_as() instanceof PathNavigateGround))
      throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal"); 
  }
  
  public boolean func_75250_a() {
    boolean bool = true;
    for (byte b = -3; b < 5; b++) {
      for (byte b1 = -3; b1 < 5; b1++) {
        IBlockState iBlockState = this.f.field_70170_p.func_180495_p(this.f.func_180425_c().func_177982_a(b, 0, b1));
        try {
          if (iBlockState.func_177230_c() instanceof BlockDoor && iBlockState.func_185904_a() == Material.field_151575_d) {
            bool = false;
            break;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } 
      try {
        if (!bool)
          break; 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    try {
      if (bool)
        return false; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    PathNavigateGround pathNavigateGround = (PathNavigateGround)this.f.func_70661_as();
    Path path = pathNavigateGround.func_75505_d();
    try {
      if (path != null)
        try {
          if (!path.func_75879_b() && pathNavigateGround.func_179686_g()) {
            for (byte b1 = 0; b1 < Math.min(path.func_75873_e() + 2, path.func_75874_d()); b1++) {
              PathPoint pathPoint = path.func_75877_a(b1);
              try {
                this.c = new BlockPos(pathPoint.field_75839_a, pathPoint.field_75837_b + 1, pathPoint.field_75838_c);
                if (this.f.func_70092_e(this.c.func_177958_n(), this.f.field_70163_u, this.c.func_177952_p()) <= 2.25D)
                  try {
                    this.g = a(this.c);
                    if (this.g != null)
                      return true; 
                  } catch (IllegalArgumentException illegalArgumentException) {
                    throw a(null);
                  }  
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              } 
            } 
            try {
              this.c = (new BlockPos((Entity)this.f)).func_177984_a();
              this.g = a(this.c);
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            return (this.g != null);
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  public boolean func_75253_b() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (this.a >= 0);
  }
  
  public void func_75249_e() {
    this.e = false;
    this.d = (float)((this.c.func_177958_n() + 0.5F) - this.f.field_70165_t);
    this.b = (float)((this.c.func_177952_p() + 0.5F) - this.f.field_70161_v);
    this.g.func_176512_a(this.f.field_70170_p, this.c, true);
  }
  
  public void func_75246_d() {
    float f1 = (float)((this.c.func_177958_n() + 0.5F) - this.f.field_70165_t);
    float f2 = (float)((this.c.func_177952_p() + 0.5F) - this.f.field_70161_v);
    float f3 = this.d * f1 + this.b * f2;
    try {
      if (f3 < 0.0F)
        try {
          if (--this.a <= 0) {
            this.g.func_176512_a(this.f.field_70170_p, this.c, false);
            this.e = true;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void func_75251_c() {
    this.a = 10;
  }
  
  private BlockDoor a(BlockPos paramBlockPos) {
    IBlockState iBlockState = this.f.field_70170_p.func_180495_p(paramBlockPos);
    Block block = iBlockState.func_177230_c();
    try {
      if (block instanceof BlockDoor)
        try {
          if (iBlockState.func_185904_a() == Material.field_151575_d);
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return null;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\ao.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */