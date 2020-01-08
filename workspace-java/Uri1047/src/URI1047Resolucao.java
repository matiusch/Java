import java.util.Scanner;

public class URI1047Resolucao {
	public static void main(String args[]) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		int horaInicial, minutoInicial, horaFinal, minutoFinal, duracaoHora,duracaoMinuto;
		
		horaInicial   = teclado.nextInt();
		minutoInicial = teclado.nextInt();
		horaFinal     = teclado.nextInt();
		minutoFinal   = teclado.nextInt();
		
		if(horaFinal>horaInicial && minutoFinal<minutoInicial) {
			duracaoHora = 0;
		}else if(minutoFinal<minutoInicial){
				duracaoHora = 23;
		}else if(horaFinal>horaInicial){
			duracaoHora  = horaFinal - horaInicial;
		}else {
			duracaoHora = (24 - horaInicial )+horaFinal;
		}
		
		
		if(minutoFinal>minutoInicial) {
			duracaoMinuto = minutoFinal-minutoInicial;
		}else if(minutoInicial == minutoFinal) {
			duracaoMinuto = 0;
		}else {
			duracaoMinuto = (60-minutoInicial)+minutoFinal;
		}
		
		
		System.out.println("O JOGO DUROU "+duracaoHora+" HORA(S) E "+duracaoMinuto+" MINUTO(S)");
		
		
		teclado.close();
	}
}
