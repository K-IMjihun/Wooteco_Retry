package lotto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class CreateLottoNumber {
  static HashSet randomLotto;
  static List<Integer> randomLottoSort;
static List<List<Integer>> buyLottoNumber = new ArrayList<>();
public void RandomLotto(int money){
    for(int i = 0; i < money / 1000; i++) {
      randomLotto = new HashSet<>();
      while(randomLotto.size() < 6){
        randomLotto.add((int)(Math.random() * 45)+1);
      }
      randomLottoSort = new ArrayList<>(randomLotto);
      Collections.sort(randomLottoSort);
      System.out.println(randomLottoSort);
      buyLottoNumber.add(randomLottoSort);
    }
  }
  public List<List<Integer>> getBuyLottoNumber(){return buyLottoNumber;}
}
