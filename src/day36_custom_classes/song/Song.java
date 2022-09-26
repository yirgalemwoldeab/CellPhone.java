package day36_custom_classes.song;

public class Song {

    String name;
    String artist;
    String genre;
    double length;

    public Song(String name, double length) {
        this.name = name;
        this.length = length;
    }

    public Song(String name, double length, String artist, String genre) {
        this(name, length);
        this.artist = artist;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                ", length=" + length +
                '}';
    }
}