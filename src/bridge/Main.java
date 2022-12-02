package bridge;
import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);
  static RandomBridge randomBridge = new RandomBridge();
  static UserInput userInput = new UserInput();
  static Compare compare = new Compare();

  static int count = 1;
  static Retry retry = new Retry();
  static String bridgeLength;
  static boolean upDownCompare = true;
  static String successOrFalse = "성공";
  public static void main(String[] args) {
  bridgeMake();
  userInput();
  if(successOrFalse.equals("성공")){
    successOrExit();
  }
  }
  public static void bridgeMake(){
    System.out.println("다리길이 입력");
    bridgeLength = sc.next();
  }
  public static void userInput(){
    randomBridge.randomBridgeMaker(bridgeLength);
    System.out.println("U, D 입력");
    for(String randomBridge : randomBridge.getRandomBridge()) {
      String upDown = userInput.userInput(sc.next());
      upDownCompare = compare.compare(randomBridge, upDown);
      if(upDownCompare == false){
        successOrFalse = "실패";
        retry();
        break;
      }
    }
    }
    public static void retry(){
      System.out.println("실패, R, Q 입력");
      String reGame = sc.next();
      retry.retry(reGame);
      if(reGame.equals("R")){
        count++;
        randomBridge.randomBridgeInit();
        userInput();
      }
      if(reGame.equals("Q")){
        successOrExit();
    }
    }
  public static void successOrExit(){
    System.out.println(successOrFalse);
    System.out.println("시도횟수 : " + count);
  }
}