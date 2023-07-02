package com.demoserenity.pageObject;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    By txtUser = By.id("LoginPanel0_Username");
    By txtPass = By.id("LoginPanel0_Password");

    By btnLogin = By.id("LoginPanel0_LoginButton");

    By altLogin = By.xpath("//div[@class='toast-message']");

    public By getTxtUser() {
        return txtUser;
    }

    public By getTxtPass() {
        return txtPass;
    }

    public By getBtnLogin() {
        return btnLogin;
    }

    public By getAltLogin() {
        return altLogin;
    }

}
