package factorial;



import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int num ;
		System.out.println("ingrese el numero");
		num = scan.nextInt();
		System.out.println("el factorial de "+ num + " es "+ Factorial(num));
		

	}
	public static double Factorial (int n) {
		int a = 1;
		try {
		for(int i =1; i<=n; i++) {
			a *=i;
			
		}
		
	

	}
	catch(InputMismatchException e) {
		System.out.println("Ingrese bien los datos");
	}
		return a;

}
	
}
