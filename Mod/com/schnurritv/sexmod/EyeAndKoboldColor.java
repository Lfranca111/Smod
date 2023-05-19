package com.schnurritv.sexmod;

import net.minecraft.util.math.Vec3i;
import net.minecraft.util.text.TextFormatting;

public enum EyeAndKoboldColor {
  GREEN(69, 141, 113, 91, 167, 128, 9, TextFormatting.DARK_GREEN),
  YELLOW(241, 177, 77, 255, 226, 170, 4, TextFormatting.YELLOW),
  RED(230, 27, 57, 253, 232, 239, 14, TextFormatting.RED),
  PURPLE(196, 148, 207, 246, 188, 96, 10, TextFormatting.DARK_PURPLE),
  LIGHT_GREEN(170, 208, 47, 230, 214, 104, 5, TextFormatting.GREEN),
  OLD_BLUE(173, 138, 128, 118, 151, 180, 2, TextFormatting.LIGHT_PURPLE),
  DARK_GREY(92, 92, 110, 198, 193, 165, 7, TextFormatting.DARK_GRAY),
  BROWN(200, 145, 112, 253, 228, 198, 12, TextFormatting.GOLD),
  DARK_BLUE(65, 84, 116, 104, 137, 146, 11, TextFormatting.DARK_BLUE),
  LIGHT_BLUE(100, 163, 206, 138, 235, 242, 3, TextFormatting.DARK_AQUA),
  SILVER(136, 136, 134, 255, 255, 255, 0, TextFormatting.GRAY);
  
  private final Vec3i mainColor;
  
  private final Vec3i secondaryColor;
  
  private final int woolMeta;
  
  private final TextFormatting textColor;
  
  EyeAndKoboldColor(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, TextFormatting paramTextFormatting) {
    this.mainColor = new Vec3i(paramInt1, paramInt2, paramInt3);
    this.secondaryColor = new Vec3i(paramInt4, paramInt5, paramInt6);
    this.woolMeta = paramInt7;
    this.textColor = paramTextFormatting;
  }
  
  public static int indexOf(EyeAndKoboldColor paramEyeAndKoboldColor) {
    byte b = 0;
    for (EyeAndKoboldColor eyeAndKoboldColor : values()) {
      try {
        if (paramEyeAndKoboldColor == eyeAndKoboldColor)
          return b; 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      b++;
    } 
    return b;
  }
  
  public static EyeAndKoboldColor safeValueOf(String paramString) {
    try {
      return valueOf(paramString);
    } catch (IllegalArgumentException illegalArgumentException) {
      return b3.aP;
    } 
  }
  
  public static EyeAndKoboldColor safeValueOf(Vec3i paramVec3i) {
    for (EyeAndKoboldColor eyeAndKoboldColor : values()) {
      try {
        if (paramVec3i.equals(eyeAndKoboldColor.getMainColor()))
          return eyeAndKoboldColor; 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    return b3.aP;
  }
  
  public static EyeAndKoboldColor getColorByWoolId(int paramInt) {
    for (EyeAndKoboldColor eyeAndKoboldColor : values()) {
      try {
        if (eyeAndKoboldColor.getWoolMeta() == paramInt)
          return eyeAndKoboldColor; 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    return b3.aP;
  }
  
  public Vec3i getMainColor() {
    return this.mainColor;
  }
  
  public Vec3i getSecondaryColor() {
    return this.secondaryColor;
  }
  
  public int getWoolMeta() {
    return this.woolMeta;
  }
  
  public TextFormatting getTextColor() {
    return this.textColor;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\EyeAndKoboldColor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */