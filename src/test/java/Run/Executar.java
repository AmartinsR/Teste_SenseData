package Run;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import Drivers.Driver;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

// O RUN DEVE SER DADO NESTA CLASSE, E SER EXECUTADO JUNTAMENTE COM O JUNIT
//CLICAR EM RUN AS 
	
@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src/test/resources/features",
		// packege que serão implementados no steps
		glue = "Steps",//pasta que está os steps gerado pelo cucumber
		tags = "@test",//tag que será utilizada para iniciar o teste
		monochrome = true,// retira os caracteres especiais
		dryRun = false, /// utilizado para planejar os gerkins true, falso para executar e true para pegar os steps
		plugin = { "pretty", "html:target/report-cucumber.html" },// deixa o console do junit com a mesma aparencia cucumber troca o _ para padrão Java, gera os reports html ou json
		snippets = SnippetType.CAMELCASE// UTILIZAMOS O DO CUCUMBER OPTIONS

)

public class Executar extends Driver {

	//aqui iremos abrir o navegador com o site desejado, utilizando chromedriver e métodos selenium
	public static void abrirSite() {
		String url = "https://www.saucedemo.com/";
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
}



