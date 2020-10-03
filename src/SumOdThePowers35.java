import java.util.*;
public class SumOdThePowers35 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a power: ");
        int power = Integer.parseInt(reader.nextLine());

        double sum = Math.pow(2,power+ 1 ) - 1;
        System.out.println("The sum is: " + sum);

    }}
//vastus internetist :( ise ei osanud