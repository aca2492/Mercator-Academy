package Automation.Week5.Day3

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.{By, WebDriver, WebElement}

object HandlingTextBox extends App {

  val driver: WebDriver = new ChromeDriver()
  driver.get("https://www.selenium.dev/selenium/web/web-form.html")

  val text: WebElement = driver.findElement(By.id("my-text-id"))
  text.sendKeys("Howdily")
  println(s"Text input to text box")

  val textAttribute = text.getAttribute("class")
  println(s"Attribute retrieved from text box: $textAttribute")

  text.clear()
  println("Text Cleared from text box")



  driver.quit()

}
