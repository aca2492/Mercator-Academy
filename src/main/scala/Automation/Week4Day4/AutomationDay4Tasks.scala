package Automation.Week4Day4

import org.openqa.selenium.{By, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver

import java.util

object AutomationDay4Tasks extends App {

  val driver: WebDriver = new ChromeDriver()

  driver.get("https://www.selenium.dev/selenium/web/web-form.html")

  //By ID
  val firstName: WebElement = driver.findElement(By.id("my-text-id"))
  firstName.sendKeys("Adam")
  println("Name Input - Passed")

  //By Name
  val password: WebElement = driver.findElement(By.name("my-password"))
  password.sendKeys("Password123")
  println("Password Input - Passed")

  //By Class Name
  val classNameSearch: util.List[WebElement] = driver.findElements(By.className("form-control"))
  val comment: WebElement = classNameSearch.get(2)
  comment.sendKeys("Test Comment")
  println("Text Area Input - Passed")

  //By Tag Name
  val tagCount: util.List[WebElement] = driver.findElements(By.tagName("input"))
  val inputCount: Int = tagCount.size()
  println(s"Total number of input tags: $inputCount - Passed")

  //By Link Text
  val returnIndex: WebElement = driver.findElement(By.linkText("Return to index"))
  returnIndex.click()
  println("Link Text Click - Passed")

  //By Partial Link Text
  driver.navigate().back()
  println("Return to Webpage - Passed")
  val returnPartial: WebElement = driver.findElement(By.partialLinkText("Return"))
  returnPartial.click()
  println("Return to Index (Partial) - Passed")


  driver.close()

}
