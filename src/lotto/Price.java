package lotto;
public class Price {
  static int money;
  public void lotto(String price){
    priceCheck(price);
    this.money =  Integer.parseInt(price);
  }
  public int getMoney(){return money;}
  public void priceCheck(String price){
    for(int i = 0; i < price.length(); i++){
      if(!Character.isDigit(price.charAt(i))){
        throw new IllegalArgumentException("[ERROR] 숫자만 입력해 주세요");
      }
    }
    if(Integer.parseInt(price) % 1000 != 0 || price.equals("0")){
      throw new IllegalArgumentException("[ERROR] 천원단위로 구매 가능합니다");
    }
  }
}
