package com.steam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *  Конструктор класса
 */
public class MainPage {
    public WebDriver driver;
    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /**
     * Определение локатора поисковой строки
     */
    @FindBy(xpath = "//*[@id=\"store_nav_search_term\"]")
    private WebElement searchLine;
    /**
     * Определение локатора кнопки поиска
     */
    @FindBy(xpath = "/html/body/div[1]/div[7]/div[2]/div/div/div[2]/div[2]/div/div[9]/div[1]/form/div/a")
    private WebElement searchingButton;
    /**
     * Метод для ввода игры
     */
    public void inputGame(String game){searchLine.sendKeys(game);}
    /**
     * Метод для осуществления нажатия кнопки поиска
     */
    public void clickSearchingButton(){searchingButton.click();}

}
