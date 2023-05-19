package com.schnurritv.sexmod;

public enum ah {
  GIRL_SPECIFIC,
  HEAD(0, "customHead"),
  FOOT_L(60, "customShoeL"),
  FOOT_R(80, "customShoeR"),
  HAND_L(100, "customHandL"),
  HAND_R(120, "customHandR"),
  CUSTOM_BONE(140);
  
  public static final String SEPARATOR = "#";
  
  public int buttonIDPlus;
  
  public int buttonIDMinus;
  
  public String boneName = null;
  
  public int iconXPos = 0;
  
  ah(int paramInt1) {
    this.iconXPos = paramInt1;
  }
  
  ah(int paramInt1, String paramString1) {
    this.iconXPos = paramInt1;
    this.boneName = paramString1;
    this.buttonIDPlus = ++U.c;
    this.buttonIDMinus = ++U.c;
  }
  
  public static int a() {
    return (values()).length - 2;
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\ah.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */