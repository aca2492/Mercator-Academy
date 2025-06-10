package Automation.Week5Day2

import org.openqa.selenium.{By, Point, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver

object MVPTask3 extends App {

  val driver: WebDriver = new ChromeDriver()
  driver.get("https://demoqa.com/automation-practice-form")

  driver.manage().window().maximize()

  val firstName: WebElement = driver.findElement(By.xpath("//input[@id='firstName']"))
  if (firstName.isDisplayed && firstName.isEnabled){
    firstName.sendKeys("Adam")
    println("First name is displayed and enabled - Passed")
  } else{
    println("First Name is not displayed or not enabled")
  }

  val readingCheck: WebElement = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']"))
  if (!readingCheck.isSelected){
    readingCheck.click()
    println("Reading checkbox not selected, now clicked - Passed")
  }else{
    println("Reading checkbox is already selected")
  }

  val submitButton: WebElement = driver.findElement(By.xpath("//button[@type='submit']"))
  if(submitButton.isDisplayed && submitButton.isEnabled) {
    println("Submit Button is displayed and enabled - Passed")
    //submitButton.submit()
    submitButton.click()
  }else{
    println("Submit Button is not displayed or enabled")
  }

  driver.quit()

}
