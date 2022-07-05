package steps;


import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.CadastroPage;

public class CadastroSteps extends TesteCadastroRun {

    CadastroPage cadastroPage = new CadastroPage(driver);


    @Quando("preencho o formulário de cadastro")
    public void preenchoOFormulárioDeCadastro() {
        cadastroPage.selecionarTitulo(1);
        cadastroPage.preencheNome("Matheus");
        cadastroPage.preecheSobreNome("Lima");
        cadastroPage.preencheSenha("hajhvbav2545@");
        cadastroPage.selionaDataAniversario(25);
        cadastroPage.selionaMesAniversario(5);
        cadastroPage.selionaAnoAniversario("1980");
    }

    @Entao("vejo a mensagem de cadastro realizado com sucesso")
    public void vejoAMensagemDeCadastroRealizadoComSucesso() {
    }
}
