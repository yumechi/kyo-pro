import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)

  println(Array.fill(2)(sc.nextInt).sum)
}
