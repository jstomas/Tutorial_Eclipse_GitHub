package com.curso.modelo.persistencia;

import java.util.ArrayList;
import java.util.List;

import com.curso.modelo.entidad.Cliente;

public class ClienteDAO {

	private static List<Cliente> clientes = new ArrayList<Cliente>();

	//Inicializador estático
	static{
		clientes = new ArrayList<Cliente>();
		clientes.add(new Cliente(1,"N1","D1","T1"));
		clientes.add(new Cliente(2,"N2","D2","T2"));
		clientes.add(new Cliente(3,"N3","D3","T3"));
		clientes.add(new Cliente(4,"N4","D4","T4"));
		clientes.add(new Cliente(5,"N5","D5","T5"));
	}
	
	public void insertar(Cliente cliente){
		//generar el id...
		clientes.add(cliente);
		System.out.println(clientes);
	}
	
	public List<Cliente> listarTodos(){
		return clientes;
	}	
	
}
















