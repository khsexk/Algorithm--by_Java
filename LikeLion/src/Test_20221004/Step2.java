package Test_20221004;

import java.util.Scanner;

public class Step2 {
    public static void main(String[] args) {
        int refund = 32160;
        System.out.printf("오만원권 %d장 나머지:%d\n", refund / 50000, refund % 50000);
        refund = refund % 50000;

        System.out.printf("만원권 %d개 나머지:%d\n", refund / 10000, refund % 10000);
        refund = refund %10000;
        System.out.printf("오천원권 %d개 나머지:%d\n", refund / 5000, refund % 5000);
        refund = refund % 5000;
        System.out.printf("천원권 %d개 나머지:%d\n", refund / 1000, refund % 1000);
        refund = refund % 1000;
        System.out.printf("오백원권 %d개 나머지:%d\n", refund / 500, refund % 500);
        refund = refund % 500;
        System.out.printf("백원권 %d개 나머지:%d\n", refund / 100, refund % 100);
        refund = refund % 100;
        System.out.printf("오십원권 %d개 나머지:%d\n", refund / 50, refund % 50);
        refund = refund % 50;
        System.out.printf("십원권 %d개 나머지:%d\n", refund / 10, refund % 10);
        refund = refund % 10;
    }

}