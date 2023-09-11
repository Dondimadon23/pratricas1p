package omegaUp2;
import java.util.Scanner;

public class Maifgdn {

	public static void main(String[] args) {
		int altura;
		Scanner in = new Scanner(System.in);
		altura = in.nextInt();
		for (int i = 1; i <= altura; i++) {
			for (int j = 1; j <= altura - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}