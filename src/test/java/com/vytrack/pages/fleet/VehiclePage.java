package com.vytrack.pages.fleet;

import com.automation.pages.AbstractPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VehiclePage extends AbstractPageBase {


    @FindBy(partialLinkText = "Create Car")
    private WebElement createCar;

    public void clickToCreateCar(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(createCar)).click();
    }

}
