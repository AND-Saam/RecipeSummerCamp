package com.example.recipes.recipes

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.recipes.R
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.fragment_blank.view.*


class RecipeListFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = inflater.inflate(R.layout.fragment_blank, container, false)
        binding.clickBtn.setOnClickListener {view : View ->
            view.findNavController().navigate(R.id.action_blankFragment_to_fragmentOther)
        }




        return binding
    }




}