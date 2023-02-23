package com.example.musicwiki.UI

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.musicwiki.API_Services.ApiService
import com.example.musicwiki.Data_Album.Album
import com.example.musicwiki.R
import com.example.musicwiki.RecyclerView.AdapterAlbum
import com.example.musicwiki.RecyclerView.AdapterTrack
import com.example.musicwiki.Repository.Repository
import com.example.musicwiki.ViewModels.MainViewModel
import com.example.musicwiki.ViewModels.ViewModelFactory


class Fragment_Track : Fragment() {

    private lateinit var rcv :RecyclerView
    private val retrofitService = ApiService.getInstance()
    private lateinit var viewModel: MainViewModel
    var data : Album? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment__track, container, false)
        viewModel = ViewModelProvider(this, ViewModelFactory(Repository(retrofitService))).get(
            MainViewModel::class.java
        )
        //Creating instance for our recycler view with MVVM patter to feed the data
        rcv = view.findViewById<RecyclerView>(R.id.rvTrack)
        viewModel.track.observe(viewLifecycleOwner) {
            rcv.layoutManager = LinearLayoutManager(context)
            rcv.adapter = AdapterTrack(this,it.track)
        }
        viewModel.getTrack()
        return view
    }

}