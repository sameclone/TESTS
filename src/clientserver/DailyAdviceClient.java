package clientserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by yevgeniya.zuyeva on 22.12.2016.
 */
public class DailyAdviceClient {

    public void go() {
        try (Socket s = new Socket("127.0.0.1", 4242);
             InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
             BufferedReader reader = new BufferedReader(streamReader)) {

            String advice = reader.readLine();
            System.out.println("Today you should: "+advice);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        DailyAdviceClient client = new DailyAdviceClient();
        client.go();
    }
}
