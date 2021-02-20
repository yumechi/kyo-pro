import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)

  val arr = sc.next.toCharArray.drop(1)
  println((arr.reverse.filter(_ != '0')).length)
}
