package Automation.Week5.Day2

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.{By, WebDriver, WebElement}

object BrowserMethods extends App {

  val driver: WebDriver = new ChromeDriver()
  driver.get("https://www.selenium.dev/selenium/web/web-form.html")

  //Maximise Browser Window
  driver.manage().window().maximize()

  //Navigate to new page
  driver.navigate().to("https://the-internet.herokuapp.com")

  //Navigate Back
  driver.navigate().back()

  //Navigate Forward
  driver.navigate().forward()

  //Refresh Page
  driver.navigate().refresh()

  //Close Tab
  driver.close()

  //Close whole browser
  driver.quit()

}
