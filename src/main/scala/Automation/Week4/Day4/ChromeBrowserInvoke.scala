package Automation.Week4.Day4

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

object ChromeBrowserInvoke extends App {

  val driver: WebDriver = new ChromeDriver()
  println("Invoking Chrome Browser")

  driver.get("https://www.google.com")

  println("Title of Webpage: " + driver.getTitle)

  driver.quit()

}
