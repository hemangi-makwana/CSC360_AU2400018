import javax.swing.*;
import java.awt.*;

public class DrawLine extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);


        g.drawLine(100, 100, 400, 300);
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Basic Line");
        DrawLine panel = new DrawLine();

        frame.add(panel);
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}