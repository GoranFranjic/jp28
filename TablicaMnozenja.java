package edunova;

import java.util.Scanner;

public class TablicaMnozenja {

	public static void main(String[] args) {

		int size = 9;

		Scanner unos = new Scanner(System.in);

		System.out.print("Unesite svoje ime: ");

		String ime = unos.nextLine();

		unos.close();

		System.out.println("// -------------------------------");

		System.out.println("// : : : TABLICA MNOZENJA : : :");

		System.out.println("// -------------------------------");

		System.out.print("// * |");

		for (int i = 1; i <= size; i++) {

			System.out.printf("%3d", i);

		}

		System.out.println();

		System.out.println("// -------------------------------");

		for (int i = 1; i <= size; i++) {

			System.out.printf("// %d |", i);

			for (int j = 1; j <= size; j++) {

				System.out.printf("%3d", i * j);

			}

			System.out.println();

		}

		System.out.println("// -------------------------------");

		System.out.printf("// : : : : : : : by %13s", ime);
		System.out.println();

		System.out.println("// -------------------------------");

	}

}
