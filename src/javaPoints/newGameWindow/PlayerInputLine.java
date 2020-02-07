package javaPoints.newGameWindow;

import javax.swing.*;

public class PlayerInputLine {

    JLabel playerNumberLabel;
    JTextField playerNameInput;

    int offSetLeft = 0;
    int heightInputLine = 0;

    public PlayerInputLine(String labelText, int offsetLeft, int yPosInputLine){

        this.offSetLeft = offsetLeft;
        this.heightInputLine = yPosInputLine;

        playerNumberLabel = new JLabel(labelText);
        playerNumberLabel.setBounds(offsetLeft, yPosInputLine,100,25);

        playerNameInput = new JTextField();
        playerNameInput.setBounds(offsetLeft+150,yPosInputLine,100,25);
    }

    public void enableInputLine(boolean enable){
        playerNameInput.setEnabled(enable);
        playerNumberLabel.setEnabled(enable);
    }

}
