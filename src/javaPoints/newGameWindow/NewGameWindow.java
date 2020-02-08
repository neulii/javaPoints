package javaPoints.newGameWindow;

import javaPoints.MainWindow;
import javaPoints.MouseListenerShowCoordinates;
import javaPoints.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class NewGameWindow {

    private JDialog window;
    private MainWindow mainWindow;
    private JButton okButton;
    private JButton abbrechenButton;
    private JPanel insideWindow;
    private JComboBox playerSwitcher;
    private JLabel playerNumbersLabel;

    private JLabel playerOneNameLabel;
    private JLabel playerTwoNameLabel;
    private JLabel playerThreeNameLabel;
    private JLabel playerFourNameLabel;

    private JTextField playerOneNameInputField;
    private JTextField playerTwoNameInputField;
    private JTextField playerThreeNameInputField;
    private JTextField playerFourNameInputField;

    private ArrayList<PlayerInputLine> playerInputLines;


    private Dimension buttonSize = new Dimension(100,35);

    public NewGameWindow(MainWindow mainWindow){



        this.mainWindow = mainWindow;
        window = new JDialog(mainWindow.getFrame(),"Neues Spiel", true);
        window.setTitle("Neues Spiel erstellen:");




        insideWindow = new JPanel();
        insideWindow.setLayout(null);
        window.add(insideWindow);
        window.pack();



        window.setSize(500,400);
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setLocationRelativeTo(mainWindow.getFrame());

        window.setResizable(false);

        int okButtonOffsetRight = 20;
        int buttonOffsetBottom = 20;

        int abbrechenButtonOffsetToOKButtonRight = 20;

        okButton = new JButton("Ok");
        okButton.setSize(buttonSize);
        okButton.setLocation(insideWindow.getWidth() - okButton.getWidth()-okButtonOffsetRight,insideWindow.getHeight()-okButton.getHeight()-buttonOffsetBottom);

        abbrechenButton = new JButton("Abbrechen");
        abbrechenButton.setSize(buttonSize);
        abbrechenButton.setLocation(
                okButton.getLocation().x-abbrechenButtonOffsetToOKButtonRight-abbrechenButton.getWidth(),
                insideWindow.getHeight()-buttonOffsetBottom-abbrechenButton.getHeight());

        insideWindow.add(abbrechenButton);
        insideWindow.add(okButton);

        playerNumbersLabel = new JLabel("Anzahl Spieler:");
        playerNumbersLabel.setBounds(30,50,100,25);
        insideWindow.add(playerNumbersLabel);


        String [] playerSwitcherNumbers = {"1","2","3","4"};
        playerSwitcher = new JComboBox(playerSwitcherNumbers);

        playerSwitcher.setBounds(150,50,50,25);
        insideWindow.add(playerSwitcher);

        //generate playerinputlines
        playerInputLines = new ArrayList<PlayerInputLine>();


        for(int i = 0; i<4; i++){

            String labelText = "Spieler " + Integer.toString(i+1) + ":";

            PlayerInputLine temp = new PlayerInputLine(labelText,20,100+i*40,insideWindow.getWidth()-40, 30);

            playerInputLines.add(temp);
            if(!(i==0))
                temp.enableInputLine(false);
            insideWindow.add(temp);
        }

        window.validate();

    }

    public void setVisible(boolean visible){
        window.setVisible(visible);

    }

    public void enableInputLines(int numberOfInputLines){

        //enable
        for(int i = 0;i<numberOfInputLines; i++){
            playerInputLines.get(i).enableInputLine(true);

        }
        //disable the rest
        for(int i = numberOfInputLines; i<playerInputLines.size();i++){
            playerInputLines.get(i).enableInputLine(false);
        }

    }

    public void addActionListener(ActionListener listener){

       okButton.addActionListener(listener);
       abbrechenButton.addActionListener(listener);
       playerSwitcher.addActionListener(listener);
       insideWindow.addMouseListener(new MouseListenerShowCoordinates());

    }
}
