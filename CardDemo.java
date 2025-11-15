import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CardDemo extends JFrame implements ActionListener {
    JButton b1, b2, b3;
    JPanel cardPanel;
    CardLayout layout;

    public CardDemo() {
        layout = new CardLayout();
        cardPanel = new JPanel(layout);

        b1 = new JButton("First Button");
        b2 = new JButton("Second Button");
        b3 = new JButton("Third Button");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        cardPanel.add(b1, "first");
        cardPanel.add(b2, "second");
        cardPanel.add(b3, "third");

        add(cardPanel);

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        layout.next(cardPanel);
    }

    public static void main(String[] args) {
        new CardDemo();
    }
}
