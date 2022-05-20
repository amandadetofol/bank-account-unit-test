package negocio;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class GerenciadoraClienteTest_Ex2 {

	@Test
	public void testAdicionaCliente() {
		
		// criando novos clientes
		Cliente cliente01 = new Cliente(1, "Gustavo Farias", 31, "gugafarias@gmail.com", 1, true);
		Cliente cliente02 = new Cliente(2, "Felipe Augusto", 34, "felipeaugusto@gmail.com", 2, true);
		
		//criando uma nova lista de clientes vazia
		List<Cliente> clientesDoBanco = new ArrayList<>();
		
		//adiciono um novo cliente a lista
		clientesDoBanco.add(cliente01);
		
		//crio uma gerenciadora de clientes
		GerenciadoraClientes gerenciadoraClientes = new GerenciadoraClientes(clientesDoBanco);
		
		//adiciono um novo cliente na gerenciadora de clientes 
		gerenciadoraClientes.adicionaCliente(cliente02);
		
		assertThat(gerenciadoraClientes.getClientesDoBanco().size(), is(2));
		
	}

}
