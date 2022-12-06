package Elementos;

import org.openqa.selenium.By;

public class Elementos {

	// Fluxo abertura de conta Pessoa Fisica
	private By aceitarCookies = By.id("onetrust-accept-btn-handler");
	private By btnAbrirNovaConta = By.cssSelector("body > div.viewport-primary > nav.nav-desktop > div.right > div.nav-item.nav-item-nova-conta > a");
	private By btnAbrirContaParaVoce = By.id("bt1");
	private By campoNome = By.id("nome");
	private By campoTelefone = By.id("telefone");
	private By campoEMAIL = By.id("email");
	private By campoCpf = By.id("cpf");
	private By btnQueroSerCliente = By.id("btnEnviar");
	private By textoFaltaPouco = By.xpath("//*[@id=\"pu-modalSucesso\"]/div/div[1]/p/span[1]");

	public By getAceitarCookies() {
		return aceitarCookies;
	}

	public By getBtnAbrirNovaConta() {
		return btnAbrirNovaConta;
	}
	
	public By getBtnAbrirContaParaVoce() {
		return btnAbrirContaParaVoce;
	}

	public By getCampoNome() {
		return campoNome;
	}

	public By getCampoTelefone() {
		return campoTelefone;
	}

	public By getCampoEMAIL() {
		return campoEMAIL;
	}

	public By getCampoCpf() {
		return campoCpf;
	}

	public By getBtnQueroSerCliente() {
		return btnQueroSerCliente;
	}

	public By getTextoFaltaPouco() {
		return textoFaltaPouco;
	}

}
