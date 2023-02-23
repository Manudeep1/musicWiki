package com.example.musicwiki.API_Services

import com.example.musicwiki.Data_Album.Album
import com.example.musicwiki.Data_Album.AlbumX
import com.example.musicwiki.Data_Artist.Artist
import com.example.musicwiki.Data_Track.Track
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiService {
    //Establishing HTTP request f
    @GET("?method=album.getinfo&api_key=bee24238318f832e853f8836b61a7a2c&artist=Cher&album=Believe&format=json")
     fun getAlbum() : Call<Album>

    @GET("?method=artist.getinfo&artist=Cher&api_key=bee24238318f832e853f8836b61a7a2c&format=json")
    fun getArtist() : Call<Artist>

    @GET("?method=track.getInfo&api_key=bee24238318f832e853f8836b61a7a2c&artist=cher&track=believe&format=json")
    fun getTrack() : Call<Track>
    companion object{
        var retrofitService: ApiService? = null

        //Create the Retrofit service instance using the retrofit.
         fun getInstance(): ApiService {

            if (retrofitService == null) {
                val retrofit = Retrofit.Builder()
                    .baseUrl("https://ws.audioscrobbler.com/2.0/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                retrofitService = retrofit.create(ApiService::class.java)
            }
            return retrofitService!!
        }
    }

}