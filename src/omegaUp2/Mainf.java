package omegaUp2;
import java.util.Scanner;

public class Mainf {

	public static void main(String[] lol) {

		int a, b, c, d, e, re1, re2;

		String msj = "";

		Scanner in = new Scanner(System.in);

		a = in.nextInt();

		b = in.nextInt();

		c = in.nextInt();

		d = in.nextInt();

		e = in.nextInt();

		re1 = a + b + c;

		re2 = d + e;

		msj = (re1 < re2) ? "Pedro" : "Juan";

		System.out.println(msj);

	}

}