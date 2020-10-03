import java.util.Scanner;
public class upToANumber{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Up to what number?");
        int start = 0;
        int max = Integer.parseInt(reader.nextLine());

        while (start <= max) {
            start++;
            { System.out.println("järjest loen: " + start);
                if (start >=max) {
                break;
            }
        }
    }}}