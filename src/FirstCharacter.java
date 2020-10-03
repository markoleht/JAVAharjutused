import java.util.Scanner;
public class FirstCharacter {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Mis su nimi on? ");
        String word = reader.nextLine();
        int i = 0;
        if(word.length() >= 3){
            while (i < word.length()) {
                if (i < 3) {
                    System.out.println((i+1) + ".character: " + word.charAt(i));
                    i++;
                }
                }
            }}}