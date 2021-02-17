import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  
  val arr = Array.fill(4)(sc.nextInt).sorted
  println(arr match {
    case t @ Array(m, _*) if t sameElements Array.range(m, m + 4) => "Yes"
    case _ => "No"
  })
}
