package com.schnurritv.sexmod;

import com.google.common.base.Optional;
import java.util.UUID;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.SoundKeyframeEvent;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;

public class bb extends bo {
  boolean am = false;
  
  boolean al = false;
  
  int an = 1;
  
  protected bb(World paramWorld) {
    super(paramWorld);
  }
  
  public bb(World paramWorld, UUID paramUUID) {
    super(paramWorld, paramUUID);
  }
  
  public float e() {
    return 2.05F;
  }
  
  public float func_70047_e() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return a() ? 1.53F : 1.9F;
  }
  
  public void b() {
    c(m.SITDOWN);
  }
  
  public void b(String paramString, UUID paramUUID) {
    try {
      if ("Face fuck".equals(paramString)) {
        d(paramUUID);
        c(m.CARRY_INTRO);
        a(L(), m.CARRY_INTRO);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public o b(int paramInt) {
    return new ct();
  }
  
  public String a(int paramInt) {
    try {
      if (paramInt == 0)
        return "textures/entity/ellie/hand_nude.png"; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return "textures/entity/ellie/hand.png";
  }
  
  public boolean l() {
    return true;
  }
  
  public void a(String paramString, UUID paramUUID) {
    try {
      if ("action.names.cowgirl".equals(paramString)) {
        a("animationFollowUp", "Cowgirl");
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if ("action.names.missionary".equals(paramString)) {
        a("animationFollowUp", "Missionary");
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!((Optional)this.p.func_187225_a(ak)).isPresent())
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    aV.a.sendToServer(new ap(paramString, paramUUID, (UUID)((Optional)this.p.func_187225_a(ak)).get(), this.af));
    this.af = true;
  }
  
  public boolean a(EntityPlayer paramEntityPlayer) {
    a(paramEntityPlayer, this, new String[] { "Face fuck" }, false);
    return true;
  }
  
  void a(EntityPlayer paramEntityPlayer) {
    a(paramEntityPlayer, this, new String[] { "action.names.cowgirl", "action.names.missionary" }, false);
  }
  
  public boolean n() {
    return true;
  }
  
  public void c(m paramm) {
    m m1 = o();
    try {
      if (m1 == m.MISSIONARY_CUM)
        try {
          if (paramm != m.MISSIONARY_FAST) {
            try {
              if (paramm == m.MISSIONARY_SLOW)
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
      if (m1 == m.COWGIRLCUM)
        try {
          if (paramm != m.COWGIRLSLOW) {
            try {
              if (paramm == m.COWGIRLFAST)
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
      if (paramm == m.COWGIRLSLOW)
        return m.COWGIRLFAST; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramm == m.MISSIONARY_SLOW)
        return m.MISSIONARY_FAST; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramm == m.CARRY_SLOW)
        return m.CARRY_FAST; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return null;
  }
  
  protected m a(m paramm) {
    try {
      if (paramm != m.COWGIRLFAST) {
        try {
          if (paramm == m.COWGIRLSLOW)
            return m.COWGIRLCUM; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } else {
        return m.COWGIRLCUM;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramm != m.MISSIONARY_FAST) {
        try {
          if (paramm == m.MISSIONARY_SLOW)
            return m.MISSIONARY_CUM; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } else {
        return m.MISSIONARY_CUM;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramm != m.CARRY_SLOW)
        try {
          return (paramm != m.CARRY_FAST) ? null : m.CARRY_CUM;
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return m.CARRY_CUM;
  }
  
  public void func_70619_bc() {
    super.func_70619_bc();
    if (o() == m.SITDOWNIDLE) {
      String str = (String)this.p.func_187225_a(bS.u);
      try {
        if (!"Missionary".equals(str))
          try {
            if (!"Cowgirl".equals(str))
              return; 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      EntityPlayer entityPlayer = w();
      try {
        if (entityPlayer != null) {
          try {
            if (entityPlayer.func_70011_f((t()).field_72450_a, (t()).field_72448_b, (t()).field_72449_c) > 1.0D)
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
      this.p.func_187227_b(bS.u, "");
      this.p.func_187227_b(bS.F, Integer.valueOf(0));
      e(entityPlayer.getPersistentID());
      EntityPlayerMP entityPlayerMP = (EntityPlayerMP)this.field_70170_p.func_152378_a((UUID)((Optional)this.p.func_187225_a(ak)).get());
      aV.a.sendTo(new aw(false), (EntityPlayerMP)entityPlayer);
      aV.a.sendTo(new aw(false), entityPlayerMP);
      entityPlayer.func_191958_b(0.0F, 0.0F, 0.0F, 0.0F);
      entityPlayerMP.field_71075_bZ.field_75100_b = true;
      entityPlayer.field_71075_bZ.field_75100_b = true;
      entityPlayerMP.field_70145_X = true;
      entityPlayer.field_70145_X = true;
      entityPlayerMP.func_189654_d(true);
      entityPlayer.func_189654_d(true);
      if ("Missionary".equals(str)) {
        c(m.MISSIONARY_START);
        Vec3d vec3d = t().func_178786_a(0.0D, 0.1D, 0.0D);
        entityPlayer.func_70080_a(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c, s().floatValue(), 60.0F);
        entityPlayer.func_70634_a(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c);
      } else {
        c(m.COWGIRLSTART);
        Vec3d vec3d = t().func_178787_e(new Vec3d(-Math.sin(s().floatValue() * 0.017453292519943295D) * 1.8D, -0.65D, Math.cos(s().floatValue() * 0.017453292519943295D) * 1.8D));
        entityPlayer.func_70080_a(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c, 180.0F + s().floatValue(), -30.0F);
        entityPlayer.func_70634_a(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c);
      } 
    } 
  }
  
  boolean a() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (this.field_70170_p.func_180495_p(new BlockPos(t().func_72441_c(0.0D, 2.0D, 0.0D))).func_177230_c() != Blocks.field_150350_a);
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
                  a("animation.ellie.eyes", true, paramAnimationEvent);
                  break;
                } 
                a("animation.ellie.null", true, paramAnimationEvent);
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              break;
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          a("animation.ellie.null", true, paramAnimationEvent);
        case 1:
          try {
            if (o() != m.NULL) {
              a("animation.ellie.null", true, paramAnimationEvent);
              break;
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          try {
            if (this.Z) {
              a("animation.ellie.ride", true, paramAnimationEvent);
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
              a("animation.ellie.fly" + (this.am ? "2" : ""), true, paramAnimationEvent);
              break;
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          try {
            if (Math.abs(this.Y.x) + Math.abs(this.Y.y) > 0.0F) {
              try {
                if (this.ai) {
                  try {
                    this.q.setAnimationSpeed(1.5D);
                  } catch (RuntimeException runtimeException) {
                    throw a(null);
                  } 
                  a(a() ? "animation.ellie.crouchwalk" : "animation.ellie.run", true, paramAnimationEvent);
                  break;
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              try {
                if (this.Y.y >= -0.1F) {
                  try {
                    this.q.setAnimationSpeed(2.0D);
                  } catch (RuntimeException runtimeException) {
                    throw a(null);
                  } 
                  a(a() ? "animation.ellie.crouchwalk" : "animation.ellie.fastwalk", true, paramAnimationEvent);
                  break;
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              try {
                this.q.setAnimationSpeed(1.5D);
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              a(a() ? "animation.ellie.crouchwalk" : "animation.ellie.backwards_walk", true, paramAnimationEvent);
              break;
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          try {
          
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          a(a() ? "animation.ellie.crouchidle" : "animation.ellie.idle", true, paramAnimationEvent);
          break;
        case 2:
          try {
            switch (a.a[o().ordinal()]) {
              case 1:
                a("animation.ellie.null", true, paramAnimationEvent);
                break;
              case 2:
                a("animation.ellie.strip", false, paramAnimationEvent);
                break;
              case 3:
                a("animation.ellie.dash", false, paramAnimationEvent);
                break;
              case 4:
                a("animation.ellie.hug", false, paramAnimationEvent);
                break;
              case 5:
                a("animation.ellie.hugidle", true, paramAnimationEvent);
                break;
              case 6:
                a("animation.ellie.hugselected", false, paramAnimationEvent);
                break;
              case 7:
                a("animation.ellie.sitdown", false, paramAnimationEvent);
                break;
              case 8:
                a("animation.ellie.sitdownidle", true, paramAnimationEvent);
                break;
              case 9:
                a("animation.ellie.cowgirlstart", false, paramAnimationEvent);
                break;
              case 10:
                a("animation.ellie.cowgirlslow2", true, paramAnimationEvent);
                break;
              case 11:
                a("animation.ellie.cowgirlfast", true, paramAnimationEvent);
                break;
              case 12:
                a("animation.ellie.cowgirlcum", true, paramAnimationEvent);
                break;
              case 13:
                a("animation.ellie.attack" + this.T, false, paramAnimationEvent);
                break;
              case 14:
                a("animation.ellie.bowcharge", false, paramAnimationEvent);
                break;
              case 15:
                a("animation.ellie.ride", true, paramAnimationEvent);
                break;
              case 16:
                a("animation.ellie.sit", true, paramAnimationEvent);
                break;
              case 17:
                a("animation.ellie.throwpearl", false, paramAnimationEvent);
                break;
              case 18:
                a("animation.ellie.downed", true, paramAnimationEvent);
                break;
              case 19:
                a("animation.ellie.missionary_start", false, paramAnimationEvent);
                break;
              case 20:
                a("animation.ellie.missionary_slow", true, paramAnimationEvent);
                break;
              case 21:
                a("animation.ellie.missionary_fast", true, paramAnimationEvent);
                break;
              case 22:
                a("animation.ellie.missionary_cum", false, paramAnimationEvent);
                break;
              case 23:
                a("animation.ellie.carry_intro", false, paramAnimationEvent);
                break;
              case 24:
                a("animation.ellie.carry_slow" + this.an, true, paramAnimationEvent);
                break;
              case 25:
                a("animation.ellie.carry_fast", true, paramAnimationEvent);
                break;
              case 26:
                a("animation.ellie.carry_cum", true, paramAnimationEvent);
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
      super.registerControllers(paramAnimationData);
      if (this.k == null)
        S(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    AnimationController.ISoundListener iSoundListener = paramSoundKeyframeEvent -> {
        // Byte code:
        //   0: aload_1
        //   1: getfield sound : Ljava/lang/String;
        //   4: astore_2
        //   5: iconst_m1
        //   6: istore_3
        //   7: aload_2
        //   8: invokevirtual hashCode : ()I
        //   11: lookupswitch default -> 1145, -1961942550 -> 893, -1919624234 -> 863, -1919384284 -> 743, -1919384283 -> 758, -1919384282 -> 773, -1919384281 -> 788, -1919384280 -> 803, -1919384279 -> 833, -1729717726 -> 608, -1729477776 -> 593, -1551050723 -> 683, -1550810774 -> 638, -1550810773 -> 653, -1550810772 -> 668, -1464580128 -> 713, -1361514553 -> 1103, -1062935247 -> 433, -300807046 -> 848, -300567096 -> 1013, -300567095 -> 818, -157000319 -> 968, -156760369 -> 953, -91455426 -> 983, 98875 -> 1073, 106540102 -> 908, 106857100 -> 1088, 109331834 -> 1133, 379621455 -> 728, 557828409 -> 878, 690895010 -> 1118, 866127672 -> 1028, 866127673 -> 1043, 1199514355 -> 698, 1235071671 -> 578, 1235311621 -> 548, 1235311622 -> 563, 1257971612 -> 533, 1258211562 -> 461, 1258211563 -> 475, 1258211564 -> 489, 1258211565 -> 503, 1258211566 -> 518, 1259653724 -> 1058, 1459849139 -> 998, 1534823792 -> 923, 1645105121 -> 623, 1766420020 -> 447, 1766659970 -> 412, 2085797364 -> 938
        //   412: aload_2
        //   413: ldc 'dashMSG1'
        //   415: invokevirtual equals : (Ljava/lang/Object;)Z
        //   418: ifeq -> 1145
        //   421: goto -> 428
        //   424: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        //   427: athrow
        //   428: iconst_0
        //   429: istore_3
        //   430: goto -> 1145
        //   433: aload_2
        //   434: ldc 'dashReady'
        //   436: invokevirtual equals : (Ljava/lang/Object;)Z
        //   439: ifeq -> 1145
        //   442: iconst_1
        //   443: istore_3
        //   444: goto -> 1145
        //   447: aload_2
        //   448: ldc 'dashDone'
        //   450: invokevirtual equals : (Ljava/lang/Object;)Z
        //   453: ifeq -> 1145
        //   456: iconst_2
        //   457: istore_3
        //   458: goto -> 1145
        //   461: aload_2
        //   462: ldc 'hugMSG1'
        //   464: invokevirtual equals : (Ljava/lang/Object;)Z
        //   467: ifeq -> 1145
        //   470: iconst_3
        //   471: istore_3
        //   472: goto -> 1145
        //   475: aload_2
        //   476: ldc 'hugMSG2'
        //   478: invokevirtual equals : (Ljava/lang/Object;)Z
        //   481: ifeq -> 1145
        //   484: iconst_4
        //   485: istore_3
        //   486: goto -> 1145
        //   489: aload_2
        //   490: ldc 'hugMSG3'
        //   492: invokevirtual equals : (Ljava/lang/Object;)Z
        //   495: ifeq -> 1145
        //   498: iconst_5
        //   499: istore_3
        //   500: goto -> 1145
        //   503: aload_2
        //   504: ldc 'hugMSG4'
        //   506: invokevirtual equals : (Ljava/lang/Object;)Z
        //   509: ifeq -> 1145
        //   512: bipush #6
        //   514: istore_3
        //   515: goto -> 1145
        //   518: aload_2
        //   519: ldc 'hugMSG5'
        //   521: invokevirtual equals : (Ljava/lang/Object;)Z
        //   524: ifeq -> 1145
        //   527: bipush #7
        //   529: istore_3
        //   530: goto -> 1145
        //   533: aload_2
        //   534: ldc 'hugDone'
        //   536: invokevirtual equals : (Ljava/lang/Object;)Z
        //   539: ifeq -> 1145
        //   542: bipush #8
        //   544: istore_3
        //   545: goto -> 1145
        //   548: aload_2
        //   549: ldc 'hugselectedMSG1'
        //   551: invokevirtual equals : (Ljava/lang/Object;)Z
        //   554: ifeq -> 1145
        //   557: bipush #9
        //   559: istore_3
        //   560: goto -> 1145
        //   563: aload_2
        //   564: ldc 'hugselectedMSG2'
        //   566: invokevirtual equals : (Ljava/lang/Object;)Z
        //   569: ifeq -> 1145
        //   572: bipush #10
        //   574: istore_3
        //   575: goto -> 1145
        //   578: aload_2
        //   579: ldc 'hugselectedDone'
        //   581: invokevirtual equals : (Ljava/lang/Object;)Z
        //   584: ifeq -> 1145
        //   587: bipush #11
        //   589: istore_3
        //   590: goto -> 1145
        //   593: aload_2
        //   594: ldc 'sitdownMSG1'
        //   596: invokevirtual equals : (Ljava/lang/Object;)Z
        //   599: ifeq -> 1145
        //   602: bipush #12
        //   604: istore_3
        //   605: goto -> 1145
        //   608: aload_2
        //   609: ldc 'sitdownDone'
        //   611: invokevirtual equals : (Ljava/lang/Object;)Z
        //   614: ifeq -> 1145
        //   617: bipush #13
        //   619: istore_3
        //   620: goto -> 1145
        //   623: aload_2
        //   624: ldc 'missionary_startDone'
        //   626: invokevirtual equals : (Ljava/lang/Object;)Z
        //   629: ifeq -> 1145
        //   632: bipush #14
        //   634: istore_3
        //   635: goto -> 1145
        //   638: aload_2
        //   639: ldc 'cowgirlStartMSG0'
        //   641: invokevirtual equals : (Ljava/lang/Object;)Z
        //   644: ifeq -> 1145
        //   647: bipush #15
        //   649: istore_3
        //   650: goto -> 1145
        //   653: aload_2
        //   654: ldc 'cowgirlStartMSG1'
        //   656: invokevirtual equals : (Ljava/lang/Object;)Z
        //   659: ifeq -> 1145
        //   662: bipush #16
        //   664: istore_3
        //   665: goto -> 1145
        //   668: aload_2
        //   669: ldc 'cowgirlStartMSG2'
        //   671: invokevirtual equals : (Ljava/lang/Object;)Z
        //   674: ifeq -> 1145
        //   677: bipush #17
        //   679: istore_3
        //   680: goto -> 1145
        //   683: aload_2
        //   684: ldc 'cowgirlStartDone'
        //   686: invokevirtual equals : (Ljava/lang/Object;)Z
        //   689: ifeq -> 1145
        //   692: bipush #18
        //   694: istore_3
        //   695: goto -> 1145
        //   698: aload_2
        //   699: ldc 'cowgirlfastMSG1'
        //   701: invokevirtual equals : (Ljava/lang/Object;)Z
        //   704: ifeq -> 1145
        //   707: bipush #19
        //   709: istore_3
        //   710: goto -> 1145
        //   713: aload_2
        //   714: ldc 'cowgirlfastReady'
        //   716: invokevirtual equals : (Ljava/lang/Object;)Z
        //   719: ifeq -> 1145
        //   722: bipush #20
        //   724: istore_3
        //   725: goto -> 1145
        //   728: aload_2
        //   729: ldc 'cowgirlfastdomMSG1'
        //   731: invokevirtual equals : (Ljava/lang/Object;)Z
        //   734: ifeq -> 1145
        //   737: bipush #21
        //   739: istore_3
        //   740: goto -> 1145
        //   743: aload_2
        //   744: ldc 'cowgirlcumMSG1'
        //   746: invokevirtual equals : (Ljava/lang/Object;)Z
        //   749: ifeq -> 1145
        //   752: bipush #22
        //   754: istore_3
        //   755: goto -> 1145
        //   758: aload_2
        //   759: ldc 'cowgirlcumMSG2'
        //   761: invokevirtual equals : (Ljava/lang/Object;)Z
        //   764: ifeq -> 1145
        //   767: bipush #23
        //   769: istore_3
        //   770: goto -> 1145
        //   773: aload_2
        //   774: ldc 'cowgirlcumMSG3'
        //   776: invokevirtual equals : (Ljava/lang/Object;)Z
        //   779: ifeq -> 1145
        //   782: bipush #24
        //   784: istore_3
        //   785: goto -> 1145
        //   788: aload_2
        //   789: ldc 'cowgirlcumMSG4'
        //   791: invokevirtual equals : (Ljava/lang/Object;)Z
        //   794: ifeq -> 1145
        //   797: bipush #25
        //   799: istore_3
        //   800: goto -> 1145
        //   803: aload_2
        //   804: ldc 'cowgirlcumMSG5'
        //   806: invokevirtual equals : (Ljava/lang/Object;)Z
        //   809: ifeq -> 1145
        //   812: bipush #26
        //   814: istore_3
        //   815: goto -> 1145
        //   818: aload_2
        //   819: ldc 'missionary_cumMSG2'
        //   821: invokevirtual equals : (Ljava/lang/Object;)Z
        //   824: ifeq -> 1145
        //   827: bipush #27
        //   829: istore_3
        //   830: goto -> 1145
        //   833: aload_2
        //   834: ldc 'cowgirlcumMSG6'
        //   836: invokevirtual equals : (Ljava/lang/Object;)Z
        //   839: ifeq -> 1145
        //   842: bipush #28
        //   844: istore_3
        //   845: goto -> 1145
        //   848: aload_2
        //   849: ldc 'missionary_cumDone'
        //   851: invokevirtual equals : (Ljava/lang/Object;)Z
        //   854: ifeq -> 1145
        //   857: bipush #29
        //   859: istore_3
        //   860: goto -> 1145
        //   863: aload_2
        //   864: ldc 'cowgirlcumDone'
        //   866: invokevirtual equals : (Ljava/lang/Object;)Z
        //   869: ifeq -> 1145
        //   872: bipush #30
        //   874: istore_3
        //   875: goto -> 1145
        //   878: aload_2
        //   879: ldc 'carry_cumDone'
        //   881: invokevirtual equals : (Ljava/lang/Object;)Z
        //   884: ifeq -> 1145
        //   887: bipush #31
        //   889: istore_3
        //   890: goto -> 1145
        //   893: aload_2
        //   894: ldc 'attackDone'
        //   896: invokevirtual equals : (Ljava/lang/Object;)Z
        //   899: ifeq -> 1145
        //   902: bipush #32
        //   904: istore_3
        //   905: goto -> 1145
        //   908: aload_2
        //   909: ldc 'pearl'
        //   911: invokevirtual equals : (Ljava/lang/Object;)Z
        //   914: ifeq -> 1145
        //   917: bipush #33
        //   919: istore_3
        //   920: goto -> 1145
        //   923: aload_2
        //   924: ldc 'openSexUi'
        //   926: invokevirtual equals : (Ljava/lang/Object;)Z
        //   929: ifeq -> 1145
        //   932: bipush #34
        //   934: istore_3
        //   935: goto -> 1145
        //   938: aload_2
        //   939: ldc 'missionary_slowMSG1'
        //   941: invokevirtual equals : (Ljava/lang/Object;)Z
        //   944: ifeq -> 1145
        //   947: bipush #35
        //   949: istore_3
        //   950: goto -> 1145
        //   953: aload_2
        //   954: ldc 'missionary_fastMSG1'
        //   956: invokevirtual equals : (Ljava/lang/Object;)Z
        //   959: ifeq -> 1145
        //   962: bipush #36
        //   964: istore_3
        //   965: goto -> 1145
        //   968: aload_2
        //   969: ldc 'missionary_fastDone'
        //   971: invokevirtual equals : (Ljava/lang/Object;)Z
        //   974: ifeq -> 1145
        //   977: bipush #37
        //   979: istore_3
        //   980: goto -> 1145
        //   983: aload_2
        //   984: ldc 'bedRustle'
        //   986: invokevirtual equals : (Ljava/lang/Object;)Z
        //   989: ifeq -> 1145
        //   992: bipush #38
        //   994: istore_3
        //   995: goto -> 1145
        //   998: aload_2
        //   999: ldc 'bedRustle1'
        //   1001: invokevirtual equals : (Ljava/lang/Object;)Z
        //   1004: ifeq -> 1145
        //   1007: bipush #39
        //   1009: istore_3
        //   1010: goto -> 1145
        //   1013: aload_2
        //   1014: ldc 'missionary_cumMSG1'
        //   1016: invokevirtual equals : (Ljava/lang/Object;)Z
        //   1019: ifeq -> 1145
        //   1022: bipush #40
        //   1024: istore_3
        //   1025: goto -> 1145
        //   1028: aload_2
        //   1029: ldc 'carry_introMSG1'
        //   1031: invokevirtual equals : (Ljava/lang/Object;)Z
        //   1034: ifeq -> 1145
        //   1037: bipush #41
        //   1039: istore_3
        //   1040: goto -> 1145
        //   1043: aload_2
        //   1044: ldc 'carry_introMSG2'
        //   1046: invokevirtual equals : (Ljava/lang/Object;)Z
        //   1049: ifeq -> 1145
        //   1052: bipush #42
        //   1054: istore_3
        //   1055: goto -> 1145
        //   1058: aload_2
        //   1059: ldc 'lipsound'
        //   1061: invokevirtual equals : (Ljava/lang/Object;)Z
        //   1064: ifeq -> 1145
        //   1067: bipush #43
        //   1069: istore_3
        //   1070: goto -> 1145
        //   1073: aload_2
        //   1074: ldc 'cum'
        //   1076: invokevirtual equals : (Ljava/lang/Object;)Z
        //   1079: ifeq -> 1145
        //   1082: bipush #44
        //   1084: istore_3
        //   1085: goto -> 1145
        //   1088: aload_2
        //   1089: ldc 'pound'
        //   1091: invokevirtual equals : (Ljava/lang/Object;)Z
        //   1094: ifeq -> 1145
        //   1097: bipush #45
        //   1099: istore_3
        //   1100: goto -> 1145
        //   1103: aload_2
        //   1104: ldc 'carry_slowDone'
        //   1106: invokevirtual equals : (Ljava/lang/Object;)Z
        //   1109: ifeq -> 1145
        //   1112: bipush #46
        //   1114: istore_3
        //   1115: goto -> 1145
        //   1118: aload_2
        //   1119: ldc 'carry_fastDone'
        //   1121: invokevirtual equals : (Ljava/lang/Object;)Z
        //   1124: ifeq -> 1145
        //   1127: bipush #47
        //   1129: istore_3
        //   1130: goto -> 1145
        //   1133: aload_2
        //   1134: ldc 'sexUI'
        //   1136: invokevirtual equals : (Ljava/lang/Object;)Z
        //   1139: ifeq -> 1145
        //   1142: bipush #48
        //   1144: istore_3
        //   1145: iload_3
        //   1146: tableswitch default -> 3040, 0 -> 1356, 1 -> 1428, 2 -> 1442, 3 -> 1495, 4 -> 1586, 5 -> 1606, 6 -> 1626, 7 -> 1653, 8 -> 1680, 9 -> 1723, 10 -> 1750, 11 -> 1777, 12 -> 1981, 13 -> 2019, 14 -> 2055, 15 -> 2082, 16 -> 2096, 17 -> 2126, 18 -> 2170, 19 -> 2194, 20 -> 2257, 21 -> 2316, 22 -> 2348, 23 -> 2375, 24 -> 2401, 25 -> 2416, 26 -> 2433, 27 -> 2433, 28 -> 2471, 29 -> 2488, 30 -> 2488, 31 -> 2488, 32 -> 2509, 33 -> 2536, 34 -> 2556, 35 -> 2573, 36 -> 2661, 37 -> 2749, 38 -> 2793, 39 -> 2815, 40 -> 2827, 41 -> 2842, 42 -> 2860, 43 -> 2880, 44 -> 2907, 45 -> 2926, 46 -> 2953, 47 -> 2989, 48 -> 3023
        //   1356: aload_0
        //   1357: getfield field_70170_p : Lnet/minecraft/world/World;
        //   1360: aload_0
        //   1361: ldc2_w 15.0
        //   1364: invokevirtual func_72890_a : (Lnet/minecraft/entity/Entity;D)Lnet/minecraft/entity/player/EntityPlayer;
        //   1367: astore #4
        //   1369: aload #4
        //   1371: ifnull -> 3040
        //   1374: aload_0
        //   1375: invokevirtual func_174791_d : ()Lnet/minecraft/util/math/Vec3d;
        //   1378: aload #4
        //   1380: invokevirtual func_174791_d : ()Lnet/minecraft/util/math/Vec3d;
        //   1383: invokevirtual func_178788_d : (Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;
        //   1386: astore #5
        //   1388: aload #5
        //   1390: getfield field_72449_c : D
        //   1393: aload #5
        //   1395: getfield field_72450_a : D
        //   1398: invokestatic atan2 : (DD)D
        //   1401: d2f
        //   1402: ldc 57.29578
        //   1404: fmul
        //   1405: fstore #6
        //   1407: aload_0
        //   1408: fload #6
        //   1410: putfield field_70177_z : F
        //   1413: aload_0
        //   1414: fload #6
        //   1416: putfield field_70759_as : F
        //   1419: aload_0
        //   1420: fload #6
        //   1422: putfield field_70761_aq : F
        //   1425: goto -> 3040
        //   1428: aload_0
        //   1429: invokevirtual E : ()Z
        //   1432: ifeq -> 3040
        //   1435: goto -> 3040
        //   1438: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        //   1441: athrow
        //   1442: aload_0
        //   1443: getstatic com/schnurritv/sexmod/m.HUG : Lcom/schnurritv/sexmod/m;
        //   1446: invokevirtual c : (Lcom/schnurritv/sexmod/m;)V
        //   1449: aload_0
        //   1450: getfield field_70170_p : Lnet/minecraft/world/World;
        //   1453: aload_0
        //   1454: ldc2_w 15.0
        //   1457: invokevirtual func_72890_a : (Lnet/minecraft/entity/Entity;D)Lnet/minecraft/entity/player/EntityPlayer;
        //   1460: astore #4
        //   1462: aload #4
        //   1464: ifnull -> 3040
        //   1467: aload #4
        //   1469: getfield field_70177_z : F
        //   1472: fstore #5
        //   1474: aload_0
        //   1475: fload #5
        //   1477: putfield field_70177_z : F
        //   1480: aload_0
        //   1481: fload #5
        //   1483: putfield field_70759_as : F
        //   1486: aload_0
        //   1487: fload #5
        //   1489: putfield field_70761_aq : F
        //   1492: goto -> 3040
        //   1495: invokestatic func_71410_x : ()Lnet/minecraft/client/Minecraft;
        //   1498: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
        //   1501: astore #4
        //   1503: aload #4
        //   1505: invokevirtual getPersistentID : ()Ljava/util/UUID;
        //   1508: aload_0
        //   1509: invokevirtual n : ()Ljava/util/UUID;
        //   1512: invokevirtual equals : (Ljava/lang/Object;)Z
        //   1515: ifne -> 1540
        //   1518: aload #4
        //   1520: invokevirtual func_110124_au : ()Ljava/util/UUID;
        //   1523: aload_0
        //   1524: invokevirtual n : ()Ljava/util/UUID;
        //   1527: invokevirtual equals : (Ljava/lang/Object;)Z
        //   1530: ifeq -> 3040
        //   1533: goto -> 1540
        //   1536: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        //   1539: athrow
        //   1540: getstatic com/schnurritv/sexmod/aV.a : Lnet/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper;
        //   1543: new com/schnurritv/sexmod/an
        //   1546: dup
        //   1547: aload #4
        //   1549: invokevirtual func_110124_au : ()Ljava/util/UUID;
        //   1552: invokevirtual toString : ()Ljava/lang/String;
        //   1555: aload #4
        //   1557: invokevirtual func_174791_d : ()Lnet/minecraft/util/math/Vec3d;
        //   1560: aload #4
        //   1562: getfield field_70177_z : F
        //   1565: ldc 80.0
        //   1567: fsub
        //   1568: aload #4
        //   1570: getfield field_70125_A : F
        //   1573: invokespecial <init> : (Ljava/lang/String;Lnet/minecraft/util/math/Vec3d;FF)V
        //   1576: invokevirtual sendToServer : (Lnet/minecraftforge/fml/common/network/simpleimpl/IMessage;)V
        //   1579: goto -> 3040
        //   1582: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        //   1585: athrow
        //   1586: aload_0
        //   1587: ldc 'Hmm...'
        //   1589: invokevirtual a : (Ljava/lang/String;)V
        //   1592: aload_0
        //   1593: getstatic com/schnurritv/sexmod/L.GIRLS_ELLIE_HMPH : [Lnet/minecraft/util/SoundEvent;
        //   1596: iconst_3
        //   1597: aaload
        //   1598: ldc 3.0
        //   1600: invokevirtual a : (Lnet/minecraft/util/SoundEvent;F)V
        //   1603: goto -> 3040
        //   1606: aload_0
        //   1607: ldc 'Hey!'
        //   1609: invokevirtual a : (Ljava/lang/String;)V
        //   1612: aload_0
        //   1613: getstatic com/schnurritv/sexmod/L.GIRLS_ELLIE_AHH : [Lnet/minecraft/util/SoundEvent;
        //   1616: iconst_2
        //   1617: aaload
        //   1618: ldc 3.0
        //   1620: invokevirtual a : (Lnet/minecraft/util/SoundEvent;F)V
        //   1623: goto -> 3040
        //   1626: aload_0
        //   1627: ldc 'ellie.dialogue.mommyhorny'
        //   1629: iconst_0
        //   1630: anewarray java/lang/Object
        //   1633: invokestatic func_135052_a : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   1636: invokevirtual a : (Ljava/lang/String;)V
        //   1639: aload_0
        //   1640: getstatic com/schnurritv/sexmod/L.GIRLS_ELLIE_GIGGLE : [Lnet/minecraft/util/SoundEvent;
        //   1643: iconst_0
        //   1644: aaload
        //   1645: ldc 3.0
        //   1647: invokevirtual a : (Lnet/minecraft/util/SoundEvent;F)V
        //   1650: goto -> 3040
        //   1653: aload_0
        //   1654: ldc 'ellie.dialogue.whattodo'
        //   1656: iconst_0
        //   1657: anewarray java/lang/Object
        //   1660: invokestatic func_135052_a : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   1663: invokevirtual a : (Ljava/lang/String;)V
        //   1666: aload_0
        //   1667: getstatic com/schnurritv/sexmod/L.GIRLS_ELLIE_HUH : [Lnet/minecraft/util/SoundEvent;
        //   1670: iconst_1
        //   1671: aaload
        //   1672: ldc 3.0
        //   1674: invokevirtual a : (Lnet/minecraft/util/SoundEvent;F)V
        //   1677: goto -> 3040
        //   1680: invokestatic func_71410_x : ()Lnet/minecraft/client/Minecraft;
        //   1683: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
        //   1686: astore #4
        //   1688: aload #4
        //   1690: invokevirtual getPersistentID : ()Ljava/util/UUID;
        //   1693: aload_0
        //   1694: invokevirtual n : ()Ljava/util/UUID;
        //   1697: invokevirtual equals : (Ljava/lang/Object;)Z
        //   1700: ifeq -> 3040
        //   1703: aload_0
        //   1704: getstatic com/schnurritv/sexmod/m.HUGIDLE : Lcom/schnurritv/sexmod/m;
        //   1707: invokevirtual c : (Lcom/schnurritv/sexmod/m;)V
        //   1710: aload_0
        //   1711: aload #4
        //   1713: invokevirtual a : (Lnet/minecraft/entity/player/EntityPlayer;)V
        //   1716: goto -> 3040
        //   1719: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        //   1722: athrow
        //   1723: aload_0
        //   1724: ldc 'ellie.dialogue.iknow'
        //   1726: iconst_0
        //   1727: anewarray java/lang/Object
        //   1730: invokestatic func_135052_a : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   1733: invokevirtual a : (Ljava/lang/String;)V
        //   1736: aload_0
        //   1737: getstatic com/schnurritv/sexmod/L.GIRLS_ELLIE_MMM : [Lnet/minecraft/util/SoundEvent;
        //   1740: iconst_0
        //   1741: aaload
        //   1742: ldc 3.0
        //   1744: invokevirtual a : (Lnet/minecraft/util/SoundEvent;F)V
        //   1747: goto -> 3040
        //   1750: aload_0
        //   1751: ldc 'ellie.dialogue.followmedarling'
        //   1753: iconst_0
        //   1754: anewarray java/lang/Object
        //   1757: invokestatic func_135052_a : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   1760: invokevirtual a : (Ljava/lang/String;)V
        //   1763: aload_0
        //   1764: getstatic com/schnurritv/sexmod/L.GIRLS_ELLIE_GIGGLE : [Lnet/minecraft/util/SoundEvent;
        //   1767: iconst_3
        //   1768: aaload
        //   1769: ldc 3.0
        //   1771: invokevirtual a : (Lnet/minecraft/util/SoundEvent;F)V
        //   1774: goto -> 3040
        //   1777: aload_0
        //   1778: invokevirtual E : ()Z
        //   1781: ifeq -> 3040
        //   1784: aload_0
        //   1785: invokevirtual func_174791_d : ()Lnet/minecraft/util/math/Vec3d;
        //   1788: astore #5
        //   1790: aload #5
        //   1792: aload_0
        //   1793: getfield field_70177_z : F
        //   1796: ldc 90.0
        //   1798: fadd
        //   1799: f2d
        //   1800: ldc2_w 0.017453292519943295
        //   1803: dmul
        //   1804: invokestatic sin : (D)D
        //   1807: dneg
        //   1808: ldc2_w -0.7803124785423279
        //   1811: dmul
        //   1812: dconst_0
        //   1813: aload_0
        //   1814: getfield field_70177_z : F
        //   1817: ldc 90.0
        //   1819: fadd
        //   1820: f2d
        //   1821: ldc2_w 0.017453292519943295
        //   1824: dmul
        //   1825: invokestatic cos : (D)D
        //   1828: ldc2_w -0.7803124785423279
        //   1831: dmul
        //   1832: invokevirtual func_72441_c : (DDD)Lnet/minecraft/util/math/Vec3d;
        //   1835: astore #5
        //   1837: aload #5
        //   1839: aload_0
        //   1840: getfield field_70177_z : F
        //   1843: f2d
        //   1844: ldc2_w 0.017453292519943295
        //   1847: dmul
        //   1848: invokestatic sin : (D)D
        //   1851: dneg
        //   1852: ldc2_w 0.5296875238418579
        //   1855: dmul
        //   1856: dconst_0
        //   1857: aload_0
        //   1858: getfield field_70177_z : F
        //   1861: f2d
        //   1862: ldc2_w 0.017453292519943295
        //   1865: dmul
        //   1866: invokestatic cos : (D)D
        //   1869: ldc2_w 0.5296875238418579
        //   1872: dmul
        //   1873: invokevirtual func_72441_c : (DDD)Lnet/minecraft/util/math/Vec3d;
        //   1876: astore #5
        //   1878: new java/lang/StringBuilder
        //   1881: dup
        //   1882: invokespecial <init> : ()V
        //   1885: aload #5
        //   1887: getfield field_72450_a : D
        //   1890: invokevirtual append : (D)Ljava/lang/StringBuilder;
        //   1893: ldc 'f'
        //   1895: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   1898: aload #5
        //   1900: getfield field_72448_b : D
        //   1903: invokevirtual append : (D)Ljava/lang/StringBuilder;
        //   1906: ldc 'f'
        //   1908: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   1911: aload #5
        //   1913: getfield field_72449_c : D
        //   1916: invokevirtual append : (D)Ljava/lang/StringBuilder;
        //   1919: ldc 'f'
        //   1921: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   1924: invokevirtual toString : ()Ljava/lang/String;
        //   1927: astore #6
        //   1929: getstatic com/schnurritv/sexmod/aV.a : Lnet/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper;
        //   1932: new com/schnurritv/sexmod/k
        //   1935: dup
        //   1936: aload_0
        //   1937: invokevirtual N : ()Ljava/util/UUID;
        //   1940: ldc 'targetPos'
        //   1942: aload #6
        //   1944: invokespecial <init> : (Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;)V
        //   1947: invokevirtual sendToServer : (Lnet/minecraftforge/fml/common/network/simpleimpl/IMessage;)V
        //   1950: aload_0
        //   1951: invokevirtual i : ()V
        //   1954: getstatic com/schnurritv/sexmod/aV.a : Lnet/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper;
        //   1957: new com/schnurritv/sexmod/E
        //   1960: dup
        //   1961: aload_0
        //   1962: invokevirtual N : ()Ljava/util/UUID;
        //   1965: invokespecial <init> : (Ljava/util/UUID;)V
        //   1968: invokevirtual sendToServer : (Lnet/minecraftforge/fml/common/network/simpleimpl/IMessage;)V
        //   1971: aload_0
        //   1972: getstatic com/schnurritv/sexmod/m.NULL : Lcom/schnurritv/sexmod/m;
        //   1975: invokevirtual c : (Lcom/schnurritv/sexmod/m;)V
        //   1978: goto -> 3040
        //   1981: aload_0
        //   1982: getstatic com/schnurritv/sexmod/L.GIRLS_ELLIE_GIGGLE : [Lnet/minecraft/util/SoundEvent;
        //   1985: iconst_3
        //   1986: aaload
        //   1987: ldc 3.0
        //   1989: invokevirtual a : (Lnet/minecraft/util/SoundEvent;F)V
        //   1992: aload_0
        //   1993: invokevirtual E : ()Z
        //   1996: ifeq -> 3040
        //   1999: aload_0
        //   2000: ldc 'ellie.dialogue.cometomommy'
        //   2002: iconst_0
        //   2003: anewarray java/lang/Object
        //   2006: invokestatic func_135052_a : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   2009: invokevirtual a : (Ljava/lang/String;)V
        //   2012: goto -> 3040
        //   2015: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        //   2018: athrow
        //   2019: aload_0
        //   2020: invokevirtual c : ()Z
        //   2023: ifeq -> 3040
        //   2026: aload_0
        //   2027: getstatic com/schnurritv/sexmod/m.SITDOWNIDLE : Lcom/schnurritv/sexmod/m;
        //   2030: invokevirtual c : (Lcom/schnurritv/sexmod/m;)V
        //   2033: aload_0
        //   2034: aload_0
        //   2035: getfield field_70170_p : Lnet/minecraft/world/World;
        //   2038: aload_0
        //   2039: invokevirtual d : ()Ljava/util/UUID;
        //   2042: invokevirtual func_152378_a : (Ljava/util/UUID;)Lnet/minecraft/entity/player/EntityPlayer;
        //   2045: invokevirtual a : (Lnet/minecraft/entity/player/EntityPlayer;)V
        //   2048: goto -> 3040
        //   2051: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        //   2054: athrow
        //   2055: aload_0
        //   2056: invokevirtual k : ()Z
        //   2059: ifne -> 2069
        //   2062: goto -> 3040
        //   2065: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        //   2068: athrow
        //   2069: aload_0
        //   2070: getstatic com/schnurritv/sexmod/m.MISSIONARY_SLOW : Lcom/schnurritv/sexmod/m;
        //   2073: invokevirtual c : (Lcom/schnurritv/sexmod/m;)V
        //   2076: invokestatic d : ()V
        //   2079: goto -> 3040
        //   2082: aload_0
        //   2083: getstatic com/schnurritv/sexmod/L.GIRLS_ELLIE_GIGGLE : [Lnet/minecraft/util/SoundEvent;
        //   2086: iconst_4
        //   2087: aaload
        //   2088: ldc 3.0
        //   2090: invokevirtual a : (Lnet/minecraft/util/SoundEvent;F)V
        //   2093: goto -> 3040
        //   2096: aload_0
        //   2097: invokevirtual E : ()Z
        //   2100: ifeq -> 3040
        //   2103: aload_0
        //   2104: ldc 'ellie.dialogue.like'
        //   2106: iconst_0
        //   2107: anewarray java/lang/Object
        //   2110: invokestatic func_135052_a : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   2113: invokevirtual b : (Ljava/lang/String;)V
        //   2116: invokestatic c : ()V
        //   2119: goto -> 3040
        //   2122: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        //   2125: athrow
        //   2126: aload_0
        //   2127: getstatic com/schnurritv/sexmod/L.GIRLS_ELLIE_AHH : [Lnet/minecraft/util/SoundEvent;
        //   2130: invokestatic a : ([Lnet/minecraft/util/SoundEvent;)Lnet/minecraft/util/SoundEvent;
        //   2133: ldc 3.0
        //   2135: invokevirtual a : (Lnet/minecraft/util/SoundEvent;F)V
        //   2138: aload_0
        //   2139: getstatic com/schnurritv/sexmod/L.MISC_POUNDING : [Lnet/minecraft/util/SoundEvent;
        //   2142: invokestatic a : ([Lnet/minecraft/util/SoundEvent;)Lnet/minecraft/util/SoundEvent;
        //   2145: ldc 0.75
        //   2147: invokevirtual a : (Lnet/minecraft/util/SoundEvent;F)V
        //   2150: aload_0
        //   2151: invokevirtual k : ()Z
        //   2154: ifeq -> 3040
        //   2157: ldc2_w 0.02
        //   2160: invokestatic a : (D)V
        //   2163: goto -> 3040
        //   2166: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        //   2169: athrow
        //   2170: aload_0
        //   2171: invokevirtual k : ()Z
        //   2174: ifeq -> 3040
        //   2177: aload_0
        //   2178: getstatic com/schnurritv/sexmod/m.COWGIRLSLOW : Lcom/schnurritv/sexmod/m;
        //   2181: invokevirtual c : (Lcom/schnurritv/sexmod/m;)V
        //   2184: invokestatic d : ()V
        //   2187: goto -> 3040
        //   2190: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        //   2193: athrow
        //   2194: aload_0
        //   2195: getfield al : Z
        //   2198: ifeq -> 2213
        //   2201: aload_0
        //   2202: iconst_0
        //   2203: putfield al : Z
        //   2206: goto -> 2225
        //   2209: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        //   2212: athrow
        //   2213: aload_0
        //   2214: getstatic com/schnurritv/sexmod/L.GIRLS_ELLIE_AHH : [Lnet/minecraft/util/SoundEvent;
        //   2217: invokestatic a : ([Lnet/minecraft/util/SoundEvent;)Lnet/minecraft/util/SoundEvent;
        //   2220: ldc 3.0
        //   2222: invokevirtual a : (Lnet/minecraft/util/SoundEvent;F)V
        //   2225: aload_0
        //   2226: getstatic com/schnurritv/sexmod/L.MISC_POUNDING : [Lnet/minecraft/util/SoundEvent;
        //   2229: invokestatic a : ([Lnet/minecraft/util/SoundEvent;)Lnet/minecraft/util/SoundEvent;
        //   2232: ldc 0.75
        //   2234: invokevirtual a : (Lnet/minecraft/util/SoundEvent;F)V
        //   2237: aload_0
        //   2238: invokevirtual k : ()Z
        //   2241: ifeq -> 3040
        //   2244: ldc2_w 0.04
        //   2247: invokestatic a : (D)V
        //   2250: goto -> 3040
        //   2253: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        //   2256: athrow
        //   2257: aload_0
        //   2258: invokevirtual k : ()Z
        //   2261: ifne -> 2271
        //   2264: goto -> 3040
        //   2267: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        //   2270: athrow
        //   2271: getstatic com/schnurritv/sexmod/aK.b : Z
        //   2274: ifne -> 2291
        //   2277: aload_0
        //   2278: getstatic com/schnurritv/sexmod/m.COWGIRLSLOW : Lcom/schnurritv/sexmod/m;
        //   2281: invokevirtual c : (Lcom/schnurritv/sexmod/m;)V
        //   2284: goto -> 3040
        //   2287: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        //   2290: athrow
        //   2291: getstatic com/schnurritv/sexmod/U.f : Ljava/util/Random;
        //   2294: iconst_4
        //   2295: invokevirtual nextInt : (I)I
        //   2298: iconst_1
        //   2299: if_icmpeq -> 3040
        //   2302: aload_0
        //   2303: getfield k : Lsoftware/bernie/geckolib3/core/controller/AnimationController;
        //   2306: invokevirtual clearAnimationCache : ()V
        //   2309: goto -> 3040
        //   2312: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        //   2315: athrow
        //   2316: aload_0
        //   2317: getstatic com/schnurritv/sexmod/L.MISC_POUNDING : [Lnet/minecraft/util/SoundEvent;
        //   2320: invokestatic a : ([Lnet/minecraft/util/SoundEvent;)Lnet/minecraft/util/SoundEvent;
        //   2323: ldc 0.75
        //   2325: invokevirtual a : (Lnet/minecraft/util/SoundEvent;F)V
        //   2328: aload_0
        //   2329: invokevirtual k : ()Z
        //   2332: ifeq -> 3040
        //   2335: ldc2_w 0.2
        //   2338: invokestatic a : (D)V
        //   2341: goto -> 3040
        //   2344: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        //   2347: athrow
        //   2348: aload_0
        //   2349: getstatic com/schnurritv/sexmod/L.GIRLS_ELLIE_AHH : [Lnet/minecraft/util/SoundEvent;
        //   2352: invokestatic a : ([Lnet/minecraft/util/SoundEvent;)Lnet/minecraft/util/SoundEvent;
        //   2355: ldc 3.0
        //   2357: invokevirtual a : (Lnet/minecraft/util/SoundEvent;F)V
        //   2360: aload_0
        //   2361: getstatic com/schnurritv/sexmod/L.MISC_POUNDING : [Lnet/minecraft/util/SoundEvent;
        //   2364: invokestatic a : ([Lnet/minecraft/util/SoundEvent;)Lnet/minecraft/util/SoundEvent;
        //   2367: ldc 0.75
        //   2369: invokevirtual a : (Lnet/minecraft/util/SoundEvent;F)V
        //   2372: goto -> 3040
        //   2375: aload_0
        //   2376: getstatic com/schnurritv/sexmod/L.GIRLS_ELLIE_MOAN : [Lnet/minecraft/util/SoundEvent;
        //   2379: iconst_5
        //   2380: aaload
        //   2381: ldc 3.0
        //   2383: invokevirtual a : (Lnet/minecraft/util/SoundEvent;F)V
        //   2386: aload_0
        //   2387: getstatic com/schnurritv/sexmod/L.MISC_POUNDING : [Lnet/minecraft/util/SoundEvent;
        //   2390: invokestatic a : ([Lnet/minecraft/util/SoundEvent;)Lnet/minecraft/util/SoundEvent;
        //   2393: ldc 0.75
        //   2395: invokevirtual a : (Lnet/minecraft/util/SoundEvent;F)V
        //   2398: goto -> 3040
        //   2401: aload_0
        //   2402: getstatic com/schnurritv/sexmod/L.MISC_POUNDING : [Lnet/minecraft/util/SoundEvent;
        //   2405: invokestatic a : ([Lnet/minecraft/util/SoundEvent;)Lnet/minecraft/util/SoundEvent;
        //   2408: ldc 0.75
        //   2410: invokevirtual a : (Lnet/minecraft/util/SoundEvent;F)V
        //   2413: goto -> 3040
        //   2416: aload_0
        //   2417: invokevirtual k : ()Z
        //   2420: ifeq -> 3040
        //   2423: invokestatic a : ()V
        //   2426: goto -> 3040
        //   2429: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        //   2432: athrow
        //   2433: aload_0
        //   2434: getstatic com/schnurritv/sexmod/L.GIRLS_ELLIE_GIGGLE : [Lnet/minecraft/util/SoundEvent;
        //   2437: iconst_4
        //   2438: aaload
        //   2439: ldc 3.0
        //   2441: invokevirtual a : (Lnet/minecraft/util/SoundEvent;F)V
        //   2444: aload_0
        //   2445: invokevirtual k : ()Z
        //   2448: ifeq -> 3040
        //   2451: aload_0
        //   2452: ldc 'ellie.dialogue.goodboy'
        //   2454: iconst_0
        //   2455: anewarray java/lang/Object
        //   2458: invokestatic func_135052_a : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   2461: invokevirtual b : (Ljava/lang/String;)V
        //   2464: goto -> 3040
        //   2467: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        //   2470: athrow
        //   2471: aload_0
        //   2472: invokevirtual k : ()Z
        //   2475: ifeq -> 3040
        //   2478: invokestatic b : ()V
        //   2481: goto -> 3040
        //   2484: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        //   2487: athrow
        //   2488: aload_0
        //   2489: invokevirtual k : ()Z
        //   2492: ifeq -> 3040
        //   2495: invokestatic c : ()V
        //   2498: aload_0
        //   2499: invokevirtual i : ()V
        //   2502: goto -> 3040
        //   2505: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        //   2508: athrow
        //   2509: aload_0
        //   2510: dup
        //   2511: getfield T : I
        //   2514: iconst_1
        //   2515: iadd
        //   2516: dup_x1
        //   2517: putfield T : I
        //   2520: iconst_3
        //   2521: if_icmpne -> 3040
        //   2524: aload_0
        //   2525: iconst_0
        //   2526: putfield T : I
        //   2529: goto -> 3040
        //   2532: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        //   2535: athrow
        //   2536: getstatic com/schnurritv/sexmod/aV.a : Lnet/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper;
        //   2539: new com/schnurritv/sexmod/co
        //   2542: dup
        //   2543: aload_0
        //   2544: invokevirtual N : ()Ljava/util/UUID;
        //   2547: invokespecial <init> : (Ljava/util/UUID;)V
        //   2550: invokevirtual sendToServer : (Lnet/minecraftforge/fml/common/network/simpleimpl/IMessage;)V
        //   2553: goto -> 3040
        //   2556: aload_0
        //   2557: invokevirtual k : ()Z
        //   2560: ifeq -> 3040
        //   2563: invokestatic d : ()V
        //   2566: goto -> 3040
        //   2569: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        //   2572: athrow
        //   2573: aload_0
        //   2574: getstatic com/schnurritv/sexmod/L.MISC_POUNDING : [Lnet/minecraft/util/SoundEvent;
        //   2577: invokestatic a : ([Lnet/minecraft/util/SoundEvent;)Lnet/minecraft/util/SoundEvent;
        //   2580: invokevirtual a : (Lnet/minecraft/util/SoundEvent;)V
        //   2583: aload_0
        //   2584: invokevirtual func_70681_au : ()Ljava/util/Random;
        //   2587: invokevirtual nextBoolean : ()Z
        //   2590: ifeq -> 2629
        //   2593: aload_0
        //   2594: invokevirtual func_70681_au : ()Ljava/util/Random;
        //   2597: invokevirtual nextBoolean : ()Z
        //   2600: ifeq -> 2629
        //   2603: goto -> 2610
        //   2606: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        //   2609: athrow
        //   2610: aload_0
        //   2611: getstatic com/schnurritv/sexmod/L.GIRLS_ELLIE_MOAN : [Lnet/minecraft/util/SoundEvent;
        //   2614: invokestatic a : ([Lnet/minecraft/util/SoundEvent;)Lnet/minecraft/util/SoundEvent;
        //   2617: ldc 3.0
        //   2619: invokevirtual a : (Lnet/minecraft/util/SoundEvent;F)V
        //   2622: goto -> 2641
        //   2625: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        //   2628: athrow
        //   2629: aload_0
        //   2630: getstatic com/schnurritv/sexmod/L.GIRLS_ELLIE_AHH : [Lnet/minecraft/util/SoundEvent;
        //   2633: invokestatic a : ([Lnet/minecraft/util/SoundEvent;)Lnet/minecraft/util/SoundEvent;
        //   2636: ldc 3.0
        //   2638: invokevirtual a : (Lnet/minecraft/util/SoundEvent;F)V
        //   2641: aload_0
        //   2642: invokevirtual k : ()Z
        //   2645: ifeq -> 3040
        //   2648: ldc2_w 0.02
        //   2651: invokestatic a : (D)V
        //   2654: goto -> 3040
        //   2657: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        //   2660: athrow
        //   2661: aload_0
        //   2662: getstatic com/schnurritv/sexmod/L.MISC_POUNDING : [Lnet/minecraft/util/SoundEvent;
        //   2665: invokestatic a : ([Lnet/minecraft/util/SoundEvent;)Lnet/minecraft/util/SoundEvent;
        //   2668: invokevirtual a : (Lnet/minecraft/util/SoundEvent;)V
        //   2671: aload_0
        //   2672: invokevirtual func_70681_au : ()Ljava/util/Random;
        //   2675: invokevirtual nextBoolean : ()Z
        //   2678: ifne -> 2698
        //   2681: aload_0
        //   2682: invokevirtual func_70681_au : ()Ljava/util/Random;
        //   2685: invokevirtual nextBoolean : ()Z
        //   2688: ifeq -> 2717
        //   2691: goto -> 2698
        //   2694: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        //   2697: athrow
        //   2698: aload_0
        //   2699: getstatic com/schnurritv/sexmod/L.GIRLS_ELLIE_MOAN : [Lnet/minecraft/util/SoundEvent;
        //   2702: invokestatic a : ([Lnet/minecraft/util/SoundEvent;)Lnet/minecraft/util/SoundEvent;
        //   2705: ldc 3.0
        //   2707: invokevirtual a : (Lnet/minecraft/util/SoundEvent;F)V
        //   2710: goto -> 2729
        //   2713: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        //   2716: athrow
        //   2717: aload_0
        //   2718: getstatic com/schnurritv/sexmod/L.GIRLS_ELLIE_AHH : [Lnet/minecraft/util/SoundEvent;
        //   2721: invokestatic a : ([Lnet/minecraft/util/SoundEvent;)Lnet/minecraft/util/SoundEvent;
        //   2724: ldc 3.0
        //   2726: invokevirtual a : (Lnet/minecraft/util/SoundEvent;F)V
        //   2729: aload_0
        //   2730: invokevirtual k : ()Z
        //   2733: ifeq -> 3040
        //   2736: ldc2_w 0.05
        //   2739: invokestatic a : (D)V
        //   2742: goto -> 3040
        //   2745: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        //   2748: athrow
        //   2749: aload_0
        //   2750: invokevirtual k : ()Z
        //   2753: ifne -> 2763
        //   2756: goto -> 3040
        //   2759: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        //   2762: athrow
        //   2763: getstatic com/schnurritv/sexmod/aK.b : Z
        //   2766: ifeq -> 2783
        //   2769: aload_0
        //   2770: getstatic com/schnurritv/sexmod/m.MISSIONARY_FAST : Lcom/schnurritv/sexmod/m;
        //   2773: invokevirtual c : (Lcom/schnurritv/sexmod/m;)V
        //   2776: goto -> 3040
        //   2779: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        //   2782: athrow
        //   2783: aload_0
        //   2784: getstatic com/schnurritv/sexmod/m.MISSIONARY_SLOW : Lcom/schnurritv/sexmod/m;
        //   2787: invokevirtual c : (Lcom/schnurritv/sexmod/m;)V
        //   2790: goto -> 3040
        //   2793: aload_0
        //   2794: getstatic com/schnurritv/sexmod/L.MISC_POUNDING : [Lnet/minecraft/util/SoundEvent;
        //   2797: invokestatic a : ([Lnet/minecraft/util/SoundEvent;)Lnet/minecraft/util/SoundEvent;
        //   2800: invokevirtual a : (Lnet/minecraft/util/SoundEvent;)V
        //   2803: aload_0
        //   2804: getstatic com/schnurritv/sexmod/L.MISC_BEDRUSTLE : [Lnet/minecraft/util/SoundEvent;
        //   2807: iconst_0
        //   2808: aaload
        //   2809: invokevirtual a : (Lnet/minecraft/util/SoundEvent;)V
        //   2812: goto -> 3040
        //   2815: aload_0
        //   2816: getstatic com/schnurritv/sexmod/L.MISC_BEDRUSTLE : [Lnet/minecraft/util/SoundEvent;
        //   2819: iconst_1
        //   2820: aaload
        //   2821: invokevirtual a : (Lnet/minecraft/util/SoundEvent;)V
        //   2824: goto -> 3040
        //   2827: aload_0
        //   2828: getstatic com/schnurritv/sexmod/L.GIRLS_ELLIE_AHH : [Lnet/minecraft/util/SoundEvent;
        //   2831: invokestatic a : ([Lnet/minecraft/util/SoundEvent;)Lnet/minecraft/util/SoundEvent;
        //   2834: ldc 3.0
        //   2836: invokevirtual a : (Lnet/minecraft/util/SoundEvent;F)V
        //   2839: goto -> 3040
        //   2842: aload_0
        //   2843: ldc 'I'm hungry..'
        //   2845: invokevirtual b : (Ljava/lang/String;)V
        //   2848: aload_0
        //   2849: getstatic com/schnurritv/sexmod/L.GIRLS_ELLIE_HMPH : [Lnet/minecraft/util/SoundEvent;
        //   2852: ldc 6.0
        //   2854: invokevirtual a : ([Lnet/minecraft/util/SoundEvent;F)V
        //   2857: goto -> 3040
        //   2860: aload_0
        //   2861: ldc 'heh~'
        //   2863: invokevirtual b : (Ljava/lang/String;)V
        //   2866: aload_0
        //   2867: getstatic com/schnurritv/sexmod/L.GIRLS_ELLIE_GIGGLE : [Lnet/minecraft/util/SoundEvent;
        //   2870: iconst_3
        //   2871: aaload
        //   2872: ldc 6.0
        //   2874: invokevirtual a : (Lnet/minecraft/util/SoundEvent;F)V
        //   2877: goto -> 3040
        //   2880: aload_0
        //   2881: getstatic com/schnurritv/sexmod/L.GIRLS_ALLIE_LIPSOUND : [Lnet/minecraft/util/SoundEvent;
        //   2884: invokevirtual a : ([Lnet/minecraft/util/SoundEvent;)V
        //   2887: aload_0
        //   2888: invokevirtual k : ()Z
        //   2891: ifeq -> 3040
        //   2894: ldc2_w 0.02
        //   2897: invokestatic a : (D)V
        //   2900: goto -> 3040
        //   2903: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        //   2906: athrow
        //   2907: aload_0
        //   2908: getstatic com/schnurritv/sexmod/L.MISC_INSERTS : [Lnet/minecraft/util/SoundEvent;
        //   2911: ldc 6.0
        //   2913: invokevirtual a : ([Lnet/minecraft/util/SoundEvent;F)V
        //   2916: aload_0
        //   2917: getstatic com/schnurritv/sexmod/L.MISC_POUNDING : [Lnet/minecraft/util/SoundEvent;
        //   2920: invokevirtual a : ([Lnet/minecraft/util/SoundEvent;)V
        //   2923: goto -> 3040
        //   2926: aload_0
        //   2927: getstatic com/schnurritv/sexmod/L.MISC_POUNDING : [Lnet/minecraft/util/SoundEvent;
        //   2930: invokevirtual a : ([Lnet/minecraft/util/SoundEvent;)V
        //   2933: aload_0
        //   2934: invokevirtual k : ()Z
        //   2937: ifeq -> 3040
        //   2940: ldc2_w 0.04
        //   2943: invokestatic a : (D)V
        //   2946: goto -> 3040
        //   2949: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        //   2952: athrow
        //   2953: aload_0
        //   2954: getfield an : I
        //   2957: istore #5
        //   2959: aload_0
        //   2960: aload_0
        //   2961: invokevirtual func_70681_au : ()Ljava/util/Random;
        //   2964: iconst_4
        //   2965: invokevirtual nextInt : (I)I
        //   2968: iconst_1
        //   2969: iadd
        //   2970: putfield an : I
        //   2973: aload_0
        //   2974: getfield an : I
        //   2977: iload #5
        //   2979: if_icmpeq -> 2959
        //   2982: goto -> 3040
        //   2985: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        //   2988: athrow
        //   2989: aload_0
        //   2990: invokevirtual k : ()Z
        //   2993: ifne -> 3003
        //   2996: goto -> 3040
        //   2999: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        //   3002: athrow
        //   3003: getstatic com/schnurritv/sexmod/aK.b : Z
        //   3006: ifne -> 3040
        //   3009: aload_0
        //   3010: getstatic com/schnurritv/sexmod/m.CARRY_SLOW : Lcom/schnurritv/sexmod/m;
        //   3013: invokevirtual c : (Lcom/schnurritv/sexmod/m;)V
        //   3016: goto -> 3040
        //   3019: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        //   3022: athrow
        //   3023: aload_0
        //   3024: invokevirtual k : ()Z
        //   3027: ifeq -> 3040
        //   3030: invokestatic d : ()V
        //   3033: goto -> 3040
        //   3036: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        //   3039: athrow
        //   3040: return
        // Exception table:
        //   from	to	target	type
        //   7	421	424	java/lang/RuntimeException
        //   1428	1438	1438	java/lang/RuntimeException
        //   1503	1533	1536	java/lang/RuntimeException
        //   1518	1582	1582	java/lang/RuntimeException
        //   1688	1719	1719	java/lang/RuntimeException
        //   1981	2015	2015	java/lang/RuntimeException
        //   2019	2051	2051	java/lang/RuntimeException
        //   2055	2065	2065	java/lang/RuntimeException
        //   2096	2122	2122	java/lang/RuntimeException
        //   2126	2166	2166	java/lang/RuntimeException
        //   2170	2190	2190	java/lang/RuntimeException
        //   2194	2209	2209	java/lang/RuntimeException
        //   2225	2253	2253	java/lang/RuntimeException
        //   2257	2267	2267	java/lang/RuntimeException
        //   2271	2287	2287	java/lang/RuntimeException
        //   2291	2312	2312	java/lang/RuntimeException
        //   2316	2344	2344	java/lang/RuntimeException
        //   2416	2429	2429	java/lang/RuntimeException
        //   2433	2467	2467	java/lang/RuntimeException
        //   2471	2484	2484	java/lang/RuntimeException
        //   2488	2505	2505	java/lang/RuntimeException
        //   2509	2532	2532	java/lang/RuntimeException
        //   2556	2569	2569	java/lang/RuntimeException
        //   2573	2603	2606	java/lang/RuntimeException
        //   2593	2625	2625	java/lang/RuntimeException
        //   2641	2657	2657	java/lang/RuntimeException
        //   2661	2691	2694	java/lang/RuntimeException
        //   2681	2713	2713	java/lang/RuntimeException
        //   2729	2745	2745	java/lang/RuntimeException
        //   2749	2759	2759	java/lang/RuntimeException
        //   2763	2779	2779	java/lang/RuntimeException
        //   2880	2903	2903	java/lang/RuntimeException
        //   2926	2949	2949	java/lang/RuntimeException
        //   2959	2985	2985	java/lang/RuntimeException
        //   2989	2999	2999	java/lang/RuntimeException
        //   3003	3019	3019	java/lang/RuntimeException
        //   3023	3033	3036	java/lang/RuntimeException
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


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\bb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */