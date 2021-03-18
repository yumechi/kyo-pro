import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)

  val a = sc.nextInt
  val b = sc.nextInt
  val w = sc.nextInt * 1000

  def ok(a: Int, b: Int, w: Int): Boolean = {
    val d = b - a
    val t = w / a
    if(a * t <= w && w <= (a + d) * t) true
    else false
  }

  if(ok(a, b, w)) {
    val f = math.floor(w.toDouble / a).toInt
    val s = math.ceil(w.toDouble / b).toInt
    println(s"${s} ${f}")
  } else {
    println("UNSATISFIABLE")
  }
}
