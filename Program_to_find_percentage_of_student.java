import java.util.Scanner;
public class Question11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Initialize the grades array with variable length rows
        float[][] grades = new float[10][];
        // Read the grades for each student
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the number of subjects for student " + (i + 1) + ": ");
            int numSubjects = input.nextInt();
            grades[i] = new float[numSubjects];
            System.out.println("Enter the grades for student " + (i + 1) + ":");
            for (int j = 0; j < numSubjects; j++) {
                grades[i][j] = input.nextFloat();
            }
        }
        input.close();
        // Calculate the row and column averages
        float[] rowAverages = new float[10];
        float[] columnAverages = new float[5];
        for (int i = 0; i < 10; i++) {
            float rowTotal = 0;
            for (int j = 0; j < grades[i].length; j++) {
                rowTotal += grades[i][j];
                columnAverages[j] += grades[i][j];
            }
            rowAverages[i] = rowTotal / grades[i].length;
        }
        for (int j = 0; j < 5; j++) {
            columnAverages[j] /= 10;
        }
        // Print the results
        System.out.printf("%-10s", "Student");
        for (int j = 0; j < 5; j++) {
            System.out.printf("%5s", "Sub" + (j + 1));
        }
        System.out.printf("%10s", "Avg");
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10s", "Student " + (i + 1));
            for (int j = 0; j < grades[i].length; j++) {
                System.out.printf("%5.2f", grades[i][j]);
            }
            for (int j = grades[i].length; j < 5; j++) {
                System.out.printf("%5s", "-");
            }
            System.out.printf("%10.2f", rowAverages[i]);
            System.out.println();
        }
        System.out.printf("%-10s", "Avg");
        for (int j = 0; j < 5; j++) {
            System.out.printf("%5.2f", columnAverages[j]);
        }
        System.out.println();
    }
}
