package com.schnurritv.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.vecmath.Vector4d;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class v implements IMessage {
  boolean c = false;
  
  boolean b = false;
  
  List<Vector4d> a = new ArrayList<>();
  
  public v() {}
  
  public v(boolean paramBoolean, List<Vector4d> paramList) {}
  
  static v a() {
    return new v(false, new ArrayList<>());
  }
  
  public void fromBytes(ByteBuf paramByteBuf) {
    this.b = paramByteBuf.readBoolean();
    int i = paramByteBuf.readInt();
    byte b = 0;
    try {
      while (b < i) {
        this.a.add(new Vector4d(paramByteBuf.readInt(), paramByteBuf.readInt(), paramByteBuf.readInt(), paramByteBuf.readInt()));
        b++;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.c = true;
  }
  
  public void toBytes(ByteBuf paramByteBuf) {
    paramByteBuf.writeBoolean(this.b);
    paramByteBuf.writeInt(this.a.size());
    for (Vector4d vector4d : this.a) {
      paramByteBuf.writeInt((int)vector4d.getX());
      paramByteBuf.writeInt((int)vector4d.getY());
      paramByteBuf.writeInt((int)vector4d.getZ());
      paramByteBuf.writeInt((int)vector4d.getW());
    } 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  public static class a implements IMessageHandler<v, IMessage> {
    public IMessage a(v param1v, MessageContext param1MessageContext) {
      try {
        if (!param1v.c) {
          System.out.println("received an invalid message @GetTribeUIValues :(");
          return null;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (param1MessageContext.side.isClient()) {
          cW.g = param1v.b;
          b3.az = param1v.a;
          return null;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
            UUID uUID = s.a((param1MessageContext.getServerHandler()).field_147369_b.getPersistentID());
            try {
              if (uUID == null) {
                aV.a.sendTo(v.a(), (param1MessageContext.getServerHandler()).field_147369_b);
                return;
              } 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            boolean bool = s.h(uUID);
            EntityPlayerMP entityPlayerMP = (param1MessageContext.getServerHandler()).field_147369_b;
            HashMap<UUID, BlockPos> hashMap = s.a(uUID, entityPlayerMP.field_70170_p);
            List<b3> list = s.m(uUID);
            ArrayList<Vector4d> arrayList = new ArrayList();
            int i = s.p(uUID).getWoolMeta();
            HashSet<UUID> hashSet = new HashSet();
            for (b3 b3 : list) {
              try {
                if (b3.field_70128_L)
                  continue; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              UUID uUID1 = b3.N();
              try {
                if (hashSet.contains(uUID1))
                  continue; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              if (b3.ab)
                i = EyeAndKoboldColor.safeValueOf((String)b3.func_184212_Q().func_187225_a(br.G)).getWoolMeta(); 
              arrayList.add(new Vector4d(b3.field_70165_t, b3.field_70163_u, b3.field_70161_v, i));
              hashSet.add(uUID1);
            } 
            for (Map.Entry<UUID, BlockPos> entry : hashMap.entrySet()) {
              try {
                if (hashSet.contains(entry.getKey()))
                  continue; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              BlockPos blockPos = (BlockPos)entry.getValue();
              arrayList.add(new Vector4d(blockPos.func_177958_n(), blockPos.func_177956_o(), blockPos.func_177952_p(), i));
            } 
            aV.a.sendTo(new v(bool, arrayList), entityPlayerMP);
          });
      return null;
    }
    
    private static RuntimeException a(RuntimeException param1RuntimeException) {
      return param1RuntimeException;
    }
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\v.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */