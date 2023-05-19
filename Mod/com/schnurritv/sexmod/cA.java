package com.schnurritv.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.UUID;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.management.PlayerList;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class cA implements IMessage {
  boolean b;
  
  UUID a;
  
  UUID c;
  
  public cA() {
    this.b = false;
  }
  
  public cA(UUID paramUUID1, UUID paramUUID2) {
    this.a = paramUUID1;
    this.c = paramUUID2;
    this.b = true;
  }
  
  public void fromBytes(ByteBuf paramByteBuf) {
    this.a = UUID.fromString(ByteBufUtils.readUTF8String(paramByteBuf));
    this.c = UUID.fromString(ByteBufUtils.readUTF8String(paramByteBuf));
    this.b = true;
  }
  
  public void toBytes(ByteBuf paramByteBuf) {
    ByteBufUtils.writeUTF8String(paramByteBuf, this.a.toString());
    ByteBufUtils.writeUTF8String(paramByteBuf, this.c.toString());
  }
  
  public static class a implements IMessageHandler<cA, IMessage> {
    public IMessage a(cA param1cA, MessageContext param1MessageContext) {
      try {
        if (param1cA.b)
          try {
            if (param1MessageContext.side == Side.SERVER) {
              FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
                    ArrayList<bS> arrayList = bS.f(param1cA.a);
                    for (bS bS : arrayList) {
                      PlayerList playerList = FMLCommonHandler.instance().getMinecraftServerInstance().func_184103_al();
                      try {
                        playerList.func_177451_a(param1cA.c).func_70005_c_();
                      } catch (NullPointerException nullPointerException) {
                        System.out.println("couldn't find player with UUID: " + param1cA.c);
                        System.out.println("could only find players with thsese UUID's:");
                        for (EntityPlayerMP entityPlayerMP : playerList.func_181057_v())
                          System.out.println(entityPlayerMP.func_70005_c_() + " " + entityPlayerMP.func_110124_au()); 
                        continue;
                      } 
                      try {
                        if (bS instanceof b8)
                          ((b8)bS).X = true; 
                      } catch (NullPointerException nullPointerException) {
                        throw a(null);
                      } 
                      bS.e(param1cA.c);
                    } 
                  });
              return null;
            } 
            System.out.println("received an invalid message @SetPlayerForGirl :(");
            return null;
          } catch (NullPointerException nullPointerException) {
            throw a(null);
          }  
      } catch (NullPointerException nullPointerException) {
        throw a(null);
      } 
      System.out.println("received an invalid message @SetPlayerForGirl :(");
      return null;
    }
    
    private static NullPointerException a(NullPointerException param1NullPointerException) {
      return param1NullPointerException;
    }
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\cA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */