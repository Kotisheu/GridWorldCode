import info.gridworld.actor.Bug; 
public class DancingBug extends Bug 
{ 
 private int[] turns; 
 private int c; 
 
 public DancingBug(int[] t) 
 { 
 turns = t; 
 c = 0; 
 } 
 
 public void turn(int time) 
 { 
 for(int j = 1; j <= time; j++) 
 { 
 turn(); 
 } 
 } 
 
 public void act() 
 { 
 if(currentStep == turns.length) 
 currentStep = 0; 
 turn (turns[c]); 
 c++; 
 super.act(); 
 } 
} 
 
