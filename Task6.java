import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	//variables
		double number;
		Scanner sc = new Scanner(System.in);
		
	//Program
		System.out.println("Bem Vindos ao intervalo numerico !!!!");
		System.out.print("Digite um numero: ");
		number = sc.nextDouble();
		
		if (number < 0.0 || number > 100.0) {
			System.out.println("Fora de intervalo");
		}
		else if (number <= 25.0) {
			System.out.println("Intervalo [0,25]");
		}
		else if (number <= 50.0) {
			System.out.println("Intervalo (25,50]");
		}
		else if (number <= 75.0) {
			System.out.println("Intervalo (50,75]");
		}		
		else {
			System.out.println("Intervalo (75,100]");
		}
		
		
	}

}
