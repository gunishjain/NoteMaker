package com.example.notemaker.async;

import android.os.AsyncTask;

import com.example.notemaker.Interface.NoteDao;
import com.example.notemaker.models.note;

public class InsertAsyncTask extends AsyncTask<note,Void,Void> {

    private NoteDao mNoteDao;

    public InsertAsyncTask(NoteDao noteDao) {
        mNoteDao=noteDao;
    }

    @Override
    protected Void doInBackground(note... notes) {
        mNoteDao.insertNotes(notes);
        return null;
    }
}
