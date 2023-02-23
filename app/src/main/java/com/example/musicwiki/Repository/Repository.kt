package com.example.musicwiki.Repository

import com.example.musicwiki.API_Services.ApiService

class Repository constructor(private val apiService: ApiService) {
      fun getAlbum() = apiService.getAlbum()
      fun getArtist() = apiService.getArtist()
      fun getTrack() = apiService.getTrack()
}