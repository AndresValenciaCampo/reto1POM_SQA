package com.demoserenity.steps;

import com.demoserenity.pageObject.DashBoardPage;
import net.serenitybdd.annotations.Step;
import org.assertj.core.api.Assertions;

public class DashBoardSteps {

    DashBoardPage dashBoardPage = new DashBoardPage();
    @Step("Validate Title")
    public void validateTitle(String message) {

        Assertions.assertThat(dashBoardPage.getDriver().findElement(dashBoardPage.getTxtTitleMainPage()).getText());
    }

    @Step("Click label More Info")
    public void clickLabelMoreInfo() {
        dashBoardPage.getDriver().findElement(dashBoardPage.getLblMoreInfo()).click();

    }

}
