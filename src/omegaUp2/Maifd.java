package omegaUp2;
import java.util.Scanner;

public class Maifd {

	public static void main(String[] lol) {

		int a, b, c, d;

		String msj;

		Scanner in = new Scanner(System.in);

		a = in.nextInt();

		b = in.nextInt();

		for (int i = 0; i < a; i++) {

			for (int j = 0; j < b; j++) {

				if (i == 0 || i == a - 1 || j == 0 || j == b - 1) {

					System.out.print("* ");

				} else {

					System.out.print("  ");

				}

			}

			System.out.println();

		}

	}

}