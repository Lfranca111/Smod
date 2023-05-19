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
/*    */ @FunctionalInterface
/*    */ public interface FailableObjLongConsumer<T, E extends Throwable>
/*    */ {
/*    */   public static final FailableObjLongConsumer NOP = (t, u) -> {
/*    */     
/*    */     };
/*    */   
/*    */   void accept(T paramT, long paramLong) throws E;
/*    */   
/*    */   static <T, E extends Throwable> FailableObjLongConsumer<T, E> nop() {
/* 44 */     return NOP;
/*    */   }
/*    */ }


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\org\apache\commons\lang3\function\FailableObjLongConsumer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */