import java.util.*;

public class Skem {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Zdejte větu prosím.");
        System.out.println("");

        String lajna = scan.nextLine();
        String[] slova = lajna.split("[ ]+");
        System.out.println("Předposlední slovo je: " + slova[slova.length - 2]);
    }
}