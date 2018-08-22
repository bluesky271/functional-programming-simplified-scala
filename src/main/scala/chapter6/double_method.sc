val listOfNumbers = List(5, 10, 20)

val multiplyNumberByTwo = listOfNumbers.map(_ * 2)


// Writing the above in a method so it can be re-use
def multiplyNumberByTwos(listOfNumbers: List[Int]): List[Int] = {
  listOfNumbers.map(_ * 2)
}

multiplyNumberByTwos(listOfNumbers)