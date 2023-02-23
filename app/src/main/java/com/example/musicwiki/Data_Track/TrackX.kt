package com.example.musicwiki.Data_Track

data class TrackX(
    val album: Album,
    val artist: Artist,
    val duration: String,
    val listeners: String,
    val mbid: String,
    val name: String,
    val playcount: String,
    val streamable: Streamable,
    val toptags: Toptags,
    val url: String,
    //val wiki: Wiki
)