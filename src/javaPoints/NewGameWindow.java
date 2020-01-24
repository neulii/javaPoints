package javaPoints;

import javax.swing.*;
import java.awt.*;

public class NewGameWindow {

    private JDialog window;
    private MainWindow mainWindow;

    public NewGameWindow(MainWindow mainWindow){

        this.mainWindow = mainWindow;

        window = new JDialog(mainWindow.getFrame(),"Neues Spiel", true);
        window.setSize(500,400);
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setLocationRelativeTo(mainWindow.getFrame());



    }

    public void setVisible(boolean visible){
        window.setVisible(visible);
    }
}
