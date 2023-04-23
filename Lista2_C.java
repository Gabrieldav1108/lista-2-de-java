import java.util.Scanner;

public class Lista2_C {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
        
        double[] notas = new double[3];
        int quantidade_notas_validas = 0;
        double soma_notas_validas = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite a nota " + (i+1) + ": ");
            double nota = sc.nextDouble();
            if (nota >= 0 && nota <= 10) {
                notas[quantidade_notas_validas] = nota;
                quantidade_notas_validas++;
                soma_notas_validas += nota;
            }
        }

        if (quantidade_notas_validas == 0) {
            System.out.println("Não foram digitadas notas válidas.");
        } else {
            double media = soma_notas_validas / quantidade_notas_validas;
            System.out.printf("Foram lidas %d notas e a média é %.2f.", quantidade_notas_validas, media);
        }
    }
}

