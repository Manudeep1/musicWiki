package com.example.musicwiki.ViewModels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.musicwiki.Data_Album.Album
import com.example.musicwiki.Data_Album.AlbumX
import com.example.musicwiki.Data_Artist.Artist
import com.example.musicwiki.Data_Track.Track
import com.example.musicwiki.Repository.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel(private val repository: Repository): ViewModel() {
    val album = MutableLiveData<Album>()
    val artist = MutableLiveData<Artist>()
    val track = MutableLiveData<Track>()
    val errorMessage = MutableLiveData<String>()

    fun getAlbum() {

        val response = repository.getAlbum()
        response.enqueue(object : Callback<Album> {
            override fun onResponse(call: Call<Album>, response: Response<Album>) {
                album.postValue(response.body())
            }

            override fun onFailure(call: Call<Album>, t: Throwable) {
                errorMessage.postValue(t.message)
            }
        })
    }
    fun getArtist() {

        val response = repository.getArtist()
        response.enqueue(object : Callback<Artist> {
            override fun onResponse(call: Call<Artist>, response: Response<Artist>) {
                artist.postValue(response.body())
            }

            override fun onFailure(call: Call<Artist>, t: Throwable) {
                errorMessage.postValue(t.message)
            }
        })
    }
    fun getTrack() {

        val response = repository.getTrack()
        response.enqueue(object : Callback<Track> {
            override fun onResponse(call: Call<Track>, response: Response<Track>) {
                track.postValue(response.body())
            }

            override fun onFailure(call: Call<Track>, t: Throwable) {
                errorMessage.postValue(t.message)
            }
        })
    }
}