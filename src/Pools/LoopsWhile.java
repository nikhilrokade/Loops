package Pools;

import java.util.Scanner;

public class LoopsWhile {
    public static void main(String[] args) {
        LoopsWhile lw = new LoopsWhile();
//        System.out.println(lw.bulbs());
//        Scanner s = new Scanner(System.in);
//        int N = s.nextInt();
//        int i = 1;
//        while(i * 4 <= N){
//            System.out.print(i * 4 + " ");
//            i++;
//        }
    }



        public int bulbs(int[] A) {

            int n = A.length;
            int count = 0, istate;
            for(int i = 0; i < n; i++) {
                if(count % 2 != 0)
                    istate = (A[i] == 1) ? 0 : 1;
                else istate = A[i];
                if(istate == 0) {
                    count++;
                }
            }
            return count;

        }
    }

