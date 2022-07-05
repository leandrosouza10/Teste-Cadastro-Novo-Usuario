package support;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.TesteCadastroRun;

import javax.lang.model.element.Element;
import java.util.Random;

public class Utils extends TesteCadastroRun{

    public void waitPresent(By element, Integer tempo){
        WebDriverWait wait = new WebDriverWait(driver, tempo);
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }
    public String randomEmail(){
        String emailInit ="teste";
        String emailFinal = "@gmail.com";
        Random random =  new Random();
        int  minimo = 1;
        int maximo = 999999999;
        int resultado = random.nextInt(maximo-minimo) + minimo;

        return emailInit + resultado + emailFinal;
    }

}


