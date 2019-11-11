package com.example.notemaker.Interface;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.notemaker.models.note;

@Database(entities = {note.class},version =1)
public abstract class noteDatabase extends RoomDatabase {

    public static final String DATABASE_NAME="notes_Db";
    private static noteDatabase instance;
    static noteDatabase getInstance(final Context context){
        if(instance==null){

            instance= Room.databaseBuilder(context.getApplicationContext(),
                    noteDatabase.class,
                    DATABASE_NAME).build();
        } return instance;
    }

    public abstract NoteDao getNoteDao();

}
