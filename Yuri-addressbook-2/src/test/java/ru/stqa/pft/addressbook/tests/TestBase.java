package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;

public class TestBase {

   //sozdaem obekt "app" tipa "ApplicationManager", v nem lezat vse vspomogatelnie metodi
   //delegirovanie - obektu vspomogatelnogo klassa delegiruyutsa nekodorie deistviya
   protected final ApplicationManager app = new ApplicationManager(BrowserType.CHROME);
   WebDriver wd;

   @BeforeMethod
   public void setUp() throws Exception {
      app.init();
   }

   @AfterMethod
   public void tearDown() {
      app.stop();
   }
}
