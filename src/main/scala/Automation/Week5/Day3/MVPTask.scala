package Automation.Week5.Day3

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.{By, JavascriptExecutor, WebDriver, WebElement}

object MVPTask extends App {

  val driver: WebDriver = new ChromeDriver()
  driver.get("https://testpages.herokuapp.com/styled/index.html")

  driver.manage().window().maximize()
  val formLink: WebElement = driver.findElement(By.linkText("HTML Form Example"))
  formLink.click()

  val userName: WebElement = driver.findElement(By.xpath("//input[@name='username']"))
  userName.sendKeys("cheryadam123")

  val password: WebElement = driver.findElement(By.xpath("//input[@name='password']"))
  password.sendKeys("Password789")

  val check2: WebElement = driver.findElement((By.cssSelector("input[value='cb2']")))
  if(!check2.isSelected){
    check2.click()
  }else{
    println("Checkbox is currently selected")
  }

  val radio3: WebElement = driver.findElement(By.cssSelector("input[value='rd3']"))
  if(!radio3.isSelected){
    radio3.click()
  }else{
    println("Radio Button is currently selected")
  }

  val jsExecutor = driver.asInstanceOf[JavascriptExecutor]
  val submitButton: WebElement = driver.findElement(By.cssSelector("input.styled-click-button[type='submit']"))
  if (submitButton.isDisplayed && submitButton.isEnabled) {
    jsExecutor.executeScript("arguments[0].scrollIntoView(true);", submitButton)
    submitButton.click()
  } else {
    println("Submit Button is either Not Displayed or Not Enabled")
  }

  Thread.sleep(1000)

  val indexLink: WebElement = driver.findElement(By.linkText("Index"))
  indexLink.click()

  //Extension 1 - Alerts

  driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/alerts.php")

  driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[1]/button")).click()
  val simpleAlert = driver.switchTo().alert()
  Thread.sleep(500)
  simpleAlert.accept()

  driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[3]/button")).click()
  val confirmAlert = driver.switchTo().alert()
  Thread.sleep(500)
  confirmAlert.dismiss()

  driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[4]/button")).click()
  val promptAlert = driver.switchTo().alert()
  promptAlert.sendKeys("Adam")
  promptAlert.accept()
  Thread.sleep(1000)

  //Extension 2 - Frames

  driver.navigate().to("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe")

  driver.switchTo().frame("iframeResult")
  val text1 = driver.findElement(By.xpath("/html/body/h2"))
  println("Frame Title: " + text1.getText)
  val text2 = driver.findElement(By.xpath("/html/body/p"))
  println("Frame Text: " + text2.getText)
//  val text3 = driver.findElement(By.tagName("/html/body/h1"))
//  println("Frame Text within Box: " + text3.getText)

  driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/nestedframes.php")

  driver.switchTo().frame("frame1")





  driver.quit()

}
