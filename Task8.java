import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	//variables
		double money, tax;
		Scanner sc = new Scanner(System.in);
		
	//Program
		System.out.println("Imposto Calculator!!!!");
		System.out.print("Digite o valor do dinheiro: ");
		money = sc.nextDouble();


		if(money > 0 && money < 2000) {
			System.out.println("Sua quantia fica na zona isenta");
		}
		else if(money >2000.01 && money < 3000) {
			 tax = ((money * 8))/100;
			
			System.out.printf("Seu dinheiro fica na zona de 8 porcento do valor, total: R$%.2f", tax);
		}
		else if(money >3000.01 && money < 4500) {
			 tax = ((money * 18)/100);
			
			System.out.printf("Seu dinheiro fica na zona de 18 porcento do valor, total: R$%.2f", tax);
		}
		else if(money < 4500) {
			 tax = ((money * 28))/100;
			
			System.out.printf("Seu dinheiro fica na zona de 28 porcento do valor, total: R$%.2f", tax);
		}
		
		
	}

}
