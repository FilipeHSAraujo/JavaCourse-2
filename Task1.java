import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	//variables
		int x;
		
		Scanner sc = new Scanner(System.in);
		
	//Program
		System.out.println("Verificador de numero negativo!!!!!!!");
		System.out.print("Digite um numero: ");
		x = sc.nextInt();

		if( x >= 0) {
			System.out.println("Numero Nao Negativo.");
		}
		else {
			System.out.println("Numero Negativo.");
		}
				
	}

}
