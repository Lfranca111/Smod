package com.schnurritv.sexmod;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nonnull;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class h extends GuiScreen {
  public static final ResourceLocation n = new ResourceLocation("sexmod", "textures/gui/clothing_icons.png");
  
  static final int p = 20;
  
  static final float m = 0.25F;
  
  int c = 0;
  
  int d = 0;
  
  float h = 0.0F;
  
  public static float i = 0.0F;
  
  protected static List<Integer> e = new ArrayList<>();
  
  protected static int a = 0;
  
  protected static int s = 0;
  
  bS b;
  
  boolean k = false;
  
  ck t;
  
  public static List<Map.Entry<ah, Map.Entry<List<String>, Integer>>> l = new ArrayList<>();
  
  final UUID r;
  
  int g;
  
  int j;
  
  public boolean f = false;
  
  int q = 0;
  
  int o = 1;
  
  public h(@Nonnull bS parambS) {
    this.r = parambS.N();
    bB bB = bB.a((Entity)parambS);
    if (bB == null)
      bB = bB.JENNY; 
    try {
      Constructor<? extends bS> constructor = bB.npcClass.getConstructor(new Class[] { World.class });
      this.b = constructor.newInstance(new Object[] { this.field_146297_k.field_71441_e });
      this.b.l = true;
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    a();
    String str = parambS.z();
    this.b.func_184212_Q().func_187227_b(bS.d, str);
    byte b = 0;
    for (String str1 : this.b.d()) {
      ah ah = ai.d(str1);
      try {
        if (ah.CUSTOM_BONE.equals(ah))
          b++; 
      } catch (Exception exception) {
        throw a(null);
      } 
      Map.Entry<ah, Map.Entry<List<String>, Integer>> entry = null;
      try {
        if (ah.CUSTOM_BONE.equals(ah) && b > 1) {
          entry = b(this.b);
        } else {
          for (Map.Entry<ah, Map.Entry<List<String>, Integer>> entry1 : l) {
            if (((ah)entry1.getKey()).equals(ah))
              entry = entry1; 
          } 
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      try {
        if (entry == null)
          continue; 
      } catch (Exception exception) {
        throw a(null);
      } 
      l.remove(entry);
      int i = ((List)((Map.Entry)entry.getValue()).getKey()).indexOf(str1);
      if (i == -1)
        i = 0; 
      ((Map.Entry)entry.getValue()).setValue(Integer.valueOf(i));
      l.add(entry);
    } 
  }
  
  public void func_146274_d() throws IOException {
    super.func_146274_d();
    this.t.func_178039_p();
  }
  
  public static HashSet<String> e() {
    HashSet<String> hashSet = new HashSet();
    for (Map.Entry<ah, Map.Entry<List<String>, Integer>> entry : l) {
      try {
        if (((List)((Map.Entry)entry.getValue()).getKey()).size() == 1)
          continue; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      Map.Entry entry1 = (Map.Entry)entry.getValue();
      List list = (List)entry1.getKey();
      Integer integer = (Integer)entry1.getValue();
      hashSet.add(list.get(integer.intValue()));
    } 
    return hashSet;
  }
  
  public static Map.Entry<ah, Map.Entry<List<String>, Integer>> b(bS parambS) {
    ArrayList<String> arrayList = new ArrayList();
    arrayList.add("cross");
    arrayList.addAll(ai.a(parambS).get(ah.CUSTOM_BONE));
    return new AbstractMap.SimpleEntry<>(ah.CUSTOM_BONE, new AbstractMap.SimpleEntry<>(arrayList, Integer.valueOf(0)));
  }
  
  void a() {
    l.clear();
    List<Map.Entry<ah, Map.Entry<List<String>, Integer>>> list = this.b.d(this.r);
    this.g = list.size();
    l.addAll(list);
    for (ah ah : ah.values()) {
      try {
        if (ah != ah.GIRL_SPECIFIC) {
          ArrayList<String> arrayList = new ArrayList();
          arrayList.add("cross");
          l.add(new AbstractMap.SimpleEntry<>(ah, new AbstractMap.SimpleEntry<>(arrayList, Integer.valueOf(0))));
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    for (Map.Entry<ah, List<String>> entry : ai.a(this.b).entrySet()) {
      Map.Entry<ah, Map.Entry<List<String>, Integer>> entry1 = null;
      for (Map.Entry<ah, Map.Entry<List<String>, Integer>> entry2 : l) {
        if (((ah)entry.getKey()).equals(entry2.getKey()))
          entry1 = entry2; 
      } 
      try {
        if (entry1 == null)
          continue; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      int i = l.indexOf(entry1);
      l.remove(entry1);
      ((List)((Map.Entry)entry1.getValue()).getKey()).addAll((Collection)entry.getValue());
      l.add(i, entry1);
    } 
  }
  
  public void func_73866_w_() {
    this.t = new ck(this.field_146297_k, this);
  }
  
  public void func_146280_a(Minecraft paramMinecraft, int paramInt1, int paramInt2) {
    super.func_146280_a(paramMinecraft, paramInt1, paramInt2);
    this.c = a(76.0F);
    this.d = b(89.0F);
    this.h = 90.0F;
  }
  
  boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    try {
      if (paramInt1 < paramInt3)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramInt1 > paramInt5)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramInt2 < paramInt4)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramInt2 > paramInt6)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return true;
  }
  
  public void func_73863_a(int paramInt1, int paramInt2, float paramFloat) {
    try {
      super.func_73863_a(paramInt1, paramInt2, paramFloat);
      if (this.k)
        i += aH.a(s, a, paramFloat); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    c();
    this.field_146297_k.field_71446_o.func_110577_a(n);
    int i = this.c - a(15.0F);
    int j = this.d - 20;
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      func_73729_b(i, j, 100, a(paramInt1, paramInt2, i, j, i + 20, j + 20) ? 40 : 20, 20, 20);
      if (this.field_146297_k.func_147104_D() == null)
        a(i, paramInt1, paramInt2); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    a(this.c, this.d, this.h, (EntityLivingBase)this.b, 1.2345679F);
    this.b.func_70071_h_();
    this.t.func_148128_a(paramInt1, paramInt2, paramFloat);
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3) {
    int i = this.d - 40;
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      func_73729_b(paramInt1, i, 120, a(paramInt2, paramInt3, paramInt1, i, paramInt1 + 20, i + 20) ? 40 : 20, 20, 20);
      i -= 20;
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      func_73729_b(paramInt1, i, 20, a(paramInt2, paramInt3, paramInt1, i, paramInt1 + 20, i + 20) ? 170 : 150, 20, 20);
      i -= 20;
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    func_73729_b(paramInt1, i, 0, a(paramInt2, paramInt3, paramInt1, i, paramInt1 + 20, i + 20) ? 170 : 150, 20, 20);
  }
  
  public boolean func_73868_f() {
    return false;
  }
  
  void d() {
    this.field_146297_k.func_147118_V().func_147682_a((ISound)PositionedSoundRecord.func_184371_a(SoundEvents.field_187909_gi, 1.0F));
    HashSet<String> hashSet = new HashSet();
    ArrayList<Integer> arrayList = new ArrayList();
    for (Map.Entry<ah, Map.Entry<List<String>, Integer>> entry : l) {
      try {
        if (entry.getKey() == ah.GIRL_SPECIFIC) {
          arrayList.add(((Map.Entry)entry.getValue()).getValue());
          continue;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      Map.Entry entry1 = (Map.Entry)entry.getValue();
      Integer integer = (Integer)entry1.getValue();
      try {
        if (integer.intValue() == 0)
          continue; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      String str = ((List<String>)entry1.getKey()).get(integer.intValue());
      hashSet.add(str);
    } 
    aV.a.sendToServer(new aO(bS.a(hashSet), this.r, arrayList));
    this.field_146297_k.field_71439_g.func_71053_j();
  }
  
  public void a(ah paramah, boolean paramBoolean, int paramInt) {
    Map.Entry entry1;
    int i;
    this.field_146297_k.func_147118_V().func_147682_a((ISound)PositionedSoundRecord.func_184371_a(SoundEvents.field_187909_gi, 1.0F));
    ArrayList<Map.Entry> arrayList1 = new ArrayList();
    ArrayList<Integer> arrayList = new ArrayList();
    byte b = 0;
    for (Map.Entry<ah, Map.Entry<List<String>, Integer>> entry : l) {
      try {
        if (((ah)entry.getKey()).equals(paramah)) {
          arrayList1.add(entry);
          arrayList.add(Integer.valueOf(b));
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      b++;
    } 
    try {
      if (arrayList1.size() == 0)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    if (arrayList1.size() == 1) {
      entry1 = arrayList1.get(0);
      i = ((Integer)arrayList.get(0)).intValue();
    } else {
      int m;
      try {
        if (this.g == 0 || paramInt > this.g - 1 + ah.a()) {
          m = paramInt - this.g + ah.a();
        } else {
          m = paramInt;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      entry1 = arrayList1.get(m);
      i = ((Integer)arrayList.get(m)).intValue();
    } 
    try {
      if (entry1 == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Map.Entry entry2 = (Map.Entry)entry1.getValue();
    int j = ((Integer)entry2.getValue()).intValue();
    int k = ((List)entry2.getKey()).size();
    try {
      if (paramBoolean) {
        if (++j >= k)
          j = 0; 
      } else if (--j < 0) {
        j = k - 1;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    l.set(i, new AbstractMap.SimpleEntry<>((ah)entry1.getKey(), new AbstractMap.SimpleEntry<>((List<String>)((Map.Entry)entry1.getValue()).getKey(), Integer.valueOf(j))));
    ArrayList<Map.Entry> arrayList2 = new ArrayList();
    for (Map.Entry<ah, Map.Entry<List<String>, Integer>> entry : l) {
      try {
        if (entry.getKey() == ah.GIRL_SPECIFIC)
          arrayList2.add(entry); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    this.b.c((List)arrayList2);
  }
  
  public void a(int paramInt1, int paramInt2, float paramFloat, cX paramcX) {
    a(paramInt1, paramInt2, paramFloat, paramcX, 1.876945F);
  }
  
  public void a(cX paramcX) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    a(this.c, this.d, this.h, paramcX, 2.876945F, paramcX.f ? 1 : 0);
  }
  
  public void a(String paramString, int paramInt1, int paramInt2) {
    func_146279_a(paramString, paramInt1, paramInt2);
  }
  
  protected void func_146273_a(int paramInt1, int paramInt2, int paramInt3, long paramLong) {
    try {
      super.func_146273_a(paramInt1, paramInt2, paramInt3, paramLong);
      if (paramInt3 != 0)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramInt1 < this.field_146294_l / 2)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    int i = paramInt1 - this.j;
    e.add(Integer.valueOf(i));
    this.j = paramInt1;
  }
  
  protected void func_73864_a(int paramInt1, int paramInt2, int paramInt3) throws IOException {
    try {
      super.func_73864_a(paramInt1, paramInt2, paramInt3);
      this.t.func_148179_a(paramInt1, paramInt2, paramInt3);
      if (paramInt3 != 0)
        return; 
    } catch (URISyntaxException uRISyntaxException) {
      throw a(null);
    } 
    this.f = true;
    this.k = true;
    this.j = paramInt1;
    int i = this.c - a(15.0F);
    int j = this.d - 20;
    try {
      if (a(paramInt1, paramInt2, i, j, i + 20, j + 20))
        d(); 
    } catch (URISyntaxException uRISyntaxException) {
      throw a(null);
    } 
    try {
      if (this.field_146297_k.func_147104_D() != null)
        return; 
    } catch (URISyntaxException uRISyntaxException) {
      throw a(null);
    } 
    j = this.d - 40;
    if (a(paramInt1, paramInt2, i, j, i + 20, j + 20)) {
      this.field_146297_k.func_147118_V().func_147682_a((ISound)PositionedSoundRecord.func_184371_a(SoundEvents.field_187909_gi, 1.0F));
      this.field_146297_k.field_71439_g.func_71053_j();
      int k = ai.c(true);
      try {
        if (k != 0) {
          ai.c = true;
          return;
        } 
      } catch (URISyntaxException uRISyntaxException) {
        throw a(null);
      } 
      bS bS1 = bS.k(this.r);
      try {
        if (bS1 != null)
          a(bS1); 
      } catch (URISyntaxException uRISyntaxException) {
        throw a(null);
      } 
      return;
    } 
    try {
      j -= 20;
      if (a(paramInt1, paramInt2, i, j, i + 20, j + 20)) {
        System.out.println("folder");
        Desktop.getDesktop().open(new File(ai.f()));
        return;
      } 
    } catch (URISyntaxException uRISyntaxException) {
      throw a(null);
    } 
    try {
      j -= 20;
      if (a(paramInt1, paramInt2, i, j, i + 20, j + 20)) {
        System.out.println("info");
        try {
          Desktop.getDesktop().browse(new URI("https://www.schnurritv.com/devlogs/1.9.mp4"));
        } catch (URISyntaxException uRISyntaxException) {
          throw new RuntimeException(uRISyntaxException);
        } 
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  protected void func_146286_b(int paramInt1, int paramInt2, int paramInt3) {
    try {
      super.func_146286_b(paramInt1, paramInt2, paramInt3);
      if (paramInt3 == 0) {
        this.k = false;
        this.f = false;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.q = s;
  }
  
  int a(float paramFloat) {
    return Math.round(this.field_146294_l * paramFloat / 100.0F);
  }
  
  int b(float paramFloat) {
    return Math.round(this.field_146295_m * paramFloat / 100.0F);
  }
  
  public void func_146281_b() {
    super.func_146281_b();
    this.b.field_70170_p.func_72973_f((Entity)this.b);
    e.clear();
    l.clear();
  }
  
  public bS b() {
    return this.b;
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.field_146297_k.field_71446_o.func_110577_a(n);
    func_73729_b(paramInt1, paramInt2, paramInt3, paramInt4, 20, 20);
  }
  
  public void b(int paramInt1, int paramInt2, int paramInt3) {
    a(paramInt1, paramInt2, paramInt3, 0);
  }
  
  public void a(int paramInt1, int paramInt2, cb paramcb) {
    a(paramInt1, paramInt2, paramcb.c, paramcb.b);
  }
  
  void a(int paramInt1, int paramInt2, float paramFloat1, EntityLivingBase paramEntityLivingBase, float paramFloat2) {
    a(paramInt1, paramInt2, paramFloat1, paramEntityLivingBase, paramFloat2, 0);
  }
  
  void a(int paramInt1, int paramInt2, float paramFloat1, EntityLivingBase paramEntityLivingBase, float paramFloat2, int paramInt3) {
    float f1 = paramEntityLivingBase.field_70761_aq;
    float f2 = paramEntityLivingBase.field_70177_z;
    float f3 = paramEntityLivingBase.field_70125_A;
    float f4 = paramEntityLivingBase.field_70758_at;
    float f5 = paramEntityLivingBase.field_70759_as;
    paramEntityLivingBase.field_70761_aq = 0.0F;
    paramEntityLivingBase.field_70177_z = 0.0F;
    paramEntityLivingBase.field_70125_A = 0.0F;
    paramEntityLivingBase.field_70758_at = 0.0F;
    paramEntityLivingBase.field_70759_as = 0.0F;
    GlStateManager.func_179142_g();
    GlStateManager.func_179094_E();
    GlStateManager.func_179109_b(paramInt1, paramInt2, 50.0F);
    GlStateManager.func_179152_a(-paramFloat1, paramFloat1, paramFloat1);
    GlStateManager.func_179114_b(180.0F, 0.0F, 0.0F, 1.0F);
    GlStateManager.func_179114_b(135.0F, 0.0F, 1.0F, 0.0F);
    RenderHelper.func_74519_b();
    GlStateManager.func_179114_b(-135.0F, 0.0F, 1.0F, 0.0F);
    GlStateManager.func_179109_b(0.0F, 0.0F, paramInt3);
    GlStateManager.func_179114_b(i, 0.0F, 1.0F, 0.0F);
    GlStateManager.func_179114_b(0.25F, 1.0F, 0.0F, 0.0F);
    GlStateManager.func_179109_b(0.0F, 0.0F, 0.0F);
    RenderManager renderManager = Minecraft.func_71410_x().func_175598_ae();
    renderManager.func_178631_a(180.0F);
    renderManager.func_178633_a(false);
    renderManager.func_188391_a((Entity)paramEntityLivingBase, 0.0D, 0.0D, 0.0D, 0.0F, paramFloat2, false);
    renderManager.func_178633_a(true);
    GlStateManager.func_179121_F();
    RenderHelper.func_74518_a();
    GlStateManager.func_179101_C();
    GlStateManager.func_179138_g(OpenGlHelper.field_77476_b);
    GlStateManager.func_179090_x();
    GlStateManager.func_179138_g(OpenGlHelper.field_77478_a);
    paramEntityLivingBase.field_70761_aq = f1;
    paramEntityLivingBase.field_70177_z = f2;
    paramEntityLivingBase.field_70125_A = f3;
    paramEntityLivingBase.field_70758_at = f4;
    paramEntityLivingBase.field_70759_as = f5;
  }
  
  void c() {
    try {
      if (this.k)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    float f = Minecraft.func_175610_ah();
    if (f == 0.0F)
      f = 0.1F; 
    try {
      if (this.q == 0) {
        i += (this.o * 10) / f;
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      i += this.q / f;
      this.q = (int)(this.q * (1.0F - 0.25F / f));
      if (Math.abs(this.q) > 10)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.o = (this.q > 0) ? 1 : -1;
    this.q = 0;
  }
  
  @SideOnly(Side.CLIENT)
  public static void a(@Nonnull bS parambS) {
    // Byte code:
    //   0: invokestatic func_71410_x : ()Lnet/minecraft/client/Minecraft;
    //   3: astore_1
    //   4: aload_1
    //   5: getfield field_71462_r : Lnet/minecraft/client/gui/GuiScreen;
    //   8: instanceof com/schnurritv/sexmod/h
    //   11: ifeq -> 19
    //   14: return
    //   15: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   18: athrow
    //   19: aload_1
    //   20: invokevirtual func_147104_D : ()Lnet/minecraft/client/multiplayer/ServerData;
    //   23: ifnull -> 39
    //   26: invokestatic e : ()Z
    //   29: ifeq -> 47
    //   32: goto -> 39
    //   35: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   38: athrow
    //   39: iconst_1
    //   40: goto -> 48
    //   43: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   46: athrow
    //   47: iconst_0
    //   48: istore_2
    //   49: iload_2
    //   50: ifne -> 99
    //   53: aload_1
    //   54: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   57: new net/minecraft/util/text/TextComponentString
    //   60: dup
    //   61: new java/lang/StringBuilder
    //   64: dup
    //   65: invokespecial <init> : ()V
    //   68: ldc 'You have to whitelist the server to use its custom models. '
    //   70: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   73: getstatic net/minecraft/util/text/TextFormatting.YELLOW : Lnet/minecraft/util/text/TextFormatting;
    //   76: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   79: ldc '/whitelistserver'
    //   81: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   84: invokevirtual toString : ()Ljava/lang/String;
    //   87: invokespecial <init> : (Ljava/lang/String;)V
    //   90: iconst_1
    //   91: invokevirtual func_146105_b : (Lnet/minecraft/util/text/ITextComponent;Z)V
    //   94: return
    //   95: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   98: athrow
    //   99: aload_1
    //   100: aload_1
    //   101: aload_0
    //   102: <illegal opcode> run : (Lnet/minecraft/client/Minecraft;Lcom/schnurritv/sexmod/bS;)Ljava/lang/Runnable;
    //   107: invokevirtual func_152344_a : (Ljava/lang/Runnable;)Lcom/google/common/util/concurrent/ListenableFuture;
    //   110: pop
    //   111: return
    // Exception table:
    //   from	to	target	type
    //   4	15	15	java/lang/RuntimeException
    //   19	32	35	java/lang/RuntimeException
    //   26	43	43	java/lang/RuntimeException
    //   49	95	95	java/lang/RuntimeException
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  public static class a {
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void a(InputEvent.KeyInputEvent param1KeyInputEvent) {
      try {
        if (!ClientProxy.keyBindings[1].func_151468_f())
          return; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (ai.c) {
          try {
          
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          try {
            ai.c = (0 != ai.c(true));
            if (ai.c)
              return; 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      Minecraft minecraft = Minecraft.func_71410_x();
      bo bo = bo.f(minecraft.field_71439_g.getPersistentID());
      try {
        if (bo == null) {
          minecraft.field_71439_g.func_146105_b((ITextComponent)new TextComponentString("You have to turn into the girl you want to customize"), true);
          return;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      h.a(bo);
    }
    
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void a(TickEvent.ClientTickEvent param1ClientTickEvent) {
      h.s = h.a;
      h.a = 0;
      for (Integer integer : h.e)
        h.a += integer.intValue(); 
      h.e.clear();
    }
    
    private static RuntimeException a(RuntimeException param1RuntimeException) {
      return param1RuntimeException;
    }
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */