package bridge;

public class Retry {
  public static void retry(String RorQ){
    RorQCheck(RorQ);
  }
  public static void RorQCheck(String RorQ){
    if(!RorQ.equals("R") && !RorQ.equals("Q")){
      throw new IllegalArgumentException("RorQ만 입력 가능");
    }
  }
}
