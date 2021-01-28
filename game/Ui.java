package game;

import javax.swing.*;

public class Ui extends JDialog {

    public Ui( JFrame parent, String title, String message ) {
        super(parent, title, true);

        JPanel panel = new JPanel();
        JLabel label = new JLabel(message);

        panel.add(label);
        getContentPane().add(panel);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void render(JFrame parent, String title, String message) {
        new Ui(parent, title, message);
    }
}
