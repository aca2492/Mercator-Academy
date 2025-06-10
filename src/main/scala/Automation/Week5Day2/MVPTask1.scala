package Automation.Week5Day2

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

object MVPTask1 extends App {

  val driver: WebDriver = new ChromeDriver()
  driver.get("https://demoqa.com/browser-windows")

  //Retrieve and Print Title
  println(s"Page Title: ${driver.getTitle}")

  //Retrieve and Print Current URL
  println(s"Current URL: ${driver.getCurrentUrl}")

  driver.close()

  driver.quit()

}
