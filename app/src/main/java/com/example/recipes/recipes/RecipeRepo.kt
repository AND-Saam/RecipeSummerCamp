package com.example.recipes.recipes

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.recipes.models.Recipe

class RecipeRepo() {
    fun getRecipes() : LiveData<MutableList<Recipe>> {
        val recipes = MutableLiveData<MutableList<Recipe>>()
        recipes.postValue(
            mutableListOf(
                Recipe("Food 1", "Food 2", "Food 3", "Food 4"),
                Recipe("Food 1", "Food 2", "Food 3", "Food 4"),
                Recipe("Food 1", "Food 2", "Food 3", "Food 4"),
                Recipe("Food 1", "Food 2", "Food 3", "Food 4"),
                Recipe("Food 1", "Food 2", "Food 3", "Food 4"),
                Recipe("Food 1", "Food 2", "Food 3", "Food 4"),
                Recipe("Food 1", "Food 2", "Food 3", "Food 4"),
                Recipe("Food 1", "Food 2", "Food 3", "Food 4"),
                Recipe("Food 1", "Food 2", "Food 3", "Food 4"),
                Recipe("Food 1", "Food 2", "Food 3", "Food 4")
            )
        )
        return recipes
    }
}