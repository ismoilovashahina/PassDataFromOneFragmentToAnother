package uz.itschool.myapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.itschool.myapplication.R
import uz.itschool.myapplication.databinding.ActivityMainBinding
import uz.itschool.myapplication.databinding.FragmentABinding
import uz.itschool.myapplication.databinding.FragmentBBinding

class FragmentB : Fragment() {

    private lateinit var binding: FragmentBBinding
    var output : String ?= ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this
        binding = FragmentBBinding.inflate(inflater, container, false)
        output = arguments?.getString("message")
        binding.message.text = output
        return binding.root

    }

}