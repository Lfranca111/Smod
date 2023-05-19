package com.schnurritv.sexmod;

import java.util.Objects;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import software.bernie.geckolib3.core.util.Color;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.IGeoRenderer;

public class bm extends b0 {
  public static boolean A = false;
  
  ItemStack B = ItemStack.field_190927_a;
  
  ItemStack y = ItemStack.field_190927_a;
  
  boolean D = false;
  
  boolean C = false;
  
  protected bo z;
  
  protected float x;
  
  float w = 0.0F;
  
  public bm(RenderManager paramRenderManager, AnimatedGeoModel<T> paramAnimatedGeoModel) {
    super(paramRenderManager, paramAnimatedGeoModel, 0.0D);
  }
  
  public void func_76979_b(Entity paramEntity, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {}
  
  public void a(bS parambS, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    try {
      if (A) {
        A = false;
      } else {
        return;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    bo bo1 = (bo)parambS;
    try {
      if (bo1.d() == null)
        return; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    EntityPlayer entityPlayer = (Minecraft.func_71410_x()).field_71439_g.field_70170_p.func_152378_a(bo1.d());
    try {
      if (entityPlayer == null)
        return; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      this.B = entityPlayer.func_184614_ca();
      this.y = entityPlayer.func_184592_cb();
      this.C = bo1.W;
      this.D = bo1.aj;
      this.z = (bo)parambS;
      this.x = paramFloat2;
      bo1.c(entityPlayer);
      if (a(entityPlayer, parambS))
        func_147906_a((Entity)parambS, entityPlayer.func_70005_c_(), paramDouble1, paramDouble2 + bo1.e(), paramDouble3, 300); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    super.a(parambS, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  boolean a(EntityPlayer paramEntityPlayer, bS parambS) {
    try {
      if (paramEntityPlayer.getPersistentID().equals((Minecraft.func_71410_x()).field_71439_g.getPersistentID()))
        return false; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    m m = parambS.o();
    try {
      if (m == null)
        return true; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return !m.hideNameTag;
  }
  
  protected void a(String paramString, GeoBone paramGeoBone) {}
  
  protected void a(String paramString, GeoBone paramGeoBone, bo parambo, BufferBuilder paramBufferBuilder) {}
  
  public void renderRecursively(BufferBuilder paramBufferBuilder, GeoBone paramGeoBone, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual getName : ()Ljava/lang/String;
    //   4: astore #7
    //   6: aload_0
    //   7: getfield D : Z
    //   10: ifeq -> 76
    //   13: aload #7
    //   15: ldc 'upperBody'
    //   17: invokevirtual equals : (Ljava/lang/Object;)Z
    //   20: ifeq -> 48
    //   23: goto -> 30
    //   26: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   29: athrow
    //   30: aload_2
    //   31: aload_2
    //   32: invokevirtual getRotationX : ()F
    //   35: ldc 0.5
    //   37: fsub
    //   38: invokevirtual setRotationX : (F)V
    //   41: goto -> 48
    //   44: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   47: athrow
    //   48: aload #7
    //   50: ldc 'head'
    //   52: invokevirtual equals : (Ljava/lang/Object;)Z
    //   55: ifeq -> 76
    //   58: aload_2
    //   59: aload_2
    //   60: invokevirtual getRotationX : ()F
    //   63: ldc 0.5
    //   65: fadd
    //   66: invokevirtual setRotationX : (F)V
    //   69: goto -> 76
    //   72: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   75: athrow
    //   76: aload #7
    //   78: ldc 'head'
    //   80: invokevirtual equals : (Ljava/lang/Object;)Z
    //   83: ifeq -> 107
    //   86: aload_0
    //   87: aload_1
    //   88: aload_2
    //   89: fload_3
    //   90: fload #4
    //   92: fload #5
    //   94: invokestatic ofRGB : (FFF)Lsoftware/bernie/geckolib3/core/util/Color;
    //   97: invokevirtual a : (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;Lsoftware/bernie/geckolib3/core/util/Color;)V
    //   100: goto -> 107
    //   103: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   106: athrow
    //   107: aload_0
    //   108: aload #7
    //   110: aload_2
    //   111: invokevirtual a : (Ljava/lang/String;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
    //   114: aload_0
    //   115: aload #7
    //   117: aload_2
    //   118: aload_0
    //   119: getfield z : Lcom/schnurritv/sexmod/bo;
    //   122: aload_1
    //   123: invokevirtual a : (Ljava/lang/String;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;Lcom/schnurritv/sexmod/bo;Lnet/minecraft/client/renderer/BufferBuilder;)V
    //   126: aload_0
    //   127: getfield C : Z
    //   130: ifeq -> 285
    //   133: aload_0
    //   134: getfield B : Lnet/minecraft/item/ItemStack;
    //   137: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   140: instanceof net/minecraft/item/ItemBow
    //   143: ifne -> 173
    //   146: goto -> 153
    //   149: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   152: athrow
    //   153: aload_0
    //   154: getfield y : Lnet/minecraft/item/ItemStack;
    //   157: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   160: instanceof net/minecraft/item/ItemBow
    //   163: ifeq -> 285
    //   166: goto -> 173
    //   169: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   172: athrow
    //   173: aload #7
    //   175: ldc 'armR'
    //   177: invokevirtual equals : (Ljava/lang/Object;)Z
    //   180: ifeq -> 216
    //   183: goto -> 190
    //   186: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   189: athrow
    //   190: aload_2
    //   191: aload_2
    //   192: invokevirtual getRotationX : ()F
    //   195: aload_0
    //   196: getfield n : Lcom/schnurritv/sexmod/bS;
    //   199: getfield field_70125_A : F
    //   202: ldc 50.0
    //   204: fdiv
    //   205: fsub
    //   206: invokevirtual setRotationX : (F)V
    //   209: goto -> 216
    //   212: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   215: athrow
    //   216: aload #7
    //   218: ldc 'armL'
    //   220: invokevirtual equals : (Ljava/lang/Object;)Z
    //   223: ifeq -> 252
    //   226: aload_2
    //   227: aload_2
    //   228: invokevirtual getRotationY : ()F
    //   231: aload_0
    //   232: getfield n : Lcom/schnurritv/sexmod/bS;
    //   235: getfield field_70125_A : F
    //   238: ldc 50.0
    //   240: fdiv
    //   241: fsub
    //   242: invokevirtual setRotationY : (F)V
    //   245: goto -> 252
    //   248: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   251: athrow
    //   252: aload_0
    //   253: getfield y : Lnet/minecraft/item/ItemStack;
    //   256: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   259: instanceof net/minecraft/item/ItemBow
    //   262: ifeq -> 285
    //   265: aload_0
    //   266: getfield y : Lnet/minecraft/item/ItemStack;
    //   269: astore #8
    //   271: aload_0
    //   272: aload_0
    //   273: getfield B : Lnet/minecraft/item/ItemStack;
    //   276: putfield y : Lnet/minecraft/item/ItemStack;
    //   279: aload_0
    //   280: aload #8
    //   282: putfield B : Lnet/minecraft/item/ItemStack;
    //   285: aload_0
    //   286: getfield C : Z
    //   289: ifeq -> 395
    //   292: aload_0
    //   293: getfield B : Lnet/minecraft/item/ItemStack;
    //   296: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   299: instanceof net/minecraft/item/ItemShield
    //   302: ifeq -> 395
    //   305: goto -> 312
    //   308: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   311: athrow
    //   312: aload #7
    //   314: ldc 'armR'
    //   316: invokevirtual equals : (Ljava/lang/Object;)Z
    //   319: ifeq -> 347
    //   322: goto -> 329
    //   325: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   328: athrow
    //   329: aload_2
    //   330: fconst_0
    //   331: invokevirtual setRotationZ : (F)V
    //   334: aload_2
    //   335: ldc 0.5
    //   337: invokevirtual setRotationX : (F)V
    //   340: goto -> 395
    //   343: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   346: athrow
    //   347: aload_0
    //   348: getfield y : Lnet/minecraft/item/ItemStack;
    //   351: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   354: instanceof net/minecraft/item/ItemShield
    //   357: ifeq -> 395
    //   360: aload #7
    //   362: ldc 'armL'
    //   364: invokevirtual equals : (Ljava/lang/Object;)Z
    //   367: ifeq -> 395
    //   370: goto -> 377
    //   373: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   376: athrow
    //   377: aload_2
    //   378: fconst_0
    //   379: invokevirtual setRotationZ : (F)V
    //   382: aload_2
    //   383: ldc 0.5
    //   385: invokevirtual setRotationX : (F)V
    //   388: goto -> 395
    //   391: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   394: athrow
    //   395: aload #7
    //   397: ldc 'weapon'
    //   399: invokevirtual equals : (Ljava/lang/Object;)Z
    //   402: ifeq -> 436
    //   405: aload_0
    //   406: getfield B : Lnet/minecraft/item/ItemStack;
    //   409: invokevirtual func_190926_b : ()Z
    //   412: ifne -> 436
    //   415: goto -> 422
    //   418: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   421: athrow
    //   422: aload_0
    //   423: aload_1
    //   424: aload_2
    //   425: iconst_0
    //   426: invokevirtual a : (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;Z)V
    //   429: goto -> 436
    //   432: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   435: athrow
    //   436: aload #7
    //   438: ldc 'offhand'
    //   440: invokevirtual equals : (Ljava/lang/Object;)Z
    //   443: ifeq -> 477
    //   446: aload_0
    //   447: getfield y : Lnet/minecraft/item/ItemStack;
    //   450: invokevirtual func_190926_b : ()Z
    //   453: ifne -> 477
    //   456: goto -> 463
    //   459: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   462: athrow
    //   463: aload_0
    //   464: aload_1
    //   465: aload_2
    //   466: iconst_1
    //   467: invokevirtual a : (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;Z)V
    //   470: goto -> 477
    //   473: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   476: athrow
    //   477: getstatic com/schnurritv/sexmod/bm.MATRIX_STACK : Lsoftware/bernie/geckolib3/util/MatrixStack;
    //   480: invokevirtual push : ()V
    //   483: getstatic com/schnurritv/sexmod/bm.MATRIX_STACK : Lsoftware/bernie/geckolib3/util/MatrixStack;
    //   486: aload_2
    //   487: invokevirtual translate : (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
    //   490: getstatic com/schnurritv/sexmod/bm.MATRIX_STACK : Lsoftware/bernie/geckolib3/util/MatrixStack;
    //   493: aload_2
    //   494: invokevirtual moveToPivot : (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
    //   497: getstatic com/schnurritv/sexmod/bm.MATRIX_STACK : Lsoftware/bernie/geckolib3/util/MatrixStack;
    //   500: aload_2
    //   501: invokevirtual rotate : (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
    //   504: getstatic com/schnurritv/sexmod/bm.MATRIX_STACK : Lsoftware/bernie/geckolib3/util/MatrixStack;
    //   507: aload_2
    //   508: invokevirtual scale : (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
    //   511: getstatic com/schnurritv/sexmod/bm.MATRIX_STACK : Lsoftware/bernie/geckolib3/util/MatrixStack;
    //   514: aload_2
    //   515: invokevirtual moveBackFromPivot : (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
    //   518: ldc 'Head2'
    //   520: aload #7
    //   522: invokevirtual equals : (Ljava/lang/Object;)Z
    //   525: ifeq -> 553
    //   528: aload_0
    //   529: invokevirtual c : ()Z
    //   532: ifne -> 553
    //   535: goto -> 542
    //   538: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   541: athrow
    //   542: getstatic com/schnurritv/sexmod/bm.MATRIX_STACK : Lsoftware/bernie/geckolib3/util/MatrixStack;
    //   545: invokevirtual pop : ()V
    //   548: return
    //   549: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   552: athrow
    //   553: ldc 'neck'
    //   555: aload #7
    //   557: invokevirtual equals : (Ljava/lang/Object;)Z
    //   560: ifne -> 580
    //   563: ldc 'head'
    //   565: aload #7
    //   567: invokevirtual equals : (Ljava/lang/Object;)Z
    //   570: ifeq -> 605
    //   573: goto -> 580
    //   576: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   579: athrow
    //   580: aload_0
    //   581: invokevirtual b : ()Z
    //   584: ifne -> 605
    //   587: goto -> 594
    //   590: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   593: athrow
    //   594: getstatic com/schnurritv/sexmod/bm.MATRIX_STACK : Lsoftware/bernie/geckolib3/util/MatrixStack;
    //   597: invokevirtual pop : ()V
    //   600: return
    //   601: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   604: athrow
    //   605: aload_2
    //   606: getfield isHidden : Z
    //   609: ifne -> 820
    //   612: aload_0
    //   613: aload #7
    //   615: fload_3
    //   616: fload #4
    //   618: fload #5
    //   620: invokevirtual a : (Ljava/lang/String;FFF)Ljavax/vecmath/Vector4f;
    //   623: astore #8
    //   625: aload #8
    //   627: getfield x : F
    //   630: fstore_3
    //   631: aload #8
    //   633: getfield y : F
    //   636: fstore #4
    //   638: aload #8
    //   640: getfield z : F
    //   643: fstore #5
    //   645: aload #8
    //   647: getfield w : F
    //   650: f2d
    //   651: dstore #9
    //   653: aload_0
    //   654: getfield d : Ljava/util/HashSet;
    //   657: aload #7
    //   659: invokevirtual contains : (Ljava/lang/Object;)Z
    //   662: ifne -> 740
    //   665: aload_2
    //   666: getfield childCubes : Ljava/util/List;
    //   669: invokeinterface iterator : ()Ljava/util/Iterator;
    //   674: astore #11
    //   676: aload #11
    //   678: invokeinterface hasNext : ()Z
    //   683: ifeq -> 740
    //   686: aload #11
    //   688: invokeinterface next : ()Ljava/lang/Object;
    //   693: checkcast software/bernie/geckolib3/geo/render/built/GeoCube
    //   696: astore #12
    //   698: getstatic com/schnurritv/sexmod/bm.MATRIX_STACK : Lsoftware/bernie/geckolib3/util/MatrixStack;
    //   701: invokevirtual push : ()V
    //   704: invokestatic func_179094_E : ()V
    //   707: aload_0
    //   708: aload_2
    //   709: putfield t : Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;
    //   712: aload_0
    //   713: aload_1
    //   714: aload #12
    //   716: fload_3
    //   717: fload #4
    //   719: fload #5
    //   721: fload #6
    //   723: dload #9
    //   725: invokevirtual a : (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoCube;FFFFD)V
    //   728: invokestatic func_179121_F : ()V
    //   731: getstatic com/schnurritv/sexmod/bm.MATRIX_STACK : Lsoftware/bernie/geckolib3/util/MatrixStack;
    //   734: invokevirtual pop : ()V
    //   737: goto -> 676
    //   740: aload_2
    //   741: getfield childBones : Ljava/util/List;
    //   744: invokeinterface iterator : ()Ljava/util/Iterator;
    //   749: astore #11
    //   751: aload #11
    //   753: invokeinterface hasNext : ()Z
    //   758: ifeq -> 820
    //   761: aload #11
    //   763: invokeinterface next : ()Ljava/lang/Object;
    //   768: checkcast software/bernie/geckolib3/geo/render/built/GeoBone
    //   771: astore #12
    //   773: dload #9
    //   775: dconst_0
    //   776: dcmpl
    //   777: ifne -> 801
    //   780: aload_0
    //   781: aload_1
    //   782: aload #12
    //   784: fload_3
    //   785: fload #4
    //   787: fload #5
    //   789: fload #6
    //   791: invokevirtual renderRecursively : (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;FFFF)V
    //   794: goto -> 817
    //   797: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   800: athrow
    //   801: aload_0
    //   802: aload_1
    //   803: aload #12
    //   805: fload_3
    //   806: fload #4
    //   808: fload #5
    //   810: fload #6
    //   812: dload #9
    //   814: invokevirtual a : (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;FFFFD)V
    //   817: goto -> 751
    //   820: getstatic com/schnurritv/sexmod/bm.MATRIX_STACK : Lsoftware/bernie/geckolib3/util/MatrixStack;
    //   823: invokevirtual pop : ()V
    //   826: goto -> 831
    //   829: astore #8
    //   831: return
    // Exception table:
    //   from	to	target	type
    //   6	23	26	java/lang/IllegalStateException
    //   13	41	44	java/lang/IllegalStateException
    //   48	69	72	java/lang/IllegalStateException
    //   76	100	103	java/lang/IllegalStateException
    //   107	146	149	java/lang/IllegalStateException
    //   133	166	169	java/lang/IllegalStateException
    //   153	183	186	java/lang/IllegalStateException
    //   173	209	212	java/lang/IllegalStateException
    //   216	245	248	java/lang/IllegalStateException
    //   285	305	308	java/lang/IllegalStateException
    //   292	322	325	java/lang/IllegalStateException
    //   312	343	343	java/lang/IllegalStateException
    //   347	370	373	java/lang/IllegalStateException
    //   360	388	391	java/lang/IllegalStateException
    //   395	415	418	java/lang/IllegalStateException
    //   405	429	432	java/lang/IllegalStateException
    //   436	456	459	java/lang/IllegalStateException
    //   446	470	473	java/lang/IllegalStateException
    //   477	535	538	java/lang/IllegalStateException
    //   528	549	549	java/lang/IllegalStateException
    //   553	573	576	java/lang/IllegalStateException
    //   563	587	590	java/lang/IllegalStateException
    //   580	601	601	java/lang/IllegalStateException
    //   773	797	797	java/lang/IllegalStateException
    //   820	826	829	java/lang/IllegalStateException
  }
  
  boolean b() {
    try {
      if (!((bo)this.n).c())
        return true; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (this.g.field_71474_y.field_74320_O != 0)
        return true; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (!(this.g.field_71462_r instanceof net.minecraft.client.gui.inventory.GuiInventory)) {
        try {
          if (this.g.field_71462_r instanceof net.minecraft.client.gui.inventory.GuiContainerCreative);
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  void a(BufferBuilder paramBufferBuilder, GeoBone paramGeoBone, Color paramColor) {
    GlStateManager.func_179094_E();
    Tessellator.func_178181_a().func_78381_a();
    cB.a(IGeoRenderer.MATRIX_STACK, paramGeoBone);
    GL11.glEnable(2896);
    c();
    (new w((IGeoRenderer)this)).render((EntityLivingBase)this.n, ((bS)this.n).field_184619_aG, ((bS)this.n).field_70721_aZ, this.x, 0.0F, 0.0F, 0.0F, paramColor);
    func_110776_a(Objects.<ResourceLocation>requireNonNull(getEntityTexture((EntityLivingBase)this.n)));
    paramBufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181712_l);
    GlStateManager.func_179147_l();
    GlStateManager.func_187401_a(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
    GL11.glDisable(2896);
    GlStateManager.func_179121_F();
  }
  
  protected void c() {}
  
  void a(BufferBuilder paramBufferBuilder, GeoBone paramGeoBone, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic func_71410_x : ()Lnet/minecraft/client/Minecraft;
    //   3: invokevirtual func_175597_ag : ()Lnet/minecraft/client/renderer/ItemRenderer;
    //   6: astore #4
    //   8: invokestatic func_179094_E : ()V
    //   11: invokestatic func_178181_a : ()Lnet/minecraft/client/renderer/Tessellator;
    //   14: invokevirtual func_78381_a : ()V
    //   17: getstatic software/bernie/geckolib3/renderers/geo/IGeoRenderer.MATRIX_STACK : Lsoftware/bernie/geckolib3/util/MatrixStack;
    //   20: aload_2
    //   21: invokestatic a : (Lsoftware/bernie/geckolib3/util/MatrixStack;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
    //   24: sipush #2896
    //   27: invokestatic glEnable : (I)V
    //   30: invokestatic func_179147_l : ()V
    //   33: getstatic net/minecraft/client/renderer/GlStateManager$SourceFactor.SRC_ALPHA : Lnet/minecraft/client/renderer/GlStateManager$SourceFactor;
    //   36: getstatic net/minecraft/client/renderer/GlStateManager$DestFactor.ONE_MINUS_SRC_ALPHA : Lnet/minecraft/client/renderer/GlStateManager$DestFactor;
    //   39: invokestatic func_187401_a : (Lnet/minecraft/client/renderer/GlStateManager$SourceFactor;Lnet/minecraft/client/renderer/GlStateManager$DestFactor;)V
    //   42: iload_3
    //   43: ifeq -> 57
    //   46: aload_0
    //   47: getfield y : Lnet/minecraft/item/ItemStack;
    //   50: goto -> 61
    //   53: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   56: athrow
    //   57: aload_0
    //   58: getfield B : Lnet/minecraft/item/ItemStack;
    //   61: astore #5
    //   63: getstatic com/schnurritv/sexmod/bm$a.a : [I
    //   66: aload #5
    //   68: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   71: aload #5
    //   73: invokevirtual func_77661_b : (Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/EnumAction;
    //   76: invokevirtual ordinal : ()I
    //   79: iaload
    //   80: lookupswitch default -> 129, 1 -> 108, 2 -> 120
    //   108: aload_0
    //   109: iload_3
    //   110: invokevirtual a : (Z)V
    //   113: goto -> 129
    //   116: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   119: athrow
    //   120: aload_0
    //   121: iload_3
    //   122: aload_0
    //   123: getfield C : Z
    //   126: invokevirtual a : (ZZ)V
    //   129: aload_0
    //   130: getfield C : Z
    //   133: ifeq -> 237
    //   136: iload_3
    //   137: ifne -> 237
    //   140: goto -> 147
    //   143: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   146: athrow
    //   147: aload #5
    //   149: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   152: instanceof net/minecraft/item/ItemBow
    //   155: ifeq -> 237
    //   158: goto -> 165
    //   161: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   164: athrow
    //   165: aload_0
    //   166: dup
    //   167: getfield w : F
    //   170: ldc 0.015
    //   172: fadd
    //   173: putfield w : F
    //   176: aload_0
    //   177: getfield n : Lcom/schnurritv/sexmod/bS;
    //   180: aload_0
    //   181: getfield w : F
    //   184: fneg
    //   185: ldc 20.0
    //   187: fmul
    //   188: aload #5
    //   190: invokevirtual func_77988_m : ()I
    //   193: i2f
    //   194: fadd
    //   195: invokestatic round : (F)I
    //   198: invokevirtual d : (I)V
    //   201: aload_0
    //   202: getfield n : Lcom/schnurritv/sexmod/bS;
    //   205: aload #5
    //   207: invokevirtual a : (Lnet/minecraft/item/ItemStack;)V
    //   210: aload_0
    //   211: getfield n : Lcom/schnurritv/sexmod/bS;
    //   214: getstatic net/minecraft/util/EnumHand.MAIN_HAND : Lnet/minecraft/util/EnumHand;
    //   217: invokevirtual func_184598_c : (Lnet/minecraft/util/EnumHand;)V
    //   220: aload_0
    //   221: getfield n : Lcom/schnurritv/sexmod/bS;
    //   224: checkcast com/schnurritv/sexmod/bo
    //   227: invokevirtual o : ()V
    //   230: goto -> 260
    //   233: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   236: athrow
    //   237: aload_0
    //   238: fconst_0
    //   239: putfield w : F
    //   242: aload_0
    //   243: getfield n : Lcom/schnurritv/sexmod/bS;
    //   246: iconst_0
    //   247: invokevirtual d : (I)V
    //   250: aload_0
    //   251: getfield n : Lcom/schnurritv/sexmod/bS;
    //   254: getstatic net/minecraft/item/ItemStack.field_190927_a : Lnet/minecraft/item/ItemStack;
    //   257: invokevirtual a : (Lnet/minecraft/item/ItemStack;)V
    //   260: aload_0
    //   261: iload_3
    //   262: aload #5
    //   264: invokevirtual a : (ZLnet/minecraft/item/ItemStack;)V
    //   267: ldc 0.75
    //   269: ldc 0.75
    //   271: ldc 0.75
    //   273: invokestatic func_179152_a : (FFF)V
    //   276: aload #4
    //   278: aload_0
    //   279: getfield n : Lcom/schnurritv/sexmod/bS;
    //   282: aload #5
    //   284: getstatic net/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType.THIRD_PERSON_RIGHT_HAND : Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType;
    //   287: invokevirtual func_178099_a : (Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType;)V
    //   290: aload_1
    //   291: bipush #7
    //   293: getstatic net/minecraft/client/renderer/vertex/DefaultVertexFormats.field_181712_l : Lnet/minecraft/client/renderer/vertex/VertexFormat;
    //   296: invokevirtual func_181668_a : (ILnet/minecraft/client/renderer/vertex/VertexFormat;)V
    //   299: aload_0
    //   300: aload_0
    //   301: aload_0
    //   302: getfield n : Lcom/schnurritv/sexmod/bS;
    //   305: invokevirtual getEntityTexture : (Lnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/util/ResourceLocation;
    //   308: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   311: checkcast net/minecraft/util/ResourceLocation
    //   314: invokevirtual func_110776_a : (Lnet/minecraft/util/ResourceLocation;)V
    //   317: sipush #2896
    //   320: invokestatic glDisable : (I)V
    //   323: invokestatic func_179121_F : ()V
    //   326: invokestatic func_179147_l : ()V
    //   329: getstatic net/minecraft/client/renderer/GlStateManager$SourceFactor.SRC_ALPHA : Lnet/minecraft/client/renderer/GlStateManager$SourceFactor;
    //   332: getstatic net/minecraft/client/renderer/GlStateManager$DestFactor.ONE_MINUS_SRC_ALPHA : Lnet/minecraft/client/renderer/GlStateManager$DestFactor;
    //   335: invokestatic func_187401_a : (Lnet/minecraft/client/renderer/GlStateManager$SourceFactor;Lnet/minecraft/client/renderer/GlStateManager$DestFactor;)V
    //   338: return
    // Exception table:
    //   from	to	target	type
    //   8	53	53	java/lang/IllegalStateException
    //   63	116	116	java/lang/IllegalStateException
    //   129	140	143	java/lang/IllegalStateException
    //   136	158	161	java/lang/IllegalStateException
    //   147	233	233	java/lang/IllegalStateException
  }
  
  protected void a(boolean paramBoolean, ItemStack paramItemStack) {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    GlStateManager.func_179114_b(paramBoolean ? 200.0F : 90.0F, 1.0F, 0.0F, 0.0F);
  }
  
  protected void a(boolean paramBoolean) {
    GlStateManager.func_179114_b(20.0F, 1.0F, 0.0F, 0.0F);
  }
  
  protected void a(boolean paramBoolean1, boolean paramBoolean2) {
    try {
      if (paramBoolean1) {
        try {
          GlStateManager.func_179114_b(180.0F, 0.0F, 1.0F, 0.0F);
          GlStateManager.func_179114_b(90.0F, 1.0F, 0.0F, 0.0F);
          if (paramBoolean2) {
            GlStateManager.func_179114_b(-90.0F, 0.0F, 1.0F, 0.0F);
            GlStateManager.func_179114_b(35.0F, 0.0F, 0.0F, 1.0F);
            GlStateManager.func_179114_b(-20.0F, 1.0F, 0.0F, 0.0F);
            GlStateManager.func_179109_b(0.0F, 0.0F, 0.228F);
          } 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
      } else {
        try {
          if (paramBoolean2) {
            GlStateManager.func_179114_b(-90.0F, 1.0F, 0.0F, 0.0F);
            GlStateManager.func_179114_b(-90.0F, 0.0F, 0.0F, 1.0F);
            GlStateManager.func_179109_b(0.0F, 0.165F, 0.0F);
          } 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\bm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */