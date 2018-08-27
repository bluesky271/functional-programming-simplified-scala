//What is lazy val?
//When we talk about laziness we mean that an expression is reduced by need, as is the case with lazy val in Scala
//How do we reduce it? here is some examples by writing the same method using val, def and lazy val

val randomNumber = {
  println("PRINT THIS")
  util.Random.nextInt(10)
}
println(List(randomNumber, randomNumber, randomNumber))
//This would print out something like List(1, 1, 1) because "randomNumber" has already been evaluated and assigned with a value as you define it
//A good way to tell is because "PRINT THIS" has only been printed out once

def randomNumber2 = {
  println("PRINT THIS")
  util.Random.nextInt(10)
}
println(List(randomNumber2, randomNumber2, randomNumber2))
//This would print out something like List(2, 4, 7) because "randomNumber2" has been called 3 times within the list, so it will generate 3 random number
//A good way to tell is because "PRINT THIS" has only been printed out three times

lazy val randomNumber3 = {
  println("PRINT THIS")
  util.Random.nextInt(10)
}
println(List(randomNumber3, randomNumber3, randomNumber3))
//This would print out something like List(1, 1, 1) because "randomNumber3" will only get evaluate when it has been called (just like def) but once its called,
//it'll assigned the initial value and be used for the rest of the time (just like val)
//A good way to tell is because "PRINT THIS" has only been printed out once, and the same value will remain the same for the rest of the time it gets called