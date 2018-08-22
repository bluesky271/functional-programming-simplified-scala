// This is an imperative version of writing a sum method.
def sum(ints: List[Int]): Int = {
  var sum = 0
  for (i <- ints) {
    sum += i
  }
  sum
}

sum(List(1, 2, 3, 4))


// This is another way of writing the code above but using common pattern in imperative programming.
def sumTwo(xs: List[Int]): Int = xs match {
  case Nil => 0
  case x :: tail => x + sumTwo(tail) //This makes a recursive call to the "sumTwo" method.
}

sumTwo(List(1, 2, 3, 4))

val list1 = List(1, 2, 3)
val list2 = List(4, 5, 6)

list1 :: list2 // :: prepends a single item

list1 ::: list2 // ::: prepends a complete list