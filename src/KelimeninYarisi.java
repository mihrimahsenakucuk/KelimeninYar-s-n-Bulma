import java.util.Scanner;

public class KelimeninYarisi {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kelimenizi giriniz.");
        String kelime= scan.next();

        System.out.println(kelime.substring(0, kelime.length()/2));
    }
}