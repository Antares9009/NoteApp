package com.inegi.noteapp.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.inegi.noteapp.model.Note
import com.inegi.noteapp.repository.NoteRepository
import kotlinx.coroutines.launch

class NoteViewModel (
    app: Application,
    private val noteRepository: NoteRepository
): AndroidViewModel(app){

    fun addNote(note: Note) = viewModelScope.launch {
        noteRepository.addNote(note)
    }

    fun updateNote(note: Note) = viewModelScope.launch {
        noteRepository.updateNote(note)
    }

    fun deleteNote(note: Note) = viewModelScope.launch {
        noteRepository.deleteNote(note)
    }

    fun getAllNote() = noteRepository.getAllNotes()
}