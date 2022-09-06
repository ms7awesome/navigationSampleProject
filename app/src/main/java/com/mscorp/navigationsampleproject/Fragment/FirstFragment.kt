package com.mscorp.navigationsampleproject.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.NavDirections
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.mscorp.navigationsampleproject.R

class FirstFragment : Fragment() {

    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        val button = view.findViewById<Button>(R.id.button)
        val button2 = view.findViewById<Button>(R.id.button2)

        button.setOnClickListener {
//            val direction: NavDirections =
//            navController.navigate(R.id.action_firstFragment_to_secondFragment)
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(2)
            navController.navigate(action)
        }

        button2.setOnClickListener {
            navController.navigate(R.id.action_firstFragment_to_thirdFragment)

        }

    }
}