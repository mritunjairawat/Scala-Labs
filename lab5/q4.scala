package lab5

object q4 {
   def main(args:Array[String])
  {
    println("ENTER NUMBER ")
    val a = scala.io.StdIn.readInt()
     val sq= (a:Int) => a*a
     val cube= (a:Float) => a*a*a
     val four= (a:Int) => a*a*a*a
     val s=sq(a)
     val c=cube(a)
     val f=four(a)
     println("SQUARE IS ",s)
     println("CUBE IS ",c)
     println("FOURTH POWER IS ",f)
  }
}
