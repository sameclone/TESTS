package midi;

import javax.swing.*;
import java.awt.*;

/**
 * Created by yevgeniya.zuyeva on 14.12.2016.
 */
public class SimpleAnimation {
    int x=79;
    int y = 70;

    public void go(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(drawPanel);
        frame.setSize(300,300);
        frame.setVisible(true);

        for(int i=0;i<130;i++){
            x++;
            y++;

            drawPanel.repaint();

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    class MyDrawPanel extends JPanel{
        public void paintComponent(Graphics g){
            g.setColor(Color.white);
            g.fillRect(0,0,this.getWidth(),this.getHeight());

            g.setColor(Color.green);
            g.fillOval(x,y,40,40);
        }
    }

    public static void main(String[] args){
        new SimpleAnimation().go();
    }
}
