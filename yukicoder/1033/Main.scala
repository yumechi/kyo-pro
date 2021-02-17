import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)

  val a = Array.fill(2)(sc.nextDouble).head
  println(a / 2)
}
