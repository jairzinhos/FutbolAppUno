package org.beginningandroid.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
/// We are showing the properties of the list to show

public class MovieModel {
    private String title, genre, year;
    private String channel;

    public MovieModel(String title, String genre, String year, String channel) {
        this.title= title;
        this.genre = genre;
        this.year = year;
        this.channel =channel;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public String  getGenre() {
        return genre;
    }
    public void setGenre(String  genre) {this.genre = genre; }
    public String getChannel() { return channel; }
    public void setChannel(String channel) { this.channel =channel; }
        }
