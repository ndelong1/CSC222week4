import java.util.Scanner;

public class Notebook {
    public static void main(String[] args) {
        String red = "\u001B[31m";
        String brightGreen = "\u001B[92m";
        String blue = "\u001B[34m";
        String purple = "\u001B[35m";
        String cyan = "\u001B[36m";

        Scanner input = new Scanner(System.in);

        System.out.println(brightGreen + "Hello World!");
        System.out.println(red + "We are in Week 4!");
        System.out.println(cyan + "This is fun!");
        System.out.print(blue + "What is your name? >> ");
        String name = input.nextLine();

        System.out.println(purple + "Your name is " + name + ".");
    }


}
