package com.schnurritv.sexmod;

import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
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

public class b4 extends bo {
  int am = 0;
  
  boolean al = false;
  
  boolean an = false;
  
  boolean ao = false;
  
  protected b4(World paramWorld) {
    super(paramWorld);
  }
  
  public b4(World paramWorld, UUID paramUUID) {
    super(paramWorld, paramUUID);
  }
  
  public float e() {
    return 1.6F;
  }
  
  public float func_70047_e() {
    return 1.34F;
  }
  
  public o b(int paramInt) {
    return new aJ();
  }
  
  public String a(int paramInt) {
    return "textures/entity/cat/hand.png";
  }
  
  public void b(String paramString, UUID paramUUID) {
    try {
      if ("action.names.touchboobs".equals(paramString)) {
        a(0, m.TOUCH_BOOBS_INTRO);
        c(m.TOUCH_BOOBS_INTRO);
        this.p.func_187227_b(F, Integer.valueOf(0));
        d(paramUUID);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if ("action.names.headpat".equals(paramString)) {
        c(m.HEAD_PAT);
        d(paramUUID);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void b() {
    c(m.WAIT_CAT);
  }
  
  public boolean v() {
    return true;
  }
  
  public boolean a(EntityPlayer paramEntityPlayer) {
    a(paramEntityPlayer, this, new String[] { "action.names.touchboobs", "action.names.headpat" }, false);
    return true;
  }
  
  public void c(m paramm) {
    try {
      if (o() == m.COWGIRL_SITTING_CUM)
        try {
          if (paramm != m.COWGIRL_SITTING_SLOW) {
            try {
              if (paramm == m.COWGIRL_SITTING_FAST)
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
      if (o() == m.TOUCH_BOOBS_CUM)
        try {
          if (paramm != m.TOUCH_BOOBS_FAST) {
            try {
              if (paramm == m.TOUCH_BOOBS_SLOW)
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
  
  public void func_70071_h_() {
    try {
      super.func_70071_h_();
      if (m.WAIT_CAT.equals(o())) {
        d();
      } else {
        this.am = 0;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  void d() {
    EntityPlayer entityPlayer = w();
    try {
      if (entityPlayer == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (entityPlayer.func_70011_f(this.field_70165_t, (t()).field_72448_b, this.field_70161_v) > 1.25D)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.field_70170_p.field_72995_K) {
        a(entityPlayer, this.am);
      } else {
        try {
          if (this.am == 25) {
            e(entityPlayer.getPersistentID());
            entityPlayer.func_191958_b(0.0F, 0.0F, 0.0F, 0.0F);
            entityPlayer.func_70634_a((func_174791_d()).field_72450_a, (t()).field_72448_b, (func_174791_d()).field_72449_c);
            c(m.COWGIRL_SITTING_INTRO);
            entityPlayer.func_70034_d(s().floatValue() + 180.0F);
            entityPlayer.field_70177_z = s().floatValue() + 180.0F;
            entityPlayer.field_70126_B = s().floatValue() + 180.0F;
            this.h = s().floatValue() + 180.0F;
            a(0.0D, -0.07500000298023224D, -0.7109375D, 0.0F, 0.0F);
            this.p.func_187227_b(F, Integer.valueOf(0));
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.am++;
  }
  
  @SideOnly(Side.CLIENT)
  void a(EntityPlayer paramEntityPlayer, int paramInt) {
    if (paramInt == 0) {
      EntityPlayerSP entityPlayerSP = (Minecraft.func_71410_x()).field_71439_g;
      try {
        if (entityPlayerSP.getPersistentID().equals(paramEntityPlayer.getPersistentID())) {
          bd.b();
          entityPlayerSP.func_70016_h(0.0D, 0.0D, 0.0D);
          aK.a(false);
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    if (paramInt == 25) {
      EntityPlayerSP entityPlayerSP = (Minecraft.func_71410_x()).field_71439_g;
      try {
        if (entityPlayerSP.getPersistentID().equals(paramEntityPlayer.getPersistentID()))
          (Minecraft.func_71410_x()).field_71474_y.field_74320_O = 2; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
  }
  
  protected m b(m paramm) {
    try {
      if (paramm == m.TOUCH_BOOBS_SLOW)
        return m.TOUCH_BOOBS_FAST; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramm == m.COWGIRL_SITTING_SLOW)
        return m.COWGIRL_SITTING_FAST; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return null;
  }
  
  protected m a(m paramm) {
    try {
      if (paramm != m.TOUCH_BOOBS_SLOW) {
        try {
          if (paramm == m.TOUCH_BOOBS_FAST)
            return m.TOUCH_BOOBS_CUM; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } else {
        return m.TOUCH_BOOBS_CUM;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramm != m.COWGIRL_SITTING_FAST)
        try {
          return (paramm != m.COWGIRL_SITTING_SLOW) ? null : m.COWGIRL_SITTING_CUM;
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return m.COWGIRL_SITTING_CUM;
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
                  a("animation.cat.blink", true, paramAnimationEvent);
                  break;
                } 
                a("animation.cat.null", true, paramAnimationEvent);
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          a("animation.cat.null", true, paramAnimationEvent);
        case 1:
          try {
            if (o() != m.NULL) {
              a("animation.cat.null", true, paramAnimationEvent);
              break;
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          try {
            if (this.Z) {
              a("animation.cat.sit", true, paramAnimationEvent);
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
                      this.al = !this.al;
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
              a("animation.cat.fly" + (this.al ? "2" : ""), true, paramAnimationEvent);
              break;
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          try {
            if (Math.abs(this.Y.x) + Math.abs(this.Y.y) > 0.0F) {
              try {
                if (this.ai) {
                  this.q.setAnimationSpeed(1.5D);
                  a("animation.cat.run", true, paramAnimationEvent);
                  break;
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              try {
                if (this.Y.y >= -0.1F) {
                  this.q.setAnimationSpeed(2.0D);
                  a("animation.cat.fastwalk", true, paramAnimationEvent);
                  break;
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              this.q.setAnimationSpeed(2.0D);
              a("animation.cat.backwards_walk", true, paramAnimationEvent);
              break;
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          a("animation.cat.idle", true, paramAnimationEvent);
          break;
        case 2:
          try {
            switch (a.a[o().ordinal()]) {
              case 1:
                a("animation.cat.null", true, paramAnimationEvent);
                break;
              case 2:
                a("animation.cat.attack" + this.T, false, paramAnimationEvent);
                break;
              case 3:
              case 4:
                a("animation.cat.sit", true, paramAnimationEvent);
                break;
              case 5:
                a("animation.cat.bowcharge", false, paramAnimationEvent);
                break;
              case 6:
                a("animation.cat.throwpearl", true, paramAnimationEvent);
                break;
              case 7:
                a("animation.cat.downed", true, paramAnimationEvent);
                break;
              case 8:
                a("animation.cat.start_fishing", false, paramAnimationEvent);
                break;
              case 9:
                a("animation.cat.idle_fishing", true, paramAnimationEvent);
                break;
              case 10:
                a("animation.cat.eat_fishing", false, paramAnimationEvent);
                break;
              case 11:
                a("animation.cat.throw_away", false, paramAnimationEvent);
                break;
              case 12:
                a("animation.cat.payment", false, paramAnimationEvent);
                break;
              case 13:
                a("animation.cat.touch_boobs_intro", false, paramAnimationEvent);
                break;
              case 14:
                try {
                
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                } 
                a("animation.cat.touch_boobs_slow" + (this.an ? "1" : ""), true, paramAnimationEvent);
                break;
              case 15:
                a("animation.cat.touch_boobs_fast", true, paramAnimationEvent);
                break;
              case 16:
                a("animation.cat.touch_boobs_cum", false, paramAnimationEvent);
                break;
              case 17:
                a("animation.cat.wait", false, paramAnimationEvent);
                break;
              case 18:
                a("animation.cat.sitting_intro", false, paramAnimationEvent);
                break;
              case 19:
                a("animation.cat.sitting_slow", true, paramAnimationEvent);
                break;
              case 20:
                a("animation.cat.sitting_fast", true, paramAnimationEvent);
                break;
              case 21:
                a("animation.cat.sitting_cum", true, paramAnimationEvent);
                break;
              case 22:
                a("animation.cat.head_pat", true, paramAnimationEvent);
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
            case 54906230:
              if (str.equals("idleDone"))
                b = 1; 
              break;
            case 1684190080:
              if (str.equals("idle2Done"))
                b = 2; 
              break;
            case 106540102:
              if (str.equals("pearl"))
                b = 3; 
              break;
            case -1540620298:
              if (str.equals("paymentMSG1"))
                b = 4; 
              break;
            case -1540620297:
              if (str.equals("paymentMSG2"))
                b = 5; 
              break;
            case -1540620296:
              if (str.equals("paymentMSG3"))
                b = 6; 
              break;
            case -1540620295:
              if (str.equals("paymentMSG4"))
                b = 7; 
              break;
            case -1540860248:
              if (str.equals("paymentDone"))
                b = 8; 
              break;
            case -1380923296:
              if (str.equals("breath"))
                b = 9; 
              break;
            case -176763432:
              if (str.equals("rod_breath"))
                b = 10; 
              break;
            case 695019737:
              if (str.equals("happyOh"))
                b = 11; 
              break;
            case 620933088:
              if (str.equals("cutenya3"))
                b = 12; 
              break;
            case 620933087:
              if (str.equals("cutenya2"))
                b = 13; 
              break;
            case 103675:
              if (str.equals("huh"))
                b = 14; 
              break;
            case 3206589:
              if (str.equals("hmph"))
                b = 15; 
              break;
            case 3198650:
              if (str.equals("hehe"))
                b = 16; 
              break;
            case -1246024133:
              if (str.equals("giggle"))
                b = 17; 
              break;
            case 2094529267:
              if (str.equals("singing"))
                b = 18; 
              break;
            case 816936963:
              if (str.equals("touch_boobsMSG1"))
                b = 19; 
              break;
            case 110550847:
              if (str.equals("touch"))
                b = 20; 
              break;
            case 3273774:
              if (str.equals("jump"))
                b = 21; 
              break;
            case -334109968:
              if (str.equals("horninya"))
                b = 22; 
              break;
            case -1767474366:
              if (str.equals("horninya2"))
                b = 23; 
              break;
            case -108443135:
              if (str.equals("touch_boobs_cumMSG3"))
                b = 24; 
              break;
            case 296663352:
              if (str.equals("sitting_cumMSG1"))
                b = 25; 
              break;
            case 3357007:
              if (str.equals("moan"))
                b = 26; 
              break;
            case 298467170:
              if (str.equals("touch_boobs_introDone"))
                b = 27; 
              break;
            case -548534449:
              if (str.equals("touch_boobs_slowDone"))
                b = 28; 
              break;
            case -1265327365:
              if (str.equals("addCumSlow"))
                b = 29; 
              break;
            case -1265725098:
              if (str.equals("addCumFast"))
                b = 30; 
              break;
            case 968155646:
              if (str.equals("fastDone"))
                b = 31; 
              break;
            case -146438396:
              if (str.equals("moanOrNya"))
                b = 32; 
              break;
            case 403702091:
              if (str.equals("blackScreen"))
                b = 33; 
              break;
            case -108683087:
              if (str.equals("touch_boobs_cumDone"))
                b = 34; 
              break;
            case 2023406731:
              if (str.equals("resetGirl"))
                b = 35; 
              break;
            case -108443137:
              if (str.equals("touch_boobs_cumMSG1"))
                b = 36; 
              break;
            case -108443136:
              if (str.equals("touch_boobs_cumMSG2"))
                b = 37; 
              break;
            case -253569070:
              if (str.equals("call_playerMSG1"))
                b = 38; 
              break;
            case 809204182:
              if (str.equals("pounding"))
                b = 39; 
              break;
            case -1235980887:
              if (str.equals("sitting_introMSG1"))
                b = 40; 
              break;
            case -1236220837:
              if (str.equals("sitting_introDone"))
                b = 41; 
              break;
            case -874895228:
              if (str.equals("sitting_slowMSG1"))
                b = 42; 
              break;
            case 1177514335:
              if (str.equals("sitting_fastMSG1"))
                b = 43; 
              break;
            case 1177274385:
              if (str.equals("sitting_fastDone"))
                b = 44; 
              break;
            case 1185581771:
              if (str.equals("sitting_fastTp"))
                b = 45; 
              break;
            case 1888271923:
              if (str.equals("headpatMSG1"))
                b = 46; 
              break;
            case 1888271924:
              if (str.equals("headpatMSG2"))
                b = 47; 
              break;
            case 1888271925:
              if (str.equals("headpatMSG3"))
                b = 48; 
              break;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        try {
          int[] arrayOfInt;
          int i;
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
              try {
              
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              this.ao = (func_70681_au().nextInt(10) == 0);
              break;
            case 2:
              this.ao = false;
              break;
            case 3:
              aV.a.sendToServer(new co(N()));
              break;
            case 4:
              a(n(), "Here, I know u like fish and yea.. these are for you");
              a(L.MISC_PLOB[0]);
              break;
            case 5:
              b("huh~?");
              a(L.GIRLS_LUNA_HUH);
              break;
            case 6:
              b("nyyyaaaa~ :D");
              arrayOfInt = new int[] { 1, 7, 10, 11 };
              i = arrayOfInt[func_70681_au().nextInt(arrayOfInt.length)];
              a(L.GIRLS_LUNA_CUTENYA[i]);
              break;
            case 7:
              b("tankuuuu owowowo");
              a(L.GIRLS_LUNA_OWO);
              break;
            case 8:
              try {
                if (E())
                  q(); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              this.E = 1.0F;
              break;
            case 9:
            case 10:
              a(L.GIRLS_LUNA_LIGHTBREATHING);
              break;
            case 11:
              a(L.GIRLS_LUNA_HAPPYOH);
              break;
            case 12:
              a(L.GIRLS_LUNA_CUTENYA[3]);
              break;
            case 13:
              a(L.GIRLS_LUNA_CUTENYA[2]);
              break;
            case 14:
              a(L.GIRLS_LUNA_HUH);
              break;
            case 15:
              a(L.GIRLS_LUNA_HMPH);
              break;
            case 16:
            case 17:
              a(L.GIRLS_LUNA_GIGGLE);
              break;
            case 18:
              a(L.GIRLS_LUNA_SINGING);
              break;
            case 19:
              b("comon~ touch me hihi~");
              a(L.GIRLS_LUNA_GIGGLE);
              break;
            case 20:
              a(L.MISC_TOUCH);
              break;
            case 21:
              a(L.MISC_JUMP[0], 0.2F);
              break;
            case 22:
              a(L.GIRLS_LUNA_HORNINYA);
              break;
            case 23:
            case 24:
            case 25:
              a(L.GIRLS_LUNA_HORNINYA[1]);
              a(L.MISC_CUMINFLATION[0], 5.0F);
              break;
            case 26:
              a(L.a(L.GIRLS_LUNA_MOAN));
              break;
            case 27:
              try {
                c(m.TOUCH_BOOBS_SLOW);
                if (k()) {
                  cG.c();
                  cG.d();
                  aK.a(false);
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 28:
              try {
                if (this.an) {
                  this.an = false;
                  break;
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              try {
              
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              this.an = (Math.random() < 0.5D);
              break;
            case 29:
              try {
                if (k())
                  cG.a(0.019999999552965164D); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 30:
              try {
                if (k())
                  cG.a(0.03999999910593033D); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 31:
              try {
                if (!k())
                  break; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              try {
                if (!aK.b)
                  c(m.TOUCH_BOOBS_SLOW); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 32:
              try {
                if (Math.random() > 0.5D) {
                  a(L.a(L.GIRLS_LUNA_MOAN));
                  break;
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              a(L.a(L.GIRLS_LUNA_HORNINYA));
              break;
            case 33:
              try {
                if (k())
                  bd.b(); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 34:
              try {
                if (k()) {
                  cG.c();
                  i();
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 35:
              try {
                if (k())
                  i(); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 36:
              a(L.GIRLS_LUNA_HORNINYA[3]);
              break;
            case 37:
              a(L.GIRLS_LUNA_HORNINYA[9]);
              break;
            case 38:
              a(L.GIRLS_LUNA_GIGGLE);
              b("come here - big guy hehe~");
              break;
            case 39:
              a(L.a(L.MISC_POUNDING));
              break;
            case 40:
              a(L.GIRLS_LUNA_GIGGLE);
              b("hehe~");
              break;
            case 41:
              try {
                if (k()) {
                  c(m.COWGIRL_SITTING_SLOW);
                  cG.c();
                  cG.d();
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 42:
              try {
                if (func_70681_au().nextBoolean()) {
                  try {
                    if (func_70681_au().nextBoolean()) {
                      a(L.a(L.GIRLS_LUNA_HORNINYA));
                      break;
                    } 
                  } catch (RuntimeException runtimeException) {
                    throw a(null);
                  } 
                  a(L.a(L.GIRLS_LUNA_MOAN));
                } else {
                  a(L.a(L.GIRLS_LUNA_LIGHTBREATHING));
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              try {
                if (k())
                  cG.a(0.02D); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 43:
              try {
                if (func_70681_au().nextBoolean()) {
                  a(L.a(L.GIRLS_LUNA_HORNINYA));
                } else {
                  a(L.a(L.GIRLS_LUNA_MOAN));
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              try {
                if (k())
                  cG.a(0.04D); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 44:
              try {
                if (k() && !aK.b) {
                  c(m.COWGIRL_SITTING_SLOW);
                  Vec3d vec3d1 = new Vec3d(0.0D, -0.07500000298023224D, -0.7109375D);
                  Vec3d vec3d2 = aH.a(vec3d1, s().floatValue() + 180.0F);
                  (Minecraft.func_71410_x()).field_71439_g.func_70107_b((I()).field_72450_a + vec3d2.field_72450_a, (I()).field_72448_b - 0.0D + vec3d2.field_72448_b, (I()).field_72449_c + vec3d2.field_72449_c);
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 45:
              if (k()) {
                Vec3d vec3d1 = new Vec3d(0.0D, -0.160625D, -0.9925D);
                Vec3d vec3d2 = aH.a(vec3d1, s().floatValue() + 180.0F);
                (Minecraft.func_71410_x()).field_71439_g.func_70107_b((I()).field_72450_a + vec3d2.field_72450_a, (I()).field_72448_b - 0.0D + vec3d2.field_72448_b, (I()).field_72449_c + vec3d2.field_72449_c);
              } 
              break;
            case 46:
              b("huh?~");
              a(L.GIRLS_LUNA_HUH);
              break;
            case 47:
              a(L.GIRLS_LUNA_MMM);
              break;
            case 48:
              b("nya~");
              a(L.GIRLS_LUNA_HORNINYA[0]);
              break;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      };
    this.q.transitionLengthTicks = 10.0D;
    this.k.registerSoundListener(iSoundListener);
    paramAnimationData.addAnimationController(this.k);
    paramAnimationData.addAnimationController(this.q);
    paramAnimationData.addAnimationController(this.o);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\b4.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */