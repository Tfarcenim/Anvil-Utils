package com.example.anvilutilities;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;

import java.util.ArrayList;

public class InWorldAnvilRecipe {

  private final ItemStack hammer;
  private final ArrayList<Ingredient> inputArray;
  private final ItemStack output;

  public InWorldAnvilRecipe(ItemStack hammer, ArrayList<Ingredient> inputs, ItemStack output) {
    this.hammer = hammer;
    this.inputArray = inputs;
    this.output = output;
  }
  public ItemStack getHammer(){return hammer;}
  public ItemStack getOutput() {
    return output;
  }
  public ArrayList<Ingredient> getInputs() {
    return inputArray;
  }
}
