package negocio;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GerenciadoraClienteTest_Ex6 {

	@Test
	public void testPesquisaCliente() {
		
		//crio uma nova lista de clientes vazia
		List<Cliente> clientesDoBanco = new ArrayList<>();
						
		// crio novos clientes
		Cliente cliente01 = new Cliente(1, "Gustavo Farias", 31, "gugafarias@gmail.com", 1, true);
		Cliente cliente02 = new Cliente(2, "Felipe Augusto", 34, "felipeaugusto@gmail.com", 2, true);
								
		//crio uma gerenciadora de clientes
		GerenciadoraClientes gerClientes = new GerenciadoraClientes(clientesDoBanco);
		
		//adiciono clientes a gerenciadora
		gerClientes.adicionaCliente(cliente01);	
		gerClientes.adicionaCliente(cliente02);
		
		//pesquiso por um cliente na gerenciadora
		Cliente clientePesquisado = gerClientes.pesquisaCliente(1);
		
		assertThat(gerClientes.getClientesDoBanco().size(), is(2));
		assertThat(clientePesquisado.getEmail(), is("gugafarias@gmail.com"));
		assertThat(clientePesquisado.getNome(), is("Gustavo Farias"));
	}
}
