package bridge;
public class UserInput {
  public static String userInput(String userInput){
    userInputCheck(userInput);
    return userInput;
  }
  public static void userInputCheck(String userInput){
    if(!userInput.equals("U") && !userInput.equals("D")){
      throw new IllegalArgumentException("ERROR : U, D만 입력 가능");
    }
  }
}
