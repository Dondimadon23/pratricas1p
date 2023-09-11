package practicas;
import java.util.Scanner;
public class dfhs {

	public static void main(String[] args) {
		
		
		         Scanner scanner = new Scanner(System.in);
		     int opcion = 0;
		     int a, b,altur, n;
		     do {
		       System.out.println("1. Hola Mundo");
		       System.out.println("2. Mayor Edad");
		       System.out.println("3. Suma");
		       System.out.println("4. Linea");
		       System.out.println("5. cuadrado");
		       System.out.println("6. triangulo");
		       System.out.println("7. rectangulo");
		       System.out.println("8. cuafrado 2");
		       System.out.println("9.rombo");
		       System.out.println("10. salir");
		       System.out.println("Elige opcion?");
		       opcion = scanner.nextInt();
		       switch (opcion) {
		         case 1:
		           System.out.println("Hola Mundo");
		           break;
		         case 2:
		           System.out.println("Mayor de Edad");
		           int edad = scanner.nextInt();
		           String msjEdad = (edad >= 18) ? "ADULTO" : "MENOR DE EDAD";
		           System.out.println(msjEdad);
		           break;
		         case 3:
		           System.out.println("Suma");
		           a = scanner.nextInt();
		           b = scanner.nextInt();
		           int suma = a + b;
		           System.out.println(suma);
		           String msjSuma = (suma % 2 == 0) ? "PAR" : "IMPAR";
		           System.out.println(msjSuma);
		           break;
		         case 4:
		           System.out.println("Linea");
		           n = scanner.nextInt();
		           for (int i = 0; i < n; i++) {
		             System.out.print("* ");
		           }
		           System.out.println();
		           break;
		         case 5:
		           System.out.println("cuadrado");
		           int c = scanner.nextInt();
		           for (int i = 0; i < c; i++) {
		             for (int j = 0; j < c; j++) {
		               System.out.print("* ");
		             }
		             System.out.println();
		           }
		           break;
		         case 6:
		           System.out.println("triángulo");
		           int al = scanner.nextInt();
		           for (int i = 0; i < al; i++) {
		             for (int j = al - i; j > 1; j--) {
		               System.out.print(" ");
		             }
		             for (int j = 0; j <= i; j++) {
		               System.out.print("* ");
		             }
		             System.out.println();
		           }
		           break;
		         case 7:
		           System.out.println("rectangulo");
		           int d = scanner.nextInt();
		           int s = scanner.nextInt();
		           for (int i = 0; i < d; i++) {
		             for (int j = 0; j < s; j++) {
		               System.out.print("* ");
		             }
		             System.out.println();
		           }
		           break;
		         case 8:
		           System.out.println("cuadrado 2");
		           int lado = scanner.nextInt();
		           for (int i = 0; i < lado; i++) {
		             for (int j = 0; j < lado; j++) {
		               if (i == 0 || i == lado - 1 || j == 0 || j == lado - 1) {
		                 System.out.print("* ");
		               } else {
		                 System.out.print(" ");
		               }
		             }
		             System.out.println();
		           }
		           break;
		         case 9:
		           System.out.println("rombo");
		 int mitad = scanner.nextInt();

		         // Imprimir la mitad superior del rombo
		         for (int i = 1; i <= mitad; i++) {
		             for (int j = 1; j <= mitad - i; j++) {
		                 System.out.print(" ");
		             }
		             for (int j = 1; j <= 2 * i - 1; j++) {
		                 System.out.print("*");
		             }
		             System.out.println();
		         }

		         // Imprimir la mitad inferior del rombo
		         for (int i = mitad - 1; i >= 1; i--) {
		             for (int j = 1; j <= mitad - i; j++) {
		                 System.out.print(" ");
		             }
		             for (int j = 1; j <= 2 * i - 1; j++) {
		                 System.out.print("*");
		             }
		             System.out.println();
		         }
		           
		           break;
		         case 10:
		           System.out.println("Adiós");
		           break;
		         default:
		           System.out.println("Opción no válida");
		           break;
		       }
		     } while (opcion != 10);
		     System.out.println("Hasta la vista baby");
		   }
		 }

	
