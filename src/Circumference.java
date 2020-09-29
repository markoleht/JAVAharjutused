import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {

        double pi = 3.14;

        Scanner reader = new Scanner(System.in);

        System.out.print("Type the radius: ");
        int radius = Integer.parseInt(reader.nextLine());


        System.out.println( "raadius on " + radius * pi);
    }
}
