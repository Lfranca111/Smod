package com.schnurritv.sexmod;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ct extends ModelBase implements o {
  private final ModelRenderer c = new ModelRenderer(this);
  
  private final ModelRenderer b;
  
  private final ModelRenderer a;
  
  public ct() {
    this.c.func_78793_a(-5.0F, 1.5708F, 0.0F);
    this.b = new ModelRenderer(this);
    this.b.func_78793_a(-1.0F, -3.0F, 1.0F);
    this.c.func_78792_a(this.b);
    a(this.b, 0.0F, 1.5708F, 0.0F);
    this.b.field_78804_l.add(new ModelBox(this.b, 0, 0, -1.0F, -3.0F, -1.0F, 2, 6, 2, 0.0F, false));
    this.a = new ModelRenderer(this);
    this.a.func_78793_a(0.0F, 0.0F, 0.0F);
  }
  
  public void func_78088_a(Entity paramEntity, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    this.c.func_78785_a(paramFloat6);
    this.a.func_78785_a(paramFloat6);
  }
  
  public void a(ModelRenderer paramModelRenderer, float paramFloat1, float paramFloat2, float paramFloat3) {
    paramModelRenderer.field_78795_f = paramFloat1;
    paramModelRenderer.field_78796_g = paramFloat2;
    paramModelRenderer.field_78808_h = paramFloat3;
  }
  
  public ModelRenderer a() {
    return this.c;
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\ct.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */