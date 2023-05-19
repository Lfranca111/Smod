package com.schnurritv.sexmod;

import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class aw implements IMessage {
  boolean b;
  
  boolean a;
  
  public aw(boolean paramBoolean) {
    this.a = paramBoolean;
    this.b = true;
  }
  
  public aw() {
    this.b = false;
  }
  
  public void fromBytes(ByteBuf paramByteBuf) {
    this.a = paramByteBuf.readBoolean();
    this.b = true;
  }
  
  public void toBytes(ByteBuf paramByteBuf) {
    paramByteBuf.writeBoolean(this.a);
    this.b = true;
  }
  
  public static class a implements IMessageHandler<aw, IMessage> {
    public IMessage a(aw param1aw, MessageContext param1MessageContext) {
      try {
        if (param1aw.b && param1MessageContext.side == Side.CLIENT) {
          aK.a(param1aw.a);
          try {
            (Minecraft.func_71410_x()).field_71439_g.func_70016_h(0.0D, 0.0D, 0.0D);
          } catch (Exception exception) {}
          try {
            if (param1aw.a)
              cG.a(); 
          } catch (Exception exception) {
            throw a(null);
          } 
        } else {
          System.out.println("received an invalid message @SetPlayerMovement :(");
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      return null;
    }
    
    private static Exception a(Exception param1Exception) {
      return param1Exception;
    }
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\aw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */