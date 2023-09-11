package practicas;
import java.util.Scanner;
public class dfh {

	public static void main(String[] args) {
		
		         Scanner in=new Scanner(System.in);
		         int h=in.nextInt();
		         int numeros[]=new int[h];
		         for(int i=0;i<h;i++){
		             numeros[i]=in.nextInt();
		         }
		         int nq=in.nextInt();
		         int u=nq;
		         for(u=nq;u<h;u++){
		             System.out.print(numeros[u]+" ");
		         }
		     }
		     
		 
	}


