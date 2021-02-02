package com.inegi.noteapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.inegi.noteapp.databinding.ActivityMainBinding
import com.inegi.noteapp.db.NoteDatabase
import com.inegi.noteapp.repository.NoteRepository
import com.inegi.noteapp.viewmodel.NoteViewModel
import com.inegi.noteapp.viewmodel.NoteViewModelProviderFactory

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
    lateinit var noteViewModel: NoteViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        setUpViewModel()

    }

    private fun setUpViewModel(){

        val noteRepository = NoteRepository(
            NoteDatabase(this)
        )

        val viewModelProviderFactory =
            NoteViewModelProviderFactory(
                application,
                noteRepository
            )

        noteViewModel = ViewModelProvider(
            this,
            viewModelProviderFactory
        ).get(NoteViewModel::class.java)
    }
}