package com.schnurritv.sexmod;

import java.util.ConcurrentModificationException;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;

public class a3 extends CommandBase {
  public static final a3 a = new a3();
  
  public String func_71517_b() {
    return "locatenearestgoblinlair";
  }
  
  public String func_71518_a(ICommandSender paramICommandSender) {
    return "/locatenearestgoblinlair";
  }
  
  public void func_184881_a(MinecraftServer paramMinecraftServer, ICommandSender paramICommandSender, String[] paramArrayOfString) throws CommandException {
    Entity entity = paramICommandSender.func_174793_f();
    try {
      if (entity != null)
        try {
          if (entity.field_71093_bK != 0) {
            try {
            
            } catch (ConcurrentModificationException concurrentModificationException) {
              throw a(null);
            } 
            paramICommandSender.func_145747_a((ITextComponent)new TextComponentString(TextFormatting.YELLOW + "goblin lairs don't exist in the " + ((entity.field_71093_bK == -1) ? (TextFormatting.RED + "Nether") : (TextFormatting.DARK_PURPLE + "End"))));
            return;
          } 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        }  
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    bf bf = null;
    try {
      for (bS bS : bS.l()) {
        try {
          if (!(bS instanceof bf))
            continue; 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        } 
        bf bf1 = (bf)bS;
        try {
          if (!bf1.ai)
            continue; 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        } 
        if (bf == null) {
          bf = bf1;
          continue;
        } 
        if (bf1.func_174818_b(paramICommandSender.func_180425_c()) < bf.func_174818_b(paramICommandSender.func_180425_c()))
          bf = bf1; 
      } 
    } catch (ConcurrentModificationException concurrentModificationException) {}
    try {
      if (bf == null) {
        paramICommandSender.func_145747_a((ITextComponent)new TextComponentString(TextFormatting.RED + "No nearby goblin lair found uwu"));
        return;
      } 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    BlockPos blockPos = bf.func_180425_c();
    paramICommandSender.func_145747_a((ITextComponent)new TextComponentString(String.format("%sgoblin lair found at %s%s %s%s %s%s", new Object[] { TextFormatting.YELLOW, TextFormatting.RED, Integer.valueOf(blockPos.func_177958_n()), TextFormatting.GREEN, Integer.valueOf(blockPos.func_177956_o()), TextFormatting.BLUE, Integer.valueOf(blockPos.func_177952_p()) })));
  }
  
  private static ConcurrentModificationException a(ConcurrentModificationException paramConcurrentModificationException) {
    return paramConcurrentModificationException;
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\a3.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */