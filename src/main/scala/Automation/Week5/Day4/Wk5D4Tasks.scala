package Automation.Week5.Day4

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.{ExpectedConditions, FluentWait, WebDriverWait}
import org.openqa.selenium.{By, JavascriptExecutor, WebDriver, WebElement}

import java.time.Duration
import scala.collection.convert.ImplicitConversions.{`collection AsScalaIterable`, `collection asJava`}
import scala.jdk.CollectionConverters.CollectionHasAsScala

object Wk5D4Tasks extends App {

  val driver: WebDriver = new ChromeDriver()
  driver.get("https://cosmocode.io/automation-practice-webtable/")

  //Implicit Wait
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10))
  val explicitWait = new WebDriverWait(driver, Duration.ofSeconds(10))

  //JS Executor
  val js = driver.asInstanceOf[JavascriptExecutor]

  val countryTable = driver.findElement(By.id("countries"))

//  //Print All Country Names
  val rows = countryTable.findElements(By.tagName("tr"))
  for(i <- 1  until  rows.size()){
    val countryName = rows.get(i).findElements(By.tagName("strong"))
    val countries = countryName.toArray.map(_.asInstanceOf[org.openqa.selenium.WebElement].getText).mkString(" | ")

    js.executeScript("arguments[0].style.backgroundColor ='red'", rows.get(i))
    println(s"Country ${i + 1}: $countries")
  }

  println("\n")
  //Explicit Wait, Print Capital and Currency
  println("Version 1:")
  val bangla = explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"countries\"]/tbody/tr[15]")))
  val banglaContents = bangla.findElements(By.tagName("td"))
  for(i <- 0  until  banglaContents.size()){
    val bangCols = banglaContents.get(i)
    if (i == 2){
      println("Capital: " + bangCols.getText)
    }else if(i ==3){
      println("Currency: " + bangCols.getText)
    }
  }
  println("\nVersion 2:")
  for(country <- rows.drop(1)) {
    val cName = country.findElements(By.tagName("td"))
    val countryName: String = cName.get(1).getText
    if (countryName == banglaContents.get(1).getText) {
      val countryCapital: String = cName.get(2).getText
      println(s"Country Capital : $countryCapital")
      val countryCurrency: String = cName.get(3).getText
      println(s"Country Currency: $countryCurrency\n")
    }
  }


  //Extension - Javascript

  //Scroll to bottom of the page
  js.executeScript("window.scrollTo(0, document.body.scrollHeight);")

  //Change Background colour of Column Header
  val countryHeader: WebElement = driver.findElement(By.xpath("//*[@id=\"countries\"]/tbody/tr[1]/td[2]"))
  js.executeScript("arguments[0].scrollIntoView(true);", countryHeader)
  js.executeScript("arguments[0].style.backgroundColor ='yellow'", countryHeader)

  //Print Page Title
  val title: String = js.executeScript("return document.title;").toString
  println(s"Webpage Title: $title\n")

  //Extension - Fluent Wait
  val fluentWait = new FluentWait[WebDriver](driver)
    .withTimeout(Duration.ofSeconds(15))
    .pollingEvery(Duration.ofMillis(500))
  val gambia = fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"countries\"]/tbody/tr[64]")))
  val gambiaText = gambia.findElements(By.tagName("td"))

  println("Gambia has become Visible: " + gambia.getText)

  //Extension Table Validation
  val frenchLanguage = rows.exists{ row =>
    val cells: Iterable[WebElement] = row.findElements(By.tagName("td")).asScala
    cells.exists(_.getText == "French")
  }
  assert(frenchLanguage)

  for(i <- 1  until  rows.size()){
    val countryName = rows.get(i).findElements(By.tagName("td"))

    if (countryName.get(4).getText.contains("French")){
      js.executeScript("arguments[0].style.backgroundColor ='green'", rows.get(i))
    }
  }

  driver.quit()

}
