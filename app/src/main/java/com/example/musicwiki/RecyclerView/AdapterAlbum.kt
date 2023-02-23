package com.example.musicwiki.RecyclerView

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.musicwiki.Data_Album.AlbumX

import com.example.musicwiki.R
import com.example.musicwiki.UI.AlbumDetailsActivity
import com.example.musicwiki.UI.Fragment_Album
import com.example.musicwiki.UI.GenreActivity

class AdapterAlbum(val context: Fragment_Album, private val album: AlbumX) : RecyclerView.Adapter<AdapterAlbum.AlbumListViewHolder>() {



    inner class AlbumListViewHolder(ItemView : View) : RecyclerView.ViewHolder(ItemView) {
        val mainTv = ItemView.findViewById<TextView>(R.id.tvHeading)
        val subTV= ItemView.findViewById<TextView>(R.id.tv_subHeading)
        val imageView = ItemView.findViewById<ImageView>(R.id.imageView1)
        val imageView2 = ItemView.findViewById<ImageView>(R.id.imageView2)
        val mainTv2 = ItemView.findViewById<TextView>(R.id.tv_heading2)
        val subTV2= ItemView.findViewById<TextView>(R.id.tv_subHeading2)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_view_album,parent,false)
        return AlbumListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 3;
    }

    override fun onBindViewHolder(holder: AlbumListViewHolder, position: Int) {
        holder.mainTv.text = album.name!!
        holder.mainTv2.text = album.name!!
        holder.subTV.text = album.artist
        holder.subTV2.text = album.artist

        // Using Glide to load image
        Glide.with(context).load("https://lastfm.freetls.fastly.net/i/u/174s/3b54885952161aaea4ce2965b2db1638.png").fitCenter().into(holder.imageView)
        Glide.with(context).load("https://lastfm.freetls.fastly.net/i/u/174s/3b54885952161aaea4ce2965b2db1638.png").into(holder.imageView2)


        holder.itemView.setOnClickListener {
            // Handle item click here
            Toast.makeText(holder.itemView.context, "Clicked item ", Toast.LENGTH_SHORT).show()
            val i = Intent(context.context,AlbumDetailsActivity::class.java)
            context.startActivity(i)

        }
    }






}