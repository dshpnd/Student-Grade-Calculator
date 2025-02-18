package studentgradecaclulator;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();

        List<String> subjectNames = new ArrayList<>();
        List<Double> studentGrades = new ArrayList<>();

        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter the name of subject " + (i + 1) + ": ");
            String name = scanner.next();
            subjectNames.add(name);

            System.out.print("Enter the grade of subject " + (i + 1) + ": ");
            double grade = scanner.nextDouble();
            studentGrades.add(grade);
        }

        double average = calculateAverage(studentGrades);

        System.out.println("\nStudent Grade Report:");
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.println(subjectNames.get(i) + ": " + studentGrades.get(i));
        }

        System.out.println("\nAverage Grade: " + average);
    }

    private static double calculateAverage(List<Double> grades) {
        double sum = 0.0;
        for (Double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}