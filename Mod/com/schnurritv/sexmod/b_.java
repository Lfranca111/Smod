package com.schnurritv.sexmod;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.SoundKeyframeEvent;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.resource.GeckoLibCache;
import software.bernie.geckolib3.util.MatrixStack;

public class b_ extends bI implements aI {
  public static final EyeAndKoboldColor au = EyeAndKoboldColor.PURPLE;
  
  public static final DataParameter<Float> av = EntityDataManager.func_187226_a(b_.class, DataSerializers.field_187193_c).func_187156_b().func_187161_a(122);
  
  boolean at = false;
  
  boolean as = true;
  
  boolean aw = false;
  
  int ax = 0;
  
  protected b_(World paramWorld) {
    super(paramWorld);
  }
  
  public b_(World paramWorld, UUID paramUUID) {
    super(paramWorld, paramUUID);
  }
  
  protected void func_70088_a() {
    super.func_70088_a();
    EyeAndKoboldColor eyeAndKoboldColor = EyeAndKoboldColor.values()[func_70681_au().nextInt((EyeAndKoboldColor.values()).length)];
    this.p.func_187214_a(am, new BlockPos(eyeAndKoboldColor.getMainColor()));
    this.p.func_187214_a(an, au.name());
    this.p.func_187214_a(av, Float.valueOf(0.0F));
  }
  
  public AxisAlignedBB a(EntityPlayer paramEntityPlayer) {
    float f1 = 0.6F;
    float f2 = 0.9F;
    float f3 = f1 / 2.0F;
    return new AxisAlignedBB(paramEntityPlayer.field_70165_t - f3, paramEntityPlayer.field_70163_u, paramEntityPlayer.field_70161_v - f3, paramEntityPlayer.field_70165_t + f3, paramEntityPlayer.field_70163_u + f2, paramEntityPlayer.field_70161_v + f3);
  }
  
