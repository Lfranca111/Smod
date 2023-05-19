package com.schnurritv.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.UUID;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class aq implements IMessage {
  public static final int c = 100;
  
  boolean b;
  
  UUID a;
  
  UUID d;
  
  public aq() {
    this.b = false;
  }
  
  public aq(UUID paramUUID) {
    this.a = paramUUID;
    this.b = true;
  }
  
  public void fromBytes(ByteBuf paramByteBuf) {
    this.a = UUID.fromString(ByteBufUtils.readUTF8String(paramByteBuf));
    this.b = true;
  }
  
  public void toBytes(ByteBuf paramByteBuf) {
    ByteBufUtils.writeUTF8String(paramByteBuf, this.a.toString());
  }
  
  public static class a implements IMessageHandler<aq, IMessage> {
    public IMessage a(aq param1aq, MessageContext param1MessageContext) {
      try {
        if (!param1aq.b) {
          System.out.println("received an invalid message @ResetController :(");
          return null;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      if (param1MessageContext.side.isServer()) {
        bS bS1 = bS.j(param1aq.a);
        UUID uUID = (param1MessageContext.getServerHandler()).field_147369_b.getPersistentID();
        (bS1.o()).ticksPlaying = 0;
        for (EntityPlayerMP entityPlayerMP : FMLCommonHandler.instance().getMinecraftServerInstance().func_184103_al().func_181057_v()) {
          try {
            if (!uUID.equals(entityPlayerMP.getPersistentID()))
              try {
                if (entityPlayerMP.func_70032_d((Entity)bS1) < 100.0F)
                  aV.a.sendTo(new aq(param1aq.a), entityPlayerMP); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              }  
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
        } 
        return null;
      } 
      bS bS = bS.k(param1aq.a);
      try {
        if (bS != null)
          bS.M(); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      return null;
    }
    
    private static RuntimeException a(RuntimeException param1RuntimeException) {
      return param1RuntimeException;
    }
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\aq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */