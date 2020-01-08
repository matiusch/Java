import java.util.Scanner;

public class Uri1060Resolucao {
	
	public static void main(String args[]) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		int qtde =0;
		
		
		for(int i=0;i<6;i++) {
			
			double numero;
			
			numero = teclado.nextDouble();
			
			if(numero>0) {
				qtde++;
			}
		}
		
		  System.out.println(qtde+" valores positivos");
		
		
		teclado.close();
		
	}

}
