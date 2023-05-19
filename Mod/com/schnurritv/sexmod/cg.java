package com.schnurritv.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class cg implements IMessage {
  boolean b = false;
  
  HashMap<String, Float> a = new HashMap<>();
  
  public cg() {}
  
  public cg(HashMap<String, Float> paramHashMap) {
    this.a = paramHashMap;
  }
  
  public void fromBytes(ByteBuf paramByteBuf) {
    try {
      if (!(Main.proxy instanceof ClientProxy)) {
        this.b = true;
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!ai.e())
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    int i = paramByteBuf.readInt();
    byte b = 0;
    try {
      while (b < i) {
        this.a.put(ByteBufUtils.readUTF8String(paramByteBuf), Float.valueOf(paramByteBuf.readFloat()));
        b++;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.b = true;
  }
  
  public void toBytes(ByteBuf paramByteBuf) {
    try {
      if (Main.proxy instanceof ClientProxy)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    paramByteBuf.writeInt(this.a.size());
    for (Map.Entry<String, Float> entry : this.a.entrySet()) {
      ByteBufUtils.writeUTF8String(paramByteBuf, (String)entry.getKey());
      paramByteBuf.writeFloat(((Float)entry.getValue()).floatValue());
    } 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  public static class a implements IMessageHandler<cg, IMessage> {
    public IMessage a(cg param1cg, MessageContext param1MessageContext) {
      try {
        if (!param1cg.b) {
          System.out.println("received an invalid Message @RequestServerModelAvailability :(");
          return null;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (param1MessageContext.side.isClient()) {
          try {
            if (!ai.e())
              return null; 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          ArrayList<String> arrayList = new ArrayList();
          for (Map.Entry<String, Float> entry : param1cg.a.entrySet()) {
            String str = (String)entry.getKey();
            try {
              if (!ai.b(str)) {
                arrayList.add(str);
                continue;
              } 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            float f1 = ai.g(str);
            float f2 = ((Float)entry.getValue()).floatValue();
            try {
              if (f2 > f1)
                arrayList.add(str); 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
          } 
          return new a5(arrayList);
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> aV.a.sendTo(new cg(ai.c()), (param1MessageContext.getServerHandler()).field_147369_b));
      return null;
    }
    
    private static RuntimeException a(RuntimeException param1RuntimeException) {
      return param1RuntimeException;
    }
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\cg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */