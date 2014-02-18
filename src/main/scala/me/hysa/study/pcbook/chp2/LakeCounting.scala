/*
 * programing-contest-book
 * User: hysa
 * Date: 2014/02/18
 */
package me.hysa.study.pcbook.chp2

/**
 * p.35 Lake Counting
 * <pre>
 * 大きさが x * y の庭に水たまりができました。
 * 水たまりは8近傍で隣接している場合につながっているとみなします。
 * 全部でいくつの水たまりがあるでしょうか。
 *
 * 制約:
 * x, y <= 100
 * </pre>
 *
 */
class LakeCounting(val x: Integer, val y: Integer, val field: Array[Array[Int]]) {

  def dfs(px: Int, py: Int):Unit = {
//    println("current", px, py)

    // 現在の場所を0に置き換える（"探索済み"というマーキング）
    field(py)(px) = 0

    // 横方向 -1 to 1, 縦方向 -1 to 1
    for (dy <- -1 to 1) {
      for (dx <- -1 to 1) {
        // 次の座標を (nx, ny) とする
        val nx = px + dx
        val ny = py + dy

//        println("next", nx, ny)
        // 範囲内かつ水たまりだったらさらに探索
        if (0 <= nx && nx < x && 0 <= ny && ny < y && field(ny)(nx) == 1) dfs(nx, ny)
      }
    }
    return
  }

  def solve(): Int = {
    var count = 0
    for (yi <- 0 to y - 1) {
      for (xi <- 0 to x - 1) {
        if (field(yi)(xi) == 1) {
//          println(xi, yi, field(yi)(xi))
          dfs(xi, yi)
          count += 1
        }

      }
    }
    count
  }
}
