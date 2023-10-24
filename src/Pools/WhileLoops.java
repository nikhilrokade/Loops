package Pools;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i = 1;
        int j = 0;

        while (i <= n) {
            j = j + i;
            i++;
        }
        System.out.print(j);
    }
}