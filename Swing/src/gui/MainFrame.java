package gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Dominik C.
 */
public class MainFrame extends JFrame {

    public MainFrame(String title) {
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        BoardPanel boardPanel = new BoardPanel();


        add(boardPanel);
        pack();
        setVisible(true);
    }

}
