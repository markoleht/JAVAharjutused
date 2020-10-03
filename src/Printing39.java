import java.util.Scanner;

public class Printing39 {

    public static void printStars(int amount) {
        // 39.1
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times
        int printed = 0;
        while (printed < amount) {
            System.out.print("*");
            printed = printed + 1;
        }
        System.out.println("");
    }

    public static void printSquare(int sideSize) {
        // 39.2
        int printed = 0;
        while (printed < sideSize) {
            printStars(sideSize);
            printed = printed + 1;
        }
    }

    public static void printRectangle(int width, int height) {
        // 39.3
        int printed = 0;
        while (printed < height) {
            printStars(width);
            printed = printed + 1;
        }
    }

    public static void printTriangle(int size) {
        // 39.4
        int row = 1;
        while (row <= size) {
            printStars(row);
            row = row + 1;
        }
    }

    public static void main(String[] args) {

        printStars(188);
        System.out.println("");

        printSquare(4);
        System.out.println("");

        printRectangle(9, 3);
        System.out.println("");

        printTriangle(29);
        System.out.println("");
    }

}
