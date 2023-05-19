package com.schnurritv.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.UUID;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class an implements IMessage {
  boolean d;
  
  String c;
  
  Vec3d a;
  
  float b;
  
  float e;
  
  public an() {
    this.d = false;
  }
  
  public an(String paramString, Vec3d paramVec3d) {
    this.c = paramString;
    this.a = paramVec3d;
    this.b = 0.0F;
    this.e = 0.0F;
    this.d = true;
  }
  
  public an(String paramString, Vec3d paramVec3d, float paramFloat1, float paramFloat2) {
    this.c = paramString;
    this.a = paramVec3d;
    this.b = paramFloat1;
    this.e = paramFloat2;
    this.d = true;
  }
  
  public an(String paramString, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    this.c = paramString;
    this.a = new Vec3d(paramDouble1, paramDouble2, paramDouble3);
    this.b = paramFloat1;
    this.e = paramFloat2;
    this.d = true;
  }
  
  public void fromBytes(ByteBuf paramByteBuf) {
    this.c = ByteBufUtils.readUTF8String(paramByteBuf);
    this.a = new Vec3d(paramByteBuf.readDouble(), paramByteBuf.readDouble(), paramByteBuf.readDouble());
    this.b = paramByteBuf.readFloat();
    this.e = paramByteBuf.readFloat();
    this.d = true;
  }
  
  public void toBytes(ByteBuf paramByteBuf) {
    ByteBufUtils.writeUTF8String(paramByteBuf, this.c);
    paramByteBuf.writeDouble(this.a.field_72450_a);
    paramByteBuf.writeDouble(this.a.field_72448_b);
    paramByteBuf.writeDouble(this.a.field_72449_c);
    paramByteBuf.writeFloat(this.b);
    paramByteBuf.writeFloat(this.e);
    this.d = true;
  }
  
  public static class a implements IMessageHandler<an, IMessage> {
    public IMessage a(an param1an, MessageContext param1MessageContext) {
      try {
        if (param1an.d)
          try {
            if (param1MessageContext.side == Side.SERVER) {
              FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
                    try {
                      System.out.println("teleporting player " + param1an.c + " to " + param1an.a);
                      EntityPlayerMP entityPlayerMP = FMLCommonHandler.instance().getMinecraftServerInstance().func_184103_al().func_177451_a(UUID.fromString(param1an.c));
                      entityPlayerMP.func_70080_a(param1an.a.field_72450_a, param1an.a.field_72448_b, param1an.a.field_72449_c, param1an.b, param1an.e);
                      entityPlayerMP.func_70634_a(param1an.a.field_72450_a, param1an.a.field_72448_b, param1an.a.field_72449_c);
                      entityPlayerMP.field_70159_w = 0.0D;
                      entityPlayerMP.field_70181_x = 0.0D;
                      entityPlayerMP.field_70179_y = 0.0D;
                    } catch (Exception exception) {
                      System.out.println("couldn't find player with UUID: " + param1an.c);
                      System.out.println("could only find the following players:");
                      System.out.println(FMLCommonHandler.instance().getMinecraftServerInstance().func_184103_al().func_181058_b(true));
                    } 
                  });
              return null;
            } 
            System.out.println("received an invalid message @TeleportPlayer :(");
            return null;
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      System.out.println("received an invalid message @TeleportPlayer :(");
      return null;
    }
    
    private static RuntimeException a(RuntimeException param1RuntimeException) {
      return param1RuntimeException;
    }
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\an.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */