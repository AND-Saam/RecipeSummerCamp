package com.example.recipes.recipes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recipes.R
import kotlinx.android.synthetic.main.fragment_other.view.*


class RecipeSearchFragment : Fragment() {

    private lateinit var adapter: RecipeAdapter
    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var viewModel: RecipeViewModel
    private lateinit var viewModelFactory: RecipeViewModelFactory

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = inflater.inflate(R.layout.fragment_other, container, false)

        //Define how I want the items in my recyleViewer to be displayed
        linearLayoutManager = LinearLayoutManager(context)
        binding.food_list.layoutManager = linearLayoutManager

        //Boiler plate code that creates a instant of the viewModel needs a better understanding
        viewModelFactory = RecipeViewModelFactory(RecipeRepo())

        //ViewModel design pattern that provides the data for a the Fragment UI, and contains data-handling business logic to communicate with the model
        //Viewmodel should never have a reference to the fragment, instead the component should observe the data and see if any changes have be made to it or w/e
        //Uses livedata which is a observable data holder allows app to monitor any changes to the object without creating that reference to the fragment
        viewModel = ViewModelProvider(this,viewModelFactory).get(RecipeViewModel::class.java)
        viewModel.recipe.observe(viewLifecycleOwner, Observer {
            adapter = RecipeAdapter(it)
            binding.food_list.adapter = adapter
        })






        return binding
    }


}