<%@ page language="java" 
    contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="com.curso.modelo.entidad.Cliente, java.util.List"
	%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1 align="center">
		<font color="lightGreen">
			Listado de clientes
		</font>
	</h1>
	
	<form action="SVClientes" method="get">
		<p align="center">
			<input type="submit" name="accion" value="Nuevo"/>
		</p>	
	</form>
	
	<table align="center" border="1">
		<tr>
			<th>Nombre</th>
			<th>Dirección</th>
			<th>Teléfono</th>
		</tr>
		<%
		//Scriptlet
		List<Cliente> clientes = (List<Cliente>)request.getAttribute("listaClientes");
		for(Cliente c: clientes){
			%>			
			<tr>
				<td><%out.println(c.getNombre());%></td>
				<td><%=c.getDireccion()%></td>
				<td><%=c.getTelefono()%></td>
			</tr>			
			<%
		}
		%>
	</table>

</body>
</html>









