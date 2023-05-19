package com.schnurritv.sexmod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.SoundKeyframeEvent;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;

public class be extends bI {
  public static final DataParameter<Boolean> az = EntityDataManager.func_187226_a(be.class, DataSerializers.field_187198_h).func_187156_b().func_187161_a(126);
  
  m at = null;
  
  boolean as = false;
  
  boolean ax = true;
  
  boolean aw = true;
  
  boolean av = false;
  
  boolean au = false;
  
  String ay = "";
  
  public be(World paramWorld) {
    super(paramWorld);
  }
  
  public be(World paramWorld, UUID paramUUID) {
    super(paramWorld, paramUUID);
  }
  
  public float e() {
    return 0.9F;
  }
  
  public o b(int paramInt) {
    return new cZ();
  }
  
  public String a(int paramInt) {
    return "textures/entity/kobold/hand.png";
  }
  
  public Vec3i c(int paramInt) {
    String[] arrayOfString = a(this);
    try {
      if (arrayOfString.length < 8)
        return super.c(paramInt); 
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    return G.values()[Integer.parseInt(arrayOfString[7])].a();
  }
  
  protected void func_70088_a() {
    super.func_70088_a();
    aD aD = aD.values()[func_70681_au().nextInt((aD.values()).length)];
    this.p.func_187214_a(am, new BlockPos(aD.a()));
    this.p.func_187214_a(an, bf.ar.name());
    this.p.func_187214_a(az, Boolean.valueOf(false));
  }
  
  public void b(String paramString, UUID paramUUID) {
    try {
      if ("anal".equals(paramString)) {
        d(paramUUID);
        c(m.NELSON_INTRO);
        a(L(), m.NELSON_INTRO);
        c(0);
      } 
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    try {
      if ("paizuri".equals(paramString)) {
        d(paramUUID);
        c(m.PAIZURI_START);
        a(L(), m.PAIZURI_START);
        c(0);
      } 
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
  }
  
  @SideOnly(Side.CLIENT)
  public boolean a(EntityPlayer paramEntityPlayer) {
    Minecraft.func_71410_x().func_147108_a(new X(this, paramEntityPlayer, new String[] { "anal", "paizuri" }, null, false));
    return true;
  }
  
  protected String a(StringBuilder paramStringBuilder) {
    br.a(paramStringBuilder, 3);
    br.a(paramStringBuilder, 2);
    br.a(paramStringBuilder, 2);
    br.a(paramStringBuilder, 7);
    br.a(paramStringBuilder, 7);
    br.a(paramStringBuilder, 5);
    br.a(paramStringBuilder, (F.values()).length - 1);
    br.a(paramStringBuilder, (G.values()).length - 1);
    br.a(paramStringBuilder, (aD.values()).length - 1);
    br.c(paramStringBuilder, 0);
    return paramStringBuilder.toString();
  }
  
  public ArrayList<Integer> J() {
    return new b();
  }
  
  public List<Integer> x() {
    return Collections.singletonList(Integer.valueOf(2));
  }
  
  protected void k() {
    bD.d();
    b2.c();
  }
  
  public float func_70047_e() {
    return 0.75F;
  }
  
  public void func_70071_h_() {
    try {
      super.func_70071_h_();
      if (!this.field_70170_p.field_72995_K)
        return; 
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    m m1 = o();
    b(m1);
    a(m1);
    this.at = m1;
  }
  
  public void D() {
    super.D();
    this.p.func_187227_b(az, Boolean.valueOf(false));
  }
  
  @SideOnly(Side.CLIENT)
  void a(m paramm) {
    try {
      if (paramm == m.NELSON_FAST)
        try {
          if (this.at != m.NELSON_FAST)
            this.av = false; 
        } catch (RuntimeException runtimeException) {
          throw c(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
  }
  
  @SideOnly(Side.CLIENT)
  void b(m paramm) {
    Minecraft minecraft = Minecraft.func_71410_x();
    try {
      if (!minecraft.field_71439_g.getPersistentID().equals(n()))
        return; 
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    try {
      if (minecraft.field_71474_y.field_74320_O != 0)
        return; 
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    try {
      switch (a.a[paramm.ordinal()]) {
        case 1:
        case 2:
        case 3:
        case 4:
          minecraft.field_71474_y.field_74320_O = 2;
          break;
      } 
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
  }
  
  public void a(List<Integer> paramList) {
    StringBuilder stringBuilder = new StringBuilder();
    Iterator<Integer> iterator = paramList.iterator();
    while (iterator.hasNext()) {
      int i = ((Integer)iterator.next()).intValue();
      br.c(stringBuilder, i);
    } 
    br.c(stringBuilder, 1);
    this.p.func_187227_b(ao, stringBuilder.toString());
  }
  
  @Nullable
  protected m b(m paramm) {
    try {
      switch (a.a[paramm.ordinal()]) {
        case 5:
        case 6:
          return m.PAIZURI_FAST;
        case 7:
          return m.BREEDING_FAST_0;
        case 8:
          return m.BREEDING_FAST_2;
        case 4:
          return m.NELSON_FAST;
      } 
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    return null;
  }
  
  public void c(m paramm) {
    m m1 = o();
    try {
      if (m1 == m.PAIZURI_CUM)
        try {
          if (paramm != m.PAIZURI_SLOW) {
            try {
              if (paramm == m.PAIZURI_FAST)
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
      if (m1 == m.NELSON_CUM)
        try {
          if (paramm != m.NELSON_SLOW) {
            try {
              if (paramm == m.NELSON_FAST)
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
      if (m1 == m.BREEDING_CUM_0)
        try {
          if (paramm != m.BREEDING_SLOW_0) {
            try {
              if (paramm == m.BREEDING_FAST_0)
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
      if (paramm == m.PAIZURI_START)
        try {
          if (!this.field_70170_p.field_72995_K)
            m(); 
        } catch (RuntimeException runtimeException) {
          throw c(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    try {
      if (paramm == m.NELSON_INTRO)
        try {
          if (!this.field_70170_p.field_72995_K)
            l(); 
        } catch (RuntimeException runtimeException) {
          throw c(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    try {
      if (paramm == m.NELSON_CUM)
        this.p.func_187227_b(az, Boolean.valueOf(true)); 
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    try {
      if (m1 == m.NELSON_CUM)
        try {
          if (paramm != m.NELSON_CUM)
            this.p.func_187227_b(az, Boolean.valueOf(false)); 
        } catch (RuntimeException runtimeException) {
          throw c(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    super.c(paramm);
  }
  
  void l() {
    EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(n());
    try {
      if (entityPlayer == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    a(entityPlayer.field_70177_z);
    this.field_70145_X = true;
    func_189654_d(true);
    entityPlayer.func_189654_d(true);
    entityPlayer.field_70145_X = true;
    entityPlayer.func_70634_a(entityPlayer.field_70165_t, entityPlayer.field_70163_u, entityPlayer.field_70161_v - 1.0D);
  }
  
  void m() {
    EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(n());
    try {
      if (entityPlayer == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    a(entityPlayer.field_70177_z + 180.0F);
    this.field_70145_X = true;
    func_189654_d(true);
    entityPlayer.func_189654_d(true);
    entityPlayer.field_70145_X = true;
    entityPlayer.func_70634_a(entityPlayer.field_70165_t, entityPlayer.field_70163_u - 0.5D, entityPlayer.field_70161_v - 0.6000000238418579D);
    entityPlayer.field_70125_A = 70.0F;
    entityPlayer.field_70127_C = 70.0F;
  }
  
  protected m a(m paramm) {
    try {
      switch (a.a[paramm.ordinal()]) {
        case 6:
        case 9:
        case 10:
          return m.PAIZURI_CUM;
        case 11:
          return m.BREEDING_CUM_1;
        case 8:
        case 12:
          return m.BREEDING_CUM_2;
        case 2:
        case 4:
          return m.NELSON_CUM;
      } 
    } catch (RuntimeException runtimeException) {
      throw c(null);
    } 
    return null;
  }
  
  protected <E extends software.bernie.geckolib3.core.IAnimatable> PlayState a(AnimationEvent<E> paramAnimationEvent) {
    try {
      if (this.field_70170_p instanceof com.c)
        return PlayState.STOP; 
    } catch (RuntimeException runtimeException) {
      throw c(null);
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
      throw c(null);
    } 
    try {
      switch (b) {
        case 0:
          try {
            if (o() == m.NULL) {
              try {
                if ((o()).autoBlink) {
                  a("animation.goblin.blink", true, paramAnimationEvent);
                  break;
                } 
                a("animation.goblin.null", true, paramAnimationEvent);
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              break;
            } 
          } catch (RuntimeException runtimeException) {
            throw c(null);
          } 
          a("animation.goblin.null", true, paramAnimationEvent);
        case 1:
          try {
            if (o() != m.NULL) {
              a("animation.goblin.null", true, paramAnimationEvent);
              break;
            } 
          } catch (RuntimeException runtimeException) {
            throw c(null);
          } 
          try {
            if (this.Z) {
              a("animation.goblin.sit", true, paramAnimationEvent);
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
                      this.as = !this.as;
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
              a("animation.goblin.fly" + (this.as ? "2" : ""), true, paramAnimationEvent);
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
                  a("animation.goblin.running", true, paramAnimationEvent);
                  break;
                } 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              try {
                if (this.Y.y >= -0.1F) {
                  this.q.setAnimationSpeed(2.0D);
                  a("animation.goblin.walk", true, paramAnimationEvent);
                  break;
                } 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              this.q.setAnimationSpeed(1.5D);
              a("animation.goblin.backwards_walk", true, paramAnimationEvent);
              break;
            } 
          } catch (RuntimeException runtimeException) {
            throw c(null);
          } 
          a("animation.goblin.idle", true, paramAnimationEvent);
          break;
        case 2:
          try {
            switch (a.a[o().ordinal()]) {
              case 13:
                a("animation.goblin.null", true, paramAnimationEvent);
                break;
              case 14:
                a("animation.goblin.strip", false, paramAnimationEvent);
                break;
              case 15:
                a("animation.goblin.attack" + this.T, false, paramAnimationEvent);
                break;
              case 16:
                a("animation.goblin.bowcharge", false, paramAnimationEvent);
                break;
              case 17:
                a("animation.goblin.sit", true, paramAnimationEvent);
                break;
              case 3:
                a("animation.goblin.nelson_intro", true, paramAnimationEvent);
                break;
              case 4:
                try {
                
                } catch (RuntimeException runtimeException) {
                  throw c(null);
                } 
                a("animation.goblin.nelson_slow" + (this.aw ? "" : "2"), true, paramAnimationEvent);
                break;
              case 2:
                try {
                
                } catch (RuntimeException runtimeException) {
                  throw c(null);
                } 
                a("animation.goblin.nelson_fast" + (this.av ? "c" : "s"), true, paramAnimationEvent);
                break;
              case 1:
                a("animation.goblin.nelson_cum", true, paramAnimationEvent);
                break;
              case 18:
                a("animation.goblin.breeding_intro_1", true, paramAnimationEvent);
                break;
              case 19:
                a("animation.goblin.breeding_intro_2", true, paramAnimationEvent);
                break;
              case 20:
                a("animation.goblin.breeding_intro_3", true, paramAnimationEvent);
                break;
              case 7:
                try {
                
                } catch (RuntimeException runtimeException) {
                  throw c(null);
                } 
                a("animation.goblin.breeding_slow_1" + (this.ax ? "l" : "r"), true, paramAnimationEvent);
                break;
              case 8:
                a("animation.goblin.breeding_slow_3", true, paramAnimationEvent);
                break;
              case 21:
                try {
                
                } catch (RuntimeException runtimeException) {
                  throw c(null);
                } 
                a("animation.goblin.breeding_fast_1" + (this.au ? "c" : "s"), true, paramAnimationEvent);
                break;
              case 12:
                a("animation.goblin.breeding_fast_3", true, paramAnimationEvent);
                break;
              case 22:
                a("animation.goblin.breeding_cum_1", true, paramAnimationEvent);
                break;
              case 23:
                a("animation.goblin.breeding_cum_2", true, paramAnimationEvent);
                break;
              case 24:
                a("animation.goblin.breeding_cum_3", true, paramAnimationEvent);
                break;
              case 11:
                a("animation.goblin.breeding_2", true, paramAnimationEvent);
                break;
              case 25:
                a("animation.goblin.paizuri_start", true, paramAnimationEvent);
                break;
              case 6:
                a("animation.goblin.paizuri_slow" + this.ay, true, paramAnimationEvent);
                break;
              case 9:
                a("animation.goblin.paizuri_fast", true, paramAnimationEvent);
                break;
              case 10:
                a("animation.goblin.paizuri_fast_countinues", true, paramAnimationEvent);
                break;
              case 5:
                a("animation.goblin.paizuri_idle", true, paramAnimationEvent);
                break;
              case 26:
                a("animation.goblin.paizuri_cum", true, paramAnimationEvent);
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
            case 555758782:
              if (str.equals("catchEh"))
                b = 1; 
              break;
            case 1911168065:
              if (str.equals("catchAkward"))
                b = 2; 
              break;
            case 1508781609:
              if (str.equals("catchWell"))
                b = 3; 
              break;
            case -1906421909:
              if (str.equals("catchRather"))
                b = 4; 
              break;
            case 555759027:
              if (str.equals("catchMe"))
                b = 5; 
              break;
            case 1508225245:
              if (str.equals("catchDone"))
                b = 6; 
              break;
            case 1937367685:
              if (str.equals("catchBjDone"))
                b = 7; 
              break;
            case -257095285:
              if (str.equals("paizuriChoice"))
                b = 8; 
              break;
            case -85206549:
              if (str.equals("paizuriBoth"))
                b = 9; 
              break;
            case -1471320445:
              if (str.equals("paizruiUse"))
                b = 10; 
              break;
            case 214655774:
              if (str.equals("paizuriSwitch"))
                b = 11; 
              break;
            case 110550847:
              if (str.equals("touch"))
                b = 12; 
              break;
            case 106857100:
              if (str.equals("pound"))
                b = 13; 
              break;
            case -362733489:
              if (str.equals("paizuri_startDone"))
                b = 14; 
              break;
            case 1179204456:
              if (str.equals("paizuriFastDone"))
                b = 15; 
              break;
            case -2086748547:
              if (str.equals("paizuriFastReady"))
                b = 16; 
              break;
            case -773653315:
              if (str.equals("paizuriFastContinuesReady"))
                b = 17; 
              break;
            case -1402440057:
              if (str.equals("neslon_fastBackSwitch"))
                b = 18; 
              break;
            case 1216022981:
              if (str.equals("smallPound"))
                b = 19; 
              break;
            case -1471338293:
              if (str.equals("paizruiCam"))
                b = 20; 
              break;
            case 403702091:
              if (str.equals("blackScreen"))
                b = 21; 
              break;
            case 403932052:
              if (str.equals("cumSound"))
                b = 22; 
              break;
            case -1255179071:
              if (str.equals("jumpCam"))
                b = 23; 
              break;
            case -1502522566:
              if (str.equals("breedingHmm"))
                b = 24; 
              break;
            case -816950732:
              if (str.equals("breedingFound"))
                b = 25; 
              break;
            case 414606590:
              if (str.equals("breedingEnough"))
                b = 26; 
              break;
            case 666280273:
              if (str.equals("breedingCam2"))
                b = 27; 
              break;
            case 642185664:
              if (str.equals("breedingIntroDone"))
                b = 28; 
              break;
            case -1257666335:
              if (str.equals("breeding_slow1Done"))
                b = 29; 
              break;
            case -2057479322:
              if (str.equals("breeding_fast1Done"))
                b = 30; 
              break;
            case 655269439:
              if (str.equals("breeding_fast1Ready"))
                b = 31; 
              break;
            case 98875:
              if (str.equals("cum"))
                b = 32; 
              break;
            case -1999384079:
              if (str.equals("breeding_intro_3Done"))
                b = 33; 
              break;
            case -1532770072:
              if (str.equals("breeding_3_wiggle"))
                b = 34; 
              break;
            case 1942611875:
              if (str.equals("breeding_fast_3Done"))
                b = 35; 
              break;
            case -2000307600:
              if (str.equals("breeding_intro_2Done"))
                b = 36; 
              break;
            case 1258509061:
              if (str.equals("breeding_cumCam"))
                b = 37; 
              break;
            case -1583482882:
              if (str.equals("neslon_introDone"))
                b = 38; 
              break;
            case 408494917:
              if (str.equals("nelson_slowDone"))
                b = 39; 
              break;
            case 45790400:
              if (str.equals("neslon_fastSwitch"))
                b = 40; 
              break;
            case 662391035:
              if (str.equals("nelsonFastDone"))
                b = 41; 
              break;
            case 989222323:
              if (str.equals("paizuriCumDone"))
                b = 42; 
              break;
            case -1186189829:
              if (str.equals("nelson_cumDone"))
                b = 43; 
              break;
          } 
        } catch (RuntimeException runtimeException) {
          throw c(null);
        } 
        try {
          EntityPlayerSP entityPlayerSP;
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
              b("ehh..");
              a(L.MISC_PLOB);
              break;
            case 2:
              b("awkward..");
              a(L.MISC_PLOB);
              break;
            case 3:
              b("well...");
              a(L.MISC_PLOB);
              break;
            case 4:
              b("would you rather have this stupid... thing?");
              a(L.MISC_PLOB);
              break;
            case 5:
              b("...or use me?~");
              a(L.MISC_PLOB);
              break;
            case 6:
              try {
                if ("bj".equals(this.p.func_187225_a(u)))
                  c(m.CATCH_BJ); 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              break;
            case 7:
              c(m.CATCH_BJ_IDLE);
              if (k()) {
                EntityPlayerSP entityPlayerSP1 = (Minecraft.func_71410_x()).field_71439_g;
                a((EntityPlayer)entityPlayerSP1, this, new String[] { "use her", "take ur stuff back" }, (ItemStack[])null, false);
              } 
              break;
            case 8:
              b("good choice!~");
              a(L.MISC_PLOB);
              break;
            case 9:
              b("...for both of us!");
              a(L.MISC_PLOB);
              break;
            case 10:
              b("now use me like a fuck toy!~");
              a(L.MISC_PLOB);
              break;
            case 11:
              try {
                if (func_70681_au().nextBoolean())
                  break; 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              try {
              
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              this.ay = "".equals(this.ay) ? "2" : "";
              break;
            case 12:
              a(L.MISC_TOUCH, 3.0F);
              break;
            case 13:
              try {
                a(L.MISC_POUNDING);
                if (k())
                  cG.a(0.03999999910593033D); 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              break;
            case 14:
              try {
                c(m.PAIZURI_IDLE);
                if (k())
                  cG.d(); 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              break;
            case 15:
              c(m.PAIZURI_SLOW);
              break;
            case 16:
              try {
                if (!k())
                  break; 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              try {
                if (aK.b)
                  c(m.PAIZURI_FAST_CONTINUES); 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              break;
            case 17:
            case 18:
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
            case 19:
              try {
                a(L.MISC_POUNDING, 0.25F);
                if (k())
                  cG.a(0.019999999552965164D); 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              break;
            case 20:
              try {
                if (!k())
                  break; 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              entityPlayerSP = (Minecraft.func_71410_x()).field_71439_g;
              ((EntityPlayer)entityPlayerSP).field_70125_A = 70.0F;
              ((EntityPlayer)entityPlayerSP).field_70127_C = 70.0F;
              break;
            case 21:
              try {
                if (k())
                  bd.b(); 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              break;
            case 22:
              a(L.MISC_SMALLINSERTS, 3.0F);
              break;
            case 23:
              if (k()) {
                Minecraft minecraft = Minecraft.func_71410_x();
                minecraft.field_71439_g.field_70177_z = s().floatValue() + 170.0F;
                minecraft.field_71439_g.field_70125_A = -20.0F;
                minecraft.field_71439_g.field_70759_as = minecraft.field_71439_g.field_70177_z;
                minecraft.field_71474_y.field_74320_O = 2;
              } 
              break;
            case 24:
              if (k()) {
                Minecraft minecraft = Minecraft.func_71410_x();
                minecraft.field_71439_g.field_70177_z = s().floatValue() + 180.0F;
                minecraft.field_71439_g.field_70125_A = -15.0F;
                minecraft.field_71439_g.field_70759_as = minecraft.field_71439_g.field_70177_z;
                minecraft.field_71474_y.field_74320_O = 0;
              } 
              b("hmm...");
              a(L.MISC_PLOB);
              break;
            case 25:
              b("guess we found a worthy breeding partner!");
              a(L.MISC_PLOB);
              break;
            case 26:
              b("Eh.. go pin him down, before he runs off!");
              a(L.MISC_PLOB);
              break;
            case 27:
              if (k()) {
                Minecraft minecraft = Minecraft.func_71410_x();
                minecraft.field_71474_y.field_74320_O = 2;
                minecraft.field_71439_g.field_70177_z = s().floatValue() - 120.0F;
                minecraft.field_71439_g.field_70125_A = -30.0F;
              } 
            case 28:
              try {
                c(m.BREEDING_SLOW_0);
                if (k())
                  cG.d(); 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              break;
            case 29:
              try {
                if (func_70681_au().nextBoolean()) {
                  try {
                  
                  } catch (RuntimeException runtimeException) {
                    throw c(null);
                  } 
                  this.ax = !this.ax;
                } 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              try {
                if (k())
                  try {
                    if (aK.b) {
                      c(m.BREEDING_FAST_0);
                      this.au = false;
                    } 
                  } catch (RuntimeException runtimeException) {
                    throw c(null);
                  }  
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              break;
            case 30:
              try {
                c(m.BREEDING_SLOW_0);
                if (!k())
                  break; 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              this.au = false;
              break;
            case 31:
              try {
                if (!k())
                  break; 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              try {
                if (aK.b) {
                  this.au = true;
                  p();
                  this.k.tickOffset = 0.0D;
                } 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              break;
            case 32:
              a(L.MISC_SMALLINSERTS, 2.0F);
              break;
            case 33:
              c(m.BREEDING_SLOW_2);
              break;
            case 34:
              try {
                if (func_70681_au().nextBoolean())
                  this.k.tickOffset = 0.0D; 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              break;
            case 35:
              try {
                if (!k())
                  break; 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              try {
                if (!aK.b)
                  c(m.BREEDING_SLOW_2); 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              break;
            case 36:
              c(m.BREEDING_1);
              break;
            case 37:
              if (k()) {
                Minecraft minecraft = Minecraft.func_71410_x();
                minecraft.field_71474_y.field_74320_O = 0;
                minecraft.field_71439_g.field_70177_z = s().floatValue() + 180.0F;
                minecraft.field_71439_g.field_70125_A = -15.0F;
                minecraft.field_71439_g.field_70759_as = minecraft.field_71439_g.field_70177_z;
                minecraft.field_71474_y.field_74320_O = 0;
              } 
              break;
            case 38:
              try {
                c(m.NELSON_SLOW);
                if (k())
                  cG.d(); 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              break;
            case 39:
              try {
                if (func_70681_au().nextBoolean()) {
                  try {
                  
                  } catch (RuntimeException runtimeException) {
                    throw c(null);
                  } 
                  this.aw = !this.aw;
                } 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              break;
            case 40:
              try {
                if (!k()) {
                  this.av = true;
                  return;
                } 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              try {
                if (aK.b)
                  this.av = true; 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              break;
            case 41:
              try {
                this.av = false;
                if (k())
                  c(m.NELSON_SLOW); 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              break;
            case 42:
            case 43:
              try {
                if (k()) {
                  i();
                  c(m.NULL);
                } 
              } catch (RuntimeException runtimeException) {
                throw c(null);
              } 
              break;
          } 
        } catch (RuntimeException runtimeException) {
          throw c(null);
        } 
      };
    this.k.registerSoundListener(iSoundListener);
    this.q.transitionLengthTicks = 2.0D;
    paramAnimationData.addAnimationController(this.k);
    paramAnimationData.addAnimationController(this.q);
    paramAnimationData.addAnimationController(this.o);
  }
  
  private static RuntimeException c(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  class b extends ArrayList<Integer> {
    b() {
      add(Integer.valueOf(4));
      add(Integer.valueOf(3));
      add(Integer.valueOf(3));
      add(Integer.valueOf(16));
      add(Integer.valueOf(16));
      add(Integer.valueOf(6));
      add(Integer.valueOf((F.values()).length));
      add(Integer.valueOf((G.values()).length));
      add(Integer.valueOf((aD.values()).length));
    }
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\be.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */