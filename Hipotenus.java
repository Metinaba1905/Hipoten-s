import java.util.Scanner;

public class Hipotenus {

	public static void main(String[] args) {

		int a ,b,c;
       Scanner girdi= new Scanner(System.in);
       System.out.print("1. say�y� giriniz :");
       a= girdi.nextInt();
       
       System.out.print("2. say�y� giriniz :");
       b=girdi.nextInt();
       
       System.out.print("3. say�y� giriniz :");
       c= girdi.nextInt();
       
       double u = (a+b+c)/2;
       System.out.println(u);
       double alan = u*(u-a)*(u-b)*(u-c);
       System.out.println(alan);
	}

}
