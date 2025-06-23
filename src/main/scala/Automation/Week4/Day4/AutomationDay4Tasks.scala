package Automation.Week4.Day4

import org.openqa.selenium.{By, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver

import java.util

object AutomationDay4Tasks extends App {

  //PPT MVP
  println("PPT MVP: ")
  val formDriver: WebDriver = new ChromeDriver()
  formDriver.get("https://www.selenium.dev/selenium/web/web-form.html")

  //By ID
  val firstName: WebElement = formDriver.findElement(By.id("my-text-id"))
  firstName.sendKeys("Adam")
  println("Name Input - Passed")

  //By Name
  val password: WebElement = formDriver.findElement(By.name("my-password"))
  password.sendKeys("Password123")
  println("Password Input - Passed")

  //By Class Name
  val classNameSearch: util.List[WebElement] = formDriver.findElements(By.className("form-control"))
  val comment: WebElement = classNameSearch.get(2)
  comment.sendKeys("Test Comment")
  println("Text Area Input - Passed")

  //By Tag Name
  val tagCount: util.List[WebElement] = formDriver.findElements(By.tagName("input"))
  val inputCount: Int = tagCount.size()
  println(s"Total number of input tags: $inputCount - Passed")

  //By Link Text
  val returnIndex: WebElement = formDriver.findElement(By.linkText("Return to index"))
  returnIndex.click()
  println("Link Text Click - Passed")

  //By Partial Link Text
  formDriver.navigate().back()
  println("Return to Webpage - Passed")
  val returnPartial: WebElement = formDriver.findElement(By.partialLinkText("Return"))
  returnPartial.click()
  println("Return to Index (Partial) - Passed")


  formDriver.close()
  formDriver.quit()


  //HTML MVP
  println("HTML MVP 1")
  val w3driver: WebDriver = new ChromeDriver()
  w3driver.get("https://www.w3schools.com/html/html_examples.asp")

  println("MVP 1a:")
  val buttonElements = w3driver.findElements(By.className("w3-button"))
  println(s"There is a total of " + buttonElements.size() + " button elements")

  println("MVP 1b:")
  val imgElements = w3driver.findElements(By.tagName("img"))
  println(s"There is a total of " + imgElements.size() + " image elements")

  println("MVP 1c:")
  val elementCounta = w3driver.findElements(By.tagName("a"))
  val elementCounth1 = w3driver.findElements(By.tagName("h1"))
  val aCount: Int = elementCounta.size()
  val hCount: Int = elementCounth1.size()
  println(s"There is $aCount <a> tags on this page")
  println(s"There is $hCount <h1> tags on this page")

  println("MVP 1d:")
  val allElements = w3driver.findElements(By.xpath("//*"))
  var elementSet = scala.collection.mutable.Set[String]()
  print("Webpage contains: ")
  for(i <- 0 until allElements.size()){
    val element = allElements.get(i).getTagName
    if(!elementSet.contains(element)){
      elementSet += element
      print(element + ", ")
    }
  }

  println("\nMVP 1e:")
//  val hyperLinkCount = w3driver.findElements(By.cssSelector("[href]"))
//  println(s"There is ${hyperLinkCount.size()} hyperlinks on this page")
  var linkCount = 0
  for(i <- 0 until allElements.size()){
    val element = allElements.get(i)
    if(element.getDomAttribute("href") != null){
      linkCount = linkCount + 1
    }
  }
  println(s"There is $linkCount hyperlinks on this page")

  w3driver.close()
  w3driver.quit()

  println("HTML MVP 2")
  val demoDriver: WebDriver = new ChromeDriver()
  demoDriver.get("https://demoqa.com/")

  println("MVP 2a:")
  demoDriver.navigate().to("https://demoqa.com/text-box")
  val fullName: WebElement = demoDriver.findElement(By.xpath("//input[@placeholder = 'Full Name']"))
  fullName.sendKeys("Adam Chery")
  println("Full Name navigate and locate - Passed")

  //MVP 2b:
  demoDriver.navigate().to("https://demoqa.com/text-box")
  
  //White space can lead to XPath not correctly matching the element as expected.

  //Css Selector or alternatives with the contains function would work well in this instance. Partial Link Text could
  // also work if the element does not share text with others.

  //demoDriver.findElement(By.cssSelector("//h1[contains text(), 'Text Box']"))

  //MVP 2c
  demoDriver.navigate().to("https://www.w3schools.com/html/html_examples.asp")
  demoDriver.findElement(By.id("accept-choices")).click()
  val hiddenElement: WebElement = demoDriver.findElement(By.xpath("//*[@id=\"navbtn_exercises\"]/i[1]"))
  hiddenElement.click()
  val h2Hidden: WebElement = demoDriver.findElement(By.xpath("//*[@id='exercises_list']/div[1]/div[1]/h2/b"))
  if(h2Hidden.isDisplayed){
    println(h2Hidden.getText)
  }

  demoDriver.close()
  demoDriver.quit()

  //Extension
  val heroDriver: WebDriver = new ChromeDriver()
  heroDriver.get("https://the-internet.herokuapp.com/")

  val columnA: WebElement = heroDriver.findElement(By.id("column-a"))
  val columnA2: WebElement = heroDriver.findElement(By.cssSelector("#column-a"))
  val columnA3: WebElement = heroDriver.findElement(By.xpath("//*[@id=\"column-a\"]"))

  //Class name by itself would not work as it would select both elements, due to them sharing the same class, as such would
  // need something more specific

  heroDriver.quit()

  //Research
  //Research 1.
  // Enchanced Selenium Grid, Selenium IDE improvements and GUI interface.
  // Relative Locators for webdriver, allowing for Above, Below, To left and to right of elements. Chrome debugging protocol
  // Window/Tab Management. New methods as part of Actions class, such as click() now having variations of clickAndHold, doubleClick

  //Research 2.
  // Allows for remote interface within a Client Selenium Grid.
  // Allows for tracing client requests, to based on the clients system
  // Can Add or Pass dependencies as required




}
