package Test_20221004;

import java.util.Scanner;

public class MoneyTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("금액을 넣으세요:");
        int money = sc.nextInt();


        int curr50000 = 50000;
        int curr10000 = 10000;
        int curr5000 = 5000;
        int curr1000 = 1000;
        int curr500 = 500;

        System.out.printf("50000원권 %d장, 나머지 : %d\n", (money/curr50000), money%curr50000);
        System.out.printf("10000원권 %d장, 나머지 : %d\n", (money/curr10000), money%curr10000);
        System.out.printf("5000원권 %d장, 나머지 : %d\n", (money/curr5000), money%curr5000);
        System.out.printf("1000원권 %d장, 나머지 : %d\n", (money/curr1000), money%curr1000);
        System.out.printf("500원권 %d장, 나머지 : %d\n", (money/curr500), money%curr500);
    }
}