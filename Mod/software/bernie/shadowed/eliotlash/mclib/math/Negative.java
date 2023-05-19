/*    */ package software.bernie.shadowed.eliotlash.mclib.math;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Negative
/*    */   implements IValue
/*    */ {
/*    */   public IValue value;
/*    */   
/*    */   public Negative(IValue value) {
/* 12 */     this.value = value;
/*    */   }
/*    */ 
/*    */   
/*    */   public double get() {
/* 17 */     return -this.value.get();
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 22 */     return "-" + this.value.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\software\bernie\shadowed\eliotlash\mclib\math\Negative.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */