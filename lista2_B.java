import java.util.Scanner;
public class lista2_B {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite o primeiro numero \n");
		float number1 = sc.nextFloat();
		System.out.printf("Digite o segundo numbero\n");
		float number2 = sc.nextFloat();
		System.out.printf("Digite o terceiro numbero\n");
		float number3 = sc.nextFloat();
		
		if(number1 > number2 && number1 > number3){
			System.out.printf("O maior numero é %f", number1);
		}if(number2 > number3 && number2 > number1){
			System.out.printf("O maior numero é %f", number2);
		}else {
			System.out.printf("O maior numero é %.2f", number3);
		}
	}
}

