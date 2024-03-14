import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        
        int score;
        char grade;
        Scanner var= new Scanner(System.in);
        System.out.println("please enter your grade");
        score=var.nextInt();
        if(score>=90){
            grade='A';
        }
        else if(score>=80){
            grade='B';
        }
        else if(score>=70){
            grade='B';
        }
        else if(score>=50){
            grade='C';
        }
        else if(score>=40){
            grade='D';
        }
        else if(score>=30){
            grade='E';
        }


       

        
    }
}
