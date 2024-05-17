package com.demoserenity.steps;

import com.demoserenity.pageObject.LoginPage;
import com.demoserenity.utils.Excel;
import net.serenitybdd.annotations.Step;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;


public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @Step("User open Login Page")
    public void openLoginPage(String url){
        loginPage.openUrl(url);
    }

    @Step("User enter valid credentials")
    public void sendCredentials() throws IOException {

        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("src/test/resources/data/Data.xlsx","Credentials");
        loginPage.getDriver().findElement(loginPage.getTxtUser()).clear();
        loginPage.getDriver().findElement(loginPage.getTxtUser()).sendKeys(data.get(0).get("User"));
        loginPage.getDriver().findElement(loginPage.getTxtPass()).clear();
        loginPage.getDriver().findElement(loginPage.getTxtPass()).sendKeys(data.get(0).get("Password"));

    }

    @Step("Click Sign In Btn")
    public void clickBtnSignIn() {
        loginPage.getDriver().findElement(loginPage.getBtnLogin()).click();
    }

}
