package com.schnurritv.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.UUID;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class k implements IMessage {
  boolean c;
  
  UUID d;
  
  String b;
  
  String a;
  
  public k() {
    this.c = false;
  }
  
  public k(UUID paramUUID, String paramString1, String paramString2) {
    this.d = paramUUID;
    this.b = paramString1;
    this.a = paramString2;
    this.c = true;
  }
  
  public void fromBytes(ByteBuf paramByteBuf) {
    this.d = UUID.fromString(ByteBufUtils.readUTF8String(paramByteBuf));
    this.b = ByteBufUtils.readUTF8String(paramByteBuf);
    this.a = ByteBufUtils.readUTF8String(paramByteBuf);
    this.c = true;
  }
  
  public void toBytes(ByteBuf paramByteBuf) {
    try {
      ByteBufUtils.writeUTF8String(paramByteBuf, this.d.toString());
      ByteBufUtils.writeUTF8String(paramByteBuf, this.b);
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    ByteBufUtils.writeUTF8String(paramByteBuf, (this.a == null) ? "null" : this.a);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  public static class a implements IMessageHandler<k, IMessage> {
    public IMessage a(k param1k, MessageContext param1MessageContext) {
      try {
        if (!param1k.c) {
          System.out.println("received an invalid message @ChangeDataParameter :(");
          return null;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
            for (bS bS : bS.f(param1k.d)) {
              try {
                if (bS.field_70170_p.field_72995_K)
                  continue; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              try {
                if (!param1k.d.equals(bS.N()))
                  continue; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              String str = param1k.b;
              byte b = -1;
              try {
                switch (str.hashCode()) {
                  case -1287492899:
                    if (str.equals("pregnant"))
                      b = 0; 
                    break;
                  case 1452134704:
                    if (str.equals("currentModel"))
                      b = 1; 
                    break;
                  case 1712351503:
                    if (str.equals("currentAction"))
                      b = 2; 
                    break;
                  case 679533008:
                    if (str.equals("animationFollowUp"))
                      b = 3; 
                    break;
                  case -1206220351:
                    if (str.equals("playerSheHasSexWith"))
                      b = 4; 
                    break;
                  case -815590653:
                    if (str.equals("targetPos"))
                      b = 5; 
                    break;
                  case -1081267614:
                    if (str.equals("master"))
                      b = 6; 
                    break;
                  case -395351248:
                    if (str.equals("walk speed"))
                      b = 7; 
                    break;
                  case -1243330214:
                    if (str.equals("shouldbeattargetpos"))
                      b = 8; 
                    break;
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              try {
                String[] arrayOfString;
                Vec3d vec3d;
                switch (b) {
                  case 0:
                    bS.func_184212_Q().func_187227_b(bY.I, Integer.valueOf(param1k.a));
                  case 1:
                    bS.func_184212_Q().func_187227_b(bS.F, Integer.valueOf(param1k.a));
                  case 2:
                    try {
                      if (m.valueOf(param1k.a) == m.ATTACK)
                        try {
                          if (bS.o() != m.NULL)
                            continue; 
                        } catch (RuntimeException runtimeException) {
                          throw a(null);
                        }  
                    } catch (RuntimeException runtimeException) {
                      throw a(null);
                    } 
                    bS.c(m.valueOf(param1k.a));
                  case 3:
                    bS.func_184212_Q().func_187227_b(bS.u, param1k.a);
                  case 4:
                    try {
                      if (param1k.a.equals("null")) {
                        bS.e((UUID)null);
                        continue;
                      } 
                    } catch (RuntimeException runtimeException) {
                      throw a(null);
                    } 
                    bS.e(UUID.fromString(param1k.a));
                  case 5:
                    arrayOfString = param1k.a.split("f");
                    vec3d = new Vec3d(Double.parseDouble(arrayOfString[0]), Double.parseDouble(arrayOfString[1]), Double.parseDouble(arrayOfString[2]));
                    bS.a(vec3d);
                  case 6:
                    bS.func_184212_Q().func_187227_b(bS.b, param1k.a);
                  case 7:
                    bS.func_184212_Q().func_187227_b(bS.s, param1k.a);
                  case 8:
                    bS.func_184212_Q().func_187227_b(bS.z, Boolean.valueOf(param1k.a));
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
            } 
          });
      return null;
    }
    
    private static RuntimeException a(RuntimeException param1RuntimeException) {
      return param1RuntimeException;
    }
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */