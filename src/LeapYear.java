import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Leap Year check - Sisesta aasta");
        int number = Integer.parseInt(reader.nextLine());

        if (number % 4 == 0 && (number % 100 != 0 || number % 400 == 0)) {
            System.out.println("See on LEAP YEAR");
        } else {
            System.out.println("See ei ole leap year");
        }
    }}
