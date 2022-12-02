package lotto;
import java.util.List;
import java.util.Scanner;

public class Main {
  static Price price = new Price();
  static CreateLottoNumber createLottoNumber = new CreateLottoNumber();
  static LottoNumber lottoNumber = new LottoNumber();
  static LottoResult lottoResult = new LottoResult();
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    Price();
    createLottoNumber.RandomLotto(price.getMoney());
    lottoNumber.lottoNumber();
    compare();


  }
  public static void Price(){
    System.out.println("얼마치?");
    price.lotto(sc.next());
  }
  public static void compare() {
    for (List<Integer> number : createLottoNumber.getBuyLottoNumber()) {
      LottoType lottoType = LottoType.calc(lottoNumber.getLottoNumber(), lottoNumber.getBonusNumber(), number);
      if(lottoType != null){
        lottoResult.update(lottoType.getIndex(), lottoType.getMoney());
      }
      else{
        lottoResult.output();
      }

    }
  }
}