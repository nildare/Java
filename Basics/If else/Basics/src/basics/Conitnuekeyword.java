package basics;

import java.util.*;

//Print all number under 50 other than the divisibles of 3
public class Conitnuekeyword {
    public static void main(String[] args) {
        int num;
        for(num = 0; num<50; num++){
            if(num%3==0){
                continue;
            }
            System.out.println(num);
        }
    }
}
