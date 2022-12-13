import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	//variables
		double x,y;
		Scanner sc = new Scanner(System.in);
		
	//Program
		System.out.println("Identificador carteziano !!!!");
		System.out.print("Digite o valor de X: ");
		x = sc.nextDouble();
		System.out.print("Digite o valor de Y: ");
		y = sc.nextDouble();
		
		
		
	   if( x < 0 && y > 0) {
		 System.out.println("Coordenada se encontra no Q2");
	   }
	   else if(x < 0 && y < 0){
	     System.out.println("Coordenada se encontra no Q3");
	   }
	   else if(x > 0 && y > 0) {
		 System.out.println("Coordenada se encontra no Q1");
	   }
	   else if(x > 0 && y < 0) {
		 System.out.println("Coordenada se encontra no Q4");
	   }
	   else {
		 System.out.println("Coordenada se encontra no 0");
	   }
	   
	   
	   /*      Diagram:
	    * 
	    *          Y
	    *       Q2 | Q1
	    *      _________ X
	    * 
	    *       Q3 | Q4 
	    */
	   
	   
	}

}
