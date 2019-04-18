package com.example.anvilutilities.jei;

import com.example.anvilutilities.InWorldAnvilRecipe;
import com.example.anvilutilities.InWorldAnvilRecipeHandler;
import com.google.common.collect.Lists;
import mezz.jei.api.*;
import mezz.jei.api.recipe.IRecipeWrapper;
import mezz.jei.api.recipe.IStackHelper;
import mezz.jei.api.recipe.VanillaRecipeCategoryUid;

import java.util.ArrayList;
import java.util.List;

@JEIPlugin
public class InWorldAnvilRecipePlugin implements IModPlugin
{
	private IJeiHelpers jeiHelpers;
	public static IStackHelper stackHelper;


	@Override
	public void register(IModRegistry registry)
	{
		this.jeiHelpers = registry.getJeiHelpers();
		InWorldAnvilRecipePlugin.stackHelper = jeiHelpers.getStackHelper();

		List<IRecipeWrapper> anvilRecipes = new ArrayList<>();
		//for (InWorldAnvilRecipe ar : InWorldAnvilRecipeHandler.getAllRecipes())
		//	anvilRecipes.add(jeiHelpers.getVanillaRecipeFactory().createAnvilRecipe(ar.getFirst(), Lists.newArrayList(ar.getSecond()), Lists.newArrayList(ar.getOutput())));
	//	registry.addRecipes(anvilRecipes, VanillaRecipeCategoryUid.ANVIL);
		//DescriptionHandler.addDescriptions(registry);
	}

}
