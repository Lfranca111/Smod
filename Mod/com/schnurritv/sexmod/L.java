package com.schnurritv.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.UUID;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.server.management.PlayerList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class l implements IMessage {
  boolean b = false;
  
  UUID a;
  
  UUID d;
  
  String c;
  
  public l() {}
  
  public l(UUID paramUUID1, UUID paramUUID2, String paramString) {
    this.a = paramUUID1;
    this.d = paramUUID2;
    this.c = paramString;
  }
  
  public void fromBytes(ByteBuf paramByteBuf) {
    this.a = UUID.fromString(ByteBufUtils.readUTF8String(paramByteBuf));
    this.d = UUID.fromString(ByteBufUtils.readUTF8String(paramByteBuf));
    this.c = ByteBufUtils.readUTF8String(paramByteBuf);
    this.b = true;
  }
  
  public void toBytes(ByteBuf paramByteBuf) {
    ByteBufUtils.writeUTF8String(paramByteBuf, this.a.toString());
    ByteBufUtils.writeUTF8String(paramByteBuf, this.d.toString());
    ByteBufUtils.writeUTF8String(paramByteBuf, this.c);
  }
  
  public static class a implements IMessageHandler<l, IMessage> {
    public IMessage a(l param1l, MessageContext param1MessageContext) {
      try {
        if (param1l.b)
          try {
            if (param1MessageContext.side == Side.SERVER) {
              FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
                    List<b3> list = s.m(param1l.a);
                    EyeAndKoboldColor eyeAndKoboldColor = null;
                    for (b3 b3 : list) {
                      try {
                        if (b3.O())
                          continue; 
                      } catch (RuntimeException runtimeException) {
                        throw a(null);
                      } 
                      EntityDataManager entityDataManager = b3.func_184212_Q();
                      entityDataManager.func_187227_b(bS.b, param1l.d.toString());
                      entityDataManager.func_187227_b(b3.ai, param1l.c);
                      eyeAndKoboldColor = EyeAndKoboldColor.valueOf((String)entityDataManager.func_187225_a(b3.G));
                    } 
                    try {
                      if (eyeAndKoboldColor == null)
                        return; 
                    } catch (RuntimeException runtimeException) {
                      throw a(null);
                    } 
                    PlayerList playerList = FMLCommonHandler.instance().getMinecraftServerInstance().func_184103_al();
                    String str = (param1MessageContext.getServerHandler()).field_147369_b.func_70005_c_();
                    for (EntityPlayer entityPlayer : playerList.func_181057_v()) {
                      entityPlayer.func_145747_a((ITextComponent)new TextComponentString(String.format("%s formed the " + eyeAndKoboldColor.getTextColor() + "%s " + TextFormatting.WHITE + "Tribe", new Object[] { str, param1l.c })));
                    } 
                    s.a(param1l.a, true);
                    s.a(param1l.a, (param1MessageContext.getServerHandler()).field_147369_b.getPersistentID());
                  });
              return null;
            } 
            System.out.println("received an invalid message @ClaimTribe :(");
            return null;
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      System.out.println("received an invalid message @ClaimTribe :(");
      return null;
    }
    
    private static RuntimeException a(RuntimeException param1RuntimeException) {
      return param1RuntimeException;
    }
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */