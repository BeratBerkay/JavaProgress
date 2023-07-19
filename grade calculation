import java.util.Scanner;

public class GradeCalculationProgram {
    public static void main(String[] args) {
        // Use the Scanner class to get necessary inputs from the user
        Scanner scanner = new Scanner(System.in);

        // Get student information
        System.out.print("Enter student's first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter student's last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter midterm grade: ");
        int midtermGrade = scanner.nextInt();

        System.out.print("Enter final grade: ");
        int finalGrade = scanner.nextInt();

        // Calculate the average grade
        double averageGrade = (midtermGrade * 0.4) + (finalGrade * 0.6);

        // Check if the student passed the course
        String status;
        if (averageGrade >= 50) {
            status = "Passed";
        } else {
            status = "Failed";
        }

        // Display student information and course status
        System.out.println("\nStudent Information:");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Midterm Grade: " + midtermGrade);
        System.out.println("Final Grade: " + finalGrade);
        System.out.println("Average Grade: " + averageGrade);
        System.out.println("Status: " + status);

        // Don't forget to close the Scanner object
        scanner.close();
    }
}
