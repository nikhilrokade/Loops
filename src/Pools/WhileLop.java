package Pools;

import java.util.Scanner;

public class WhileLop {
    public static void main(String[] args) {

//        Scanner s = new Scanner(System.in);
//        int T = s.nextInt();
//        int i = 1;
//        while (i<=T){
//            long N = s.nextLong();
//            String S = String.valueOf(N);
//            int length = S.length();
//            System.out.println(length);
//            i++;

//        String str="India";
//        for(int i=0;i<str.length();i++){
//            char ch=str.charAt(i); //accessing the charcater
//
//            System.out.println(ch);
//        }


        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int lcm = 0;
        for (int i = 1;  i <= (a * b);  i++){
            if(i % a == 0 && i % b == 0){
                lcm = i;
                break;
            }
        }
        System.out.println(lcm);
    }
}
