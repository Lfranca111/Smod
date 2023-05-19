package com.schnurritv.sexmod;

import java.util.UUID;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public abstract class c7 extends EntityAIBase {
  public bS e;
  
  public EntityPlayer h;
  
  public PathNavigate g;
  
  public EntityDataManager c;
  
  public a b = a.IDLE;
  
  public static final double f = 0.5D;
  
  public static final double a = 0.7D;
  
  public static final int d = 60;
  
  public c7(bS parambS) {
    this.e = parambS;
    this.g = parambS.func_70661_as();
    this.c = parambS.func_184212_Q();
  }
  
  protected void a() {
    BlockPos blockPos;
    byte b = 0;
    do {
      blockPos = this.h.func_180425_c().func_177982_a(U.f.nextInt(10), 0, U.f.nextInt(10));
    } while (++b < 20 && !this.e.func_184595_k(blockPos.func_177958_n(), blockPos.func_177956_o(), blockPos.func_177952_p()));
    try {
      if (b >= 20)
        this.e.func_70107_b(this.h.field_70165_t, this.h.field_70163_u, this.h.field_70161_v); 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    this.e.field_70159_w = 0.0D;
    this.e.field_70181_x = 0.0D;
    this.e.field_70179_y = 0.0D;
  }
  
  protected double b() {
    double d1;
    bS.a a1;
    float f = this.e.func_70032_d((Entity)this.h);
    if (this.h.func_70051_ag()) {
      d1 = 0.7D;
      a1 = bS.a.RUN;
    } else {
      d1 = 0.5D;
      a1 = bS.a.WALK;
    } 
    double d2 = Math.floor((f / 5.0F)) * 0.2D;
    d1 += d2;
    if (this.e.func_70090_H()) {
      d1 *= 60.0D;
      a1 = bS.a.WALK;
    } 
    this.g.func_75489_a(d1);
    this.e.a(a1);
    return d1;
  }
  
  public void func_75251_c() {
    this.g.func_75499_g();
    this.b = a.IDLE;
    this.e.c(m.NULL);
    this.c.func_187227_b(bS.b, "");
    this.g = null;
    this.c = null;
    this.h = null;
  }
  
  public boolean func_75250_a() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    return !((String)this.e.func_184212_Q().func_187225_a(bS.b)).equals("");
  }
  
  public boolean func_75253_b() {
    String str = (String)this.c.func_187225_a(bS.b);
    try {
      if (!str.equals(""))
        try {
          if (this.e.field_70170_p.func_152378_a(UUID.fromString(str)) != null);
        } catch (RuntimeException runtimeException) {
          throw b(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    return false;
  }
  
  public void func_75249_e() {
    this.g = this.e.func_70661_as();
    this.c = this.e.func_184212_Q();
    this.h = this.e.field_70170_p.func_152378_a(UUID.fromString((String)this.c.func_187225_a(bS.b)));
  }
  
  public void func_75246_d() {
    try {
      this.b = c();
      if (this.e.t != null) {
        try {
        
        } catch (RuntimeException runtimeException) {
          throw b(null);
        } 
        this.e.t.a = (this.b == a.IDLE);
      } 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    a(this.b);
  }
  
  protected abstract a c();
  
  protected abstract void a(a parama);
  
  @SubscribeEvent
  public void a(LivingDeathEvent paramLivingDeathEvent) {
    if (paramLivingDeathEvent.getEntityLiving() instanceof bS) {
      bS bS1 = (bS)paramLivingDeathEvent.getEntityLiving();
      try {
        if (!((String)bS1.func_184212_Q().func_187225_a(bS.b)).equals(""))
          paramLivingDeathEvent.setCanceled(true); 
      } catch (RuntimeException runtimeException) {
        throw b(null);
      } 
    } 
  }
  
  private static RuntimeException b(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  public enum a {
    ATTACK, FOLLOW, IDLE, RIDE, DOWNED;
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\c7.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */