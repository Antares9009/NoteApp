package com.inegi.noteapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.inegi.noteapp.databinding.ActivityMainBinding

/*
* MVVM Note App Kotlin & Android Studio
*
* - MVVM Architecture
* - Room Database
* - One Activity - Multiples Fragments
* - Navigation Components
* - Action With Animation
* - Search View DeffUtil & Data Binding with Recycler View
*
* */
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

    }
}