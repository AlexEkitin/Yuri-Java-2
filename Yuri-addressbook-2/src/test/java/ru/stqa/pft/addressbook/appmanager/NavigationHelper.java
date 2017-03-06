package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase {

   public NavigationHelper(WebDriver wd) {
      super(wd); //vizivaetsa konstruktor bazovogo klassa
   }


   public void gotoGroupPage() {
      if (wd.findElement(By.tagName("h1")).getText().equals("Groups") &&
              isElementPresent(By.name("new"))) {
         return;
      }
      click(By.linkText("groups"));
   }

   public void goToHomePage() { //proveriaem, nahodimsa li mi uze ne etoi stranice
      if (isElementPresent(By.id("maintable"))) {
         return;
      }
      click(By.linkText("home page"));
   }

}
