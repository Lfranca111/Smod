package com.schnurritv.sexmod;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class n {
  static final int a = 3;
  
  @SubscribeEvent
  public void a(BlockEvent.BreakEvent paramBreakEvent) {
    Block block = paramBreakEvent.getState().func_177230_c();
    try {
      if (block != Blocks.field_150324_C)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    BlockPos blockPos = paramBreakEvent.getPos();
    AxisAlignedBB axisAlignedBB = new AxisAlignedBB((blockPos.func_177958_n() - 3), (blockPos.func_177956_o() - 3), (blockPos.func_177952_p() - 3), (blockPos.func_177958_n() + 3), (blockPos.func_177956_o() + 3), (blockPos.func_177952_p() + 3));
    List list = paramBreakEvent.getWorld().func_72872_a(bS.class, axisAlignedBB);
    boolean bool = false;
    for (bS bS : list) {
      try {
        if (!bS.field_70128_L && ((Boolean)bS.func_184212_Q().func_187225_a(bS.z)).booleanValue()) {
          bool = true;
          break;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    try {
      if (!bool)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    paramBreakEvent.getPlayer().func_146105_b((ITextComponent)new TextComponentString("this bed is currently used by a girl.. pls don't disturb okay? ... you are kinda mean rn"), true);
    paramBreakEvent.setCanceled(true);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */