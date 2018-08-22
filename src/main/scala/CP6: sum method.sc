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

// How does the method sumTwo work
// In the sumTwo method, you can only have two cases, case Nil means empty list
// or there is an non-empty list which has a head (x in the above example to represent the first element of the list)
// and tail (the rest of the element from the list)
// the expression calls its own method which is called a "recursive call" with the remaining elements of the list until the list contains no more element (Nil)

// break down of this recursive call
// we have a List(1, 2, 3)
// 1 = x (x is the head)
// 2 and 3 = tail (the rest of the element)
// the express x + sumTwo(tail) === 1 + (2, 3)
// the next time the sumTwo method is called, the list only have 2 and 3
// so now 2 = x (x is the head)
// 3 = tail (the rest of the element)
// next time again, 3 = x (x is the head) and there is no tail (Nil = 0)
// so adding all the previous heads together 1 + 2 + 3 = 6

val list1 = List(1, 2, 3)
val list2 = List(4, 5, 6)

list1 :: list2 // :: prepends a single item

list1 ::: list2 // ::: prepends a complete list