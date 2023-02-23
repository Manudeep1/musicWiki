package com.example.musicwiki.UI

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.musicwiki.API_Services.ApiService
import com.example.musicwiki.Data_Album.Album

import com.example.musicwiki.R
import com.example.musicwiki.RecyclerView.AdapterAlbum
import com.example.musicwiki.RecyclerView.AdapterArtist
import com.example.musicwiki.RecyclerView.AdapterTrack
import com.example.musicwiki.Repository.Repository
import com.example.musicwiki.ViewModels.MainViewModel
import com.example.musicwiki.ViewModels.ViewModelFactory
import com.example.musicwiki.databinding.FragmentAlbumBinding
import com.example.musicwiki.databinding.FragmentArtistBinding


class Fragment_Artist : Fragment() {
    private lateinit var rcv :RecyclerView
    private val retrofitService = ApiService.getInstance()
    private lateinit var viewModel: MainViewModel
    var data : Album? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment__artist, container, false)
        // Inflate the layout for this fragment
        viewModel = ViewModelProvider(this, ViewModelFactory(Repository(retrofitService))).get(
            MainViewModel::class.java)
        //Creating instance for our recycler view with MVVM patter to feed the data
        rcv = view.findViewById<RecyclerView>(R.id.rvArtist)
        viewModel.artist.observe(viewLifecycleOwner) {
            rcv.layoutManager = LinearLayoutManager(context)

            rcv.adapter = AdapterArtist(this,it.artist)
        }
        viewModel.getArtist()
        return view
    }



}