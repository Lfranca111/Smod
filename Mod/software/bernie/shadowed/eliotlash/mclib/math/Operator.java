/*    */ package software.bernie.shadowed.eliotlash.mclib.math;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Operator
/*    */   implements IValue
/*    */ {
/*    */   public Operation operation;
/*    */   public IValue a;
/*    */   public IValue b;
/*    */   
/*    */   public Operator(Operation op, IValue a, IValue b) {
/* 15 */     this.operation = op;
/* 16 */     this.a = a;
/* 17 */     this.b = b;
/*    */   }
/*    */ 
/*    */   
/*    */   public double get() {
/* 22 */     return this.operation.calculate(this.a.get(), this.b.get());
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 27 */     return this.a.toString() + " " + this.operation.sign + " " + this.b.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.8.0.jar!\software\bernie\shadowed\eliotlash\mclib\math\Operator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */