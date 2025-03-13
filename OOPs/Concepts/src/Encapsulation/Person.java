package Encapsulation;

class Info{
    private String name;
    private int age;
    private String country;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }
    public String getCountry(){
        return country;
    }
    public void setCountry(String country){
        this.country=country;
    }
}


public class Person {
    public static void main(String[] args) {
        Info info = new Info();

        info.setName("Nathan");
        info.setAge(10);
        info.setCountry("USA");

        System.out.println(info.getName());
        System.out.println(info.getAge());
        System.out.println(info.getCountry());

    }
}
