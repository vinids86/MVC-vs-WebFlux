package br.com.saraiva.postmusicsync;

/**
 * Created by sara on set, 2018
 */
public class Music {

    private String name;
    private String artist;
    private String genre;
    private String format;

    public Music() {
    }

    public Music(String name, String artist, String genre, String format) {
        this.name = name;
        this.artist = artist;
        this.genre = genre;
        this.format = format;
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

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
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