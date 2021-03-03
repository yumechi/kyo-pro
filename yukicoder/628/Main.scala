import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)

  val n = sc.nextInt
  var mp = Map.empty[String, Int]
  for(_ <- 0 until n) {
    val _ = sc.nextInt
    val m = sc.nextInt
    val s = sc.nextInt
    Array.fill(m)(sc.next).map(t => mp += t -> (mp.getOrElse(t, 0) + s))
  }
  val ta = mp.toSeq
  val arr = ta.sortBy(t => (-t._2, t._1))
  for(i <- 0 until math.min(10, arr.length)) {
    println(s"${arr(i)._1} ${arr(i)._2}")
  }
}
