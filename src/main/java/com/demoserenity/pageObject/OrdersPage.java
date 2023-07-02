package com.demoserenity.pageObject;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class OrdersPage  extends PageObject {
   By divCustomerCells = By.xpath("//div[@class='slick-cell l2 r2']");

   By txtTitleOrderPage = By.xpath("//div[@class='title-text']");

    public By getTxtTitleOrderPage() {
        return txtTitleOrderPage;
    }

    public By getDivCustomerCells() {
        return divCustomerCells;
    }
}
