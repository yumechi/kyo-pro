import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)

  val n = sc.nextInt
  val x = sc.nextInt
  val a = Array.fill(n)(sc.nextInt)
  println(a.filterNot(_ == x).mkString(" "))
}
