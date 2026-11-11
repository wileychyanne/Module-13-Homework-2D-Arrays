import java.util.Scanner;
public class ClassroomSeating {
    public static void main(String[] args) {
        String[][] seatArrange = new String[4][5];
        Scanner input = new Scanner(System.in);
         for (int i = 0; i < seatArrange.length; i++) {
            for (int j = 0; j < seatArrange[i].length; j++) {
                System.out.print("Enter the name of the student assigned to row "
                + (i + 1) + ", seat " + (j+1) + ": ");
                seatArrange[i][j] = input.nextLine();
            }
        }
        //display complete seating arrangement
        System.out.println("\nClassroom Seating Arrangement:");
        for (int i = 0; i < seatArrange.length; i++) {
            for (int j = 0; j < seatArrange[i].length; j++) {
                System.out.print(seatArrange[i][j] + "\t");
            }
            System.out.println();
        }
        //ask user to enter row & column number, then display student name
        System.out.print("Enter student's row number (1-4): ");
        int row = input.nextInt();
        System.out.print("Enter student's column number (1-5): ");
        int col = input.nextInt();
        if ((row >= 1 && row <= 4) && (col >= 1 && col <= 5)) {
            System.out.println("Student at row " + row + ", column "
            + col + ": " + seatArrange[row-1][col-1]);
        }
        else {
            System.out.println("Invalid row or column number.");
        }
        input.close();
    }
}
