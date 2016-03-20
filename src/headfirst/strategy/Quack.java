package headfirst.strategy;

public class Quack implements QuackBehavior {
  
  public void quack() {
    System.out.print("Quack");
  }
}