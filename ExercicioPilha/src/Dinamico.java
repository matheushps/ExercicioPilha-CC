import java.util.Scanner;

public class Dinamico {
 public static void main(String[] args) {
	
	 
	DinamicoLista lista = new DinamicoLista();
	Scanner teclado = new Scanner(System.in);
	System.out.println("Digite uma palavra:");
	String entrada = teclado.next();
	String Lista[] = entrada.split("");
	
	for (int i = 0; i < entrada.length(); i++) {
		adicionar(Lista[i], lista);
	}	
	inverter(lista);

}

public static void adicionar(String valor, DinamicoLista lista) {
	if (lista.proximo == null){
		DinamicoLista item = new DinamicoLista();
		item.valor = valor;
		lista.proximo = item;
	}
    else {
		if (lista.proximo !=null){
			adicionar(valor, lista.proximo);
		}
	}
	
}
	public static void inverter(DinamicoLista lista){
		if (lista.proximo !=null){
			inverter(lista.proximo);
		}
		System.out.println(lista.valor);
	}
}
