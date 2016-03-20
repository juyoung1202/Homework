package headfirst.strategy;

public class FlyRocketPowered implements FlyBehavior {
 
  public void fly(){
   System.out.println("로켓 추진으로 날라갑니다"); 
  }
}