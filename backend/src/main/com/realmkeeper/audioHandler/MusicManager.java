package com.realmkeeper.audioHandler;

import java.util.HashMap;
import java.util.Map;

public class MusicManager {
    private Map<String, Playlist> playlists;

    public MusicManager() 
    {
        this.playlists = new HashMap<>();
    }

    public Playlist createPlaylist(String name) 
    {
        Playlist playlist = new Playlist();
        playlists.put(name, playlist);
        return playlist;
    }

    public void deletePlaylist(String name) 
    {
        playlists.remove(name);
    }

    public Playlist getPlaylist(String name) 
    {
        return playlists.get(name);
    }
}
