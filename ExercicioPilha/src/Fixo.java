import java.util.Scanner;

public class Fixo {
	
public static void main(String[] args) {

		System.out.println("Digite uma palavra:");
		Scanner teclado = new Scanner(System.in);
		String entrada = teclado.next();

		String Lista[] = entrada.split("");
	    String Inverter[] = new String[Lista.length];
	
        int posicao = Lista.length;
		for (int i = 0; i < Lista.length; i++) {
			 posicao--;
		Inverter[i] = Lista[posicao];
		}
		
		for (String valor : Inverter) {
			System.out.printf(valor);
		}
	}
}
