import java.util.Scanner;
public class lojinha {
	
	public static void main(String args[]) {
		
		produto lista[] = new produto[5];
		int posicao;
		Scanner teclado = new Scanner(System.in) ;
		posicao = 0;
		
		do {
			try {
				
				System.out.println("----posicao"+posicao);
				produto p = new produto();
				System.out.println("Digite o ID do produto");
				int id = Integer.parseInt(teclado.nextLine());
				p.setId(id);
				
			
				System.out.println("Digite o nome do produto");
				String nome =teclado.nextLine();
				p.setNome(nome);
				
			
				System.out.println("Digite os detalhes do produto");
				String detalhes = teclado.nextLine();
				p.setDetalhes(detalhes);
				
			
				System.out.println("Digite o preço do produto");
				float preco =Float.parseFloat(teclado.nextLine());
				p.setPreco(preco);
				
			
				System.out.println("Digite a quantidade do produto");
				float qtdeEstoque = Float.parseFloat(teclado.nextLine());
				p.setQtdeEstoque(qtdeEstoque);
				
				posicao++;
				
			}catch(Exception e){
				System.out.println("-----> Ops..erro ao  cadastrar"+e.getMessage());
			}
			
		}while(posicao<5);
		
		
		for(int i=0;i<5;i++) {
			lista[i].info();
		}
		
	}

}
