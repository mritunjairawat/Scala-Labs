object MaxAndMin
{
  // Main method
  def main(args: Array[String])
  {
    println("Min and Max from 8,7")
    maxAndMin(8,7);
  }
  
  // Function
  def maxAndMin(a: Int, b: Int) = {
    
    // Nested Function1
    def maxValue() = {
      if(a > b)
      {
        println("Max is: " + a)
      }
      else
      {
        println("Max is: " + b)
      }
    }
    
    // Nested Function2
    def minValue() = {
      if (a < b)
      {
        println("Min is: " + a)
      }
      else
      {
        println("Min is: " + b)
      }
    }
    
    maxValue();
    minValue();
  }
}
