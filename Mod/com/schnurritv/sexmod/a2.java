package com.schnurritv.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.UUID;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class a2 implements IMessage {
  boolean a;
  
  UUID b;
  
  public a2() {}
  
  public a2(UUID paramUUID) {
    this.b = paramUUID;
  }
  
  public void fromBytes(ByteBuf paramByteBuf) {
    this.b = UUID.fromString(ByteBufUtils.readUTF8String(paramByteBuf));
    this.a = true;
  }
  
  public void toBytes(ByteBuf paramByteBuf) {
    ByteBufUtils.writeUTF8String(paramByteBuf, this.b.toString());
  }
  
  public static class a implements IMessageHandler<a2, IMessage> {
    public IMessage a(a2 param1a2, MessageContext param1MessageContext) {
      try {
        if (param1a2.a)
          try {
            if (param1MessageContext.side == Side.SERVER) {
              FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
                    ArrayList<bS> arrayList = bS.f(param1a2.b);
                    for (bS bS : arrayList) {
                      try {
                        if (bS.field_70170_p.field_72995_K)
                          continue; 
                      } catch (RuntimeException runtimeException) {
                        throw a(null);
                      } 
                      bS.field_70170_p.func_72900_e((Entity)bS);
                    } 
                  });
              return null;
            } 
            System.out.println("received an invalid message @UploadInventoryToServer :(");
            return null;
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      System.out.println("received an invalid message @UploadInventoryToServer :(");
      return null;
    }
    
    private static RuntimeException a(RuntimeException param1RuntimeException) {
      return param1RuntimeException;
    }
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\a2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */