import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("       STUDENT GRADE CALCULATOR");
        System.out.println("====================================");

        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        int totalMarks = 0;

        for (int i = 1; i <= subjects; i++) {

            System.out.print("Enter marks for Subject " + i + " (0-100): ");
            int marks = sc.nextInt();

            while (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Enter marks between 0 and 100.");
                System.out.print("Enter marks again: ");
                marks = sc.nextInt();
            }

            totalMarks += marks;
        }

        double averagePercentage = (double) totalMarks / subjects;

        String grade;

        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B";
        } else if (averagePercentage >= 60) {
            grade = "C";
        } else if (averagePercentage >= 50) {
            grade = "D";
        } else if (averagePercentage >= 40) {
            grade = "E";
        } else {
            grade = "F";
        }

        System.out.println("\n====================================");
        System.out.println("             RESULT");
        System.out.println("====================================");

        System.out.println("Total Marks       : " + totalMarks);
        System.out.println("Average Percentage: " +
                String.format("%.2f", averagePercentage) + "%");
        System.out.println("Grade             : " + grade);

        if (grade.equals("F")) {
            System.out.println("Result            : FAIL");
        } else {
            System.out.println("Result            : PASS");
        }

        sc.close();
    }
}