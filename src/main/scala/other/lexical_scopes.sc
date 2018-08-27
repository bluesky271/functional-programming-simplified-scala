//It's good functional programming style to split up a task into many small functions
//When you have small functions that is not likely to be used anywhere else, you would want to prevent/avoid "name-space pollution"
//What "name-space pollution" mean is that you're using up all the function/variable name
//To avoid this, you can write function inside a function so this name will only work inside
//
//For example
val x = 0
def f(y: Int) = y + 1
val result = {
  val x = f(3)
  x * x
} + x

println(result) // 16

//You can declare a value of x outside the function f
//and you can also declare another value of x inside of function f which do something else