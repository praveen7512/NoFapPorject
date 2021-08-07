package com.example.nofapporject.ui.ui

import android.icu.lang.UCharacter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.nofapporject.R
import com.example.nofapporject.ui.ui.Adapters.recyclerview_adapter1
import com.example.nofapporject.ui.ui.Models.WallpaperModel
import kotlinx.android.synthetic.main.activity_home_screenn.*

class HomeScreenn : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screenn)

        val  wallpaperlist :MutableList<WallpaperModel> = mutableListOf<WallpaperModel>()
        wallpaperlist.add(WallpaperModel("WALLPAPER",R.drawable.a))
        wallpaperlist.add(WallpaperModel("WORKOUT",R.drawable.b))
        wallpaperlist.add(WallpaperModel("READING",R.drawable.c))
        wallpaperlist.add(WallpaperModel("MEDITATION",R.drawable.d))

        recyclerview1.adapter = recyclerview_adapter1(this,wallpaperlist)
        recyclerview1.layoutManager =LinearLayoutManager(this ,LinearLayoutManager.HORIZONTAL,false)







    }
}