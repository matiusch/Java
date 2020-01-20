package br.org.generation.webMotors.bd;

import java.util.ArrayList;

import br.org.generation.webMotors.model.Veiculo;



public class BDVeiculo {
	
private ArrayList< Veiculo> lista;
	
	public BDVeiculo() {
		lista = new ArrayList<Veiculo>();
	}
	
	public void gravar(Veiculo veiculo) {
		this.lista.add(veiculo);
		
	}
	public Veiculo buscar(int id) {
		Veiculo veiculo = null;
		for(Veiculo v:lista) {
			if(v.getId() == id) {
				veiculo = v;
				break;
			}
		}
		
		return veiculo;
	}
	
	public void atualizar(Veiculo veiculo) {
		
		int posicao=-1;
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i).getId() == veiculo.getId()) {
				posicao = i;
				break;
			}
		}
		
		if(posicao >=0) {
			lista.set(posicao, veiculo);
		}
		
	}
	
	public boolean apagar(int id) {
		int posicao=-1;
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i).getId() == id) {
				posicao = i;
				break;
			}
		}
		
		if(posicao>=0) {
			lista.remove(posicao);
			return true;
		}
		
		return false;
		
	}
	
	public ArrayList<Veiculo> buscarTodos(){
		return lista;
	}

}
