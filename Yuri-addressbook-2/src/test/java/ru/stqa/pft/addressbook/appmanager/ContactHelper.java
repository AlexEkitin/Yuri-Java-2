package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {

   public ContactHelper(WebDriver wd) {
      super(wd); //vizivaetsa konstruktor bazovogo klassa
   }

   public void submitContactCreation() {
      click(By.name("submit"));
   }

   public void initContactCreation() {
      click(By.linkText("add new"));
   }

   public void fillContactForm(ContactData contactData, boolean creation) {
      type(By.name("firstname"), contactData.getFirstname());
      type(By.name("lastname"), contactData.getLastname());

      if (creation) { //esli kontakt sozdaetsa
         new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup()); //vibrat punkt iz vipadayusego spiska
      } else { //esli kontakt modificiruetsa
         Assert.assertFalse(isElementPresent(By.name("new_group")));
      }

      type(By.name("address"), contactData.getAddress());
      type(By.name("home"), contactData.getHomePhone());
      type(By.name("email"), contactData.getEmail_1());
   }

   public void initContactDeletion() {
      click(By.name("selected[]"));
   }

   public void initContactModification() {
      click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
   }

   public void submitContactModification() {
      click(By.name("update"));
   }

   public void submitContactDeletion() {
      click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
   }

   public boolean isThereAContact() {
      return isElementPresent(By.name("selected[]"));
   }

   public void createContact(ContactData contact) {
      initContactCreation();
      fillContactForm(contact, true);
      submitContactCreation();
      //goToHomePage();
   }


}
