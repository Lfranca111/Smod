package com.schnurritv.sexmod;

import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class br extends bS {
  public static final DataParameter<String> G = EntityDataManager.func_187226_a(br.class, DataSerializers.field_187194_d).func_187156_b().func_187161_a(119);
  
  public static final DataParameter<BlockPos> L = EntityDataManager.func_187226_a(br.class, DataSerializers.field_187200_j).func_187156_b().func_187161_a(120);
  
  public static final DataParameter<String> H = EntityDataManager.func_187226_a(br.class, DataSerializers.field_187194_d).func_187156_b().func_187161_a(121);
  
  String K = null;
  
  String I = null;
  
  BlockPos J = null;
  
  protected br(World paramWorld) {
    super(paramWorld);
  }
  
  protected void func_70088_a() {
    try {
      super.func_70088_a();
      if (this.field_70170_p.field_72995_K)
        try {
          if (this.field_70170_p instanceof com.c)
            return; 
        } catch (RuntimeException runtimeException) {
          throw b(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    this.p.func_187214_a(H, a(new StringBuilder()));
  }
  
  public void func_70071_h_() {
    super.func_70071_h_();
    c();
  }
  
  void c() {
    // Byte code:
    //   0: aload_0
    //   1: getfield field_70170_p : Lnet/minecraft/world/World;
    //   4: getfield field_72995_K : Z
    //   7: ifne -> 15
    //   10: return
    //   11: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   14: athrow
    //   15: aload_0
    //   16: getfield p : Lnet/minecraft/network/datasync/EntityDataManager;
    //   19: getstatic com/schnurritv/sexmod/br.G : Lnet/minecraft/network/datasync/DataParameter;
    //   22: invokevirtual func_187225_a : (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
    //   25: checkcast java/lang/String
    //   28: astore_1
    //   29: aload_0
    //   30: getfield p : Lnet/minecraft/network/datasync/EntityDataManager;
    //   33: getstatic com/schnurritv/sexmod/br.H : Lnet/minecraft/network/datasync/DataParameter;
    //   36: invokevirtual func_187225_a : (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
    //   39: checkcast java/lang/String
    //   42: astore_2
    //   43: aload_0
    //   44: getfield p : Lnet/minecraft/network/datasync/EntityDataManager;
    //   47: getstatic com/schnurritv/sexmod/br.L : Lnet/minecraft/network/datasync/DataParameter;
    //   50: invokevirtual func_187225_a : (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
    //   53: checkcast net/minecraft/util/math/BlockPos
    //   56: astore_3
    //   57: aload_0
    //   58: getfield K : Ljava/lang/String;
    //   61: ifnonnull -> 84
    //   64: aload_0
    //   65: aload_1
    //   66: putfield K : Ljava/lang/String;
    //   69: aload_0
    //   70: aload_2
    //   71: putfield I : Ljava/lang/String;
    //   74: aload_0
    //   75: aload_3
    //   76: putfield J : Lnet/minecraft/util/math/BlockPos;
    //   79: return
    //   80: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   83: athrow
    //   84: aload_0
    //   85: getfield I : Ljava/lang/String;
    //   88: aload_2
    //   89: invokevirtual equals : (Ljava/lang/Object;)Z
    //   92: ifeq -> 131
    //   95: aload_0
    //   96: getfield K : Ljava/lang/String;
    //   99: aload_1
    //   100: invokevirtual equals : (Ljava/lang/Object;)Z
    //   103: ifeq -> 131
    //   106: goto -> 113
    //   109: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   112: athrow
    //   113: aload_0
    //   114: getfield J : Lnet/minecraft/util/math/BlockPos;
    //   117: aload_3
    //   118: invokevirtual equals : (Ljava/lang/Object;)Z
    //   121: ifne -> 142
    //   124: goto -> 131
    //   127: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   130: athrow
    //   131: aload_0
    //   132: invokevirtual a : ()V
    //   135: goto -> 142
    //   138: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   141: athrow
    //   142: aload_0
    //   143: aload_1
    //   144: putfield K : Ljava/lang/String;
    //   147: aload_0
    //   148: aload_2
    //   149: putfield I : Ljava/lang/String;
    //   152: aload_0
    //   153: aload_3
    //   154: putfield J : Lnet/minecraft/util/math/BlockPos;
    //   157: return
    // Exception table:
    //   from	to	target	type
    //   0	11	11	java/lang/RuntimeException
    //   57	80	80	java/lang/RuntimeException
    //   84	106	109	java/lang/RuntimeException
    //   95	124	127	java/lang/RuntimeException
    //   113	135	138	java/lang/RuntimeException
  }
  
  protected abstract void a();
  
  protected abstract String a(StringBuilder paramStringBuilder);
  
  public static void c(StringBuilder paramStringBuilder, int paramInt) {
    try {
      if (paramInt < 10)
        paramStringBuilder.append(0); 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    paramStringBuilder.append(paramInt);
    paramStringBuilder.append("-");
  }
  
  public static void a(StringBuilder paramStringBuilder, int paramInt) {
    int i = U.f.nextInt(paramInt + 1);
    try {
      if (i < 10)
        paramStringBuilder.append(0); 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    paramStringBuilder.append(i);
    paramStringBuilder.append("-");
  }
  
  public static void b(StringBuilder paramStringBuilder) {
    double d1 = U.f.nextDouble();
    double d2 = Math.pow(Math.E, -Math.pow(-2.5D + 5.0D * d1, 2.0D));
    String str = String.format("%.2f", new Object[] { Double.valueOf(d2) });
    String[] arrayOfString = str.split("\\.");
    if (arrayOfString.length < 2)
      arrayOfString = str.split(","); 
    str = arrayOfString[1];
    paramStringBuilder.append(str).append("-");
  }
  
  public static void b(StringBuilder paramStringBuilder, int paramInt) {
    int i = U.f.nextInt(paramInt);
    try {
      if (i < 10)
        paramStringBuilder.append(0); 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    paramStringBuilder.append(i);
    paramStringBuilder.append("-");
  }
  
  public static String[] a(bS parambS) {
    return ((String)parambS.func_184212_Q().func_187225_a(H)).split("-");
  }
  
  private static RuntimeException b(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\br.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */