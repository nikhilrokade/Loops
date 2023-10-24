package Pools;

import java.util.Scanner;

public class LoopWhiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 1;

        int firstDigit, lastDigit;
        while(i<=a) {
            int num = sc.nextInt();
            int k = 10;
            while(num/k != 0) {

                k*=10;
            }
            k = k/10;
            firstDigit = num/k;
            lastDigit = num%10;
            System.out.print(firstDigit);
            System.out.print(" ");
            System.out.print(lastDigit);
            System.out.print("\n");
            i++;
        }
    }
}
