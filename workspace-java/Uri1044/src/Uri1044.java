import java.util.Scanner;

public class Uri1044 {
	
	public static void main(String args[]) {
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		int a,b;
		
		a = teclado.nextInt();
		b = teclado.nextInt();
		
		if(a%b == 0 || b%a == 0) {
			System.out.println("Sao Multiplos");
		}else {
			System.out.println("Nao sao Multiplos");
		}
		
		
		teclado.close();
		
		
	}

}
