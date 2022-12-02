package baseball;

import java.util.*;

public class NumberCheck {
  public static List<String> randomNumber;
  public NumberCheck(List<String> randomNumber) {
  this.randomNumber = new ArrayList<>(randomNumber);
  }
  public static boolean numberCheck(List<String> numbers){
    int strike = 0;
    int ball = 0;
    userNumberCheck(numbers);
    for(int i = 0; i < 3; i++){
      if(randomNumber.get(i).equals(numbers.get(i))){
        strike++;
      }
      if(!randomNumber.get(i).equals(numbers.get(i)) && randomNumber.contains(numbers.get(i))){
        ball++;
      }
    }
    System.out.println(strike + "스트라이크 , " + ball + "볼");
    if(randomNumber.equals(numbers)){
      return false;
    }
    return true;
  }
  public static void userNumberCheck(List<String> numbers){
    for(int i = 0; i < numbers.size(); i++){
      if(numbers.get(i).length() > 1){
        throw new IllegalArgumentException("ERROR : 잘못된 입력");
      }
      if(!Character.isDigit(numbers.get(i).charAt(0))){
        throw new IllegalArgumentException("ERROR : 숫자 아닌게 포함됨");
      }
      if(Integer.parseInt(numbers.get(i)) < 0 || Integer.parseInt(numbers.get(i)) > 9){
        throw new IllegalArgumentException("ERROR : 0 ~ 9 사이의 숫자만 입력 가능");
      }
    }
    if(numbers.size() != 3){
      throw new IllegalArgumentException("ERROR : 세자리가 아니거나 중복 수 포함");
    }
  }
}
