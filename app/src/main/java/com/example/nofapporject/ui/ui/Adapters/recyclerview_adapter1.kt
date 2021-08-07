package com.example.nofapporject.ui.ui.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.nofapporject.R
import com.example.nofapporject.ui.ui.Models.WallpaperModel

class recyclerview_adapter1(private val context: Context,val data :List<WallpaperModel>) : RecyclerView.Adapter<recyclerview_adapter1.Vholder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vholder {
        val view = LayoutInflater.from(context).inflate(R.layout.singlerow,parent,false)
        return Vholder(view)
    }

    override fun onBindViewHolder(holder: Vholder, position: Int) {

        holder.textView.text = data[position].wallpapername
        holder.imageView.setImageResource(data[position].imag)

    }

    override fun getItemCount(): Int {
     return data.size
    }


    class Vholder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val textView :TextView = itemView.findViewById(R.id.recyclerviewText1)
        val imageView:ImageView = itemView.findViewById(R.id.recyclerviewimageView1)


    }
}