package Pools;

import java.util.Scanner;

public class WhileLoopss {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i = 2;

        while (i <= n) {
            System.out.print(i + " ");
            i = i + 2;
        }
    }
}
