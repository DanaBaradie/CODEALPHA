import java.util.Scanner;
public class Task1{
    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numOfStudents = inn.nextInt();
        if(numOfStudents <= 0){
            System.out.println("Number of students should be greater than zero.");
        }
        double[] StudentGrades = new double[numOfStudents];
        System.out.println("Enter students' grades: ");
        for (int i = 0; i < StudentGrades.length; i++) {
            StudentGrades[i] = inn.nextDouble();
        }
        double highestScore = StudentGrades[0];
        for (double grade : StudentGrades) {
            if(grade > highestScore){
                highestScore = grade;
            }
        }
        double lowestScore = StudentGrades[0];
        for (double grade : StudentGrades) {
            if(grade < lowestScore){
                lowestScore = grade;
            }
        }
        double sum = 0;
        for (double grade : StudentGrades) {
            sum += grade;
        }
        double average = sum/numOfStudents;
        System.out.println("Highest score: " + highestScore);
        System.out.println("Lowest score: " + lowestScore);
        System.out.println("Average: " + average);
    }
}