package pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import support.Utils;

public class CadastroPage extends Utils {
    WebDriver driver;

    private By senhor = By.id("uniform-id_gender1");
    private By Sra = By.id("uniform-id_gender2");
    private By nome1 = By.id("customer_firstname");
    private By sobreNome2 = By.id("customer_lastname");
    private By senha3 = By.id("passwd");
    private By aniversarioDia = By.id("days");
    private By aniversarioMes = By.id("months");
    private By aniversarioAno = By.id("years");
    private By endereco1 = By.id("address1");
    private By cidade1 = By.id("city");
    private By estado2 = By.id("id_state");
    private By novoCep = By.id("postcode");
    private By informacoesAdd = By.id("other");
    private By telCelular = By.id("phone_mobile");
    private By endAlternativo = By.id("alias");
    private By botaoRegistrar = By.id("submitAccount");


    public CadastroPage(WebDriver driver) {
        this.driver = driver;
    }
    public void selecionarTitulo( int titulo){
        waitPresent(senhor,20);
        if (titulo == 1){
            driver.findElement(senhor).click();
        }else if (titulo == 2) {
            driver.findElement(Sra).click();
        }
    }

    public void preencheNome(String nome){
        driver.findElement(nome1).sendKeys(nome);
    }
    public void preecheSobreNome(String sobreNome){
        driver.findElement(sobreNome2).sendKeys(sobreNome);
    }
    public void preencheSenha(String senha){
        driver.findElement(senha3).sendKeys(senha);
    }

    public void selionaDataAniversario(int dia){
        Select selectDia = new Select(driver.findElement(aniversarioDia));
        selectDia.selectByIndex(dia);
    }
    public void selionaMesAniversario(int mes){
        Select selectMes = new Select(driver.findElement(aniversarioMes));
        selectMes.selectByIndex(mes);
    }
    public void selionaAnoAniversario(String ano){
        Select selectAno = new Select(driver.findElement(aniversarioAno));
        selectAno.selectByValue(ano);
    }
    public void endereco(String novoEndereco){
        driver.findElement(endereco1).sendKeys(novoEndereco);
    }
    public void cidade(String novaCidade){
        driver.findElement(cidade1).sendKeys(novaCidade);
    }
    public void estado(String estadoNovo){
        Select selectEstado =new Select(driver.findElement(estado2));
        selectEstado.selectByVisibleText(estadoNovo);
    }
    public void cep(String cepNovo){
        driver.findElement(novoCep).sendKeys(cepNovo);
    }

    public void  informacao (String infomacoesAdicionais){
        driver.findElement(informacoesAdd).sendKeys(infomacoesAdicionais);
    }
    public void celular (String numCelular){
        driver.findElement(telCelular).sendKeys(numCelular);
    }
    public void enderecoAlternativo(String endereco){
        driver.findElement(endAlternativo).sendKeys(endereco);
    }
    public void botao(){
        driver.findElement(botaoRegistrar).click();
    }
    public void validaCadastro(String nome, String sobreNome){
        waitPresent(By.className("lnk_wishlist"),15);
        String resAtual = driver.findElement(By.className("account")).getText();
        Assert.assertEquals(nome+sobreNome,resAtual);

    }

}
