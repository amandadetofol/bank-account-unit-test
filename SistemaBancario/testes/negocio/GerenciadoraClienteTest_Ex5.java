package negocio;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GerenciadoraClienteTest_Ex5 {

	@Test
	public void testLimpa() {
		// crio uma nova lista de clientes vazia
		List<Cliente> clientesDoBanco = new ArrayList<>();
				
		// crio novos clientes
		Cliente cliente01 = new Cliente(1, "Gustavo Farias", 31, "gugafarias@gmail.com", 1, true);
		Cliente cliente02 = new Cliente(2, "Felipe Augusto", 34, "felipeaugusto@gmail.com", 2, true);
						
		
		//crio uma gerenciadora de clientes
		GerenciadoraClientes gerClientes = new GerenciadoraClientes(clientesDoBanco);
		
		//adiciono os dois novos clientes
		gerClientes.adicionaCliente(cliente01);	
		gerClientes.adicionaCliente(cliente02);
		
		//limpo os clientes existentes na gerenciadora
		gerClientes.limpa();
				
		assertThat(gerClientes.getClientesDoBanco().size(), is(0));
	}

}
