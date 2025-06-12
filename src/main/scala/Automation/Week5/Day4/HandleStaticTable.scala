package Automation.Week5.Day4

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.{By, WebDriver, WebElement}

object HandleStaticTable extends App {

  val driver: WebDriver = new ChromeDriver()

  driver.get("https://www.w3schools.com/html/html_tables.asp")

  val rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[position() > 1]"))

  for(i <- 0  until  rows.size()){
    val cols = rows.get(i).findElements(By.tagName("td"))
    val rowsText = cols.toArray.map(_.asInstanceOf[org.openqa.selenium.WebElement].getText).mkString(" | ")

    println(s"Row ${i + 1}: $rowsText")
  }

  driver.quit()


}
