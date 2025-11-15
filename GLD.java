import java.awt.*;
import javax.swing.*;

public class GLD extends JFrame {

    public GLD() {
        // Create panel with GridLayout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        // Add buttons
        panel.add(new JButton("A"));
        panel.add(new JButton("B"));
        panel.add(new JButton("C"));
        panel.add(new JButton("D"));
        panel.add(new JButton("E"));
        panel.add(new JButton("F"));
        panel.add(new JButton("G"));
        panel.add(new JButton("H"));
        panel.add(new JButton("I"));
        panel.add(new JButton("J"));

        // Add panel to Frame with padding
        add(panel);
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        setTitle("GLD");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GLD();
    }
}
