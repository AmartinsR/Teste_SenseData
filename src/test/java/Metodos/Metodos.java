package Metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;


import Drivers.Driver;;

public class Metodos extends Driver {
	
	
	//metodo para escrever pegando o elemento localizado pela classs elementos
	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}
	
	//metodo para digitar pegando o elemento localizado pela classs elementos
	public void clicar(By elemento) {
		driver.findElement(elemento).click();

	}

	////metodo para validar mensagem ou número pegando o elemento localizado pela classs elementos
	public void validarMensagem(By elemento, String msgEsperada) {

		String msgCapturado = driver.findElement(elemento).getText();
		assertEquals(msgEsperada, msgCapturado);
	}

}
