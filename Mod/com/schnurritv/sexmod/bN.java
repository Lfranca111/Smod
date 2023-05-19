package com.schnurritv.sexmod;

import java.lang.reflect.Field;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.IAnimatableModel;
import software.bernie.geckolib3.geo.exception.GeoModelException;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public abstract class bn<T extends IAnimatable> extends AnimatedGeoModel<T> {
  protected bn() {
    try {
      Field field = Class.forName("software.bernie.geckolib3.model.AnimatedGeoModel").getDeclaredField("animationProcessor");
      field.setAccessible(true);
      field.set(this, new c_<>((IAnimatableModel)this));
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public GeoModel getModel(ResourceLocation paramResourceLocation) {
    GeoModel geoModel = super.getModel(paramResourceLocation);
    try {
      if (geoModel == null)
        throw new GeoModelException(paramResourceLocation, "Could not find model."); 
    } catch (GeoModelException geoModelException) {
      throw a(null);
    } 
    getAnimationProcessor().clearModelRendererList();
    for (GeoBone geoBone : geoModel.topLevelBones)
      registerBone(geoBone); 
    return geoModel;
  }
  
  private static GeoModelException a(GeoModelException paramGeoModelException) {
    return paramGeoModelException;
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\bn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */