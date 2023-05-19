package com.schnurritv.sexmod;

import java.util.HashMap;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.IAnimatableModel;
import software.bernie.geckolib3.core.processor.AnimationProcessor;
import software.bernie.geckolib3.core.processor.IBone;

public class c_<T extends IAnimatable> extends AnimationProcessor<T> {
  HashMap<String, IBone> a = new HashMap<>();
  
  public c_(IAnimatableModel paramIAnimatableModel) {
    super(paramIAnimatableModel);
  }
  
  public IBone getBone(String paramString) {
    return this.a.get(paramString);
  }
  
  public void registerModelRenderer(IBone paramIBone) {
    super.registerModelRenderer(paramIBone);
    this.a.put(paramIBone.getName(), paramIBone);
  }
  
  public void clearModelRendererList() {
    super.clearModelRendererList();
    this.a.clear();
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\c_.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */