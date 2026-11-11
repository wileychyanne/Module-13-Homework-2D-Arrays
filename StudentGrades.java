import java.util.Scanner;
public class StudentGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] scores = new int[5][3];
        int highest = 0;
        //enter scores
        for (int row = 0; row < 5; row++) {
            System.out.println("Student " + (row + 1));
            for (int col = 0; col < 3; col++) {
                System.out.print("Enter Course " + (col + 1) + " score: ");
                scores[row][col] = input.nextInt();
                while (scores[row][col] < 0 || scores[row][col] > 100) {
                    System.out.print("Enter a score from 0 to 100: ");
                    scores[row][col] = input.nextInt();
                }
                if (scores[row][col] > highest) {
                    highest = scores[row][col];
                }
            }
        }
        //display scores in a table
        System.out.println("\nStudent\tCourse 1\tCourse 2\tCourse 3");
        for (int row = 0; row < 5; row++) {
            System.out.print("Student " + (row + 1) + "\t");
            for (int col = 0; col < 3; col++) {
                System.out.print(scores[row][col] + "\t\t");
            }
            System.out.println();
        }
        //calculate th average for each student
        System.out.println("\nStudent Averages:");
        for (int row = 0; row < 5; row++) {
            int sum = 0;
            for (int col = 0; col < 3; col++) {
                sum += scores[row][col];
            }
            double average = (double) sum / 3;
            System.out.println("Student " + (row + 1) + ": " + average);
        }
        //calculate the average for each course
        System.out.println("\nCourse Averages:");
        for (int col = 0; col < 3; col++) {
            int sum = 0;
            for (int row = 0; row < 5; row++) {
                sum += scores[row][col];
            }
            double average = (double) sum / 5;
            System.out.println("Course " + (col + 1) + ": " + average);
        }
        //display highest score
        System.out.println("\nHighest Score: " + highest);
        input.close();
    }
}
