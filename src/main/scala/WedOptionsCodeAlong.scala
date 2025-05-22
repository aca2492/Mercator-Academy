import WedOptionsCodeAlong.age

object WedOptionsCodeAlong extends App{

  val weather: String = "sunny"

  //IF/ELSE
  if (weather == "sunny"){
    println("Wear suncream")
  }else if(weather == "rainy"){ //Can have as many else ifs as needed
    println("Take am umbrella")
  }else if(weather == "cold"){
    println("Take a coat")
  }else{ //Catch gpt anything not defined in else/if
    println("Not a valid weather option")
  }

  //How to approach multiple options
  val season: String = "winter"
  if (weather == "cold" || season == "winter"){
    println("Take a coat")
  } else{
    println("Light jacket today")
  }

  //PATTERN MATCHING
  weather match {
    case "rainy" => println("Take am umbrella")
    case "sunny" => println("Wear suncream")
    case "cold" => println("Take a coat")
    case _ => println("Not a valid weather option")
  }

  (weather, season) match { //multiple need to be bracketed
    case (weather, season) if weather == "cold" || season == "winter" => println("Take a coat")
    case _ => println("Light jacket today")
  }

  //Using INT - slightly more careful
  val age: Int = 0

  if (age >= 18){
    println(s"You are an adult because you are $age")
  }else if(age >= 0 && age < 18){
    println(s"You are a child because you are $age")
  }else{
    println("Enter a valid age")
  }

  age match {
    case age if age <0 => println(s"Enter a valid age")
    case age if age <18 => println(s"You are a child because you are $age")
    case age if age >= 18 => println(s"You are an adult because you are $age")
  }

  //TASK
  val movieage: Int = 13

  movieage match {
    case movieage if movieage <4 => println("Enter age above 3")
    case movieage if movieage <8 => println("Can watch a film rating of 'U'")
    case movieage if movieage < 12 => println("Can watch a film rating of 'PG'")
    case movieage if movieage < 15 => println("Can watch a film rating of '12A'")
    case movieage if movieage < 18 => println("Can watch a film rating of '15'")
    case movieage if movieage >=18 => println("Can watch a film rating of '18'")
    case _ => println("Enter a valid age")
  }

  val grade: Int = 45

  if (grade < 0){
    println("Enter a valid number")
  }else if (grade <= 49){
    println("Grade is 'F'")
  }else if(grade >= 50 && grade <60){
    println("Grade is 'E'")
  }else if(grade >= 60 && grade <70){
    println("Grade is 'D'")
  }else if(grade >= 70 && grade <80){
    println("Grade is 'C'")
  }else if(grade >= 80 && grade <90){
    println("Grade is 'B'")
  }else if(grade >= 90 && grade <=100){
    println("Grade is 'A'")
  }else{
    println("Enter a valid number")
  }

  //OPTIONS + (getOrElse) - Would need to be tested both ways
  val name: Option[String] = Some("Adam")
  val emptyName: Option[String] = None
  println(name)
  println(emptyName)

  //getOrElse is used when we want to return a default if 'None' is returned
  //will also take 'Some' away leaving the internal
  def getName(name: Option[String]): String = name.getOrElse("Anonymous")
  println(getName(name))
  println(getName(emptyName))

  //TRY/CATCH
  try{ //ALL LOGIC IN HERE
    val number = "one".toInt //Change input to int from string
    println(s"The number is $number")

  }catch{
    case error: NumberFormatException => println(s"$error was not a valid input")
  }


}
