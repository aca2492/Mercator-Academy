package Automation.Week5Day1

import org.openqa.selenium.{By, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver

object Week5Day1MVP extends App {

  val driver: WebDriver = new ChromeDriver()
  driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html")

  //Username - Name
  val userName: WebElement = driver.findElement(By.name("username"))
  userName.sendKeys("Adam123")
  println("Username Entered - Passed")

  //Password - CSS Selector
  val password: WebElement = driver.findElement(By.cssSelector("input[type='password']"))
  password.sendKeys("Password789")
  println("Password Entered - Passed")

  //Comments - Tag Name
  val comments: WebElement = driver.findElement(By.tagName("textarea"))
  comments.clear()
  comments.sendKeys("I am practicing")
  println("Comment Left - Passed")

  //Checkbox - XPath Selector
  val checkBox = driver.findElement(By.xpath("//input[@type='checkbox'][@value='cb1']"))
  checkBox.click()
  println("Checkbox Clicked - Passed")

  //Submit - Class Name
  val classButtons = driver.findElements(By.className("styled-click-button"))
  val submitButton: WebElement = classButtons.get(1)
  submitButton.click()
  println("Form Submitted - Passed")

  //Back to Form - ID
  val formReturn: WebElement = driver.findElement(By.id("back_to_form"))
  formReturn.click()
  println("Return to Form - Passed")

  //Navigate to About - Link Text
  val linkAbout: WebElement = driver.findElement(By.linkText("Index"))
  linkAbout.click()
  println("Click Link - Passed")

  //Navigate to Basic Web Page - Partial Link Text
  val partialLink: WebElement = driver.findElement(By.partialLinkText("Basic Web"))
  partialLink.click()
  println("Click Partial Link - Passed")

  driver.close()
  driver.quit()

}
