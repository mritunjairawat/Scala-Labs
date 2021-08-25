package lab5

object q1 {
   def main(args:Array[String])
  {
     val a = scala.io.StdIn.readInt()
     val b=  scala.io.StdIn.readInt()
     val add= (a:Int,b:Int) => a + b
     val sub= (a:Int,b:Int) => a - b
     val mul= (a:Int,b:Int) => a * b
     val div= (a:Int,b:Int) => a / b
     val c=add(a,b)
     val d=sub(a,b)
     val e=mul(a,b)
     val f=div(a,b)
     print("SUM IS: ")
     println(c)
     print("SUBTRACTION IS: ")
     println(d)
     print("MULTIPLICATION IS: ")
     println(e)
     print("DIVISION IS: ")
     println(f)
  }
  }