  public void a(List<Integer> paramList) {
    StringBuilder stringBuilder = new StringBuilder();
    for (byte b = 0; b < paramList.size(); b++) {
      int i = ((Integer)paramList.get(b)).intValue();
      try {
        switch (b) {
          case 0:
            this.p.func_187227_b(av, Float.valueOf(i / 100.0F * 0.25F));
            break;
          case 1:
            this.p.func_187227_b(an, EyeAndKoboldColor.values()[i].toString());
            break;
          case 2:
            this.p.func_187227_b(am, new BlockPos(EyeAndKoboldColor.values()[i].getMainColor()));
            break;
          default:
            br.c(stringBuilder, i);
            break;
        } 
      } catch (RuntimeException runtimeException) {
        throw c(null);
      } 
    } 
    try {
      this.p.func_187227_b(ao, stringBuilder.toString());
      if (this.field_70170_p.field_72995_K)
        bT.d(); 
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
  }
  
  public ArrayList<Integer> j() {
    ArrayList<Integer> arrayList = new ArrayList();
    arrayList.add(Integer.valueOf(Math.round(((Float)this.p.func_187225_a(av)).floatValue() * 100.0F / 0.25F)));
    arrayList.add(Integer.valueOf(EyeAndKoboldColor.indexOf(EyeAndKoboldColor.safeValueOf((String)this.p.func_187225_a(an)))));
    arrayList.add(Integer.valueOf(EyeAndKoboldColor.indexOf(EyeAndKoboldColor.safeValueOf((Vec3i)this.p.func_187225_a(am)))));
    return arrayList;
  }
  
  protected String a(StringBuilder paramStringBuilder) {
    br.b(paramStringBuilder, 8);
    br.b(paramStringBuilder, 3);
    br.b(paramStringBuilder);
    br.b(paramStringBuilder);
    br.a(paramStringBuilder, 2);
    br.a(paramStringBuilder, 2);
    br.a(paramStringBuilder, 1);
    br.a(paramStringBuilder, 1);
    return paramStringBuilder.toString();
  }
  
  public ArrayList<Integer> J() {
    return new b();
  }
  
  protected void k() {
    bT.d();
    bJ.c();
  }
  
  public float e() {
    float f = 0.25F - ((Float)this.p.func_187225_a(av)).floatValue();
    return 1.4F - f;
  }
  
  public void b(String paramString, UUID paramUUID) {
    try {
      if ("anal".equals(paramString)) {
        d(paramUUID);
        c(m.KOBOLD_ANAL_START);
        a(L(), m.KOBOLD_ANAL_START);
        c(0);
      } 
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    try {
      if ("oral".equals(paramString)) {
        d(paramUUID);
        c(m.STARTBLOWJOB);
        a(L(), m.STARTBLOWJOB);
        c(0);
      } 
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    try {
      if ("mating".equals(paramString)) {
        d(paramUUID);
        c(m.MATING_PRESS_START);
        a(L(), m.MATING_PRESS_START);
        c(0);
      } 
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
  }
  
  @SideOnly(Side.CLIENT)
  public boolean a(EntityPlayer paramEntityPlayer) {
    Minecraft.func_71410_x().func_147108_a(new X(this, paramEntityPlayer, new String[] { "anal", "oral", "mating" }, null, false));
    return true;
  }
  
  public boolean a() {
    Block block = this.field_70170_p.func_180495_p(func_180425_c().func_177982_a(0, 1, 0)).func_177230_c();
    try {
    
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    return !block.func_176205_b((IBlockAccess)this.field_70170_p, func_180425_c().func_177982_a(0, 1, 0));
  }
  
  protected MatrixStack a(MatrixStack paramMatrixStack) {
    float f = 0.25F - ((Float)this.p.func_187225_a(av)).floatValue();
    paramMatrixStack.scale(1.0F - f, 1.0F - f, 1.0F - f);
    return paramMatrixStack;
  }
  
  protected float b(float paramFloat) {
    float f = 1.0F - 0.25F - ((Float)this.p.func_187225_a(av)).floatValue();
    return paramFloat * f;
  }
  
  public o b(int paramInt) {
    return new cZ();
  }
  
  public String a(int paramInt) {
    return "textures/entity/kobold/hand.png";
  }
  
  public Vec3i c(int paramInt) {
    try {
      return EyeAndKoboldColor.valueOf((String)this.p.func_187225_a(an)).getMainColor();
    } catch (Exception exception) {
      exception.printStackTrace();
      return super.c(paramInt);
    } 
  }
  
  @Nullable
  protected m b(m paramm) {
    try {
      if (paramm == m.SUCKBLOWJOB_BLINK)
        return m.THRUSTBLOWJOB; 
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    try {
      if (paramm == m.KOBOLD_ANAL_SLOW)
        return m.KOBOLD_ANAL_FAST; 
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    return null;
  }
  
  protected m a(m paramm) {
    try {
      if (paramm != m.THRUSTBLOWJOB) {
        try {
          if (paramm == m.SUCKBLOWJOB_BLINK)
            return m.CUMBLOWJOB; 
        } catch (RuntimeException runtimeException) {
          throw c(null);
        } 
      } else {
        return m.CUMBLOWJOB;
      } 
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    try {
      if (paramm != m.KOBOLD_ANAL_SLOW) {
        try {
          if (paramm == m.KOBOLD_ANAL_FAST)
            return m.KOBOLD_ANAL_CUM; 
        } catch (RuntimeException runtimeException) {
          throw c(null);
        } 
      } else {
        return m.KOBOLD_ANAL_CUM;
      } 
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    try {
      if (paramm != m.MATING_PRESS_HARD)
        try {
          return (paramm != m.MATING_PRESS_SOFT) ? null : m.MATING_PRESS_CUM;
        } catch (RuntimeException runtimeException) {
          throw c(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    return m.MATING_PRESS_CUM;
  }
  
  public void c(m paramm) {
    m m1 = o();
    try {
      if (m1 == m.MATING_PRESS_CUM)
        try {
          if (paramm != m.MATING_PRESS_SOFT) {
            try {
              if (paramm == m.MATING_PRESS_HARD)
                return; 
            } catch (RuntimeException runtimeException) {
              throw c(null);
            } 
          } else {
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw c(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    try {
      if (m1 == m.KOBOLD_ANAL_CUM)
        try {
          if (paramm != m.KOBOLD_ANAL_SLOW) {
            try {
              if (paramm == m.KOBOLD_ANAL_FAST)
                return; 
            } catch (RuntimeException runtimeException) {
              throw c(null);
            } 
          } else {
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw c(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    try {
      if (m1 == m.CUMBLOWJOB)
        try {
          if (paramm != m.SUCKBLOWJOB) {
            try {
              if (paramm == m.THRUSTBLOWJOB)
                return; 
            } catch (RuntimeException runtimeException) {
              throw c(null);
            } 
          } else {
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw c(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    super.c(paramm);
  }
  
  protected <E extends software.bernie.geckolib3.core.IAnimatable> PlayState a(AnimationEvent<E> paramAnimationEvent) {
    try {
      if (this.field_70170_p instanceof com.c)
        return PlayState.STOP; 
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    float f = 0.25F - ((Float)func_184212_Q().func_187225_a(b3.aG)).floatValue();
    (GeckoLibCache.getInstance()).parser.setValue("size", f);
    String str = paramAnimationEvent.getController().getName();
    byte b = -1;
    try {
      switch (str.hashCode()) {
        case 3128418:
          if (str.equals("eyes"))
            b = 0; 
          break;
        case -103677777:
          if (str.equals("movement"))
            b = 1; 
          break;
        case -1422950858:
          if (str.equals("action"))
            b = 2; 
          break;
      } 
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    try {
      switch (b) {
        case 0:
          try {
            if (o() == m.NULL) {
              try {
                if ((o()).autoBlink) {
                  a("animation.kobold.blink", true, paramAnimationEvent);
                  break;
                } 
                a("animation.kobold.null", true, paramAnimationEvent);
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              break;
            } 
          } catch (RuntimeException runtimeException) {
            throw c(null);
          } 
          a("animation.kobold.null", true, paramAnimationEvent);
        case 1:
          try {
            if (o() != m.NULL) {
              a("animation.kobold.null", true, paramAnimationEvent);
              break;
            } 
          } catch (RuntimeException runtimeException) {
            throw c(null);
          } 
          try {
            if (this.Z) {
              a("animation.kobold.sit", true, paramAnimationEvent);
              break;
            } 
          } catch (RuntimeException runtimeException) {
            throw c(null);
          } 
          try {
            if (this.q.getCurrentAnimation() != null)
              try {
                if ((this.q.getCurrentAnimation()).animationName.contains("fly"))
                  try {
                    if (this.ag) {
                      try {
                      
                      } catch (RuntimeException runtimeException) {
                        throw c(null);
                      } 
                      this.at = !this.at;
                    } 
                  } catch (RuntimeException runtimeException) {
                    throw c(null);
                  }  
              } catch (RuntimeException runtimeException) {
                throw c(null);
              }  
          } catch (RuntimeException runtimeException) {
            throw c(null);
          } 
          try {
            if (!this.ag) {
              try {
              
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              a("animation.kobold.fly" + (this.at ? "2" : ""), true, paramAnimationEvent);
              break;
            } 
          } catch (RuntimeException runtimeException) {
            throw c(null);
          } 
          try {
            if (Math.abs(this.Y.x) + Math.abs(this.Y.y) > 0.0F) {
              try {
                if (this.ai) {
                  this.q.setAnimationSpeed(1.2000000476837158D);
                  a("animation.kobold.run", true, paramAnimationEvent);
                  break;
                } 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              try {
                if (this.Y.y >= -0.1F) {
                  this.q.setAnimationSpeed(2.0D);
                  a("animation.kobold.walk", true, paramAnimationEvent);
                  break;
                } 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              this.q.setAnimationSpeed(1.75D);
              a("animation.kobold.backwards_walk", true, paramAnimationEvent);
              break;
            } 
          } catch (RuntimeException runtimeException) {
            throw c(null);
          } 
          a("animation.kobold.idle", true, paramAnimationEvent);
          break;
        case 2:
          try {
            String str1;
            String str2;
            switch (a.a[o().ordinal()]) {
              case 1:
                a("animation.kobold.null", true, paramAnimationEvent);
                break;
              case 2:
                a("animation.kobold.strip", false, paramAnimationEvent);
                break;
              case 3:
                a("animation.kobold.attack" + this.T, false, paramAnimationEvent);
                break;
              case 4:
                a("animation.kobold.bowcharge", false, paramAnimationEvent);
                break;
              case 5:
                a("animation.kobold.sit", true, paramAnimationEvent);
                break;
              case 6:
                a("animation.kobold.fall_tree", true, paramAnimationEvent);
                break;
              case 7:
                a("animation.kobold.paymentBackpack", true, paramAnimationEvent);
                break;
              case 8:
                a("animation.kobold.blowjobStart", false, paramAnimationEvent);
                break;
              case 9:
                try {
                
                } catch (RuntimeException runtimeException) {
                  throw c(null);
                } 
                str1 = this.as ? "R" : "L";
                try {
                
                } catch (RuntimeException runtimeException) {
                  throw c(null);
                } 
                str2 = this.aw ? "Switch" : "";
                a("animation.kobold.blowjobSlow" + str1 + str2, true, paramAnimationEvent);
                break;
              case 10:
                a("animation.kobold.blowjobFast", true, paramAnimationEvent);
                break;
              case 11:
                a("animation.kobold.blowjobCum", false, paramAnimationEvent);
                break;
              case 12:
                a("animation.kobold.analStart", false, paramAnimationEvent);
                break;
              case 13:
                a("animation.kobold.analSoft", true, paramAnimationEvent);
                break;
              case 14:
                a("animation.kobold.analHard", true, paramAnimationEvent);
                break;
              case 15:
                a("animation.kobold.analCum", true, paramAnimationEvent);
                break;
              case 16:
                a("animation.kobold.sleep", true, paramAnimationEvent);
                break;
              case 17:
                a("animation.kobold.mating_press_start", false, paramAnimationEvent);
                break;
              case 18:
                a("animation.kobold.mating_press_soft", true, paramAnimationEvent);
                break;
              case 19:
                a("animation.kobold.mating_press_hard", true, paramAnimationEvent);
                break;
              case 20:
                a("animation.kobold.mating_press_cum", true, paramAnimationEvent);
                break;
            } 
          } catch (RuntimeException runtimeException) {
            throw c(null);
          } 
          break;
      } 
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    return PlayState.CONTINUE;
  }
  
  void b(SoundEvent paramSoundEvent) {
    b(paramSoundEvent, 1.0F);
  }
  
  void b(SoundEvent[] paramArrayOfSoundEvent) {
    b(paramArrayOfSoundEvent, 1.0F);
  }
  
  void b(SoundEvent[] paramArrayOfSoundEvent, float paramFloat) {
    b(paramArrayOfSoundEvent[func_70681_au().nextInt(paramArrayOfSoundEvent.length)], paramFloat);
  }
  
  void b(SoundEvent paramSoundEvent, float paramFloat) {
    float f1 = 0.25F - ((Float)this.p.func_187225_a(av)).floatValue();
    double d = (f1 / 0.25F);
    float f2 = (float)aH.b(0.8999999761581421D, 1.100000023841858D, d);
    a(paramSoundEvent, paramFloat, f2);
  }
  
  @SideOnly(Side.CLIENT)
  public void registerControllers(AnimationData paramAnimationData) {
    try {
      super.registerControllers(paramAnimationData);
      if (this.k == null)
        S(); 
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    AnimationController.ISoundListener iSoundListener = paramSoundKeyframeEvent -> {
        String str = paramSoundKeyframeEvent.sound;
        byte b = -1;
        try {
          switch (str.hashCode()) {
            case -1961942550:
              if (str.equals("attackDone"))
                b = 0; 
              break;
            case -1540620298:
              if (str.equals("paymentMSG1"))
                b = 1; 
              break;
            case 3443919:
              if (str.equals("plob"))
                b = 2; 
              break;
            case 403702091:
              if (str.equals("blackScreen"))
                b = 3; 
              break;
            case -1540860248:
              if (str.equals("paymentDone"))
                b = 4; 
              break;
            case 1272160711:
              if (str.equals("blowjobStartMSG1"))
                b = 5; 
              break;
            case 1272160712:
              if (str.equals("blowjobStartMSG2"))
                b = 6; 
              break;
            case 1259653724:
              if (str.equals("lipsound"))
                b = 7; 
              break;
            case 110550847:
              if (str.equals("touch"))
                b = 8; 
              break;
            case 1271920761:
              if (str.equals("blowjobStartDone"))
                b = 9; 
              break;
            case -889473228:
              if (str.equals("switch"))
                b = 10; 
              break;
            case 1611717615:
              if (str.equals("endSwitch"))
                b = 11; 
              break;
            case 1077887465:
              if (str.equals("blowjobFastDone"))
                b = 12; 
              break;
            case 1121200173:
              if (str.equals("cumLoud"))
                b = 13; 
              break;
            case 402251961:
              if (str.equals("cumQuiet"))
                b = 14; 
              break;
            case 153907237:
              if (str.equals("analCumDone"))
                b = 15; 
              break;
            case 2094332690:
              if (str.equals("blowjobCumDone"))
                b = 16; 
              break;
            case 538866892:
              if (str.equals("analStartDone"))
                b = 17; 
              break;
            case 1402854725:
              if (str.equals("analStartCam"))
                b = 18; 
              break;
            case 809204182:
              if (str.equals("pounding"))
                b = 19; 
              break;
            case -1665766456:
              if (str.equals("analFastRapid"))
                b = 20; 
              break;
            case -1026028358:
              if (str.equals("analDone"))
                b = 21; 
              break;
            case -1025922525:
              if (str.equals("analHard"))
                b = 22; 
              break;
            case -1025581726:
              if (str.equals("analSoft"))
                b = 23; 
              break;
            case 98875:
              if (str.equals("cum"))
                b = 24; 
              break;
            case -1246024133:
              if (str.equals("giggle"))
                b = 25; 
              break;
            case 3357007:
              if (str.equals("moan"))
                b = 26; 
              break;
            case -316463951:
              if (str.equals("moanMating"))
                b = 27; 
              break;
            case 201728403:
              if (str.equals("analHardMSG1"))
                b = 28; 
              break;
            case -1008684777:
              if (str.equals("orgasm"))
                b = 29; 
              break;
            case -1380923296:
              if (str.equals("breath"))
                b = 30; 
              break;
            case 103048:
              if (str.equals("haa"))
                b = 31; 
              break;
            case -1598910135:
              if (str.equals("interested"))
                b = 32; 
              break;
            case 119524:
              if (str.equals("yep"))
                b = 33; 
              break;
            case -1388060265:
              if (str.equals("bjmoan"))
                b = 34; 
              break;
            case -888451209:
              if (str.equals("blowjobStartbreath"))
                b = 35; 
              break;
            case 791865837:
              if (str.equals("matingCam"))
                b = 36; 
              break;
            case 2073184843:
              if (str.equals("mating_press_startDone"))
                b = 37; 
              break;
            case 1913550566:
              if (str.equals("mating_press_hardDone"))
                b = 38; 
              break;
            case 2118446816:
              if (str.equals("mating_press_softReady"))
                b = 39; 
              break;
            case -796855617:
              if (str.equals("mating_press_hardReady"))
                b = 40; 
              break;
            case -2015095026:
              if (str.equals("mating_cum_cam"))
                b = 41; 
              break;
            case -1349304506:
              if (str.equals("cumMsg"))
                b = 42; 
              break;
            case 1178966372:
              if (str.equals("mating_press_cumDone"))
                b = 43; 
              break;
          } 
        } catch (RuntimeException runtimeException) {
          throw c(null);
        } 
        try {
          EntityPlayerSP entityPlayerSP;
          Vec3d vec3d1;
          int i;
          Vec3d vec3d2;
          switch (b) {
            case 0:
              try {
                if (++this.T == 3)
                  this.T = 0; 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              break;
            case 1:
              a(n(), "I'd like to use ur services owo");
              a(L.MISC_PLOB);
              break;
            case 2:
              a(L.MISC_PLOB);
              break;
            case 3:
              try {
                if (k())
                  bd.b(); 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              break;
            case 4:
              try {
                if (k())
                  q(); 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              break;
            case 5:
              try {
                if (!k())
                  break; 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              entityPlayerSP = (Minecraft.func_71410_x()).field_71439_g;
              vec3d1 = aH.a(new Vec3d(0.0D, 0.625D - entityPlayerSP.func_70047_e(), -1.0D), s().floatValue() + 180.0F);
              aV.a.sendToServer(new an(n().toString(), I().func_178787_e(vec3d1), s().floatValue() + 180.0F, 0.0F));
              break;
            case 6:
              try {
                if (!k())
                  break; 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              entityPlayerSP = (Minecraft.func_71410_x()).field_71439_g;
              vec3d1 = aH.a(new Vec3d(0.5D, 0.5D - entityPlayerSP.func_70047_e(), -0.6875D), s().floatValue() + 180.0F);
              aV.a.sendToServer(new an(n().toString(), I().func_178787_e(vec3d1), s().floatValue() + 180.0F - 40.0F, 0.0F));
              break;
            case 7:
              try {
                if (func_70681_au().nextBoolean()) {
                  a(L.GIRLS_ALLIE_LIPSOUND, 1.5F);
                } else {
                  a(L.GIRLS_JENNY_LIPSOUND, 1.5F);
                } 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              cG.a(0.019999999552965164D);
              break;
            case 8:
              a(L.MISC_TOUCH);
              break;
            case 9:
              try {
                c(m.SUCKBLOWJOB_BLINK);
                this.aw = false;
                this.as = true;
                if (k())
                  cG.d(); 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              break;
            case 10:
              this.aw = func_70681_au().nextBoolean();
              this.k.clearAnimationCache();
              break;
            case 11:
              try {
                this.aw = false;
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              this.as = !this.as;
              this.k.clearAnimationCache();
              break;
            case 12:
              try {
                if (!k())
                  break; 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              try {
                if (!aK.b)
                  c(m.SUCKBLOWJOB_BLINK); 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              break;
            case 13:
              a(L.MISC_SMALLINSERTS, 3.0F);
              break;
            case 14:
              a(L.MISC_SMALLINSERTS, 1.5F);
              break;
            case 15:
            case 16:
              try {
                if (k()) {
                  i();
                  cG.a();
                } 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              break;
            case 17:
              try {
                c(m.KOBOLD_ANAL_SLOW);
                if (k())
                  cG.d(); 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              break;
            case 18:
              try {
                if (!k())
                  break; 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              entityPlayerSP = (Minecraft.func_71410_x()).field_71439_g;
              vec3d1 = aH.a(new Vec3d(0.0D, 0.5625D - entityPlayerSP.func_70047_e(), 0.5625D), s().floatValue() + 180.0F);
              aV.a.sendToServer(new an(n().toString(), I().func_178787_e(vec3d1), s().floatValue(), 0.0F));
              break;
            case 19:
              a(L.MISC_POUNDING);
              break;
            case 20:
              try {
                if (!k())
                  break; 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              try {
                if (!aK.b)
                  break; 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              try {
                if (o() == m.KOBOLD_ANAL_FAST) {
                  p();
                  break;
                } 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              c(m.KOBOLD_ANAL_FAST);
              break;
            case 21:
              try {
                if (o() == m.KOBOLD_ANAL_FAST)
                  c(m.KOBOLD_ANAL_SLOW); 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              break;
            case 22:
              try {
                if (k())
                  cG.a(0.03999999910593033D); 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              break;
            case 23:
              try {
                if (k())
                  cG.a(0.019999999552965164D); 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              break;
            case 24:
              a(L.MISC_SMALLINSERTS, 2.0F);
              break;
            case 25:
              b(L.GIRLS_KOBOLD_GIGGLE);
              break;
            case 26:
              b(L.GIRLS_KOBOLD_MOAN);
              break;
            case 27:
              try {
                this.ax--;
                if (this.ax <= 0) {
                  this.ax = 3;
                  b(L.GIRLS_KOBOLD_MOAN);
                } 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              break;
            case 28:
              try {
                this.ax--;
                if (this.ax <= 0) {
                  this.ax = 4;
                  b(L.GIRLS_KOBOLD_MOAN);
                } 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              break;
            case 29:
              b(L.GIRLS_KOBOLD_ORGASM);
              break;
            case 30:
              b(L.GIRLS_KOBOLD_LIGHTBREATHING, 0.5F);
              break;
            case 31:
              b(L.GIRLS_KOBOLD_HAA, 0.7F);
              break;
            case 32:
              b(L.GIRLS_KOBOLD_INTERESTED);
              break;
            case 33:
              b(L.GIRLS_KOBOLD_YEP);
              break;
            case 34:
              b(L.a(L.GIRLS_KOBOLD_BJMOAN));
              break;
            case 35:
              i = func_70681_au().nextInt(3);
              b(L.GIRLS_KOBOLD_LIGHTBREATHING[i]);
              break;
            case 36:
              try {
                if (!k())
                  break; 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              entityPlayerSP = (Minecraft.func_71410_x()).field_71439_g;
              vec3d2 = new Vec3d(0.0D, 0.4375D - ((EntityPlayer)entityPlayerSP).eyeHeight, -0.6875D);
              vec3d2 = aH.a(vec3d2, s().floatValue() + 180.0F);
              vec3d2 = vec3d2.func_178787_e(I());
              aV.a.sendToServer(new an(entityPlayerSP.getPersistentID().toString(), vec3d2, s().floatValue() + 180.0F, 10.0F));
              break;
            case 37:
              try {
                if (k())
                  cG.d(); 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
            case 38:
              try {
                if (k())
                  c(m.MATING_PRESS_SOFT); 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              break;
            case 39:
              try {
                if (k())
                  cG.a(0.03999999910593033D); 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              try {
                if (k())
                  try {
                    if (aK.b)
                      c(m.MATING_PRESS_HARD); 
                  } catch (RuntimeException runtimeException) {
                    throw c(null);
                  }  
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              break;
            case 40:
              try {
                if (k())
                  cG.a(0.03999999910593033D); 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              try {
                if (k())
                  try {
                    if (aK.b)
                      p(); 
                  } catch (RuntimeException runtimeException) {
                    throw c(null);
                  }  
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              break;
            case 41:
              try {
                if (!k())
                  break; 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              entityPlayerSP = (Minecraft.func_71410_x()).field_71439_g;
              vec3d2 = new Vec3d(0.0D, 1.1875D - ((EntityPlayer)entityPlayerSP).eyeHeight, 0.125D);
              vec3d2 = aH.a(vec3d2, s().floatValue() + 180.0F);
              vec3d2 = vec3d2.func_178787_e(I());
              aV.a.sendToServer(new an(entityPlayerSP.getPersistentID().toString(), vec3d2, s().floatValue() + 180.0F, 70.0F));
              break;
            case 42:
              b("I.. hope I am satisfying you sir");
              b(L.GIRLS_KOBOLD_SAD[func_70681_au().nextInt(1)]);
              break;
            case 43:
              try {
                if (k())
                  i(); 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              break;
          } 
        } catch (RuntimeException runtimeException) {
          throw c(null);
        } 
      };
    this.q.transitionLengthTicks = 3.0D;
    this.k.registerSoundListener(iSoundListener);
    paramAnimationData.addAnimationController(this.k);
    paramAnimationData.addAnimationController(this.q);
    paramAnimationData.addAnimationController(this.o);
  }
  
  private static RuntimeException c(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  class b extends ArrayList<Integer> {
    b() {
      add(Integer.valueOf(101));
      add(Integer.valueOf((EyeAndKoboldColor.values()).length));
      add(Integer.valueOf((EyeAndKoboldColor.values()).length));
      add(Integer.valueOf(8));
      add(Integer.valueOf(3));
      add(Integer.valueOf(101));
      add(Integer.valueOf(101));
      add(Integer.valueOf(3));
      add(Integer.valueOf(3));
      add(Integer.valueOf(4));
      add(Integer.valueOf(2));
    }
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\b_.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */