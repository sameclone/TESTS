package OCJP8.chap6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by yevgeniya.zuyeva on 30.01.2017.
 */
public class TestsTryWithResources {


    public static void main(String[] args) {
        String filename = "SongList.txt";
        String outFilename = "SongList-1.txt";
        String outFilename2 = "SongList-2.txt";

        try {
            oldApproach(Paths.get(filename), Paths.get(outFilename));
            System.out.println("-----------");
            newApproach(Paths.get(filename), Paths.get(outFilename2));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void oldApproach(Path path1, Path path2) throws IOException {
        BufferedReader in = null;
        BufferedWriter out = null;

        try {
            in = Files.newBufferedReader(path1);
            out = Files.newBufferedWriter(path2);
            String line;
            while ((line = in.readLine()) != null)
                out.write(line);
        } finally {
            if (in != null) in.close();
            if (out != null) out.close();
        }
    }

    public static void newApproach(Path path1, Path path2) throws IOException {
        try(BufferedReader in = Files.newBufferedReader(path1);
        BufferedWriter out = Files.newBufferedWriter(path2)){
            String line;
            while ((line = in.readLine()) != null)
                out.write(line);
        }
    }
}
