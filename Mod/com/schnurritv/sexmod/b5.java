package com.schnurritv.sexmod;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class b5 {
  public static void a() {
    a("jenny", (Class)b8.class, bB.JENNY.npcID, 3286592, 12655237);
    a("ellie", (Class)bV.class, bB.ELLIE.npcID, 1447446, 9961472);
    a("slime", (Class)bY.class, bB.SLIME.npcID, 13167780, 8244330);
    a("bia", (Class)bH.class, bB.BIA.npcID, 7488816, 7254603);
    a("bee", (Class)bG.class, bB.BEE.npcID, 16701032, 4400155);
    a("luna", (Class)bg.class, bB.LUNA.npcID, 7881787, 7940422);
    a("allie", (Class)bW.class, bB.ALLIE.npcID);
    a("kobold", (Class)b3.class, bB.KOBOLD.npcID);
    a("kobold_egg", (Class)e.class, 4674237);
    a("goblin", (Class)bf.class, bB.GOBLIN.npcID, 39424, 19456);
    a("custom_model", (Class)cX.class, 6281823);
    b("player_jenny", (Class)bi.class, bB.JENNY.playerID);
    b("player_ellie", (Class)bb.class, bB.ELLIE.playerID);
    b("player_slime", (Class)bK.class, bB.SLIME.playerID);
    b("player_bia", (Class)b7.class, bB.BIA.playerID);
    b("player_bee", (Class)bX.class, bB.BEE.playerID);
    b("player_allie", (Class)bc.class, bB.ALLIE.playerID);
    b("player_luna", (Class)b4.class, bB.LUNA.playerID);
    b("player_kobold", (Class)b_.class, bB.KOBOLD.playerID);
    b("player_goblin", (Class)be.class, bB.GOBLIN.playerID);
    EntityRegistry.registerModEntity(new ResourceLocation("sexmod:friendly_slime"), cE.class, "friendly_slime", 5548484, Main.instance, 50, 1, true);
    EntityRegistry.registerModEntity(new ResourceLocation("sexmod:luna_hook"), aY.class, "luna_hook", 4768742, Main.instance, 50, 1, true);
    EntityRegistry.addSpawn(bY.class, 10, 1, 1, EnumCreatureType.CREATURE, new Biome[] { Biomes.field_76780_h, Biomes.field_150599_m });
    EntityRegistry.addSpawn(bG.class, 5, 1, 1, EnumCreatureType.CREATURE, new Biome[] { Biomes.field_76767_f, Biomes.field_76785_t });
  }
  
  private static void b(String paramString, Class<? extends Entity> paramClass, int paramInt) {
    EntityRegistry.registerModEntity(new ResourceLocation("sexmod:" + paramString), paramClass, paramString, paramInt, Main.instance, 100, 1, false);
  }
  
  private static void a(String paramString, Class<? extends Entity> paramClass, int paramInt1, int paramInt2, int paramInt3) {
    EntityRegistry.registerModEntity(new ResourceLocation("sexmod:" + paramString), paramClass, paramString, paramInt1, Main.instance, 50, 1, true, paramInt2, paramInt3);
  }
  
  private static void a(String paramString, Class<? extends Entity> paramClass, int paramInt) {
    EntityRegistry.registerModEntity(new ResourceLocation("sexmod:" + paramString), paramClass, "allie", paramInt, Main.instance, 50, 1, true);
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\b5.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */