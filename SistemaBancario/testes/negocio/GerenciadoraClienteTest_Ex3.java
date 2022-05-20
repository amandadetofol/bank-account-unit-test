package negocio;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GerenciadoraClienteTest_Ex3 {

	@Test
	public void testClienteAtivo() {
		//crio um  novo cliente ativo
		Cliente cliente01 = new Cliente(1, "Gustavo Farias", 31, "gugafarias@gmail.com", 1, true);
		
		//crio um novo cliente inativo
		Cliente cliente02 = new Cliente(2, "Felipe Augusto", 34, "felipeaugusto@gmail.com", 2, false);
		
		assertThat(cliente01.isAtivo(), is(true));
		assertThat(cliente02.isAtivo(), is(false));
	}

}
