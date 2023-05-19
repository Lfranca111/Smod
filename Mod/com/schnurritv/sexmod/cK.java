package com.schnurritv.sexmod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiListExtended;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.input.Mouse;

public class ck extends GuiListExtended {
  static final int c = 3809871;
  
  static final List<ah> g = Arrays.asList(ah.values());
  
  static final String h = "MMMMMMMMMM";
  
  protected static int e = 5;
  
  protected static int d = 200;
  
  private List<a> i = new ArrayList<>();
  
  h a;
  
  boolean f = false;
  
  float b = 0.0F;
  
  public ck(Minecraft paramMinecraft, h paramh) {
    super(paramMinecraft, paramh.field_146294_l / 2, paramh.field_146295_m, 0, paramh.field_146295_m, 30);
    d = paramh.field_146294_l / 2;
    this.a = paramh;
  }
  
  public GuiListExtended.IGuiListEntry func_148180_b(int paramInt) {
    return this.i.get(paramInt);
  }
  
  protected int func_148127_b() {
    return this.i.size();
  }
  
  protected int func_148137_d() {
    return 0;
  }
  
  protected void drawContainerBackground(Tessellator paramTessellator) {}
  
  public void func_178039_p() {
    try {
      if (!func_148141_e(this.field_148162_h))
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    int i = Mouse.getEventDWheel();
    try {
      if (i == 0)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    if (i > 0) {
      i = -1;
    } else {
      i = 1;
    } 
    this.field_148169_q += (i * this.field_148149_f / 2);
  }
  
  protected void func_148136_c(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  void a() {
    int i = this.i.size() * this.field_148149_f;
    try {
      if (i > this.field_148158_l) {
        this.field_148153_b = 0;
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    int j = this.field_148158_l - i;
    this.field_148153_b = j / 2;
  }
  
  public void func_148128_a(int paramInt1, int paramInt2, float paramFloat) {
    this.i.clear();
    byte b = 0;
    for (Map.Entry<ah, Map.Entry<List<String>, Integer>> entry : h.l) {
      ah ah = (ah)entry.getKey();
      Map.Entry entry1 = (Map.Entry)entry.getValue();
      try {
        this.i.add(new a(ah, (List<String>)entry1.getKey(), ((Integer)entry1.getValue()).intValue()));
        if (ah.CUSTOM_BONE.equals(entry.getKey()))
          b++; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    this.i.sort(Comparator.comparingInt(parama -> g.indexOf(parama.c)));
    List<String> list = ai.a(this.a.b).get(ah.CUSTOM_BONE);
    try {
      list.add(0, "cross");
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.i.add(new a((b > 1)));
    a();
    a(paramInt1, paramInt2, paramFloat);
    if (!this.f)
      return; 
    func_148145_f(999999);
    this.f = false;
  }
  
  void a(int paramInt1, int paramInt2, float paramFloat) {
    try {
      if (!this.field_178041_q)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.field_148150_g = paramInt1;
    this.field_148162_h = paramInt2;
    func_148123_a();
    int i = func_148137_d();
    int j = i + 6;
    func_148121_k();
    GlStateManager.func_179140_f();
    GlStateManager.func_179106_n();
    Tessellator tessellator = Tessellator.func_178181_a();
    BufferBuilder bufferBuilder = tessellator.func_178180_c();
    drawContainerBackground(tessellator);
    int k = this.field_148152_e + this.field_148155_a / 2 - func_148139_c() / 2 + 2;
    int m = this.field_148153_b + 4 - (int)this.field_148169_q;
    try {
      if (this.field_148165_u)
        func_148129_a(k, m, tessellator); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    func_192638_a(k, m, paramInt1, paramInt2, paramFloat);
    GlStateManager.func_179097_i();
    func_148136_c(0, this.field_148153_b, 255, 255);
    func_148136_c(this.field_148154_c, this.field_148158_l, 255, 255);
    GlStateManager.func_179147_l();
    GlStateManager.func_187428_a(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ZERO, GlStateManager.DestFactor.ONE);
    GlStateManager.func_179118_c();
    GlStateManager.func_179103_j(7425);
    GlStateManager.func_179090_x();
    int n = func_148135_f();
    if (n > 0) {
      int i1 = (this.field_148154_c - this.field_148153_b) * (this.field_148154_c - this.field_148153_b) / func_148138_e();
      i1 = MathHelper.func_76125_a(i1, 32, this.field_148154_c - this.field_148153_b - 8);
      int i2 = (int)this.field_148169_q * (this.field_148154_c - this.field_148153_b - i1) / n + this.field_148153_b;
      if (i2 < this.field_148153_b)
        i2 = this.field_148153_b; 
      bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181709_i);
      bufferBuilder.func_181662_b(i, this.field_148154_c, 0.0D).func_187315_a(0.0D, 1.0D).func_181669_b(0, 0, 0, 255).func_181675_d();
      bufferBuilder.func_181662_b(j, this.field_148154_c, 0.0D).func_187315_a(1.0D, 1.0D).func_181669_b(0, 0, 0, 255).func_181675_d();
      bufferBuilder.func_181662_b(j, this.field_148153_b, 0.0D).func_187315_a(1.0D, 0.0D).func_181669_b(0, 0, 0, 255).func_181675_d();
      bufferBuilder.func_181662_b(i, this.field_148153_b, 0.0D).func_187315_a(0.0D, 0.0D).func_181669_b(0, 0, 0, 255).func_181675_d();
      tessellator.func_78381_a();
      bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181709_i);
      bufferBuilder.func_181662_b(i, (i2 + i1), 0.0D).func_187315_a(0.0D, 1.0D).func_181669_b(128, 128, 128, 255).func_181675_d();
      bufferBuilder.func_181662_b(j, (i2 + i1), 0.0D).func_187315_a(1.0D, 1.0D).func_181669_b(128, 128, 128, 255).func_181675_d();
      bufferBuilder.func_181662_b(j, i2, 0.0D).func_187315_a(1.0D, 0.0D).func_181669_b(128, 128, 128, 255).func_181675_d();
      bufferBuilder.func_181662_b(i, i2, 0.0D).func_187315_a(0.0D, 0.0D).func_181669_b(128, 128, 128, 255).func_181675_d();
      tessellator.func_78381_a();
      bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181709_i);
      bufferBuilder.func_181662_b(i, (i2 + i1 - 1), 0.0D).func_187315_a(0.0D, 1.0D).func_181669_b(192, 192, 192, 255).func_181675_d();
      bufferBuilder.func_181662_b((j - 1), (i2 + i1 - 1), 0.0D).func_187315_a(1.0D, 1.0D).func_181669_b(192, 192, 192, 255).func_181675_d();
      bufferBuilder.func_181662_b((j - 1), i2, 0.0D).func_187315_a(1.0D, 0.0D).func_181669_b(192, 192, 192, 255).func_181675_d();
      bufferBuilder.func_181662_b(i, i2, 0.0D).func_187315_a(0.0D, 0.0D).func_181669_b(192, 192, 192, 255).func_181675_d();
      tessellator.func_78381_a();
    } 
    func_148142_b(paramInt1, paramInt2);
    GlStateManager.func_179098_w();
    GlStateManager.func_179103_j(7424);
    GlStateManager.func_179141_d();
    GlStateManager.func_179084_k();
  }
  
  public boolean func_148179_a(int paramInt1, int paramInt2, int paramInt3) {
    a(paramInt1, paramInt2, paramInt3);
    return super.func_148179_a(paramInt1, paramInt2, paramInt3);
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3) {
    try {
      if (paramInt1 > this.field_148155_a)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    int i = func_148148_g();
    float f = (i + paramInt2 - 5 - this.field_148153_b);
    int j = Math.round((float)Math.floor((f / this.field_148149_f)));
    int k = (int)Math.round(((f / this.field_148149_f) - Math.floor((f / this.field_148149_f))) * this.field_148149_f);
    try {
      if (j < 0)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (j < this.i.size())
        ((a)this.i.get(j)).c(paramInt1, k, paramInt3, j); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  @SideOnly(Side.CLIENT)
  public class a implements GuiListExtended.IGuiListEntry {
    static final int b = 4;
    
    public ah c;
    
    public List<String> f;
    
    public int d;
    
    FontRenderer g;
    
    boolean e = false;
    
    boolean a = false;
    
    public a(ah param1ah, List<String> param1List, int param1Int) {
      this.c = param1ah;
      this.f = param1List;
      this.d = param1Int;
      this.g = ck.this.field_148161_k.field_71466_p;
    }
    
    public a(boolean param1Boolean) {
      this.a = param1Boolean;
      this.e = true;
    }
    
    boolean b(int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int param1Int6) {
      try {
        if (param1Int1 < param1Int3)
          return false; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (param1Int1 > param1Int5)
          return false; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (param1Int2 < param1Int4)
          return false; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (param1Int2 > param1Int6)
          return false; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      return true;
    }
    
    void a(int param1Int1, int param1Int2, int param1Int3) {
      // Byte code:
      //   0: bipush #30
      //   2: istore #4
      //   4: iinc #1, 5
      //   7: aload_0
      //   8: getfield this$0 : Lcom/schnurritv/sexmod/ck;
      //   11: invokestatic access$100 : (Lcom/schnurritv/sexmod/ck;)Lnet/minecraft/client/Minecraft;
      //   14: getfield field_71446_o : Lnet/minecraft/client/renderer/texture/TextureManager;
      //   17: getstatic com/schnurritv/sexmod/h.n : Lnet/minecraft/util/ResourceLocation;
      //   20: invokevirtual func_110577_a : (Lnet/minecraft/util/ResourceLocation;)V
      //   23: aload_0
      //   24: getfield this$0 : Lcom/schnurritv/sexmod/ck;
      //   27: getfield a : Lcom/schnurritv/sexmod/h;
      //   30: iload #4
      //   32: iload_1
      //   33: bipush #40
      //   35: aload_0
      //   36: iload_2
      //   37: iload_3
      //   38: iload #4
      //   40: iload_1
      //   41: iload #4
      //   43: bipush #20
      //   45: iadd
      //   46: iload_1
      //   47: bipush #20
      //   49: iadd
      //   50: invokevirtual b : (IIIIII)Z
      //   53: ifeq -> 65
      //   56: bipush #40
      //   58: goto -> 67
      //   61: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      //   64: athrow
      //   65: bipush #20
      //   67: bipush #20
      //   69: bipush #20
      //   71: invokevirtual func_73729_b : (IIIIII)V
      //   74: iinc #4, 40
      //   77: aload_0
      //   78: getfield this$0 : Lcom/schnurritv/sexmod/ck;
      //   81: getfield a : Lcom/schnurritv/sexmod/h;
      //   84: iload #4
      //   86: iload_1
      //   87: aload_0
      //   88: getfield a : Z
      //   91: ifeq -> 103
      //   94: bipush #60
      //   96: goto -> 105
      //   99: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      //   102: athrow
      //   103: bipush #80
      //   105: aload_0
      //   106: getfield a : Z
      //   109: ifeq -> 149
      //   112: aload_0
      //   113: iload_2
      //   114: iload_3
      //   115: iload #4
      //   117: iload_1
      //   118: iload #4
      //   120: bipush #20
      //   122: iadd
      //   123: iload_1
      //   124: bipush #20
      //   126: iadd
      //   127: invokevirtual b : (IIIIII)Z
      //   130: ifeq -> 149
      //   133: goto -> 140
      //   136: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      //   139: athrow
      //   140: bipush #40
      //   142: goto -> 151
      //   145: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      //   148: athrow
      //   149: bipush #20
      //   151: bipush #20
      //   153: bipush #20
      //   155: invokevirtual func_73729_b : (IIIIII)V
      //   158: return
      // Exception table:
      //   from	to	target	type
      //   4	61	61	java/lang/RuntimeException
      //   67	99	99	java/lang/RuntimeException
      //   105	133	136	java/lang/RuntimeException
      //   112	145	145	java/lang/RuntimeException
    }
    
    void b(int param1Int1, int param1Int2, int param1Int3) {
      // Byte code:
      //   0: aload_0
      //   1: getfield this$0 : Lcom/schnurritv/sexmod/ck;
      //   4: invokestatic access$200 : (Lcom/schnurritv/sexmod/ck;)Lnet/minecraft/client/Minecraft;
      //   7: getfield field_71446_o : Lnet/minecraft/client/renderer/texture/TextureManager;
      //   10: getstatic com/schnurritv/sexmod/h.n : Lnet/minecraft/util/ResourceLocation;
      //   13: invokevirtual func_110577_a : (Lnet/minecraft/util/ResourceLocation;)V
      //   16: aload_0
      //   17: getfield this$0 : Lcom/schnurritv/sexmod/ck;
      //   20: getfield a : Lcom/schnurritv/sexmod/h;
      //   23: getstatic com/schnurritv/sexmod/ck.e : I
      //   26: iload_1
      //   27: iconst_0
      //   28: bipush #60
      //   30: aload_0
      //   31: getfield d : I
      //   34: ifne -> 46
      //   37: bipush #119
      //   39: goto -> 49
      //   42: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      //   45: athrow
      //   46: sipush #256
      //   49: bipush #30
      //   51: invokevirtual func_73729_b : (IIIIII)V
      //   54: getstatic com/schnurritv/sexmod/ck.e : I
      //   57: bipush #10
      //   59: iadd
      //   60: istore #4
      //   62: iinc #1, 5
      //   65: aload_0
      //   66: getfield this$0 : Lcom/schnurritv/sexmod/ck;
      //   69: getfield a : Lcom/schnurritv/sexmod/h;
      //   72: iload #4
      //   74: iload_1
      //   75: aload_0
      //   76: getfield c : Lcom/schnurritv/sexmod/ah;
      //   79: getfield iconXPos : I
      //   82: invokevirtual b : (III)V
      //   85: iinc #4, 25
      //   88: aload_0
      //   89: iload #4
      //   91: iload_1
      //   92: iload_2
      //   93: iload_3
      //   94: invokevirtual a : (IIII)I
      //   97: istore #4
      //   99: aload_0
      //   100: getfield this$0 : Lcom/schnurritv/sexmod/ck;
      //   103: getfield a : Lcom/schnurritv/sexmod/h;
      //   106: invokevirtual b : ()Lcom/schnurritv/sexmod/bS;
      //   109: astore #5
      //   111: aload_0
      //   112: getfield d : I
      //   115: ifne -> 145
      //   118: aload_0
      //   119: getfield this$0 : Lcom/schnurritv/sexmod/ck;
      //   122: invokestatic access$300 : (Lcom/schnurritv/sexmod/ck;)Lnet/minecraft/client/Minecraft;
      //   125: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
      //   128: aload #5
      //   130: invokevirtual N : ()Ljava/util/UUID;
      //   133: aload_0
      //   134: getfield c : Lcom/schnurritv/sexmod/ah;
      //   137: invokestatic a : (Lnet/minecraft/world/World;Ljava/util/UUID;Lcom/schnurritv/sexmod/ah;)Lcom/schnurritv/sexmod/cX;
      //   140: astore #6
      //   142: goto -> 180
      //   145: new com/schnurritv/sexmod/cX
      //   148: dup
      //   149: aload #5
      //   151: getfield field_70170_p : Lnet/minecraft/world/World;
      //   154: aload #5
      //   156: invokevirtual N : ()Ljava/util/UUID;
      //   159: aload_0
      //   160: getfield f : Ljava/util/List;
      //   163: aload_0
      //   164: getfield d : I
      //   167: invokeinterface get : (I)Ljava/lang/Object;
      //   172: checkcast java/lang/String
      //   175: invokespecial <init> : (Lnet/minecraft/world/World;Ljava/util/UUID;Ljava/lang/String;)V
      //   178: astore #6
      //   180: aload #6
      //   182: invokevirtual a : ()Ljava/lang/String;
      //   185: invokestatic c : (Ljava/lang/String;)Lcom/schnurritv/sexmod/ai$a;
      //   188: astore #7
      //   190: aload #6
      //   192: getfield f : Z
      //   195: ifne -> 210
      //   198: aload #7
      //   200: ifnonnull -> 218
      //   203: goto -> 210
      //   206: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      //   209: athrow
      //   210: fconst_1
      //   211: goto -> 223
      //   214: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      //   217: athrow
      //   218: aload #7
      //   220: invokevirtual g : ()F
      //   223: fstore #8
      //   225: aload #7
      //   227: ifnonnull -> 238
      //   230: iconst_0
      //   231: goto -> 245
      //   234: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      //   237: athrow
      //   238: aload #7
      //   240: invokevirtual c : ()F
      //   243: fneg
      //   244: f2i
      //   245: istore #9
      //   247: aload_0
      //   248: getfield this$0 : Lcom/schnurritv/sexmod/ck;
      //   251: getfield a : Lcom/schnurritv/sexmod/h;
      //   254: iload #4
      //   256: iload_1
      //   257: bipush #10
      //   259: iadd
      //   260: aload #6
      //   262: getfield f : Z
      //   265: ifeq -> 276
      //   268: iconst_0
      //   269: goto -> 278
      //   272: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      //   275: athrow
      //   276: bipush #6
      //   278: iadd
      //   279: iload #9
      //   281: iadd
      //   282: ldc 30.0
      //   284: fload #8
      //   286: fmul
      //   287: aload #6
      //   289: invokevirtual a : (IIFLcom/schnurritv/sexmod/cX;)V
      //   292: aload_0
      //   293: getfield d : I
      //   296: ifeq -> 318
      //   299: aload_0
      //   300: getfield this$0 : Lcom/schnurritv/sexmod/ck;
      //   303: getfield a : Lcom/schnurritv/sexmod/h;
      //   306: aload #6
      //   308: invokevirtual a : (Lcom/schnurritv/sexmod/cX;)V
      //   311: goto -> 318
      //   314: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      //   317: athrow
      //   318: aload_0
      //   319: getfield this$0 : Lcom/schnurritv/sexmod/ck;
      //   322: invokestatic access$400 : (Lcom/schnurritv/sexmod/ck;)Lnet/minecraft/client/Minecraft;
      //   325: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
      //   328: aload #6
      //   330: invokevirtual func_72973_f : (Lnet/minecraft/entity/Entity;)V
      //   333: iload #4
      //   335: i2f
      //   336: ldc 30.0
      //   338: fadd
      //   339: f2i
      //   340: istore #4
      //   342: aload_0
      //   343: getfield d : I
      //   346: ifne -> 354
      //   349: return
      //   350: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      //   353: athrow
      //   354: iload #4
      //   356: istore #10
      //   358: aload_0
      //   359: getfield f : Ljava/util/List;
      //   362: aload_0
      //   363: getfield d : I
      //   366: invokeinterface get : (I)Ljava/lang/Object;
      //   371: checkcast java/lang/String
      //   374: astore #11
      //   376: aload #11
      //   378: invokevirtual length : ()I
      //   381: ldc 'MMMMMMMMMM'
      //   383: invokevirtual length : ()I
      //   386: if_icmple -> 427
      //   389: new java/lang/StringBuilder
      //   392: dup
      //   393: invokespecial <init> : ()V
      //   396: aload #11
      //   398: iconst_0
      //   399: ldc 'MMMMMMMMMM'
      //   401: invokevirtual length : ()I
      //   404: iconst_3
      //   405: isub
      //   406: invokevirtual substring : (II)Ljava/lang/String;
      //   409: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   412: ldc '...'
      //   414: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   417: invokevirtual toString : ()Ljava/lang/String;
      //   420: goto -> 429
      //   423: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      //   426: athrow
      //   427: aload #11
      //   429: astore #12
      //   431: aload_0
      //   432: aload #12
      //   434: iload #4
      //   436: iload_1
      //   437: bipush #10
      //   439: iadd
      //   440: invokevirtual a : (Ljava/lang/String;II)V
      //   443: iload #4
      //   445: aload_0
      //   446: getfield g : Lnet/minecraft/client/gui/FontRenderer;
      //   449: ldc 'MMMMMMMMMM'
      //   451: invokevirtual func_78256_a : (Ljava/lang/String;)I
      //   454: iadd
      //   455: istore #4
      //   457: iload #4
      //   459: istore #13
      //   461: iload #4
      //   463: istore #14
      //   465: aload #11
      //   467: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
      //   470: astore #15
      //   472: aload #15
      //   474: invokevirtual length : ()I
      //   477: ldc 'MMMMMMMMMM'
      //   479: invokevirtual length : ()I
      //   482: if_icmple -> 523
      //   485: new java/lang/StringBuilder
      //   488: dup
      //   489: invokespecial <init> : ()V
      //   492: aload #15
      //   494: iconst_0
      //   495: ldc 'MMMMMMMMMM'
      //   497: invokevirtual length : ()I
      //   500: iconst_3
      //   501: isub
      //   502: invokevirtual substring : (II)Ljava/lang/String;
      //   505: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   508: ldc '...'
      //   510: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   513: invokevirtual toString : ()Ljava/lang/String;
      //   516: goto -> 525
      //   519: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      //   522: athrow
      //   523: aload #15
      //   525: astore #16
      //   527: aload_0
      //   528: aload #16
      //   530: iload #4
      //   532: iload_1
      //   533: bipush #10
      //   535: iadd
      //   536: invokevirtual a : (Ljava/lang/String;II)V
      //   539: iload #4
      //   541: aload_0
      //   542: getfield g : Lnet/minecraft/client/gui/FontRenderer;
      //   545: ldc 'MMMMMMMMMM'
      //   547: invokevirtual func_78256_a : (Ljava/lang/String;)I
      //   550: iadd
      //   551: istore #4
      //   553: iload #4
      //   555: istore #17
      //   557: aload_0
      //   558: iload_2
      //   559: iload_3
      //   560: iload #10
      //   562: iload_1
      //   563: bipush #10
      //   565: iadd
      //   566: iload #13
      //   568: iload_1
      //   569: bipush #10
      //   571: iadd
      //   572: aload_0
      //   573: getfield g : Lnet/minecraft/client/gui/FontRenderer;
      //   576: getfield field_78288_b : I
      //   579: iadd
      //   580: invokevirtual b : (IIIIII)Z
      //   583: ifeq -> 607
      //   586: aload_0
      //   587: getfield this$0 : Lcom/schnurritv/sexmod/ck;
      //   590: getfield a : Lcom/schnurritv/sexmod/h;
      //   593: aload #11
      //   595: iload_2
      //   596: iload_3
      //   597: invokevirtual a : (Ljava/lang/String;II)V
      //   600: goto -> 607
      //   603: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      //   606: athrow
      //   607: aload_0
      //   608: iload_2
      //   609: iload_3
      //   610: iload #14
      //   612: iload_1
      //   613: bipush #10
      //   615: iadd
      //   616: iload #17
      //   618: iload_1
      //   619: bipush #10
      //   621: iadd
      //   622: aload_0
      //   623: getfield g : Lnet/minecraft/client/gui/FontRenderer;
      //   626: getfield field_78288_b : I
      //   629: iadd
      //   630: invokevirtual b : (IIIIII)Z
      //   633: ifeq -> 657
      //   636: aload_0
      //   637: getfield this$0 : Lcom/schnurritv/sexmod/ck;
      //   640: getfield a : Lcom/schnurritv/sexmod/h;
      //   643: aload #15
      //   645: iload_2
      //   646: iload_3
      //   647: invokevirtual a : (Ljava/lang/String;II)V
      //   650: goto -> 657
      //   653: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      //   656: athrow
      //   657: fconst_1
      //   658: fconst_1
      //   659: fconst_1
      //   660: fconst_1
      //   661: invokestatic func_179131_c : (FFFF)V
      //   664: ldc 255.0
      //   666: ldc 255.0
      //   668: ldc 255.0
      //   670: ldc 255.0
      //   672: invokestatic func_179131_c : (FFFF)V
      //   675: return
      // Exception table:
      //   from	to	target	type
      //   0	42	42	java/lang/RuntimeException
      //   190	203	206	java/lang/RuntimeException
      //   198	214	214	java/lang/RuntimeException
      //   225	234	234	java/lang/RuntimeException
      //   247	272	272	java/lang/RuntimeException
      //   278	311	314	java/lang/RuntimeException
      //   342	350	350	java/lang/RuntimeException
      //   376	423	423	java/lang/RuntimeException
      //   472	519	519	java/lang/RuntimeException
      //   557	600	603	java/lang/RuntimeException
      //   607	650	653	java/lang/RuntimeException
    }
    
    int a(int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      try {
      
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        ck.this.a.a(param1Int1, param1Int2, 0, 20 * (b(param1Int3, param1Int4, param1Int1, param1Int2, param1Int1 + 20, param1Int2 + 20) ? 2 : 1));
        param1Int1 += 20;
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      ck.this.a.a(param1Int1, param1Int2, 20, 20 * (b(param1Int3, param1Int4, param1Int1, param1Int2, param1Int1 + 20, param1Int2 + 20) ? 2 : 1));
      return param1Int1 + 40;
    }
    
    void a(int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5) {
      ck.this.a.func_73729_b(param1Int1, param1Int2, 140, 20, 79, 20);
      param1Int1 += 4;
      int i = param1Int1;
      int j = param1Int1 + 71 - 4;
      float f = a(param1Int2, i, j, param1Int3, param1Int4, param1Int5);
      int k = (int)aH.a(i, j, f);
      try {
      
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      ck.this.a.func_73729_b(k, param1Int2, b(param1Int3, param1Int4, k, param1Int2, k + 4, param1Int2 + 20) ? 223 : 219, 20, 4, 20);
      ck.this.a.b.a(param1Int5, (int)(f * 100.0F));
    }
    
    float a(int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int param1Int6) {
      try {
        if (!ck.this.a.f)
          return a(param1Int6); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (param1Int4 > 0.33333334F * ck.this.a.field_146294_l)
          return a(param1Int6); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (param1Int5 >= param1Int1)
          try {
            if (param1Int5 <= param1Int1 + 20) {
              try {
                if (param1Int4 < param1Int2)
                  return 0.0F; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              try {
                if (param1Int4 > param1Int3)
                  return 1.0F; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              param1Int3 -= param1Int2;
              param1Int4 -= param1Int2;
              return param1Int4 / param1Int3;
            } 
            return a(param1Int6);
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      return a(param1Int6);
    }
    
    float a(int param1Int) {
      Map.Entry entry = ck.this.a.b.d(ck.this.a.r).get(param1Int);
      return ((Integer)((Map.Entry)entry.getValue()).getValue()).intValue() / 100.0F;
    }
    
    void b(int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      boolean bool = ck.this.a.b.a(param1Int4);
      try {
        ck.this.field_148161_k.field_71446_o.func_110577_a(h.n);
        if (bool) {
          ck.this.a.func_73729_b(ck.e, param1Int1, 0, 60, 119, 30);
        } else {
          ck.this.a.func_73729_b(ck.e, param1Int1, 0, 90, 95, 30);
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      int i = ck.e + 10;
      try {
        param1Int1 += 5;
        ck.this.a.a(i, param1Int1, ck.this.a.b.e(param1Int4));
        i += 25;
        if (bool) {
          a(i, param1Int1, param1Int2, param1Int3, param1Int4);
        } else {
          a(i, param1Int1, param1Int2, param1Int3);
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    }
    
    public void func_192634_a(int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int param1Int6, int param1Int7, boolean param1Boolean, float param1Float) {
      try {
        if (this.e) {
          a(param1Int3, param1Int6, param1Int7);
        } else {
          try {
            if (this.c == ah.GIRL_SPECIFIC) {
              b(param1Int3, param1Int6, param1Int7, param1Int1);
            } else {
              b(param1Int3, param1Int6, param1Int7);
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    }
    
    void a(String param1String, int param1Int1, int param1Int2) {
      this.g.func_78276_b(param1String, param1Int1, param1Int2, 3809871);
      GlStateManager.func_179131_c(1.0F, 1.0F, 1.0F, 1.0F);
    }
    
    void c(int param1Int1, int param1Int2) {
      byte b = 30;
      try {
        if (param1Int1 > b && param1Int1 < b + 20) {
          ck.this.f = true;
          ck.this.field_148161_k.func_147118_V().func_147682_a((ISound)PositionedSoundRecord.func_184371_a(SoundEvents.field_187909_gi, 1.0F));
          ArrayList<String> arrayList = new ArrayList();
          arrayList.add("cross");
          arrayList.addAll(ai.a(ck.this.a.b).get(ah.CUSTOM_BONE));
          h.l.add(h.b(ck.this.a.b));
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (!this.a)
          return; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        b += 40;
        if (param1Int1 > b)
          try {
            if (param1Int1 < b + 20) {
              ck.this.field_148161_k.func_147118_V().func_147682_a((ISound)PositionedSoundRecord.func_184371_a(SoundEvents.field_187909_gi, 1.0F));
              h.l.remove(h.l.size() - 1);
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    }
    
    void a(int param1Int1, int param1Int2) {
      try {
        if (param1Int1 > 40)
          try {
            if (param1Int1 < 60)
              ck.this.a.a(this.c, false, param1Int2); 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (param1Int1 > 60)
          try {
            if (param1Int1 < 80)
              ck.this.a.a(this.c, true, param1Int2); 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    }
    
    void b(int param1Int1, int param1Int2) {
      try {
        if (!ck.this.a.b.a(param1Int2))
          a(param1Int1, param1Int2); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    }
    
    public void c(int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      try {
        if (param1Int3 != 0)
          return; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (param1Int2 < 5)
          return; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (param1Int2 > 25)
          return; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (this.e) {
          c(param1Int1, param1Int2);
        } else {
          try {
            if (this.c == ah.GIRL_SPECIFIC) {
              b(param1Int1, param1Int4);
            } else {
              a(param1Int1, param1Int4);
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    }
    
    public void func_192633_a(int param1Int1, int param1Int2, int param1Int3, float param1Float) {}
    
    public boolean func_148278_a(int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int param1Int6) {
      return false;
    }
    
    public void func_148277_b(int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int param1Int6) {}
    
    private static RuntimeException a(RuntimeException param1RuntimeException) {
      return param1RuntimeException;
    }
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\ck.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */