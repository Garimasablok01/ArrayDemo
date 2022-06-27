package ArrayDemo
                              //example of for loop loop and foreach
object arrayexample1 {
  def main(args: Array[String]): Unit = {

    // print the element of array use for loop

    var marks= Array(5,4,3,4,3,3)              // print the element of array use for loop
    for(mark <- marks) {
      println(mark)
    }
    println("//////////////////////////////////////////for each/////////////////////////////////////////////////////////")
    //print th element of array using foreach

    var num=Array(1,2,3,4,5)                //print th element of array using foreach
    num.foreach(println)


    // average marks using for loop
    var averagemarks=0                        // average marks using for loop
    var totalmarks=0
    var mark=Array(1,2,3,4,5)
    for(i<-0 to (mark.length-1)) {
      totalmarks = totalmarks + mark(i)
    }

    averagemarks=totalmarks/mark.length
    println("averagemarks using for loop=" + averagemarks)


    // averagemarks using for each

    var number=Array(5,4,3,2,1,4)                             // averagemarks using for each
    var AM=0
    var TM=0

    //number.foreach( marknum=>TM = TM+marknum)
    // number.foreach( marknum=>TM +=marknum)
    number.foreach( TM +=_)                           //short hand notation
    AM=TM/ number.length
    println("average marks using for each=" + AM)


  }


}
