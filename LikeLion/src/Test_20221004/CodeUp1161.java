package Test_20221004;

import java.util.*;
import java.io.*;

public class CodeUp1161 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int num = input[0] + input[1];

        StringBuilder sb = new StringBuilder();
        sb.append(isNum(input[0])).append("+").append(isNum(input[1])).append("=").append(isNum(num));

        System.out.println(sb.toString());
    }

    static String isNum(int num){
        if(num % 2 == 0)
            return "짝수";
        else
            return "홀수";
    }
}