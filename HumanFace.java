import javax.swing.*;
import java.awt.*;

public class HumanFace extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Face circle
        g.drawOval(50, 50, 200, 200);

        // Eyes
        g.fillOval(100, 110, 20, 20);
        g.fillOval(180, 110, 20, 20);

        // Smile
        g.drawArc(100, 150, 100, 50, 0, -180);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Human Face");
        HumanFace face = new HumanFace();

        frame.add(face);
        frame.setSize(320, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
