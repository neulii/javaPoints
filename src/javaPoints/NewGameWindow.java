package javaPoints;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class NewGameWindow {

    private JDialog window;
    private MainWindow mainWindow;
    private JButton okButton;
    private JButton abbrechenButton;
    private JPanel insideWindow;

    private Dimension buttonSize = new Dimension(100,35);

    public NewGameWindow(MainWindow mainWindow){

        this.mainWindow = mainWindow;
        window = new JDialog(mainWindow.getFrame(),"Neues Spiel", true);

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


    }

    public void setVisible(boolean visible){
        window.setVisible(visible);

    }

    public void addActionListener(ActionListener listener){

       okButton.addActionListener(listener);
       abbrechenButton.addActionListener(listener);
    }
}
