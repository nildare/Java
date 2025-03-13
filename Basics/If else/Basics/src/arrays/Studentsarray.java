package arrays;

public class Studentsarray {
    public static void main(String[] args) {
        class Student{
            int roll;
            String name;
            int Grade;
        }
          Student s1 =  new Student();
          s1.roll=10;
          s1.name="Amit";
          s1.Grade=3;

          Student s2 = new Student();
          s2.roll=11;
          s2.name="Kajal";
          s2.Grade= 5;

          Student s3= new Student();
          s3.roll=22;
          s3.name="John";
          s3.Grade=7;

          Student student[] = new Student[3];
          student[0]=s1;
          student[1]=s2;
          student[2]=s3;

        for (Student n : student) {
            System.out.println(n.name + "  " + n.roll);

        }

    }
}
