import java.util.Scanner;

public class lista2_A{
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite um número:");
		float numero = sc.nextFloat();
		
		for(float i=1;i<=10;i++){
			float tabuada = numero * i;
			System.out.printf("A tabuada é: %.2f \n", tabuada);
		}
	}
}

