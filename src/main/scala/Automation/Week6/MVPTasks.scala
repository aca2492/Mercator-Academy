package Automation.Week6

import Automation.Week6.ScreenCapture.driver
import org.openqa.selenium.chrome.{ChromeDriver, ChromeOptions}
import org.openqa.selenium.io.FileHandler
import org.openqa.selenium.{By, NoSuchElementException, OutputType, StaleElementReferenceException, TakesScreenshot, TimeoutException, WebDriver, WebElement}

import java.io.File
import java.text.SimpleDateFormat
import java.util.Date

object MVPTasks extends App {

  val options = new ChromeOptions
  options.addArguments("--headless=new")

  val driver: WebDriver = new ChromeDriver(options)

  def takeScreenCapture(driver: WebDriver): Unit  = {
    val timeStamp = new SimpleDateFormat("HHmmss").format(new Date())
    val dateStamp = new SimpleDateFormat("yyyy-MM-dd").format(new Date())
    val srcTimestamp: File = driver.asInstanceOf[TakesScreenshot].getScreenshotAs(OutputType.FILE)
    if(driver.findElement(By.tagName("h2")).getText == "Secure Area"){
      FileHandler.copy(srcTimestamp, new File(s"/Users/adam.chery/Documents/screenshots/tasks/mvp/${dateStamp}-success-$timeStamp.png"))
      println("Success")
    }else if (driver.findElement(By.tagName("h2")).getText == "Login Page"){
      FileHandler.copy(srcTimestamp, new File(s"/Users/adam.chery/Documents/screenshots/tasks/mvp/${dateStamp}-failure-$timeStamp.png"))
      println("Failure")
    }
  }

  try{
    driver.get("https://the-internet.herokuapp.com/login")

    val username: WebElement = driver.findElement(By.id("username"))
    val password: WebElement = driver.findElement(By.id("password"))
    val login: WebElement = driver.findElement(By.className("radius"))

    username.sendKeys("tomsmith")
    password.sendKeys("SuperSecretPassword!")
    login.click()

    takeScreenCapture(driver)

  }catch {
    case e: NoSuchElementException =>
      println("No Element Found")
      takeScreenCapture(driver)

    case e: TimeoutException =>
      println("Page Timeout")
      takeScreenCapture(driver)

    case e: StaleElementReferenceException =>
      println("Broken")
      takeScreenCapture(driver)
  }finally {
    if(driver != null){
      driver.quit()
    }
  }

}
