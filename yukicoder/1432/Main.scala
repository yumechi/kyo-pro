import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)

  val a = sc.nextInt
  val b = sc.nextInt

  println((a | b) + (a & b))
}
