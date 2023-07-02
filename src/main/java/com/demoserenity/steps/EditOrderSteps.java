package com.demoserenity.steps;

import com.demoserenity.pageObject.EditOrderPage;
import com.demoserenity.utils.RandomOrderCustomerList;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EditOrderSteps {

    EditOrderPage editOrderPage = new EditOrderPage();

    @Step("validate Title from Edit Order Page")
    public void validateEditOrderPageTitle() {


        WebElement parentElement = editOrderPage.find(By.xpath("//div[@class='panel-titlebar']"));

        List<WebElement> dynamicIcons = parentElement.findElements(By.xpath("//div[@class='panel-titlebar-text']"));

        String textValue = null;
        for (WebElement icon : dynamicIcons) {

            WebElement textElement = icon.findElement(By.xpath("//div[@class='panel-titlebar-text']"));
            textValue = textElement.getText();


            Assert.assertEquals("Edit Order " + textElement.getText(), "Edit Order " + textValue);
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

        Assert.assertEquals(editOrderPage.getDriver().findElement(editOrderPage.getContainerToast()).getText(), "Save success");

    }

}
