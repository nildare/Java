package QuestionGame;


import java.util.Scanner;

public class QuestionService extends Question{

    public void show() {
        {
            int[] num = new int[5];
            for (int i =0 ; i< num.length;i++){
                num[i]=i+1;
            }

                String Question = "What is the Capital?";
                String opt1 = "Delhi";
                String opt2 = "Mumbai";
                String opt3 = "Chennai";
                String opt4 = "Kolkata";

            System.out.println(Question +"\n"+ opt1 +"\n"+ opt2 +"\n"+ opt3 +"\n"+ opt4);
            System.out.println(num[1]);
            Scanner scn = new Scanner(System.in);
            String answer = scn.nextLine();


            if (answer.equalsIgnoreCase(opt1)){
                System.out.println("Answer is correct!");
            }
            else{
                System.out.println("Answer Wrong!");
            }


        }}}

