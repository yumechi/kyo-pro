import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)

  val an = Array.fill(4)(sc.nextInt)
  println(if(an(0) < an(1) && an(2) > an(3)) "YES" else "NO")
}
