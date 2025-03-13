package Polymorphism;

abstract class Animal{
    private String name;
    private int age;

    public Animal(String name,int age){
        this.name=name;
        this.age=age;
    }

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

    public abstract void makeSound();

    public void eat(){
        System.out.println(name + "is eating");
    }
    public void sleep(){
        System.out.println(name + "is sleeping");
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + "Barks!");
    }

    public void fetch() {
        System.out.println(getName() + "is fetching the ball");
    }
}

class Cat extends Animal{
    public Cat(String name,int age){
        super(name, age);
    }
    @Override
    public void makeSound(){
        System.out.println(getName() + "Meows!");
    }
    public void scratch(){
        System.out.println(getName() + " is scratching the furniture!");
    }
}


class Bird extends Animal{
    public Bird(String name,int age){
        super(name, age);
    }

    @Override
    public void makeSound(){
        System.out.println(getName() + " chirps!");
    }

    public void fly(){
        System.out.println(getName() + "is flying!");
    }
}

public class Info {
    public static void main(String[] args) {
        Animal dog = new Dog("Sheero",20);
        Animal cat = new Cat("Billu",3);
        Animal bird = new Bird("Gopi",1);

        dog.makeSound();
        dog.eat();
        dog.sleep();
       if(dog instanceof Dog){
           Dog dog1 = (Dog) dog;
           dog1.fetch();
       }

        cat.makeSound();
        cat.eat();
        cat.sleep();
        if(cat instanceof Cat){
            Cat cat1 = (Cat) cat;
            cat1.scratch();
        }

        bird.makeSound();
        bird.eat();
        bird.sleep();
        if(bird instanceof Bird){
            Bird bird1 = (Bird) bird;
            bird1.fly();
        }

    }
}

