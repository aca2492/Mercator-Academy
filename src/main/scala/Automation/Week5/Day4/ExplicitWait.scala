package Automation.Week5.Day4


import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium._
import org.openqa.selenium.support.ui.{ExpectedConditions, WebDriverWait}

import java.time.Duration

object ExplicitWait extends App {

  val driver: WebDriver = new ChromeDriver()

  driver.get("https://www.w3schools.com/howto/howto_css_custom_checkbox.asp")

  val explicitWait = new WebDriverWait(driver, Duration.ofMinutes(1))

  val acceptAllButton: WebElement = driver.findElement(By.id("accept-choices"))
  acceptAllButton.click()

  val checkBox = explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/div[3]/div[2]/label[1]")))

  checkBox.click()
  println("Checkbox is Clicked")

  driver.quit()


}
