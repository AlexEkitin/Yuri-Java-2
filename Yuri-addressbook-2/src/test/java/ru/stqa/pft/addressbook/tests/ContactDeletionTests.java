package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {


   @Test
   public void testContactDeletion() {
      app.getContactHelper().initContactDeletion();
      app.getContactHelper().submitContactDeletion();
      //WebDriverWait wait = new WebDriverWait(wd, 10);
      //wait.until(ExpectedConditions.alertIsPresent()).accept();
      wd.switchTo().alert().accept();
   }
}
