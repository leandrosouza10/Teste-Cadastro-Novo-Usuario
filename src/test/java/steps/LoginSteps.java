package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import pages.LoginPage;

public class LoginSteps extends TesteCadastroRun {

    LoginPage loginPage = new LoginPage(driver);
    @Dado("que estou na tela de login")
    public void queEstouNaTelaDeLogin() {
        loginPage.acessarTelaLogin();
    }

    @E("acesso o cadastro de usuario")
    public void acessoOCadastroDeUsuario() {
        loginPage.cadastrarEmail();
        loginPage.clicarBotao();
    }
}
