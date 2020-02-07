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

            case "comboBoxChanged":

                int selectedPlayers= 0;

                selectedPlayers = ((JComboBox)e.getSource()).getSelectedIndex()+1;

                switch (selectedPlayers){
                    case 1:
                        System.out.println( "erste auswahl");
                        break;

                    case 2:

                        break;

                    case 3:
                        break;

                    case 4:
                        break;

                }






                break;




        }

    }

}
