package Automation.Week5.Day3

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.Select
import org.openqa.selenium.{By, WebDriver, WebElement}

object HandlingDropDowns extends App {

  val driver: WebDriver = new ChromeDriver()
  driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select")

  driver.switchTo().frame("iframeResult")

  val dropdown: WebElement = driver.findElement(By.name("cars"))

  val select = new Select(dropdown)

  //Selected by Visible Text
  select.selectByVisibleText("Audi")
  println("Selected by visible text: " + select.getFirstSelectedOption.getText)

  //Selected by Value
  select.selectByValue("saab")
  println("Selected by value: " + select.getFirstSelectedOption.getText)

  //Selected by Index
  select.selectByIndex(2)
  println("Selected by index: " + select.getFirstSelectedOption.getText)

  driver.quit()

}
