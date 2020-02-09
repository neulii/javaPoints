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

        System.out.println(e.getActionCommand());

        switch (e.getActionCommand()){

            //case for combobox changed
            case "comboBoxChanged":

                int selectedPlayers= 0;

                selectedPlayers = ((JComboBox)e.getSource()).getSelectedIndex()+1;

                newGameWindow.enableInputLines(selectedPlayers);
                //just to request focus to first input line after switching players

                newGameWindow.setVisible(true);
                break;

            //OK button
            case "Ok" :



                break;
            // abbrechen buttton
            case "Abbrechen" :

                newGameWindow.setVisible(false);
                newGameWindow.clearEntrys();


                break;


        }

    }

}
