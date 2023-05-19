package com.schnurritv.sexmod;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class aj implements IMessage {
  boolean a = false;
  
  public void fromBytes(ByteBuf paramByteBuf) {
    this.a = true;
  }
  
  public void toBytes(ByteBuf paramByteBuf) {}
  
  public static class a implements IMessageHandler<aj, IMessage> {
    public IMessage a(aj param1aj, MessageContext param1MessageContext) {
      try {
        if (param1aj.a)
          try {
            if (param1MessageContext.side == Side.SERVER) {
              FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
                    EntityPlayerMP entityPlayerMP = (param1MessageContext.getServerHandler()).field_147369_b;
                    Vec3d vec3d = entityPlayerMP.func_174791_d().func_72441_c(-Math.sin(((EntityPlayer)entityPlayerMP).field_70759_as * 0.017453292519943295D) * 2.0D, 0.0D, Math.cos(((EntityPlayer)entityPlayerMP).field_70759_as * 0.017453292519943295D) * 2.0D);
                    bW bW = new bW(((EntityPlayer)entityPlayerMP).field_70170_p, entityPlayerMP.func_184614_ca());
                    bW.e(entityPlayerMP.getPersistentID());
                    bW.func_70080_a(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c, ((EntityPlayer)entityPlayerMP).field_70759_as + 180.0F, ((EntityPlayer)entityPlayerMP).field_70125_A);
                    bW.a(bW.func_174791_d());
                    bW.a(((EntityPlayer)entityPlayerMP).field_70759_as + 180.0F);
                    bW.func_189654_d(true);
                    bW.field_70145_X = true;
                    ((EntityPlayer)entityPlayerMP).field_70170_p.func_72838_d((Entity)bW);
                    BlockPos blockPos = bW.func_180425_c().func_177982_a(0, -1, 0);
                    try {
                      if (bW.field_70170_p.func_180495_p(blockPos).func_177230_c().equals(Blocks.field_150354_m)) {
                        bW.c(m.SUMMON_SAND);
                      } else {
                        try {
                        
                        } catch (RuntimeException runtimeException) {
                          throw a(null);
                        } 
                        bW.c(bW.d() ? m.SUMMON : m.SUMMON_NORMAL);
                      } 
                    } catch (RuntimeException runtimeException) {
                      throw a(null);
                    } 
                  });
              return null;
            } 
            System.out.println("received an invalid message @SummonAllie :(");
            return null;
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      System.out.println("received an invalid message @SummonAllie :(");
      return null;
    }
    
    private static RuntimeException a(RuntimeException param1RuntimeException) {
      return param1RuntimeException;
    }
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\aj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */