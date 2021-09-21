package com.example.urnotes

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.room.Dao

class NoteViewModel(application: Application): AndroidViewModel(application) {

    val allNotes: LiveData<List<Notes>>

    init {
        val database = NotesDatabase.getDatabase(application).getnotesDao()
        val repository = NotesRepository(database)
        allNotes = repository.AllNotes
    }

}