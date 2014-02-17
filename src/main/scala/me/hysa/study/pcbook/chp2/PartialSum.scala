package me.hysa.study.pcbook.chp2

/**
 * 部分和問題
 * <pre>
 *   整数a1, a2, ..., an が与えられます。その中からいくつか選び、
 *   その和をちょうどkにすることができるかを判定しなさい。
 *
 *   制約
 *   1 <= n <= 20
 *   -10^8 <= ai <= 10^8
 *   -10^8 <= k <= 10^8
 *
 * </pre>
 * programing-contest-book
 * User: hysa
 * Date: 2014/02/18
 */
class PartialSum(val n:Int, val a: List[Int], val k:Int) {

  def dfs(i: Int, sum: Int):Boolean = {

    // n個決め終わったら、今までの和sumがkと等しいかを返す
    if (i == n) return sum == k

    // aiを足さない場合
    if (dfs(i + 1, sum)) return true

    // aiを足す場合
    if (dfs(i + 1, sum + a(i))) return true

    // aiを使う使わないにかかわらずkが作れないのでfalseを返す
    false
  }

  def solve(): String = {
    if (dfs(0, 0)) "Yes"
    else "No"
  }
}
