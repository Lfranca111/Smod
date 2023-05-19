package com.schnurritv.sexmod;

import java.io.File;
import java.io.IOException;
import net.minecraftforge.common.MinecraftForge;

public class c9 {
  public static void a(boolean paramBoolean) throws IOException {
    try {
      MinecraftForge.EVENT_BUS.register(new cl());
      MinecraftForge.EVENT_BUS.register(new aR());
      MinecraftForge.EVENT_BUS.register(new t());
      MinecraftForge.EVENT_BUS.register(new ba());
      MinecraftForge.EVENT_BUS.register(new b9());
      MinecraftForge.EVENT_BUS.register(new b.a());
      MinecraftForge.EVENT_BUS.register(new cI.b());
      MinecraftForge.EVENT_BUS.register(al.c);
      MinecraftForge.EVENT_BUS.register(aF.b);
      MinecraftForge.EVENT_BUS.register(ab.a);
      MinecraftForge.EVENT_BUS.register(new r());
      MinecraftForge.EVENT_BUS.register(new N());
      MinecraftForge.EVENT_BUS.register(new aS());
      MinecraftForge.EVENT_BUS.register(new bg.b());
      MinecraftForge.EVENT_BUS.register(new n());
      MinecraftForge.EVENT_BUS.register(z.a);
      MinecraftForge.EVENT_BUS.register(new b3.a());
      MinecraftForge.EVENT_BUS.register(new aF.a());
      MinecraftForge.EVENT_BUS.register(new s.a("tribes"));
      MinecraftForge.EVENT_BUS.register(new bP());
      MinecraftForge.EVENT_BUS.register(new cR());
      MinecraftForge.EVENT_BUS.register(new bf.a());
      MinecraftForge.EVENT_BUS.register(new al.a());
      MinecraftForge.EVENT_BUS.register(new aH.a());
      if (paramBoolean) {
        try {
          if (a()) {
            MinecraftForge.EVENT_BUS.register(new ae());
          } else {
            cu.b = false;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        MinecraftForge.EVENT_BUS.register(new cG());
        MinecraftForge.EVENT_BUS.register(new bd());
        MinecraftForge.EVENT_BUS.register(new aK());
        MinecraftForge.EVENT_BUS.register(new aZ());
        MinecraftForge.EVENT_BUS.register(new P());
        MinecraftForge.EVENT_BUS.register(new aA());
        MinecraftForge.EVENT_BUS.register(new cY());
        MinecraftForge.EVENT_BUS.register(new cK());
        MinecraftForge.EVENT_BUS.register(new bh.a());
        MinecraftForge.EVENT_BUS.register(new aP());
        MinecraftForge.EVENT_BUS.register(new aB());
        MinecraftForge.EVENT_BUS.register(new h.a());
        MinecraftForge.EVENT_BUS.register(new ai.b());
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  static boolean a() {
    File file = new File("sexmod/dontAskAgain");
    try {
      file.getParentFile().mkdirs();
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return !file.exists();
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\c9.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */