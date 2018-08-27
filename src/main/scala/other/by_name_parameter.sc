//Whats the difference between a paramter type "A" and type "=> A"
//Type A parameter acts like a "val" where it gets evaluated once when it was defined
//Type => A parameter acts like a "def" where it'll only get evaluated once its being called
//
//Here is an example:
def when[A](test: Boolean, whenTrue: A, whenFalse: A): A =
  if (test) whenTrue
   else whenFalse

println(when(test = false, "foo", "bar")) // print foo
println(when(test = true, "foo", "bar")) // print bar
println(when(test = true, println("foo"), println("bar"))) // print foo bar
//This is the issue here where println("foo") and println("bar") will evaluate/execute first
//and will print both parameter out first, which is not what this function is trying to do.



//The way to solve this is by using "By name" parameter, heres an example
def whenTwo[A](test: Boolean, whenTrue: => A, whenFalse: => A): A =
  if (test) whenTrue
  else whenFalse

println(whenTwo(test = false, "foo", "bar")) // print foo
println(whenTwo(test = true, "foo", "bar")) // print bar
println(whenTwo(test = true, println("foo"), println("bar"))) // print bar
//By using "By name" parameters, now our whenTwo function parameter "println..." will remain as it is until its been called.
//So if "whenTwo" if statement = true, it'll call println("foo"), and println("bar") will remain and not get evaluated.