package com.schnurritv.sexmod;

import io.netty.buffer.ByteBuf;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.io.FileUtils;

public class a5 implements IMessage {
  boolean f;
  
  List<String> a = new ArrayList<>();
  
  byte[] b;
  
  b e;
  
  String d;
  
  int c = 0;
  
  public a5() {}
  
  public a5(List<String> paramList) {
    this.a = paramList;
  }
  
  public a5(byte[] paramArrayOfbyte, b paramb, String paramString) {
    this.b = paramArrayOfbyte;
    this.e = paramb;
    this.d = paramString;
  }
  
  public int a() {
    return this.c;
  }
  
  public void a(int paramInt) {
    this.c = paramInt;
  }
  
  public void fromBytes(ByteBuf paramByteBuf) {
    try {
      if (Main.proxy instanceof ClientProxy) {
        try {
          if (!ai.e())
            return; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        this.d = ByteBufUtils.readUTF8String(paramByteBuf);
        this.e = b.valueOf(ByteBufUtils.readUTF8String(paramByteBuf));
        this.c = paramByteBuf.readInt();
        int j = paramByteBuf.readInt();
        this.b = new byte[j];
        byte b2 = 0;
        try {
          while (b2 < j) {
            this.b[b2] = paramByteBuf.readByte();
            b2++;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        this.f = true;
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    int i = paramByteBuf.readInt();
    byte b1 = 0;
    try {
      while (b1 < i) {
        this.a.add(ByteBufUtils.readUTF8String(paramByteBuf));
        b1++;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.f = true;
  }
  
  public void toBytes(ByteBuf paramByteBuf) {
    if (Main.proxy instanceof ClientProxy) {
      paramByteBuf.writeInt(this.a.size());
      for (String str : this.a)
        ByteBufUtils.writeUTF8String(paramByteBuf, str); 
      return;
    } 
    ByteBufUtils.writeUTF8String(paramByteBuf, this.d);
    ByteBufUtils.writeUTF8String(paramByteBuf, this.e.toString());
    paramByteBuf.writeInt(this.c);
    paramByteBuf.writeInt(this.b.length);
    for (byte b1 : this.b)
      paramByteBuf.writeByte(b1); 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  public enum b {
    CFG(".cfg"),
    PNG(".png"),
    GEO(".geo.json");
    
    public String ending;
    
    b(String param1String1) {
      this.ending = param1String1;
    }
  }
  
  public static class a implements IMessageHandler<a5, IMessage> {
    static int a = 0;
    
    @SideOnly(Side.CLIENT)
    void a(String param1String) {
      (Minecraft.func_71410_x()).field_71439_g.func_145747_a((ITextComponent)new TextComponentString(param1String));
    }
    
    @SideOnly(Side.CLIENT)
    void a() {
      Minecraft.func_71410_x().func_152343_a(() -> Integer.valueOf(ai.c(true)));
    }
    
    public IMessage a(a5 param1a5, MessageContext param1MessageContext) {
      try {
        if (!param1a5.f) {
          System.out.println("received an invalid Message @DownloadServerModel :(");
          return null;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      try {
        if (param1MessageContext.side.isClient()) {
          try {
            if (!ai.e())
              return null; 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          String str1 = param1a5.d;
          a5.b b = param1a5.e;
          byte[] arrayOfByte = param1a5.b;
          String str2 = ai.h() + "/" + str1;
          File file1 = new File(str2);
          file1.mkdirs();
          File file2 = new File(str2 + "/" + str1 + b.ending);
          try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            Throwable throwable = null;
            try {
              fileOutputStream.write(arrayOfByte);
            } catch (Throwable throwable1) {
              throwable = throwable1;
              throw throwable1;
            } finally {
              try {
                if (fileOutputStream != null)
                  if (throwable != null) {
                    try {
                      fileOutputStream.close();
                    } catch (Throwable throwable1) {
                      throwable.addSuppressed(throwable1);
                    } 
                  } else {
                    fileOutputStream.close();
                  }  
              } catch (Throwable throwable1) {
                throw a(null);
              } 
            } 
          } catch (IOException iOException) {
            iOException.printStackTrace();
          } 
          byte b1 = 0;
          int i = (a5.b.values()).length;
          for (a5.b b2 : a5.b.values()) {
            try {
              if ((new File(str2 + "/" + str1 + b2.ending)).exists())
                b1++; 
            } catch (Throwable throwable) {
              throw a(null);
            } 
          } 
          try {
            if (b1 == i) {
              a(String.format("%sSuccessfully downloaded the custom model '%s%s%s'!", new Object[] { TextFormatting.GREEN, TextFormatting.YELLOW, str1, TextFormatting.GREEN }));
            } else {
              a(String.format("%sdownloading custom model '%s%s%s' (%s/%s)...", new Object[] { TextFormatting.GRAY, TextFormatting.YELLOW, str1, TextFormatting.GRAY, Integer.valueOf(b1), Integer.valueOf(i) }));
            } 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          try {
            if (++a < param1a5.c)
              return null; 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          a = 0;
          a();
          return null;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      MinecraftServer minecraftServer = FMLCommonHandler.instance().getMinecraftServerInstance();
      minecraftServer.func_152344_a(() -> {
            List<String> list = param1a5.a;
            ArrayList<a5> arrayList = new ArrayList();
            for (String str1 : list) {
              String str2 = "sexmod_custom_models/" + str1;
              for (a5.b b : a5.b.values()) {
                File file = new File(str2 + "/" + str1 + b.ending);
                try {
                  if (!file.exists()) {
                    System.out.println(file.getAbsolutePath() + " doesnt exist lol");
                  } else {
                    byte[] arrayOfByte = null;
                    try {
                      arrayOfByte = FileUtils.readFileToByteArray(file);
                    } catch (IOException iOException) {
                      throw new RuntimeException(iOException);
                    } 
                    try {
                      if (arrayOfByte != null)
                        arrayList.add(new a5(arrayOfByte, b, str1)); 
                    } catch (IOException iOException) {
                      throw a(null);
                    } 
                  } 
                } catch (IOException iOException) {
                  throw a(null);
                } 
              } 
            } 
            int i = arrayList.size();
            for (a5 a51 : arrayList) {
              a51.a(i);
              param1MinecraftServer.func_152344_a(());
            } 
          });
      return null;
    }
    
    private static Throwable a(Throwable param1Throwable) {
      return param1Throwable;
    }
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\a5.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */