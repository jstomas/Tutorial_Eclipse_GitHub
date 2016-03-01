package com.curso.controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.curso.modelo.entidad.Cliente;
import com.curso.modelo.negocio.GestorClientes;

@WebServlet("/SVClientes")
public class SVClientes extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private GestorClientes gestorClientes = new GestorClientes();
	
    public SVClientes() {
        super();
    }

    //mostrarListado
    //mostrarFormulario
    //mostrarFormulario (seleccionar)
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String accion = request.getParameter("accion");
		if(accion == null)
			accion = "";
		
		String siguienteVista = null;
		switch(accion){
		
			case "Nuevo"       : siguienteVista = "formularioClientes.jsp";
				                 break;
				                 
			case "Seleccionar" : Integer id = Integer.parseInt(request.getParameter("idCliente"));
								 Cliente clienteSel = gestorClientes.buscar(id);
								 request.setAttribute("clienteSeleccionado", clienteSel);
								 siguienteVista = "formularioClientes.jsp";
		                         break;
		                         
		    default : siguienteVista = "listadoClientes.jsp";
		    		  List<Cliente> clientes = gestorClientes.listarTodos();
		    		  request.setAttribute("listaClientes", clientes);		
		}
		
		request.getRequestDispatcher(siguienteVista).forward(request, response);
	}

	//Insertar
	//Modificar
	//borrar
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Los parámetros que llegan con la peticion se recogen como String
		String nombre    = request.getParameter("nombre");
		String direccion = request.getParameter("direccion");
		String telefono  = request.getParameter("telefono");
		
		//Transformamos los parámetros en objetos del modelo
		Cliente cliente = new Cliente(null,nombre,direccion,telefono);
		
		//Averiguamos que nos piden
		String accion    = request.getParameter("accion");
		
		switch(accion){
			case "Insertar"  : gestorClientes.insertar(cliente);
							   break;
			case "Modificar" :
				  			   break;
			case "Borrar"    :
				  			   break;
		}
		
		
	}

}




















