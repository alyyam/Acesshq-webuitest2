package com.accesshq.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormPageTest {
    WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://d18u5zoaatmpxx.cloudfront.net/#/");
        driver.manage().window().maximize();
    }

    @Test
    public void clickEarthExplorer(){
        driver.findElement(By.cssSelector("[aria-label=planets]")).click();
        var planetList =  driver.findElements(By.className("planet"));

        for(var planet : planetList){
            planet.findElement(By.tagName("h2")).getText().equalsIgnoreCase("Earth");
            planet.findElement(By.tagName("button")).click();

        }

    }


}

