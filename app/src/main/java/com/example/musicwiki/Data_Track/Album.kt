package com.example.musicwiki.Data_Track

data class Album(
    val attr: Attr,
    val artist: String,
    val image: List<Image>,
    val mbid: String,
    val title: String,
    val url: String
)