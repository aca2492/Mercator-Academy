package Automation.Week6

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.{By, WebDriver, WebElement, NoSuchElementException}

object ExceptionHandling extends App {

  val driver: WebDriver = new ChromeDriver()

  try{
    driver.get("https://www.selenium.dev/selenium/web/web-form.html")

    val emailAddress: WebElement = driver.findElement(By.id("cheese"))

  }catch {
//    case e: NoSuchElementException =>
//      println("Element not found")
//      e.printStackTrace()

    case e: Exception =>
      print("An Exception Found \n")
      //e.printStackTrace()

  }finally {
    if(driver != null){
      driver.quit()
    }
  }


  //driver.quit()


}
