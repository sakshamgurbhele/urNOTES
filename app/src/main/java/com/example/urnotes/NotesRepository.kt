package com.example.urnotes

import androidx.lifecycle.LiveData

class NotesRepository(private val notesDao: NotesDao) {

    val AllNotes: LiveData<List<Notes>> = notesDao.getAllData()

    suspend fun insert(notes: Notes){
        notesDao.insert(notes)
    }

    suspend fun delete(notes: Notes){
        notesDao.delete(notes)
    }

}