package Test_20221004;

import java.util.Scanner;

public class CoinTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = 0;
        int num = 0;
        int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

        System.out.print("금액을 넣으세요 : ");
        amount = scanner.nextInt();

        for (int i = 0; i < unit.length; i++){
            num = amount / unit[i];
            amount %= unit[i];
            System.out.println(unit[i] + "원 " + num + "개");
        }
    }
}
