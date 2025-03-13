package basics;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Go boy!");
        System.out.println("Enter the number");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        if(n>0 && n%2==0){
            System.out.println("Number is even");
        }
       else if(n>0 && n%2==1) {
            System.out.println("Number is odd");
        }
       else if(n==0){
            System.out.println("Number is 0");
        }
       else if(n<0){
            System.out.println("Number is negative");
        }
    }
}