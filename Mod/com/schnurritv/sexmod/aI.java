package com.schnurritv.sexmod;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.logging.log4j.Level;
import software.bernie.geckolib3.geo.raw.pojo.RawGeoModel;
import software.bernie.geckolib3.geo.raw.tree.RawGeometryTree;
import software.bernie.geckolib3.geo.render.GeoBuilder;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.resource.GeckoLibCache;

public class ai {
  public static final String a = "sexmod/custom_models";
  
  static final String e = "sexmod/custom_models/whitelisted_servers.txt";
  
  public static final String b = "sexmod_custom_models";
  
  static Map<String, a> d = new HashMap<>();
  
  public static boolean c = false;
  
  public static Map<String, a> a() {
    return d;
  }
  
  public static boolean b(String paramString) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (d.get(paramString) != null);
  }
  
  public static int c(boolean paramBoolean) {
    b(paramBoolean);
    return a(paramBoolean);
  }
  
  static void b(Level paramLevel, String paramString) {
    try {
      if (Main.proxy instanceof ClientProxy) {
        a(paramLevel, paramString);
      } else {
        Main.LOGGER.log(paramLevel, paramString);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public static void b(boolean paramBoolean) {
    try {
      if (paramBoolean)
        g(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    d.clear();
  }
  
  public static void b() {
    aV.a.sendToServer(new cg());
  }
  
  @SideOnly(Side.CLIENT)
  public static boolean e() {
    ServerData serverData = Minecraft.func_71410_x().func_147104_D();
    try {
      if (serverData == null)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return i(serverData.field_78845_b);
  }
  
  public static void k(String paramString) {
    File file = new File("sexmod/custom_models/whitelisted_servers.txt");
    file.mkdirs();
    HashSet<String> hashSet = new HashSet();
    if (file.exists())
      hashSet = d(); 
    hashSet.add(paramString);
    file.delete();
    file = new File("sexmod/custom_models/whitelisted_servers.txt");
    try {
      FileWriter fileWriter = new FileWriter(file);
      Throwable throwable = null;
      try {
        for (String str : hashSet)
          fileWriter.write(str + "\n"); 
      } catch (Throwable throwable1) {
        throwable = throwable1;
        throw throwable1;
      } finally {
        try {
          if (fileWriter != null)
            if (throwable != null) {
              try {
                fileWriter.close();
              } catch (Throwable throwable1) {
                throwable.addSuppressed(throwable1);
              } 
            } else {
              fileWriter.close();
            }  
        } catch (Throwable throwable1) {
          throw a(null);
        } 
      } 
    } catch (IOException iOException) {
      iOException.printStackTrace();
    } 
  }
  
  public static boolean i(String paramString) {
    return d().contains(paramString);
  }
  
  static HashSet<String> d() {
    // Byte code:
    //   0: new java/io/File
    //   3: dup
    //   4: ldc 'sexmod/custom_models/whitelisted_servers.txt'
    //   6: invokespecial <init> : (Ljava/lang/String;)V
    //   9: astore_0
    //   10: aload_0
    //   11: invokevirtual createNewFile : ()Z
    //   14: pop
    //   15: goto -> 23
    //   18: astore_1
    //   19: aload_1
    //   20: invokevirtual printStackTrace : ()V
    //   23: new java/util/HashSet
    //   26: dup
    //   27: invokespecial <init> : ()V
    //   30: astore_1
    //   31: new java/io/BufferedReader
    //   34: dup
    //   35: new java/io/FileReader
    //   38: dup
    //   39: aload_0
    //   40: invokespecial <init> : (Ljava/io/File;)V
    //   43: invokespecial <init> : (Ljava/io/Reader;)V
    //   46: astore_2
    //   47: aconst_null
    //   48: astore_3
    //   49: aload_2
    //   50: invokevirtual readLine : ()Ljava/lang/String;
    //   53: dup
    //   54: astore #4
    //   56: ifnull -> 73
    //   59: aload_1
    //   60: aload #4
    //   62: invokevirtual add : (Ljava/lang/Object;)Z
    //   65: pop
    //   66: goto -> 49
    //   69: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   72: athrow
    //   73: aload_2
    //   74: ifnull -> 163
    //   77: aload_3
    //   78: ifnull -> 106
    //   81: goto -> 88
    //   84: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   87: athrow
    //   88: aload_2
    //   89: invokevirtual close : ()V
    //   92: goto -> 163
    //   95: astore #4
    //   97: aload_3
    //   98: aload #4
    //   100: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
    //   103: goto -> 163
    //   106: aload_2
    //   107: invokevirtual close : ()V
    //   110: goto -> 163
    //   113: astore #4
    //   115: aload #4
    //   117: astore_3
    //   118: aload #4
    //   120: athrow
    //   121: astore #5
    //   123: aload_2
    //   124: ifnull -> 160
    //   127: aload_3
    //   128: ifnull -> 156
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   137: athrow
    //   138: aload_2
    //   139: invokevirtual close : ()V
    //   142: goto -> 160
    //   145: astore #6
    //   147: aload_3
    //   148: aload #6
    //   150: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
    //   153: goto -> 160
    //   156: aload_2
    //   157: invokevirtual close : ()V
    //   160: aload #5
    //   162: athrow
    //   163: goto -> 179
    //   166: astore_2
    //   167: aload_2
    //   168: invokevirtual printStackTrace : ()V
    //   171: new java/util/HashSet
    //   174: dup
    //   175: invokespecial <init> : ()V
    //   178: areturn
    //   179: aload_1
    //   180: areturn
    // Exception table:
    //   from	to	target	type
    //   10	15	18	java/lang/Exception
    //   31	163	166	java/io/IOException
    //   49	73	113	java/lang/Throwable
    //   49	73	121	finally
    //   56	69	69	java/lang/Exception
    //   73	81	84	java/lang/Exception
    //   88	92	95	java/lang/Throwable
    //   113	123	121	finally
    //   123	131	134	java/lang/Exception
    //   138	142	145	java/lang/Throwable
  }
  
  public static float g(String paramString) {
    a a = d.get(paramString);
    try {
      if (a == null)
        return 0.0F; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return a.h();
  }
  
  @SideOnly(Side.CLIENT)
  static void g() {
    for (Map.Entry<String, a> entry : d.entrySet()) {
      a a = (a)entry.getValue();
      try {
        if (a == null)
          continue; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      ResourceLocation resourceLocation1 = a.a();
      ResourceLocation resourceLocation2 = a.j();
      try {
        if (resourceLocation1 != null)
          GeckoLibCache.getInstance().getGeoModels().remove(resourceLocation1); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (resourceLocation2 != null)
          (Minecraft.func_71410_x()).field_71446_o.func_147645_c(resourceLocation2); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
  }
  
  @SideOnly(Side.CLIENT)
  static void a(Level paramLevel, String paramString) {
    TextFormatting textFormatting;
    EntityPlayerSP entityPlayerSP = (Minecraft.func_71410_x()).field_71439_g;
    try {
      if (entityPlayerSP == null) {
        Main.LOGGER.log(paramLevel, paramString);
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    if (Level.DEBUG.equals(paramLevel)) {
      textFormatting = TextFormatting.DARK_GREEN;
    } else if (Level.ERROR.equals(paramLevel)) {
      textFormatting = TextFormatting.RED;
    } else {
      textFormatting = TextFormatting.WHITE;
    } 
    entityPlayerSP.func_145747_a((ITextComponent)new TextComponentString(textFormatting.toString() + paramString));
  }
  
  public static String h() {
    try {
      if (Main.proxy instanceof ClientProxy)
        return f(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return "sexmod_custom_models";
  }
  
  @SideOnly(Side.CLIENT)
  public static String f() {
    Minecraft minecraft = Minecraft.func_71410_x();
    ServerData serverData = minecraft.func_147104_D();
    try {
      if (serverData == null)
        return "sexmod/custom_models/singleplayer"; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    String str = serverData.field_78845_b;
    return "sexmod/custom_models/" + str;
  }
  
  public static int a(boolean paramBoolean) {
    b(Level.INFO, "loading up custom models...");
    String str = h();
    File file = new File(str);
    file.mkdirs();
    String[] arrayOfString = file.list((paramFile, paramString) -> (new File(paramFile, paramString)).isDirectory());
    try {
      if (arrayOfString == null) {
        b(Level.ERROR, String.format("Something is wrong with the custom models folder at '%s'. Check if it exists, if not - make the directory yourself because Minecraft cannot do it itself for some reason", new Object[] { file.getAbsolutePath() }));
        return -1;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    b(Level.INFO, String.format("found %s custom model(s)", new Object[] { Integer.valueOf(arrayOfString.length) }));
    byte b = 0;
    for (String str1 : arrayOfString) {
      String str2 = a(str1, str);
      try {
        if (!"".equals(str2)) {
          b(Level.ERROR, str2);
          return -1;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      str2 = a(str1, str, paramBoolean);
      try {
        if (!"".equals(str2)) {
          b(Level.ERROR, str2);
          return -1;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      b++;
    } 
    b(Level.DEBUG, String.format("successfully registered %s custom models", new Object[] { Integer.valueOf(b) }));
    return 0;
  }
  
  static String a(String paramString1, String paramString2) {
    String str = String.format("%s/%s", new Object[] { paramString2, paramString1 });
    File file1 = new File(String.format("%s/%s.geo.json", new Object[] { str, paramString1 }));
    File file2 = new File(String.format("%s/%s.png", new Object[] { str, paramString1 }));
    File file3 = new File(String.format("%s/%s.cfg", new Object[] { str, paramString1 }));
    try {
      if (!file1.exists())
        return String.format("couldn't find model File for '%s'. It should have been at '%s'. Are you sure it exists?", new Object[] { paramString1, file1.getAbsolutePath() }); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!file2.exists())
        return String.format("couldn't find texture File for '%s'. It should have been at '%s'. Are you sure it exists?", new Object[] { paramString1, file2.getAbsolutePath() }); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!file3.exists())
        return String.format("couldn't find cfg File for '%s'. It should have been at '%s'. Are you sure it exists?", new Object[] { paramString1, file3.getAbsolutePath() }); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return "";
  }
  
  @SideOnly(Side.CLIENT)
  static ResourceLocation a(String paramString, File paramFile) throws Exception {
    BufferedImage bufferedImage = ImageIO.read(paramFile);
    return (Minecraft.func_71410_x()).field_71446_o.func_110578_a(paramString, new DynamicTexture(bufferedImage));
  }
  
  @SideOnly(Side.CLIENT)
  static RawGeoModel a(File paramFile) throws IOException {
    // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_1
    //   8: new java/io/BufferedReader
    //   11: dup
    //   12: new java/io/FileReader
    //   15: dup
    //   16: aload_0
    //   17: invokespecial <init> : (Ljava/io/File;)V
    //   20: invokespecial <init> : (Ljava/io/Reader;)V
    //   23: astore_2
    //   24: aconst_null
    //   25: astore_3
    //   26: aload_2
    //   27: invokevirtual readLine : ()Ljava/lang/String;
    //   30: dup
    //   31: astore #4
    //   33: ifnull -> 50
    //   36: aload_1
    //   37: aload #4
    //   39: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   42: pop
    //   43: goto -> 26
    //   46: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   49: athrow
    //   50: aload_2
    //   51: ifnull -> 140
    //   54: aload_3
    //   55: ifnull -> 83
    //   58: goto -> 65
    //   61: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   64: athrow
    //   65: aload_2
    //   66: invokevirtual close : ()V
    //   69: goto -> 140
    //   72: astore #4
    //   74: aload_3
    //   75: aload #4
    //   77: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
    //   80: goto -> 140
    //   83: aload_2
    //   84: invokevirtual close : ()V
    //   87: goto -> 140
    //   90: astore #4
    //   92: aload #4
    //   94: astore_3
    //   95: aload #4
    //   97: athrow
    //   98: astore #5
    //   100: aload_2
    //   101: ifnull -> 137
    //   104: aload_3
    //   105: ifnull -> 133
    //   108: goto -> 115
    //   111: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   114: athrow
    //   115: aload_2
    //   116: invokevirtual close : ()V
    //   119: goto -> 137
    //   122: astore #6
    //   124: aload_3
    //   125: aload #6
    //   127: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
    //   130: goto -> 137
    //   133: aload_2
    //   134: invokevirtual close : ()V
    //   137: aload #5
    //   139: athrow
    //   140: aload_1
    //   141: invokevirtual toString : ()Ljava/lang/String;
    //   144: astore_2
    //   145: aload_2
    //   146: invokestatic fromJsonString : (Ljava/lang/String;)Lsoftware/bernie/geckolib3/geo/raw/pojo/RawGeoModel;
    //   149: areturn
    // Exception table:
    //   from	to	target	type
    //   26	50	90	java/lang/Throwable
    //   26	50	98	finally
    //   33	46	46	java/lang/Throwable
    //   50	58	61	java/lang/Throwable
    //   65	69	72	java/lang/Throwable
    //   90	100	98	finally
    //   100	108	111	java/lang/Throwable
    //   115	119	122	java/lang/Throwable
  }
  
  public static String a(String paramString1, String paramString2, boolean paramBoolean) {
    try {
      if (d.get(paramString1) != null)
        return String.format("already registered '%s'... honestly, unsure how this could happen lol", new Object[] { paramString1 }); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    String str1 = String.format("%s/%s/", new Object[] { paramString2, paramString1 });
    String str2 = str1 + paramString1 + ".cfg";
    File file1 = new File(str2);
    try {
      if (!file1.exists())
        return String.format("couldn't find cfg File for '%s'. It should have been at '%s'. Are you sure it exists?", new Object[] { paramString1, str2 }); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    a a = new a(file1, paramString1);
    try {
      if (a.m != null)
        return a.m; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    String str3 = str1 + paramString1 + ".png";
    File file2 = new File(str3);
    try {
      if (!file2.exists())
        return String.format("The texture for the custom model '%s' couldn't be found at '%s' are you sure it exists?", new Object[] { paramString1, str3 }); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    ResourceLocation resourceLocation1 = null;
    if (paramBoolean)
      try {
        resourceLocation1 = a(paramString1, file2);
      } catch (IOException iOException) {
        return String.format("The texture for the custom model '%s' at '%s' appears to be corrupted. Try making a new one", new Object[] { paramString1, str3 });
      } catch (Exception exception) {
        return String.format("Couldn't load the texture for the custom model '%s' at '%s'. Maybe try increasing the amount of RAM of ur Minecraft client", new Object[] { paramString1, file2 });
      }  
    ResourceLocation resourceLocation2 = new ResourceLocation("sexmod", paramString1 + "Model");
    String str4 = str1 + paramString1 + ".geo.json";
    File file3 = new File(str4);
    try {
      if (!file3.exists())
        return String.format("The geo model for the custom model '%s' couldn't be found at '%s' are you sure it exists?", new Object[] { paramString1, str4 }); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    if (paramBoolean) {
      RawGeoModel rawGeoModel;
      try {
        rawGeoModel = a(file3);
      } catch (IOException iOException) {
        return String.format("The geo model for the custom model '%s' at '%s' appears to be corrupted. Try replacing it.", new Object[] { paramString1, str4 });
      } 
      try {
        RawGeometryTree rawGeometryTree = RawGeometryTree.parseHierarchy(rawGeoModel, resourceLocation2);
        GeoModel geoModel = GeoBuilder.getGeoBuilder(resourceLocation2.func_110624_b()).constructGeoModel(rawGeometryTree);
        GeckoLibCache.getInstance().getGeoModels().put(resourceLocation2, geoModel);
      } catch (Exception exception) {
        return String.format("The geo model for the custom model '%s' at '%s' appears to be corrupted. Try replacing it.", new Object[] { paramString1, str4 });
      } 
    } 
    try {
      if (paramBoolean) {
        a.b(resourceLocation2);
        a.a(resourceLocation1);
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    d.put(paramString1, a);
    b(Level.DEBUG, String.format("successfully registered custom model '%s'", new Object[] { paramString1 }));
    return "";
  }
  
  public static ResourceLocation h(String paramString) {
    a a = d.get(paramString);
    try {
      if (a == null) {
        try {
          if (!paramString.equals("cross"))
            System.out.printf("The custom model for '%s', hasn't been registered, but gamers tried to use it anyways. Crash is imminent%n", new Object[] { paramString }); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return null;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return a.a();
  }
  
  public static ResourceLocation l(String paramString) {
    a a = d.get(paramString);
    try {
      if (a == null) {
        try {
          if (!paramString.equals("cross"))
            System.out.printf("The custom texture for '%s', hasn't been registered, but gamers tried to use it anyways. Crash is imminent%n", new Object[] { paramString }); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return null;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return a.j();
  }
  
  public static GeoModel j(String paramString) {
    return (GeoModel)GeckoLibCache.getInstance().getGeoModels().get(h(paramString));
  }
  
  public static ah d(String paramString) {
    a a = d.get(paramString);
    try {
      if (a == null) {
        try {
          if (!paramString.equals("cross"))
            System.out.printf("The ClothingType for '%s', hasn't been registered, but gamers tried to use it anyways. Crash is imminent%n", new Object[] { paramString }); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return ah.HEAD;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return a.d;
  }
  
  public static HashSet<bB> f(String paramString) {
    a a = d.get(paramString);
    try {
      if (a == null) {
        try {
          if (!paramString.equals("cross"))
            System.out.printf("The HashSet<GirlType> for '%s', hasn't been registered, but gamers tried to use it anyways. Crash is imminent%n", new Object[] { paramString }); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return new HashSet<>();
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return a.i;
  }
  
  public static HashSet<String> e(String paramString) {
    a a = d.get(paramString);
    try {
      if (a == null) {
        try {
          if (!paramString.equals("cross"))
            System.out.printf("The HashSet<String> for '%s', hasn't been registered, but gamers tried to use it anyways. Crash is imminent%n", new Object[] { paramString }); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return new HashSet<>();
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return a.g;
  }
  
  public static String a(String paramString) {
    a a = d.get(paramString);
    try {
      if (a == null) {
        try {
          if (!paramString.equals("cross"))
            System.out.printf("The author for '%s', hasn't been registered, but gamers tried to use it anyways. Crash is imminent%n", new Object[] { paramString }); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return "";
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return a.j;
  }
  
  @Nullable
  public static a c(String paramString) {
    return d.get(paramString);
  }
  
  public static HashMap<ah, List<String>> a(bS parambS) {
    HashMap<Object, Object> hashMap = new HashMap<>();
    for (ah ah : ah.values())
      hashMap.put(ah, new ArrayList()); 
    for (Map.Entry<String, a> entry : d.entrySet()) {
      String str = (String)entry.getKey();
      a a = (a)entry.getValue();
      ah ah = a.d;
      List<String> list = (List)hashMap.get(ah);
      try {
        if (!a.i.isEmpty())
          try {
            if (!a.i.contains(bB.a((Entity)parambS)))
              continue; 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      list.add(str);
      hashMap.put(ah, list);
    } 
    return (HashMap)hashMap;
  }
  
  public static HashMap<String, Float> c() {
    HashMap<Object, Object> hashMap = new HashMap<>();
    for (Map.Entry<String, a> entry : a().entrySet())
      hashMap.put(entry.getKey(), Float.valueOf(((a)entry.getValue()).h())); 
    return (HashMap)hashMap;
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  public static class a {
    ah d;
    
    HashSet<bB> i;
    
    HashSet<String> g;
    
    String j;
    
    String f;
    
    boolean b;
    
    ad l;
    
    float k;
    
    float h;
    
    ResourceLocation e;
    
    ResourceLocation c;
    
    public String m;
    
    float a;
    
    public a(File param1File, String param1String) {
      // Byte code:
      //   0: aload_0
      //   1: invokespecial <init> : ()V
      //   4: aload_0
      //   5: new java/util/HashSet
      //   8: dup
      //   9: invokespecial <init> : ()V
      //   12: putfield i : Ljava/util/HashSet;
      //   15: aload_0
      //   16: new java/util/HashSet
      //   19: dup
      //   20: invokespecial <init> : ()V
      //   23: putfield g : Ljava/util/HashSet;
      //   26: aload_0
      //   27: fconst_1
      //   28: putfield k : F
      //   31: aload_0
      //   32: fconst_0
      //   33: putfield h : F
      //   36: aload_0
      //   37: aconst_null
      //   38: putfield m : Ljava/lang/String;
      //   41: aload_2
      //   42: ldc ' '
      //   44: invokevirtual contains : (Ljava/lang/CharSequence;)Z
      //   47: ifne -> 75
      //   50: aload_2
      //   51: ldc '#'
      //   53: invokevirtual contains : (Ljava/lang/CharSequence;)Z
      //   56: ifne -> 75
      //   59: aload_2
      //   60: ldc '$'
      //   62: invokevirtual contains : (Ljava/lang/CharSequence;)Z
      //   65: ifeq -> 97
      //   68: goto -> 75
      //   71: invokestatic a : (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
      //   74: athrow
      //   75: aload_0
      //   76: ldc 'You cannot call your custom model '%s'. '#', '$' and spaces are illegal characters'
      //   78: iconst_1
      //   79: anewarray java/lang/Object
      //   82: dup
      //   83: iconst_0
      //   84: aload_2
      //   85: aastore
      //   86: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      //   89: putfield m : Ljava/lang/String;
      //   92: return
      //   93: invokestatic a : (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
      //   96: athrow
      //   97: ldc 'cross'
      //   99: aload_2
      //   100: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
      //   103: ifeq -> 117
      //   106: aload_0
      //   107: ldc 'You cannot call your custom model 'cross'. Im sorry, but I need that specific name for internal stuff'
      //   109: putfield m : Ljava/lang/String;
      //   112: return
      //   113: invokestatic a : (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
      //   116: athrow
      //   117: new java/util/Properties
      //   120: dup
      //   121: invokespecial <init> : ()V
      //   124: astore_3
      //   125: new java/io/FileInputStream
      //   128: dup
      //   129: aload_1
      //   130: invokespecial <init> : (Ljava/io/File;)V
      //   133: astore #4
      //   135: goto -> 165
      //   138: astore #5
      //   140: aload_0
      //   141: ldc 'couldn't find cfg File for '%s'. It should have been at '%s'. Are you sure it exists?'
      //   143: iconst_2
      //   144: anewarray java/lang/Object
      //   147: dup
      //   148: iconst_0
      //   149: aload_2
      //   150: aastore
      //   151: dup
      //   152: iconst_1
      //   153: aload_1
      //   154: invokevirtual getAbsolutePath : ()Ljava/lang/String;
      //   157: aastore
      //   158: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      //   161: putfield m : Ljava/lang/String;
      //   164: return
      //   165: aload_3
      //   166: aload #4
      //   168: invokevirtual load : (Ljava/io/InputStream;)V
      //   171: goto -> 201
      //   174: astore #5
      //   176: aload_0
      //   177: ldc 'couldn't read the cfg File for '%s' at '%s'. It appears to be corrupted. Try making a new one'
      //   179: iconst_2
      //   180: anewarray java/lang/Object
      //   183: dup
      //   184: iconst_0
      //   185: aload_2
      //   186: aastore
      //   187: dup
      //   188: iconst_1
      //   189: aload_1
      //   190: invokevirtual getAbsolutePath : ()Ljava/lang/String;
      //   193: aastore
      //   194: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      //   197: putfield m : Ljava/lang/String;
      //   200: return
      //   201: aload_3
      //   202: ldc 'wear_type'
      //   204: invokevirtual getProperty : (Ljava/lang/String;)Ljava/lang/String;
      //   207: astore #5
      //   209: aload #5
      //   211: ifnonnull -> 243
      //   214: aload_0
      //   215: ldc 'The cfg File for the model '%s' at '%s' is missing the 'wear_type'. Go to the bottom of the cfg File and write 'wear_type=HEAD'. Check the cfg files of my examples to see what values for 'wear_type' are possible'
      //   217: iconst_2
      //   218: anewarray java/lang/Object
      //   221: dup
      //   222: iconst_0
      //   223: aload_2
      //   224: aastore
      //   225: dup
      //   226: iconst_1
      //   227: aload_1
      //   228: invokevirtual getAbsolutePath : ()Ljava/lang/String;
      //   231: aastore
      //   232: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      //   235: putfield m : Ljava/lang/String;
      //   238: return
      //   239: invokestatic a : (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
      //   242: athrow
      //   243: aload #5
      //   245: ldc ' '
      //   247: ldc ''
      //   249: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      //   252: astore #5
      //   254: aload_0
      //   255: aload #5
      //   257: invokestatic valueOf : (Ljava/lang/String;)Lcom/schnurritv/sexmod/ah;
      //   260: putfield d : Lcom/schnurritv/sexmod/ah;
      //   263: goto -> 298
      //   266: astore #6
      //   268: aload_0
      //   269: ldc 'you entered '%s' into the 'wear_type' field of the %s's cfg file at '%s'. This is not a valid value. Check my examples on what valid values are to enter into the field 'wear_type'
      //   271: iconst_3
      //   272: anewarray java/lang/Object
      //   275: dup
      //   276: iconst_0
      //   277: aload #5
      //   279: aastore
      //   280: dup
      //   281: iconst_1
      //   282: aload_2
      //   283: aastore
      //   284: dup
      //   285: iconst_2
      //   286: aload_1
      //   287: invokevirtual getAbsolutePath : ()Ljava/lang/String;
      //   290: aastore
      //   291: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      //   294: putfield m : Ljava/lang/String;
      //   297: return
      //   298: getstatic com/schnurritv/sexmod/ah.CUSTOM_BONE : Lcom/schnurritv/sexmod/ah;
      //   301: aload_0
      //   302: getfield d : Lcom/schnurritv/sexmod/ah;
      //   305: invokevirtual equals : (Ljava/lang/Object;)Z
      //   308: ifeq -> 369
      //   311: aload_0
      //   312: aload_3
      //   313: ldc 'custom_bone'
      //   315: invokevirtual getProperty : (Ljava/lang/String;)Ljava/lang/String;
      //   318: putfield f : Ljava/lang/String;
      //   321: ldc ''
      //   323: aload_0
      //   324: getfield f : Ljava/lang/String;
      //   327: invokevirtual equals : (Ljava/lang/Object;)Z
      //   330: ifeq -> 369
      //   333: goto -> 340
      //   336: invokestatic a : (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
      //   339: athrow
      //   340: aload_0
      //   341: ldc 'You selected CUSTOM_BONE as the 'wear_type' in the cfg file for '%s' at '%s', yet you left the 'custom_bone' field right underneath it empty. If you want ur model to be parented to a specific bone, you have to enter the name of that bone at the field 'custom_bone'.'
      //   343: iconst_2
      //   344: anewarray java/lang/Object
      //   347: dup
      //   348: iconst_0
      //   349: aload_2
      //   350: aastore
      //   351: dup
      //   352: iconst_1
      //   353: aload_1
      //   354: invokevirtual getAbsolutePath : ()Ljava/lang/String;
      //   357: aastore
      //   358: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      //   361: putfield m : Ljava/lang/String;
      //   364: return
      //   365: invokestatic a : (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
      //   368: athrow
      //   369: aload_3
      //   370: ldc 'which_girls'
      //   372: invokevirtual getProperty : (Ljava/lang/String;)Ljava/lang/String;
      //   375: astore #6
      //   377: aload #6
      //   379: ldc ' '
      //   381: ldc ''
      //   383: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      //   386: astore #6
      //   388: aload #6
      //   390: ldc ','
      //   392: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
      //   395: astore #7
      //   397: aload #7
      //   399: astore #8
      //   401: aload #8
      //   403: arraylength
      //   404: istore #9
      //   406: iconst_0
      //   407: istore #10
      //   409: iload #10
      //   411: iload #9
      //   413: if_icmpge -> 494
      //   416: aload #8
      //   418: iload #10
      //   420: aaload
      //   421: astore #11
      //   423: ldc ''
      //   425: aload #11
      //   427: invokevirtual equals : (Ljava/lang/Object;)Z
      //   430: ifeq -> 440
      //   433: goto -> 488
      //   436: invokestatic a : (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
      //   439: athrow
      //   440: aload_0
      //   441: getfield i : Ljava/util/HashSet;
      //   444: aload #11
      //   446: invokestatic valueOf : (Ljava/lang/String;)Lcom/schnurritv/sexmod/bB;
      //   449: invokevirtual add : (Ljava/lang/Object;)Z
      //   452: pop
      //   453: goto -> 488
      //   456: astore #12
      //   458: aload_0
      //   459: ldc 'you entered '%s' as one of the girls, you put into the 'which_girls' field of the %s's cfg file at '%s'. This is not a valid value. Check my examples on what valid values are to enter into the field 'which_girls'.'
      //   461: iconst_3
      //   462: anewarray java/lang/Object
      //   465: dup
      //   466: iconst_0
      //   467: aload #11
      //   469: aastore
      //   470: dup
      //   471: iconst_1
      //   472: aload_2
      //   473: aastore
      //   474: dup
      //   475: iconst_2
      //   476: aload_1
      //   477: invokevirtual getAbsolutePath : ()Ljava/lang/String;
      //   480: aastore
      //   481: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      //   484: putfield m : Ljava/lang/String;
      //   487: return
      //   488: iinc #10, 1
      //   491: goto -> 409
      //   494: aload_3
      //   495: ldc 'which_lighting'
      //   497: invokevirtual getProperty : (Ljava/lang/String;)Ljava/lang/String;
      //   500: astore #8
      //   502: aload #8
      //   504: ifnonnull -> 536
      //   507: aload_0
      //   508: ldc 'The %s's cfg file at '%s' doesn't contain the field 'which_lighting'. Go to the bottom of the cfg file and write either 'which_lighting=DEFAULT', 'which_lighting=SEXMOD', or 'which_lighting=NONE'.'
      //   510: iconst_2
      //   511: anewarray java/lang/Object
      //   514: dup
      //   515: iconst_0
      //   516: aload_2
      //   517: aastore
      //   518: dup
      //   519: iconst_1
      //   520: aload_1
      //   521: invokevirtual getAbsolutePath : ()Ljava/lang/String;
      //   524: aastore
      //   525: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      //   528: putfield m : Ljava/lang/String;
      //   531: return
      //   532: invokestatic a : (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
      //   535: athrow
      //   536: aload #8
      //   538: ldc ' '
      //   540: ldc ''
      //   542: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      //   545: astore #8
      //   547: aload_0
      //   548: aload #8
      //   550: invokestatic valueOf : (Ljava/lang/String;)Lcom/schnurritv/sexmod/ad;
      //   553: putfield l : Lcom/schnurritv/sexmod/ad;
      //   556: goto -> 590
      //   559: astore #9
      //   561: aload_0
      //   562: ldc 'you entered '%s' into the 'which_lighting' field of the %s's cfg file at '%s'. This is not a valid value. Check my examples on what valid values are to enter into the field 'which_lighting'.'
      //   564: iconst_3
      //   565: anewarray java/lang/Object
      //   568: dup
      //   569: iconst_0
      //   570: aload #8
      //   572: aastore
      //   573: dup
      //   574: iconst_1
      //   575: aload_2
      //   576: aastore
      //   577: dup
      //   578: iconst_2
      //   579: aload_1
      //   580: invokevirtual getAbsolutePath : ()Ljava/lang/String;
      //   583: aastore
      //   584: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      //   587: putfield m : Ljava/lang/String;
      //   590: aload_3
      //   591: ldc 'author'
      //   593: invokevirtual getProperty : (Ljava/lang/String;)Ljava/lang/String;
      //   596: astore #9
      //   598: aload #9
      //   600: ifnull -> 620
      //   603: ldc ''
      //   605: aload #9
      //   607: invokevirtual equals : (Ljava/lang/Object;)Z
      //   610: ifeq -> 633
      //   613: goto -> 620
      //   616: invokestatic a : (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
      //   619: athrow
      //   620: aload_0
      //   621: ldc 'anon'
      //   623: putfield j : Ljava/lang/String;
      //   626: goto -> 639
      //   629: invokestatic a : (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
      //   632: athrow
      //   633: aload_0
      //   634: aload #9
      //   636: putfield j : Ljava/lang/String;
      //   639: aload_3
      //   640: ldc 'bones_to_hide'
      //   642: invokevirtual getProperty : (Ljava/lang/String;)Ljava/lang/String;
      //   645: astore #10
      //   647: aload #10
      //   649: ifnull -> 702
      //   652: ldc ''
      //   654: aload #10
      //   656: invokevirtual equals : (Ljava/lang/Object;)Z
      //   659: ifne -> 702
      //   662: goto -> 669
      //   665: invokestatic a : (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
      //   668: athrow
      //   669: aload #10
      //   671: ldc ' '
      //   673: ldc ''
      //   675: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      //   678: astore #10
      //   680: aload #10
      //   682: ldc ','
      //   684: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
      //   687: astore #11
      //   689: aload_0
      //   690: getfield g : Ljava/util/HashSet;
      //   693: aload #11
      //   695: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
      //   698: invokevirtual addAll : (Ljava/util/Collection;)Z
      //   701: pop
      //   702: aload_3
      //   703: ldc 'enable_when_nude'
      //   705: invokevirtual getProperty : (Ljava/lang/String;)Ljava/lang/String;
      //   708: astore #11
      //   710: aload #11
      //   712: ifnonnull -> 727
      //   715: aload_0
      //   716: iconst_0
      //   717: putfield b : Z
      //   720: goto -> 749
      //   723: invokestatic a : (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
      //   726: athrow
      //   727: aload #11
      //   729: ldc ' '
      //   731: ldc ''
      //   733: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      //   736: astore #11
      //   738: aload_0
      //   739: aload #11
      //   741: ldc 'yes'
      //   743: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
      //   746: putfield b : Z
      //   749: aload_3
      //   750: ldc 'gui_size_factor'
      //   752: invokevirtual getProperty : (Ljava/lang/String;)Ljava/lang/String;
      //   755: astore #12
      //   757: aload #12
      //   759: ifnull -> 844
      //   762: ldc ''
      //   764: aload #12
      //   766: invokevirtual equals : (Ljava/lang/Object;)Z
      //   769: ifne -> 844
      //   772: goto -> 779
      //   775: invokestatic a : (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
      //   778: athrow
      //   779: aload #12
      //   781: ldc ' '
      //   783: ldc ''
      //   785: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      //   788: astore #12
      //   790: aload #12
      //   792: ldc ','
      //   794: ldc '.'
      //   796: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      //   799: astore #12
      //   801: aload_0
      //   802: aload #12
      //   804: invokestatic parseFloat : (Ljava/lang/String;)F
      //   807: putfield k : F
      //   810: goto -> 844
      //   813: astore #13
      //   815: aload_0
      //   816: ldc 'you entered '%s' into the 'gui_size_factor' field of the %s's cfg file at '%s'. This is not a valid value. Check my examples on what valid values are to enter into the field 'gui_size_factor'.'
      //   818: iconst_3
      //   819: anewarray java/lang/Object
      //   822: dup
      //   823: iconst_0
      //   824: aload #12
      //   826: aastore
      //   827: dup
      //   828: iconst_1
      //   829: aload_2
      //   830: aastore
      //   831: dup
      //   832: iconst_2
      //   833: aload_1
      //   834: invokevirtual getAbsolutePath : ()Ljava/lang/String;
      //   837: aastore
      //   838: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      //   841: putfield m : Ljava/lang/String;
      //   844: aload_3
      //   845: ldc 'gui_vertical_positioning'
      //   847: invokevirtual getProperty : (Ljava/lang/String;)Ljava/lang/String;
      //   850: astore #13
      //   852: aload #13
      //   854: ifnull -> 939
      //   857: ldc ''
      //   859: aload #13
      //   861: invokevirtual equals : (Ljava/lang/Object;)Z
      //   864: ifne -> 939
      //   867: goto -> 874
      //   870: invokestatic a : (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
      //   873: athrow
      //   874: aload #13
      //   876: ldc ' '
      //   878: ldc ''
      //   880: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      //   883: astore #13
      //   885: aload #13
      //   887: ldc ','
      //   889: ldc '.'
      //   891: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      //   894: astore #13
      //   896: aload_0
      //   897: aload #13
      //   899: invokestatic parseFloat : (Ljava/lang/String;)F
      //   902: putfield h : F
      //   905: goto -> 939
      //   908: astore #14
      //   910: aload_0
      //   911: ldc 'you entered '%s' into the 'gui_vertical_positioning' field of the %s's cfg file at '%s'. This is not a valid value. Check my examples on what valid values are to enter into the field 'gui_vertical_positioning'.'
      //   913: iconst_3
      //   914: anewarray java/lang/Object
      //   917: dup
      //   918: iconst_0
      //   919: aload #13
      //   921: aastore
      //   922: dup
      //   923: iconst_1
      //   924: aload_2
      //   925: aastore
      //   926: dup
      //   927: iconst_2
      //   928: aload_1
      //   929: invokevirtual getAbsolutePath : ()Ljava/lang/String;
      //   932: aastore
      //   933: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      //   936: putfield m : Ljava/lang/String;
      //   939: aload_3
      //   940: ldc 'version'
      //   942: invokevirtual getProperty : (Ljava/lang/String;)Ljava/lang/String;
      //   945: astore #14
      //   947: aload #14
      //   949: ldc ' '
      //   951: ldc ''
      //   953: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      //   956: astore #14
      //   958: aload #14
      //   960: ldc ','
      //   962: ldc '.'
      //   964: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      //   967: astore #14
      //   969: aload_0
      //   970: aload #14
      //   972: invokestatic parseFloat : (Ljava/lang/String;)F
      //   975: putfield a : F
      //   978: goto -> 1012
      //   981: astore #15
      //   983: aload_0
      //   984: ldc 'you entered '%s' into the 'versionString' field of the %s's cfg file at '%s'. This is not a valid value. Check my examples on what valid values are to enter into the field 'versionString'.'
      //   986: iconst_3
      //   987: anewarray java/lang/Object
      //   990: dup
      //   991: iconst_0
      //   992: aload #14
      //   994: aastore
      //   995: dup
      //   996: iconst_1
      //   997: aload_2
      //   998: aastore
      //   999: dup
      //   1000: iconst_2
      //   1001: aload_1
      //   1002: invokevirtual getAbsolutePath : ()Ljava/lang/String;
      //   1005: aastore
      //   1006: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      //   1009: putfield m : Ljava/lang/String;
      //   1012: return
      // Exception table:
      //   from	to	target	type
      //   50	68	71	java/io/FileNotFoundException
      //   59	93	93	java/io/FileNotFoundException
      //   97	113	113	java/io/FileNotFoundException
      //   125	135	138	java/io/FileNotFoundException
      //   165	171	174	java/io/IOException
      //   209	239	239	java/io/FileNotFoundException
      //   243	263	266	java/lang/IllegalArgumentException
      //   298	333	336	java/io/FileNotFoundException
      //   311	365	365	java/io/FileNotFoundException
      //   423	433	456	java/lang/IllegalArgumentException
      //   423	436	436	java/io/FileNotFoundException
      //   440	453	456	java/lang/IllegalArgumentException
      //   502	532	532	java/io/FileNotFoundException
      //   547	556	559	java/lang/IllegalArgumentException
      //   598	613	616	java/io/FileNotFoundException
      //   603	629	629	java/io/FileNotFoundException
      //   647	662	665	java/io/FileNotFoundException
      //   710	723	723	java/io/FileNotFoundException
      //   757	772	775	java/io/FileNotFoundException
      //   801	810	813	java/lang/NumberFormatException
      //   852	867	870	java/io/FileNotFoundException
      //   896	905	908	java/lang/NumberFormatException
      //   969	978	981	java/lang/NumberFormatException
    }
    
    public String e() {
      return this.f;
    }
    
    public ad f() {
      return this.l;
    }
    
    public float c() {
      return this.h;
    }
    
    public float g() {
      return this.k;
    }
    
    public ah l() {
      return this.d;
    }
    
    public HashSet<bB> d() {
      return this.i;
    }
    
    public String i() {
      return this.j;
    }
    
    public boolean b() {
      return this.b;
    }
    
    public HashSet<String> k() {
      return this.g;
    }
    
    public ResourceLocation j() {
      return this.e;
    }
    
    public void a(ResourceLocation param1ResourceLocation) {
      this.e = param1ResourceLocation;
    }
    
    public ResourceLocation a() {
      return this.c;
    }
    
    public void b(ResourceLocation param1ResourceLocation) {
      this.c = param1ResourceLocation;
    }
    
    public float h() {
      return this.a;
    }
    
    private static FileNotFoundException a(FileNotFoundException param1FileNotFoundException) {
      return param1FileNotFoundException;
    }
  }
  
  public static class b {
    boolean a = false;
    
    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public void a(ClientChatEvent param1ClientChatEvent) {
      String str = param1ClientChatEvent.getOriginalMessage();
      try {
        if (!"id".equals(str))
          return; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      EntityPlayerSP entityPlayerSP = (Minecraft.func_71410_x()).field_71439_g;
      List list = ((EntityPlayer)entityPlayerSP).field_70170_p.func_72872_a(bS.class, entityPlayerSP.func_174813_aQ().func_186662_g(10.0D));
      bS bS = null;
      for (bS bS1 : list) {
        if (bS == null) {
          bS = bS1;
          continue;
        } 
        if (entityPlayerSP.func_70032_d((Entity)bS1) < entityPlayerSP.func_70032_d((Entity)bS))
          bS = bS1; 
      } 
      try {
        if (bS == null)
          return; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      entityPlayerSP.func_146105_b((ITextComponent)new TextComponentString(bS.N().toString()), false);
      param1ClientChatEvent.setCanceled(true);
    }
    
    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public void a(FMLNetworkEvent.ClientConnectedToServerEvent param1ClientConnectedToServerEvent) {
      Minecraft minecraft = Minecraft.func_71410_x();
      minecraft.func_152343_a(() -> Integer.valueOf(ai.a(true)));
      this.a = false;
    }
    
    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public void a(EntityJoinWorldEvent param1EntityJoinWorldEvent) {
      try {
        if (!param1EntityJoinWorldEvent.getEntity().equals((Minecraft.func_71410_x()).field_71439_g))
          return; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (this.a)
          return; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        this.a = true;
        if (ai.e())
          ai.b(); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    }
    
    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public void a(FMLNetworkEvent.ClientDisconnectionFromServerEvent param1ClientDisconnectionFromServerEvent) {
      Minecraft.func_71410_x().func_152344_a(() -> ai.b(true));
      this.a = false;
    }
    
    private static RuntimeException a(RuntimeException param1RuntimeException) {
      return param1RuntimeException;
    }
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\ai.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */