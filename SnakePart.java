import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class SnakePart extends Actor
{
    public SnakePart()
    {
        GreenfootImage image = new GreenfootImage(20,20);
        image.setColor(new Color(15, 195, 30));
        image.fill();
        setImage(image);
    }
    
    public void changeColor()
    {
        GreenfootImage image = getImage();
        image.setColor(new Color(15, 74, 25));
        image.fill();
    }
    
    public void act()
    {
        if (isTouching(SnakePart.class))
        {
            Greenfoot.stop();
        }
    }
}
