val harry = ("Harry", 170, 32, true)
val toyota = ("Toyota", 2018)

def checkIfAPersonOrCar(xs: Any): Unit = xs match {
  case (name, _, _, _) => println(s"Hello $name, you are a person!")
  case (make, _) => println(s"Its a car, I like this car brand: $make")
  case _ => println("What did you give me?")
}

checkIfAPersonOrCar(harry)
checkIfAPersonOrCar(toyota)