import java.util.Scanner;

public class Lista2_C {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite sua primeira nota:");
		float nota1 = sc.nextFloat();
		System.out.printf("Digite sua segunda nota:");
		float nota2 = sc.nextFloat();
		System.out.printf("Digite sua terceira nota:");
		float nota3 = sc.nextFloat();
		
		float media = (nota1 + nota2 + nota3) / 3;
		
		if(nota1 >= 0 && nota1 <=10){
		}
		if(nota2 >= 0 && nota2 <=10){
		}
		if(nota3 >= 0 && nota3 <=10){
			System.out.printf("Sua media é de: %.1f", media);
		}else{
			System.out.printf("Nao foi possivel calcular sua nota");
		}
	}
}

