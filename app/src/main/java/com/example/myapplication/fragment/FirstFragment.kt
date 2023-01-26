package com.example.myapplication.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private val binding : FragmentFirstBinding by lazy {
        FragmentFirstBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding.button3.setOnClickListener{
            Navigation.findNavController(binding.root).navigate(R.id.action_firstFragment_to_secondFragment2)
        }

        return binding.root
    }

}