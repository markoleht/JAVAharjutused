import java.util.Scanner;
public class AgeCheck {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Kui oled meesinimene, siis sisesta oma vanus - Daamidelt vanust ei küsita");
        int number = Integer.parseInt(reader.nextLine());

        if (number >= 91 && number <= 120) System.out.println("Kuulge pange see asi pausi peale, ma ei taha enam");

        else if (number >= 61 && number <= 90) System.out.println("Äkki aitab juba");

        else if (number >= 46 && number <= 60) System.out.println("mnjahhh....");

        else if (number >= 31 && number <= 45) System.out.println("Elu on kui kvaliteetvein, mis muutub ajaga vaid paremaks");

        else if (number >= 19 && number <=30) System.out.println("Elu on lill");

        else if (number >= 0 && number <= 18) System.out.println("Rõõmus ja kraps, võilille laps");

        else
            System.out.println("Palun lõpeta oma rumalad naljad! Kas sa elad eelmises elus?");
    }}

