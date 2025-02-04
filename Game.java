import greenfoot.*;
import java.util.ArrayList;

public class Game extends World
{
    ArrayList<SnakePart> snake;
    
    int dx = -1;
    int dy = 0;
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
        
        int x = 5;
        int y = 7;
        
        for (int i = 0; i < 4; i++)
        {
            SnakePart body = new SnakePart();
            snake.add(body);
            addObject(body,x + i , y);
            body.changeColor();
        }
        
        SnakePart head = new SnakePart();
        addObject(head, 5, 7);
        snake.add(head);
        
        
    }
    
    public void act()
    {
        String key = Greenfoot.getKey();
        if (key != null)
        {
            switch(key)
            {
                case "w":
                    dx = 0;
                    dy = -1;
                    break;
                case "a":
                    dx = -1;
                    dy = 0;
                    break;
                case "s":
                    dx = 0;
                    dy = 1;
                    break;
                case "d":
                    dx = 1;
                    dy = 0;
                    break;
                default:
                    ;
            }
        }
        SnakePart head = snake.get(snake.size() - 1);
        head.changeColor();
        SnakePart newHead = new SnakePart();
        snake.add(newHead);
        int x = head.getX() + dx;
        int y = head.getY() + dy;
        
        //
        
        addObject(newHead, x, y);
        

        //snake.remove(0);
        SnakePart tail = snake.get(0);
        removeObject(tail);
        snake.remove(0);
    }
}
