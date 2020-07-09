package com.example.recipes.recipes

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.recipes.models.Recipe

class RecipeViewModel constructor(recipeRepo : RecipeRepo) : ViewModel() {
    val recipe: LiveData<MutableList<Recipe>> = recipeRepo.getRecipes()
}