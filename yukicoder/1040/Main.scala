import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)

  println(sc.nextInt match {
    case n if(!(n % 180 == 0) && n % 90 == 0) => "Yes"
    case _ => "No"
  })
}
