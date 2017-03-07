package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

   @Test
   public void testContactCreation() {
      app.getContactHelper().createContact(new ContactData("dgasdfg", "sdfgsdfg","test1", "fdsghfgh", "sdfghds", "sdfhsdh"));
   }

}
