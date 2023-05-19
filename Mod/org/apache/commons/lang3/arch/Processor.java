/*     */ package org.apache.commons.lang3.arch;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Processor
/*     */ {
/*     */   private final Arch arch;
/*     */   private final Type type;
/*     */   
/*     */   public enum Arch
/*     */   {
/*  43 */     BIT_32("32-bit"),
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  48 */     BIT_64("64-bit"),
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  53 */     UNKNOWN("Unknown");
/*     */ 
/*     */ 
/*     */     
/*     */     private final String label;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     Arch(String label) {
/*  63 */       this.label = label;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String getLabel() {
/*  72 */       return this.label;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public enum Type
/*     */   {
/*  91 */     X86,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  96 */     IA_64,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 101 */     PPC,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 106 */     UNKNOWN;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Processor(Arch arch, Type type) {
/* 120 */     this.arch = arch;
/* 121 */     this.type = type;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Arch getArch() {
/* 132 */     return this.arch;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Type getType() {
/* 143 */     return this.type;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean is32Bit() {
/* 152 */     return Arch.BIT_32.equals(this.arch);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean is64Bit() {
/* 161 */     return Arch.BIT_64.equals(this.arch);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isX86() {
/* 170 */     return Type.X86.equals(this.type);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isIA64() {
/* 179 */     return Type.IA_64.equals(this.type);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isPPC() {
/* 188 */     return Type.PPC.equals(this.type);
/*     */   }
/*     */ }


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\org\apache\commons\lang3\arch\Processor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */