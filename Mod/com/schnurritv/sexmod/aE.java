package com.schnurritv.sexmod;

import javax.swing.JFrame;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class ae extends JFrame {
  public boolean a = false;
  
  @SubscribeEvent
  public void a(TickEvent.ClientTickEvent paramClientTickEvent) {
    try {
      if (this.a)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.a = true;
    cu.a();
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\ae.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */