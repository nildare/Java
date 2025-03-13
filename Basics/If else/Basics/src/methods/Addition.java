package methods;

import java.util.*;

class Add{
    int sum(int x, int y){
    int ans=x+y;
    return ans;
}}
public class Addition {
    public static void main(String[] args) {
        Add obj1= new Add();
        System.out.println("Enter the two numbers : ");
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();

        int p=obj1.sum(a,b);

        System.out.println("Total sum is :" + p);
    }
}
