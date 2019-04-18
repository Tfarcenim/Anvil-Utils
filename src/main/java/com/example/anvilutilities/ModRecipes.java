package com.example.anvilutilities;

import net.minecraft.item.ItemStack;

import java.util.*;

import static net.minecraft.init.Items.*;

public class ModRecipes {
  public static void register(){
    InWorldAnvilRecipeHandler.addInWorldAnvilRecipe(new ItemStack(STICK),
            new ArrayList<>(Arrays.asList(new ItemStack(CLAY_BALL),new ItemStack(COAL),
            new ItemStack(IRON_INGOT),new ItemStack(GOLD_INGOT),
            new ItemStack(DYE,1,4),new ItemStack(REDSTONE))),
            new ItemStack(DIAMOND));
    InWorldAnvilRecipeHandler.addInWorldAnvilRecipe(new ItemStack(STICK),
            new ArrayList<>(Arrays.asList(new ItemStack(WHEAT_SEEDS,2))),new ItemStack(WHEAT));
    InWorldAnvilRecipeHandler.addInWorldAnvilRecipe(new ItemStack(STICK),
            new ArrayList<>(Arrays.asList(new ItemStack(CLAY_BALL,64),new ItemStack(DIAMOND))),new ItemStack(NETHER_STAR));
  }
}
