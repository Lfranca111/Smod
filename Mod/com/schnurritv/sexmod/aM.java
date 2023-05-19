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

public class am implements IMessage {
  boolean b = false;
  
  UUID a;
  
  public am() {}
  
  public am(UUID paramUUID) {
    this.a = paramUUID;
  }
  
  public void fromBytes(ByteBuf paramByteBuf) {
    this.a = UUID.fromString(ByteBufUtils.readUTF8String(paramByteBuf));
    this.b = true;
  }
  
  public void toBytes(ByteBuf paramByteBuf) {
    ByteBufUtils.writeUTF8String(paramByteBuf, this.a.toString());
  }
  
  public static class a implements IMessageHandler<am, IMessage> {
    public IMessage a(am param1am, MessageContext param1MessageContext) {
      try {
        if (param1am.b)
          try {
            if (param1MessageContext.side.equals(Side.SERVER)) {
              FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
                    ArrayList<bS> arrayList = bS.f(param1am.a);
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
                      bg.r();
                    } 
                  });
              return null;
            } 
            System.out.println("received an invalid message @CatEatingDone :(");
            return null;
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      System.out.println("received an invalid message @CatEatingDone :(");
      return null;
    }
    
    private static RuntimeException a(RuntimeException param1RuntimeException) {
      return param1RuntimeException;
    }
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\am.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */