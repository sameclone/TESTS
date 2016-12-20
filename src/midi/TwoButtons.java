package midi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by yevgeniya.zuyeva on 14.12.2016.
 */
public class TwoButtons {
    JFrame frame;
    JLabel label;

    public static void main(String[] args){
        new TwoButtons().go();
    }

    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton labelButton = new JButton("Change label");
        labelButton.addActionListener(new LabelListener());

        JButton colorButton = new JButton("Change circle");
        colorButton.addActionListener(new ColorListener());

        label = new JLabel("I'm a label");
        MyDrawPanel myDrawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH,colorButton);
        frame.getContentPane().add(BorderLayout.CENTER,myDrawPanel);
        frame.getContentPane().add(BorderLayout.EAST,labelButton);
        frame.getContentPane().add(BorderLayout.WEST,label);

        frame.setSize(300,300);
        frame.setVisible(true);

    }

    class LabelListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("ouch!");
        }
    }

    class ColorListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.repaint();
        }
    }
}
