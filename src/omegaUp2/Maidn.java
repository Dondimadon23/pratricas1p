package omegaUp2;
import java.util.Scanner;

public class Maidn {

	public static void main(String[] lol) {

		int a, b, c, d;

		String msj;

		Scanner in = new Scanner(System.in);

		a = in.nextInt();

		for (int i = 0; i < a; i++) {

			for (int j = a - i; j > 1; j--) {

				System.out.print("");

			}

			for (int j = 0; j <= i; j++) {

				System.out.print("#");

			}

			System.out.println();

		}

	}

}