import java.util.Scanner;
public class AppProva {
	
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		
		
		
		QuestaoSimples q[]  = new QuestaoSimples[6];
		
		
		
		q[0] = new QuestaoSimples("De quem � a famosa frase �Penso, logo existo�?","Descartes",1);
		q[1] = new QuestaoSimples("Quantas casas decimais tem o n�mero pi?","Trilhares",2);
		
		q[2] = new QuestaoMultipla("Quais os principais autores do Barroco no Brasil","Greg�rio de Matos, Bento Teixeira e Manuel Botelho de Oliveira",3,"Greg�rio de Matos, Bento Teixeira e Manuel Botelho de Oliveira","Miguel de Cervantes, Greg�rio de Matos e Danthe Alighieri","Padre Ant�nio Vieira, Padre Manuel de Melo e Greg�rio de Matos","Castro Alves, Bento Teixeira e Manuel Botelho de Oliveira");
		q[3] = new QuestaoMultipla("Quanto tempo a luz do Sol demora para chegar � Terra?","8 minutos",4,"12 minutos","1 dia","12 horas","8 minutos");
		
		q[4] = new QuestaoComDica("Qual foi o recurso utilizado inicialmente pelo homem para explicar a origem das coisas?","mitologia",5,"conjunto dos mitos de determinado povo.");
		q[5] = new QuestaoComDica("Qual a religi�o monote�sta que conta com o maior n�mero de adeptos no mundo?","cristianismo",6,"Na Inglaterra foi encontrado por volta do s�culo XII na forma Christian");
		 
		
		int quantidadeAcerto = 0;
		int quantidadeErro   = 0;
		
		for(int i =0;i<q.length;i++) {
			System.out.println(q[i].AplicarQuestao());
			String Resp = teclado.nextLine();
			
			if(q[i].Corrigir(Resp)) {
				System.out.println("Resposta Correta.Parab�ns!!\n\n");
				quantidadeAcerto++;
			}else {
				System.out.println("Resposta incorreta");
				System.out.println("A resposta correta � "+q[i].getResposta()+"\n\n");
				quantidadeErro++;
			}
		}
			
		System.out.println(quantidadeAcerto+"\n");
		System.out.println(quantidadeErro+"\n");
		
		
		teclado.close();
	}
	

}
