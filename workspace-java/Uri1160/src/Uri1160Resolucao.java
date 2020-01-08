import java.util.Scanner;
public class Uri1160Resolucao {
	
	public static void main(String args[]) {
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		
		int t = 1, anos;
		int PA,PB;
		double G1,G2;
		
		t = teclado.nextInt();
		
		String msg[] = new String[t];
		
		int cont =0;
		while (t>0) {
			PA = teclado.nextInt();
			PB = teclado.nextInt();
			G1 = teclado.nextDouble();
			G2 = teclado.nextDouble();
			
			anos=0;
			
			while(PA<=PB){
				
				PA = (int) (PA +(PA *(G1/100)));
				PB = (int)(PB +(PB *(G2/100)));
				
				anos++;
				
			}
			
			if(anos> 100) {
				msg[cont] = "Mais de 1 seculo. ";
				PA = PB + 1;
				
			}else {
				msg[cont]=(anos+" anos.");
			}
			
			t=t-1;
			cont++;
			
		}
		
		for(int i = 0; i<cont;i++) {
			System.out.println(msg[i]);
		}
		
	}

}
