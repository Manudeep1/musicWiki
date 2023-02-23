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
import com.example.musicwiki.Data_Artist.Artist
import com.example.musicwiki.Data_Artist.ArtistX
import com.example.musicwiki.R
import com.example.musicwiki.UI.AlbumDetailsActivity
import com.example.musicwiki.UI.Artist_Details_Activity
import com.example.musicwiki.UI.Fragment_Artist

class AdapterArtist(val context: Fragment_Artist,private val artist: ArtistX): RecyclerView.Adapter<AdapterArtist.ArtistListViewHolder>() {

    class ArtistListViewHolder(ItemView : View) : RecyclerView.ViewHolder(ItemView) {
        val mainTv = ItemView.findViewById<TextView>(R.id.tvHeading)
        val subTV= ItemView.findViewById<TextView>(R.id.tv_subHeading)
        val imageView = ItemView.findViewById<ImageView>(R.id.imageView1)
        val imageView2 = ItemView.findViewById<ImageView>(R.id.imageView2)
        val mainTv2 = ItemView.findViewById<TextView>(R.id.tv_heading2)
        val subTV2= ItemView.findViewById<TextView>(R.id.tv_subHeading2)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtistListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_view_album,parent,false)
        return ArtistListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return artist.similar.artist.size;
    }

    override fun onBindViewHolder(holder: ArtistListViewHolder, position: Int) {
        holder.mainTv.text = artist.similar.artist[position].name
        holder.mainTv2.text = artist.similar.artist[position].name
        holder.subTV.text = artist.similar.artist[position].name
        holder.subTV2.text = artist.similar.artist[position].name
        Glide.with(context).load(artist.similar.artist[position].image[3]).fitCenter().into(holder.imageView)
        Glide.with(context).load(artist.similar.artist[position].image[3]).into(holder.imageView2)

        holder.itemView.setOnClickListener {
            // Handle item click here
            Toast.makeText(holder.itemView.context, "Clicked item ", Toast.LENGTH_SHORT).show()
            val i = Intent(context.context, Artist_Details_Activity::class.java)

            // passing postion so as to get idea which btn was pressed

           i.putExtra("Artist",position)
            context.startActivity(i)

        }

    }


}