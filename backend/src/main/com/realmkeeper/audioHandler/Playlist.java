package com.realmkeeper.audioHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Playlist {
    private String name;
    private List<Song> songs;

    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(Song song) {
        songs.remove(song);
    }

    public List<Song> getSongs() {
        return songs;
    }

    public List<Song> getSongsByFacet(String facet, String value) {
        return songs.stream()
                .filter(song -> {
                    switch (facet) {
                        case "mood": return song.getMood().equalsIgnoreCase(value);
                        case "location": return song.getLocation().equalsIgnoreCase(value);
                        default: return false;
                    }
                })
                .collect(Collectors.toList());
    }

    public List<Song> shuffle() {
        List<Song> shuffled = new ArrayList<>(songs);
        java.util.Collections.shuffle(shuffled);
        return shuffled;
    }
}
