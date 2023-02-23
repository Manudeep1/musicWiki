package com.example.musicwiki.Data_Artist

data class ArtistX(
    val bio: Bio,
    val image: List<Image>,
    val mbid: String,
    val name: String,
    val ontour: String,
    val similar: Similar,
    val stats: Stats,
    val streamable: String,
    val tags: Tags,
    val url: String
)