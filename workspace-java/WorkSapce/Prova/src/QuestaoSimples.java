
public class QuestaoSimples  {
	protected int numeroQuestao;
	protected String Enunciado;
	protected String Resposta;
	
	public QuestaoSimples(String enunciado, String resposta,int numeroQuestao) {
		this.Resposta      = resposta;
		this.Enunciado     = enunciado;
		this.numeroQuestao = numeroQuestao;
	}
	
	public String AplicarQuestao() {
		
		String EnunciadoFinal = "Questão n°"+ this.numeroQuestao+" :\n"+this.Enunciado;
		return EnunciadoFinal;
		
	}
	
	public boolean Corrigir(String Resposta) {
		
		if(this.Resposta.equals(Resposta)){
			return true;
		}else {
			return false;
		}
		
	}

	public String getEnunciado() {
		return Enunciado;
	}

	public void setEnunciado(String enunciado) {
		Enunciado = enunciado;
	}

	public String getResposta() {
		return Resposta;
	}

	public void setResposta(String resposta) {
		Resposta = resposta;
	}
	
}
