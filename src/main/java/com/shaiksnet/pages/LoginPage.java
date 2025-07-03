package com.shaiksnet.pages;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.*;

import static com.shaiksnet.utility.Global_Variables.*;
import static org.jsoup.helper.Validate.fail;
import com.shaiksnet.utility.Util;
import com.shaiksnet.utility.Global_Variables.*;

import java.util.List;

public class LoginPage {
    private final WebDriver driver;
    private final Logger logger = (Logger) LogManager.getLogger(this.getClass());
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openUrl(){

        try{
            logger.info("In OpenUrl");
            String url = Util.getProperty(psLbl_VisaSlotUrl);
            driver.get(url);
            logger.info("OpenUrl Completed");

        }catch (Exception e){
            e.printStackTrace();
            fail("step: openUrl failed");
        }
    }

    public void enteringUserId(String userId){
        try{
            logger.info("In enteringUserId");
            Util.implicitWait(driver);
            Util.switchToWindow(driver,"0");
            driver.navigate().refresh();

            WebElement element = driver
                    .findElement(By.xpath(Util.getXpath(getClass().getSimpleName(),"SignInButton")));
            element.click();

        }catch (Exception e){
            e.printStackTrace();
            fail("step: enteringUserId failed");
        }
    }

    public void  userLoginIntoCheckUsVisaSlotsNet() {
        try{

            Util.implicitWait(driver);
            openUrl();


        }catch (Exception e){
            fail("Step: userLoginIntoCheckUsVisaSlotsNet failed");
        }



        }


    public void userGetTheCountryNameInDropDown() {
        int i = 0;
        List<WebElement> Index;
        Index = driver.findElements(By.xpath(""));

        for (WebElement list : Index) {
            if (list.equals("india"));
            i++;

        }
    }

    public void userGetTheDataFromMongo(){
        //db.Connection
        //collection - Collection-TransL COllection
        //db.cursror
        //query.in



    }
}
