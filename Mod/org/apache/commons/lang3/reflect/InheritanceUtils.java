/*    */ package org.apache.commons.lang3.reflect;
/*    */ 
/*    */ import org.apache.commons.lang3.BooleanUtils;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class InheritanceUtils
/*    */ {
/*    */   public static int distance(Class<?> child, Class<?> parent) {
/* 50 */     if (child == null || parent == null) {
/* 51 */       return -1;
/*    */     }
/*    */     
/* 54 */     if (child.equals(parent)) {
/* 55 */       return 0;
/*    */     }
/*    */     
/* 58 */     Class<?> cParent = child.getSuperclass();
/* 59 */     int d = BooleanUtils.toInteger(parent.equals(cParent));
/*    */     
/* 61 */     if (d == 1) {
/* 62 */       return d;
/*    */     }
/* 64 */     d += distance(cParent, parent);
/* 65 */     return (d > 0) ? (d + 1) : -1;
/*    */   }
/*    */ }


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\org\apache\commons\lang3\reflect\InheritanceUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */