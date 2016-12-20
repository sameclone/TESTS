package midi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by yevgeniya.zuyeva on 14.12.2016.
 */
public class SimpleGui1B implements ActionListener {
    JButton button;

    public  static void main(String[] args){
        SimpleGui1B simpleGui1B = new SimpleGui1B();
        simpleGui1B.go();
    }

    public void go(){
        JFrame frame  = new JFrame();
        button = new JButton("click me");

        button.addActionListener(this);

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("I've been clicked!");

    }
}
