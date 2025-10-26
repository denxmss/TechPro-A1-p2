import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the student score:");
        int score = input.nextInt();
        
        char grade;
        
        if (score >= 90) {
            System.out.println("The student grade is A");
        } else if (score >= 80) {
            System.out.println("The student grade is B");
        } else if (score >= 70) {
      System.out.println("The student grade is C");
        } else if (score >= 60) {
       System.out.println("The student grade is D");
        } else if (score <= 59) {
  System.out.println("The student grade is F");
        }
    }
}
