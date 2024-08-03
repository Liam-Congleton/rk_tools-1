package com.realmkeeper.audioHandler;

public class audioMain //music driver code
{
        public static void main(String[] args) {
            MusicManager musicManager = new MusicManager();
    
            // Create some songs
            Song song1 = new Song("Mountain Echoes", "Artist1", "/path/song1.mp3", "Relaxing", "Mountains");
            Song song2 = new Song("Dungeon Depths", "Artist2", "/path/song2.mp3", "Intense", "Dungeon");
            Song song3 = new Song("Forest Whispers", "Artist3", "/path/song3.mp3", "Calm", "Forest");
    
            // Create a playlist and add songs
            Playlist playlist = musicManager.createPlaylist("Adventure Playlist");
            playlist.addSong(song1);
            playlist.addSong(song2);
            playlist.addSong(song3);
    
            // Retrieve and print songs by facet
            System.out.println("Songs with mood 'Calm':");
            for (Song song : playlist.getSongsByFacet("mood", "Calm")) {
                System.out.println(song.getTitle());
            }
    
            System.out.println("\nSongs with location 'Dungeon':");
            for (Song song : playlist.getSongsByFacet("location", "Dungeon")) {
                System.out.println(song.getTitle());
            }
    
            // Shuffle and print the playlist
            System.out.println("\nShuffled Playlist:");
            for (Song song : playlist.shuffle()) {
                System.out.println(song.getTitle());
            }
        }
    }
