object MinAndMax
{
  // Main method
  def main(args: Array[String])
  {
    process();
  }
  // Function
  def process() = {
    
    def input() = {
      var a:Int=scala.io.StdIn.readInt()
		  var b:Int=scala.io.StdIn.readInt()
      printf("Max and min of %d and %d =\n",a,b);
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
    input();
  }
}
