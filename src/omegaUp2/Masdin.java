package omegaUp2;
import java.util.Scanner;

public class Masdin {

	public static void main(String[] lol) {

		float a, b, c, d;

		String msj;

		Scanner in = new Scanner(System.in);

		a = in.nextFloat();

		msj = (a >= 1.70) ? "Aceptado" : "Rechazado";

		System.out.println(msj);

	}

}