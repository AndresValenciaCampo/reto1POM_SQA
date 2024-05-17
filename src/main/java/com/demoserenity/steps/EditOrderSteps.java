package com.demoserenity.steps;

import com.demoserenity.pageObject.EditOrderPage;
import com.demoserenity.utils.RandomOrderCustomerList;
import net.serenitybdd.annotations.Step;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EditOrderSteps {

    EditOrderPage editOrderPage = new EditOrderPage();

    @Step("Validate edit order page title")
    public void validateEditOrderPageTitle() {


        WebElement parentElement = editOrderPage.find(By.xpath("//div[@class='panel-titlebar']"));

        List<WebElement> dynamicIcons = parentElement.findElements(By.xpath("//div[@class='panel-titlebar-text']"));

        String textValue = null;
        for (WebElement icon : dynamicIcons) {

            WebElement textElement = icon.findElement(By.xpath("//div[@class='panel-titlebar-text']"));

            Assertions.assertThat("Edit Order " + textElement.getText());
        }

    }


    @Step("Select employee from list")
    public void selectEmployee() {
        editOrderPage.getDriver().findElement(editOrderPage.getBtnClickEmployeeBox()).click();

        List<WebElement> employees = editOrderPage.getDriver().findElements(editOrderPage.getListEmployee());
        employees.get(RandomOrderCustomerList.selectCustomerOrder(0, employees.size())).click();
    }


    @Step("Click apply changes")
    public void clickApplyChanges() {
        editOrderPage.getDriver().findElement(editOrderPage.getBtnApplyChanges()).click();
    }

    @Step("Save Success validation")
    public void validateSaveSuccess() {
        Assertions.assertThat(editOrderPage.getDriver().findElement(editOrderPage.getContainerToast()).getText());
    }

}
