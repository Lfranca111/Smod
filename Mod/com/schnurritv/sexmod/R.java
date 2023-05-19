package com.schnurritv.sexmod;

import javax.annotation.Nullable;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFishingRod;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
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

public class r extends ItemFishingRod {
  public static final r a = new r();
  
  public r() {
    func_77656_e(64);
    func_77625_d(1);
    func_185043_a(new ResourceLocation("cast"), new a());
  }
  
  public static void a() {
    a.setRegistryName("sexmod", "luna_rod");
    a.func_77655_b("luna_rod");
    MinecraftForge.EVENT_BUS.register(r.class);
  }
  
  @SubscribeEvent
  public static void a(RegistryEvent.Register<Item> paramRegister) {
    paramRegister.getRegistry().register((IForgeRegistryEntry)a);
  }
  
  @SideOnly(Side.CLIENT)
  @SubscribeEvent
  public static void a(ModelRegistryEvent paramModelRegistryEvent) {
    ModelLoader.setCustomModelResourceLocation((Item)a, 0, new ModelResourceLocation("fishing_rod"));
  }
  
  public ActionResult<ItemStack> a(World paramWorld, bg parambg, EnumHand paramEnumHand) {
    ItemStack itemStack = parambg.func_184586_b(paramEnumHand);
    if (parambg.ac != null) {
      int i = parambg.ac.h();
      itemStack.func_77972_a(i, (EntityLivingBase)parambg);
      parambg.func_184609_a(paramEnumHand);
      paramWorld.func_184148_a((EntityPlayer)null, parambg.field_70165_t, parambg.field_70163_u, parambg.field_70161_v, SoundEvents.field_193780_J, SoundCategory.NEUTRAL, 1.0F, 0.4F / (field_77697_d.nextFloat() * 0.4F + 0.8F));
    } else {
      paramWorld.func_184148_a((EntityPlayer)null, parambg.field_70165_t, parambg.field_70163_u, parambg.field_70161_v, SoundEvents.field_187612_G, SoundCategory.NEUTRAL, 0.5F, 0.4F / (field_77697_d.nextFloat() * 0.4F + 0.8F));
      if (!paramWorld.field_72995_K) {
        aY.d = parambg;
        double d = parambg.func_174791_d().func_72438_d(new Vec3d(parambg.ag.func_177958_n(), parambg.ag.func_177956_o(), parambg.ag.func_177952_p()));
        System.out.println("chosenFishingSpot: " + parambg.ag.toString());
        System.out.println("ROD_THROWING_STRENGTH: " + (d * bg.X));
        aY aY = new aY(paramWorld, parambg, d * bg.X);
        int i = EnchantmentHelper.func_191528_c(itemStack);
        try {
          if (i > 0)
            aY.a(i); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        int j = EnchantmentHelper.func_191529_b(itemStack);
        try {
          if (j > 0)
            aY.b(j); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        paramWorld.func_72838_d(aY);
      } 
      parambg.func_184609_a(paramEnumHand);
    } 
    return new ActionResult(EnumActionResult.SUCCESS, itemStack);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  class a implements IItemPropertyGetter {
    @SideOnly(Side.CLIENT)
    public float func_185085_a(ItemStack param1ItemStack, @Nullable World param1World, @Nullable EntityLivingBase param1EntityLivingBase) {
      try {
        if (param1EntityLivingBase == null)
          return 0.0F; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (!(param1EntityLivingBase instanceof bg))
          return 0.0F; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
      
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      return ((Boolean)param1EntityLivingBase.func_184212_Q().func_187225_a(bg.am)).booleanValue() ? 1.0F : 0.0F;
    }
    
    private static RuntimeException a(RuntimeException param1RuntimeException) {
      return param1RuntimeException;
    }
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */