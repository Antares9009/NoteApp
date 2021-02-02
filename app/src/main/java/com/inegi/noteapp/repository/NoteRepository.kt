package com.inegi.noteapp.repository

import com.inegi.noteapp.db.NoteDatabase
import com.inegi.noteapp.model.Note

class NoteRepository(private val db: NoteDatabase){

    suspend fun addNote(note: Note) = db.getNoteDao().addNote(note)
    suspend fun updateNote(note: Note) = db.getNoteDao().updateNote(note)
    suspend fun deleteNote(note: Note) = db.getNoteDao().deleteNote(note)
    fun getAllNotes() = db.getNoteDao().getAllNotes()
    fun searchNote(query: String?) = db.getNoteDao().searchNote(query)

}