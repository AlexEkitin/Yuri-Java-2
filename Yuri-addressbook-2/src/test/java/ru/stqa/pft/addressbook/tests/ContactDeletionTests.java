package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

public class ContactDeletionTests extends TestBase {


   @Test
   public void testContactDeletion() {
      if (!app.getContactHelper().isThereAContact()) {
         app.getContactHelper().createContact(new ContactData("dgasdfg", "sdfgsdfg","test1", "fdsghfgh", "sdfghds", "sdfhsdh"));
      }
      app.getContactHelper().initContactDeletion();
      app.getContactHelper().submitContactDeletion();
      //WebDriverWait wait = new WebDriverWait(wd, 10);
      //wait.until(ExpectedConditions.alertIsPresent()).accept();
      wd.switchTo().alert().accept();
   }
}
