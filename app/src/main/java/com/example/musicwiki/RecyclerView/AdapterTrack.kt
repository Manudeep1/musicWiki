package com.example.musicwiki.RecyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.musicwiki.Data_Track.Album
import com.example.musicwiki.Data_Track.TrackX
import com.example.musicwiki.R
import com.example.musicwiki.UI.Fragment_Track

class AdapterTrack(val context: Fragment_Track,private val track: TrackX) : RecyclerView.Adapter<AdapterTrack.TrackListViewHolder>() {

    class TrackListViewHolder(ItemView : View) : RecyclerView.ViewHolder(ItemView) {
        val mainTv = ItemView.findViewById<TextView>(R.id.tvHeading)
        val subTV= ItemView.findViewById<TextView>(R.id.tv_subHeading)
        val imageView = ItemView.findViewById<ImageView>(R.id.imageView1)
        val imageView2 = ItemView.findViewById<ImageView>(R.id.imageView2)
        val mainTv2 = ItemView.findViewById<TextView>(R.id.tv_heading2)
        val subTV2= ItemView.findViewById<TextView>(R.id.tv_subHeading2)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrackListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_view_album,parent,false)
        return TrackListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 5 ;
    }

    override fun onBindViewHolder(holder: TrackListViewHolder, position: Int) {
        holder.mainTv.text = track.album.title
        holder.mainTv2.text = track.album.title
        holder.subTV.text = "Hello"
        holder.subTV2.text = track.album.artist
        //Glide is used to load image from url
        Glide.with(context).load("https://lastfm.freetls.fastly.net/i/u/64s/3b54885952161aaea4ce2965b2db1638.png").fitCenter().into(holder.imageView)
        Glide.with(context).load("https://lastfm.freetls.fastly.net/i/u/64s/3b54885952161aaea4ce2965b2db1638.png").into(holder.imageView2)


    }


}