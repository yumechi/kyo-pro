import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)

  println(sc.nextInt match {
    case 1 => "Shiitakerando"
    case 2 => "Otsukakokusaibijutsukan"
    case 3 => "Spring-8"
  })
}
