package com.schnurritv.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.UUID;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class p implements IMessage {
  boolean c = false;
  
  UUID b;
  
  ItemStack a;
  
  public p() {}
  
  public p(UUID paramUUID, ItemStack paramItemStack) {
    this.b = paramUUID;
    this.a = paramItemStack;
  }
  
  public void fromBytes(ByteBuf paramByteBuf) {
    this.b = UUID.fromString(ByteBufUtils.readUTF8String(paramByteBuf));
    this.a = ByteBufUtils.readItemStack(paramByteBuf);
    this.c = true;
  }
  
  public void toBytes(ByteBuf paramByteBuf) {
    ByteBufUtils.writeUTF8String(paramByteBuf, this.b.toString());
    ByteBufUtils.writeItemStack(paramByteBuf, this.a);
  }
  
  public static class a implements IMessageHandler<p, IMessage> {
    public IMessage a(p param1p, MessageContext param1MessageContext) {
      try {
        if (param1p.c)
          try {
            if (param1MessageContext.side == Side.SERVER) {
              FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
                    InventoryPlayer inventoryPlayer = (FMLCommonHandler.instance().getMinecraftServerInstance().func_184103_al().func_177451_a(param1p.b)).field_71071_by;
                    for (byte b = 0; b < inventoryPlayer.func_70302_i_(); b++) {
                      ItemStack itemStack = inventoryPlayer.func_70301_a(b);
                      try {
                        if (itemStack.func_77973_b().equals(param1p.a.func_77973_b())) {
                          itemStack.func_190918_g(param1p.a.func_190916_E());
                          break;
                        } 
                      } catch (RuntimeException runtimeException) {
                        throw a(null);
                      } 
                    } 
                  });
              return null;
            } 
            System.out.println("recieved an unvalid message @RemoveItems :(");
            return null;
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      System.out.println("recieved an unvalid message @RemoveItems :(");
      return null;
    }
    
    private static RuntimeException a(RuntimeException param1RuntimeException) {
      return param1RuntimeException;
    }
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\p.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */