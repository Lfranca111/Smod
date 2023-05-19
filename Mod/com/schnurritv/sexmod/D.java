package com.schnurritv.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.UUID;
import net.minecraft.util.EnumParticleTypes;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class d implements IMessage {
  boolean b = false;
  
  UUID a;
  
  String c;
  
  int d;
  
  public d() {}
  
  public d(UUID paramUUID, String paramString) {
    this.a = paramUUID;
    this.c = paramString;
    this.d = 1;
  }
  
  public d(UUID paramUUID, String paramString, int paramInt) {
    this.a = paramUUID;
    this.c = paramString;
    this.d = paramInt;
  }
  
  public void fromBytes(ByteBuf paramByteBuf) {
    this.a = UUID.fromString(ByteBufUtils.readUTF8String(paramByteBuf));
    this.c = ByteBufUtils.readUTF8String(paramByteBuf);
    this.d = paramByteBuf.readInt();
    this.b = true;
  }
  
  public void toBytes(ByteBuf paramByteBuf) {
    ByteBufUtils.writeUTF8String(paramByteBuf, this.a.toString());
    ByteBufUtils.writeUTF8String(paramByteBuf, this.c);
    paramByteBuf.writeInt(this.d);
  }
  
  public static class a implements IMessageHandler<d, IMessage> {
    public IMessage a(d param1d, MessageContext param1MessageContext) {
      try {
        if (param1d.b)
          try {
            if (param1MessageContext.side.equals(Side.CLIENT)) {
              ArrayList<bS> arrayList = bS.f(param1d.a);
              for (bS bS : arrayList) {
                try {
                  if (!bS.field_70170_p.field_72995_K)
                    continue; 
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                } 
                byte b = 0;
                try {
                  while (b < param1d.d) {
                    bS.a(EnumParticleTypes.func_186831_a(param1d.c), bS);
                    b++;
                  } 
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                } 
              } 
              return null;
            } 
            System.out.println("received an invalid message @SpawnParticle :(");
            return null;
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      System.out.println("received an invalid message @SpawnParticle :(");
      return null;
    }
    
    private static RuntimeException a(RuntimeException param1RuntimeException) {
      return param1RuntimeException;
    }
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */