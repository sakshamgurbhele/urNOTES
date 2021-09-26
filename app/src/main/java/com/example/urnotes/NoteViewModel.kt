package com.example.urnotes

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import androidx.room.Dao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class NoteViewModel(application: Application): AndroidViewModel(application) {

    val allNotes: LiveData<List<Notes>>


    init {
        val database = NotesDatabase.getDatabase(application).getnotesDao()
        val repository = NotesRepository(database)
        allNotes = repository.AllNotes
    }

    fun deleteNote(notes: Notes) = viewModelScope.launch(Dispatchers.IO){

    }
}