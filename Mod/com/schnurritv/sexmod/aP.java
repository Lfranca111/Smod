package com.schnurritv.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.UUID;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class ap implements IMessage {
  boolean e = false;
  
  String a;
  
  UUID c;
  
  UUID d;
  
  boolean b;
  
  public ap() {}
  
  public ap(String paramString, UUID paramUUID1, UUID paramUUID2, boolean paramBoolean) {
    this.a = paramString;
    this.c = paramUUID1;
    this.d = paramUUID2;
    this.b = paramBoolean;
  }
  
  public void fromBytes(ByteBuf paramByteBuf) {
    this.a = ByteBufUtils.readUTF8String(paramByteBuf);
    this.c = UUID.fromString(ByteBufUtils.readUTF8String(paramByteBuf));
    this.d = UUID.fromString(ByteBufUtils.readUTF8String(paramByteBuf));
    this.b = paramByteBuf.readBoolean();
    this.e = true;
  }
  
  public void toBytes(ByteBuf paramByteBuf) {
    ByteBufUtils.writeUTF8String(paramByteBuf, this.a);
    ByteBufUtils.writeUTF8String(paramByteBuf, this.c.toString());
    ByteBufUtils.writeUTF8String(paramByteBuf, this.d.toString());
    paramByteBuf.writeBoolean(this.b);
  }
  
  public static class a implements IMessageHandler<ap, IMessage> {
    public IMessage a(ap param1ap, MessageContext param1MessageContext) {
      try {
        if (!param1ap.e) {
          System.out.println("received an invalid message @SexPrompt :(");
          return null;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (param1MessageContext.side.equals(Side.CLIENT)) {
          cK.a.a(new cK.a(param1ap.a, param1ap.c, param1ap.d, param1ap.b));
          return null;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
            World world = (param1MessageContext.getServerHandler()).field_147369_b.field_70170_p;
            EntityPlayer entityPlayer1 = world.func_152378_a(param1ap.d);
            EntityPlayer entityPlayer2 = world.func_152378_a(param1ap.c);
            try {
              if (entityPlayer1 == null) {
                System.out.println("Sex prompt invalid -> female player not found");
                return;
              } 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            try {
              if (entityPlayer2 == null) {
                System.out.println("Sex prompt invalid -> male player not found");
                return;
              } 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            try {
            
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            aV.a.sendTo(new ap(param1ap.a, param1ap.c, param1ap.d, param1ap.b), param1ap.b ? (EntityPlayerMP)entityPlayer1 : (EntityPlayerMP)entityPlayer2);
          });
      return null;
    }
    
    private static RuntimeException a(RuntimeException param1RuntimeException) {
      return param1RuntimeException;
    }
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\ap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */