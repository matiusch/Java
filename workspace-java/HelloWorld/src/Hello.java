/**
 * Classe Hello
 * 
 * @author Generation
 *
 */
public class Hello {

	public static void main(String args[]) {
		float salarioMin, qtdeKw;

		salarioMin = Float.parseFloat(args[0]);
		qtdeKw = Float.parseFloat(args[1]);

		float valorKW = salarioMin / 700;
		float valorTotal = qtdeKw * valorKW;
		float desc = valorTotal - (valorTotal * 10) / 100;

		System.out.println("De acordo com seu salário de "+salarioMin+", cada quilowatt consumido sera cobrado: R$" + valorKW);
		System.out.println("O valor da sua conta será: R$" + valorTotal + ". Tendo em vista seu consumo de " + qtdeKw);
		System.out.println("Com o desconto de 10%, o valor será de: R$" + desc);
	}

}
