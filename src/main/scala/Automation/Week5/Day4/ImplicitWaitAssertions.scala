package Automation.Week5.Day4

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium._

import java.time.Duration

object ImplicitWaitAssertions extends App {

  val driver: WebDriver = new ChromeDriver()

  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10))

  driver.get("https://proleed.academy/exercises/selenium/selenium-element-id-locators-practice-form.php")
  driver.manage().window().setPosition(new Point(-1920, 0))
  driver.manage().window().setSize(new Dimension(960, 1080))

  val emailAddress: WebElement = driver.findElement(By.id("email")) //find the element by id (find through inspecting webpage
  emailAddress.sendKeys("test@gmail.com") //this is allowing us to enter an input (text) to a field (the email box in this case)
  println("Email address entered")

  val password: WebElement = driver.findElement(By.id("password"))
  password.sendKeys("TestPassword")
  println("Password entered")

  //Not working currently - don't know enough yet. (Might need to wait.)
  val login: WebElement = driver.findElement(By.id("login")) //find submit button through id
//  login.click() //click the button
//  println("Login successful")

  val js = driver.asInstanceOf[JavascriptExecutor]
  js.executeScript("arguments[0].scrollIntoView(true);", login)
  js.executeScript("arguments[0].click()", login)

  val header = driver.findElement(By.tagName("h2"))
  assert(header.getText == "Thank You!")

//  assert(header.getText == "Cheese!")


  driver.quit()


}
