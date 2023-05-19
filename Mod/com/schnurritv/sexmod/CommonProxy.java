package com.schnurritv.sexmod;

import java.io.IOException;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
  public void preInitRegistries(FMLPreInitializationEvent paramFMLPreInitializationEvent) {
    GameRegistry.registerWorldGenerator(new aL(), 0);
    b5.a();
    ba.a();
    N.a();
    al.a();
    aF.a();
    cn.a();
    ab.a();
    bP.a();
    z.a();
    r.a();
  }
  
  public void initRegistries(FMLInitializationEvent paramFMLInitializationEvent) throws IOException {
    Main.setConfigs();
    L.a();
    NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new aN());
    c9.a(false);
    aV.b();
  }
  
  public void postInit(FMLPostInitializationEvent paramFMLPostInitializationEvent) throws IOException {
    setUpCustomModelsOnServer();
  }
  
  void setUpCustomModelsOnServer() {
    try {
      if (!FMLCommonHandler.instance().getMinecraftServerInstance().func_71262_S())
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    ai.a(false);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\CommonProxy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */