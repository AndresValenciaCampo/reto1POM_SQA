package com.demoserenity.pageObject;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class EditOrderPage extends PageObject {

    By txtEditOrderTitlePage = By.xpath("//div[@class='panel-titlebar']");

    By btnClickEmployeeBox = By.xpath("//*[@id='select2-chosen-9']");
    By listEmployee = By.xpath("//ul[@id='select2-results-9']/li");

    By btnApplyChanges = By.xpath("//div[@class='tool-button apply-changes-button icon-tool-button']");

    By containerToast = By.xpath("//div[@id='toast-container']");



    public By getListEmployee() {
        return listEmployee;
    }

    public By getTxtEditOrderTitlePage() {
        return txtEditOrderTitlePage;
    }

    public By getBtnClickEmployeeBox() {
        return btnClickEmployeeBox;
    }
    public By getBtnApplyChanges() {
        return btnApplyChanges;
    }
    public By getContainerToast() {
        return containerToast;
    }

}
