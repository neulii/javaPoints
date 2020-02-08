package javaPoints;

import javaPoints.newGameWindow.PlayerInputLine;

import javax.swing.*;

public class TestWindow {

    public static void main(String[] args){

       JFrame window = new JFrame("superwindow");
       window.setSize(800,600);
       window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       window.setLocationRelativeTo(null);
       window.setLayout(null);


       PlayerInputLine pinput = new PlayerInputLine("spieler: ", 20,100,50);

       pinput.enableInputLine(false);

       window.add(pinput);


       window.setVisible(true);


    }




}
