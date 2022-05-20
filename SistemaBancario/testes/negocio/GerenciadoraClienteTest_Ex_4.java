package negocio;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GerenciadoraClienteTest_Ex_4 {

	@Test
	public void testGetClientesDoBanco() {
		
		// criando uma nova lista de clientes vazia
		List<Cliente> clientesDoBanco = new ArrayList<>();
		
		// criando novos clientes
		Cliente cliente01 = new Cliente(1, "Gustavo Farias", 31, "gugafarias@gmail.com", 1, true);
		Cliente cliente02 = new Cliente(2, "Felipe Augusto", 34, "felipeaugusto@gmail.com", 2, true);
				
		//criando uma gerenciadora de clientes
		GerenciadoraClientes gerClientes = new GerenciadoraClientes(clientesDoBanco);
		
		//adicionando clientes
		gerClientes.adicionaCliente(cliente01);	
		gerClientes.adicionaCliente(cliente02);
		
		assertThat(gerClientes.getClientesDoBanco().size(), is(2));
	}

}
