abstract class MyAbstract
case class MyFirst() extends MyAbstract
case class MySecond() extends MyAbstract

val x: MyAbstract = MyFirst()

x match {
  case aOrB @ (MyFirst() | MySecond()) => println(aOrB)
  case _ => println("meh")
}

x match {
  case aOrB @ (_:MyFirst | _:MySecond) => println(aOrB)
  case _ => println("meh")
}

x match {
  case _:MyFirst | _:MySecond => println(x) // just use x instead of aOrB
  case _ => println(x)
}