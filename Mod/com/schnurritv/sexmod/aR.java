package com.schnurritv.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.UUID;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class ar implements IMessage {
  boolean b = false;
  
  UUID a;
  
  public ar() {}
  
  public ar(UUID paramUUID) {
    this.a = paramUUID;
  }
  
  public void fromBytes(ByteBuf paramByteBuf) {
    this.a = UUID.fromString(ByteBufUtils.readUTF8String(paramByteBuf));
    this.b = true;
  }
  
  public void toBytes(ByteBuf paramByteBuf) {
    ByteBufUtils.writeUTF8String(paramByteBuf, this.a.toString());
  }
  
  public static class a implements IMessageHandler<ar, IMessage> {
    public IMessage a(ar param1ar, MessageContext param1MessageContext) {
      try {
        if (param1ar.b)
          try {
            if (param1MessageContext.side == Side.SERVER) {
              FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
                    ArrayList<bS> arrayList = bS.f(param1ar.a);
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
                      ItemStack itemStack = bg.U;
                      r r = (r)itemStack.func_77973_b();
                      r.a((param1MessageContext.getServerHandler()).field_147369_b.field_70170_p, bg, EnumHand.MAIN_HAND);
                    } 
                  });
              return null;
            } 
            System.out.println("received an invalid message @CatActivateFishing :(");
            return null;
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      System.out.println("received an invalid message @CatActivateFishing :(");
      return null;
    }
    
    private static RuntimeException a(RuntimeException param1RuntimeException) {
      return param1RuntimeException;
    }
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\ar.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */