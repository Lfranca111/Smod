package com.schnurritv.sexmod;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.geo.render.built.GeoCube;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public abstract class bp extends bm {
  protected static final Vec3i E = new Vec3i(255, 255, 255);
  
  static HashMap<Integer, Vec3i> F = new HashMap<>();
  
  public bp(RenderManager paramRenderManager, AnimatedGeoModel paramAnimatedGeoModel) {
    super(paramRenderManager, paramAnimatedGeoModel);
  }
  
  public static void d() {
    F.clear();
  }
  
  protected Vec3i a(GeoBone paramGeoBone) {
    String str = paramGeoBone.getName();
    int i = str.hashCode() + this.n.getPersistentID().hashCode();
    Vec3i vec3i = F.get(Integer.valueOf(i));
    try {
      if (vec3i != null)
        return vec3i; 
    } catch (IllegalStateException illegalStateException) {
      throw b(null);
    } 
    vec3i = a(str);
    F.put(Integer.valueOf(i), vec3i);
    return vec3i;
  }
  
  protected abstract Vec3i a(String paramString);
  
  protected void a(GeoBone paramGeoBone, int paramInt) {
    List<GeoBone> list = paramGeoBone.childBones;
    for (byte b = 0; b < list.size(); b++) {
      GeoBone geoBone = list.get(b);
      if (paramInt == b) {
        GeoBone geoBone1 = geoBone;
        geoBone1.setHidden(false);
        return;
      } 
    } 
  }
  
  protected float a() {
    return 1.0F;
  }
  
  protected Vec3d a(ItemStack paramItemStack) {
    return new Vec3d(-90.0D, 0.0D, 0.0D);
  }
  
  protected GeoBone b(GeoBone paramGeoBone, int paramInt) {
    List<GeoBone> list = paramGeoBone.childBones;
    GeoBone geoBone = null;
    list.sort(Comparator.comparingDouble(GeoBone::getPivotY));
    for (byte b = 0; b < list.size(); b++) {
      GeoBone geoBone1 = list.get(b);
      if (paramInt == b) {
        geoBone = geoBone1;
        geoBone.setHidden(false);
      } else {
        geoBone1.setHidden(true);
      } 
    } 
    return geoBone;
  }
  
  protected Vec3i a(Vec3i paramVec3i) {
    return paramVec3i;
  }
  
  public void renderRecursively(BufferBuilder paramBufferBuilder, GeoBone paramGeoBone, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual getName : ()Ljava/lang/String;
    //   4: astore #7
    //   6: aload_0
    //   7: getfield D : Z
    //   10: ifeq -> 120
    //   13: aload #7
    //   15: ldc 'upperBody'
    //   17: invokevirtual equals : (Ljava/lang/Object;)Z
    //   20: ifeq -> 48
    //   23: goto -> 30
    //   26: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   29: athrow
    //   30: aload_2
    //   31: aload_2
    //   32: invokevirtual getRotationX : ()F
    //   35: ldc 0.5
    //   37: fsub
    //   38: invokevirtual setRotationX : (F)V
    //   41: goto -> 48
    //   44: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
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
    //   72: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   75: athrow
    //   76: aload #7
    //   78: ldc 'legL'
    //   80: invokevirtual equals : (Ljava/lang/Object;)Z
    //   83: ifne -> 103
    //   86: aload #7
    //   88: ldc 'legR'
    //   90: invokevirtual equals : (Ljava/lang/Object;)Z
    //   93: ifeq -> 120
    //   96: goto -> 103
    //   99: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   102: athrow
    //   103: aload_2
    //   104: aload_2
    //   105: invokevirtual getPositionZ : ()F
    //   108: fconst_1
    //   109: fadd
    //   110: invokevirtual setPositionZ : (F)V
    //   113: goto -> 120
    //   116: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   119: athrow
    //   120: aload #7
    //   122: ldc 'head'
    //   124: invokevirtual equals : (Ljava/lang/Object;)Z
    //   127: ifeq -> 151
    //   130: aload_0
    //   131: aload_1
    //   132: aload_2
    //   133: fload_3
    //   134: fload #4
    //   136: fload #5
    //   138: invokestatic ofRGB : (FFF)Lsoftware/bernie/geckolib3/core/util/Color;
    //   141: invokevirtual a : (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;Lsoftware/bernie/geckolib3/core/util/Color;)V
    //   144: goto -> 151
    //   147: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   150: athrow
    //   151: aload_0
    //   152: aload #7
    //   154: aload_2
    //   155: invokevirtual a : (Ljava/lang/String;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
    //   158: aload_0
    //   159: aload #7
    //   161: aload_2
    //   162: aload_0
    //   163: getfield z : Lcom/schnurritv/sexmod/bo;
    //   166: aload_1
    //   167: invokevirtual a : (Ljava/lang/String;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;Lcom/schnurritv/sexmod/bo;Lnet/minecraft/client/renderer/BufferBuilder;)V
    //   170: aload_0
    //   171: getfield C : Z
    //   174: ifeq -> 329
    //   177: aload_0
    //   178: getfield B : Lnet/minecraft/item/ItemStack;
    //   181: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   184: instanceof net/minecraft/item/ItemBow
    //   187: ifne -> 217
    //   190: goto -> 197
    //   193: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   196: athrow
    //   197: aload_0
    //   198: getfield y : Lnet/minecraft/item/ItemStack;
    //   201: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   204: instanceof net/minecraft/item/ItemBow
    //   207: ifeq -> 329
    //   210: goto -> 217
    //   213: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   216: athrow
    //   217: aload #7
    //   219: ldc 'armR'
    //   221: invokevirtual equals : (Ljava/lang/Object;)Z
    //   224: ifeq -> 260
    //   227: goto -> 234
    //   230: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   233: athrow
    //   234: aload_2
    //   235: aload_2
    //   236: invokevirtual getRotationX : ()F
    //   239: aload_0
    //   240: getfield n : Lcom/schnurritv/sexmod/bS;
    //   243: getfield field_70125_A : F
    //   246: ldc 50.0
    //   248: fdiv
    //   249: fsub
    //   250: invokevirtual setRotationX : (F)V
    //   253: goto -> 260
    //   256: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   259: athrow
    //   260: aload #7
    //   262: ldc 'armL'
    //   264: invokevirtual equals : (Ljava/lang/Object;)Z
    //   267: ifeq -> 296
    //   270: aload_2
    //   271: aload_2
    //   272: invokevirtual getRotationY : ()F
    //   275: aload_0
    //   276: getfield n : Lcom/schnurritv/sexmod/bS;
    //   279: getfield field_70125_A : F
    //   282: ldc 50.0
    //   284: fdiv
    //   285: fsub
    //   286: invokevirtual setRotationY : (F)V
    //   289: goto -> 296
    //   292: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   295: athrow
    //   296: aload_0
    //   297: getfield y : Lnet/minecraft/item/ItemStack;
    //   300: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   303: instanceof net/minecraft/item/ItemBow
    //   306: ifeq -> 329
    //   309: aload_0
    //   310: getfield y : Lnet/minecraft/item/ItemStack;
    //   313: astore #8
    //   315: aload_0
    //   316: aload_0
    //   317: getfield B : Lnet/minecraft/item/ItemStack;
    //   320: putfield y : Lnet/minecraft/item/ItemStack;
    //   323: aload_0
    //   324: aload #8
    //   326: putfield B : Lnet/minecraft/item/ItemStack;
    //   329: aload_0
    //   330: getfield C : Z
    //   333: ifeq -> 439
    //   336: aload_0
    //   337: getfield B : Lnet/minecraft/item/ItemStack;
    //   340: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   343: instanceof net/minecraft/item/ItemShield
    //   346: ifeq -> 439
    //   349: goto -> 356
    //   352: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   355: athrow
    //   356: aload #7
    //   358: ldc 'armR'
    //   360: invokevirtual equals : (Ljava/lang/Object;)Z
    //   363: ifeq -> 391
    //   366: goto -> 373
    //   369: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   372: athrow
    //   373: aload_2
    //   374: fconst_0
    //   375: invokevirtual setRotationZ : (F)V
    //   378: aload_2
    //   379: ldc 0.5
    //   381: invokevirtual setRotationX : (F)V
    //   384: goto -> 439
    //   387: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   390: athrow
    //   391: aload_0
    //   392: getfield y : Lnet/minecraft/item/ItemStack;
    //   395: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   398: instanceof net/minecraft/item/ItemShield
    //   401: ifeq -> 439
    //   404: aload #7
    //   406: ldc 'armL'
    //   408: invokevirtual equals : (Ljava/lang/Object;)Z
    //   411: ifeq -> 439
    //   414: goto -> 421
    //   417: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   420: athrow
    //   421: aload_2
    //   422: fconst_0
    //   423: invokevirtual setRotationZ : (F)V
    //   426: aload_2
    //   427: ldc 0.5
    //   429: invokevirtual setRotationX : (F)V
    //   432: goto -> 439
    //   435: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   438: athrow
    //   439: aload #7
    //   441: ldc 'weapon'
    //   443: invokevirtual equals : (Ljava/lang/Object;)Z
    //   446: ifeq -> 480
    //   449: aload_0
    //   450: getfield B : Lnet/minecraft/item/ItemStack;
    //   453: invokevirtual func_190926_b : ()Z
    //   456: ifne -> 480
    //   459: goto -> 466
    //   462: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   465: athrow
    //   466: aload_0
    //   467: aload_1
    //   468: aload_2
    //   469: iconst_0
    //   470: invokevirtual a : (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;Z)V
    //   473: goto -> 480
    //   476: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   479: athrow
    //   480: aload #7
    //   482: ldc 'offhand'
    //   484: invokevirtual equals : (Ljava/lang/Object;)Z
    //   487: ifeq -> 521
    //   490: aload_0
    //   491: getfield y : Lnet/minecraft/item/ItemStack;
    //   494: invokevirtual func_190926_b : ()Z
    //   497: ifne -> 521
    //   500: goto -> 507
    //   503: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   506: athrow
    //   507: aload_0
    //   508: aload_1
    //   509: aload_2
    //   510: iconst_1
    //   511: invokevirtual a : (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;Z)V
    //   514: goto -> 521
    //   517: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   520: athrow
    //   521: getstatic com/schnurritv/sexmod/bp.MATRIX_STACK : Lsoftware/bernie/geckolib3/util/MatrixStack;
    //   524: invokevirtual push : ()V
    //   527: getstatic com/schnurritv/sexmod/bp.MATRIX_STACK : Lsoftware/bernie/geckolib3/util/MatrixStack;
    //   530: aload_2
    //   531: invokevirtual translate : (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
    //   534: getstatic com/schnurritv/sexmod/bp.MATRIX_STACK : Lsoftware/bernie/geckolib3/util/MatrixStack;
    //   537: aload_2
    //   538: invokevirtual moveToPivot : (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
    //   541: getstatic com/schnurritv/sexmod/bp.MATRIX_STACK : Lsoftware/bernie/geckolib3/util/MatrixStack;
    //   544: aload_2
    //   545: invokevirtual rotate : (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
    //   548: getstatic com/schnurritv/sexmod/bp.MATRIX_STACK : Lsoftware/bernie/geckolib3/util/MatrixStack;
    //   551: aload_2
    //   552: invokevirtual scale : (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
    //   555: getstatic com/schnurritv/sexmod/bp.MATRIX_STACK : Lsoftware/bernie/geckolib3/util/MatrixStack;
    //   558: aload_2
    //   559: invokevirtual moveBackFromPivot : (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
    //   562: ldc 'Head2'
    //   564: aload #7
    //   566: invokevirtual equals : (Ljava/lang/Object;)Z
    //   569: ifeq -> 597
    //   572: aload_0
    //   573: invokevirtual c : ()Z
    //   576: ifne -> 597
    //   579: goto -> 586
    //   582: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   585: athrow
    //   586: getstatic com/schnurritv/sexmod/bp.MATRIX_STACK : Lsoftware/bernie/geckolib3/util/MatrixStack;
    //   589: invokevirtual pop : ()V
    //   592: return
    //   593: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   596: athrow
    //   597: ldc 'neck'
    //   599: aload #7
    //   601: invokevirtual equals : (Ljava/lang/Object;)Z
    //   604: ifne -> 624
    //   607: ldc 'head'
    //   609: aload #7
    //   611: invokevirtual equals : (Ljava/lang/Object;)Z
    //   614: ifeq -> 649
    //   617: goto -> 624
    //   620: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   623: athrow
    //   624: aload_0
    //   625: invokevirtual b : ()Z
    //   628: ifne -> 649
    //   631: goto -> 638
    //   634: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   637: athrow
    //   638: getstatic com/schnurritv/sexmod/bp.MATRIX_STACK : Lsoftware/bernie/geckolib3/util/MatrixStack;
    //   641: invokevirtual pop : ()V
    //   644: return
    //   645: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   648: athrow
    //   649: aload_2
    //   650: getfield isHidden : Z
    //   653: ifne -> 865
    //   656: aload_0
    //   657: aload #7
    //   659: fload_3
    //   660: fload #4
    //   662: fload #5
    //   664: invokevirtual a : (Ljava/lang/String;FFF)Ljavax/vecmath/Vector4f;
    //   667: astore #8
    //   669: aload #8
    //   671: getfield x : F
    //   674: fstore_3
    //   675: aload #8
    //   677: getfield y : F
    //   680: fstore #4
    //   682: aload #8
    //   684: getfield z : F
    //   687: fstore #5
    //   689: aload #8
    //   691: getfield w : F
    //   694: f2d
    //   695: dstore #9
    //   697: aload_0
    //   698: getfield d : Ljava/util/HashSet;
    //   701: aload #7
    //   703: invokevirtual contains : (Ljava/lang/Object;)Z
    //   706: ifne -> 785
    //   709: aload_2
    //   710: getfield childCubes : Ljava/util/List;
    //   713: invokeinterface iterator : ()Ljava/util/Iterator;
    //   718: astore #11
    //   720: aload #11
    //   722: invokeinterface hasNext : ()Z
    //   727: ifeq -> 785
    //   730: aload #11
    //   732: invokeinterface next : ()Ljava/lang/Object;
    //   737: checkcast software/bernie/geckolib3/geo/render/built/GeoCube
    //   740: astore #12
    //   742: getstatic com/schnurritv/sexmod/bp.MATRIX_STACK : Lsoftware/bernie/geckolib3/util/MatrixStack;
    //   745: invokevirtual push : ()V
    //   748: invokestatic func_179094_E : ()V
    //   751: aload_0
    //   752: aload_2
    //   753: putfield t : Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;
    //   756: aload_0
    //   757: aload_1
    //   758: aload #12
    //   760: aload_2
    //   761: fload_3
    //   762: fload #4
    //   764: fload #5
    //   766: fload #6
    //   768: dload #9
    //   770: invokevirtual a : (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoCube;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;FFFFD)V
    //   773: invokestatic func_179121_F : ()V
    //   776: getstatic com/schnurritv/sexmod/bp.MATRIX_STACK : Lsoftware/bernie/geckolib3/util/MatrixStack;
    //   779: invokevirtual pop : ()V
    //   782: goto -> 720
    //   785: aload_2
    //   786: getfield childBones : Ljava/util/List;
    //   789: invokeinterface iterator : ()Ljava/util/Iterator;
    //   794: astore #11
    //   796: aload #11
    //   798: invokeinterface hasNext : ()Z
    //   803: ifeq -> 865
    //   806: aload #11
    //   808: invokeinterface next : ()Ljava/lang/Object;
    //   813: checkcast software/bernie/geckolib3/geo/render/built/GeoBone
    //   816: astore #12
    //   818: dload #9
    //   820: dconst_0
    //   821: dcmpl
    //   822: ifne -> 846
    //   825: aload_0
    //   826: aload_1
    //   827: aload #12
    //   829: fload_3
    //   830: fload #4
    //   832: fload #5
    //   834: fload #6
    //   836: invokevirtual renderRecursively : (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;FFFF)V
    //   839: goto -> 862
    //   842: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   845: athrow
    //   846: aload_0
    //   847: aload_1
    //   848: aload #12
    //   850: fload_3
    //   851: fload #4
    //   853: fload #5
    //   855: fload #6
    //   857: dload #9
    //   859: invokevirtual a : (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;FFFFD)V
    //   862: goto -> 796
    //   865: getstatic com/schnurritv/sexmod/bp.MATRIX_STACK : Lsoftware/bernie/geckolib3/util/MatrixStack;
    //   868: invokevirtual pop : ()V
    //   871: goto -> 876
    //   874: astore #8
    //   876: return
    // Exception table:
    //   from	to	target	type
    //   6	23	26	java/lang/IllegalStateException
    //   13	41	44	java/lang/IllegalStateException
    //   48	69	72	java/lang/IllegalStateException
    //   76	96	99	java/lang/IllegalStateException
    //   86	113	116	java/lang/IllegalStateException
    //   120	144	147	java/lang/IllegalStateException
    //   151	190	193	java/lang/IllegalStateException
    //   177	210	213	java/lang/IllegalStateException
    //   197	227	230	java/lang/IllegalStateException
    //   217	253	256	java/lang/IllegalStateException
    //   260	289	292	java/lang/IllegalStateException
    //   329	349	352	java/lang/IllegalStateException
    //   336	366	369	java/lang/IllegalStateException
    //   356	387	387	java/lang/IllegalStateException
    //   391	414	417	java/lang/IllegalStateException
    //   404	432	435	java/lang/IllegalStateException
    //   439	459	462	java/lang/IllegalStateException
    //   449	473	476	java/lang/IllegalStateException
    //   480	500	503	java/lang/IllegalStateException
    //   490	514	517	java/lang/IllegalStateException
    //   521	579	582	java/lang/IllegalStateException
    //   572	593	593	java/lang/IllegalStateException
    //   597	617	620	java/lang/IllegalStateException
    //   607	631	634	java/lang/IllegalStateException
    //   624	645	645	java/lang/IllegalStateException
    //   818	842	842	java/lang/IllegalStateException
    //   865	871	874	java/lang/IllegalStateException
  }
  
  public void a(BufferBuilder paramBufferBuilder, GeoCube paramGeoCube, GeoBone paramGeoBone, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, double paramDouble) {
    // Byte code:
    //   0: getstatic com/schnurritv/sexmod/bp.MATRIX_STACK : Lsoftware/bernie/geckolib3/util/MatrixStack;
    //   3: aload_2
    //   4: invokevirtual moveToPivot : (Lsoftware/bernie/geckolib3/geo/render/built/GeoCube;)V
    //   7: getstatic com/schnurritv/sexmod/bp.MATRIX_STACK : Lsoftware/bernie/geckolib3/util/MatrixStack;
    //   10: aload_2
    //   11: invokevirtual rotate : (Lsoftware/bernie/geckolib3/geo/render/built/GeoCube;)V
    //   14: getstatic com/schnurritv/sexmod/bp.MATRIX_STACK : Lsoftware/bernie/geckolib3/util/MatrixStack;
    //   17: aload_2
    //   18: invokevirtual moveBackFromPivot : (Lsoftware/bernie/geckolib3/geo/render/built/GeoCube;)V
    //   21: aload_2
    //   22: getfield quads : [Lsoftware/bernie/geckolib3/geo/render/built/GeoQuad;
    //   25: astore #10
    //   27: aload #10
    //   29: arraylength
    //   30: istore #11
    //   32: iconst_0
    //   33: istore #12
    //   35: iload #12
    //   37: iload #11
    //   39: if_icmpge -> 591
    //   42: aload #10
    //   44: iload #12
    //   46: aaload
    //   47: astore #13
    //   49: aload #13
    //   51: ifnonnull -> 61
    //   54: goto -> 585
    //   57: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   60: athrow
    //   61: new javax/vecmath/Vector3f
    //   64: dup
    //   65: aload #13
    //   67: getfield normal : Lnet/minecraft/util/math/Vec3i;
    //   70: invokevirtual func_177958_n : ()I
    //   73: i2f
    //   74: aload #13
    //   76: getfield normal : Lnet/minecraft/util/math/Vec3i;
    //   79: invokevirtual func_177956_o : ()I
    //   82: i2f
    //   83: aload #13
    //   85: getfield normal : Lnet/minecraft/util/math/Vec3i;
    //   88: invokevirtual func_177952_p : ()I
    //   91: i2f
    //   92: invokespecial <init> : (FFF)V
    //   95: astore #14
    //   97: getstatic com/schnurritv/sexmod/bp.MATRIX_STACK : Lsoftware/bernie/geckolib3/util/MatrixStack;
    //   100: invokevirtual getNormalMatrix : ()Ljavax/vecmath/Matrix3f;
    //   103: aload #14
    //   105: invokevirtual transform : (Ljavax/vecmath/Tuple3f;)V
    //   108: aload_2
    //   109: getfield size : Ljavax/vecmath/Vector3f;
    //   112: getfield y : F
    //   115: fconst_0
    //   116: fcmpl
    //   117: ifeq -> 139
    //   120: aload_2
    //   121: getfield size : Ljavax/vecmath/Vector3f;
    //   124: getfield z : F
    //   127: fconst_0
    //   128: fcmpl
    //   129: ifne -> 175
    //   132: goto -> 139
    //   135: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   138: athrow
    //   139: aload #14
    //   141: invokevirtual getX : ()F
    //   144: fconst_0
    //   145: fcmpg
    //   146: ifge -> 175
    //   149: goto -> 156
    //   152: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   155: athrow
    //   156: aload #14
    //   158: dup
    //   159: getfield x : F
    //   162: ldc -1.0
    //   164: fmul
    //   165: putfield x : F
    //   168: goto -> 175
    //   171: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   174: athrow
    //   175: aload_2
    //   176: getfield size : Ljavax/vecmath/Vector3f;
    //   179: getfield x : F
    //   182: fconst_0
    //   183: fcmpl
    //   184: ifeq -> 206
    //   187: aload_2
    //   188: getfield size : Ljavax/vecmath/Vector3f;
    //   191: getfield z : F
    //   194: fconst_0
    //   195: fcmpl
    //   196: ifne -> 242
    //   199: goto -> 206
    //   202: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   205: athrow
    //   206: aload #14
    //   208: invokevirtual getY : ()F
    //   211: fconst_0
    //   212: fcmpg
    //   213: ifge -> 242
    //   216: goto -> 223
    //   219: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   222: athrow
    //   223: aload #14
    //   225: dup
    //   226: getfield y : F
    //   229: ldc -1.0
    //   231: fmul
    //   232: putfield y : F
    //   235: goto -> 242
    //   238: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   241: athrow
    //   242: aload_2
    //   243: getfield size : Ljavax/vecmath/Vector3f;
    //   246: getfield x : F
    //   249: fconst_0
    //   250: fcmpl
    //   251: ifeq -> 273
    //   254: aload_2
    //   255: getfield size : Ljavax/vecmath/Vector3f;
    //   258: getfield y : F
    //   261: fconst_0
    //   262: fcmpl
    //   263: ifne -> 309
    //   266: goto -> 273
    //   269: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   272: athrow
    //   273: aload #14
    //   275: invokevirtual getZ : ()F
    //   278: fconst_0
    //   279: fcmpg
    //   280: ifge -> 309
    //   283: goto -> 290
    //   286: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   289: athrow
    //   290: aload #14
    //   292: dup
    //   293: getfield z : F
    //   296: ldc -1.0
    //   298: fmul
    //   299: putfield z : F
    //   302: goto -> 309
    //   305: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   308: athrow
    //   309: aload_0
    //   310: aload_3
    //   311: invokevirtual getName : ()Ljava/lang/String;
    //   314: invokevirtual c : (Ljava/lang/String;)Z
    //   317: ifeq -> 341
    //   320: new net/minecraft/util/math/Vec3d
    //   323: dup
    //   324: fload #4
    //   326: f2d
    //   327: fload #5
    //   329: f2d
    //   330: fload #6
    //   332: f2d
    //   333: invokespecial <init> : (DDD)V
    //   336: astore #15
    //   338: goto -> 421
    //   341: aload_0
    //   342: aload_3
    //   343: invokevirtual a : (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)Lnet/minecraft/util/math/Vec3i;
    //   346: astore #16
    //   348: aload_0
    //   349: aload #16
    //   351: invokevirtual a : (Lnet/minecraft/util/math/Vec3i;)Lnet/minecraft/util/math/Vec3i;
    //   354: astore #16
    //   356: new net/minecraft/util/math/Vec3d
    //   359: dup
    //   360: aload #16
    //   362: invokevirtual func_177958_n : ()I
    //   365: i2f
    //   366: ldc 255.0
    //   368: fdiv
    //   369: f2d
    //   370: aload #16
    //   372: invokevirtual func_177956_o : ()I
    //   375: i2f
    //   376: ldc 255.0
    //   378: fdiv
    //   379: f2d
    //   380: aload #16
    //   382: invokevirtual func_177952_p : ()I
    //   385: i2f
    //   386: ldc 255.0
    //   388: fdiv
    //   389: f2d
    //   390: invokespecial <init> : (DDD)V
    //   393: astore #17
    //   395: aload_0
    //   396: invokevirtual a : ()Z
    //   399: ifeq -> 417
    //   402: aload_0
    //   403: aload #17
    //   405: aload #14
    //   407: invokevirtual a : (Lnet/minecraft/util/math/Vec3d;Ljavax/vecmath/Vector3f;)Lnet/minecraft/util/math/Vec3d;
    //   410: goto -> 419
    //   413: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   416: athrow
    //   417: aload #17
    //   419: astore #15
    //   421: aload #13
    //   423: getfield vertices : [Lsoftware/bernie/geckolib3/geo/render/built/GeoVertex;
    //   426: astore #16
    //   428: aload #16
    //   430: arraylength
    //   431: istore #17
    //   433: iconst_0
    //   434: istore #18
    //   436: iload #18
    //   438: iload #17
    //   440: if_icmpge -> 585
    //   443: aload #16
    //   445: iload #18
    //   447: aaload
    //   448: astore #19
    //   450: new javax/vecmath/Vector4f
    //   453: dup
    //   454: aload #19
    //   456: getfield position : Ljavax/vecmath/Vector3f;
    //   459: invokevirtual getX : ()F
    //   462: aload #19
    //   464: getfield position : Ljavax/vecmath/Vector3f;
    //   467: invokevirtual getY : ()F
    //   470: aload #19
    //   472: getfield position : Ljavax/vecmath/Vector3f;
    //   475: invokevirtual getZ : ()F
    //   478: fconst_1
    //   479: invokespecial <init> : (FFFF)V
    //   482: astore #20
    //   484: getstatic com/schnurritv/sexmod/bp.MATRIX_STACK : Lsoftware/bernie/geckolib3/util/MatrixStack;
    //   487: invokevirtual getModelMatrix : ()Ljavax/vecmath/Matrix4f;
    //   490: aload #20
    //   492: invokevirtual transform : (Ljavax/vecmath/Tuple4f;)V
    //   495: aload_1
    //   496: aload #20
    //   498: invokevirtual getX : ()F
    //   501: f2d
    //   502: aload #20
    //   504: invokevirtual getY : ()F
    //   507: f2d
    //   508: aload #20
    //   510: invokevirtual getZ : ()F
    //   513: f2d
    //   514: invokevirtual func_181662_b : (DDD)Lnet/minecraft/client/renderer/BufferBuilder;
    //   517: aload #19
    //   519: getfield textureU : F
    //   522: f2d
    //   523: dload #8
    //   525: dadd
    //   526: aload #19
    //   528: getfield textureV : F
    //   531: f2d
    //   532: invokevirtual func_187315_a : (DD)Lnet/minecraft/client/renderer/BufferBuilder;
    //   535: aload #15
    //   537: getfield field_72450_a : D
    //   540: d2f
    //   541: aload #15
    //   543: getfield field_72448_b : D
    //   546: d2f
    //   547: aload #15
    //   549: getfield field_72449_c : D
    //   552: d2f
    //   553: fload #7
    //   555: invokevirtual func_181666_a : (FFFF)Lnet/minecraft/client/renderer/BufferBuilder;
    //   558: aload #14
    //   560: invokevirtual getX : ()F
    //   563: aload #14
    //   565: invokevirtual getY : ()F
    //   568: aload #14
    //   570: invokevirtual getZ : ()F
    //   573: invokevirtual func_181663_c : (FFF)Lnet/minecraft/client/renderer/BufferBuilder;
    //   576: invokevirtual func_181675_d : ()V
    //   579: iinc #18, 1
    //   582: goto -> 436
    //   585: iinc #12, 1
    //   588: goto -> 35
    //   591: return
    // Exception table:
    //   from	to	target	type
    //   49	57	57	java/lang/IllegalStateException
    //   97	132	135	java/lang/IllegalStateException
    //   120	149	152	java/lang/IllegalStateException
    //   139	168	171	java/lang/IllegalStateException
    //   175	199	202	java/lang/IllegalStateException
    //   187	216	219	java/lang/IllegalStateException
    //   206	235	238	java/lang/IllegalStateException
    //   242	266	269	java/lang/IllegalStateException
    //   254	283	286	java/lang/IllegalStateException
    //   273	302	305	java/lang/IllegalStateException
    //   395	413	413	java/lang/IllegalStateException
  }
  
  protected boolean c(String paramString) {
    return paramString.startsWith("armor");
  }
  
  private static IllegalStateException b(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\bp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */