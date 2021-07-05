package com.steam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SecondPage {
    /**
     *  Конструктор класса
     */
        public WebDriver driver;
        public SecondPage(WebDriver driver) {
            PageFactory.initElements(driver, this);
            this.driver = driver;
        }
    /**
     * Определение локатора поисковой строки
     */
    @FindBy(xpath = "//*[@id=\"term\"]")
    private WebElement searchingResult;
    /**
     * Метод для получения текста который содержется в результирующей поисковой строке
     */
    public String getSearchingText(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[7]/div[2]/div/div/div[2]/div[2]/div/div[9]/div[1]/form/div/input")));
        String SearchingText = searchingResult.getText();
        return SearchingText;
    }

}
