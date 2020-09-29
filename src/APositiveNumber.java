import java.util.Scanner;
public class APositiveNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("See väli ootab kas positiivset või negatiivset numbrit ");
        int number = Integer.parseInt(reader.nextLine());

        if (number >= 0) { System.out.println( "Number on täis õnne ja rõõmu (positiivne)");

        } else {
            System.out.println( "Number on Kurb, lihtsalt kurb (negatiivne)");}
    }
    }







