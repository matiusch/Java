import java.util.Scanner;

public class Uri1012Resolucao {
	
	public static void main(String args[]) {
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		double a,b,c,triangulo, quadrado,trapezio,circulo,retangulo;
		
		
		a=teclado.nextDouble();
		b=teclado.nextDouble();
		c=teclado.nextDouble();
		
		 
		triangulo = (a*c)/2;
		circulo   = 3.14159*(c*c);
		trapezio  = ((a+b)*c)/2;
		quadrado  = b*b;
		retangulo = a*b;
		
		
		System.out.printf("TRIANGULO: %.3f\n",triangulo);
		System.out.printf("CIRCULO: %.3f\n",circulo);
		System.out.printf("TRAPEZIO: %.3f\n",trapezio);
		System.out.printf("QUADRADO: %.3f\n", quadrado);
		System.out.printf("RETANGULO: %.3f\n",retangulo);
		
		
		teclado.close();
		
	}

}
