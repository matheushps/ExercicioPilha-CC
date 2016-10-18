import java.util.Scanner;

public class Dinamico {
 public static void main(String[] args) {
	
	 
	DinamicoLista lista = new DinamicoLista();
	int quantidade;
	Scanner teclado = new Scanner(System.in);
	System.out.println("Digite a quantidade a ser empilhada:");
	quantidade = teclado.nextInt();
	
	for (int i = quantidade; i < lista.indice; i++) {
	System.out.println("Digite um valor:");
	lista.valor = teclado.next();
	lista.indice++;
	}
}
}
