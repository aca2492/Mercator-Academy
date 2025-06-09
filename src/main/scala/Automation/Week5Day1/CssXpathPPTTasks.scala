package Automation.Week5Day1

import org.openqa.selenium.{By, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver

object CssXpathPPTTasks extends App {

  //CSS Selector Task
  val cssDriver: WebDriver = new ChromeDriver()
  cssDriver.get("https://www.selenium.dev/selenium/web/web-form.html")

  val idInput: WebElement = cssDriver.findElement(By.cssSelector("#my-text-id"))
  idInput.sendKeys("testUser")
  println("CSS testUser input - Passed")

  val passwordInput: WebElement = cssDriver.findElement(By.cssSelector("[name='my-password']"))
  passwordInput.sendKeys("mySecret")
  println("CSS Password input - Passed")

  val buttonClick: WebElement = cssDriver.findElement(By.cssSelector("button.btn"))
  buttonClick.click()
  println("CSS Form Submit - Passed")

  cssDriver.close()
  cssDriver.quit()

  //XPath Selectors Task
  val xpathDriver: WebDriver = new ChromeDriver()
  xpathDriver.get("https://the-internet.herokuapp.com/login")

  val userInput: WebElement = xpathDriver.findElement(By.xpath("//input[@id='username']"))
  userInput.sendKeys("tomsmith")
  println("Xpath Username input - Passed")

  val xpassInput: WebElement = xpathDriver.findElement(By.xpath("//input[@id='password']"))
  xpassInput.sendKeys("SuperSecretPassword!")
  println("XPath Password input - Passed")

  val submitLogin: WebElement = xpathDriver.findElement(By.xpath("//button[@type='submit'][@class='radius']"))
  submitLogin.click()
  println("Submit clicked - Passed")

  val loginBanner: WebElement = xpathDriver.findElement(By.xpath("//div[@id='flash']"))
  val loginTitle: WebElement = xpathDriver.findElement(By.xpath("//h2"))
  val loginResult: WebElement = xpathDriver.findElement(By.xpath("//h4[@class='subheader']"))
  println(s"Upon login the result banner displays: ${loginBanner.getText}")
  println(s"Upon login the result title displays: ${loginTitle.getText}")
  println(s"Upon login the result message displays: ${loginResult.getText}")

  xpathDriver.close()
  xpathDriver.quit()

}
