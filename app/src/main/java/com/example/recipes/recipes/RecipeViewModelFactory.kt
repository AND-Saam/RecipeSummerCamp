package com.example.recipes.recipes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class RecipeViewModelFactory(private val recipeRepo: RecipeRepo): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(RecipeViewModel::class.java)){
            return RecipeViewModel(recipeRepo) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }

}