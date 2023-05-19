package com.schnurritv.sexmod;

import net.minecraft.entity.Entity;

public class ce extends c7 {
  int j = 0;
  
  int i = 0;
  
  public ce(bS parambS) {
    super(parambS);
  }
  
  public void func_75251_c() {
    super.func_75251_c();
    this.e.field_70747_aH = 0.02F;
  }
  
  protected c7.a c() {
    float f = this.e.func_70032_d((Entity)this.h);
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    boolean bool = (f > 5.0F) ? true : false;
    try {
      if (this.e.n() == null)
        try {
          if (!bool)
            try {
              if (this.b == c7.a.FOLLOW)
                if (++this.j > 60) {
                  bool = false;
                  this.j = 0;
                } else {
                  bool = true;
                }  
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (bool)
        return c7.a.FOLLOW; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return c7.a.IDLE;
  }
  
  protected void a(c7.a parama) {
    double d;
    switch (a.a[parama.ordinal()]) {
      case 1:
        d = this.e.func_70032_d((Entity)this.h);
        try {
          if (this.g.func_111269_d() > d) {
            this.g.func_75499_g();
            this.g.func_75497_a((Entity)this.h, 0.5D);
          } else {
            a();
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        this.i = 300;
        b();
        break;
      case 2:
        b();
        break;
    } 
  }
  
  protected double b() {
    float f1 = this.e.func_70032_d((Entity)this.h);
    float f2 = 0.02F;
    double d = Math.min(0.7D, Math.floor((f1 / 3.0F)) * 0.05D);
    f2 = (float)(f2 + d);
    this.e.field_70747_aH = f2;
    return f2;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\ce.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */