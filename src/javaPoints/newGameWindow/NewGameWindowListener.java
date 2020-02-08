package javaPoints.newGameWindow;

import javaPoints.Controller;

import javax.swing.*;
import java.awt.event.*;

public class NewGameWindowListener implements ActionListener {

    Controller controller;
    NewGameWindow newGameWindow;

    public NewGameWindowListener(NewGameWindow newGameWindow, Controller controller){

        this.controller = controller;
        this.newGameWindow = newGameWindow;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        //System.out.println(e.getActionCommand());

        switch (e.getActionCommand()){

            case "comboBoxChanged":

                int selectedPlayers= 0;

                selectedPlayers = ((JComboBox)e.getSource()).getSelectedIndex()+1;

               newGameWindow.enableInputLines(selectedPlayers);

                break;
        }

    }

}
