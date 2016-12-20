package midi;

import javax.swing.*;

/**
 * Created by yevgeniya.zuyeva on 14.12.2016.
 */
public class SimpleGui1 {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        JButton button = new JButton("click me");

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.getContentPane().add(button);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
