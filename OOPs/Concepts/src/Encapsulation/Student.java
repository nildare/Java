package Encapsulation;

class Details{
    private String name;
    private int age;
    private char grade;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGrade(){
        return grade;
    }

    public void setGrade(char grade){
        this.grade=grade;
    }

    public void DisplayDetails(){
        System.out.println("Displaying Details");
        System.out.println("Name : "+name+" Age : "+age+" Grade : "+grade);
    }
}

public class Student{
    public static void main(String[] args) {
        Details details = new Details();
        Details details1 = new Details();

        details.setName("Jack");
        details.setAge(22);
        details.setGrade('A');

        details1.setName("Mike");
        details1.setAge(21);
        details1.setGrade('B');

        System.out.println(details.getName());
        System.out.println(details.getAge());
        System.out.println(details.getGrade());

        details.DisplayDetails();
        details1.DisplayDetails();


    }
}