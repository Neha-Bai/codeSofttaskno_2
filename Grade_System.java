import java.util.Scanner;

public class Grade_System {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter total number of subjects :");
        int n = Sc.nextInt();
        if (n >= 7) {
            System.out.println("Error! , Max subjects can be 7");
        } else {
            int total = 0;
            int marks;
            System.out.println("Enter marks :");
            for (int i = 1; i <= n; i++) {
                marks = Sc.nextInt();
                if (marks > 100) {
                    System.out.println("Error :");
                } else {
                    total += marks;
                }
            }
            int AvgPer = (total / n);
            int N = n * 100;
            double per = ((double) total / N) * 100;
            System.out.println("Average percetntage is  :" + AvgPer);
            System.out.println("Percentage is " + per);
            if (AvgPer >= 90 && AvgPer <= 100) {
                System.out.println("Grade is A+");
            } else if (AvgPer >= 80 && AvgPer < 90) {
                System.out.println("Grade is A :");
            } else if (AvgPer >= 70 && AvgPer < 80) {
                System.out.println("Grade is B :");
            } else if (AvgPer >= 60 && AvgPer < 70) {
                System.out.println("Grade is C :");
            } else {
                System.out.println("YOU'RE FAILED :");
            }
        }
    }
}
