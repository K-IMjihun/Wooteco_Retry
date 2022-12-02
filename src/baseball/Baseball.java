package baseball;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Baseball {
  static Scanner sc = new Scanner(System.in);
  static int count = 0;
  static boolean repeat = true;
  static NumberCheck numberCheck;
  static CreateRandomNumber createRandomNumber = new CreateRandomNumber();
  public static void main(String[] args) {
    createRandomNumber.createRandomNumber();
    numberCheck = new NumberCheck(createRandomNumber.getRandomNumber());
  while(repeat) {
    count++;
    System.out.println("숫자 입력 : ");
    repeat = numberCheck.numberCheck(List.of(sc.nextLine().split(",")));
  }
    System.out.println("맞췄습니다 ! 시도횟수 : " + count);
  }
}