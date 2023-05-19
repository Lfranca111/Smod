package com.schnurritv.sexmod;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.BabyEntitySpawnEvent;
import net.minecraftforge.fml.common.eventhandler.Event;

public class az extends EntityAIBase {
  private final EntityVillager d;
  
  private EntityVillager c;
  
  private final World b;
  
  private int a;
  
  public az(EntityVillager paramEntityVillager) {
    this.d = paramEntityVillager;
    this.b = paramEntityVillager.field_70170_p;
    func_75248_a(3);
  }
  
  public boolean func_75250_a() {
    try {
      if (this.a != 0)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Entity entity = this.b.func_72857_a(EntityVillager.class, this.d.func_174813_aQ().func_72314_b(8.0D, 3.0D, 8.0D), (Entity)this.d);
    try {
      if (entity == null)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.c = (EntityVillager)entity;
    return true;
  }
  
  public void func_75249_e() {
    this.a = 300;
    this.d.func_70947_e(true);
  }
  
  public void func_75251_c() {}
  
  public boolean func_75253_b() {
    return true;
  }
  
  public void func_75246_d() {
    try {
      this.a--;
      this.d.func_70671_ap().func_75651_a((Entity)this.c, 10.0F, 30.0F);
      if (this.d.func_70068_e((Entity)this.c) > 2.25D)
        this.d.func_70661_as().func_75497_a((Entity)this.c, 0.25D); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.a <= 0) {
        a();
        this.d.field_70714_bg.func_85156_a(this);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.d.func_70681_au().nextInt(35) == 0)
        this.b.func_72960_a((Entity)this.d, (byte)12); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private void a() {
    EntityVillager entityVillager = this.d.func_90011_a((EntityAgeable)this.c);
    this.c.func_70873_a(6000);
    this.d.func_70873_a(6000);
    this.c.func_175549_o(false);
    this.d.func_175549_o(false);
    BabyEntitySpawnEvent babyEntitySpawnEvent = new BabyEntitySpawnEvent((EntityLiving)this.d, (EntityLiving)this.c, (EntityAgeable)entityVillager);
    try {
      if (!MinecraftForge.EVENT_BUS.post((Event)babyEntitySpawnEvent))
        try {
          if (babyEntitySpawnEvent.getChild() != null) {
            EntityAgeable entityAgeable = babyEntitySpawnEvent.getChild();
            entityAgeable.func_70873_a(-24000);
            entityAgeable.func_70012_b(this.d.field_70165_t, this.d.field_70163_u, this.d.field_70161_v, 0.0F, 0.0F);
            this.b.func_72838_d((Entity)entityAgeable);
            this.b.func_72960_a((Entity)entityAgeable, (byte)12);
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
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\az.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */