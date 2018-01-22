package sample;

import java.awt.*;
import javax.swing.*;

public class GameObject extends JPanel {
    private double positionX;
    private double positionY;
    private double velocityX;
    private double velocityY;
    private int width;
    private int height;
    private Image image;

    public GameObject(double px, double py, double vx, double vy)
    {
        positionX = px;
        positionY = py;
        velocityX = vx;
        velocityY = vy;
        setImage();
        width = image.getWidth(this);
        height = image.getHeight(this);
        setPreferredSize(new Dimension(width, height));

    }

    public void setImage()
    {
        ImageIcon img = new ImageIcon("MegaSprite.png");
        image = img.getImage();
    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(image, 0, 0, null);
    }

    public void update(double time)
    {
        positionX += velocityX * time;
        positionY += velocityY * time;
    }

    public void render()
    {
    }

    /*
    public Rectangle2D getBoundary()
    {
        return new Rectangle2D(positionX,positionY,width,height);
    }

    public boolean intersects(GameObject s)
    {
        return s.getBoundary().intersects( this.getBoundary() );
    }
    */
}
