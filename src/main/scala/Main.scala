object Main extends App {
  println("Hello, World!, lets rock scala!")
  val d : Int = 34;
  println(d)
  def averege(n:Int) = n/3
  println(averege(6))

  //if -else

  def label(n:Int) ={
    if(n ==0){
      "Neutral"
    } else if(n<0){
     "Negative"
    } else if(n>0){
      "Positive"
    } else{
      "Not a Real number!"
    }
  }

  println(label(4))
  println(label(-8))

  def evenorOdd(n:Int) = {
    if(n%2 == 0){
      "Even"
    } else{
      "Odd"
    }
  }
  println(evenorOdd(4))
  println(evenorOdd(5))

  def Echo(Message:String)={
    var i = 1
    while (i<=10){
      println(Message)
      i+=1
    }

  }
  println(Echo(Message = "Hello"))

  def Echo1(Message:String) = {
     for(i <- 1 to 5){
        println(Message)
     }
  }
  println(Echo1(Message = "Hi"))
}