import greenfoot.*;
import java.util.ArrayList;

public class Game extends World
{
    ArrayList<SnakePart> snake;
    public Game()
    {
        super(30, 20, 20); 
        
        GreenfootImage bg = new GreenfootImage(60,40);
        bg.setColor(new Color(222, 202, 104));
        bg.fill();
        setBackground(bg);
        
        addObject(new Apple(), 15, 10);
        //addObject(new SnakePart(), 5,7);
        
        snake = new ArrayList<SnakePart>(); // initializare lista
        
        SnakePart head = new SnakePart();
        addObject(head, 5, 7);
        snake.add(head);
    }
}
