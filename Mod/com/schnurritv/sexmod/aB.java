package com.schnurritv.sexmod;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistryEntry;

public class ab extends Item {
  public static final ab a = new ab();
  
  public ab() {
    func_77637_a(CreativeTabs.field_78040_i);
    this.field_77777_bU = 1;
  }
  
  public void func_77663_a(ItemStack paramItemStack, World paramWorld, Entity paramEntity, int paramInt, boolean paramBoolean) {
    try {
      if (paramWorld.field_72995_K)
        a(paramEntity, paramItemStack); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    super.func_77663_a(paramItemStack, paramWorld, paramEntity, paramInt, paramBoolean);
  }
  
  @SideOnly(Side.CLIENT)
  void a(Entity paramEntity, ItemStack paramItemStack) {
    // Byte code:
    //   0: aload_1
    //   1: instanceof net/minecraft/entity/player/EntityPlayer
    //   4: ifne -> 12
    //   7: return
    //   8: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   11: athrow
    //   12: aload_1
    //   13: checkcast net/minecraft/entity/player/EntityPlayer
    //   16: astore_3
    //   17: aload_2
    //   18: aload_3
    //   19: invokevirtual func_184614_ca : ()Lnet/minecraft/item/ItemStack;
    //   22: invokevirtual equals : (Ljava/lang/Object;)Z
    //   25: ifne -> 56
    //   28: aload_2
    //   29: aload_3
    //   30: invokevirtual func_184592_cb : ()Lnet/minecraft/item/ItemStack;
    //   33: invokevirtual equals : (Ljava/lang/Object;)Z
    //   36: ifne -> 56
    //   39: goto -> 46
    //   42: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   45: athrow
    //   46: aload_2
    //   47: iconst_0
    //   48: invokevirtual func_77964_b : (I)V
    //   51: return
    //   52: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   55: athrow
    //   56: invokestatic func_71410_x : ()Lnet/minecraft/client/Minecraft;
    //   59: getfield field_71476_x : Lnet/minecraft/util/math/RayTraceResult;
    //   62: astore #4
    //   64: aload_2
    //   65: aload #4
    //   67: ifnull -> 96
    //   70: aload #4
    //   72: getfield field_72308_g : Lnet/minecraft/entity/Entity;
    //   75: invokestatic a : (Lnet/minecraft/entity/Entity;)Z
    //   78: ifeq -> 96
    //   81: goto -> 88
    //   84: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   87: athrow
    //   88: iconst_1
    //   89: goto -> 97
    //   92: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   95: athrow
    //   96: iconst_0
    //   97: invokevirtual func_77964_b : (I)V
    //   100: return
    // Exception table:
    //   from	to	target	type
    //   0	8	8	java/lang/RuntimeException
    //   17	39	42	java/lang/RuntimeException
    //   28	52	52	java/lang/RuntimeException
    //   64	81	84	java/lang/RuntimeException
    //   70	92	92	java/lang/RuntimeException
  }
  
  @SubscribeEvent
  public void a(PlayerInteractEvent.EntityInteract paramEntityInteract) {
    Entity entity = paramEntityInteract.getTarget();
    try {
      if (!(entity instanceof bS))
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!bS.a(entity))
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    EntityPlayer entityPlayer = paramEntityInteract.getEntityPlayer();
    try {
      if (entityPlayer == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    ItemStack itemStack = entityPlayer.func_184614_ca();
    if (itemStack.func_77973_b() != a)
      itemStack = entityPlayer.func_184592_cb(); 
    try {
      if (itemStack.func_77973_b() != a)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      paramEntityInteract.setCanceled(true);
      if (!(paramEntityInteract.getWorld()).field_72995_K)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (ai.c) {
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        try {
          ai.c = (0 != ai.c(true));
          if (ai.c)
            return; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    h.a((bS)entity);
  }
  
  @SubscribeEvent
  public void a(AttackEntityEvent paramAttackEntityEvent) {
    Entity entity = paramAttackEntityEvent.getTarget();
    try {
      if (entity == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!(entity instanceof bS))
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    EntityPlayer entityPlayer = paramAttackEntityEvent.getEntityPlayer();
    try {
      if (entityPlayer == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    ItemStack itemStack = entityPlayer.func_184614_ca();
    if (itemStack.func_77973_b() != a)
      itemStack = entityPlayer.func_184592_cb(); 
    try {
      if (itemStack.func_77973_b() != a)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      paramAttackEntityEvent.setCanceled(true);
      if (!entityPlayer.field_70170_p.field_72995_K)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    bS bS = (bS)entity;
    String str1 = bS.z();
    String str2 = bS.b(bS.a(bS.N()));
    entityPlayer.func_145747_a((ITextComponent)new TextComponentString(String.format("%s's model-code: %s%s$%s", new Object[] { bS.H(), TextFormatting.YELLOW, str1, str2 })));
    entityPlayer.func_145747_a((ITextComponent)new TextComponentString(TextFormatting.ITALIC + "copied to clipboard"));
    aH.a(String.format("%s$%s", new Object[] { str1, str2 }));
  }
  
  @SubscribeEvent
  public void a(PlayerInteractEvent.LeftClickBlock paramLeftClickBlock) {
    try {
      if (a(paramLeftClickBlock.getEntityPlayer(), paramLeftClickBlock.getWorld()))
        paramLeftClickBlock.setCanceled(true); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  @SubscribeEvent
  public void a(PlayerInteractEvent.LeftClickEmpty paramLeftClickEmpty) {
    a(paramLeftClickEmpty.getEntityPlayer(), paramLeftClickEmpty.getWorld());
  }
  
  boolean a(EntityPlayer paramEntityPlayer, World paramWorld) {
    try {
      if (paramEntityPlayer == null)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    ItemStack itemStack = paramEntityPlayer.func_184614_ca();
    if (itemStack.func_77973_b() != a)
      itemStack = paramEntityPlayer.func_184592_cb(); 
    try {
      if (itemStack.func_77973_b() != a)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!paramWorld.field_72995_K)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    bo bo = bo.f(paramEntityPlayer.getPersistentID());
    try {
      if (bo == null) {
        paramEntityPlayer.func_146105_b((ITextComponent)new TextComponentString("you gotta turn into the girl, you want to copy the model-code off"), true);
        return true;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    String str1 = bo.z();
    String str2 = bS.b(bS.a(bo.N()));
    paramEntityPlayer.func_145747_a((ITextComponent)new TextComponentString(String.format("%s's model-code: %s%s$%s", new Object[] { aH.b(bB.a((Entity)bo).toString()), TextFormatting.YELLOW, str1, str2 })));
    paramEntityPlayer.func_145747_a((ITextComponent)new TextComponentString(TextFormatting.ITALIC + "copied to clipboard"));
    aH.a(String.format("%s$%s", new Object[] { str1, str2 }));
    return true;
  }
  
  public static void a() {
    a.setRegistryName("sexmod", "npc_editor_wand");
    a.func_77655_b("npc_editor_wand");
    MinecraftForge.EVENT_BUS.register(ab.class);
  }
  
  @SubscribeEvent
  public static void a(RegistryEvent.Register<Item> paramRegister) {
    paramRegister.getRegistry().register((IForgeRegistryEntry)a);
  }
  
  @SideOnly(Side.CLIENT)
  @SubscribeEvent
  public static void a(ModelRegistryEvent paramModelRegistryEvent) {
    ModelLoader.setCustomModelResourceLocation(a, 0, new ModelResourceLocation("sexmod:npc_editor_wand"));
    ModelLoader.setCustomModelResourceLocation(a, 1, new ModelResourceLocation("sexmod:npc_editor_wand_active"));
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\ab.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */