package com.example.notemaker.Interface;

import android.content.Context;

import androidx.lifecycle.LiveData;

import com.example.notemaker.async.InsertAsyncTask;
import com.example.notemaker.models.note;

import java.util.List;

public class noteRepository {

    private noteDatabase mnoteDatabase;
    public noteRepository(Context context) {
        mnoteDatabase = noteDatabase.getInstance(context);

    }

    public void insertNoteTask(note notes) {
        new InsertAsyncTask(mnoteDatabase.getNoteDao()).execute(notes);


    }

    public void updateNotes(note notes) {


    }

    public LiveData<List<note>> retrieveNotesTask() {
        return mnoteDatabase.getNoteDao().getNotes();
    }

    public void DeleteNote(note notes) {

    }



}
