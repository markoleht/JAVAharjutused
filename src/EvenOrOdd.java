import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Sisesta täisarv ja oota, et JAVA hakkaks hakkaks imet tegema ");
        int number = Integer.parseInt(reader.nextLine());

        if (number % 2 == 0) { System.out.println( "See number on PAARIS )");

        } else {
            System.out.println("See number on PAARITU");}
    }
}
