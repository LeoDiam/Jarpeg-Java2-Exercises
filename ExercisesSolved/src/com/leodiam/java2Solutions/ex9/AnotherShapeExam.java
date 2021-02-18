package com.leodiam.java2Solutions.ex9;

import javax.swing.*;
import java.awt.*;

public class AnotherShapeExam {
    class GraphicPane extends JComponent {
        public GraphicPane() {
            super();
        }

        @Override
        public void paint(Graphics g) {
            //// line
            g.setColor(Color.BLACK);
            // drawLine(int x1, int y1, int x2, int y2)
            g.drawLine(0, 0, 100, 100);

            //// ovals
            g.setColor(new Color(250, 100, 120));
            // drawOval(int x, int y, int width, int height)
            g.drawOval(30, 30, 100, 200);
            // same, but it fills the oval with the current color
            g.fillOval(300, 30, 100, 200);

            //// Rectangle
            g.setColor(Color.BLUE);
            // drawRect(int x, int y, int width, int height)
            g.drawRect(30, 300, 100, 200);
            // fillRect(int x, int y, int width, int height)
            g.fillRect(300, 300, 100, 200);
        }
    }

    public AnotherShapeExam() {
        JFrame jf = new JFrame("Hello, World!");
        GraphicPane gp = new GraphicPane();

        jf.setBounds(0, 0, 800, 600);
        jf.setLayout(new BorderLayout());
        jf.add(gp, BorderLayout.CENTER);

        // Remember, the method show() is deprecated
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new AnotherShapeExam();
    }
}

