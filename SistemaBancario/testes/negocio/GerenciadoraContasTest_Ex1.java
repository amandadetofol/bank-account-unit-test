package negocio;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GerenciadoraContasTest_Ex1 {

	@Test
	public void testAdicionaConta() {
		//Criando uma lista de contas
		List<ContaCorrente> contasDoBanco = new ArrayList<>();
		
		//criando uma nova conta
		ContaCorrente conta01 = new ContaCorrente(0, 1.0000, true);
		
		//criando uma nova gerenciadora de conta corrente
		GerenciadoraContas gerContas = new GerenciadoraContas(contasDoBanco);
		
		//adicionando a conta na lista
		gerContas.adicionaConta(conta01);
		
		assertThat(gerContas.getContasDoBanco().size(), is(1));
	}

}
