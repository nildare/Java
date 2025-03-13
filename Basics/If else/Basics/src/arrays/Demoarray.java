package arrays;

import jdk.internal.org.objectweb.asm.commons.JSRInlinerAdapter;

public class Demoarray {
    public static void main(String[] args) {
        int[] a = {1,5,8,9,3};
        System.out.println(a[4]);
        for(int n: a){
            System.out.println(n);
        }

        int b[]= new int[4];
        b[0]=1;
        b[1]=3;
//        b[1]=7;
        b[2]=5;
        b[3]=7;

        for(int i=0;i<=3;i++){
            b[2]=8;
            System.out.println(b[i]);
            System.out.println();
        }

    }
}
