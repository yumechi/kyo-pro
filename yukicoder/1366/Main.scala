import java.util.Scanner
import scala.annotation.tailrec

object Main extends App {

  val sc = new Scanner(System.in)

  val a = Array.fill(3)(sc.nextInt)
  val b = Array.fill(3)(sc.nextInt)

  def solve(a: Array[Int], b: Array[Int]): Boolean = {
    def isKadomatsu(c: Array[Int]): Boolean = {
      c.size == c.toSet.size && (c.min == c(1) || c.max == c(1))
    }

    for(i <- 0 to 2) {
      for(j <- 0 to 2) {
        var ca = a.clone()
        var cb = b.clone()
        val ta = a(i)
        val tb = b(j)
        ca.update(i, tb)
        cb.update(j, ta)
        if(isKadomatsu(ca) && isKadomatsu(cb)) {
          return true
        }
      }
    }
    false
  }

  println(if (solve(a, b)) "Yes" else "No")
}
