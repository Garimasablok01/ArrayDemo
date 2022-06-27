package ArrayDemo

object arrayexample2 {
  def main(args: Array[String]): Unit = {

    print("//////////////////////////////// using mapping/////////////////////////////////////////////////")

    var marks=Array(1,2,3,4,5)                                //mapping
    //var newnumber=marks.map(mark=>mark+10)
    var newnumber=marks.map(_+10)                 //short hand notation
    newnumber.foreach(println)

    print("//////////////////////////////// using reduce left/////////////////////////////////////////////////")


    var number = Array(1,2,3,4,5)
    var average= number.reduceLeft( (x,y)=>x+y/2)                  //average number using reduce lefy
    println("average ="+ average)
    number.foreach(println)

    var number2= number.reduceLeft(_+_)                            //short hand notation
    println("addition of two number="+ number2)                    //addition of two number

    var number3=number.reduceLeft((a,b)=>a/2+b/2)                 //without short hand notation
    println("value is="+ number3)                                 //division

    var number4=number.reduceLeft(_ max _)
    println("maximum value="+number4)                            //maximum value

    var number5=number.reduceLeft(_ min _)
    println("minimum value="+number5)


    println("//////////////////////////////// using reduce right/////////////////////////////////////////////////")

     var num= Array(5,4,3,2,1)                                 //using reduce right
     var avg=num.reduceRight((a,b)=>a+b/2)                     //average of two numbers
     println("avg of number="+avg)

     var num2=num.reduceRight(_+_)                          //short hand notation
    println("addition of number="+ num2)                   //aaddition of two numbers

    var num3=num.reduceRight((a,b)=>a max b)
    println("maximum number="+num3)                           //find maximum number


  }

}
