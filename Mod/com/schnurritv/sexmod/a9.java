package com.schnurritv.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.UUID;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class a9 implements IMessage {
  boolean a = false;
  
  UUID b;
  
  public a9() {}
  
  public a9(UUID paramUUID) {
    this.b = paramUUID;
  }
  
  public void fromBytes(ByteBuf paramByteBuf) {
    this.b = UUID.fromString(ByteBufUtils.readUTF8String(paramByteBuf));
    this.a = true;
  }
  
  public void toBytes(ByteBuf paramByteBuf) {
    ByteBufUtils.writeUTF8String(paramByteBuf, this.b.toString());
  }
  
  public static class a implements IMessageHandler<a9, IMessage> {
    public IMessage a(a9 param1a9, MessageContext param1MessageContext) {
      try {
        if (param1a9.a)
          try {
            if (param1MessageContext.side.equals(Side.SERVER)) {
              FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
                    ArrayList<bS> arrayList = bS.f(param1a9.b);
                    for (bS bS : arrayList) {
                      try {
                        if (bS.field_70170_p.field_72995_K)
                          continue; 
                      } catch (RuntimeException runtimeException) {
                        throw a(null);
                      } 
                      try {
                        if (!(bS instanceof bg))
                          continue; 
                      } catch (RuntimeException runtimeException) {
                        throw a(null);
                      } 
                      bg bg = (bg)bS;
                      bg.e();
                    } 
                  });
              return null;
            } 
            System.out.println("received an invalid message @CatThrowAwayItem :(");
            return null;
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      System.out.println("received an invalid message @CatThrowAwayItem :(");
      return null;
    }
    
    private static RuntimeException a(RuntimeException param1RuntimeException) {
      return param1RuntimeException;
    }
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\a9.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */