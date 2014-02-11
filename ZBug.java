 
import info.gridworld.actor.Bug; 
import info.gridworld.grid.Location; 

public class ZBug extends Bug 
{ 
 
 private int steps;  
 private int seg; 
 private int len;  
 public ZBug(int length) 
 { 
 setDirection(Location.EAST); 
 steps = 0; 
 seg = 1; 
 len= length; 
 } 
 
 public void act() 
 { 
 if (seg <= 3 && steps < len) 
 { 
 if (canMove()) 
 { 
 move(); 
 steps++; 
 } 
 } 
 else if (seg == 1) 
 { 
 setDirection(Location.SOUTHWEST); 
 steps = 0; 
 seg++; 
 } 
 else if (seg == 2) 
 { 
 setDirection(Location.EAST); 
 steps = 0; 
 seg++; 
 } 
 } 
} 
