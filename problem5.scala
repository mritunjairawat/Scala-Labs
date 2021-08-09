
object Problem5 {
  def main(args: Array[String])={
    trial(23,43);
  }
  
  def trial(x:Int,y:Int)={
    
    var inc = (x:Int) => x+1;
    
    var isZero = (x:Int) => x==0;
    
    var add = (x:Int,y:Int) => x+y;
    
    var mul = (x:Int,y:Int) => x*y;
    
    println("x = "+x);
    println("y = "+y);
    println("x incremented by 1 = "+inc(x));
    println("is y zero ? = "+isZero(y));
    println("Sum of x and y = "+add(x,y));
    println("Product of x and y = "+mul(x,y));
  }
}
