import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)

  println(sc.nextInt % 6 match {
    case 0 => "Yes"
    case _ => "No"
  })
}
