import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	//variables
		int x, y;
		
		Scanner sc = new Scanner(System.in);
		
	//Program
		System.out.println("Verificador de multiplos!!!!!!!");
		System.out.print("Digite um numero: ");
		x = sc.nextInt();
		System.out.print("Digite um numero: ");
		y = sc.nextInt();

		if( x%y == 0 || y%x == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos.");
		}
				
	}

}
