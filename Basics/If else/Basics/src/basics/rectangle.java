package basics;

import java.util.*;

public class rectangle {
    public static void main(String[] args) {
        System.out.println("Enter the length of the rectangle");
        Scanner scn = new Scanner(System.in);

        int l = scn.nextInt();

        System.out.println("Enter the breadth of the rectangle");
        Scanner scn2 = new Scanner(System.in);

        int b= scn.nextInt();

        int area=l*b;

        int perimeter=2*(l+b);

        if(area>perimeter){
            System.out.println("Area is more");
            System.out.println("Area is " + area);
            System.out.println("Perimeter is "+ perimeter);
        }
        else {
            System.out.println("Perimeter is more");
            System.out.println("Area is " + area);
            System.out.println("Perimeter is "+ perimeter);
        }
    }
}
