package Automation.Week5.Day4

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.{By, WebDriver, WebElement}

import scala.jdk.CollectionConverters.CollectionHasAsScala

object HandleWindows extends App {

  val driver: WebDriver = new ChromeDriver()

  driver.get("https://the-internet.herokuapp.com/windows")
  driver.manage().window().maximize()

  val parentWindow = driver.getWindowHandle
  println(s"Handle for Parent Window: $parentWindow")

  driver.findElement(By.linkText("Click Here")).click()

  val allWindows: List[String] = driver.getWindowHandles.asScala.toList
  val it = allWindows.iterator
  while (it.hasNext){
    val handle = it.next()
    println(s"Handle: $handle")

    if(handle != parentWindow){
      driver.switchTo().window(handle)
      println("Page Title: " + driver.getTitle)
    }
  }

  driver.switchTo().window(allWindows(0))
  println("Page Title: " + driver.getTitle)


  driver.quit()


}
