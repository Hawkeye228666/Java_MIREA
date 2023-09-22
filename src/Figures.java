import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

abstract class Shape {
    protected Color color;
    protected int x, y;

    public Shape() {
        Random rand = new Random();
        this.color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
        this.x = rand.nextInt(400);
        this.y = rand.nextInt(400);
    }

    public abstract void draw(Graphics2D g2d);
}

class Circle extends Shape {
    private int radius;

    public Circle() {
        super();
        Random rand = new Random();
        this.radius = rand.nextInt(100) + 10;
    }

    public void draw(Graphics2D g2d) {
        g2d.setColor(color);
        g2d.fill(new Ellipse2D.Double(x, y, radius, radius));
    }
}

class Rectangle extends Shape {
    private int width, height;

    public Rectangle() {
        super();
        Random rand = new Random();
        this.width = rand.nextInt(100) + 10;
        this.height = rand.nextInt(100) + 10;
    }

    public void draw(Graphics2D g2d) {
        g2d.setColor(color);
        g2d.fill(new Rectangle2D.Double(x, y, width, height));
    }
}

class ShapePanel extends JPanel {
    private Shape[] shapes = new Shape[20];

    public ShapePanel() {
        for (int i = 0; i < shapes.length; i++) {
            if (i % 2 == 0) {
                shapes[i] = new Circle();
            } else {
                shapes[i] = new Rectangle();
            }
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        for (Shape shape : shapes) {
            shape.draw(g2d);
        }
    }
}

public class Figures {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        ShapePanel panel = new ShapePanel();
        frame.add(panel);
        frame.setVisible(true);
    }
}



