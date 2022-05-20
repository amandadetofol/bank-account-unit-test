package negocio;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GerenciadoraClientesTest_Ex8 {

	@Test
	public void testValidaIdade() throws IdadeNaoPermitidaException {
		
		//criando uma lista de clientes vazia
		List<Cliente> clientesDoBanco = new ArrayList<>();
		
		//criando novos clientes
		Cliente cliente01 = new Cliente(1, "Gustavo Farias", 11, "gugafarias@gmail.com", 1, true);
		Cliente cliente02 = new Cliente(2, "Felipe Augusto", 18, "felipeaugusto@gmail.com", 2, true);
								
		//criando uma gerenciadora de clientes			
		GerenciadoraClientes gerClientes = new GerenciadoraClientes(clientesDoBanco);
		
		//adicionando novos clientes 
		gerClientes.adicionaCliente(cliente01);	
		gerClientes.adicionaCliente(cliente02);
		
		assertThat(gerClientes.validaIdade(cliente02.getIdade()), is(true));
	}

}
