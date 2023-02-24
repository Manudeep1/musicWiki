package com.example.musicwiki.RecyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.musicwiki.Data_Album.Album
import com.example.musicwiki.R
import com.example.musicwiki.UI.Artist_Details_Activity

class TopAlbumsAdapter(val context: Artist_Details_Activity, private val album: Album) : RecyclerView.Adapter<TopAlbumsAdapter.TopAlbumsAdapterViewHolder>() {



    inner class TopAlbumsAdapterViewHolder(ItemView : View) : RecyclerView.ViewHolder(ItemView) {

        val tilte = itemView.findViewById<TextView>(R.id.tv_title)
        val  subTitle = itemView.findViewById<TextView>(R.id.tv_subTitle)
        val imageView = itemView.findViewById<ImageView>(R.id.iv_bg)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopAlbumsAdapterViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_view_album_details,parent,false)
        return TopAlbumsAdapterViewHolder(view)
    }

    override fun getItemCount(): Int {
        return  album.album.tracks.track.size
    }

    override fun onBindViewHolder(holder: TopAlbumsAdapterViewHolder, position: Int) {
        holder.tilte.text = album.album.tracks.track[position].name
        holder.subTitle.text = album.album.tracks.track[position].artist.name
        Glide.with(context).load("https://lastfm.freetls.fastly.net/i/u/64s/3b54885952161aaea4ce2965b2db1638.png").centerCrop().into(holder.imageView
        )



    }






}