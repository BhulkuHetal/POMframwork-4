package com.demo.nopcommerce.Pages;

import com.demo.nopcommerce.Utils.Constants;
import com.demo.nopcommerce.Utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    WebDriver driver;
    Utils utils;

    By register = By.className("ico-register");
    By genderButton = By.id("gender-female");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By Day = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]");
    By Month = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]");
    By Year = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]");
    By emailId = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[5]/input");
    By companyName = By.id("Company");
    By password = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");
    By giftCards = By.xpath("/html/body/div[6]/div[2]/ul[1]/li[7]/a");
    By physicalGiftCard = By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/h2/a");
    By recipientName = By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div/form/div[2]/div[1]/div[2]/div[6]/div[1]/input");
    By yourName = By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div/form/div[2]/div[1]/div[2]/div[6]/div[2]/input");
    By addToCart = By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div/form/div[2]/div[1]/div[2]/div[8]/div/button");
    By shoppingCart = By.xpath("/html/body/div[5]/div/p/a");
    By checkBox = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[3]/div[2]/div[3]/input");
    By checkOut = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[3]/div[2]/div[4]/button");


    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        utils = new Utils(driver);
    }

    public String getRegisterPageTitle() {
        return utils.waitForTitlePresent(Constants.REGISTER_PAGE_TITLE, 10);
    }


    public void registerUser(String fn, String ln, String day, String month, String year,String email,
                             String CN, String pwd, String cpwd,String Regname,
                             String Yourname) throws InterruptedException{


        utils.doClick(register);
        utils.doClick(genderButton);
        Thread.sleep(3000);
        utils.doSendKeys(firstName,fn);
        Thread.sleep(3000);
        utils.doSendKeys(lastName,ln);
        Thread.sleep(3000);
       utils.selectValueFromDropDown(Day,day);
        Thread.sleep(3000);
        utils.selectValueFromDropDown(Month,month);
        Thread.sleep(3000);
        utils.selectValueFromDropDown(Year,year);
        Thread.sleep(3000);
        utils.doSendKeys(emailId,email);
        Thread.sleep(3000);
        utils.doSendKeys(companyName,CN);
        Thread.sleep(3000);
        utils.doSendKeys(password,pwd);
        Thread.sleep(3000);
        utils.doSendKeys(confirmPassword,cpwd);
        Thread.sleep(3000);
        utils.doClick(registerButton);
        Thread.sleep(3000);
        utils.doClick(giftCards);
        Thread.sleep(3000);
        utils.doClick(physicalGiftCard);
        Thread.sleep(3000);
        utils.doSendKeys(recipientName,Regname);
        Thread.sleep(3000);
        utils.doSendKeys(yourName,Yourname);
        Thread.sleep(3000);
        utils.doClick(addToCart);
        Thread.sleep(3000);
        utils.doClick(shoppingCart);
        Thread.sleep(3000);
        utils.doClick(checkBox);
        Thread.sleep(3000);
        utils.doClick(checkOut);
    }
}
