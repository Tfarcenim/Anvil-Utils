package com.example.anvilutilities;

import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.item.IIngredient;
import crafttweaker.api.item.IItemStack;
import crafttweaker.api.minecraft.CraftTweakerMC;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

import java.util.ArrayList;

@ZenRegister
@ZenClass("mods.anvilutilities.AnvilUtils")
@SuppressWarnings("unused")
public class AnvilUtils {

  @ZenMethod
  public static void addRecipe(IItemStack hammer, IIngredient[] inputs, IItemStack output) {
    ItemStack hammerStack = CraftTweakerMC.getItemStack(hammer);
    ArrayList<Ingredient> inputStacks = new ArrayList<>();
    for (IIngredient input : inputs) {
      Ingredient inputStack = CraftTweakerMC.getIngredient(input);
      inputStacks.add(inputStack);
    }
    ItemStack outputStack = CraftTweakerMC.getItemStack(output);

    InWorldAnvilRecipeHandler.addInWorldAnvilRecipe(hammerStack, inputStacks, outputStack);
  }
}
