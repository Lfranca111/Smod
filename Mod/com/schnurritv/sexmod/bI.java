package com.schnurritv.sexmod;

import java.util.UUID;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.SoundKeyframeEvent;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;

public class bi extends bo {
  boolean al = false;
  
  int am = 0;
  
  boolean an = false;
  
  protected bi(World paramWorld) {
    super(paramWorld);
  }
  
  public bi(World paramWorld, UUID paramUUID) {
    super(paramWorld, paramUUID);
  }
  
  public float e() {
    return 1.75F;
  }
  
  public float t() {
    return 35.0F;
  }
  
  public float R() {
    return 140.0F;
  }
  
  public float func_70047_e() {
    return 1.64F;
  }
  
  public void b() {
    c(m.STARTDOGGY);
    this.p.func_187227_b(F, Integer.valueOf(0));
    this.h = ((Float)this.p.func_187225_a(e)).floatValue();
  }
  
  public boolean n() {
    return true;
  }
  
  public o b(int paramInt) {
    return new aU();
  }
  
  public String a(int paramInt) {
    try {
      if (paramInt == 0)
        return "textures/entity/jenny/hand_nude.png"; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return "textures/entity/jenny/hand.png";
  }
  
  public void b(String paramString, UUID paramUUID) {
    try {
      if ("action.names.boobjob".equals(paramString)) {
        this.p.func_187227_b(F, Integer.valueOf(0));
        c(m.PAIZURI_START);
        a(0, m.PAIZURI_START);
        d(paramUUID);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if ("action.names.blowjob".equals(paramString)) {
        c(m.STARTBLOWJOB);
        a(L(), m.PAIZURI_START);
        d(paramUUID);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void func_70619_bc() {
    super.func_70619_bc();
    if (o() == m.WAITDOGGY) {
      EntityPlayer entityPlayer = w();
      try {
        if (entityPlayer != null)
          try {
            if (entityPlayer.func_70011_f((t()).field_72450_a, (t()).field_72448_b, (t()).field_72449_c) < 1.0D) {
              try {
                if (a(entityPlayer.getPersistentID())) {
                  entityPlayer.func_145747_a((ITextComponent)new TextComponentString(TextFormatting.DARK_PURPLE + "sowy no lesbo action yet uwu"));
                  return;
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              e(entityPlayer.getPersistentID());
              entityPlayer.func_70634_a((func_174791_d()).field_72450_a, (t()).field_72448_b, (func_174791_d()).field_72449_c);
              a((EntityPlayerMP)entityPlayer, false);
              entityPlayer.func_191958_b(0.0F, 0.0F, 0.0F, 0.0F);
              entityPlayer.field_71075_bZ.field_75100_b = true;
              (this.field_70170_p.func_152378_a(d())).field_71075_bZ.field_75100_b = true;
              a(0.0D, 0.0D, 0.4D, 0.0F, 60.0F);
              this.w = null;
              c(m.DOGGYSTART);
              aV.a.sendTo(new aw(false), (EntityPlayerMP)entityPlayer);
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
  }
  
  public boolean a(EntityPlayer paramEntityPlayer) {
    a(paramEntityPlayer, this, new String[] { "action.names.blowjob", "action.names.boobjob" }, false);
    return true;
  }
  
  protected m b(m paramm) {
    try {
      switch (a.a[paramm.ordinal()]) {
        case 1:
          return m.THRUSTBLOWJOB;
        case 2:
          return m.DOGGYFAST;
        case 3:
          try {
            if (this.an) {
              this.an = false;
              a(0.0D, 0.0D, 0.0D, 0.0F, 70.0F);
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          return m.PAIZURI_FAST;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return null;
  }
  
  protected m a(m paramm) {
    try {
      if (paramm != m.SUCKBLOWJOB) {
        try {
          if (paramm == m.THRUSTBLOWJOB) {
            a(0.0D, 0.0D, 0.0D, 0.0F, 70.0F);
            return m.CUMBLOWJOB;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } else {
        a(0.0D, 0.0D, 0.0D, 0.0F, 70.0F);
        return m.CUMBLOWJOB;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramm != m.DOGGYSLOW) {
        try {
          if (paramm == m.DOGGYFAST)
            return m.DOGGYCUM; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } else {
        return m.DOGGYCUM;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramm != m.PAIZURI_FAST)
        try {
          return (paramm != m.PAIZURI_SLOW) ? null : m.PAIZURI_CUM;
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return m.PAIZURI_CUM;
  }
  
  public void c(m paramm) {
    m m1 = o();
    try {
      if (m1 == m.DOGGYCUM)
        try {
          if (paramm != m.DOGGYSLOW) {
            try {
              if (paramm == m.DOGGYFAST)
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
      if (m1 == m.CUMBLOWJOB)
        try {
          if (paramm != m.THRUSTBLOWJOB) {
            try {
              if (paramm == m.SUCKBLOWJOB)
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
      if (m1 == m.PAIZURI_CUM)
        try {
          if (paramm != m.PAIZURI_SLOW) {
            try {
              if (paramm == m.PAIZURI_FAST)
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
                  a("animation.jenny.fhappy", true, paramAnimationEvent);
                  break;
                } 
                a("animation.jenny.null", true, paramAnimationEvent);
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          a("animation.jenny.null", true, paramAnimationEvent);
        case 1:
          try {
            if (o() != m.NULL) {
              a("animation.jenny.null", true, paramAnimationEvent);
              break;
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          try {
            if (this.Z) {
              a("animation.jenny.sit", true, paramAnimationEvent);
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
              a("animation.jenny.fly" + (this.al ? "2" : ""), true, paramAnimationEvent);
              break;
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          try {
            if (Math.abs(this.Y.x) + Math.abs(this.Y.y) > 0.0F) {
              try {
                if (this.ai) {
                  this.q.setAnimationSpeed(1.2000000476837158D);
                  a("animation.jenny.run", true, paramAnimationEvent);
                  break;
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              try {
                if (this.Y.y >= -0.1F) {
                  this.q.setAnimationSpeed(1.5D);
                  a("animation.jenny.fastwalk", true, paramAnimationEvent);
                  break;
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              this.q.setAnimationSpeed(1.2000000476837158D);
              a("animation.jenny.backwards_walk", true, paramAnimationEvent);
              break;
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          a("animation.jenny.idle", true, paramAnimationEvent);
          break;
        case 2:
          try {
            switch (a.a[o().ordinal()]) {
              case 4:
                a("animation.jenny.null", true, paramAnimationEvent);
                break;
              case 5:
                a("animation.jenny.strip", false, paramAnimationEvent);
                break;
              case 6:
                a("animation.jenny.payment", false, paramAnimationEvent);
                break;
              case 7:
                a("animation.jenny.blowjobintro", false, paramAnimationEvent);
                break;
              case 1:
                a("animation.jenny.blowjobsuck", true, paramAnimationEvent);
                break;
              case 8:
                a("animation.jenny.blowjobthrust", true, paramAnimationEvent);
                break;
              case 9:
                a("animation.jenny.blowjobcum", false, paramAnimationEvent);
                break;
              case 10:
                a("animation.jenny.doggygoonbed", false, paramAnimationEvent);
                break;
              case 11:
                a("animation.jenny.doggywait", true, paramAnimationEvent);
                break;
              case 12:
                a("animation.jenny.doggystart", false, paramAnimationEvent);
                break;
              case 2:
                a("animation.jenny.doggyslow", true, paramAnimationEvent);
                break;
              case 13:
                a("animation.jenny.doggyfast", true, paramAnimationEvent);
                break;
              case 14:
                a("animation.jenny.doggycum", false, paramAnimationEvent);
                break;
              case 15:
                a("animation.jenny.attack" + this.T, false, paramAnimationEvent);
                break;
              case 16:
                a("animation.jenny.bowcharge", false, paramAnimationEvent);
                break;
              case 17:
                a("animation.jenny.ride", true, paramAnimationEvent);
                break;
              case 18:
                a("animation.jenny.sit", true, paramAnimationEvent);
                break;
              case 19:
                a("animation.jenny.throwpearl", false, paramAnimationEvent);
                break;
              case 20:
                a("animation.jenny.downed", true, paramAnimationEvent);
                break;
              case 21:
                a("animation.jenny.paizuri_start", false, paramAnimationEvent);
                break;
              case 3:
                a("animation.jenny.paizuri_slow", true, paramAnimationEvent);
                break;
              case 22:
                a("animation.jenny.paizuri_fast", true, paramAnimationEvent);
                break;
              case 23:
                a("animation.jenny.paizuri_cum", false, paramAnimationEvent);
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
            case -188221432:
              if (str.equals("stripMSG1"))
                b = 1; 
              break;
            case -1540620298:
              if (str.equals("paymentMSG1"))
                b = 2; 
              break;
            case -1540620297:
              if (str.equals("paymentMSG2"))
                b = 3; 
              break;
            case -1540620296:
              if (str.equals("paymentMSG3"))
                b = 4; 
              break;
            case 1988710681:
              if (str.equals("sexUiOn"))
                b = 5; 
              break;
            case -1540620295:
              if (str.equals("paymentMSG4"))
                b = 6; 
              break;
            case -1540860248:
              if (str.equals("paymentDone"))
                b = 7; 
              break;
            case -84916847:
              if (str.equals("bjiMSG1"))
                b = 8; 
              break;
            case -84916846:
              if (str.equals("bjiMSG2"))
                b = 9; 
              break;
            case -84916845:
              if (str.equals("bjiMSG3"))
                b = 10; 
              break;
            case -84916844:
              if (str.equals("bjiMSG4"))
                b = 11; 
              break;
            case -84916843:
              if (str.equals("bjiMSG5"))
                b = 12; 
              break;
            case -84916842:
              if (str.equals("bjiMSG6"))
                b = 13; 
              break;
            case -84916841:
              if (str.equals("bjiMSG7"))
                b = 14; 
              break;
            case -84916840:
              if (str.equals("bjiMSG8"))
                b = 15; 
              break;
            case -84916839:
              if (str.equals("bjiMSG9"))
                b = 16; 
              break;
            case 1662545087:
              if (str.equals("bjiMSG10"))
                b = 17; 
              break;
            case 1662545088:
              if (str.equals("bjiMSG11"))
                b = 18; 
              break;
            case 1662545089:
              if (str.equals("bjiMSG12"))
                b = 19; 
              break;
            case -74758116:
              if (str.equals("bjtMSG1"))
                b = 20; 
              break;
            case -85156797:
              if (str.equals("bjiDone"))
                b = 21; 
              break;
            case -74998066:
              if (str.equals("bjtDone"))
                b = 22; 
              break;
            case 441346873:
              if (str.equals("doggyfastReady"))
                b = 23; 
              break;
            case 1982646231:
              if (str.equals("bjtReady"))
                b = 24; 
              break;
            case 1668024441:
              if (str.equals("paizuriReady"))
                b = 25; 
              break;
            case -90457973:
              if (str.equals("bjcMSG1"))
                b = 26; 
              break;
            case -90457972:
              if (str.equals("bjcMSG2"))
                b = 27; 
              break;
            case -90457971:
              if (str.equals("bjcMSG3"))
                b = 28; 
              break;
            case -90457970:
              if (str.equals("bjcMSG4"))
                b = 29; 
              break;
            case -90457969:
              if (str.equals("bjcMSG5"))
                b = 30; 
              break;
            case -90457968:
              if (str.equals("bjcMSG6"))
                b = 31; 
              break;
            case -90457967:
              if (str.equals("bjcMSG7"))
                b = 32; 
              break;
            case -1370194640:
              if (str.equals("bjcBlackScreen"))
                b = 33; 
              break;
            case -90697923:
              if (str.equals("bjcDone"))
                b = 34; 
              break;
            case -669376408:
              if (str.equals("paizuri_cumDone"))
                b = 35; 
              break;
            case 1092262223:
              if (str.equals("doggyCumDone"))
                b = 36; 
              break;
            case 2106063356:
              if (str.equals("doggyGoOnBedMSG1"))
                b = 37; 
              break;
            case 2106063357:
              if (str.equals("doggyGoOnBedMSG2"))
                b = 38; 
              break;
            case 2106063358:
              if (str.equals("doggyGoOnBedMSG3"))
                b = 39; 
              break;
            case 2106063359:
              if (str.equals("doggyGoOnBedMSG4"))
                b = 40; 
              break;
            case 2105823406:
              if (str.equals("doggyGoOnBedDone"))
                b = 41; 
              break;
            case -1648851740:
              if (str.equals("doggystartMSG1"))
                b = 42; 
              break;
            case -1648851739:
              if (str.equals("doggystartMSG2"))
                b = 43; 
              break;
            case -1648851738:
              if (str.equals("doggystartMSG3"))
                b = 44; 
              break;
            case -1648851737:
              if (str.equals("doggystartMSG4"))
                b = 45; 
              break;
            case -1648851736:
              if (str.equals("doggystartMSG5"))
                b = 46; 
              break;
            case -1649091690:
              if (str.equals("doggystartDone"))
                b = 47; 
              break;
            case -2038339681:
              if (str.equals("doggyslowMSG1"))
                b = 48; 
              break;
            case -2038339680:
              if (str.equals("doggyslowMSG2"))
                b = 49; 
              break;
            case 14069882:
              if (str.equals("doggyfastMSG1"))
                b = 50; 
              break;
            case 13829932:
              if (str.equals("doggyfastDone"))
                b = 51; 
              break;
            case -572151107:
              if (str.equals("doggycumMSG1"))
                b = 52; 
              break;
            case -572151106:
              if (str.equals("doggycumMSG2"))
                b = 53; 
              break;
            case -572151105:
              if (str.equals("doggycumMSG3"))
                b = 54; 
              break;
            case -572151104:
              if (str.equals("doggycumMSG4"))
                b = 55; 
              break;
            case -572151103:
              if (str.equals("doggycumMSG5"))
                b = 56; 
              break;
            case 106540102:
              if (str.equals("pearl"))
                b = 57; 
              break;
            case -1149499193:
              if (str.equals("boobjob_camera"))
                b = 58; 
              break;
            case -362733489:
              if (str.equals("paizuri_startDone"))
                b = 59; 
              break;
            case 1179444406:
              if (str.equals("paizuriFastMSG1"))
                b = 60; 
              break;
            case -872965157:
              if (str.equals("paizuriSlowMSG1"))
                b = 61; 
              break;
            case 118020136:
              if (str.equals("paizuriStartMSG1"))
                b = 62; 
              break;
            case 1302251347:
              if (str.equals("paizuri_fastDone"))
                b = 63; 
              break;
            case -362282087:
              if (str.equals("paizuri_startStep"))
                b = 64; 
              break;
            case 738157628:
              if (str.equals("paizuri_cumStart"))
                b = 65; 
              break;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        try {
          String str1;
          String str2;
          int i;
          int j;
          IBlockState iBlockState;
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
              a(L.a(L.GIRLS_JENNY_GIGGLE));
              break;
            case 2:
              a("Huh?");
              a(L.GIRLS_JENNY_HUH[1]);
              break;
            case 3:
              a(L.MISC_PLOB[0], 0.5F);
              str1 = "<" + (Minecraft.func_71410_x()).field_71439_g.func_70005_c_() + "> ";
              str2 = (String)this.p.func_187225_a(u);
              j = -1;
              try {
                switch (str2.hashCode()) {
                  case 109773592:
                    if (str2.equals("strip"))
                      j = 0; 
                    break;
                  case -20842805:
                    if (str2.equals("blowjob"))
                      j = 1; 
                    break;
                  case 95761198:
                    if (str2.equals("doggy"))
                      j = 2; 
                    break;
                  case 64419037:
                    if (str2.equals("boobjob"))
                      j = 3; 
                    break;
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              try {
                switch (j) {
                  case 0:
                    a(str1 + "show Bobs and vegana pls", true);
                    break;
                  case 1:
                    a(str1 + "Give me the sucky sucky and these are yours", true);
                    break;
                  case 2:
                    a(str1 + "Give me the sex pls :)", true);
                    break;
                  case 3:
                    a(str1 + "gib boba OwO", true);
                    break;
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              a(str1 + "sex pls", true);
              break;
            case 4:
              a("Hehe~");
              a(L.a(L.GIRLS_JENNY_GIGGLE));
              break;
            case 5:
              try {
                if (k())
                  cG.d(); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 6:
              a(L.MISC_PLOB[0], 0.25F);
              break;
            case 7:
              q();
              break;
            case 8:
              try {
                a("What are you...");
                a(L.GIRLS_JENNY_MMM[8]);
                this.h = 180.0F;
                if (k())
                  cG.c(); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 9:
              a("eh... boys...");
              a(L.GIRLS_JENNY_LIGHTBREATHING[8]);
              break;
            case 10:
              a("OHOhh...!");
              a(L.GIRLS_JENNY_AFTERSESSIONMOAN[0]);
              break;
            case 11:
              a(L.MISC_BELLJINGLE[0]);
              break;
            case 12:
              try {
                a("Was this really necessary?!");
                a(L.GIRLS_JENNY_HMPH[1], 0.5F);
                if (k())
                  cG.c(); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 13:
              a("Oh~");
              a(L.GIRLS_JENNY_LIGHTBREATHING[8]);
              break;
            case 14:
              a("You like it?~");
              a(L.GIRLS_JENNY_GIGGLE[4]);
              break;
            case 15:
              a("<" + (Minecraft.func_71410_x()).field_71439_g.func_70005_c_() + "> Yee", true);
              a(L.MISC_PLOB[0], 0.5F);
              break;
            case 16:
              a("Hihihi~");
              a(L.GIRLS_JENNY_GIGGLE[2]);
              break;
            case 17:
              try {
                if (k())
                  a(-0.4D, -0.8D, -0.2D, 60.0F, -3.0F); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 18:
              try {
                a(L.a(L.GIRLS_JENNY_LIPSOUND));
                if (k())
                  cG.a(0.02D); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 19:
              try {
                if (U.f.nextInt(5) == 0)
                  a(L.a(L.GIRLS_JENNY_BJMOAN)); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              try {
                a(L.a(L.GIRLS_JENNY_LIPSOUND));
                if (k())
                  cG.a(0.02D); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 20:
              try {
                a(L.a(L.GIRLS_JENNY_MMM));
                a(L.a(L.GIRLS_JENNY_LIPSOUND));
                if (k())
                  cG.a(0.04D); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 21:
              try {
                c(m.SUCKBLOWJOB);
                if (k())
                  cG.d(); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 22:
              c(m.SUCKBLOWJOB);
              break;
            case 23:
              try {
                if (!k())
                  break; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              try {
                if (aK.b)
                  p(); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 24:
            case 25:
              try {
                if (k())
                  try {
                    if (aK.b)
                      p(); 
                  } catch (RuntimeException runtimeException) {
                    throw a(null);
                  }  
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 26:
              a(L.GIRLS_JENNY_BJMOAN[1]);
              break;
            case 27:
              try {
                a(L.GIRLS_JENNY_BJMOAN[7]);
                if (k())
                  cG.a(); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 28:
              a(L.GIRLS_JENNY_AFTERSESSIONMOAN[1]);
              break;
            case 29:
              a(L.GIRLS_JENNY_LIGHTBREATHING[0]);
              break;
            case 30:
              a(L.GIRLS_JENNY_LIGHTBREATHING[1]);
              break;
            case 31:
              a(L.GIRLS_JENNY_LIGHTBREATHING[2]);
              break;
            case 32:
              a(L.GIRLS_JENNY_LIGHTBREATHING[3]);
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
            case 35:
            case 36:
              try {
                if (k()) {
                  cG.c();
                  i();
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 37:
              a(L.MISC_BEDRUSTLE[0]);
              this.h = this.field_70177_z;
              break;
            case 38:
              b("what are you waiting for?~");
              a(L.GIRLS_JENNY_LIGHTBREATHING[9]);
              break;
            case 39:
              b("this ass ain't gonna fuck itself...");
              a(L.GIRLS_JENNY_GIGGLE[0]);
              break;
            case 40:
              a(L.MISC_SLAP[0], 0.75F);
              break;
            case 41:
              aV.a.sendToServer(new cA(N(), (Minecraft.func_71410_x()).field_71439_g.getPersistentID()));
              c(m.WAITDOGGY);
              break;
            case 42:
              a(L.MISC_TOUCH[0]);
              break;
            case 43:
              a(L.MISC_TOUCH[1]);
              break;
            case 44:
              a(L.MISC_BEDRUSTLE[1], 0.5F);
              break;
            case 45:
              try {
                a(L.a(L.MISC_SMALLINSERTS));
                a(L.GIRLS_JENNY_MMM[1]);
                if (k())
                  cG.c(); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 46:
              a(L.a(L.MISC_POUNDING), 0.33F);
              a(L.a(L.GIRLS_JENNY_MOAN));
              break;
            case 47:
              try {
                c(m.DOGGYSLOW);
                if (k())
                  cG.d(); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 48:
              a(L.a(L.MISC_POUNDING), 0.33F);
              i = U.f.nextInt(4);
              if (i == 0) {
                i = U.f.nextInt(2);
                try {
                  if (i == 0) {
                    a(L.a(L.GIRLS_JENNY_MMM));
                  } else {
                    a(L.a(L.GIRLS_JENNY_MOAN));
                  } 
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                } 
              } else {
                a(L.a(L.GIRLS_JENNY_HEAVYBREATHING));
              } 
              try {
                if (k())
                  cG.a(0.00666D); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 49:
              a(L.a(L.GIRLS_JENNY_LIGHTBREATHING), 0.5F);
              break;
            case 50:
              try {
                a(L.a(L.MISC_POUNDING), 0.75F);
                if (k())
                  cG.a(0.02D); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              this.am++;
              if (this.am % 2 == 0) {
                j = U.f.nextInt(2);
                try {
                  if (j == 0) {
                    a(L.a(L.GIRLS_JENNY_MOAN));
                    break;
                  } 
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                } 
                a(L.a(L.GIRLS_JENNY_HEAVYBREATHING));
                break;
              } 
              a(L.a(L.GIRLS_JENNY_AHH));
              break;
            case 51:
              c(m.DOGGYSLOW);
              break;
            case 52:
              a(L.MISC_CUMINFLATION[0], 2.0F);
              a(L.a(L.MISC_POUNDING), 2.0F);
              a(L.a(L.GIRLS_JENNY_MOAN));
              break;
            case 53:
              a(L.GIRLS_JENNY_HEAVYBREATHING[4]);
              break;
            case 54:
              a(L.GIRLS_JENNY_HEAVYBREATHING[5]);
              break;
            case 55:
              a(L.GIRLS_JENNY_HEAVYBREATHING[6]);
              break;
            case 56:
              a(L.GIRLS_JENNY_HEAVYBREATHING[7]);
              break;
            case 57:
              aV.a.sendToServer(new co(N()));
              break;
            case 58:
              try {
                if (k())
                  try {
                    if (!this.an) {
                      this.an = true;
                      this.h = 180.0F;
                      a(-0.7D, -0.6D, -0.2D, 60.0F, -3.0F);
                    } 
                  } catch (RuntimeException runtimeException) {
                    throw a(null);
                  }  
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 59:
              try {
                if (k()) {
                  c(m.PAIZURI_SLOW);
                  cG.c();
                  cG.d();
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 60:
              try {
                a(L.a(L.MISC_POUNDING));
                if (func_70681_au().nextBoolean()) {
                  a(L.a(L.GIRLS_JENNY_MMM));
                } else {
                  a(L.a(L.GIRLS_JENNY_AHH));
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
            case 61:
            case 62:
              try {
                a(L.a(L.MISC_POUNDING));
                if (k())
                  cG.a(0.02D); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 63:
              try {
                c(m.PAIZURI_SLOW);
                if (k())
                  try {
                    if (!this.an) {
                      this.an = true;
                      a(-0.7D, -0.6D, -0.2D, 60.0F, -3.0F);
                    } 
                  } catch (RuntimeException runtimeException) {
                    throw a(null);
                  }  
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            case 64:
              iBlockState = this.field_70170_p.func_180495_p(func_180425_c().func_177973_b(new Vec3i(0, 1, 0)));
              a(iBlockState.func_177230_c().getSoundType(iBlockState, this.field_70170_p, func_180425_c(), (Entity)this).func_185844_d());
              break;
            case 65:
              try {
                if (k())
                  try {
                    if (!this.an)
                      a(-0.7D, -0.6D, -0.2D, 60.0F, -3.0F); 
                  } catch (RuntimeException runtimeException) {
                    throw a(null);
                  }  
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
    paramAnimationData.addAnimationController(this.k);
    paramAnimationData.addAnimationController(this.q);
    paramAnimationData.addAnimationController(this.o);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\bi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */