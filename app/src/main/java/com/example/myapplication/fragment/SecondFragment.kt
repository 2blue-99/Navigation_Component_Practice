package com.example.myapplication.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private val binding by lazy {
        FragmentSecondBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding.button3.setOnClickListener{
            Navigation.findNavController(binding.root).navigate(R.id.action_secondFragment_to_thirdFragment2)
        }
        binding.button2.setOnClickListener{
            Navigation.findNavController(binding.root).navigate(R.id.action_secondFragment_to_firstFragment)
        }

        return binding.root
    }

}