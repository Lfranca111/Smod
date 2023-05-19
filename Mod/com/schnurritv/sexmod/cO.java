package com.schnurritv.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.UUID;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.WorldServer;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class co implements IMessage {
  boolean b;
  
  UUID a;
  
  public co() {}
  
  public co(UUID paramUUID) {
    this.a = paramUUID;
  }
  
  public void fromBytes(ByteBuf paramByteBuf) {
    this.a = UUID.fromString(ByteBufUtils.readUTF8String(paramByteBuf));
    this.b = true;
  }
  
  public void toBytes(ByteBuf paramByteBuf) {
    ByteBufUtils.writeUTF8String(paramByteBuf, this.a.toString());
  }
  
  public static class a implements IMessageHandler<co, IMessage> {
    public IMessage a(co param1co, MessageContext param1MessageContext) {
      try {
        if (param1co.b)
          try {
            if (param1MessageContext.side == Side.SERVER) {
              FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
                    ArrayList<bS> arrayList = bS.f(param1co.a);
                    for (bS bS : arrayList) {
                      try {
                        if (bS.field_70170_p.field_72995_K)
                          continue; 
                      } catch (RuntimeException runtimeException) {
                        throw a(null);
                      } 
                      try {
                        if (bS.o() != m.THROW_PEARL) {
                          bS.c(m.THROW_PEARL);
                          bS.a((float)Math.atan2(bS.field_70161_v - bS.f.field_72449_c, bS.field_70165_t - bS.f.field_72450_a) * 57.29578F + 90.0F);
                          bS.a(bS.func_174791_d());
                          bS.func_184212_Q().func_187227_b(bS.z, Boolean.valueOf(true));
                          bS.v = null;
                          continue;
                        } 
                      } catch (RuntimeException runtimeException) {
                        throw a(null);
                      } 
                      if (bS.v == null) {
                        float f = (float)bS.func_174791_d().func_72438_d(bS.f);
                        bS.v = new b(bS.field_70170_p, (EntityLivingBase)bS);
                        bS.v.func_70186_c(bS.f.field_72450_a - bS.field_70165_t, bS.f.field_72448_b - bS.field_70163_u, bS.f.field_72449_c - bS.field_70161_v, Math.min(4.0F, f * 0.1F), 0.0F);
                        bS.field_70170_p.func_72838_d((Entity)bS.v);
                        continue;
                      } 
                      WorldServer worldServer = (WorldServer)bS.field_70170_p;
                      byte b = 0;
                      try {
                        while (b < 32) {
                          worldServer.func_180505_a(EnumParticleTypes.PORTAL, false, bS.field_70165_t, bS.field_70163_u + U.f.nextDouble() * 2.0D, bS.field_70161_v, 32, 0.2D, 0.2D, 0.2D, U.f.nextGaussian(), new int[0]);
                          b++;
                        } 
                      } catch (RuntimeException runtimeException) {
                        throw a(null);
                      } 
                      bS.func_70107_b(bS.f.field_72450_a, bS.f.field_72448_b, bS.f.field_72449_c);
                      bS.v = null;
                      bS.c(m.NULL);
                      bS.func_184212_Q().func_187227_b(bS.z, Boolean.valueOf(false));
                      bS.A();
                    } 
                  });
              return null;
            } 
            System.out.println("received an invalid message @SendCompanionHome :(");
            return null;
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      System.out.println("received an invalid message @SendCompanionHome :(");
      return null;
    }
    
    private static RuntimeException a(RuntimeException param1RuntimeException) {
      return param1RuntimeException;
    }
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\co.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */