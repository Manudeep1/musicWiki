package com.example.musicwiki.UI

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.example.musicwiki.API_Services.ApiService
import com.example.musicwiki.Repository.Repository
import com.example.musicwiki.ViewModels.MainViewModel
import com.example.musicwiki.ViewModels.ViewModelFactory
import com.example.musicwiki.databinding.ActivityArtistDetailsBinding

class Artist_Details_Activity : AppCompatActivity() {
    //Activity Binding
    private lateinit var binding : ActivityArtistDetailsBinding
    private lateinit var viewModel : MainViewModel
    private val retrofitService = ApiService.getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityArtistDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val b = this.intent.extras
        val pos = b!!.getInt("Artist")

        binding.ivBackPressedArtist.setOnClickListener {
            val i = Intent(this, GenreActivity::class.java)
            startActivity(i)
        }

        Log.d("AlbumDetailsTAG", "Album")
        viewModel = ViewModelProvider(this, ViewModelFactory(Repository(retrofitService))).get(
            MainViewModel::class.java)

        //binding our view as per requirement

        viewModel.artist.observe(this, Observer {
            Log.d("AlbumDetailsTAG", "Album: ${it}")
            binding.artistName.text = it.artist.similar.artist[pos].name
            binding.playCountNumerical.text = it.artist.stats.playcount
            binding.followersCountTv.text = it.artist.stats.listeners
            binding.DescriptionTV.text = it.artist.bio.summary
            Glide.with(this).load(it.artist.image[3].text).into(binding.ivArtist)
        })
        viewModel.getArtist()
    }
}