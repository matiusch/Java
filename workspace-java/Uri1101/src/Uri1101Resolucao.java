import java.util.Scanner;

public class Uri1101Resolucao {
	
    public static void main(String args[]) {
    	
    	Scanner teclado;
    	teclado = new Scanner(System.in);
    	
    	int maior, menor;
    	
    	while(((maior= teclado.nextInt())>0) && ((menor = teclado.nextInt())>0)){
    		int resultado = 0;
    		
    		if(maior > menor) {
    			for(menor = menor;maior>=menor;menor++) {
    				resultado += menor;
    				System.out.printf(menor+" "); 
    			}
    			System.out.println("Sum="+resultado);
    		}else {
    			for(maior = maior;maior<=menor;maior++) {
    				
    				resultado += maior;
    				System.out.printf(maior+" "); 
    			}
    			System.out.println("Sum="+resultado);
    		}
    	}
    	
    	
    	teclado.close();
    	
    }
}

