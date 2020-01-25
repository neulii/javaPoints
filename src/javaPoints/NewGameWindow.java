package javaPoints;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class NewGameWindow {

    private JDialog window;
    private MainWindow mainWindow;
    private JButton okButton;
    private Component allWindowComponents[];

    public NewGameWindow(MainWindow mainWindow){

        this.mainWindow = mainWindow;

        window = new JDialog(mainWindow.getFrame(),"Neues Spiel", true);
        window.setSize(500,400);
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setLocationRelativeTo(mainWindow.getFrame());

        window.setLayout(null);


        okButton = new JButton("test");
        window.add(okButton);






    }

    public void setVisible(boolean visible){
        window.setVisible(visible);

    }

    public void addActionListener(ActionListener listener){

        allWindowComponents = window.getContentPane().getComponents();

        for(int i = 0; i<allWindowComponents.length; i++){
            //TODO allWindowComponents[i].a

        }


    }
}
