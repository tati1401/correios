package correios.cucumber.steps;

import correios.cucumber.config.InicializarTeste;
import correios.cucumber.pages.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;

public class ConsultaCepTeste{

	HomePage home = new HomePage();
	
	
	@Before
	public void iniciarTeste() {
		InicializarTeste.configurarAmbiente();
		
	}
	
	@After
    public void finalizarTeste() {
		InicializarTeste.encerrarTeste();
		
	}
	
	
	@Quando("enviar os dados para busca")
	public void enviarOsDadosParaBusca() {
	   home.buscarCepEndereco("13348-773");
	}
	
	@Entao("valido o retorno da consulta")
	public void validoORetornoDaConsulta() {
		home.validarDadosRetornados("Rua José Tadeu de Freitas", "Jardim Residencial Nova Veneza", "Indaiatuba/SP", "13348-773");
	    
		
	}



	
}
