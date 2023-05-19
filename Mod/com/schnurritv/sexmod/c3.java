package com.schnurritv.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.UUID;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class c3 implements IMessage {
  boolean a;
  
  UUID c;
  
  UUID b;
  
  String d;
  
  public c3() {}
  
  public c3(UUID paramUUID1, UUID paramUUID2, String paramString) {
    this.c = paramUUID1;
    this.b = paramUUID2;
    this.d = paramString;
  }
  
  public void fromBytes(ByteBuf paramByteBuf) {
    this.c = UUID.fromString(ByteBufUtils.readUTF8String(paramByteBuf));
    this.b = UUID.fromString(ByteBufUtils.readUTF8String(paramByteBuf));
    this.d = ByteBufUtils.readUTF8String(paramByteBuf);
    this.a = true;
  }
  
  public void toBytes(ByteBuf paramByteBuf) {
    ByteBufUtils.writeUTF8String(paramByteBuf, this.c.toString());
    ByteBufUtils.writeUTF8String(paramByteBuf, this.b.toString());
    ByteBufUtils.writeUTF8String(paramByteBuf, this.d);
  }
  
  public static class a implements IMessageHandler<c3, IMessage> {
    public IMessage a(c3 param1c3, MessageContext param1MessageContext) {
      try {
        if (param1c3.a)
          try {
            if (param1MessageContext.side == Side.SERVER) {
              FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
                    bo bo = bo.f(param1c3.c);
                    try {
                      if (bo == null)
                        return; 
                    } catch (Exception exception) {
                      throw a(null);
                    } 
                    if (!FMLCommonHandler.instance().getMinecraftServerInstance().func_71262_S())
                      try {
                        for (bS bS : bS.l()) {
                          try {
                            if (!(bS instanceof bo))
                              continue; 
                          } catch (Exception exception) {
                            throw a(null);
                          } 
                          bo = (bo)bS;
                          try {
                            if (!bo.field_70170_p.field_72995_K)
                              try {
                                if (bo.d().equals(param1c3.c))
                                  break; 
                              } catch (Exception exception) {
                                throw a(null);
                              }  
                          } catch (Exception exception) {
                            throw a(null);
                          } 
                        } 
                      } catch (Exception exception) {} 
                    bo.b(param1c3.d, param1c3.b);
                  });
              return null;
            } 
            System.out.println("received an invalid message @StartStandingSexAnimation :(");
            return null;
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      System.out.println("received an invalid message @StartStandingSexAnimation :(");
      return null;
    }
    
    private static Exception a(Exception param1Exception) {
      return param1Exception;
    }
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\c3.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */