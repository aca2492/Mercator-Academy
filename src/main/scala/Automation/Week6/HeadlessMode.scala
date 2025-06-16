package Automation.Week6

import org.openqa.selenium.chrome.{ChromeDriver, ChromeOptions}
import org.openqa.selenium.{By, WebDriver}

object HeadlessMode extends App {

  val options = new ChromeOptions()
  options.addArguments("--headless")

  val driver: WebDriver = new ChromeDriver()
  driver.get("https://the-internet.herokuapp.com/javascript_alerts")

  //Javascript Simple Alerts
  println("Simple Alert\n")
  //Clicking button to make alert pop up
  driver.findElement(By.xpath("//*[@id='content']/div/ul/li[1]/button")).click()

  //Switch to Alert Space
  val simpleAlert = driver.switchTo().alert()
  //Get Text from Alert
  println("Alert Text: " + simpleAlert.getText)
  //Accept Alert (clicking ok)
  simpleAlert.accept()
  println("Alert Accepted")
  println("Test Passed for Simple Alert")

  //Javascript Confirmation Alert
  println("\nConfirmation Alert\n")
  //Clicking button to make alert pop up
  driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click()

  //Switch to Alert Space
  val confirmationAlert = driver.switchTo().alert()
  //Get Text from Alert
  println("Alert Text: " + confirmationAlert.getText)
  //Dismiss Alert
  confirmationAlert.dismiss()
  println("Alert Dismissed")
  println("Test Passed for Confirmation Alert")

  //Javascript Prompt Alert
  println("\nPrompt Alert\n")
  //Clicking button to make alert pop up
  driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click()

  //Switch to Alert Space
  val promptAlert = driver.switchTo().alert()
  //Get Text from Alert
  println("Alert Text: " + promptAlert.getText)
  //Enter Information
  promptAlert.sendKeys("JS Prompt Input")
  println("Input Text to Alert")
  //Accept Alert
  promptAlert.accept()
  println("Alert Accepted")
  println("Test Passed for Prompt Alert")

  driver.quit()

}
