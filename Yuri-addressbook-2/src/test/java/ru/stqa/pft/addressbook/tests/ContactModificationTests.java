package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

   @Test
public void testContactModification(){
      app.getContactHelper().initContactModification();
      app.getContactHelper().fillContactForm(new ContactData("test1", "test1",null, "test1", "test1", "test1"),false);
      app.getContactHelper().submitContactModification();
      app.getNavigationHelper().goToHomePage();
   }
}
