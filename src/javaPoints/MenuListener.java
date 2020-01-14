package javaPoints;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        String buttonText = ((JMenuItem)(e.getSource())).getText();

        switch (buttonText){
            case "Neues Spiel":
                System.out.println("neues spiel");

                break;

            case "Beenden":

                System.exit(0);
                break;

            case "Spiel Speichern":

                System.out.println("speichern");
                break;

            case "Spiel Öffnen":
                System.out.println("spiel öffnen");
                break;


        }

    }
}
