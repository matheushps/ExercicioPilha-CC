import java.util.Scanner;

public class Fixo {
	
	public static void main(String[] args) {
		String Lista[] = new String [10];
		int posicao = Lista.length;
		for (int i = 0; i < Lista.length; i++) {
		posicao--;
		System.out.println("Digite um valor:");
		Scanner teclado = new Scanner(System.in);
		Lista[posicao] = teclado.next();
		}
		  for (String valor : Lista) {
		 System.out.println(valor); 
		}
		}

}
