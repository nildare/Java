package loops;

import java.util.*;


public class Totaldigits {
    public static void main(String[] args) {
        System.out.println("Input number");

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int counter = 0;

//        for(;n != 0;n=n/10, counter++){
//        }
//        System.out.println(counter);
        while (n > 0) {
            n = n / 10;
            counter++;
        }
        System.out.println("Total digits " +  counter);
    }
}