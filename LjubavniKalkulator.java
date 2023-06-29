package edunova;

import java.util.Scanner;

public class LjubavniKalkulator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite prvo ime:");
        String ime1 = scanner.nextLine();

        System.out.println("Unesite drugo ime:");
        String ime2 = scanner.nextLine();

        int[] ponavljanjeSlova = izracunajPonavljanjeSlova(ime1, ime2);

        System.out.println("Ponavljanje slova u imenima:");
        ispisiPonavljanjeSlova(ponavljanjeSlova);
    }

    public static int[] izracunajPonavljanjeSlova(String ime1, String ime2) {
        int[] ponavljanjeSlova = new int[26];
        for (int i = 0; i < ime1.length(); i++) {
            char slovo = ime1.charAt(i);
            if (Character.isLetter(slovo)) {
                slovo = Character.toLowerCase(slovo);
                ponavljanjeSlova[slovo - 'a']++;
            }
        }
        for (int i = 0; i < ime2.length(); i++) {
            char slovo = ime2.charAt(i);
            if (Character.isLetter(slovo)) {
                slovo = Character.toLowerCase(slovo);
                ponavljanjeSlova[slovo - 'a']++;
            }
        }
        return ponavljanjeSlova;
    }

    public static void ispisiPonavljanjeSlova(int[] ponavljanjeSlova) {
        for (int i = 0; i < ponavljanjeSlova.length; i++) {
            if (ponavljanjeSlova[i] > 0) {
                char slovo = (char) ('a' + i);
                System.out.println(slovo + ": " + ponavljanjeSlova[i]);
            }
		
		
		
		
		
		
		
        }
		
	}
	
	
    }
