package negocio;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GerenciadoraContasTest_Ex6 {

	@Test
	public void testTransferirValor() {
		//Criando uma lista de contas
		List<ContaCorrente> contasDoBanco = new ArrayList<>();
						
		//criando uma nova conta ativa
		ContaCorrente conta01 = new ContaCorrente(0, 1000, true);
		
		//criando uma nova conta inativa
		ContaCorrente conta02 = new ContaCorrente(1, 2000, true);
		
		//criando uma nova gerenciadora de conta corrente
		GerenciadoraContas gerContas = new GerenciadoraContas(contasDoBanco);
		
		//adicionando as contas na lista
		gerContas.adicionaConta(conta01);
		gerContas.adicionaConta(conta02);
		
		gerContas.transfereValor(0, 500, 1);
		
		assertThat(gerContas.pesquisaConta(0).getSaldo(), is( 500.0));
		assertThat(gerContas.pesquisaConta(1).getSaldo(), is( 2500.0));
		assertThat(gerContas.getContasDoBanco().size(), is(2));
	}

}
