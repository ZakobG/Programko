import java.util.Scanner;

public class Opakovani {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadej nahodnou vetu: ");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        int pocet = 0;

            for (int i = 0; i < str.length(); i++) {
                if (Character.isLetter(ch[i]))
                    pocet++;
                }
            System.out.println("Pismena: " + pocet);
            }
        }