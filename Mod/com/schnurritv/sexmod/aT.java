package com.schnurritv.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.UUID;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class at implements IMessage {
  boolean a;
  
  public void fromBytes(ByteBuf paramByteBuf) {
    this.a = true;
  }
  
  public void toBytes(ByteBuf paramByteBuf) {}
  
  public static class a implements IMessageHandler<at, IMessage> {
    public IMessage a(at param1at, MessageContext param1MessageContext) {
      try {
        if (param1at.a)
          try {
            if (param1MessageContext.side.equals(Side.SERVER)) {
              FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
                    EntityPlayerMP entityPlayerMP = (param1MessageContext.getServerHandler()).field_147369_b;
                    UUID uUID = s.a(entityPlayerMP.getPersistentID());
                    try {
                      if (uUID == null)
                        return; 
                    } catch (RuntimeException runtimeException) {
                      throw a(null);
                    } 
                    EyeAndKoboldColor eyeAndKoboldColor = s.p(uUID);
                    ItemStack itemStack = new ItemStack(bP.a, 1, eyeAndKoboldColor.getWoolMeta());
                    NBTTagCompound nBTTagCompound = itemStack.func_77978_p();
                    if (nBTTagCompound == null)
                      nBTTagCompound = new NBTTagCompound(); 
                    nBTTagCompound.func_74778_a("tribeID", uUID.toString());
                    itemStack.func_77982_d(nBTTagCompound);
                    ((EntityPlayer)entityPlayerMP).field_71071_by.func_70441_a(itemStack);
                  });
              return null;
            } 
            System.out.println("received an invalid Message @SendEgg :(");
            return null;
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      System.out.println("received an invalid Message @SendEgg :(");
      return null;
    }
    
    private static RuntimeException a(RuntimeException param1RuntimeException) {
      return param1RuntimeException;
    }
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\at.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */