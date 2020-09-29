import java.util.Scanner;

public class Divider {

        public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);

            System.out.print("Sisesta number: ");
            int divided = Integer.parseInt(reader.nextLine());

            System.out.print("Sisesta veel üks number: ");
            int divider = Integer.parseInt(reader.nextLine()); // Reads a string variable from the keyboard and transfers it to an integer

            double vastus = Double.valueOf(divided)/ divider;
            System.out.println("Kalkulaator jagab sisestatud numbrid ja saab vastuseks: " + vastus);
        }
    }