package ru.stqa.pft.addressbook.model;

public class ContactData {
   private final String firstname;
   private final String lastname;
   private String group;
   private final String address;
   private final String homePhone;
   private final String email_1;

   public ContactData(String firstname, String lastname, String group, String address, String homePhone, String email_1) {
      this.firstname = firstname;
      this.lastname = lastname;
      this.group = group;
      this.address = address;
      this.homePhone = homePhone;
      this.email_1 = email_1;
   }

   public String getFirstname() {
      return firstname;
   }

   public String getLastname() {
      return lastname;
   }

   public String getAddress() {
      return address;
   }

   public String getHomePhone() {
      return homePhone;
   }

   public String getEmail_1() {
      return email_1;
   }

   public String getGroup() {
      return group;
   }
}
