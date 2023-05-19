package com.schnurritv.sexmod;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.init.PotionTypes;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionHelper;
import net.minecraft.potion.PotionType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistryEntry;

@EventBusSubscriber
public class ba extends Potion {
  public static final Potion b = new ba("horny potion", false, 16736968, 0, 0);
  
  public static final PotionType a = (PotionType)(new PotionType("horny_potion", new PotionEffect[] { new PotionEffect(b, 3600), new PotionEffect(MobEffects.field_76431_k, 200, 1) })).setRegistryName("horny_potion");
  
  public ba() {
    super(false, 0);
  }
  
  public ba(String paramString, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3) {
    super(paramBoolean, paramInt1);
    func_76390_b(paramString);
    func_76399_b(paramInt2, paramInt3);
    setRegistryName(new ResourceLocation("sexmod:" + paramString));
  }
  
  public static void a() {
    ForgeRegistries.POTIONS.register((IForgeRegistryEntry)b);
    ForgeRegistries.POTION_TYPES.register((IForgeRegistryEntry)a);
    PotionHelper.func_193357_a(PotionTypes.field_185231_c, Item.func_150898_a((Block)Blocks.field_150328_O), a);
  }
  
  @SubscribeEvent
  public void a(TickEvent.PlayerTickEvent paramPlayerTickEvent) {
    EntityPlayer entityPlayer = paramPlayerTickEvent.player;
    PotionEffect potionEffect = entityPlayer.func_70660_b(b);
    try {
      if (entityPlayer.field_70170_p.field_72995_K)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (potionEffect == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (potionEffect.func_76459_b() > 3500)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    entityPlayer.func_184589_d(b);
    aV.a.sendTo(new i(entityPlayer), (EntityPlayerMP)entityPlayer);
  }
  
  @SubscribeEvent
  public void a(LivingEvent.LivingUpdateEvent paramLivingUpdateEvent) {
    if (paramLivingUpdateEvent.getEntity() instanceof EntityVillager) {
      EntityVillager entityVillager = (EntityVillager)paramLivingUpdateEvent.getEntity();
      try {
        if (entityVillager.func_70644_a(b)) {
          entityVillager.field_70714_bg.func_75776_a(2, new az(entityVillager));
          entityVillager.func_184589_d(b);
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    try {
      if (!(paramLivingUpdateEvent.getEntity() instanceof EntityAnimal))
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    EntityAnimal entityAnimal = (EntityAnimal)paramLivingUpdateEvent.getEntity();
    try {
      if (entityAnimal.func_70644_a(b)) {
        try {
          if (entityAnimal.func_70874_b() >= 0) {
            entityAnimal.func_70873_a(0);
            entityAnimal.func_70875_t();
            entityAnimal.func_146082_f(entityAnimal.field_70170_p.func_72890_a((Entity)entityAnimal, 30.0D));
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        entityAnimal.func_184589_d(b);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\ba.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */