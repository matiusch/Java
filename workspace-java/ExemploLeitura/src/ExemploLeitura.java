
import java.util.Scanner;

public class ExemploLeitura {
	
	public static void main(String args[]) {
		
		Scanner teclado;
		
		teclado = new Scanner(System.in);
		
		int a;
		float b;
		String texto;
		
		System.out.println("Digite o nome");
		texto=teclado.nextLine();
		System.out.println("Digite  um valor inteiro:");
		a=teclado.nextInt();
		System.out.println("Digite um valor real:");
		b=teclado.nextFloat();
		
		System.out.println("voc� digitou os valores "+a+" e "+b);
		System.out.println("o nome � "+texto);
		
		teclado.close();
		
	}

}