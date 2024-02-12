/*-------------------------------------------------
 |           Programming Practice 3--5             |
 |           BOOKSTORE REWARD PROGRAM              |
 |    Award students bookstore credits 10x's the   |
 |   amount of their GPA:  GPA=3.2, CREDITS = $32  |
  -------------------------------------------------*/
import java.util.Scanner;

class BookstoreCredit {
    public static void main(String[] args) {

        String name;
        double gradePointAvg;

        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? >> ");
        name = input.nextLine();

        System.out.print("What is your GPA? >> ");
        gradePointAvg = input.nextDouble();

        computeDiscount(name, gradePointAvg);
    }

    public static void computeDiscount(String student, double grade) {
        double credit;
        final int mult = 10;

        //Calculate award gpa * 10
        credit = grade * mult;

        /*print the string ("name, your GPA is gpa, so your discount is $credit")*/

        System.out.println(student + ", your GPA is " + grade + ", so your discount is $" + credit);
    }
}