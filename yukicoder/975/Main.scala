import java.util.Scanner


object Main extends App {
  val sc = new Scanner(System.in)

  val x = sc.nextInt
  val n = sc.nextInt
  val m = sc.nextInt

  val mr = if (Array.fill(n)(sc.nextInt).contains(x)) (1 << 1) else 0
  val mv = if (Array.fill(m)(sc.nextInt).contains(x)) 1 else 0
  val ans = (mr | mv) match {
    case 3 => "MrMaxValu"
    case 2 => "MrMax"
    case 1 => "MaxValu"
    case 0 => "-1"
  }
  println(ans)
}
