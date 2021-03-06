package collectionsexamples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

/**
 * Created by yevgeniya.zuyeva on 26.12.2016.
 */
public class JukeBox8 {
    ArrayList<Song> songList = new ArrayList<>();

    public static void main(String[] args){
        new JukeBox8().go();
    }

    public void go(){
        getSongs();
        songList.stream().forEach(System.out::println);
        Collections.sort(songList);
        System.out.println("---------");
        songList.stream().forEach(System.out::println);

        TreeSet<Song> songSet = new TreeSet<>();
        songSet.addAll(songList);
        System.out.println("---------");
        songSet.stream().forEach(System.out::println);

    }


    void getSongs(){
        try{
            File file = new File("SongList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while((line=reader.readLine())!=null){
                addSong(line);
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    void addSong(String lineToParse){
        String[] tokens = lineToParse.split("/");
        songList.add(new Song(tokens[0],tokens[1],tokens[2],tokens[3]));
    }

    class ArtistCompare implements Comparator<Song> {

        @Override
        public int compare(Song o1, Song o2) {
            return o1.getArtist().compareTo(o2.getArtist());
        }
    }
}
