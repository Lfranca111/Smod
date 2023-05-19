package com.schnurritv.sexmod;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class af extends ModelBase {
  private final ModelRenderer e = new ModelRenderer(this);
  
  private final ModelRenderer a;
  
  private final ModelRenderer d;
  
  private final ModelRenderer c;
  
  private final ModelRenderer b;
  
  public af() {
    this.e.func_78793_a(0.0F, 0.0F, 0.0F);
    this.e.field_78804_l.add(new ModelBox(this.e, 0, 16, -3.0F, 17.0F, -3.0F, 6, 6, 6, 0.0F, true));
    this.a = new ModelRenderer(this);
    this.a.func_78793_a(0.0F, 0.0F, 0.0F);
    this.a.field_78804_l.add(new ModelBox(this.a, 32, 0, 1.3F, 18.0F, -3.5F, 2, 2, 2, 0.0F, true));
    this.d = new ModelRenderer(this);
    this.d.func_78793_a(0.0F, 0.0F, 0.0F);
    this.d.field_78804_l.add(new ModelBox(this.d, 32, 4, -3.3F, 18.0F, -3.5F, 2, 2, 2, 0.0F, true));
    this.c = new ModelRenderer(this);
    this.c.func_78793_a(0.0F, 0.0F, 0.0F);
    this.c.field_78804_l.add(new ModelBox(this.c, 32, 8, -1.0F, 21.0F, -3.5F, 1, 1, 1, 0.0F, true));
    this.b = new ModelRenderer(this);
    this.b.func_78793_a(-0.5F, 0.0F, 0.1F);
    ModelRenderer modelRenderer1 = new ModelRenderer(this);
    modelRenderer1.func_78793_a(2.0F, 20.7406F, 4.0504F);
    this.b.func_78792_a(modelRenderer1);
    a(modelRenderer1, 1.0908F, 0.0F, 0.0F);
    modelRenderer1.field_78804_l.add(new ModelBox(modelRenderer1, 10, 11, -2.5F, 0.0F, 0.0F, 2, 2, 1, 0.0F, false));
    ModelRenderer modelRenderer2 = new ModelRenderer(this);
    modelRenderer2.func_78793_a(2.0F, 19.9214F, 3.4768F);
    this.b.func_78792_a(modelRenderer2);
    a(modelRenderer2, 0.6109F, 0.0F, 0.0F);
    modelRenderer2.field_78804_l.add(new ModelBox(modelRenderer2, 10, 11, -3.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));
    ModelRenderer modelRenderer3 = new ModelRenderer(this);
    modelRenderer3.func_78793_a(2.0F, 19.0074F, 3.0643F);
    this.b.func_78792_a(modelRenderer3);
    a(modelRenderer3, 0.3491F, 0.0F, 0.0F);
    modelRenderer3.field_78804_l.add(new ModelBox(modelRenderer3, 10, 11, -4.0F, 0.0F, 0.075F, 5, 1, 1, 0.0F, false));
    ModelRenderer modelRenderer4 = new ModelRenderer(this);
    modelRenderer4.func_78793_a(0.0F, 17.925F, 3.5F);
    this.b.func_78792_a(modelRenderer4);
    a(modelRenderer4, 0.1309F, 0.0F, 0.0F);
    modelRenderer4.field_78804_l.add(new ModelBox(modelRenderer4, 10, 11, -3.0F, -1.0F, -0.5F, 7, 2, 1, 0.0F, false));
  }
  
  public void func_78088_a(Entity paramEntity, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    this.e.func_78785_a(paramFloat6);
    this.a.func_78785_a(paramFloat6);
    this.d.func_78785_a(paramFloat6);
    this.c.func_78785_a(paramFloat6);
    this.b.func_78785_a(paramFloat6);
  }
  
  public void a(ModelRenderer paramModelRenderer, float paramFloat1, float paramFloat2, float paramFloat3) {
    paramModelRenderer.field_78795_f = paramFloat1;
    paramModelRenderer.field_78796_g = paramFloat2;
    paramModelRenderer.field_78808_h = paramFloat3;
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\af.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */