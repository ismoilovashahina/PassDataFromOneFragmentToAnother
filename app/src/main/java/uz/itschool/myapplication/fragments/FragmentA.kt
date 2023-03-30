package uz.itschool.myapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import uz.itschool.myapplication.Communicator
import uz.itschool.myapplication.R
import uz.itschool.myapplication.databinding.ActivityMainBinding
import uz.itschool.myapplication.databinding.FragmentABinding

class FragmentA : Fragment() {

private lateinit var communicator: Communicator
private lateinit var binding: FragmentABinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentABinding.inflate(inflater, container, false)

        communicator = activity as Communicator
        binding.submit.setOnClickListener {
            communicator.passData(binding.input.text.toString())
        }
        return binding.root

    }

}