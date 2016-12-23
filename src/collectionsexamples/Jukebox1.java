package collectionsexamples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by yevgeniya.zuyeva on 23.12.2016.
 */
public class Jukebox1 {
    ArrayList<String> songList = new ArrayList<>();

    public static void main(String[] args){
        new Jukebox1().go();
    }

    public void go(){
        getSongs();
        songList.stream().forEach(System.out::println);
        Collections.sort(songList);
        System.out.println("---------");
        songList.stream().forEach(System.out::println);
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
        songList.add(tokens[0]);
    }

}
