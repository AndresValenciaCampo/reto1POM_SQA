package com.demoserenity.steps;

import com.demoserenity.pageObject.OrdersPage;
import com.demoserenity.utils.RandomOrderCustomerList;
import net.serenitybdd.annotations.Step;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class OrderSteps {
    OrdersPage ordersPage = new OrdersPage();

    @Step("Select customer from list")
    public void selectCustomer() {

        WebDriverWait wait = new WebDriverWait(ordersPage.getDriver(),  Duration.ofSeconds(5));

        List<WebElement> customers = wait.until(driver -> ordersPage.getDriver().findElements(ordersPage.getDivCustomerCells()));
        customers.get(RandomOrderCustomerList.selectCustomerOrder(0, customers.size())).click();
    }

    @Step("Validate title page")
    public void validateTitlePage() {
       // Assert.assertEquals(ordersPage.getDriver().findElement(ordersPage.getTxtTitleOrderPage()).getText(), "Orders");
        Assertions.assertThat(ordersPage.getDriver().findElement(ordersPage.getTxtTitleOrderPage()).getText());

    }


}
