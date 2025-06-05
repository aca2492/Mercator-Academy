package Automation.Week4Day4

import org.openqa.selenium.{By, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver

import java.util

object AutomationDay4Tasks extends App {

  //PPT MVP
  println("PPT MVP: ")
  val formDriver: WebDriver = new ChromeDriver()
  formDriver.get("https://www.selenium.dev/selenium/web/web-form.html")

  //By ID
  val firstName: WebElement = formDriver.findElement(By.id("my-text-id"))
  firstName.sendKeys("Adam")
  println("Name Input - Passed")

  //By Name
  val password: WebElement = formDriver.findElement(By.name("my-password"))
  password.sendKeys("Password123")
  println("Password Input - Passed")

  //By Class Name
  val classNameSearch: util.List[WebElement] = formDriver.findElements(By.className("form-control"))
  val comment: WebElement = classNameSearch.get(2)
  comment.sendKeys("Test Comment")
  println("Text Area Input - Passed")

  //By Tag Name
  val tagCount: util.List[WebElement] = formDriver.findElements(By.tagName("input"))
  val inputCount: Int = tagCount.size()
  println(s"Total number of input tags: $inputCount - Passed")

  //By Link Text
  val returnIndex: WebElement = formDriver.findElement(By.linkText("Return to index"))
  returnIndex.click()
  println("Link Text Click - Passed")

  //By Partial Link Text
  formDriver.navigate().back()
  println("Return to Webpage - Passed")
  val returnPartial: WebElement = formDriver.findElement(By.partialLinkText("Return"))
  returnPartial.click()
  println("Return to Index (Partial) - Passed")


  formDriver.close()


  //HTML MVP
  println("HTML MVP 1")
  val w3driver: WebDriver = new ChromeDriver()
  w3driver.get("https://www.w3schools.com/html/html_examples.asp")

  println("MVP 1a:")
  val buttonElements: util.List[WebElement] = w3driver.findElements(By.className("w3-button"))
  println(s"There is a total of " + buttonElements.size() + " button elements")

  println("MVP 1b:")
  val imgElements: util.List[WebElement] = w3driver.findElements(By.tagName("img"))
  println(s"There is a total of " + imgElements.size() + " image elements")

  println("MVP 1c:")
  val elementCounta: util.List[WebElement] = w3driver.findElements(By.tagName("a"))
  val elementCounth1: util.List[WebElement] = w3driver.findElements(By.tagName("h1"))
  val aCount: Int = elementCounta.size()
  val hCount: Int = elementCounth1.size()
  println(s"There is $aCount <a> tags on this page")
  println(s"There is $hCount <h1> tags on this page")

  println("MVP 1d:")

  println("MVP 1e:")

  w3driver.close()

  println("HTML MVP 2")
  val demoDriver: WebDriver = new ChromeDriver()
  demoDriver.get("https://demoqa.com/")

  println("MVP 2a:")
  demoDriver.navigate().to("https://demoqa.com/text-box")
  val fullName: WebElement = demoDriver.findElement(By.xpath("//input[@placeholder = 'Full Name']"))
  fullName.sendKeys("Adam Chery")
  println("Full Name navigate and locate - Passed")

  println("MVP 2b:")
  demoDriver.navigate().to("https://demoqa.com/text-box")





 demoDriver.close()

}
