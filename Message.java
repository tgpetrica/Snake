import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Message extends Actor
{

    public Message(String message, Color color)
    {
        setImage(new GreenfootImage(message, 20, color, null));
    }
}
