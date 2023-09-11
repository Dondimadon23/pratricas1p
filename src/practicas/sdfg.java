package practicas;
import java.util.Scanner;
import java.text.DecimalFormat;
public class sdfg {
	public static void main(String[] args) {
		        double B,H,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12;
		        double C,C1;
		        Scanner in=new Scanner(System.in);
		        B=in.nextDouble();
		        H=in.nextDouble();
		        a3=B*H;
		        a4=a3/2;
		        DecimalFormat df = new DecimalFormat("0.000");
		        System.out.println( df.format(a4));
}
}