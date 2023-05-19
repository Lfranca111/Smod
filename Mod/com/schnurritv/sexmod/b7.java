package com.schnurritv.sexmod;

import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.SoundKeyframeEvent;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;

public class b7 extends bo {
  int an = -1;
  
  boolean am = false;
  
  int al = 1;
  
  public b7(World paramWorld) {
    super(paramWorld);
  }
  
  public b7(World paramWorld, UUID paramUUID) {
    super(paramWorld, paramUUID);
  }
  
  public float e() {
    return 1.5F;
  }
  
  public float func_70047_e() {
    return 1.5F;
  }
  
  public void b() {}
  
  public boolean a(String paramString) {
    try {
      if ("anal".equals(paramString)) {
        c(m.ANAL_PREPARE);
        c(0);
        return true;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if ("doggy".equals(paramString)) {
        c(m.SITDOWN);
        c(0);
        return true;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  @SideOnly(Side.CLIENT)
  public void j() {
    a((EntityPlayer)(Minecraft.func_71410_x()).field_71439_g, this, new String[] { "anal", "doggy" }, false);
  }
  
  public void b(String paramString, UUID paramUUID) {
    try {
      if ("action.names.headpat".equals(paramString)) {
        d(paramUUID);
        c(m.HEAD_PAT);
        a(L(), m.HEAD_PAT);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public o b(int paramInt) {
    return new x();
  }
  
  public String a(int paramInt) {
    return "textures/entity/bia/hand.png";
  }
  
  public float t() {
    return 35.0F;
  }
  
  public float R() {
    return 140.0F;
  }
  
  public boolean n() {
    return true;
  }
  
  public boolean a(EntityPlayer paramEntityPlayer) {
    a(paramEntityPlayer, this, new String[] { "action.names.headpat" }, false);
    return true;
  }
  
  public void c(m paramm) {
    try {
      if (o() == m.ANAL_CUM)
        try {
          if (paramm != m.ANAL_FAST) {
            try {
              if (paramm == m.ANAL_SLOW)
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
      if (o() == m.PRONE_DOGGY_CUM)
        try {
          if (paramm != m.PRONE_DOGGY_HARD) {
            try {
              if (paramm == m.PRONE_DOGGY_SOFT)
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
    super.c(paramm);
  }
  
  protected m b(m paramm) {
    try {
      if (paramm == m.ANAL_SLOW)
        return m.ANAL_FAST; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramm == m.PRONE_DOGGY_INTRO)
        return m.PRONE_DOGGY_INSERT; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return null;
  }
  
  protected m a(m paramm) {
    try {
      if (paramm != m.ANAL_SLOW) {
        try {
          if (paramm == m.ANAL_FAST)
            return m.ANAL_CUM; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } else {
        return m.ANAL_CUM;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramm != m.PRONE_DOGGY_SOFT)
        try {
          return (paramm != m.PRONE_DOGGY_HARD) ? null : m.PRONE_DOGGY_CUM;
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return m.PRONE_DOGGY_CUM;
  }
  
  public void func_70071_h_() {
    super.func_70071_h_();
    d();
  }
  
  protected void P() {
    super.P();
    this.an = -1;
  }
  
  @SideOnly(Side.CLIENT)
  public boolean c(EntityPlayer paramEntityPlayer) {
    return (Minecraft.func_71410_x()).field_71439_g.getPersistentID().equals(paramEntityPlayer.getPersistentID());
  }
  
  void d() {
    m m = o();
    try {
      if (m != m.ANAL_WAIT)
        try {
          if (m != m.SITDOWNIDLE)
            return; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    EntityPlayer entityPlayer = w();
    try {
      if (entityPlayer == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (entityPlayer.func_70032_d((Entity)this) > 1.0F)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.field_70170_p.field_72995_K)
        try {
          if (!c(entityPlayer))
            return; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.an == -1) {
        try {
          if (this.field_70170_p.field_72995_K) {
            bd.b();
            aK.a(false);
          } else {
            e(entityPlayer.getPersistentID());
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        this.an = g;
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (--this.an > 0)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      this.an = -1;
      entityPlayer.field_70145_X = true;
      entityPlayer.func_189654_d(true);
      if (m == m.ANAL_WAIT) {
        if (!this.field_70170_p.field_72995_K) {
          c(m.ANAL_START);
          Vec3d vec3d = I().func_178787_e(aH.a(-0.3D, -1.0D, -0.5D, s().floatValue()));
          entityPlayer.func_70634_a(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c);
        } else {
          try {
            if (k())
              cG.d(); 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
        } 
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    float f = s().floatValue();
    entityPlayer.field_70177_z = f;
    entityPlayer.field_70125_A = 60.0F;
    if (!this.field_70170_p.field_72995_K) {
      c(0);
      c(m.PRONE_DOGGY_INTRO);
      Vec3d vec3d1 = I();
      Vec3d vec3d2 = vec3d1.func_178787_e(aH.a(0.0D, 0.0D, 1.0D, f));
      a(vec3d2);
      EntityPlayer entityPlayer1 = m();
      try {
        if (entityPlayer1 != null)
          entityPlayer1.func_70634_a(vec3d2.field_72450_a, vec3d2.field_72448_b, vec3d2.field_72449_c); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      Vec3d vec3d3 = vec3d1.func_178787_e(aH.a(0.0D, 1.1875D - entityPlayer.func_70047_e(), 0.5D, f));
      entityPlayer.func_70634_a(vec3d3.field_72450_a, vec3d3.field_72448_b, vec3d3.field_72449_c);
      a(true);
    } 
  }
  
  @SideOnly(Side.CLIENT)
  public void M() {
    try {
      super.M();
      if (o() != m.PRONE_DOGGY_HARD)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    int i = this.al;
    try {
      do {
        this.al = func_70681_au().nextInt(3) + 1;
      } while (i == this.al);
      return;
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  protected <E extends software.bernie.geckolib3.core.IAnimatable> PlayState a(AnimationEvent<E> paramAnimationEvent) {
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
      switch (b) {
        case 0:
          try {
            if (o() == m.NULL) {
              try {
                if ((o()).autoBlink) {
                  a("animation.bia.fhappy", true, paramAnimationEvent);
                  break;
                } 
                a("animation.bia.null", true, paramAnimationEvent);
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          a("animation.bia.null", true, paramAnimationEvent);
        case 1:
          try {
            if (o() != m.NULL) {
              a("animation.bia.null", true, paramAnimationEvent);
              break;
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          try {
            if (this.Z) {
              a("animation.bia.sit", true, paramAnimationEvent);
              break;
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          try {
            if (this.q.getCurrentAnimation() != null)
              try {
                if ((this.q.getCurrentAnimation()).animationName.contains("fly"))
                  try {
                    if (this.ag) {
                      try {
                      
                      } catch (RuntimeException runtimeException) {
                        throw a(null);
                      } 
                      this.am = !this.am;
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
            if (!this.ag) {
              try {
              
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              a("animation.bia.fly" + (this.am ? "2" : ""), true, paramAnimationEvent);
              break;
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          try {
            if (Math.abs(this.Y.x) + Math.abs(this.Y.y) > 0.0F) {
              try {
                if (this.ai) {
                  this.q.setAnimationSpeed(1.2D);
                  a("animation.bia.run", true, paramAnimationEvent);
                  break;
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              try {
                if (this.Y.y >= -0.1F) {
                  this.q.setAnimationSpeed(1.2D);
                  a("animation.bia.fastwalk", true, paramAnimationEvent);
                  break;
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              this.q.setAnimationSpeed(1.2D);
              a("animation.bia.backwards_walk", true, paramAnimationEvent);
              break;
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          a("animation.bia.idle", true, paramAnimationEvent);
          break;
        case 2:
          try {
            switch (a.a[o().ordinal()]) {
              case 1:
                a("animation.bia.null", true, paramAnimationEvent);
                break;
              case 2:
                a("animation.bia.strip", false, paramAnimationEvent);
                break;
              case 3:
                a("animation.bia.attack" + this.T, false, paramAnimationEvent);
                break;
              case 4:
                a("animation.bia.bowcharge", false, paramAnimationEvent);
                break;
              case 5:
                a("animation.bia.ride", true, paramAnimationEvent);
                break;
              case 6:
                a("animation.bia.sit", true, paramAnimationEvent);
                break;
              case 7:
                a("animation.bia.throwpearl", false, paramAnimationEvent);
                break;
              case 8:
                a("animation.bia.downed", true, paramAnimationEvent);
                break;
              case 9:
                a("animation.bia.talk_horny", false, paramAnimationEvent);
                break;
              case 10:
                a("animation.bia.talk_idle", true, paramAnimationEvent);
                break;
              case 11:
                a("animation.bia.talk_response", true, paramAnimationEvent);
                break;
              case 12:
                a("animation.bia.anal_prepare", false, paramAnimationEvent);
                break;
              case 13:
                a("animation.bia.anal_wait", true, paramAnimationEvent);
                break;
              case 14:
                a("animation.bia.anal_start", true, paramAnimationEvent);
                break;
              case 15:
                a("animation.bia.anal_slow", true, paramAnimationEvent);
                break;
              case 16:
                a("animation.bia.anal_fast", true, paramAnimationEvent);
                break;
              case 17:
                a("animation.bia.anal_cum", false, paramAnimationEvent);
                break;
              case 18:
                a("animation.bia.headpat", false, paramAnimationEvent);
                break;
              case 19:
                a("animation.bia.sitdown", false, paramAnimationEvent);
                break;
              case 20:
                a("animation.bia.sitdownidle", true, paramAnimationEvent);
                break;
              case 21:
                a("animation.bia.prone_doggy_intro", true, paramAnimationEvent);
                break;
              case 22:
                a("animation.bia.prone_doggy_insert", true, paramAnimationEvent);
                break;
              case 23:
                a("animation.bia.prone_doggy_soft", true, paramAnimationEvent);
                break;
              case 24:
                a("animation.bia.prone_doggy_hard" + this.al, true, paramAnimationEvent);
                break;
              case 25:
                a("animation.bia.prone_doggy_cum", true, paramAnimationEvent);
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
  
  @SideOnly(Side.CLIENT)
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
            case -188221432:
              if (str.equals("stripMSG1"))
                b = 1; 
              break;
            case 1988710681:
              if (str.equals("sexUiOn"))
                b = 2; 
              break;
            case 106540102:
              if (str.equals("pearl"))
                b = 3; 
              break;
            case 1902553459:
              if (str.equals("talk_hornyMSG1"))
                b = 4; 
              break;
            case 1902553460:
              if (str.equals("talk_hornyMSG2"))
                b = 5; 
              break;
            case 1902553461:
              if (str.equals("talk_hornyMSG3"))
                b = 6; 
              break;
            case 1902553462:
              if (str.equals("talk_hornyMSG4"))
                b = 7; 
              break;
            case 770079076:
              if (str.equals("talk_responseMSG1"))
                b = 8; 
              break;
            case 770079077:
              if (str.equals("talk_responseMSG2"))
                b = 9; 
              break;
            case 770079078:
              if (str.equals("talk_responseMSG3"))
                b = 10; 
              break;
            case 769839126:
              if (str.equals("talk_responseDone"))
                b = 11; 
              break;
            case -712528432:
              if (str.equals("anal_prepareMSG1"))
                b = 12; 
              break;
            case -712528431:
              if (str.equals("anal_prepareMSG2"))
                b = 13; 
              break;
            case -712768382:
              if (str.equals("anal_prepareDone"))
                b = 14; 
              break;
            case -193707541:
              if (str.equals("anal_startMSG1"))
                b = 15; 
              break;
            case 1723578003:
              if (str.equals("anal_fastMSG1"))
                b = 16; 
              break;
            case -328831560:
              if (str.equals("anal_slowMSG1"))
                b = 17; 
              break;
            case -193707540:
              if (str.equals("anal_startMSG2"))
                b = 18; 
              break;
            case 1723338053:
              if (str.equals("anal_fastDone"))
                b = 19; 
              break;
            case -193947491:
              if (str.equals("anal_startDone"))
                b = 20; 
              break;
            case -794100347:
              if (str.equals("anal_cumMSG2"))
                b = 21; 
              break;
            case -1823121897:
              if (str.equals("anal_cumBlackScreen"))
                b = 22; 
              break;
            case -1770106804:
              if (str.equals("doggy_cumDone"))
                b = 23; 
              break;
            case -794340298:
              if (str.equals("anal_cumDone"))
                b = 24; 
              break;
            case 1888271923:
              if (str.equals("headpatMSG1"))
                b = 25; 
              break;
            case 1888271924:
              if (str.equals("headpatMSG2"))
                b = 26; 
              break;
            case 1888271925:
              if (str.equals("headpatMSG3"))
                b = 27; 
              break;
            case 1888271926:
              if (str.equals("headpatMSG4"))
                b = 28; 
              break;
            case 1888031973:
              if (str.equals("headpatDone"))
                b = 29; 
              break;
            case -1729477776:
              if (str.equals("sitdownMSG1"))
                b = 30; 
              break;
            case -1729717726:
              if (str.equals("sitdownDone"))
                b = 31; 
              break;
            case 109526449:
              if (str.equals("slide"))
                b = 32; 
              break;
            case 106857100:
              if (str.equals("pound"))
                b = 33; 
              break;
            case -191850083:
              if (str.equals("doggyMoan"))
                b = 34; 
              break;
            case 495074306:
              if (str.equals("doggySwitch"))
                b = 35; 
              break;
            case -1648048447:
              if (str.equals("doggyReset"))
                b = 36; 
              break;
            case 98875:
              if (str.equals("cum"))
                b = 37; 
              break;
            case -1204456966:
              if (str.equals("orgasm1"))
                b = 38; 
              break;
            case -1204456965:
              if (str.equals("orgasm2"))
                b = 39; 
              break;
            case 1534823760:
              if (str.equals("openSexUI"))
                b = 40; 
              break;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        try {
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
              a("Hihi~");
              a(L.a(L.GIRLS_BIA_GIGGLE));
              break;
            case 2:
              try {
                if (k())
                  cG.d(); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 3:
              aV.a.sendToServer(new co(N()));
              break;
            case 4:
              b("Heyaaa~");
              a(L.GIRLS_BIA_HEY[3]);
              break;
            case 5:
              b("I am Hornyyyyy~");
              a(L.GIRLS_BIA_GIGGLE[2]);
              break;
            case 6:
              b("So...");
              a(L.GIRLS_BIA_BREATH[0]);
              break;
            case 7:
              b("Are we gonna have some fun nyaa?");
              a(L.GIRLS_BIA_HUH[0]);
              break;
            case 8:
              b("Huh?!...");
              a(L.GIRLS_BIA_HUH[2]);
              break;
            case 9:
              b("I... uhm...");
              a(L.GIRLS_BIA_BREATH[1]);
              break;
            case 10:
              b("yes~");
              a(L.GIRLS_BIA_GIGGLE[0]);
              break;
            case 11:
              try {
                f();
                if (((Integer)this.p.func_187225_a(F)).intValue() != 0) {
                  c(m.STRIP);
                  break;
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              q();
              break;
            case 12:
              a(L.MISC_PLOB[0]);
              break;
            case 13:
              a(L.MISC_BEDRUSTLE[0]);
              break;
            case 14:
              try {
                c(m.ANAL_WAIT);
                if (k())
                  cG.c(); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 15:
              a(L.GIRLS_BIA_MMM[3]);
              a(L.MISC_POUNDING[34]);
              break;
            case 16:
              try {
                if (k())
                  cG.a(0.02D); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              try {
                if (k())
                  cG.a(0.02D); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              a(L.a(L.MISC_POUNDING), 0.5F);
              a(L.a(L.GIRLS_BIA_AHH));
              break;
            case 17:
            case 18:
              try {
                if (k())
                  cG.a(0.02D); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              a(L.a(L.MISC_POUNDING), 0.5F);
              a(L.a(L.GIRLS_BIA_AHH));
              break;
            case 19:
              try {
                if (!k())
                  break; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              try {
                if (aK.b)
                  break; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
            case 20:
              try {
                c(m.ANAL_SLOW);
                if (k())
                  cG.d(); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 21:
              a(L.a(L.GIRLS_BIA_AHH));
              break;
            case 22:
              try {
                if (k())
                  bd.b(); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 23:
            case 24:
              try {
                if (k())
                  cG.c(); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              i();
              break;
            case 25:
              b("Ooh headpats!");
              a(L.GIRLS_BIA_BREATH[0]);
              break;
            case 26:
              b("Hmmm.... :D");
              a(L.GIRLS_BIA_MMM[0]);
              break;
            case 27:
              b("huh...?");
              a(L.GIRLS_BIA_HUH[0]);
              break;
            case 28:
              b("Tanku hehe");
              a(L.GIRLS_BIA_GIGGLE[1]);
              break;
            case 29:
              try {
                if (E())
                  i(); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 30:
              b("come here big boy~");
              a(L.GIRLS_BIA_BREATH);
              break;
            case 31:
              c(m.SITDOWNIDLE);
              break;
            case 32:
              try {
                a(L.a(L.MISC_SLIDE));
                if (k())
                  cG.a(0.005D); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 33:
              a(L.MISC_POUNDING);
              break;
            case 34:
              try {
              
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              try {
                a(func_70681_au().nextBoolean() ? L.GIRLS_BIA_AHH : L.GIRLS_BIA_MMM);
                if (k())
                  cG.a(0.04D); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 35:
              try {
                if (!k())
                  break; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              try {
                if (aK.b)
                  c(m.PRONE_DOGGY_HARD); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 36:
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
              p();
              break;
            case 37:
              a(L.MISC_INSERTS, 6.0F);
              break;
            case 38:
              a(L.GIRLS_BIA_MMM[6]);
              break;
            case 39:
              a(L.GIRLS_BIA_MMM[7]);
              break;
            case 40:
              try {
                if (k())
                  cG.d(); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      };
    this.k.registerSoundListener(iSoundListener);
    paramAnimationData.addAnimationController(this.q);
    paramAnimationData.addAnimationController(this.o);
    paramAnimationData.addAnimationController(this.k);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\b7.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */