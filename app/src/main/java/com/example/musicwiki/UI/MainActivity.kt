package com.example.musicwiki.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.musicwiki.R
import com.example.musicwiki.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //Activity Binding
    private lateinit var binding : ActivityMainBinding
    private var flag = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    /*
    Implementing expand btn function here, if flag == true then expand and the drawable
     */
        binding.expandIV.setOnClickListener {
            if(flag == true)
            {
                binding.gridLayout2.visibility = View.VISIBLE
                binding.expandIV.setImageResource(R.drawable.baseline_keyboard_arrow_up_24)
                flag = false
            }
            else{
                binding.gridLayout2.visibility = View.INVISIBLE
                binding.expandIV.setImageResource(R.drawable.baseline_keyboard_arrow_down_24)
                flag = true
            }

        }
            //ON button Click, We can implement same thing using When keyword too
        binding.genrebtn1.setOnClickListener {
                val i = Intent(this, GenreActivity::class.java)
                startActivity(i)

        }
        binding.genrebtn2.setOnClickListener {
            val i = Intent(this, GenreActivity::class.java)
            startActivity(i)

        }
        binding.genrebtn3.setOnClickListener {
            val i = Intent(this, GenreActivity::class.java)
            startActivity(i)

        }
        binding.genrebtn4.setOnClickListener {
            val i = Intent(this, GenreActivity::class.java)
            startActivity(i)

        }
        binding.genrebtn5.setOnClickListener {
            val i = Intent(this, GenreActivity::class.java)
            startActivity(i)

        }
        binding.genrebtn6.setOnClickListener {
            val i = Intent(this, GenreActivity::class.java)
            startActivity(i)

        }
        binding.genrebtn7.setOnClickListener {
            val i = Intent(this, GenreActivity::class.java)
            startActivity(i)

        }
        binding.genrebtn8.setOnClickListener {
            val i = Intent(this, GenreActivity::class.java)
            startActivity(i)

        }
        binding.genrebtn9.setOnClickListener {
            val i = Intent(this, GenreActivity::class.java)
            startActivity(i)

        }
        binding.genrebtn10.setOnClickListener {
            val i = Intent(this, GenreActivity::class.java)
            startActivity(i)

        }
        binding.genrebtn11.setOnClickListener {
            val i = Intent(this, GenreActivity::class.java)
            startActivity(i)

        }
        binding.genrebtn12.setOnClickListener {
            val i = Intent(this, GenreActivity::class.java)
            startActivity(i)

        }
        binding.genrebtn13.setOnClickListener {
            val i = Intent(this, GenreActivity::class.java)
            startActivity(i)

        }
        binding.genrebtn14.setOnClickListener {
            val i = Intent(this, GenreActivity::class.java)
            startActivity(i)

        }
        binding.genrebtn15.setOnClickListener {
            val i = Intent(this, GenreActivity::class.java)
            startActivity(i)

        }
        binding.genrebtn16.setOnClickListener {
            val i = Intent(this, GenreActivity::class.java)
            startActivity(i)

        }
        binding.genrebtn17.setOnClickListener {
            val i = Intent(this, GenreActivity::class.java)
            startActivity(i)

        }
        binding.genrebtn18.setOnClickListener {
            val i = Intent(this, GenreActivity::class.java)
            startActivity(i)

        }
        binding.genrebtn19.setOnClickListener {
            val i = Intent(this, GenreActivity::class.java)
            startActivity(i)

        }
        binding.genrebtn20.setOnClickListener {
            val i = Intent(this, GenreActivity::class.java)
            startActivity(i)

        }
        binding.genrebtn21.setOnClickListener {
            val i = Intent(this, GenreActivity::class.java)
            startActivity(i)

        }
        binding.genrebtn22.setOnClickListener {
            val i = Intent(this, GenreActivity::class.java)
            startActivity(i)

        }
        binding.genrebtn23.setOnClickListener {
            val i = Intent(this, GenreActivity::class.java)
            startActivity(i)

        }
        binding.genrebtn24.setOnClickListener {
            val i = Intent(this, GenreActivity::class.java)
            startActivity(i)

        }




    }
}
