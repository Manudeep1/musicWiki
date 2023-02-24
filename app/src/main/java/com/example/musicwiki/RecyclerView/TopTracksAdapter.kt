package com.example.musicwiki.RecyclerView

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.musicwiki.Data_Album.Album
import com.example.musicwiki.R
import com.example.musicwiki.UI.AlbumDetailsActivity
import com.example.musicwiki.UI.Artist_Details_Activity


class TopTracksAdapter( val context:Artist_Details_Activity, private val album:Album) : RecyclerView.Adapter<TopTracksAdapter.TopTracksAdapterViewHolder>() {



    inner class TopTracksAdapterViewHolder(ItemView : View) : RecyclerView.ViewHolder(ItemView) {

        val tilte = itemView.findViewById<TextView>(R.id.tv_title)
        val  subTitle = itemView.findViewById<TextView>(R.id.tv_subTitle)
        val imageView = itemView.findViewById<ImageView>(R.id.iv_bg)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopTracksAdapterViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_view_album_details,parent,false)
        return TopTracksAdapterViewHolder(view)
    }

    override fun getItemCount(): Int {
        return  album.album.tracks.track.size
    }

    override fun onBindViewHolder(holder: TopTracksAdapterViewHolder, position: Int) {
        holder.tilte.text = album.album.tracks.track[position].name
        holder.subTitle.text = album.album.tracks.track[position].artist.name
        Glide.with(context).load("https://lastfm.freetls.fastly.net/i/u/64s/3b54885952161aaea4ce2965b2db1638.png").centerCrop().into(holder.imageView
        )



    }






}