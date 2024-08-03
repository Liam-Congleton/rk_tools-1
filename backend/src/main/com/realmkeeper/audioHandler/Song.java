package com.realmkeeper.audioHandler;

public class Song 
{
    private String title;
    private String artist;
    private String filePath;
    private String mood;
    private String location;

    public Song(String title, String artist, String filePath, String mood, String location) {
        this.title = title;
        this.artist = artist;
        this.filePath = filePath;
        this.mood = mood;
        this.location = location;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getFilePath() {
        return filePath;
    }

    public String getMood() {
        return mood;
    }

    public String getLocation() {
        return location;
    }
}

