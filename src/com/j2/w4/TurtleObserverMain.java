package com.j2.w4;

import ch.aplu.turtle.*;
import java.util.Observer;
import java.util.Observable;
import java.util.ArrayList;

public class TurtleObserverMain{
  public static void main(String[] args){
    BabyTurtle baby = new BabyTurtle();
    MomTurtle mom = new MomTurtle();
    DadTurtle dad = new DadTurtle();
    TeacherTurtle teacher = new TeacherTurtle();
    baby.addObserver(mom);
    baby.addObserver(dad);
    baby.addObserver(teacher);
    mom.moveTo(100, 100);
    dad.moveTo(-100, -100);
    teacher.moveTo(-100, 100);
    baby.move(100, -100);
    baby.setChanged();
    baby.notifyObservers();
  }
}

class MomTurtle extends Turtle implements Observer{
  Double babyCurposX;
  Double babyCurposY;
  public void update(Observable o, Object arg){
    System.out.println("update() called. count is"+((Integer)arg).intValue());
    babyCurposX = ((BabyTurtle)o).myCurposX;
    babyCurposY = ((BabyTurtle)o).myCurposY;
    System.out.println("current pos" + babyCurposX+", "+babyCurposY);
    moveTo(babyCurposX, babyCurposY);
  }
}
class DadTurtle extends Turtle implements Observer{
  Double babyCurposX;
  Double babyCurposY;
  public void update(Observable o, Object arg){
    System.out.println("update() called. count is"+((Integer)arg).intValue());
    babyCurposX = ((BabyTurtle)o).myCurposX;
    babyCurposY = ((BabyTurtle)o).myCurposY;
    System.out.println("current pos" + babyCurposX+", "+babyCurposY);
    moveTo(babyCurposX, babyCurposY);
  }
}
class TeacherTurtle extends Turtle implements Observer{
  Double babyCurposX;
  Double babyCurposY;
  public void update(Observable o, Object arg){
    System.out.println("update() called. count is"+((Integer)arg).intValue());
    babyCurposX = ((BabyTurtle)o).myCurposX;
    babyCurposY = ((BabyTurtle)o).myCurposY;
    System.out.println("current pos" + babyCurposX+", "+babyCurposY);
    moveTo(babyCurposX, babyCurposY);
  }
}

class BabyTurtle extends Observable{
  Turtle baby;
  Double myCurposX;
  Double myCurposY;
  ArrayList<Observer> obs;
  public BabyTurtle(){
    baby = new Turtle();
    myCurposX = baby.getPos().getX();
    myCurposY = baby.getPos().getY();
    obs = new ArrayList<Observer>();
  }
  public void addObserver(Observer o){
    obs.add(o);
  }
  protected void setChanged(){
    myCurposX = baby.getPos().getX();
    myCurposY = baby.getPos().getY();
  }
  public void notifyObservers(){
    for (Observer o : obs){
      o.update(this, 1);
    }
  }
  public void move(int x, int y){
    baby.moveTo(x, y);
  }
  
}