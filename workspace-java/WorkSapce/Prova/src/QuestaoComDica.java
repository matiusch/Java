
public class QuestaoComDica extends QuestaoSimples {
	
	
	private String dica;
	
	public QuestaoComDica(String enunciado, String resposta, int numeroQuestao,String dica ) {
		super (enunciado,resposta,numeroQuestao);
		this.dica = dica;
	}
	
	
	@Override
	public String AplicarQuestao() {
		
		String enunciadoFinal  = "Questão n°"+ this.numeroQuestao+" :\n"+super.Enunciado+"\n";
			   enunciadoFinal += "Dica:"+this.dica;
			   
       return enunciadoFinal;
	}


	public String getDica() {
		return dica;
	}


	public void setDica(String dica) {
		this.dica = dica;
	}
	

}
