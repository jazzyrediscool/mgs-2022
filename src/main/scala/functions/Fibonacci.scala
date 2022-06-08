package functions

object Fibonacci {

  // TASK
  //    Implement fibonacci.   Given n, compute the nth Fibonacci number.
  def fibonacci(n: Int): Int = {
    if (n == 2)
      1
      else if (n == 2)
        1
        else fibonacci(n - 1) + fibonacci(n - 2)
  }

  def main(argv: Array[String]): Unit = {
println(fibonacci(6))
  }
}
