package Pools;

import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        int i = 1;

        while(i*i<=a){
            System.out.print(i*i+" ");
            i++;
        }
    }
}
