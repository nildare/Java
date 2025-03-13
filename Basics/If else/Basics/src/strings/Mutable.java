package strings;

public class Mutable {
    public static void main(String[] args) {
        StringBuilder str =  new StringBuilder("Mike");
//        str.append(" Corleone");
//        str.append(" Mafia");
        System.out.println(str);

        StringBuffer str1 = new StringBuffer("Mike");
//        System.out.println(str1.charAt(2));
        System.out.println(str.capacity());
        System.out.println(str1.capacity());

    }
}
