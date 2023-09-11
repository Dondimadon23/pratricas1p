package omegaUp2;
import java.util.Scanner;

public class Mains {

	public static void main(String[] lol) {

		int a, b, c, d;

		String msj;

		Scanner in = new Scanner(System.in);

		a = in.nextInt();

		b = in.nextInt();

		if (a == b) {

			System.out.println("iguales");

		} else if (a < b) {

			System.out.println("menor");

		} else {

			System.out.println("mayor");

		}

	}

}