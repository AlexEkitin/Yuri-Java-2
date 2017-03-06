package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelperBase {
   protected WebDriver wd;

   public HelperBase(WebDriver wd) {
      this.wd = wd;
   }

   protected void click(By locator) {
      wd.findElement(locator).click();
   }

   protected void type(By locator, String text) {
      click(locator);
      if (text != null) {
         String existingText = wd.findElement(locator).getAttribute("value"); //chto napisano v samom pole
         if (!text.equals(existingText)) { //esli suchestvuyushii tekst sovpadaet s novim tekstom, to nichego ne delaem
            wd.findElement(locator).clear();
            wd.findElement(locator).sendKeys(text);
         }
      }
   }

   public boolean isAlertPresent() {
      try {
         wd.switchTo().alert();
         return true;
      } catch (NoAlertPresentException e) {
         return false;
      }
   }

   protected boolean isElementPresent(By locator) { //proverka nalichiya ili otsutstviya elementa
      try {
         wd.findElement(locator);//poisk elementa, esli ego net, to budet iskluchenie
         return true;
      } catch (NoSuchElementException ex) {
         return false;
      }
   }
}
