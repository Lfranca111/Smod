package com.schnurritv.sexmod;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class c8 implements IMessage {
  boolean b;
  
  Vec3d a;
  
  public c8() {}
  
  public c8(Vec3d paramVec3d) {
    this.a = paramVec3d;
  }
  
  public void fromBytes(ByteBuf paramByteBuf) {
    this.a = new Vec3d(paramByteBuf.readDouble(), paramByteBuf.readDouble(), paramByteBuf.readDouble());
    this.b = true;
  }
  
  public void toBytes(ByteBuf paramByteBuf) {
    paramByteBuf.writeDouble(this.a.field_72450_a);
    paramByteBuf.writeDouble(this.a.field_72448_b);
    paramByteBuf.writeDouble(this.a.field_72449_c);
  }
  
  public static class a implements IMessageHandler<c8, IMessage> {
    public IMessage a(c8 param1c8, MessageContext param1MessageContext) {
      try {
        if (param1c8.b)
          try {
            if (param1MessageContext.side == Side.SERVER) {
              FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
                    World world = (param1MessageContext.getServerHandler()).field_147369_b.field_70170_p;
                    EntityItem entityItem1 = new EntityItem(world, param1c8.a.field_72450_a, param1c8.a.field_72448_b, param1c8.a.field_72449_c, new ItemStack(Items.field_151045_i, U.f.nextInt(2) + 1));
                    EntityItem entityItem2 = new EntityItem(world, param1c8.a.field_72450_a, param1c8.a.field_72448_b, param1c8.a.field_72449_c, new ItemStack(Items.field_151166_bC, U.f.nextInt(2) + 1));
                    EntityItem entityItem3 = new EntityItem(world, param1c8.a.field_72450_a, param1c8.a.field_72448_b, param1c8.a.field_72449_c, new ItemStack(Items.field_151043_k, U.f.nextInt(2) + 1));
                    world.func_72838_d((Entity)entityItem1);
                    world.func_72838_d((Entity)entityItem2);
                    world.func_72838_d((Entity)entityItem3);
                  });
              return null;
            } 
            System.out.println("received an invalid message @MakeRichWish :(");
            return null;
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      System.out.println("received an invalid message @MakeRichWish :(");
      return null;
    }
    
    private static RuntimeException a(RuntimeException param1RuntimeException) {
      return param1RuntimeException;
    }
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\c8.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */