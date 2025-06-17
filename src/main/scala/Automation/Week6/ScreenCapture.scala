package Automation.Week6

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.io.FileHandler
import org.openqa.selenium.{By, OutputType, TakesScreenshot, WebDriver}

import java.io.File
import java.text.SimpleDateFormat
import java.util.Date

object ScreenCapture extends App {

  val driver: WebDriver = new ChromeDriver()
  driver.get("https://www.selenium.dev/selenium/web/web-form.html")

  val srcFull: File = driver.asInstanceOf[TakesScreenshot].getScreenshotAs(OutputType.FILE)
  FileHandler.copy(srcFull, new File("/Users/adam.chery/Documents/screenshots/TestResult.png"))

  val timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date())
  val srcTimestamp: File = driver.asInstanceOf[TakesScreenshot].getScreenshotAs(OutputType.FILE)
  FileHandler.copy(srcTimestamp, new File(s"/Users/adam.chery/Documents/screenshots/TestResult_$timeStamp.png"))

  val element = driver.findElement(By.name("my-disabled")) // Locate the element by its name (update if needed)
  val srcElement: File = element.getScreenshotAs(OutputType.FILE) // Capture only that element
  // Save the screenshot of the element
  FileHandler.copy(srcElement, new File("/Users/adam.chery/Documents/screenshots/TestResult_Specific.png"))

  driver.quit()

}
