package com.example.musicwiki.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.example.musicwiki.API_Services.ApiService
import com.example.musicwiki.R
import com.example.musicwiki.Repository.Repository
import com.example.musicwiki.ViewModels.MainViewModel
import com.example.musicwiki.ViewModels.ViewModelFactory
import com.example.musicwiki.databinding.ActivityAlbumDetailsBinding

class AlbumDetailsActivity : AppCompatActivity() {
    //Activity Binding
    private lateinit var binding : ActivityAlbumDetailsBinding
    private lateinit var viewModel : MainViewModel
    private val retrofitService = ApiService.getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlbumDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.ivBackPressedAlbum.setOnClickListener {
            val i = Intent(this, GenreActivity::class.java)
            startActivity(i)
        }
        Log.d("AlbumDetailsTAG", "Album")
        viewModel = ViewModelProvider(this, ViewModelFactory(Repository(retrofitService))).get(MainViewModel::class.java)

        //binding our view as per requirement

        viewModel.album.observe(this, Observer {
            Log.d("AlbumDetailsTAG", "Album: ${it.album.image[3].text}")
            binding.textView2.text= it.album.name
            binding.textView.text = it.album.artist
            binding.descriptionAlbumTv.text = it.album.wiki.summary
            Glide.with(this).load("https://lastfm.freetls.fastly.net/i/u/174s/3b54885952161aaea4ce2965b2db1638.png").fitCenter().into(binding.ivAlbum)



        })
        viewModel.getAlbum()
    }
}