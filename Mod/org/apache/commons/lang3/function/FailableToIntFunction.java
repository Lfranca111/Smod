/*    */ package org.apache.commons.lang3.function;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @FunctionalInterface
/*    */ public interface FailableToIntFunction<T, E extends Throwable>
/*    */ {
/*    */   public static final FailableToIntFunction NOP = t -> 0;
/*    */   
/*    */   int applyAsInt(T paramT) throws E;
/*    */   
/*    */   static <T, E extends Throwable> FailableToIntFunction<T, E> nop() {
/* 44 */     return NOP;
/*    */   }
/*    */ }


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\org\apache\commons\lang3\function\FailableToIntFunction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */