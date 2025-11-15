import java.awt.*;
import javax.swing.*;

public class LineRect extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawLine(10, 10, 50, 50);
        g.drawRect(10, 60, 40, 30);
        g.fillRect(60, 10, 30, 80);
        g.drawRoundRect(10, 100, 80, 50, 10, 10);
        g.fillRoundRect(20, 110, 60, 30, 5, 5);
        g.drawLine(100, 10, 230, 140);
        g.drawLine(100, 140, 230, 10);
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Line & Rectangle Demo");
        LineRect panel = new LineRect();

        frame.add(panel);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
