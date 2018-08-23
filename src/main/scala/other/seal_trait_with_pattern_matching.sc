// Something that can be embodied by a fixed set of alternatives: a note or rest. We can express this in Scala using a sealed trait definition
sealed trait Symbol
case class Note(name: String, duration: String, octave: Int) extends Symbol
case class Rest(duration: String) extends Symbol

// A sealed trait definition introduces a new type (here, Symbol), but no constructor for it. Constructors are defined by alternatives that extend the sealed trait
val symbol1: Symbol = Note("C", "Quarter", 3)
val symbol2: Symbol = Rest("Whole")

// Since the Symbol type has no members, we can not do anything useful when we manipulate one. We need a way to distinguish between the different cases of symbols. Pattern matching allows us to do so:
def symbolDuration(symbol: Symbol): String =
  symbol match {
    case Note(name, duration, octave) => duration // (can also be written as Note(_, duration, _) as the name and octave parameter were not used in the expression
    case Rest(duration) => duration
  }

symbolDuration(symbol1) //return "Quarter"
symbolDuration(symbol2) //return "Whole"