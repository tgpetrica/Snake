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
    
    public void act()
    {
        if (isTouching(SnakePart.class))
        {
            Game world = (Game) getWorld();
            int newX = Greenfoot.getRandomNumber(world.getWidth());
            int newY = Greenfoot.getRandomNumber(world.getHeight());
            setLocation(newX, newY);
            world.growSnake();
        }
    }
}
