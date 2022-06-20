import java.util.Scanner;

public class Hipotenus {

	public static void main(String[] args) {

		int a ,b,c;
       Scanner girdi= new Scanner(System.in);
       System.out.print("1. sayýyý giriniz :");
       a= girdi.nextInt();
       
       System.out.print("2. sayýyý giriniz :");
       b=girdi.nextInt();
       
       System.out.print("3. sayýyý giriniz :");
       c= girdi.nextInt();
       
       double u = (a+b+c)/2;
       System.out.println(u);
       double alan = u*(u-a)*(u-b)*(u-c);
       System.out.println(alan);
	}

}
