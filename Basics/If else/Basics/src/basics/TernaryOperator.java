package basics;

import java.util.*;

public class TernaryOperator {
    public static void main(String[] args) {
        System.out.println("Input number");

        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        String ans;
        ans= (n%2==0) ? "Even" : "Odd";
        System.out.println(ans);
    }
}
