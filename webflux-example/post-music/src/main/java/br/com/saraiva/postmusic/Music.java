package br.com.saraiva.postmusic;

/**
 * Created by sara on set, 2018
 */
public class Music {

    private String name;
    private String artist;
    private String genre;

    public Music() {
    }

    public Music(String name, String artist, String genre) {
        this.name = name;
        this.artist = artist;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Music{" +
                "name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}