import java.util.Scanner;

public class Uri1043Resolucao {
	
	public static void main(String args[]) {
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		int linhas;
		linhas  = teclado.nextInt();
		
		for(int i=1;i<=linhas;i++) {
			System.out.println(i+" "+i*i +" "+i*i*i);
		}
		
		teclado.close();
		
	}

}
