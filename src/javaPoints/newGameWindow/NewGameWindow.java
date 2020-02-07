package javaPoints.newGameWindow;

import javaPoints.MainWindow;
import javaPoints.MouseListenerShowCoordinates;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

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

        //Player one elements

            playerOneNameLabel = new JLabel("Spieler 1");
            playerOneNameLabel.setBounds(30,100,100,25);
            //playerOneNameLabel.setEnabled(false);
            insideWindow.add(playerOneNameLabel);

            playerOneNameInputField = new JTextField();
            playerOneNameInputField.setBounds(150,100,150,25);
            insideWindow.add(playerOneNameInputField);


        //player two elements

            playerTwoNameLabel = new JLabel("Spieler 2");
            playerTwoNameLabel.setBounds(30,140,100,25);
            playerTwoNameLabel.setEnabled(false);
            insideWindow.add(playerTwoNameLabel);

            playerTwoNameInputField = new JTextField();
            playerTwoNameInputField.setBounds(150,140,150,25);
            playerTwoNameInputField.setEnabled(false);
            insideWindow.add(playerTwoNameInputField);

        //Player three elements

            playerThreeNameLabel = new JLabel("Spieler 3");
            playerThreeNameLabel.setBounds(30,180,100,25);
            playerThreeNameLabel.setEnabled(false);
            insideWindow.add(playerThreeNameLabel);

            playerThreeNameInputField = new JTextField();
            playerThreeNameInputField.setBounds(150,180,150,25);
            playerThreeNameInputField.setEnabled(false);
            insideWindow.add(playerThreeNameInputField);

        //player four elements

            playerFourNameLabel = new JLabel("Spieler 4");
            playerFourNameLabel.setBounds(30,220,100,25);
            playerFourNameLabel.setEnabled(false);
            insideWindow.add(playerFourNameLabel);

            playerFourNameInputField = new JTextField();
            playerFourNameInputField.setBounds(150,220,150,25);
            playerFourNameInputField.setEnabled(false);
            insideWindow.add(playerFourNameInputField);

    }

    public void setVisible(boolean visible){
        window.setVisible(visible);

    }

    public void addActionListener(ActionListener listener){

       okButton.addActionListener(listener);
       abbrechenButton.addActionListener(listener);
       playerSwitcher.addActionListener(listener);
       insideWindow.addMouseListener(new MouseListenerShowCoordinates());

    }
}
