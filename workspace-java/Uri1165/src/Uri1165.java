import java.util.Scanner;
public class Uri1165 {
	
	public static void main(String args[]) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		int quantidade, soma;
		soma = 0;

		quantidade = teclado.nextInt();
		int numero[] = new int[quantidade];

		for (int i = 0; i < quantidade; i++) {

			numero[i] = teclado.nextInt();
			
			if((numero[i]%2 != 0 && numero[i]%3 != 0)||(numero[i]%-2 !=0 && numero[i]%-3 != 0)) {
				System.out.println("primo");
			}else {
				System.out.println("não é primo");
			}

		}
	
		
		
		
		
		
		
		teclado.close();
	}

}
