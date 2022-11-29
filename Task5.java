import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	//variables
		int order,quant;
		double checkout = 0;
		Scanner sc = new Scanner(System.in);
		
	//Program
		System.out.println("Bem Vindos ao MC'Bobs King !!!!!!!");
		System.out.println("Escolha o seu pedido de acordo com o numero");
		System.out.println("Escolha: 1: Hot Dog, 2:X-Salad, 3: X-Bacon, 4: Toast, 5: Soda.");
		System.out.print("Digite o numero do pedido: ");
		order = sc.nextInt();
		System.out.print("Digite a quantidade do pedido: ");
		quant = sc.nextInt();
				
		
		if(order == 1) {
			checkout = quant * 4;
		}
		else if(order == 2){
			checkout = quant * 4.50;
		}
		else if(order == 3){
			checkout = quant * 5;
		}
		else if(order == 4){
			checkout = quant * 2;
		}
		else if(order == 5){
			checkout = quant * 1.50;
		}
		
		
		System.out.printf("Voce escolheu %d e a quantidade foi %d, o total foi de R$%.2f", order,quant, checkout);
		
	}

}
