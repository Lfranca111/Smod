package com.schnurritv.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class i implements IMessage {
  boolean a = false;
  
  EntityPlayer c;
  
  HashMap<bB, String> b = new HashMap<>();
  
  public i() {}
  
  public i(EntityPlayer paramEntityPlayer) {
    this.c = paramEntityPlayer;
  }
  
  public void fromBytes(ByteBuf paramByteBuf) {
    int j = paramByteBuf.readInt();
    byte b = 0;
    try {
      while (b < j) {
        this.b.put(bB.valueOf(ByteBufUtils.readUTF8String(paramByteBuf)), ByteBufUtils.readUTF8String(paramByteBuf));
        b++;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.a = true;
  }
  
  public void toBytes(ByteBuf paramByteBuf) {
    for (bB bB : bB.values()) {
      try {
        if (bB.hasSpecifics) {
          String str = this.c.getEntityData().func_74779_i("sexmod:GirlSpecific" + bB);
          try {
            if (!"".equals(str))
              this.b.put(bB, str); 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    paramByteBuf.writeInt(this.b.size());
    for (Map.Entry<bB, String> entry : this.b.entrySet()) {
      ByteBufUtils.writeUTF8String(paramByteBuf, ((bB)entry.getKey()).toString());
      ByteBufUtils.writeUTF8String(paramByteBuf, (String)entry.getValue());
    } 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  public static class a implements IMessageHandler<i, IMessage> {
    public IMessage a(i param1i, MessageContext param1MessageContext) {
      try {
        if (param1i.a)
          try {
            if (param1MessageContext.side == Side.CLIENT) {
              a(param1i.b);
              return null;
            } 
            return null;
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      return null;
    }
    
    @SideOnly(Side.CLIENT)
    public void a(HashMap<bB, String> param1HashMap) {
      Minecraft minecraft = Minecraft.func_71410_x();
      minecraft.func_152344_a(() -> param1Minecraft.func_147108_a(new cr(param1HashMap)));
    }
    
    private static RuntimeException a(RuntimeException param1RuntimeException) {
      return param1RuntimeException;
    }
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */