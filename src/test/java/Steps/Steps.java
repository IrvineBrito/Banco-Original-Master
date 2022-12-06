package Steps;

import Elementos.Elementos;
import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	Metodos m = new Metodos();
	Elementos e = new Elementos();

	@Given("que acesse a url {string}")
	public void que_acesse_a_url(String url) {
		m.abrirNavegador(url);
	}

	@Given("clicar no botao aceitar cookies")
	public void clicar_no_botao_aceitar_cookies() {
		m.clicar(e.getAceitarCookies());
	}

	@Given("clicar no botao abrir conta")
	public void clicar_no_botao_abrir_conta() throws InterruptedException {
		m.clicar(e.getBtnAbrirNovaConta());
		m.pausa(1000);
	}

	@Given("clicar no botao que corresponde abrir conta para voce")
	public void clicar_no_botao_que_corresponde_abrir_conta_para_voce() throws InterruptedException {
		m.clicar(e.getBtnAbrirContaParaVoce());
		m.pausa(1000);
	}
	
	@Given("preencher o campo nome com o nome {string}")
	public void preencher_o_campo_nome_com_o_nome(String string) {
		m.preencher(e.getCampoNome(), string);
	}

	@Given("preencher o campo telefone com o telefone {string}")
	public void preencher_o_campo_telefone_com_o_telefone(String string) {
		m.preencher(e.getCampoTelefone(), string);
	}

	@Given("preencher o campo email com o email {string}")
	public void preencher_o_campo_email_com_o_email(String string) {
		m.preencher(e.getCampoEMAIL(), string);
	}

	@Given("preencher o campo cpf com o cpf {string}")
	public void preencher_o_campo_cpf_com_o_cpf(String string) {
		m.preencher(e.getCampoCpf(), string);
	}
	
	@When("preencher o formulario de abertura de conta")
	public void preencher_o_formulario_de_abertura_de_conta() {
		m.preencher(e.getCampoNome(), "Diego Lucca Alexandre Souza");
		m.preencher(e.getCampoTelefone(), "11111111111");
		m.preencher(e.getCampoEMAIL(), "teste@teste.com");
		m.preencher(e.getCampoCpf(), "42519644460");
	}


	@When("clicar no botao quero ser cliente")
	public void clicar_no_botao_quero_ser_cliente() {
		m.clicar(e.getBtnQueroSerCliente());
	}

	@Then("sera exibido o texto falta pouco")
	public void sera_exibido_o_texto_falta_pouco() throws InterruptedException {
		m.pausa(3000);
		m.validarTexto(e.getTextoFaltaPouco(), "Falta pouco!");
		m.fecharNavegador();
	}
}