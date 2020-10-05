import java.util.Scanner;

public class Avarage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Zadej prvni cislo: ");
        double num1 = in.nextInt();

        System.out.print("Zadej druhe cislo: ");
        double num2 = in.nextInt();

        System.out.print("Zadej treti cislo: ");
        double num3 = in.nextInt();

        System.out.println("Prumer techto cisel je : " + (num1 + num2 + num3) / 3);
    }
}
