package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {

   public ContactHelper(FirefoxDriver wd) {
      super(wd); //vizivaetsa konstruktor bazovogo klassa
   }

   public void submitContactCreation() {
      click(By.name("submit"));
   }

   public void initContactCreation() {
      click(By.linkText("add new"));
   }

   public void fillContactForm(ContactData contactData) {
      type(By.name("firstname"), contactData.getFirstname());
      type(By.name("lastname"), contactData.getLastname());
      type(By.name("address"), contactData.getAddress());
      type(By.name("home"), contactData.getHomePhone());
      type(By.name("email"), contactData.getEmail_1());
   }

   public void initContactModification() {
      click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
   }

   public void submitContactModification() {
      click(By.name("update"));
   }
}
