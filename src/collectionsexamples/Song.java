package collectionsexamples;

/**
 * Created by yevgeniya.zuyeva on 23.12.2016.
 */
public class Song implements Comparable<Song>{
    String title;
    String artist;
    String rating;
    String bmp;

    public Song(String title, String artist, String rating, String bmp) {
        this.title = title;
        this.artist = artist;
        this.rating = rating;
        this.bmp = bmp;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getRating() {
        return rating;
    }

    public String getBmp() {
        return bmp;
    }

    public String toString(){
        return  title;
    }

    @Override
    public int compareTo(Song o) {
        return title.compareTo(o.getTitle());
    }

    public boolean equals(Object song){
        if(song instanceof Song){
            Song s = (Song)song;
            return getTitle().equals(s.getTitle());
        }
        else
            return false;
    }

    public int hashCode(){
        return title.hashCode();
    }
}
