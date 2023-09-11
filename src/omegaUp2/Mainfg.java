package omegaUp2;
import java.util.Arrays;
import java.util.Scanner;

public class Mainfg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[3];
        for (int i = 0; i < 3; i++) {
            numeros[i] = scanner.nextInt();
        }
        String orden = scanner.next().toUpperCase();
        Arrays.sort(numeros);
        switch (orden) {
            case "ABC":
                System.out.println(numeros[0] + " " + numeros[1] + " " + numeros[2]);
                break;
            case "ACB":
                System.out.println(numeros[0] + " " + numeros[2] + " " + numeros[1]);
                break;
            case "BAC":
                System.out.println(numeros[1] + " " + numeros[0] + " " + numeros[2]);
                break;
            case "BCA":
                System.out.println(numeros[1] + " " + numeros[2] + " " + numeros[0]);
                break;
            case "CAB":
                System.out.println(numeros[2] + " " + numeros[0] + " " + numeros[1]);
                break;
            case "CBA":
                System.out.println(numeros[2] + " " + numeros[1] + " " + numeros[0]);
                break;
        }
    }
}