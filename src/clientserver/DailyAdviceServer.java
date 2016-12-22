package clientserver;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by yevgeniya.zuyeva on 22.12.2016.
 */
public class DailyAdviceServer {
    String[] adviceList = {"Eat less","Buy new clothes","Two words: not bat","Two words: very bad","Go to gym"};

    public void go(){
        try (ServerSocket serverSocket = new ServerSocket(4242)){
            while(true){
                Socket sock = serverSocket.accept();
                PrintWriter writer = new PrintWriter(sock.getOutputStream());
                String advice = getAdvice();
                writer.println(advice);
                writer.close();
                System.out.println(advice);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getAdvice(){
        int random = (int)(Math.random()*adviceList.length);
        return  adviceList[random];
    }

    public static void main(String[] args){
        new DailyAdviceServer().go();
    }
}
