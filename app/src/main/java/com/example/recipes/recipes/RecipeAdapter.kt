package com.example.recipes.recipes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recipes.R
import com.example.recipes.models.Recipe
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.food_item_view.view.*

class RecipeAdapter (private val data: List<Recipe>) : RecyclerView.Adapter<RecipeAdapter.RecipeItemHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecipeAdapter.RecipeItemHolder {
         return RecipeItemHolder(LayoutInflater.from(parent.context).inflate(R.layout.food_item_view, parent, false))
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: RecipeAdapter.RecipeItemHolder, position: Int) {
       val recipeItem = data[position]
        holder.bindRecipeData(recipeItem)
    }

    class RecipeItemHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val view: View = view
        private lateinit var recipe: Recipe

        fun bindRecipeData(recipe: Recipe ){
           this.recipe = recipe
            view.food_title.text = recipe.recipe_title
            view.food_desc.text = recipe.recipe_desc
            view.food_serving.text = recipe.recipe_serving
            Picasso.get().load("https://images-na.ssl-images-amazon.com/images/I/810FiMQwZ5L._AC_SL1500_.jpg").resize(250,250).centerCrop().into(view.imageView)
        }
    }

}