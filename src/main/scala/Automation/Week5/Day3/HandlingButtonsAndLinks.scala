package Automation.Week5.Day3

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.{By, WebDriver, WebElement}

object HandlingButtonsAndLinks extends App {

  //Handling Buttons

  val buttonDriver: WebDriver = new ChromeDriver()
  buttonDriver.get("https://www.selenium.dev/selenium/web/web-form.html")

  buttonDriver.manage().window().maximize()

  val button: WebElement = buttonDriver.findElement(By.cssSelector("[type='submit']"))
  val buttonText = button.getText
  if (button.isEnabled){
    button.click()
    println(s"${buttonText} Button Clicked")
  }else{
    println("Button Not Enabled")
  }

  buttonDriver.quit()


  //Handling Links

  val linkDriver: WebDriver = new ChromeDriver()
  linkDriver.get("https://www.selenium.dev/")

  val myLink = linkDriver.findElement(By.linkText("Documentation"))

  val linkAttribute = myLink.getAttribute("href")
  println(s"Destination Link of Documentation: $linkAttribute")



  linkDriver.quit()


}
