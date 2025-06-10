package Automation.Week5Day1

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.{By, WebDriver, WebElement}

object FindByCssSelector extends App {

  val driver: WebDriver = new ChromeDriver()

  driver.get("https://proleed.academy/exercises/selenium/selenium-element-id-locators-practice-form.php")

  val emailAddress: WebElement = driver.findElement(By.cssSelector("#email"))
  val password: WebElement = driver.findElement(By.cssSelector("#password"))

  emailAddress.sendKeys("test@gmail.com")
  println("Email Address Entered - Passed")
  password.sendKeys("Password123")
  println("Password Entered - Passed")

//  val loginButton: WebElement = driver.findElement(By.id("login"))
//  loginButton.click()
//  println("Login Button Clicked - Passed")

  driver.close()
  driver.quit()


}
