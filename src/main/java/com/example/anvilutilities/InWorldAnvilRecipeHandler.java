package com.example.anvilutilities;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;

public class InWorldAnvilRecipeHandler {
  static List<InWorldAnvilRecipe> anvilRecipes = new ArrayList<>();

  public static List<InWorldAnvilRecipe> getAllRecipes()
  {
    return anvilRecipes;
  }

  public static void addInWorldAnvilRecipe(ItemStack hammer, ArrayList<Ingredient> inputs, ItemStack output)
  {
    anvilRecipes.add(new InWorldAnvilRecipe(hammer, inputs, output));
  }

  public static InWorldAnvilRecipe getRecipe(ItemStack hammer, ArrayList<Ingredient> inputs)
  {
    for (InWorldAnvilRecipe recipe : anvilRecipes)
    {
      if (areStackListsEqual(hammer, inputs, recipe.getHammer(),recipe.getInputs()))
      {
        return recipe;
      }
    }

    return null;
  }

  private static boolean areStackListsEqual(ItemStack o1, ArrayList<Ingredient> o2, ItemStack o3, ArrayList<Ingredient> o4)
  {
    return ((ItemStack.areItemsEqual(o1, o3) && areItemListsEqual(stackToString(o2),stackToString(o4))));
  }

  private static ArrayList<String> stackToString(ArrayList<Ingredient> stacks){
    ArrayList<String> strings = new ArrayList<>();
    for (Ingredient stack : stacks){
      strings.add(stack.toString());
    }
    return strings;
  }

  private static boolean areItemListsEqual(ArrayList<String> l1, ArrayList<String> l2){
    java.util.Collections.sort(l1);java.util.Collections.sort(l2);
   return (l1.equals(l2));
  }
}