package lab5

object q3 {
  def main(args:Array[String])
  {
    println("ENTER FARENHEIT ")
    val faren = scala.io.StdIn.readInt()
    println("ENTER INCH ")
    val inch=  scala.io.StdIn.readInt()
    println("ENTER YEAR ")
    val year=  scala.io.StdIn.readInt()
     val cel= (a:Int) => (a-32)*5/9
     val meter= (a:Float) => a*0.0254
     val days= (a:Int) => a * 365
     val c=cel(faren)
     val m=meter(inch)
     val d=days(year)
     println("ANSWER IN CELCIUS IS ",c)
     println("ANSWER IN METER IS ",m)
     println("ANSWER IN DAYS IS ",d)
  }
  
}
