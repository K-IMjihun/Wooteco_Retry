package lotto;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class LottoNumber {
  static Scanner sc = new Scanner(System.in);
  static List<Integer> lottoNumber = new ArrayList<>();
  static int bonusNumber;
  public void lottoNumber(){
    System.out.println("당첨번호 입력");
    List<String> lottoNumber = List.of(sc.nextLine().split(","));
    numberCheck(lottoNumber);
    setLottoNumber(lottoNumber);
    System.out.println("보너스 번호 입력");
    String bonusNumber = sc.next();
    bonusNumberCheck(bonusNumber);
    setBonusNumber(bonusNumber);
  }
  public void numberCheck(List<String> numberChecks){
    HashSet legnthCheck = new HashSet<>(numberChecks);
    if(legnthCheck.size() != 6){
      throw new IllegalArgumentException("ERROR : 여섯자리가 아니거나 중복 수 포함됨");
    }
    for(String numberCheck : numberChecks){
      if(numberCheck.length() > 2){
        throw new IllegalArgumentException("ERROR : 최대 두자리까지 입력 가능");
      }
      if(!Character.isDigit(numberCheck.charAt(0))){
        throw new IllegalArgumentException("ERROR : int말고 다른게 있음");
      }
      if(Integer.parseInt(numberCheck) > 45 || Integer.parseInt(numberCheck) < 1){
        throw new IllegalArgumentException("ERROR : 범위초과");
      }
    }
  }
  public void setLottoNumber(List<String> lottoNumbers){
    for(String lottoNumber : lottoNumbers){
      this.lottoNumber.add(Integer.parseInt(lottoNumber));
    }
  }
  public void bonusNumberCheck(String bonusNumber){
    if(bonusNumber.length() > 2){
      throw new IllegalArgumentException("ERROR 최대 두자리까지 가능");
    }
    if(Integer.parseInt(bonusNumber) > 45 || Integer.parseInt(bonusNumber) < 0){
      throw new IllegalArgumentException("ERROR 1 ~ 45까지만 가능");
    }
    if(getLottoNumber().contains(bonusNumber)){
      throw new IllegalArgumentException("ERROR 로또번호와 겹침");
    }
    if(!Character.isDigit(bonusNumber.charAt(0))){
      throw new IllegalArgumentException("ERROR 숫자말고 다른게 있음");
    }
  }
  public void setBonusNumber(String bonusNumber){
    this.bonusNumber = Integer.parseInt(bonusNumber);

  }
  public List<Integer> getLottoNumber(){ return lottoNumber;}
  public int getBonusNumber(){ return bonusNumber;  }

}
