package practicas;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main (String[]args){
        double x,y,z,r1,r2,r3 = 0,r4,r5,r6;
        Scanner in=new Scanner(System.in);
        x=in.nextDouble();
        y=in.nextDouble();
        z=in.nextDouble();
        r1=((x*2)+y)/z;
        r4=r3+x*x+z*z;
        r2=Math.pow(y,3);
        r2=r2-z;
        r3=(x+2*y+3*z)/(z-2*y-3*x);
        r5=r1*r2;
        r6=r5/r4;
        DecimalFormat df = new DecimalFormat("#.######");
        System.out.println(df.format(r6));
	}

}
