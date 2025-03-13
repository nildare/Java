package loops;

//a= 2 b = 5 find out 2^5;

import java.util.Scanner;

public class Exponent {
    public static void main(String[] args) {
        System.out.println("Enter a & b");
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        int number = 1;

        for(int i=1;i<=b;i++){
            number = number*a;
        }
        System.out.println(number);
    }
}
