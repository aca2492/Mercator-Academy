package Automation.Week5.Day3

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.{By, WebDriver, WebElement}

object HandlingRadioAndCheckbox extends App {

  val driver: WebDriver = new ChromeDriver()
  driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html")






  driver.quit()

}
