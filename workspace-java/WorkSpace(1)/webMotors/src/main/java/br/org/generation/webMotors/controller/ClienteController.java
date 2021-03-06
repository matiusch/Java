package br.org.generation.webMotors.controller;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.webMotors.bd.BDCliente;
import br.org.generation.webMotors.model.Cliente;

@RestController
public class ClienteController {

	
	
	/*@GetMapping("/cliente/teste")
	public Cliente testeCliente(){
		
		Cliente cliente = new Cliente();
		
		cliente.setId(1);
		cliente.setNome("Cleiton Marques Machado");
		cliente.setEmail("cleiton.contato2210@gmail.com");
		cliente.setCpf("111.111.111-11");
		cliente.setDataNasc("02/09/1998");
		cliente.setTelefone("(11)33333-3333");
		
		return cliente;
	}*/
	
	
	private BDCliente  bd = new BDCliente();
	
	@PostMapping("/cliente/novo")
	public  ResponseEntity<Cliente> novoCliente(@RequestBody  Cliente cliente) {
		bd.gravar(cliente);
		return ResponseEntity.ok(cliente);
		
	}
	
	
	@GetMapping("/cliente/{id}")
	public ResponseEntity<Cliente> getCliente(@PathVariable int id){
		Cliente cli =bd.buscar(id);
		
		if(cli !=null) {
			return ResponseEntity.ok(cli);
		}else {
			return ResponseEntity.notFound().build();
		}
		
	}
	
	@GetMapping("/cliente/todos")
	public ResponseEntity<ArrayList<Cliente>> getTodos(){
		return ResponseEntity.ok(bd.buscarTodos());
	}
	
	@PutMapping("/cliente/atualizar")
	public ResponseEntity<String> alterarCliente(@RequestBody Cliente cliente){
		
		bd.atualizar(cliente);
		return ResponseEntity.ok("Success");
		
	}
	
	@DeleteMapping("/cliente/delete/{id}")
	
	public ResponseEntity<String> deletarCliente(@PathVariable int id){
		if (bd.apagar(id)) {
			return ResponseEntity.ok("DELETED");
		}
		else {
			return ResponseEntity.notFound().build();
		}
		
	}
	
	
	
}
