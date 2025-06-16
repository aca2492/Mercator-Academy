package Automation.Week6

import Automation.Week6.ScreenCapture.element
import org.openqa.selenium.chrome.{ChromeDriver, ChromeOptions}
import org.openqa.selenium.io.FileHandler
import org.openqa.selenium.{By, OutputType, WebDriver, WebElement}

import java.io.File

object ExtensionTasks extends App {

  val options = new ChromeOptions
  //options.addArguments("--headless=new")

  val driver: WebDriver = new ChromeDriver(options)
  driver.get("https://the-internet.herokuapp.com/tables")

  val table1: WebElement = driver.findElement(By.id("table1"))
  val headers = table1.findElements(By.tagName("th"))
  val rows = table1.findElements(By.tagName("tr"))

  for(i <- 0 until headers.size()){
    val header = headers.get(i)
    header.click()
    val srcElement: File = table1.getScreenshotAs(OutputType.FILE)
    FileHandler.copy(srcElement, new File(s"/Users/adam.chery/Documents/screenshots/tasks/extension/Ascending_${header.getText}.png"))
  }

  for(i <- 0 until headers.size()){
    val header = headers.get(i)
    header.click()
    val srcElement: File = table1.getScreenshotAs(OutputType.FILE)
    FileHandler.copy(srcElement, new File(s"/Users/adam.chery/Documents/screenshots/tasks/extension/Descending_${header.getText}.png"))
  }

  driver.quit()

}
