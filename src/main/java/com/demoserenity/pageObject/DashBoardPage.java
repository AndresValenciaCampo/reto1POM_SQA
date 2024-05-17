package com.demoserenity.pageObject;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DashBoardPage extends PageObject {

    By txtTitleMainPage = By.xpath("//*[@class='content-header']/h1");
    By lblMoreInfo = By.xpath("//*[@id=\"DashboardContent\"]/div[1]/div[1]/div/a");

    public By getTxtTitleMainPage() {
        return txtTitleMainPage;
    }

    public By getLblMoreInfo() {
        return lblMoreInfo;
    }
}
