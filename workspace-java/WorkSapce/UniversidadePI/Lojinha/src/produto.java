
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
			throw new RuntimeException("Id não pode ser menor que zero");
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
		System.out.println("O id do produto é: "+this.id);
		System.out.println("O nome do produto é: "+this.nome);
		System.out.println("O detalhe do produto é: "+this.detalhes);
		System.out.println("O preço  do produto é: "+this.preco);
		System.out.println("A quantidade em estoque é: "+this.qtdeEstoque);
	}
	

}
