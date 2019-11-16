package com.example.notemaker.async;

import android.os.AsyncTask;

import com.example.notemaker.Interface.NoteDao;
import com.example.notemaker.models.note;

public class UpdateAsyncTask extends AsyncTask<note,Void,Void> {

    private NoteDao mNoteDao;

    public UpdateAsyncTask(NoteDao noteDao) {
        mNoteDao=noteDao;
    }

    @Override
    protected Void doInBackground(note... notes) {
        mNoteDao.update(notes);
        return null;
    }
}
