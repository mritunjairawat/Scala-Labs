object Problem4 {
  def main(args: Array[String]): Unit = {
    process();
  }
  
  def process()={
    def input()={
      var a:Int=scala.io.StdIn.readInt();
      
      def isEven(a:Int):Boolean={
          if((a&1) == 0)
            return true;
          return false;
      }
      
      def isOdd(a:Int):Boolean={
          if((a&1) == 1)
            return true;
          return false;
      }
      
      if(isEven(a))
        println(a+" is even");
      
      if(isOdd(a))
      	println(a+" is odd");      
    }
    input();
  }
}
