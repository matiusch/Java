
public class produto {
	private int id;
	private String nome;
	private String detalhes;
	private float preco;
	private float qtdeEstoque;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		
		if(id<=0) {
			throw new RuntimeException("Id n�o pode ser menor que zero");
		}
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		
		if(nome==null || nome.length() == 0) {
			throw new RuntimeException("o campo nome deve ser informado");
		}
		
		this.nome = nome;
	}
	public String getDetalhes() {
		return detalhes;
	}
	public void setDetalhes(String detalhes) {
		
		if(detalhes==null || detalhes.length() == 0) {
			throw new RuntimeException("o campo detalhes deve ser informado");
		}
		this.detalhes = detalhes;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		
		if(preco <= 0) {
			
			throw new RuntimeException("o campo detalhes deve ser informado");
		}
		this.preco = preco;
	}
	public float getQtdeEstoque() {
		return qtdeEstoque;
	}
	public void setQtdeEstoque(float qtdeEstoque) {
		
		if(qtdeEstoque <= 0) {
			throw new RuntimeException("o campo detalhes deve ser informado");
		}
		this.qtdeEstoque = qtdeEstoque;
	}
	
	public void info() {
		System.out.println("O id do produto �: "+this.id);
		System.out.println("O nome do produto �: "+this.nome);
		System.out.println("O detalhe do produto �: "+this.detalhes);
		System.out.println("O pre�o  do produto �: "+this.preco);
		System.out.println("A quantidade em estoque �: "+this.qtdeEstoque);
	}
	

}
