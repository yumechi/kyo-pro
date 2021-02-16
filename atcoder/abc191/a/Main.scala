import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)

  val a = Array.fill(4)(sc.nextInt)
  println(if(List.range(a(1) * a(0), a(2) * a(0) + 1).filter(x => x == a(3)).isEmpty) "Yes" else "No")
}
