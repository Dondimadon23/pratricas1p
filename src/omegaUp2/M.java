package omegaUp2;

import java.util.Scanner;

public class M {

	public static void main(String[] lol) {

		int a;

		String msj;

		Scanner in = new Scanner(System.in);

		a = in.nextInt();

		msj = (a >= 18) ? "MAYOR DE EDAD" : "MENOR DE EDAD";

		System.out.println(msj);

	}

}