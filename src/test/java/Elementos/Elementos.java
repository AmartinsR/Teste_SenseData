package Elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	//elementos até o checkout
	
	public By loginUser = By.id("user-name");//elemento do nome do login do usuario
	public By password = By.id("password");//elemento da senha do login do usuario
	public By btnLogin = By.id("login-button");//elemento do botão login
	public By produto1 = By.id("add-to-cart-sauce-labs-backpack");//elemento do 1 produto adicionado ao carrinho
	public By produto2 = By.id("add-to-cart-sauce-labs-bike-light");//elemento do 2 produto adicionado ao carrinho
	public By carrinho = By.xpath("//a[@class='shopping_cart_link']");//elemento do carrinho de compras
	public By checkout = By.id("checkout");//elemento do botão checkout
	
	//elementos concluir compra
	public By firstName = By.id("first-name");//elemento para preencher nome
	public By lastName = By.id("last-name");//elemento para preencher sobrenome
	public By postalCode = By.id("postal-code");//elemento para preencher cep
	public By btnContinue = By.id("continue");//elemento do botão continue
	public By btnFinish = By.id("finish");//elemento do botão finish
	
	//elemento mensagem de sucesso
	public By msgSusesso = By.xpath("//h2[text()='Thank you for your order!']");//elemento para validar mensagem de sucesso Thank you for your order!
}
