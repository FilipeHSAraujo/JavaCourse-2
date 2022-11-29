import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	//variables
		int x,y,z;
		
		Scanner sc = new Scanner(System.in);
		
	//Program
		System.out.println("Verificador de Durcao de horas!!!!!!!");
		System.out.print("Digite o horario de inicio da partida: ");
		x = sc.nextInt();
		System.out.print("Digite o horario de termino da partida: ");
		y = sc.nextInt();
				
		if(x < y ) {
			z = y - x;
			System.out.printf("O jogo durou %d Horas", z);
		}
		else {
			z = 24 - x + y;
			System.out.printf("O jogo durou %d Horas", z);
		}
				
	}

}
