package com.schnurritv.sexmod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class cl {
  @SubscribeEvent
  public void b(LivingAttackEvent paramLivingAttackEvent) {
    try {
      if (paramLivingAttackEvent.getSource() == DamageSource.field_76380_i)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!(paramLivingAttackEvent.getEntity() instanceof bS))
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    bS bS = (bS)paramLivingAttackEvent.getEntity();
    try {
      if (bS instanceof bo) {
        paramLivingAttackEvent.setCanceled(true);
      } else {
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        paramLivingAttackEvent.setCanceled((bS.n() != null));
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  @SubscribeEvent
  public void a(LivingAttackEvent paramLivingAttackEvent) {
    try {
      if (paramLivingAttackEvent.getSource() == DamageSource.field_76380_i)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!(paramLivingAttackEvent.getEntity() instanceof EntityPlayer))
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    EntityPlayer entityPlayer = (EntityPlayer)paramLivingAttackEvent.getEntity();
    try {
      if (bS.i(entityPlayer.getPersistentID()))
        paramLivingAttackEvent.setCanceled(true); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\cl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */