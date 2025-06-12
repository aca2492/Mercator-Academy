package Automation.Week5.Day4

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.{ExpectedConditions, WebDriverWait}
import org.openqa.selenium.{By, JavascriptExecutor, WebDriver}

import java.time.Duration
import scala.collection.convert.ImplicitConversions.`collection AsScalaIterable`

object Wk5D4Tasks extends App {

  val driver: WebDriver = new ChromeDriver()
  driver.get("https://cosmocode.io/automation-practice-webtable/")

  //Implicit Wait
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10))
  val explicitWait = new WebDriverWait(driver, Duration.ofSeconds(10))

  //JS Executor
  val js = driver.asInstanceOf[JavascriptExecutor]

//  val countryTable = driver.findElement(By.id("countries"))
//
//  //Print All Country Names
//  val rows = countryTable.findElements(By.tagName("tr"))
//  for(i <- 1  until  rows.size()){
//    val countryName = rows.get(i).findElements(By.tagName("strong"))
//    val countries = countryName.toArray.map(_.asInstanceOf[org.openqa.selenium.WebElement].getText).mkString(" | ")
//
//    js.executeScript("arguments[0].style.backgroundColor ='red'", rows.get(i))
//    println(s"Country ${i + 1}: $countries")
//  }

//  println("\n")
//  //Explicit Wait, Print Capital and Currency
//  println("Version 1:")
//  val bangla = explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"countries\"]/tbody/tr[15]")))
//  val banglaContents = bangla.findElements(By.tagName("td"))
//  for(i <- 0  until  banglaContents.size()){
//    val bangCols = banglaContents.get(i)
//    if (i == 2){
//      println("Capital: " + bangCols.getText)
//    }else if(i ==3){
//      println("Currency: " + bangCols.getText)
//    }
//  }
//  println("\nVersion 2:")
//  for(country <- rows.drop(1)) {
//    val cName = country.findElements(By.tagName("td"))
//    val countryName: String = cName.get(1).getText
//    if (countryName == banglaContents.get(1).getText) {
//      val countryCapital: String = cName.get(2).getText
//      println(s"Country Capital : $countryCapital")
//      val countryCurrency: String = cName.get(3).getText
//      println(s"Country Currency: $countryCurrency")
//    }
//  }


  //Extension

  //Scroll to bottom of the page
  js.executeScript("window.scrollTo(0, document.body.scrollHeight);")
  //Scroll back to top of the page
  js.executeScript("window.scrollTo(0, 0);")

  //Change Background colour of Column Header








  driver.quit()

}
