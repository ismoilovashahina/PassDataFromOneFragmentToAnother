package uz.itschool.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import uz.itschool.myapplication.databinding.ActivityMainBinding
import uz.itschool.myapplication.databinding.FragmentBBinding
import uz.itschool.myapplication.fragments.FragmentA
import uz.itschool.myapplication.fragments.FragmentB

class MainActivity : AppCompatActivity(), Communicator {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmentA = FragmentA()


        // to start the app with fragment A
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, fragmentA).commit()




    }

    override fun passData(editTextData: String) {
        val bundle = Bundle()
        bundle.putString("message", editTextData)

        val transaction = this.supportFragmentManager.beginTransaction()
        val FragmentB = FragmentB()

        FragmentB.arguments = bundle



        //to pass data to fragment B and open it
        transaction.replace(R.id.fragment_container, FragmentB).commit()

    }
}