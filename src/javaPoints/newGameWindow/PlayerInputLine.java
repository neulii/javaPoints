package javaPoints.newGameWindow;

import javax.swing.*;
import java.awt.*;

public class PlayerInputLine extends JPanel{

    JLabel playerNumberLabel;
    JTextField playerNameInput;

    public PlayerInputLine(String labelText, int offsetLeft, int yPosInputLine, int widthOfLine, int heightOfLine){
        this.setBackground(Color.lightGray);
        this.setBounds(offsetLeft,yPosInputLine,widthOfLine,heightOfLine);
        this.setLayout(null);

        playerNumberLabel = new JLabel(labelText);
        playerNumberLabel.setBounds(20,0,widthOfLine/3,heightOfLine);


        this.add(playerNumberLabel);

        playerNameInput = new JTextField();
        playerNameInput.setBounds(widthOfLine/3,0,widthOfLine/3*2,heightOfLine);
        playerNameInput.setHorizontalAlignment(JTextField.CENTER);

        playerNameInput.setBackground(new Color(99, 63,100));
        playerNameInput.setOpaque(true);

        this.add(playerNameInput);

    }

    public void enableInputLine(boolean enable){
        this.setEnabled(enable);
        playerNameInput.setEnabled(enable);
        playerNumberLabel.setEnabled(enable);
    }

}
