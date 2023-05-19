package com.schnurritv.sexmod;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAIWatchClosest2;

public class q extends EntityAIWatchClosest2 {
  public boolean a = true;
  
  public q(EntityLiving paramEntityLiving, Class<? extends Entity> paramClass, float paramFloat1, float paramFloat2) {
    super(paramEntityLiving, paramClass, paramFloat1, paramFloat2);
  }
  
  public void func_75246_d() {
    try {
      if (this.a)
        super.func_75246_d(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */