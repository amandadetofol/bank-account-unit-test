package negocio;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GerenciadoraContasTest_Ex5 {

	@Test
	public void testRemoveConta() {
		//Criando uma lista de contas
		List<ContaCorrente> contasDoBanco = new ArrayList<>();
						
		//criando uma nova conta ativa
		ContaCorrente conta01 = new ContaCorrente(0, 1.0000, true);
		
		//criando uma nova conta inativa
		ContaCorrente conta02 = new ContaCorrente(1, 2.0000, false);
		
		//criando uma nova gerenciadora de conta corrente
		GerenciadoraContas gerContas = new GerenciadoraContas(contasDoBanco);
		
		//adicionando as contas na lista
		gerContas.adicionaConta(conta01);
		gerContas.adicionaConta(conta02);
		
		//removo uma conta
		gerContas.removeConta(0);

		assertThat(gerContas.getContasDoBanco().size(), is(1));
}

}
