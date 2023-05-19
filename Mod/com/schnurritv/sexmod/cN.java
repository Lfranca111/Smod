package com.schnurritv.sexmod;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistryEntry;

public class cn extends Item {
  public static final cn a = new cn();
  
  public cn() {
    func_77637_a(CreativeTabs.field_78026_f);
    this.field_77777_bU = 1;
  }
  
  public ActionResult<ItemStack> func_77659_a(World paramWorld, EntityPlayer paramEntityPlayer, EnumHand paramEnumHand) {
    ItemStack itemStack = paramEntityPlayer.func_184586_b(paramEnumHand);
    Vec3d vec3d1 = paramEntityPlayer.func_174824_e(0.0F);
    Vec3d vec3d2 = paramEntityPlayer.func_70676_i(0.0F);
    Vec3d vec3d3 = vec3d1.func_72441_c(vec3d2.field_72450_a * 5.0D, vec3d2.field_72448_b * 5.0D, vec3d2.field_72449_c * 5.0D);
    RayTraceResult rayTraceResult = paramWorld.func_147447_a(vec3d1, vec3d3, false, false, true);
    try {
      if (rayTraceResult == null)
        return new ActionResult(EnumActionResult.FAIL, paramEntityPlayer.func_184586_b(paramEnumHand)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (rayTraceResult.field_72313_a == RayTraceResult.Type.MISS)
        return new ActionResult(EnumActionResult.FAIL, paramEntityPlayer.func_184586_b(paramEnumHand)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!paramEntityPlayer.field_71075_bZ.field_75098_d)
        itemStack.func_190918_g(1); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!paramWorld.field_72995_K)
        s.a(paramWorld, rayTraceResult.field_72307_f); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return new ActionResult(EnumActionResult.SUCCESS, paramEntityPlayer.func_184586_b(paramEnumHand));
  }
  
  public static void a() {
    a.setRegistryName("sexmod", "tribe_egg");
    a.func_77655_b("tribe_egg");
    MinecraftForge.EVENT_BUS.register(cn.class);
  }
  
  @SubscribeEvent
  public static void a(RegistryEvent.Register<Item> paramRegister) {
    paramRegister.getRegistry().register((IForgeRegistryEntry)a);
  }
  
  @SideOnly(Side.CLIENT)
  @SubscribeEvent
  public static void a(ModelRegistryEvent paramModelRegistryEvent) {
    ModelLoader.setCustomModelResourceLocation(a, 0, new ModelResourceLocation("sexmod:tribe_egg"));
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\cn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */