package sample;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {

    private JFrame frame;
    private ArrayList<GameObject> list;

    public static void main(String[] args) {
        init();

        /*
        while(isRunning){
            update(time);
            render();
        }
        */
    }

    private static void init(){
        final int WIDTH = 1280;
        final int HEIGHT = WIDTH * 9 / 16;
        JFrame frame = new JFrame("SwingGame");
        frame.setSize(WIDTH, HEIGHT);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GameObject gObj = new GameObject(0,0,0,0);
        frame.add(gObj);
        frame.pack();

        frame.setVisible(true);
    }

    private void update(double timeLastFrame)
    {
        for (GameObject g: list) {
            g.update( timeLastFrame );
        }
    }

    private void render()
    {
        for (GameObject g: list) {
            g.render();
        }
    }

}