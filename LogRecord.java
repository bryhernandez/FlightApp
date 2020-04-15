package edu.csumb.flightapp;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.util.ArrayList;

@Entity
public class LogRecord {
    @PrimaryKey(autoGenerate = true)
    private long id;

    public LogRecord() {}

    @Ignore
    public LogRecord (long id){
        this.id = id;
    }

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

}
