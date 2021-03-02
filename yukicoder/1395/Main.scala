import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)

  val n = sc.nextInt
  val x = sc.nextInt
  val an = Array.fill(n)(sc.nextInt)
  println(if(an.min <= x && x <= an.max) "Yes" else "No")
}
