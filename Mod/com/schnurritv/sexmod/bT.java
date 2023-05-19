package com.schnurritv.sexmod;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;

public class bt extends CommandBase {
  public static final bt a = new bt();
  
  public String func_71517_b() {
    return "reloadcustommodels";
  }
  
  public String func_71518_a(ICommandSender paramICommandSender) {
    return "/reloadcustommodels";
  }
  
  public int func_82362_a() {
    return 2;
  }
  
  public void func_184881_a(MinecraftServer paramMinecraftServer, ICommandSender paramICommandSender, String[] paramArrayOfString) throws CommandException {
    ai.c(false);
    for (EntityPlayerMP entityPlayerMP : paramMinecraftServer.func_184103_al().func_181057_v())
      paramMinecraftServer.func_152344_a(() -> aV.a.sendTo(new cg(ai.c()), paramEntityPlayerMP)); 
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\bt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */