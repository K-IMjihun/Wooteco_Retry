package lotto;
public class LottoResult {
  public static long prizeMoney = 0;
  final static int count[] = new int[5];
  static Price price = new Price();
  public static void update(int index, long money){
    prizeMoney += money;
    count[index]++;
    output();
  }
  public static void output() {
    System.out.printf("3개 일치 (5,000원) - %d개 \n", count[4]);
    System.out.printf("4개 일치 (50,000원) - %d개 \n", count[3]);
    System.out.printf("5개 일치 (1,500,000원) - %d개 \n", count[2]);
    System.out.printf("5개 일치, 보너스 볼 일치 (30,000,000원) - %d개\n", count[1]);
    System.out.printf("6개 일치 (2,000,000,000원) - %d개 \n", count[0]);
    System.out.printf("총 수익률은 %.1f%%입니다.", (float) (prizeMoney / price.getMoney() * 100));
  }
}
