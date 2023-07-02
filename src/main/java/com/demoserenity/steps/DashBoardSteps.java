package com.demoserenity.steps;

import com.demoserenity.pageObject.DashBoardPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;


public class DashBoardSteps {

    DashBoardPage dashBoardPage = new DashBoardPage();
    @Step("Validate Title")
    public void validateTitle(String message) {

        Assert.assertEquals(dashBoardPage.getDriver().findElement(dashBoardPage.getTxtTitleMainPage()).getText(), message);

    }

    @Step("Click label More Info")
    public void clickLabelMoreInfo() {
        dashBoardPage.getDriver().findElement(dashBoardPage.getLblMoreInfo()).click();

    }

}
