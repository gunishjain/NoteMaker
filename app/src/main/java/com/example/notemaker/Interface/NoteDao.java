package com.example.notemaker.Interface;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.notemaker.models.note;

import java.util.List;


@Dao
public interface NoteDao {

    @Insert
    long[] insertNotes(note... notes);


    @Query("SELECT * FROM notes")
    LiveData<List<note>> getNotes();


    @Delete
    int delete(note... notes);

    @Update
    int update(note... notes);



}
