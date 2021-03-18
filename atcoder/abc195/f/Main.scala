import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)

  def isPrime(a: Int): Boolean = {
    for(i <- 2 to math.sqrt(a).toInt) {
      if(a % i == 0) return false
    }
    true
  }

  val a, b = sc.nextLong
  val d = (b - a + 1).toInt

  val primes = (2 to 72).toArray.filter(isPrime)
  val l = primes.length
  val primesMap = (a to b).toArray.map(i => {
    var r = 0
    for(j <- 0 until l) {
      if(i % primes(j) == 0) {
        r |= (1 << j)
      }
    }
    r
  })
  var dp = Array.ofDim[Int](1 << l)
  dp(0) = 1
  for(i <- a to b) {
    var dp2 = Array.ofDim[Int](1 << l)
    for(j <- 0 until (1 << l)) {
      val t = (i - a).toInt
      if((j & primesMap(t)) == 0) dp2(j | primesMap(t)) += dp(j)
      dp2(j) += dp(j)
    }
    dp = dp2
  }
  println(dp.sum)
}
