package baseball;

import java.util.*;

public class CreateRandomNumber {
  static LinkedHashSet randomNumber = new LinkedHashSet<>();
  static List<String> ListRandomNumber;
  public static void createRandomNumber(){
    while(randomNumber.size() < 3){
      randomNumber.add(Integer.toString((int)(Math.random()*9)+1));
    }
    ListRandomNumber = new ArrayList<>(randomNumber);
  }
  public static List<String> getRandomNumber(){ return  ListRandomNumber; }
}
