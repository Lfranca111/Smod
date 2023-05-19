package com.schnurritv.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.UUID;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class a4 implements IMessage {
  boolean b = false;
  
  UUID c;
  
  int d;
  
  m a;
  
  public a4() {}
  
  public a4(UUID paramUUID, int paramInt, m paramm) {
    this.c = paramUUID;
    this.d = paramInt;
    this.a = paramm;
  }
  
  public void fromBytes(ByteBuf paramByteBuf) {
    this.c = UUID.fromString(ByteBufUtils.readUTF8String(paramByteBuf));
    this.d = paramByteBuf.readInt();
    this.a = m.valueOf(ByteBufUtils.readUTF8String(paramByteBuf));
    this.b = true;
  }
  
  public void toBytes(ByteBuf paramByteBuf) {
    ByteBufUtils.writeUTF8String(paramByteBuf, this.c.toString());
    paramByteBuf.writeInt(this.d);
    ByteBufUtils.writeUTF8String(paramByteBuf, this.a.toString());
  }
  
  public static class a implements IMessageHandler<a4, IMessage> {
    public IMessage a(a4 param1a4, MessageContext param1MessageContext) {
      try {
        if (param1a4.b)
          try {
            if (param1MessageContext.side.equals(Side.CLIENT)) {
              bo bo = bo.f(param1a4.c);
              try {
                if (bo == null)
                  return null; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              bo.func_184212_Q().func_187227_b(bS.a, param1a4.a.toString());
              bo.func_184212_Q().func_187227_b(bS.F, Integer.valueOf(param1a4.d));
              return null;
            } 
            System.out.println("received an invalid message @ForcePlayerGirlUpdate :(");
            return null;
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      System.out.println("received an invalid message @ForcePlayerGirlUpdate :(");
      return null;
    }
    
    private static RuntimeException a(RuntimeException param1RuntimeException) {
      return param1RuntimeException;
    }
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\a4.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */