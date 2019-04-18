package com.example.anvilutilities;

import net.minecraft.block.Block;
import net.minecraft.block.BlockAnvil;
import net.minecraft.client.particle.ParticleHeart;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



@Mod.EventBusSubscriber(modid = AnvilUtilities.MODID)
public class ATEventHandler {
  @SubscribeEvent
  public static void onAnvilClick(PlayerInteractEvent e){
    if (e.getWorld().isRemote)return;
    System.out.println(InWorldAnvilRecipeHandler.getAllRecipes());
    EntityPlayer p = e.getEntityPlayer();
    ItemStack stack = p.getHeldItemMainhand();
    BlockPos pos = e.getPos();
    Block block = e.getWorld().getBlockState(pos).getBlock();
    if (!(block instanceof BlockAnvil))return;
    pos = pos.up();
    double r = 1;
    List<Entity> items = e.getWorld().getEntitiesWithinAABB(EntityItem.class, new AxisAlignedBB(pos.getX() - r, pos.getY() - r, pos.getZ() - r, pos.getX() + r, pos.getY() + r, pos.getZ() + r));

    if (items.size()==0)return;

    ArrayList<ItemStack> stacks = new ArrayList<>();

    for (int i = 0 ;i<items.size();i++) {
      EntityItem item = (EntityItem)items.get(i);
      ItemStack stack1 = item.getItem();
      stacks.add(i,stack1);
    }
    System.out.println(stacks);
    InWorldAnvilRecipe recipe = InWorldAnvilRecipeHandler.getRecipe(stack, stacks);

    if (recipe != null) {
      EntityItem result = new EntityItem(p.world, pos.getX(), pos.getY(), pos.getZ(), recipe.getOutput());
      for (Entity entity:items)entity.setDead();
      p.world.spawnEntity(result);
    }
    e.setCanceled(true);
  }
}
