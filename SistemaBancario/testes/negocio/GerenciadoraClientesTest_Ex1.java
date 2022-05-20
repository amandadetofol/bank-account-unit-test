package negocio;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

//EXEMPLO DO PROFESSOR
public class GerenciadoraClientesTest_Ex1 {

	@Test
	public void testPesquisaCliente() {

		//criando um novo cliente
		Cliente cliente01 = new Cliente(1, "Gustavo Farias", 31, "gugafarias@gmail.com", 1, true);
		
		//criando uma lista de clientes do banco e adicionando um cliente
		List<Cliente> clientesDoBanco = new ArrayList<>();
		clientesDoBanco.add(cliente01);
		
		//criando uma gerenciadora de clientes
		GerenciadoraClientes gerClientes = new GerenciadoraClientes(clientesDoBanco);
		
		//pesquisando um cliente através da gerenciadora 
		Cliente cliente = gerClientes.pesquisaCliente(1);
		
		assertThat(gerClientes.getClientesDoBanco().size(), is(1));
		assertThat(cliente.getEmail(), is("gugafarias@gmail.com"));	
	}

}
