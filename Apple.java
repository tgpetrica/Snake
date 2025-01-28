import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Apple extends Actor
{
    public Apple()
    {
        GreenfootImage image = new GreenfootImage(20, 20);
        image.setColor(Color.RED);
        image.fillOval(0,0,20,20);
        image.setColor(Color.GREEN);
        image.fillRect(8,-5,4,10);
        setImage(image);
    }
}
