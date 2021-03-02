import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)

  val n = sc.nextInt
  val x = sc.nextInt
  val an = Seq.fill(n)(sc.nextInt).map(x - _).sum
  println(x - an)
}
