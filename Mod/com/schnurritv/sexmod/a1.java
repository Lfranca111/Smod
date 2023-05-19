package com.schnurritv.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.UUID;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class a1 implements IMessage {
  boolean b;
  
  UUID a;
  
  Vec3d c;
  
  public a1() {}
  
  public a1(UUID paramUUID, Vec3d paramVec3d) {
    this.a = paramUUID;
    this.c = paramVec3d;
  }
  
  public void fromBytes(ByteBuf paramByteBuf) {
    this.a = UUID.fromString(ByteBufUtils.readUTF8String(paramByteBuf));
    this.c = new Vec3d(paramByteBuf.readDouble(), paramByteBuf.readDouble(), paramByteBuf.readDouble());
    this.b = true;
  }
  
  public void toBytes(ByteBuf paramByteBuf) {
    ByteBufUtils.writeUTF8String(paramByteBuf, this.a.toString());
    paramByteBuf.writeDouble(this.c.field_72450_a);
    paramByteBuf.writeDouble(this.c.field_72448_b);
    paramByteBuf.writeDouble(this.c.field_72449_c);
  }
  
  public static class a implements IMessageHandler<a1, IMessage> {
    public IMessage a(a1 param1a1, MessageContext param1MessageContext) {
      try {
        if (!param1a1.b) {
          System.out.println("received an invalid message @SetNewHome :(");
          return null;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
            ArrayList<bS> arrayList = bS.f(param1a1.a);
            try {
              if (arrayList.isEmpty())
                return; 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            for (bS bS : arrayList)
              bS.f = new Vec3d(param1a1.c.field_72450_a, Math.floor(param1a1.c.field_72448_b), param1a1.c.field_72449_c); 
          });
      return null;
    }
    
    private static RuntimeException a(RuntimeException param1RuntimeException) {
      return param1RuntimeException;
    }
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\a1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */