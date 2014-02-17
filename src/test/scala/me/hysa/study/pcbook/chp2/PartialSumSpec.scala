package me.hysa.study.pcbook.chp2

import org.specs2.mutable._

/**
 * programing-contest-book
 * User: hysa
 * Date: 2014/02/18
 */
class PartialSumSpec extends Specification {

  "部分和問題" should {
    "n = 4, a = (1, 2, 4, 7), k = 13" in {
      new PartialSum(4, List(1, 2, 4, 7), 13).solve() mustEqual "Yes"
    }

    "n = 4, a = (1, 2, 4, 7), k = 15" in {
      new PartialSum(4, List(1, 2, 4, 7), 15).solve() mustEqual "No"
    }
  }

}
