import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)

  val a = sc.nextInt
  val b = sc.nextInt
  val c = sc.nextInt
  val d = sc.nextInt
  val e = sc.nextInt


  val candy = a * (b - c)
  if(candy == 0) {
    println(0)
  } else {
    var ans = 0
    var last = d
    for(i <- 1 to candy) {
      if(i % 10 == 0) {
        if(e <= last) {
          val t = last - e
          ans += t
          last = t
        } else {
          ans += last
        }
      } else {
        ans += last
      }
    }
    println(ans)
  }
}
