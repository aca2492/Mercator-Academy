package Automation.Week5Day2

import org.openqa.selenium.{By, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver

object MVPTask2 extends App {

  val driver: WebDriver = new ChromeDriver()
  driver.get("https://demoqa.com/automation-practice-form")

  //Navigate to New Page
  driver.navigate().to("https://example.com")

  //Navigate Back
  driver.navigate().back()

  //Navigate Forward
  driver.navigate().forward()

  //Refresh Page
  driver.navigate().refresh()

  //Minimise Window
  driver.manage().window().minimize()

  //Maximise Window
  driver.manage().window().maximize()

  //Partial Page Source
  println("Part Source")
  println(driver.getPageSource.take(250))
  val sourceList: Seq[String] = driver.getPageSource.split("}")
  println("Part Source 2")
  println(sourceList(0))

  driver.quit()

}
