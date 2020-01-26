package javaPoints;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewGameWindowListener implements ActionListener {

    Controller controller;
    NewGameWindow newGameWindow;

    public NewGameWindowListener(NewGameWindow newGameWindow, Controller controller){

        this.controller = controller;
        this.newGameWindow = newGameWindow;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
