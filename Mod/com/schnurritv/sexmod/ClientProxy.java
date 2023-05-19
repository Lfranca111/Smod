package com.schnurritv.sexmod;

import com.c;
import java.io.IOException;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.command.ICommand;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class ClientProxy extends CommonProxy {
  public static KeyBinding[] keyBindings;
  
  public void postInit(FMLPostInitializationEvent paramFMLPostInitializationEvent) throws IOException {}
  
  public void preInitRegistries(FMLPreInitializationEvent paramFMLPreInitializationEvent) {
    super.preInitRegistries(paramFMLPreInitializationEvent);
    J.a();
  }
  
  public void initRegistries(FMLInitializationEvent paramFMLInitializationEvent) throws IOException {
    keyBindings = new KeyBinding[2];
    keyBindings[0] = new KeyBinding("Interact with your goblin", 34, "Sex mod");
    keyBindings[1] = new KeyBinding("open character customisation menu", 76, "Sex mod");
    for (KeyBinding keyBinding : keyBindings)
      ClientRegistry.registerKeyBinding(keyBinding); 
    Main.setConfigs();
    L.a();
    NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new aN());
    c9.a(true);
    aV.b();
    Minecraft minecraft = Minecraft.func_71410_x();
    RenderManager renderManager = minecraft.func_175598_ae();
    c c = new c();
    renderManager.func_188391_a((Entity)new b8((World)c), 0.0D, 0.0D, 0.0D, 0.0F, 0.0F, false);
    renderManager.func_188391_a((Entity)new bV((World)c), 0.0D, 0.0D, 0.0D, 0.0F, 0.0F, false);
    renderManager.func_188391_a((Entity)new bY((World)c), 0.0D, 0.0D, 0.0D, 0.0F, 0.0F, false);
    renderManager.func_188391_a((Entity)new bH((World)c), 0.0D, 0.0D, 0.0D, 0.0F, 0.0F, false);
    renderManager.func_188391_a((Entity)new bW((World)c), 0.0D, 0.0D, 0.0D, 0.0F, 0.0F, false);
    renderManager.func_188391_a((Entity)new bH((World)c), 0.0D, 0.0D, 0.0D, 0.0F, 0.0F, false);
    renderManager.func_188391_a((Entity)new bG((World)c), 0.0D, 0.0D, 0.0D, 0.0F, 0.0F, false);
    renderManager.func_188391_a((Entity)new bg((World)c), 0.0D, 0.0D, 0.0D, 0.0F, 0.0F, false);
    renderManager.func_188391_a((Entity)new b3((World)c), 0.0D, 0.0D, 0.0D, 0.0F, 0.0F, false);
    renderManager.func_188391_a((Entity)new bf((World)c), 0.0D, 0.0D, 0.0D, 0.0F, 0.0F, false);
    cK.a = new cK();
    ClientCommandHandler.instance.func_71560_a((ICommand)aQ.a);
    ClientCommandHandler.instance.func_71560_a((ICommand)W.a);
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\ClientProxy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */