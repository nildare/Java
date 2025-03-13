package loops;
import java.util.*;

public class Sumofdigits {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner scn = new Scanner(System.in);

        int num= scn.nextInt();
        int sum=0;

        while(num>0){
         int r=num%10;
         sum=sum+r;
         num=num/10;
        }
        System.out.println(sum);
    }
}
