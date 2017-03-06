package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

   @Test
   public void testContactCreation() {
      app.getContactHelper().initContactCreation();
      app.getContactHelper().fillContactForm(new ContactData("dgasdfg", "sdfgsdfg","test1", "fdsghfgh", "sdfghds", "sdfhsdh"), true);
      app.getContactHelper().submitContactCreation();
      app.getNavigationHelper().goToHomePage();
   }

}
