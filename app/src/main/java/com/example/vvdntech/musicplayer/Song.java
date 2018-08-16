package com.example.vvdntech.musicplayer;

public class Song {
    private long id;
    private String title;
    private String artist;
    
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setArtist(String artist) {
        this.artist = artist;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getArtist() {
        return artist;
    }
    
    public Song(long id, String title, String artist) {
    
        this.id = id;
        this.title = title;
        this.artist = artist;
    }
}
