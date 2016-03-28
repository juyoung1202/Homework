package com.j1.w3;
  
import ch.aplu.turtle.*;
import java.util.*;

public class TurtleObsesrverMain{
  public static void main(String[] args){
    BabyTurtle baby = new BabyTurtle();
    MomTurtle baby = new MomTurtle();
    baby.addObserver(mom);
    mom.moveTo(100,100);
    baby.move(100,-100);
    baby.setChanged();
    baby.notifyObservers();
    
  }
}
  
  
class MomTurtle extends Turtle implements Observer {
  public void updata(Observable o, Object arg){
     System.out.println("Updata() called, count is" + ((Integer)arg).intvalue());
     babyCurpos=((Baby
  }
}

class BabyTurtle extends Observable{
 Turtle baby;
 Double myCurpos;
 ArrayList<Observer> obs;
 public BabyTurtle() {
   
   baby=new Turtle();
   myCurpos=baby.getPos();
   obs=new ArrayList<Oberver>();
 }
 public void addObserver(Observer o){
  obs.add(o); 
 }
 protected void serChanged() {
    myCurpos=baby.getPos();
 }
 public void notifyObservers(){
   for(Observer o:obs);
     o.update(this, 1);
}
 public void move(int x, int y){
  baby.moveTo(x,y); 
 }
 
}