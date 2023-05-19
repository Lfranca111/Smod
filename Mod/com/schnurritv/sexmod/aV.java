package com.schnurritv.sexmod;

import com.google.common.base.Predicate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;

public class av extends EntityAINearestAttackableTarget<b3> {
  private final int b;
  
  private final boolean a;
  
  public av(EntityCreature paramEntityCreature, boolean paramBoolean1, boolean paramBoolean2) {
    this(paramEntityCreature, paramBoolean1, false, paramBoolean2);
  }
  
  public av(EntityCreature paramEntityCreature, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    this(paramEntityCreature, 10, paramBoolean1, paramBoolean2, (Predicate)null, paramBoolean3);
  }
  
  public av(EntityCreature paramEntityCreature, int paramInt, boolean paramBoolean1, boolean paramBoolean2, @Nullable Predicate paramPredicate, boolean paramBoolean3) {
    super(paramEntityCreature, b3.class, paramInt, paramBoolean1, paramBoolean2, paramPredicate);
    this.b = paramInt;
    this.a = paramBoolean3;
  }
  
  public boolean func_75250_a() {
    if (this.a) {
      float f = this.field_75299_d.func_70013_c();
      try {
        if (f >= 0.5F)
          return false; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    try {
      if (this.b > 0)
        try {
          if (this.field_75299_d.func_70681_au().nextInt(this.b) != 0)
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    List list = this.field_75299_d.field_70170_p.func_175647_a(this.field_75307_b, func_188511_a(func_111175_f()), this.field_82643_g);
    try {
      if (list.isEmpty())
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    ArrayList<b3> arrayList = new ArrayList();
    for (b3 b3 : list) {
      try {
        if (b3.O())
          arrayList.add(b3); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    try {
      if (arrayList.isEmpty())
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    arrayList.sort((Comparator<? super b3>)this.field_75306_g);
    this.field_75309_a = (EntityLivingBase)arrayList.get(0);
    return true;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\av.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */