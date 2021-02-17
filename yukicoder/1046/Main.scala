import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)

  val n = sc.nextInt
  val k = sc.nextInt
  println(Array.fill(n)(sc.nextInt).sorted.reverse.splitAt(k)._1 match {
    case t @ Array(m, _*) => if (m > 0) t.filter(_ > 0).sum else m
    case _ => 0
  })
}
