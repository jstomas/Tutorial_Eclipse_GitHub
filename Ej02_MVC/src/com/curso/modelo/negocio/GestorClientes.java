package com.curso.modelo.negocio;

import java.util.List;

import com.curso.modelo.entidad.Cliente;
import com.curso.modelo.persistencia.ClienteDAO;

public class GestorClientes {

	private ClienteDAO clienteDAO = new ClienteDAO();
	
	public void insertar(Cliente cliente){
		//Lógica de negocio
		//...
		
		clienteDAO.insertar(cliente);		
	}	
	
	public List<Cliente> listarTodos(){
		return clienteDAO.listarTodos();
	}

	public Cliente buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}







