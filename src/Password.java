import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

    System.out.println("Sisesta parool: ");
            while (true) {
            String parool = String.valueOf(reader.nextLine());
            if (parool.equals("carrot")) {
        System.out.println("The secret is: jryy qbar!");
        break;
        }
        System.out.println("Parool on vale: proovi veel");
        }}}