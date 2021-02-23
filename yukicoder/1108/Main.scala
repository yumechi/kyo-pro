import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)

  val n = sc.nextInt
  val h = sc.nextInt
  val tn = Array.fill(n)(sc.nextInt)
  println(tn.map(_ + h).mkString(" "))
}
