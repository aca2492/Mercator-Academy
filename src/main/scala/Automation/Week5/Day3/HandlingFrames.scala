package Automation.Week5.Day3

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.{By, WebDriver, WebElement}

object HandlingFrames extends App {

  val driver: WebDriver = new ChromeDriver()
  driver.get("https://the-internet.herokuapp.com/nested_frames")

  //Select Top Frame
  driver.switchTo().frame("frame-top")

  //Select Middle Frame
  driver.switchTo().frame("frame-middle")

  //Confirm Text in Middle Frame
  val middleText = driver.findElement(By.id("content"))
  println("Middle Text: " + middleText.getText)

  //Return to Main Page Outside Frames
  driver.switchTo().defaultContent()

  //Select Bottom Frame Using Index
  driver.switchTo().frame(1)

  val bottomText = driver.findElement(By.tagName("body"))
  println("Bottom Text: " + bottomText.getText)

  driver.switchTo().defaultContent()

  //Select Frame Using WebElement
  val frameTop = driver.findElement(By.name("frame-top"))
  driver.switchTo().frame(frameTop)
  driver.switchTo().frame("frame-left")
  val leftText = driver.findElement(By.tagName("body")).getText
  println(s"Left Text: $leftText")

  driver.quit()

}
