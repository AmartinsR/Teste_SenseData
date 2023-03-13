package Steps;

import org.junit.AfterClass;


import Drivers.Driver;
import Elementos.Elementos;
import Metodos.Metodos;
import Run.Executar;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends Driver {

	//instanciando objeto da classe metodos
	Metodos metodos = new Metodos();

	//instanciando objeto da classe elementos
	Elementos el = new Elementos();

	//antes de cada teste
	@Before
	public void abrirSite() {
		// linha de codigo adicionada pois janela do navegador não consegue estabelecer conexão
		// websocket foi adicionado tambem uma biblioteca do selenium no pom.xml para resolução deste problema
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		Executar.abrirSite();
		

	}
	
	@Given("que eu acesse o site com dados validos")
	public void queEuAcesseOSiteComDadosValidos() {
		metodos.escrever(el.loginUser, "standard_user");
		metodos.escrever(el.password, "secret_sauce");
		metodos.clicar(el.btnLogin);

	}

	@Given("clicar em dois itens para adicionar ao carrinho")
	public void clicarEmDoisItensParaAdicionarAoCarrinho() {
		metodos.clicar(el.produto1);
		metodos.clicar(el.produto2);

	}

	@When("clico no carrinho de compras")
	public void clicoNoCarrinhoDeCompras() {
		metodos.clicar(el.carrinho);

	}

	@Then("concluo a compra")
	public void concluoACompra() {
		metodos.clicar(el.checkout);
		metodos.escrever(el.firstName, "Fulano");
		metodos.escrever(el.lastName, "Silva");
		metodos.escrever(el.postalCode, "18071-274");//CEP GERADO NO SITE: https://www.geradordecep.com.br/
		metodos.clicar(el.btnContinue);
		metodos.clicar(el.btnFinish);
		
			}

	@Then("valido a mensagem de sucesso")
	public void validoAMensagemDeSucesso() {
		metodos.validarMensagem(el.msgSusesso, "Thank you for your order!");

	}

	@AfterClass
	public static void finalizarTest() {
		driver.quit();
		System.out.println("***************TESTE FINALIZADO COM SUCESSO!!!***************");

	}

}
