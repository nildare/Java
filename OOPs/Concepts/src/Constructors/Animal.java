package Constructors;

//DEFAULT CONSTRUCTOR

class Cat{
    private String name;
    private int age;

    public Cat(){
        this.name="unknown";
        this.age=0;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}

class Dog{
private String name;
private String colour;

public Dog(String name, String colour){
    this.name=name;
    this.colour=colour;
}
public String getName(){
    return name;
}

public String getColour(){
    return colour;
}
}

public class Animal {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.getName());
        System.out.println(cat.getAge());

        Dog dog = new Dog("Mike","White");

        System.out.println(dog.getName());
        System.out.println(dog.getColour());


    }
}
