package Encapsulation;

class Human{
    private int age;
    private String name;

    public Human(){                   // Default Constructor
       age = 10;
       name= "Mike";
    }

    public Human(int a, String n)      // Parameterized Constructor
    {
      age = a;
      name = n;
    }
    public int getAge()
    {
        return age;
    }

    public void setAge(int a)
    {
        age = a;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name=n;
    }
}

public class Demo {
    public static void main(String[] args)
    {
      Human obj = new Human();
      Human obj1 = new Human(11,"Jack");
//        obj1.setAge();
//        obj1.setName();

        System.out.println(obj.getAge());
        System.out.println(obj.getName());
        System.out.println(obj1.getAge());
        System.out.println(obj1.getName());
    }
}