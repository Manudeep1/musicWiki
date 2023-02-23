package com.example.musicwiki.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.musicwiki.API_Services.ApiService
import com.example.musicwiki.R
import com.example.musicwiki.RecyclerView.AdapterAlbum
import com.example.musicwiki.Repository.Repository
import com.example.musicwiki.ViewModels.MainViewModel
import com.example.musicwiki.ViewModels.ViewModelFactory
import com.example.musicwiki.databinding.ActivityGenreBinding

class GenreActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGenreBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGenreBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Implementing on backpressed
        binding.ivBackPressed.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }
        // Implementing our navigation bar
        val frag = findViewById<View>(R.id.fragment_container)
        binding.NavigationView.setupWithNavController(frag.findNavController())
    }
}