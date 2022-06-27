package ArrayDemo

import Array._

object arrayexample3 {
  def main(args: Array[String]): Unit = {

    println("////////////////////////////multi Dimensional Array///////////////////////////////////////")


    println("**********************************matrix 3*3*************************************")

    var matrix= ofDim[Int](3,3)
    for(row<-0 to 2){
      for(column<-0 to 2){
        matrix(row)(column)=column+3

      }
    }

    for (row<-0 to 2){
      for(column<-0 to 2){
          print(matrix(row) (column)+" ")
      }

      println("   ")
    }

    println("******************************************matrix 5*3*******************************************")

    var matrix2=ofDim[Int](5,3)
    for(row<-0 to 4){
      for(column<-0 to 2){
        matrix2(row)(column)=column+3

      }
    }

     for(row<- 0 to 4){
       for(column<-0 to 2){
         print(matrix2(row)(column)+" ")

       }

       println("    ")
     }

    println("************************************identity matrix 5*5*******************************************")

    var matrix3=ofDim[Int](5,5)
    for(row<-0 to 4){
      for(column<-0 to 4){

        if(row==column) {
          matrix3(row)(column)=1
        }
        else
          {
            matrix3(row)(column)=0
          }
      }
      }

       for(row<-0 to 4){
         for (column<-0 to 4){
           print(matrix3(row)(column)+" ")

         }

         println("   ")
       }

    }

}
