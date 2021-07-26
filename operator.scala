object operator {
  def main(args: Array[String])
  {
    var a=10;
    var b=4;
    var c=true;
    var d=false;
    var result=0;
    
    println("Addition is: "+(a+b));
    println("Subtraction is: "+(a-b));
    
    if(a==b)
      println("Equal to operator is True");
    else
    	println("Equal to operator is False");
    
    println("Logical Or of a||b = "+(c||d));
    
    result = a&b;
    println("Bitwise AND: "+result);
    
    a+=b;
    println("Addition Assignment Operator:" +a);
    
  }
}