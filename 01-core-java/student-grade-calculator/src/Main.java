import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();

        System.out.print("Enter Java marks: ");
        double javaMarks = scanner.nextDouble();

        System.out.print("Enter DBMS marks: ");
        double dbmsMarks = scanner.nextDouble();

        System.out.print("Enter Computer Networks marks: ");
        double cnMarks = scanner.nextDouble();

        System.out.print("Enter Python marks: ");
        double pythonMarks = scanner.nextDouble();

        System.out.print("Enter Operating Systems marks: ");
        double osMarks = scanner.nextDouble();

        double total = javaMarks + dbmsMarks + cnMarks
                + pythonMarks + osMarks;

        double percentage = total / 5;

        char grade;

        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        String result;

        if (percentage >= 40) {
            result = "PASS";
        } else {
            result = "FAIL";
        }

        System.out.println("\n========== STUDENT RESULT ==========");
        System.out.println("Name       : " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("------------------------------------");
        System.out.println("Total Marks: " + total + " / 500");
        System.out.println("Percentage : " + percentage + "%");
        System.out.println("Grade      : " + grade);
        System.out.println("Result     : " + result);
        System.out.println("====================================");

        scanner.close();
    }
}
