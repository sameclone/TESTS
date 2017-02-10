package OCJP8.chap8;

import java.io.File;

/**
 * Created by yevgeniya.zuyeva on 10.02.2017.
 */
public class ReadFileInformation {
    public static void main(String[] args){
        File file = new File("D:\\Projects\\Tests\\TESTS\\SongList.txt");
        System.out.println("File Exists: "+file.exists());
        if(file.exists()){
            System.out.println("Absolute Path: "+file.getAbsolutePath());
            System.out.println("Is Directory: "+file.isDirectory());
            System.out.println("Parent path: "+file.getParent());
            if(file.isFile()){
                System.out.println("File size: "+file.length());
                System.out.println("Last Modified: "+file.lastModified());
            }
            else{
                for(File subfile: file.listFiles()){
                    System.out.println("\t"+subfile.getName());
                }
            }
        }
    }
}
