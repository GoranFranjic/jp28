package edunova;

import java.util.Arrays;
import java.util.Scanner;

public class LjubavniKalkulator {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);

		System.out.println("Unesite prvo ime:");
		String ime1 = unos.nextLine();

		System.out.println("Unesite drugo ime:");
		String ime2 = unos.nextLine();

		String s = ime1.toLowerCase() + ime2.toLowerCase();

		int[] niz = new int[ime1.length() + ime2.length()];

		int b;
		char z;
		for (int i = 0; i < s.length(); i++) {
			z = s.charAt(i);
			b = 0;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == z) {
					b++;
				}
			}
			niz[i] = b;

		}
		System.out.println(Arrays.toString(niz));
		
		
	
		int[] nizDva = niz;

        int duljina = nizDva.length;
        StringBuilder nizTri = new StringBuilder();

        for (int i = 0; i < duljina / 2; i++) {
            nizTri.append(nizDva[i] + nizDva[duljina - 1 - i]);
        }

        if (duljina % 2 != 0) {
            nizTri.append(nizDva[duljina / 2]);
        }

        System.out.println(nizTri);
        
        
        int[] novoNiz = new int[nizTri.length()];
        for (int i = 0; i < nizTri.length(); i++) {
            novoNiz[i] = Character.getNumericValue(nizTri.charAt(i));
        }

        duljina = novoNiz.length;
        nizTri = new StringBuilder();

        for (int i = 0; i < duljina / 2; i++) {
        	nizTri.append(novoNiz[i] + novoNiz[duljina - 1 - i]);
        }

        if (duljina % 2 != 0) {
        	nizTri.append(novoNiz[duljina / 2]);
        }

        System.out.println("Rezultat druge petlje je: " + nizTri);

		
        int[] zadnjiNiz = new int[nizTri.length()];
        for (int i = 0; i < nizTri.length(); i++) {
            zadnjiNiz[i] = Character.getNumericValue(nizTri.charAt(i));
        }

        duljina = zadnjiNiz.length;
        nizTri = new StringBuilder();

        for (int i = 0; i < duljina / 2; i++) {
        	nizTri.append(zadnjiNiz[i] + zadnjiNiz[duljina - 1 - i]);
        }

        if (duljina % 2 != 0) {
        	nizTri.append(zadnjiNiz[duljina / 2]);
        }

        System.out.println("Rezultat zadnje petlje je: " + nizTri);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/*System.out.println(ljubav(niz));
	}

	private static int ljubav(int[] niz) {
		
		if(niz.length<3) {
		
		String s="";
		
		for(int i: niz) {
			
			s+=i;
		}
		if (Integer.parseInt(s)<100) {
			
			return Integer.parseInt(s);
		}
		}
		
		int[] noviNiz = {1,3};
		return ljubav(noviNiz);*/
		
		
		
	}
	
}




import java.util.Arrays;
import java.util.Scanner;

public class LjubavniKalkulator {

    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);

        System.out.println("Unesite prvo ime:");
        String ime1 = unos.nextLine();

        System.out.println("Unesite drugo ime:");
        String ime2 = unos.nextLine();

        String s = ime1.toLowerCase() + ime2.toLowerCase();

        int[] niz = new int[ime1.length() + ime2.length()];

        int b;
        char z;
        for (int i = 0; i < s.length(); i++) {
            z = s.charAt(i);
            b = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == z) {
                    b++;
                }
            }
            niz[i] = b;
        }

        // Transformacija niza nizDva (prva petlja)
        int[] nizDva = Arrays.copyOf(niz, niz.length);
        int duljina = nizDva.length;
        StringBuilder nizTri = new StringBuilder();

        for (int i = 0; i < duljina / 2; i++) {
            nizTri.append(nizDva[i] + nizDva[duljina - 1 - i]);
        }

        if (duljina % 2 != 0) {
            nizTri.append(nizDva[duljina / 2]);
        }

        System.out.println(nizTri);

        // Transformacija niza novoNiz (druga petlja)
        int[] novoNiz = new int[nizTri.length()];
        for (int i = 0; i < nizTri.length(); i++) {
            novoNiz[i] = Character.getNumericValue(nizTri.charAt(i));
        }

        duljina = novoNiz.length;
        nizTri = new StringBuilder();

        for (int i = 0; i < duljina / 2; i++) {
            nizTri.append(novoNiz[i] + novoNiz[duljina - 1 - i]);
        }

        if (duljina % 2 != 0) {
            nizTri.append(novoNiz[duljina / 2]);
        }

        System.out.println("Rezultat druge petlje je: " + nizTri);

        // Transformacija niza zadnjiNiz (treća petlja)
        int[] zadnjiNiz = new int[nizTri.length()];
        for (int i = 0; i < nizTri.length(); i++) {
            zadnjiNiz[i] = Character.getNumericValue(nizTri.charAt(i));
        }

        duljina = zadnjiNiz.length;
        nizTri = new StringBuilder();

        for (int i = 0; i < duljina / 2; i++) {
            nizTri.append(zadnjiNiz[i] + zadnjiNiz[duljina - 1 - i]);
        }

        if (duljina % 2 != 0) {
            nizTri.append(zadnjiNiz[duljina / 2]);
        }

        System.out.println("Rezultat zadnje petlje je: " + nizTri);

        // Pozivanje funkcije PostupakBezIspisa
        int[] rezultat = PostupakBezIspisa(zadnjiNiz);
        System.out.println("Rezultat funkcije PostupakBezIspisa: " + Arrays.toString(rezultat));
    }

    public static int[] PostupakBezIspisa(int[] brojevi) {
        // Implementacija tvoje funkcije PostupakBezIspisa
        // ...
        return brojevi2;
    }

    public static void main(String[] args) {
        // Pozivanje glavnog main-a
        main(args);
    }
}

