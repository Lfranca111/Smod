package com.schnurritv.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.UUID;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class cV implements IMessage {
  boolean a = false;
  
  boolean b;
  
  public cV() {}
  
  public cV(boolean paramBoolean) {
    this.b = paramBoolean;
  }
  
  public void fromBytes(ByteBuf paramByteBuf) {
    this.b = paramByteBuf.readBoolean();
    this.a = true;
  }
  
  public void toBytes(ByteBuf paramByteBuf) {
    paramByteBuf.writeBoolean(this.b);
  }
  
  public static class a implements IMessageHandler<cV, IMessage> {
    public IMessage a(cV param1cV, MessageContext param1MessageContext) {
      try {
        if (param1cV.a)
          try {
            if (!param1MessageContext.side.isClient()) {
              FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
                    UUID uUID = s.a((param1MessageContext.getServerHandler()).field_147369_b.getPersistentID());
                    try {
                      if (uUID == null)
                        return; 
                    } catch (RuntimeException runtimeException) {
                      throw a(null);
                    } 
                    s.a(uUID, param1cV.b);
                  });
              return null;
            } 
            System.out.println("received an invalid message @SetTribeFollowMode :(");
            return null;
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      System.out.println("received an invalid message @SetTribeFollowMode :(");
      return null;
    }
    
    private static RuntimeException a(RuntimeException param1RuntimeException) {
      return param1RuntimeException;
    }
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\cV.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */