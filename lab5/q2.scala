package lab5

object q2 {
 def main(args:Array[String])
  {
   val num=scala.io.StdIn.readInt()
   val ans=isprime(num)
   if(ans==true)
   {
   print("NUMBER IS PRIME ")
   }
   if(ans==false)
   {
     print("NUMBER IS NOT PRIME")
   }
    
  }
   def isprime(n: Int): Boolean = {
    if (n < 2) return false
    if (n == 2) return true
    if (n % 2 == 0) return false
    var i = 3
    while (i * i <= n) {
      if (n % i == 0) return false
      i += 2
    }
    true
  }
}
