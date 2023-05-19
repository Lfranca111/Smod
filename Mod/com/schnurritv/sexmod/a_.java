package com.schnurritv.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class a_ implements IMessage {
  boolean c;
  
  String b;
  
  int d;
  
  UUID a;
  
  public a_(String paramString, int paramInt, UUID paramUUID) {
    this.b = paramString;
    this.d = paramInt;
    this.a = paramUUID;
    this.c = true;
  }
  
  public a_() {
    this.c = false;
  }
  
  public void fromBytes(ByteBuf paramByteBuf) {
    try {
      int i = paramByteBuf.readInt();
      byte[] arrayOfByte = new byte[i];
      byte b = 0;
      try {
        while (b < i) {
          arrayOfByte[b] = paramByteBuf.readByte();
          b++;
        } 
      } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
        throw a(null);
      } 
      this.b = new String(arrayOfByte);
      this.d = paramByteBuf.readInt();
      this.a = UUID.fromString(ByteBufUtils.readUTF8String(paramByteBuf));
      this.c = true;
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      this.c = false;
      System.out.println("couldn't read bytes @SendChatMessage :(");
      return;
    } 
  }
  
  public void toBytes(ByteBuf paramByteBuf) {
    paramByteBuf.writeInt((this.b.getBytes()).length);
    paramByteBuf.writeBytes(this.b.getBytes());
    paramByteBuf.writeInt(this.d);
    ByteBufUtils.writeUTF8String(paramByteBuf, this.a.toString());
  }
  
  private static IndexOutOfBoundsException a(IndexOutOfBoundsException paramIndexOutOfBoundsException) {
    return paramIndexOutOfBoundsException;
  }
  
  public static class a implements IMessageHandler<a_, IMessage> {
    public IMessage a(a_ param1a_, MessageContext param1MessageContext) {
      try {
        if (!param1a_.c) {
          System.out.println("recieved an unvalid message @SendChatMessage :(");
          return null;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (param1MessageContext.side.isClient()) {
          (Minecraft.func_71410_x()).field_71439_g.func_145747_a((ITextComponent)new TextComponentString(param1a_.b));
        } else {
          FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
                Vec3d vec3d = ((bS)bS.f(param1a_.a).get(0)).m();
                aV.a.sendToAllAround(new a_(param1a_.b, param1a_.d, param1a_.a), new NetworkRegistry.TargetPoint(param1a_.d, vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c, 40.0D));
              });
        } 
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


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\a_.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */