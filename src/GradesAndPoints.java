import java.util.Scanner;
public class GradesAndPoints {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Sisesta õpilase testitulemus punktides ");
        int number = Integer.parseInt(reader.nextLine());

        if (number >= 50 && number <= 60) System.out.println("hinne on 5");

        else if (number >= 45 && number <= 49) System.out.println("hinne on 4");

        else if (number >= 40 && number <= 44) System.out.println("hinne on 3");

        else if (number >= 35 && number <=39) System.out.println("hinne on 2");

        else if (number >= 30 && number <= 34) System.out.println("hinne on 1");

        else
            System.out.println("Oleksid pidanud rohkem õppima - kohtume McDonaldsi leti taga");
    }}

