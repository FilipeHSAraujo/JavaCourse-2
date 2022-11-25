import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	//variables
		int x;
		
		Scanner sc = new Scanner(System.in);
		
	//Program
		System.out.println("Verificador de numero par ou impar!!!!!!!");
		System.out.print("Digite um numero: ");
		x = sc.nextInt();

		if( x%2 == 0) {
			System.out.println("Numero Par.");
		}
		else {
			System.out.println("Numero Impar.");
		}
				
	}

}
