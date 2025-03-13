package loops;

//Sum  of S=1-2+3-4 ... n


import java.util.Scanner;

public class SumofSeries {
    public static void main(String[] args) {
        System.out.println("enter value of n");
        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();

        int ans=0;

       for (int i=1;i<=n;i++){
           if (i%2==0){
               ans = ans - i;
           }
           else {
               ans = ans + i;
           }
       }
        System.out.println(ans);
    }
}
