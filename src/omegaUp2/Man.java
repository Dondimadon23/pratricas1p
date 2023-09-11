package omegaUp2;
import java.util.Scanner;

public class Man {

	public static void main(String[] lol) {
		Scanner in = new Scanner(System.in);
		int a = 0, b, c, d, e, m = 0;

		c = in.nextInt();

		for (int i = 1; i <= c; i++) {

			e = in.nextInt();

			if (e > m) {
				m = e;
			}
		}

		System.out.println(m);
	}
}