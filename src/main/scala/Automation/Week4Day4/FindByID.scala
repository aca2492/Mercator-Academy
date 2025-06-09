package Automation.Week4Day4

import org.openqa.selenium.{By, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver

object FindByID extends App {

  val driver: WebDriver = new ChromeDriver()

  driver.get("https://proleed.academy/exercises/selenium/selenium-element-id-locators-practice-form.php")

  val emailAddress: WebElement = driver.findElement(By.id("email"))
  val password: WebElement = driver.findElement(By.id("password"))

  emailAddress.sendKeys("test@gmail.com")
  println("Email Address Entered - Passed")
  password.sendKeys("Password123")
  println("Password Entered - Passed")

  val loginButton: WebElement = driver.findElement(By.id("login"))
  loginButton.click()
  println("Login Button Clicked - Passed")

  driver.quit()


}
