package com.schnurritv.sexmod;

import java.util.UUID;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.SoundKeyframeEvent;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;

public class bc extends bo {
  static final double an = 4.0D;
  
  static final double ar = 4.0D;
  
  public float aq = 0.0F;
  
  EntityPlayer ap = null;
  
  boolean al = false;
  
  int ao = 1;
  
  int am = 1;
  
  protected bc(World paramWorld) {
    super(paramWorld);
  }
  
  public bc(World paramWorld, UUID paramUUID) {
    super(paramWorld, paramUUID);
  }
  
  public float e() {
    return 1.9F + this.aq;
  }
  
  public float func_70047_e() {
    return 1.63F;
  }
  
  public boolean v() {
    return false;
  }
  
  public o b(int paramInt) {
    return new j();
  }
  
  public String a(int paramInt) {
    return "textures/entity/allie/hand.png";
  }
  
  public void b(String paramString, UUID paramUUID) {
    try {
      if ("action.names.deepthroat".equals(paramString)) {
        c(m.DEEPTHROAT_START);
        a(L(), m.DEEPTHROAT_START);
        d(paramUUID);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if ("Reverse cowgirl".equals(paramString)) {
        c(m.REVERSE_COWGIRL_START);
        a(0, m.REVERSE_COWGIRL_START);
        d(paramUUID);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public boolean a(EntityPlayer paramEntityPlayer) {
    a(paramEntityPlayer, this, new String[] { "action.names.deepthroat", "Reverse cowgirl" }, false);
    return true;
  }
  
  public void c(m paramm) {
    try {
      if (o() == m.DEEPTHROAT_CUM)
        try {
          if (paramm != m.DEEPTHROAT_FAST) {
            try {
              if (paramm == m.DEEPTHROAT_SLOW)
                return; 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
          } else {
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (o() == m.REVERSE_COWGIRL_CUM)
        try {
          if (paramm != m.REVERSE_COWGIRL_SLOW) {
            try {
              if (paramm != m.REVERSE_COWGIRL_FAST_START) {
                try {
                  if (paramm == m.REVERSE_COWGIRL_FAST_CONTINUES)
                    return; 
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                } 
              } else {
                return;
              } 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
          } else {
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    super.c(paramm);
  }
  
  public boolean p() {
    try {
      switch (a.a[o().ordinal()]) {
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
          return true;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  public void func_70619_bc() {
    try {
      super.func_70619_bc();
      if (d() == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(d());
    try {
      if (entityPlayer != null)
        try {
          if (this.ap == null)
            b(true); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.ap = entityPlayer;
  }
  
  public void func_70071_h_() {
    try {
      super.func_70071_h_();
      if (this.field_70170_p.field_72995_K)
        d(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  @SideOnly(Side.CLIENT)
  void d() {
    try {
      if (this.field_70173_aa % 10 != 0)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    int i = func_70681_au().nextInt(8);
    Vec3d vec3d = a("tail" + i, true, this.field_70177_z).func_178787_e(func_174791_d());
    this.field_70170_p.func_175688_a(EnumParticleTypes.PORTAL, vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c, func_70681_au().nextGaussian() * 0.009999999776482582D, func_70681_au().nextGaussian() * 0.009999999776482582D, func_70681_au().nextGaussian() * 0.009999999776482582D, new int[0]);
  }
  
  public void a() {
    b(true);
  }
  
  public void y() {
    b(false);
  }
  
  protected m b(m paramm) {
    try {
      if (paramm == m.DEEPTHROAT_SLOW)
        return m.DEEPTHROAT_FAST; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramm == m.REVERSE_COWGIRL_SLOW)
        return m.REVERSE_COWGIRL_FAST_START; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return null;
  }
  
  protected m a(m paramm) {
    try {
      if (paramm != m.DEEPTHROAT_FAST) {
        try {
          if (paramm == m.DEEPTHROAT_SLOW)
            return m.DEEPTHROAT_CUM; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } else {
        return m.DEEPTHROAT_CUM;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramm != m.REVERSE_COWGIRL_SLOW)
        try {
          if (paramm != m.REVERSE_COWGIRL_FAST_START)
            try {
              return (paramm != m.REVERSE_COWGIRL_FAST_CONTINUES) ? null : m.REVERSE_COWGIRL_CUM;
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return m.REVERSE_COWGIRL_CUM;
  }
  
  public void registerControllers(AnimationData paramAnimationData) {
    try {
      if (this.k == null)
        S(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
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
            case 1463928904:
              if (str.equals("deepthroat_prepareMSG1"))
                b = 1; 
              break;
            case 1463928905:
              if (str.equals("deepthroat_prepareMSG2"))
                b = 2; 
              break;
            case 1319834923:
              if (str.equals("blackscreen"))
                b = 3; 
              break;
            case 1463688954:
              if (str.equals("deepthroat_prepareDone"))
                b = 4; 
              break;
            case -941330661:
              if (str.equals("deepthroat_fastMSG1"))
                b = 5; 
              break;
            case -941570611:
              if (str.equals("deepthroat_fastDone"))
                b = 6; 
              break;
            case -1201737451:
              if (str.equals("deepthroat_startDone"))
                b = 7; 
              break;
            case 1301227072:
              if (str.equals("deepthroat_slowMSG1"))
                b = 8; 
              break;
            case -1295707140:
              if (str.equals("deepthroat_cumMSG1"))
                b = 9; 
              break;
            case -584662331:
              if (str.equals("cowgirl_cumDone"))
                b = 10; 
              break;
            case -1295947090:
              if (str.equals("deepthroat_cumDone"))
                b = 11; 
              break;
            case 713758766:
              if (str.equals("deepthroat_normal_prepareMSG1"))
                b = 12; 
              break;
            case -1246024133:
              if (str.equals("giggle"))
                b = 13; 
              break;
            case 809204182:
              if (str.equals("pounding"))
                b = 14; 
              break;
            case 3357007:
              if (str.equals("moan"))
                b = 15; 
              break;
            case 108237:
              if (str.equals("mmm"))
                b = 16; 
              break;
            case 109526449:
              if (str.equals("slide"))
                b = 17; 
              break;
            case -1083986192:
              if (str.equals("slowMoan"))
                b = 18; 
              break;
            case -788491030:
              if (str.equals("cowgirlSlowDone"))
                b = 19; 
              break;
            case 968423371:
              if (str.equals("fastMoan"))
                b = 20; 
              break;
            case -1173633360:
              if (str.equals("fastSwitch"))
                b = 21; 
              break;
            case 1534823792:
              if (str.equals("openSexUi"))
                b = 22; 
              break;
            case 98875:
              if (str.equals("cum"))
                b = 23; 
              break;
            case 1019998507:
              if (str.equals("aftermoan"))
                b = 24; 
              break;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        try {
          int i;
          m m;
          switch (b) {
            case 0:
              try {
                if (++this.T == 3)
                  this.T = 0; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 1:
              b(I18n.func_135052_a("allie.dialogue.hihi", new Object[0]));
              a(L.MISC_PLOB[0]);
              break;
            case 2:
              b(I18n.func_135052_a("allie.dialogue.boys", new Object[0]));
              a(L.MISC_PLOB[0]);
              break;
            case 3:
              try {
                if (k())
                  bd.b(); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 4:
              try {
                c(m.DEEPTHROAT_START);
                if (k()) {
                  aV.a.sendToServer(new cS(N(), n(), false, true));
                  this.h = this.field_70177_z + 180.0F;
                  a(0.0D, 0.0D, 1.350000023841858D, 0.0F, 30.0F);
                  cG.c();
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 5:
              try {
                a(L.a(L.GIRLS_ALLIE_BJMOAN));
                if (k()) {
                  cG.d();
                  cG.a(0.03999999910593033D);
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 6:
              try {
                if (k())
                  try {
                    if (!aK.b)
                      c(m.DEEPTHROAT_SLOW); 
                  } catch (RuntimeException runtimeException) {
                    throw a(null);
                  }  
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 7:
              c(m.DEEPTHROAT_SLOW);
              break;
            case 8:
              try {
                a(L.a(L.GIRLS_ALLIE_LIPSOUND));
                if (k()) {
                  cG.d();
                  cG.a(0.019999999552965164D);
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 9:
              a(L.a(L.GIRLS_ALLIE_LIPSOUND));
              a(L.a(L.MISC_CUMINFLATION), 1.5F);
              break;
            case 10:
            case 11:
              try {
                if (k())
                  i(); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 12:
              b(I18n.func_135052_a("allie.dialogue.alright", new Object[0]));
              a(L.a(L.MISC_PLOB));
              break;
            case 13:
              a(L.GIRLS_ALLIE_GIGGLE);
              break;
            case 14:
              a(L.MISC_POUNDING);
              break;
            case 15:
              a(L.GIRLS_ALLIE_MOAN);
              break;
            case 16:
              a(L.a(L.GIRLS_ALLIE_MMM));
              break;
            case 17:
              a(L.MISC_SLIDE, new int[] { 0, 1, 4, 6 });
              break;
            case 18:
              try {
                if (func_70681_au().nextBoolean())
                  a(L.a(L.GIRLS_ALLIE_AHH)); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              try {
                if (k())
                  cG.a(0.019999999552965164D); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 19:
              i = this.ao;
              try {
                do {
                  this.ao = func_70681_au().nextInt(3) + 1;
                } while (this.ao == i);
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 20:
              try {
                if (k())
                  cG.a(0.03999999910593033D); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              try {
                if (!this.al) {
                  a(L.a(L.GIRLS_ALLIE_MOAN));
                  this.al = true;
                  break;
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              this.al = false;
              break;
            case 21:
              try {
                if (!k())
                  break; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              try {
                if (!aK.b)
                  break; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              m = o();
              try {
                if (m == m.REVERSE_COWGIRL_FAST_START) {
                  c(m.REVERSE_COWGIRL_FAST_CONTINUES);
                  break;
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              p();
              i = this.am;
              try {
                do {
                  this.am = func_70681_au().nextInt(3) + 1;
                } while (this.am == i);
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 22:
              try {
                if (k())
                  cG.d(); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 23:
              a(L.MISC_INSERTS, 6.0F);
              break;
            case 24:
              a(L.GIRLS_ALLIE_AFTERSESSIONMOAN);
              break;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      };
    this.k.registerSoundListener(iSoundListener);
    paramAnimationData.addAnimationController(this.k);
    paramAnimationData.addAnimationController(this.q);
  }
  
  protected <E extends software.bernie.geckolib3.core.IAnimatable> PlayState a(AnimationEvent<E> paramAnimationEvent) {
    try {
      if (this.field_70170_p instanceof com.c)
        return PlayState.STOP; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
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
      throw a(null);
    } 
    try {
      double d;
      switch (b) {
        case 0:
          try {
            if (o() == m.NULL) {
              try {
                if ((o()).autoBlink) {
                  a("animation.bia.blink", true, paramAnimationEvent);
                  break;
                } 
                a("animation.allie.null", true, paramAnimationEvent);
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          a("animation.allie.null", true, paramAnimationEvent);
        case 1:
          d = 4.0D * (Math.abs(this.field_70165_t - this.field_70142_S) + Math.abs(this.field_70163_u - this.field_70137_T) + Math.abs(this.field_70161_v - this.field_70136_U));
          d = Math.min(1.0D + d, 4.0D);
          this.q.setAnimationSpeed(d);
          a("animation.allie.tail", true, paramAnimationEvent);
          break;
        case 2:
          try {
            switch (a.a[o().ordinal()]) {
              case 7:
                a("animation.allie.null", true, paramAnimationEvent);
                break;
              case 8:
                a("animation.allie.summon", false, paramAnimationEvent);
                break;
              case 9:
                a("animation.allie.summon_normal", false, paramAnimationEvent);
                break;
              case 10:
                a("animation.allie.summon_normal_wait", true, paramAnimationEvent);
                break;
              case 11:
                a("animation.allie.summon_wait", true, paramAnimationEvent);
                break;
              case 5:
                a("animation.allie.deepthroat_prepare", false, paramAnimationEvent);
                break;
              case 1:
                a("animation.allie.deepthroat_normal_prepare", false, paramAnimationEvent);
                break;
              case 2:
                a("animation.allie.deepthroat_start", false, paramAnimationEvent);
                break;
              case 6:
                a("animation.allie.deepthroat_slow", true, paramAnimationEvent);
                break;
              case 4:
                a("animation.allie.deepthroat_fast", true, paramAnimationEvent);
                break;
              case 3:
                a("animation.allie.deepthroat_cum", false, paramAnimationEvent);
                break;
              case 12:
                a("animation.allie.rich", false, paramAnimationEvent);
                break;
              case 13:
                a("animation.allie.rich_normal", false, paramAnimationEvent);
                break;
              case 14:
                a("animation.allie.summon_sand", false, paramAnimationEvent);
                break;
              case 15:
                a("animation.allie.attack" + this.T, false, paramAnimationEvent);
                break;
              case 16:
                a("animation.allie.bowcharge", false, paramAnimationEvent);
                break;
              case 17:
                a("animation.allie.reverse_cowgirl_start", true, paramAnimationEvent);
                break;
              case 18:
                a("animation.allie.reverse_cowgirl_slow" + this.ao, true, paramAnimationEvent);
                break;
              case 19:
                a("animation.allie.reverse_cowgirl_fastc" + this.am, true, paramAnimationEvent);
                break;
              case 20:
                a("animation.allie.reverse_cowgirl_fasts", true, paramAnimationEvent);
                break;
              case 21:
                a("animation.allie.reverse_cowgirl_cum", true, paramAnimationEvent);
                break;
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          break;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return PlayState.CONTINUE;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\bc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */