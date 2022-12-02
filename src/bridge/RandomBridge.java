package bridge;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomBridge {
  static List<String> randomBridge = new ArrayList<>();
  public static void randomBridgeMaker(String length) {
    lengthCheck(length);
    randomBridge(length);
  }
  public static void lengthCheck(String length) {
     for(int i = 0; i < length.length(); i++){
      if (!Character.isDigit(length.charAt(i))){
        throw new IllegalArgumentException("ERROR");
      }
    }
     if(Integer.parseInt(length) < 3 || Integer.parseInt(length)> 20){
       throw new IllegalArgumentException("ERROR");
     }
  }
  public static void randomBridge(String length){
    Random random = new Random();
    for(int i = 0; i < Integer.parseInt(length); i++){
      if(random.nextBoolean() == true){
        randomBridge.add("U");
      }
      else{
        randomBridge.add("D");
      }
    }
    System.out.println(randomBridge);
  }
  public static List<String> getRandomBridge(){ return randomBridge; }
  public static void randomBridgeInit(){ randomBridge.clear(); }
}
