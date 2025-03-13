package loops;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r;
        int digit  = 0;

        while(n>0){
            r=n%10;
            digit= digit*10+r;
            n=n/10;
        }
        System.out.println(digit);
    }
}
