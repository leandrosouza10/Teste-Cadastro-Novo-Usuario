package steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import pages.CadastroPage;

public class CadastroSteps extends TesteCadastroRun {

    CadastroPage cadastroPage = new CadastroPage(driver);

    String nome = "Joao";
    String sobreNome = " Cunha";

    @Quando("preencho o formulário de cadastro")
    public void preenchoOFormulárioDeCadastro() {
        cadastroPage.selecionarTitulo(1);
        cadastroPage.preencheNome(nome);
        cadastroPage.preecheSobreNome(sobreNome);
        cadastroPage.preencheSenha("hajhvbav2545@");
        cadastroPage.selionaDataAniversario(25);
        cadastroPage.selionaMesAniversario(5);
        cadastroPage.selionaAnoAniversario("1980");
        cadastroPage.endereco("Rua Joao Macedo,222, Vila  Natalia");
        cadastroPage.cidade("São Paulo");
        cadastroPage.estado("Colorado");
        cadastroPage.cep("45856");
        cadastroPage.informacao("Teste 123456785");
        cadastroPage.celular("+5501195858752");

    }

    @E("clico em registrar")
    public void clicoEmRegistrar() {
        cadastroPage.botao();
    }

    @Entao("vejo cadastro realizado com sucesso")
    public void vejoAMensagemDeCadastroRealizadoComSucesso() {
    cadastroPage.validaCadastro(nome,sobreNome);
    }
}
