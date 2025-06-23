package Automation.Week5.Day3

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.Select
import org.openqa.selenium.{By, JavascriptExecutor, WebDriver, WebElement}

object MVPTask extends App {

  //MVP Tasks
  val driver: WebDriver = new ChromeDriver()
  driver.get("https://testpages.herokuapp.com/styled/index.html")

  //Maximise Window and Navigate to HTML Form
  driver.manage().window().maximize()
  val formLink: WebElement = driver.findElement(By.linkText("HTML Form Example"))
  formLink.click()

  //Enter Username
  val userName: WebElement = driver.findElement(By.xpath("//input[@name='username']"))
  userName.sendKeys("cheryadam123")

  //Enter Password
  val password: WebElement = driver.findElement(By.xpath("//input[@name='password']"))
  password.sendKeys("Password789")

  //Click Checkbox 2
  val check2: WebElement = driver.findElement((By.cssSelector("input[value='cb2']")))
  if(!check2.isSelected){
    check2.click()
  }else{
    println("Checkbox is currently selected")
  }

  //Select Dropdown
  val dropdown: WebElement = driver.findElement(By.name("multipleselect[]"))
  val select = new Select(dropdown)
  select.selectByVisibleText("Selection Item 1")
  println("Selected by visible text: " + select.getFirstSelectedOption.getText)

  //Click Radio Button 3
  val radio3: WebElement = driver.findElement(By.cssSelector("input[value='rd3']"))
  if(!radio3.isSelected){
    radio3.click()
  }else{
    println("Radio Button is currently selected")
  }

  //Click Submit - JS Executor used for scroll
  val jsExecutor = driver.asInstanceOf[JavascriptExecutor]
  val submitButton: WebElement = driver.findElement(By.cssSelector("input.styled-click-button[type='submit']"))
  if (submitButton.isDisplayed && submitButton.isEnabled) {
    jsExecutor.executeScript("arguments[0].scrollIntoView(true);", submitButton)
    submitButton.click()
  } else {
    println("Submit Button is either Not Displayed or Not Enabled")
  }

  Thread.sleep(1000)

  //Navigate to Home Page using Index Link
  val indexLink: WebElement = driver.findElement(By.linkText("Index"))
  indexLink.click()

  //Extension 1 - Alerts

  //Navigate to Site
  driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/alerts.php")

  //Locate and Click Button for Simple Alert and Accept
  driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[1]/button")).click()
  val simpleAlert = driver.switchTo().alert()
  Thread.sleep(500)
  simpleAlert.accept()

  //Locate and Click Button for Confirmation Alert and Dismiss
  driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[3]/button")).click()
  val confirmAlert = driver.switchTo().alert()
  Thread.sleep(500)
  confirmAlert.dismiss()

  //Locate and Click Button for Prompt Alert, Enter Text and Accept
  driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[4]/button")).click()
  val promptAlert = driver.switchTo().alert()
  promptAlert.sendKeys("Adam")
  promptAlert.accept()

  //Extension 2 - Frames

  //Navigate to Site
  driver.navigate().to("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe")

  //Switch to Frame and print information within
  driver.switchTo().frame("iframeResult")
  val text1 = driver.findElement(By.xpath("/html/body/h2"))
  println("Frame Title: " + text1.getText)
  val text2 = driver.findElement(By.xpath("/html/body/p"))
  println("Frame Text: " + text2.getText)

  //Navigate to Site
  driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/nestedframes.php")

  //N=Switch to Frame 1
  driver.switchTo().frame("frame1")

  driver.quit()

  //Research
  // Research 1.
  //  File Upload and Download are handled differently than expected. File upload utilises the sendKeys() function
  // with the file path of what you are uploading to be input as the send keys. File download utilises the click() function
  // and allows you to change to the filepath of the downloaded content or the need to 'open' the content to interact with it.

  //Research 2.
  //Scrolling on a page can be handled by utilising a Javascript Executor, this can be done to scroll to specific elements
  // or can be utilised to scroll to specific coordinates

  //Research 3.
  // A dynamic dropdown is a dropdown where it can only be used based on the selection of a different option, and the options
  // available to you will differ based on the original selections made.

  //Research 4.
  //The Shadow DOM is an encapsulated DOM tree hidden inside an element that allows you to access this tree with easy-to-use
  // shadow root methods

}
