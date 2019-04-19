import java.io._

object Solution {
  // Answer
  def timeConversion(a: String): String = {
    var result = a
    val hour = a.dropRight(8)
    a.drop(8) match {
      case "AM"=>  if (hour == 12) result = hour + a.drop(2)
//    }
    return result
  }


  def main(args: Array[String]) {
    val a = scala.io.StdIn.readLine
    println(timeConversion(a))
  }
}

Solution.timeConversion("12:12:11AM")